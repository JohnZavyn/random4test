/*
 * Copyright 2019-2020, ThreeLeaf.com
 */
/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.model;

import java.io.Serializable;

import lombok.Data;

/** A mailing address. */
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 729505304134625057L;

    private String city;

    private String nameResident;

    private String state;

    private String streetAddress;

    private String zipCode;
}
