// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Currency. */
public final class Currency extends ExpandableStringEnum<Currency> {
    /** Static value USD for Currency. */
    public static final Currency USD = fromString("USD");

    /**
     * Creates or finds a Currency from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Currency.
     */
    @JsonCreator
    public static Currency fromString(String name) {
        return fromString(name, Currency.class);
    }

    /** @return known Currency values. */
    public static Collection<Currency> values() {
        return values(Currency.class);
    }
}
