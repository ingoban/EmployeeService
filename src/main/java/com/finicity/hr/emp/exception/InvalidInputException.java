package com.finicity.hr.emp.exception;

public class InvalidInputException extends RuntimeException{

    public InvalidInputException(){
        super();
    }

    public InvalidInputException(String message){
        super(message);
    }
}
