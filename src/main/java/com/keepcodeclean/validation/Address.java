package com.keepcodeclean.validation;

import javax.validation.constraints.NotBlank;

public class Address {
    
    @NotBlank
    private String city;
    
    @NotBlank
    private String street;
    
    @NotBlank
    private String houseNumber;
    
}
