package com.wolken.syedasif.exception_handling;

class InvalidHallTicketException extends RuntimeException {
    public String getMessage() {
        return "Students are not allowed to write exam without hall ticket";
    }
}

