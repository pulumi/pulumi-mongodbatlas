// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudProviderAccessSetupAzureConfig {
    /**
     * @return Azure Active Directory Application ID of Atlas.
     * 
     */
    private String atlasAzureAppId;
    /**
     * @return UUID string that identifies the Azure Service Principal.
     * 
     */
    private String servicePrincipalId;
    /**
     * @return UUID String that identifies the Azure Active Directory Tenant ID.
     * 
     */
    private String tenantId;

    private GetCloudProviderAccessSetupAzureConfig() {}
    /**
     * @return Azure Active Directory Application ID of Atlas.
     * 
     */
    public String atlasAzureAppId() {
        return this.atlasAzureAppId;
    }
    /**
     * @return UUID string that identifies the Azure Service Principal.
     * 
     */
    public String servicePrincipalId() {
        return this.servicePrincipalId;
    }
    /**
     * @return UUID String that identifies the Azure Active Directory Tenant ID.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudProviderAccessSetupAzureConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String atlasAzureAppId;
        private String servicePrincipalId;
        private String tenantId;
        public Builder() {}
        public Builder(GetCloudProviderAccessSetupAzureConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atlasAzureAppId = defaults.atlasAzureAppId;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder atlasAzureAppId(String atlasAzureAppId) {
            this.atlasAzureAppId = Objects.requireNonNull(atlasAzureAppId);
            return this;
        }
        @CustomType.Setter
        public Builder servicePrincipalId(String servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public GetCloudProviderAccessSetupAzureConfig build() {
            final var o = new GetCloudProviderAccessSetupAzureConfig();
            o.atlasAzureAppId = atlasAzureAppId;
            o.servicePrincipalId = servicePrincipalId;
            o.tenantId = tenantId;
            return o;
        }
    }
}