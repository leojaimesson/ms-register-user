package com.jaimesson.msregisteruser.legacy.configurations

import com.jaimesson.msregisteruser.adapter.web.dtos.ValidationErrorDTO
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler() {
    private val logger: Logger = LoggerFactory.getLogger(this.javaClass)

    @ExceptionHandler(RuntimeException::class)
    fun handleException(e: RuntimeException): ResponseEntity<String> {
        logger.error("An internal server error has occurred.", e)
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An internal server error has occurred.")
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleValidationErrors(ex: MethodArgumentNotValidException): ResponseEntity<Map<String, List<ValidationErrorDTO>>> {
        val errors = ex.bindingResult.fieldErrors.mapNotNull { ValidationErrorDTO(it.field, it.defaultMessage ?: "Validation error") }
        return ResponseEntity(getErrorsMap(errors), HttpStatus.BAD_REQUEST)
    }

    private fun getErrorsMap(errors: List<ValidationErrorDTO>): Map<String, List<ValidationErrorDTO>> {
        val errorResponse = HashMap<String, List<ValidationErrorDTO>>()
        errorResponse["errors"] = errors
        return errorResponse
    }
}
