package com.threeleaf.test.random.model;

import java.io.Serializable;

import lombok.Data;

/** A mailing address. */
@Data
public class Address implements Serializable {

    private String city;

    private String nameResident;

    private String state;

    private String streetAddress;

    private String zipCode;
}
