/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.BgpPeerStatusListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.BgpPeerStatus;

class BgpPeerStatusListResultImpl extends WrapperImpl<BgpPeerStatusListResultInner> implements BgpPeerStatusListResult {
    private final NetworkManager manager;
    BgpPeerStatusListResultImpl(BgpPeerStatusListResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<BgpPeerStatus> value() {
        return this.inner().value();
    }

}
