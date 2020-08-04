package com.keepcodeclean.validation.validator;

import com.keepcodeclean.validation.constraint.ValidPhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {
    
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^[(]\\d{3}[)]\\s\\d{3}-\\d{4}$");
    
    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        return Objects.nonNull(phoneNumber) && PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches();
    }

}
