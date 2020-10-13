// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;

import com.azure.learn.computation.models.Operation;
import com.azure.learn.computation.models.OperationStatus;

import java.util.List;

public final class ComputationClient {

    ComputationClient() {
        // package-private constructor
    }

    @ServiceMethod(returns = ReturnType.COLLECTION)
    public List<String> listComputeNodes() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void createComputeNodeWithResponse(String nodeName, boolean ifNotExist, Context context) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<Operation, Operation> beginComputePi(String nodeName) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<Operation, Response<Operation>> beginComputePiWithResponse(String nodeName, int precision, Context context) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationStatus getComputePiOperationStatus(String operationId) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
