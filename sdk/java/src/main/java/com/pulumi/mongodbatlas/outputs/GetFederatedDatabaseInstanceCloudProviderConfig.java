// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetFederatedDatabaseInstanceCloudProviderConfigAws;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceCloudProviderConfig {
    private GetFederatedDatabaseInstanceCloudProviderConfigAws aws;

    private GetFederatedDatabaseInstanceCloudProviderConfig() {}
    public GetFederatedDatabaseInstanceCloudProviderConfigAws aws() {
        return this.aws;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceCloudProviderConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetFederatedDatabaseInstanceCloudProviderConfigAws aws;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceCloudProviderConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
        }

        @CustomType.Setter
        public Builder aws(GetFederatedDatabaseInstanceCloudProviderConfigAws aws) {
            this.aws = Objects.requireNonNull(aws);
            return this;
        }
        public GetFederatedDatabaseInstanceCloudProviderConfig build() {
            final var o = new GetFederatedDatabaseInstanceCloudProviderConfig();
            o.aws = aws;
            return o;
        }
    }
}
