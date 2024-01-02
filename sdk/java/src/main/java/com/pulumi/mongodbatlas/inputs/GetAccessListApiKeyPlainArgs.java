// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAccessListApiKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccessListApiKeyPlainArgs Empty = new GetAccessListApiKeyPlainArgs();

    /**
     * Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
     * *
     * -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don&#39;t set both.
     * 
     */
    @Import(name="apiKeyId", required=true)
    private String apiKeyId;

    /**
     * @return Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
     * *
     * -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don&#39;t set both.
     * 
     */
    public String apiKeyId() {
        return this.apiKeyId;
    }

    /**
     * Single IP address to be added to the access list.
     * 
     */
    @Import(name="ipAddress", required=true)
    private String ipAddress;

    /**
     * @return Single IP address to be added to the access list.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    private GetAccessListApiKeyPlainArgs() {}

    private GetAccessListApiKeyPlainArgs(GetAccessListApiKeyPlainArgs $) {
        this.apiKeyId = $.apiKeyId;
        this.ipAddress = $.ipAddress;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccessListApiKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccessListApiKeyPlainArgs $;

        public Builder() {
            $ = new GetAccessListApiKeyPlainArgs();
        }

        public Builder(GetAccessListApiKeyPlainArgs defaults) {
            $ = new GetAccessListApiKeyPlainArgs(Objects.requireNonNull(defaults));
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
            $.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * @param ipAddress Single IP address to be added to the access list.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetAccessListApiKeyPlainArgs build() {
            if ($.apiKeyId == null) {
                throw new MissingRequiredPropertyException("GetAccessListApiKeyPlainArgs", "apiKeyId");
            }
            if ($.ipAddress == null) {
                throw new MissingRequiredPropertyException("GetAccessListApiKeyPlainArgs", "ipAddress");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetAccessListApiKeyPlainArgs", "orgId");
            }
            return $;
        }
    }

}
