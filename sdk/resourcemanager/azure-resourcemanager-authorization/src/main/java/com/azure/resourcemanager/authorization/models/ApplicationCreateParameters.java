// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request parameters for creating a new application. */
@Fluent
public final class ApplicationCreateParameters extends ApplicationBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationCreateParameters.class);

    /*
     * The display name of the application.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * A collection of URIs for the application.
     */
    @JsonProperty(value = "identifierUris")
    private List<String> identifierUris;

    /**
     * Get the displayName property: The display name of the application.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the application.
     *
     * @param displayName the displayName value to set.
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the identifierUris property: A collection of URIs for the application.
     *
     * @return the identifierUris value.
     */
    public List<String> identifierUris() {
        return this.identifierUris;
    }

    /**
     * Set the identifierUris property: A collection of URIs for the application.
     *
     * @param identifierUris the identifierUris value to set.
     * @return the ApplicationCreateParameters object itself.
     */
    public ApplicationCreateParameters withIdentifierUris(List<String> identifierUris) {
        this.identifierUris = identifierUris;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model ApplicationCreateParameters"));
        }
    }
}
