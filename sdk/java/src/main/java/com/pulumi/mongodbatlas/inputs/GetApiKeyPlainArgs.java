// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetApiKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiKeyPlainArgs Empty = new GetApiKeyPlainArgs();

    /**
     * Unique identifier for the organization API key.
     * 
     */
    @Import(name="apiKeyId", required=true)
    private String apiKeyId;

    /**
     * @return Unique identifier for the organization API key.
     * 
     */
    public String apiKeyId() {
        return this.apiKeyId;
    }

    /**
     * Unique identifier for the organization.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique identifier for the organization.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    private GetApiKeyPlainArgs() {}

    private GetApiKeyPlainArgs(GetApiKeyPlainArgs $) {
        this.apiKeyId = $.apiKeyId;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiKeyPlainArgs $;

        public Builder() {
            $ = new GetApiKeyPlainArgs();
        }

        public Builder(GetApiKeyPlainArgs defaults) {
            $ = new GetApiKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKeyId Unique identifier for the organization API key.
         * 
         * @return builder
         * 
         */
        public Builder apiKeyId(String apiKeyId) {
            $.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * @param orgId Unique identifier for the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetApiKeyPlainArgs build() {
            if ($.apiKeyId == null) {
                throw new MissingRequiredPropertyException("GetApiKeyPlainArgs", "apiKeyId");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetApiKeyPlainArgs", "orgId");
            }
            return $;
        }
    }

}
