// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAccessListApiKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessListApiKeyArgs Empty = new GetAccessListApiKeyArgs();

    /**
     * Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
     * *
     * -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don&#39;t set both.
     * 
     */
    @Import(name="apiKeyId", required=true)
    private Output<String> apiKeyId;

    /**
     * @return Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
     * *
     * -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don&#39;t set both.
     * 
     */
    public Output<String> apiKeyId() {
        return this.apiKeyId;
    }

    /**
     * Single IP address to be added to the access list.
     * 
     */
    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    /**
     * @return Single IP address to be added to the access list.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    private GetAccessListApiKeyArgs() {}

    private GetAccessListApiKeyArgs(GetAccessListApiKeyArgs $) {
        this.apiKeyId = $.apiKeyId;
        this.ipAddress = $.ipAddress;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessListApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessListApiKeyArgs $;

        public Builder() {
            $ = new GetAccessListApiKeyArgs();
        }

        public Builder(GetAccessListApiKeyArgs defaults) {
            $ = new GetAccessListApiKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiKeyId Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
         * *
         * -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don&#39;t set both.
         * 
         * @return builder
         * 
         */
        public Builder apiKeyId(Output<String> apiKeyId) {
            $.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * @param apiKeyId Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
         * *
         * -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don&#39;t set both.
         * 
         * @return builder
         * 
         */
        public Builder apiKeyId(String apiKeyId) {
            return apiKeyId(Output.of(apiKeyId));
        }

        /**
         * @param ipAddress Single IP address to be added to the access list.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Single IP address to be added to the access list.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetAccessListApiKeyArgs build() {
            if ($.apiKeyId == null) {
                throw new MissingRequiredPropertyException("GetAccessListApiKeyArgs", "apiKeyId");
            }
            if ($.ipAddress == null) {
                throw new MissingRequiredPropertyException("GetAccessListApiKeyArgs", "ipAddress");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetAccessListApiKeyArgs", "orgId");
            }
            return $;
        }
    }

}