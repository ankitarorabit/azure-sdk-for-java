// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The password profile associated with a user. */
@Fluent
public final class PasswordProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PasswordProfile.class);

    /*
     * Password
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /*
     * Whether to force a password change on next login.
     */
    @JsonProperty(value = "forceChangePasswordNextLogin")
    private Boolean forceChangePasswordNextLogin;

    /*
     * The password profile associated with a user.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the password property: Password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password.
     *
     * @param password the password value to set.
     * @return the PasswordProfile object itself.
     */
    public PasswordProfile withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the forceChangePasswordNextLogin property: Whether to force a password change on next login.
     *
     * @return the forceChangePasswordNextLogin value.
     */
    public Boolean forceChangePasswordNextLogin() {
        return this.forceChangePasswordNextLogin;
    }

    /**
     * Set the forceChangePasswordNextLogin property: Whether to force a password change on next login.
     *
     * @param forceChangePasswordNextLogin the forceChangePasswordNextLogin value to set.
     * @return the PasswordProfile object itself.
     */
    public PasswordProfile withForceChangePasswordNextLogin(Boolean forceChangePasswordNextLogin) {
        this.forceChangePasswordNextLogin = forceChangePasswordNextLogin;
        return this;
    }

    /**
     * Get the additionalProperties property: The password profile associated with a user.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The password profile associated with a user.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the PasswordProfile object itself.
     */
    public PasswordProfile withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property password in model PasswordProfile"));
        }
    }
}
