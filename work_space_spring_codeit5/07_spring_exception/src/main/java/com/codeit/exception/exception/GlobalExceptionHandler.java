package com.codeit.exception.exception;

import com.codeit.exception.dto.ErrorResponse;
import org.springframework.core.annotation.Order;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@Order(1)
public class GlobalExceptionHandler {
    // 그 외 예외 (Internal Server Error)
    @ExceptionHandler(Exception.class)
    public String handleAllUnhandled(Exception ex, WebRequest request, Model model) {
        System.out.println("Exception: " + ex.getMessage());
        System.out.println("Request URI: " + request.getDescription(false));
        model.addAttribute("error", ErrorResponse.of(ErrorCode.ACCESS_DENIED));
        return "error/errorPage.html";
    }
}
