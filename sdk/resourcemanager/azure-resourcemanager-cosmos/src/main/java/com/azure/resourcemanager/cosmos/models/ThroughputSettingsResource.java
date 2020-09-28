// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cosmos DB resource throughput object. */
@Fluent
public class ThroughputSettingsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThroughputSettingsResource.class);

    /*
     * Value of the Cosmos DB resource throughput
     */
    @JsonProperty(value = "throughput", required = true)
    private int throughput;

    /*
     * The minimum throughput of the resource
     */
    @JsonProperty(value = "minimumThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private String minimumThroughput;

    /*
     * The throughput replace is pending
     */
    @JsonProperty(value = "offerReplacePending", access = JsonProperty.Access.WRITE_ONLY)
    private String offerReplacePending;

    /**
     * Get the throughput property: Value of the Cosmos DB resource throughput.
     *
     * @return the throughput value.
     */
    public int throughput() {
        return this.throughput;
    }

    /**
     * Set the throughput property: Value of the Cosmos DB resource throughput.
     *
     * @param throughput the throughput value to set.
     * @return the ThroughputSettingsResource object itself.
     */
    public ThroughputSettingsResource withThroughput(int throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Get the minimumThroughput property: The minimum throughput of the resource.
     *
     * @return the minimumThroughput value.
     */
    public String minimumThroughput() {
        return this.minimumThroughput;
    }

    /**
     * Get the offerReplacePending property: The throughput replace is pending.
     *
     * @return the offerReplacePending value.
     */
    public String offerReplacePending() {
        return this.offerReplacePending;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
