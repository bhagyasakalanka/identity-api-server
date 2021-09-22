/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.com).
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.userstore.v1.core.functions.userstore;

import org.apache.commons.collections.CollectionUtils;
import org.wso2.carbon.identity.api.server.userstore.v1.model.UserStoreAttributeRes;
import org.wso2.carbon.identity.user.store.configuration.model.UserStoreAttributeDO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * Convert yserstore attribute mappings to API model.
 */
public class AttributeMappingsToApiModel implements Function<List<UserStoreAttributeDO>, List<UserStoreAttributeRes>> {

    @Override
    public List<UserStoreAttributeRes> apply(List<UserStoreAttributeDO> userStoreAttributeDOs) {

        if (CollectionUtils.isNotEmpty(userStoreAttributeDOs)) {

            List<UserStoreAttributeRes> userStoreAttributes = new ArrayList<>();
            userStoreAttributeDOs.stream().forEach(
                    userStoreAttributeDO -> {
                        UserStoreAttributeRes userStoreAttributeRes = new UserStoreAttributeRes();
                        userStoreAttributeRes.mappedAttribute(userStoreAttributeDO.getMappedAttribute());
                        userStoreAttributeRes.claimId(userStoreAttributeDO.getClaimId());
                        userStoreAttributeRes.claimURI(userStoreAttributeRes.getClaimURI());
                        userStoreAttributeRes.displayName(userStoreAttributeDO.getDisplayName());
                        userStoreAttributes.add(userStoreAttributeRes);
                    });
            return userStoreAttributes;
        }
        return Collections.emptyList();
    }
}
