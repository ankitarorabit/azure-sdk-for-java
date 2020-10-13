// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.polling.PollerFlux;

import com.azure.learn.computation.models.Operation;
import com.azure.learn.computation.models.OperationStatus;
import reactor.core.publisher.Mono;

import java.util.List;

public final class ComputationAsyncClient {

    ComputationAsyncClient() {
        // package-private constructor
    }

    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<List<String>> listComputeNodes() {
        return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> createComputeNodeWithResponse(String nodeName, boolean ifNotExist) {
        return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<Operation, Operation> beginComputePi(String nodeName) {
        return PollerFlux.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<Operation, Response<Operation>> beginComputePiWithResponse(String nodeName, int precision) {
        return PollerFlux.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OperationStatus> getComputePiOperationStatus(String operationId) {
        return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }
}
