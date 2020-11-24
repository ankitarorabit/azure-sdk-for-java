// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the searchAvailablePhoneNumbers operation. */
public final class PhoneNumberAdministrationsSearchAvailablePhoneNumbersResponse
        extends ResponseBase<PhoneNumberAdministrationsSearchAvailablePhoneNumbersHeaders, Void> {
    /**
     * Creates an instance of PhoneNumberAdministrationsSearchAvailablePhoneNumbersResponse.
     *
     * @param request the request which resulted in this PhoneNumberAdministrationsSearchAvailablePhoneNumbersResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PhoneNumberAdministrationsSearchAvailablePhoneNumbersResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            PhoneNumberAdministrationsSearchAvailablePhoneNumbersHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
