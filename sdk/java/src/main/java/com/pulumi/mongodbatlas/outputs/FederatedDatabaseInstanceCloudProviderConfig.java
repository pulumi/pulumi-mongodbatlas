// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.FederatedDatabaseInstanceCloudProviderConfigAws;
import java.util.Objects;

@CustomType
public final class FederatedDatabaseInstanceCloudProviderConfig {
    /**
     * @return Name of the cloud service that hosts the data lake&#39;s data stores.
     * 
     */
    private FederatedDatabaseInstanceCloudProviderConfigAws aws;

    private FederatedDatabaseInstanceCloudProviderConfig() {}
    /**
     * @return Name of the cloud service that hosts the data lake&#39;s data stores.
     * 
     */
    public FederatedDatabaseInstanceCloudProviderConfigAws aws() {
        return this.aws;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceCloudProviderConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FederatedDatabaseInstanceCloudProviderConfigAws aws;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceCloudProviderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
        }

        @CustomType.Setter
        public Builder aws(FederatedDatabaseInstanceCloudProviderConfigAws aws) {
            if (aws == null) {
              throw new MissingRequiredPropertyException("FederatedDatabaseInstanceCloudProviderConfig", "aws");
            }
            this.aws = aws;
            return this;
        }
        public FederatedDatabaseInstanceCloudProviderConfig build() {
            final var _resultValue = new FederatedDatabaseInstanceCloudProviderConfig();
            _resultValue.aws = aws;
            return _resultValue;
        }
    }
}
