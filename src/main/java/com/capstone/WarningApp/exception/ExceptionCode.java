package com.capstone.WarningApp.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ExceptionCode {
    DETECT_LOCATION_NOT_FOUND(404, "Detect Location not found");

    @Getter
    private int status;

    @Getter
    private String message;
}
