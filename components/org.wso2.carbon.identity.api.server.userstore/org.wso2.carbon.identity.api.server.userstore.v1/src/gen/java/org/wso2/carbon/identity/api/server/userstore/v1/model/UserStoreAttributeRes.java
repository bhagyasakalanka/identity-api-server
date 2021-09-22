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

package org.wso2.carbon.identity.api.server.userstore.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

import io.swagger.annotations.*;

import java.util.Objects;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;

/**
 * Userstore attribute API response.
 */
public class UserStoreAttributeRes {

    private String claimId;
    private String claimURI;
    private String mappedAttribute;
    private String displayName;

    /**
     * Set claim id and return this object.
     *
     * @param claimId Id of the attribute.
     * @return This object.
     */
    public UserStoreAttributeRes claimId(String claimId) {

        this.claimId = claimId;
        return this;
    }

    @ApiModelProperty(example = "bzIuY2FyYm9uLnVzZXIuY29yZS5qZG", value = "Claim id of the attribute.")
    @JsonProperty("claimId")
    @Valid
    public String getClaimId() {

        return claimId;
    }

    public void setClaimId(String claimId) {

        this.claimId = claimId;
    }

    /**
     * Set claim uri and return this object.
     *
     * @param claimURI claim uri of the attribute.
     * @return This object.
     */
    public UserStoreAttributeRes claimURI(String claimURI) {

        this.claimURI = claimURI;
        return this;
    }

    @ApiModelProperty(example = "http://wso2.org/claims/givenname", value = "Claim uri of the attribute.")
    @JsonProperty("claimURI")
    @Valid
    public String getClaimURI() {

        return claimURI;
    }

    public void setClaimURI(String claimURI) {

        this.claimURI = claimURI;
    }

    /**
     * Set mapped attribute and return this object.
     *
     * @param mappedAttribute mapped attribute.
     * @return This object.
     */
    public UserStoreAttributeRes mappedAttribute(String mappedAttribute) {

        this.mappedAttribute = mappedAttribute;
        return this;
    }

    @ApiModelProperty(example = "givenName", value = "Mapped userstore attribute.")
    @JsonProperty("mappedAttribute")
    @Valid
    public String getMappedAttribute() {

        return mappedAttribute;
    }

    public void setMappedAttribute(String mappedAttribute) {

        this.mappedAttribute = mappedAttribute;
    }

    /**
     * Set display name and return this object.
     *
     * @param displayName display name of the attribute.
     * @return This object.
     */
    public UserStoreAttributeRes displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    @ApiModelProperty(example = "First Name", value = "Display name of the attribute.")
    @JsonProperty("displayName")
    @Valid
    public String getDisplayName() {

        return displayName;
    }

    public void setDisplayName(String displayName) {

        this.displayName = displayName;
    }

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserStoreAttributeRes userStoreAttributeRes = (UserStoreAttributeRes) o;
        return Objects.equals(this.claimId, userStoreAttributeRes.claimId) &&
                Objects.equals(this.claimURI, userStoreAttributeRes.claimURI) &&
                Objects.equals(this.mappedAttribute, userStoreAttributeRes.mappedAttribute) &&
                Objects.equals(this.displayName, userStoreAttributeRes.displayName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(claimId, claimURI, mappedAttribute, displayName);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class UserStoreAttributeRes {\n");

        sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
        sb.append("    claimURI: ").append(toIndentedString(claimURI)).append("\n");
        sb.append("    mappedAttribute: ").append(toIndentedString(mappedAttribute)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}
