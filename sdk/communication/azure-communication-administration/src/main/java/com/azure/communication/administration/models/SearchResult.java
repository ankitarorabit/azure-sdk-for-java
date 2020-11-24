// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The SearchResult model. */
@Fluent
public final class SearchResult {
    /*
     * The search id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The phone numbers that are available. Can be fewer than the desired
     * search quantity.
     */
    @JsonProperty(value = "phoneNumbers")
    private List<String> phoneNumbers;

    /*
     * The phoner number type.
     */
    @JsonProperty(value = "numberType")
    private PhoneNumberType numberType;

    /*
     * The phone number's assignment type.
     */
    @JsonProperty(value = "assignmentType")
    private AssignmentType assignmentType;

    /*
     * The phone number's capabilities.
     */
    @JsonProperty(value = "capabilities")
    private Capabilities capabilities;

    /*
     * The monthly cost for an individual phone number.
     */
    @JsonProperty(value = "monthlyRate")
    private MonthlyRate monthlyRate;

    /*
     * The date that this search result expires and phone numbers are no longer
     * on hold. A search result expires in less than 15min.
     */
    @JsonProperty(value = "searchExpiresBy")
    private OffsetDateTime searchExpiresBy;

    /**
     * Get the id property: The search id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The search id.
     *
     * @param id the id value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the phoneNumbers property: The phone numbers that are available. Can be fewer than the desired search
     * quantity.
     *
     * @return the phoneNumbers value.
     */
    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: The phone numbers that are available. Can be fewer than the desired search
     * quantity.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Get the numberType property: The phoner number type.
     *
     * @return the numberType value.
     */
    public PhoneNumberType getNumberType() {
        return this.numberType;
    }

    /**
     * Set the numberType property: The phoner number type.
     *
     * @param numberType the numberType value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setNumberType(PhoneNumberType numberType) {
        this.numberType = numberType;
        return this;
    }

    /**
     * Get the assignmentType property: The phone number's assignment type.
     *
     * @return the assignmentType value.
     */
    public AssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    /**
     * Set the assignmentType property: The phone number's assignment type.
     *
     * @param assignmentType the assignmentType value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setAssignmentType(AssignmentType assignmentType) {
        this.assignmentType = assignmentType;
        return this;
    }

    /**
     * Get the capabilities property: The phone number's capabilities.
     *
     * @return the capabilities value.
     */
    public Capabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The phone number's capabilities.
     *
     * @param capabilities the capabilities value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the monthlyRate property: The monthly cost for an individual phone number.
     *
     * @return the monthlyRate value.
     */
    public MonthlyRate getMonthlyRate() {
        return this.monthlyRate;
    }

    /**
     * Set the monthlyRate property: The monthly cost for an individual phone number.
     *
     * @param monthlyRate the monthlyRate value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setMonthlyRate(MonthlyRate monthlyRate) {
        this.monthlyRate = monthlyRate;
        return this;
    }

    /**
     * Get the searchExpiresBy property: The date that this search result expires and phone numbers are no longer on
     * hold. A search result expires in less than 15min.
     *
     * @return the searchExpiresBy value.
     */
    public OffsetDateTime getSearchExpiresBy() {
        return this.searchExpiresBy;
    }

    /**
     * Set the searchExpiresBy property: The date that this search result expires and phone numbers are no longer on
     * hold. A search result expires in less than 15min.
     *
     * @param searchExpiresBy the searchExpiresBy value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setSearchExpiresBy(OffsetDateTime searchExpiresBy) {
        this.searchExpiresBy = searchExpiresBy;
        return this;
    }
}
