// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.DeletedApplicationsClient;
import com.azure.resourcemanager.authorization.fluent.models.ApplicationInner;
import com.azure.resourcemanager.authorization.models.ApplicationListResult;
import com.azure.resourcemanager.authorization.models.GraphErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DeletedApplicationsClient. */
public final class DeletedApplicationsClientImpl implements DeletedApplicationsClient {
    private final ClientLogger logger = new ClientLogger(DeletedApplicationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DeletedApplicationsService service;

    /** The service client containing this operation class. */
    private final GraphRbacManagementClientImpl client;

    /**
     * Initializes an instance of DeletedApplicationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DeletedApplicationsClientImpl(GraphRbacManagementClientImpl client) {
        this.service =
            RestProxy.create(DeletedApplicationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for GraphRbacManagementClientDeletedApplications to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "GraphRbacManagementC")
    private interface DeletedApplicationsService {
        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Post("/{tenantID}/deletedApplications/{objectId}/restore")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<ApplicationInner>> restore(
            @HostParam("$host") String endpoint,
            @PathParam("objectId") String objectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/deletedApplications")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<ApplicationListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("$filter") String filter,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete("/{tenantID}/deletedApplications/{applicationObjectId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<Void>> hardDelete(
            @HostParam("$host") String endpoint,
            @PathParam("applicationObjectId") String applicationObjectId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/{tenantID}/{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(GraphErrorException.class)
        Mono<Response<ApplicationListResult>> listNext(
            @HostParam("$host") String endpoint,
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @QueryParam("api-version") String apiVersion,
            @PathParam("tenantID") String tenantId,
            Context context);
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApplicationInner>> restoreWithResponseAsync(String objectId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (objectId == null) {
            return Mono.error(new IllegalArgumentException("Parameter objectId is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .restore(
                            this.client.getEndpoint(),
                            objectId,
                            this.client.getApiVersion(),
                            this.client.getTenantId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ApplicationInner>> restoreWithResponseAsync(String objectId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (objectId == null) {
            return Mono.error(new IllegalArgumentException("Parameter objectId is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .restore(
                this.client.getEndpoint(), objectId, this.client.getApiVersion(), this.client.getTenantId(), context);
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApplicationInner> restoreAsync(String objectId) {
        return restoreWithResponseAsync(objectId)
            .flatMap(
                (Response<ApplicationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApplicationInner restore(String objectId) {
        return restoreAsync(objectId).block();
    }

    /**
     * Restores the deleted application in the directory.
     *
     * @param objectId Application object ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return active Directory application information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ApplicationInner> restoreWithResponse(String objectId, Context context) {
        return restoreWithResponseAsync(objectId, context).block();
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationInner>> listSinglePageAsync(String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            filter,
                            this.client.getApiVersion(),
                            this.client.getTenantId(),
                            context))
            .<PagedResponse<ApplicationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationInner>> listSinglePageAsync(String filter, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), filter, this.client.getApiVersion(), this.client.getTenantId(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationInner> listAsync(String filter) {
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ApplicationInner> listAsync() {
        final String filter = null;
        return new PagedFlux<>(() -> listSinglePageAsync(filter), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ApplicationInner> listAsync(String filter, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(filter, context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationInner> list(String filter, Context context) {
        return new PagedIterable<>(listAsync(filter, context));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ApplicationInner> list() {
        final String filter = null;
        return new PagedIterable<>(listAsync(filter));
    }

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> hardDeleteWithResponseAsync(String applicationObjectId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (applicationObjectId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationObjectId is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .hardDelete(
                            this.client.getEndpoint(),
                            applicationObjectId,
                            this.client.getApiVersion(),
                            this.client.getTenantId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> hardDeleteWithResponseAsync(String applicationObjectId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (applicationObjectId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter applicationObjectId is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .hardDelete(
                this.client.getEndpoint(),
                applicationObjectId,
                this.client.getApiVersion(),
                this.client.getTenantId(),
                context);
    }

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> hardDeleteAsync(String applicationObjectId) {
        return hardDeleteWithResponseAsync(applicationObjectId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void hardDelete(String applicationObjectId) {
        hardDeleteAsync(applicationObjectId).block();
    }

    /**
     * Hard-delete an application.
     *
     * @param applicationObjectId Application object ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> hardDeleteWithResponse(String applicationObjectId, Context context) {
        return hardDeleteWithResponseAsync(applicationObjectId, context).block();
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param nextLink Next link for the list operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationInner>> listNextSinglePageAsync(String nextLink) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listNext(
                            this.client.getEndpoint(),
                            nextLink,
                            this.client.getApiVersion(),
                            this.client.getTenantId(),
                            context))
            .<PagedResponse<ApplicationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of deleted applications in the directory.
     *
     * @param nextLink Next link for the list operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws GraphErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of deleted applications in the directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ApplicationInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getTenantId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getTenantId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listNext(
                this.client.getEndpoint(), nextLink, this.client.getApiVersion(), this.client.getTenantId(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().odataNextLink(),
                        null));
    }
}
