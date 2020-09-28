// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Desired managed outbound IPs for the cluster load balancer. */
@Fluent
public final class ManagedClusterLoadBalancerProfileManagedOutboundIPs {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ManagedClusterLoadBalancerProfileManagedOutboundIPs.class);

    /*
     * Desired number of outbound IP created/managed by Azure for the cluster
     * load balancer. Allowed values must be in the range of 1 to 100
     * (inclusive). The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Get the count property: Desired number of outbound IP created/managed by Azure for the cluster load balancer.
     * Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Desired number of outbound IP created/managed by Azure for the cluster load balancer.
     * Allowed values must be in the range of 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set.
     * @return the ManagedClusterLoadBalancerProfileManagedOutboundIPs object itself.
     */
    public ManagedClusterLoadBalancerProfileManagedOutboundIPs withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
