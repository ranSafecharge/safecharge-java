package com.safecharge.retail.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.safecharge.retail.util.APIConstants;

/**
 * Copyright (C) 2007-2017 SafeCharge International Group Limited.
 *
 * @author <a mailto:nikolad@safecharge.com>Nikola Dichev</a>
 * @since 2/14/2017
 */
public class UserAddress {

    @Size(max = APIConstants.FIRST_NAME_MAX_LENGTH) private String firstName;

    @Size(max = APIConstants.LAST_NAME_MAX_LENGTH) private String lastName;

    @Pattern(regexp = APIConstants.EMAIL_REGEX,
             message = APIConstants.ERROR_MESSAGE_INVALID_REGEX) private String email;

    @Size(max = APIConstants.PHONE_MAX_LENGTH) private String phone;

    @Size(max = APIConstants.ADDRESS_MAX_LENGTH) private String address;

    @Size(max = APIConstants.CITY_MAX_LENGTH) private String city;

    @Size(max = 2) private String country;

    @Size(max = 2) private String state;

    @Size(max = APIConstants.ZIP_MAX_LENGTH) private String zip;

    @Size(max = APIConstants.PHONE_MAX_LENGTH) private String cell;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}