// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FederatedDatabaseInstanceCloudProviderConfigAws {
    /**
     * @return Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    private @Nullable String externalId;
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    private @Nullable String iamAssumedRoleArn;
    /**
     * @return Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    private @Nullable String iamUserArn;
    private String roleId;
    private String testS3Bucket;

    private FederatedDatabaseInstanceCloudProviderConfigAws() {}
    /**
     * @return Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    public Optional<String> iamAssumedRoleArn() {
        return Optional.ofNullable(this.iamAssumedRoleArn);
    }
    /**
     * @return Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    public Optional<String> iamUserArn() {
        return Optional.ofNullable(this.iamUserArn);
    }
    public String roleId() {
        return this.roleId;
    }
    public String testS3Bucket() {
        return this.testS3Bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceCloudProviderConfigAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String externalId;
        private @Nullable String iamAssumedRoleArn;
        private @Nullable String iamUserArn;
        private String roleId;
        private String testS3Bucket;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceCloudProviderConfigAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.iamAssumedRoleArn = defaults.iamAssumedRoleArn;
    	      this.iamUserArn = defaults.iamUserArn;
    	      this.roleId = defaults.roleId;
    	      this.testS3Bucket = defaults.testS3Bucket;
        }

        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {

            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder iamAssumedRoleArn(@Nullable String iamAssumedRoleArn) {

            this.iamAssumedRoleArn = iamAssumedRoleArn;
            return this;
        }
        @CustomType.Setter
        public Builder iamUserArn(@Nullable String iamUserArn) {

            this.iamUserArn = iamUserArn;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("FederatedDatabaseInstanceCloudProviderConfigAws", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder testS3Bucket(String testS3Bucket) {
            if (testS3Bucket == null) {
              throw new MissingRequiredPropertyException("FederatedDatabaseInstanceCloudProviderConfigAws", "testS3Bucket");
            }
            this.testS3Bucket = testS3Bucket;
            return this;
        }
        public FederatedDatabaseInstanceCloudProviderConfigAws build() {
            final var _resultValue = new FederatedDatabaseInstanceCloudProviderConfigAws();
            _resultValue.externalId = externalId;
            _resultValue.iamAssumedRoleArn = iamAssumedRoleArn;
            _resultValue.iamUserArn = iamUserArn;
            _resultValue.roleId = roleId;
            _resultValue.testS3Bucket = testS3Bucket;
            return _resultValue;
        }
    }
}