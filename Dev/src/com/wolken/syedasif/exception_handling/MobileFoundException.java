package com.wolken.syedasif.exception_handling;

public class MobileFoundException extends Exception{
    public String getMessage() {
        return "Mobiles are not allowed in the exam hall";
    }
}
