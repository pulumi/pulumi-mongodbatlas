// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudProviderAccessSetupAwsConfig {
    /**
     * @return Unique external ID Atlas uses when assuming the IAM role in your AWS account.
     * 
     */
    private String atlasAssumedRoleExternalId;
    /**
     * @return ARN associated with the Atlas AWS account used to assume IAM roles in your AWS account.
     * 
     */
    private String atlasAwsAccountArn;

    private GetCloudProviderAccessSetupAwsConfig() {}
    /**
     * @return Unique external ID Atlas uses when assuming the IAM role in your AWS account.
     * 
     */
    public String atlasAssumedRoleExternalId() {
        return this.atlasAssumedRoleExternalId;
    }
    /**
     * @return ARN associated with the Atlas AWS account used to assume IAM roles in your AWS account.
     * 
     */
    public String atlasAwsAccountArn() {
        return this.atlasAwsAccountArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudProviderAccessSetupAwsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String atlasAssumedRoleExternalId;
        private String atlasAwsAccountArn;
        public Builder() {}
        public Builder(GetCloudProviderAccessSetupAwsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atlasAssumedRoleExternalId = defaults.atlasAssumedRoleExternalId;
    	      this.atlasAwsAccountArn = defaults.atlasAwsAccountArn;
        }

        @CustomType.Setter
        public Builder atlasAssumedRoleExternalId(String atlasAssumedRoleExternalId) {
            if (atlasAssumedRoleExternalId == null) {
              throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupAwsConfig", "atlasAssumedRoleExternalId");
            }
            this.atlasAssumedRoleExternalId = atlasAssumedRoleExternalId;
            return this;
        }
        @CustomType.Setter
        public Builder atlasAwsAccountArn(String atlasAwsAccountArn) {
            if (atlasAwsAccountArn == null) {
              throw new MissingRequiredPropertyException("GetCloudProviderAccessSetupAwsConfig", "atlasAwsAccountArn");
            }
            this.atlasAwsAccountArn = atlasAwsAccountArn;
            return this;
        }
        public GetCloudProviderAccessSetupAwsConfig build() {
            final var _resultValue = new GetCloudProviderAccessSetupAwsConfig();
            _resultValue.atlasAssumedRoleExternalId = atlasAssumedRoleExternalId;
            _resultValue.atlasAwsAccountArn = atlasAwsAccountArn;
            return _resultValue;
        }
    }
}
