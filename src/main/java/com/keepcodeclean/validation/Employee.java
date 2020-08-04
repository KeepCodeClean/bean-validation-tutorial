package com.keepcodeclean.validation;

import com.keepcodeclean.validation.constraint.ValidPhoneNumber;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
    
    @NotBlank
    private String id;
    
    @NotBlank
    @Size(min = 1, max = 30)
    private String name;

    @Min(18)
    private int age;
    
    @Email(message = "Email is not valid")
    @NotBlank
    private String email;
    
//    @Pattern(regexp = "^[(]\\d{3}[)]\\s\\d{3}-\\d{4}$", message = "{invalid.phone.number}")
    @ValidPhoneNumber
    private String phoneNumber;
    
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;
    
    @Valid
    private Address address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
