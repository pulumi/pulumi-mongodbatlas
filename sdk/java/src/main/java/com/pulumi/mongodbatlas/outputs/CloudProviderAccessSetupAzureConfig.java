// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudProviderAccessSetupAzureConfig {
    private String atlasAzureAppId;
    private String servicePrincipalId;
    private String tenantId;

    private CloudProviderAccessSetupAzureConfig() {}
    public String atlasAzureAppId() {
        return this.atlasAzureAppId;
    }
    public String servicePrincipalId() {
        return this.servicePrincipalId;
    }
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudProviderAccessSetupAzureConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String atlasAzureAppId;
        private String servicePrincipalId;
        private String tenantId;
        public Builder() {}
        public Builder(CloudProviderAccessSetupAzureConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atlasAzureAppId = defaults.atlasAzureAppId;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder atlasAzureAppId(String atlasAzureAppId) {
            if (atlasAzureAppId == null) {
              throw new MissingRequiredPropertyException("CloudProviderAccessSetupAzureConfig", "atlasAzureAppId");
            }
            this.atlasAzureAppId = atlasAzureAppId;
            return this;
        }
        @CustomType.Setter
        public Builder servicePrincipalId(String servicePrincipalId) {
            if (servicePrincipalId == null) {
              throw new MissingRequiredPropertyException("CloudProviderAccessSetupAzureConfig", "servicePrincipalId");
            }
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            if (tenantId == null) {
              throw new MissingRequiredPropertyException("CloudProviderAccessSetupAzureConfig", "tenantId");
            }
            this.tenantId = tenantId;
            return this;
        }
        public CloudProviderAccessSetupAzureConfig build() {
            final var _resultValue = new CloudProviderAccessSetupAzureConfig();
            _resultValue.atlasAzureAppId = atlasAzureAppId;
            _resultValue.servicePrincipalId = servicePrincipalId;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}