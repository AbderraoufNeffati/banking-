package com.abderraoufneffati.banking;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;



public class ObjectsValidator <T>{

    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    private final Validator validator = factory.getValidator();
    public void validate(T objectToValidate){

    }
}
