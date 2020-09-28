// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.TransparentDataEncryptionActivityInner;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionName;

/**
 * An instance of this class provides access to all the operations defined in TransparentDataEncryptionActivitiesClient.
 */
public interface TransparentDataEncryptionActivitiesClient {
    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<TransparentDataEncryptionActivityInner> listByConfigurationAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName);

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TransparentDataEncryptionActivityInner> listByConfiguration(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName);

    /**
     * Returns a database's transparent data encryption operation result.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database for which the transparent data encryption applies.
     * @param transparentDataEncryptionName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list database transparent data encryption activity request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TransparentDataEncryptionActivityInner> listByConfiguration(
        String resourceGroupName,
        String serverName,
        String databaseName,
        TransparentDataEncryptionName transparentDataEncryptionName,
        Context context);
}
