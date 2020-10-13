// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import com.azure.core.util.Context;
import com.azure.identity.DefaultAzureCredentialBuilder;

/**
 * A sample for demonstrating computation client library usage.
 */
public class ComputationSample {

    private static final String NODE_NAME = "TEST_NODE";

    /**
     * Main method to run the sample.
     * @param args Input args to the program.
     */
    public static <Operation> void main(String[] args) {
        ComputationClient computationClient = new ComputationClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint(System.getenv("API_LEARN_ENDPOINT"))
            .buildClient();

        computationClient.createComputeNodeWithResponse(NODE_NAME, true, Context.NONE);
        float valueOfPi = computationClient.beginComputePi(NODE_NAME).getFinalResult().getValue();

        System.out.println("Value of Pi: " + valueOfPi);
    }
}
