// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFederatedDatabaseInstanceCloudProviderConfigAws {
    /**
     * @return Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    private String externalId;
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    private String iamAssumedRoleArn;
    /**
     * @return Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    private String iamUserArn;
    /**
     * @return Unique identifier of the role that the data lake can use to access the data stores.
     * 
     */
    private String roleId;
    private String testS3Bucket;

    private GetFederatedDatabaseInstanceCloudProviderConfigAws() {}
    /**
     * @return Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    public String externalId() {
        return this.externalId;
    }
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    public String iamAssumedRoleArn() {
        return this.iamAssumedRoleArn;
    }
    /**
     * @return Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    public String iamUserArn() {
        return this.iamUserArn;
    }
    /**
     * @return Unique identifier of the role that the data lake can use to access the data stores.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    public String testS3Bucket() {
        return this.testS3Bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedDatabaseInstanceCloudProviderConfigAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalId;
        private String iamAssumedRoleArn;
        private String iamUserArn;
        private String roleId;
        private String testS3Bucket;
        public Builder() {}
        public Builder(GetFederatedDatabaseInstanceCloudProviderConfigAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.iamAssumedRoleArn = defaults.iamAssumedRoleArn;
    	      this.iamUserArn = defaults.iamUserArn;
    	      this.roleId = defaults.roleId;
    	      this.testS3Bucket = defaults.testS3Bucket;
        }

        @CustomType.Setter
        public Builder externalId(String externalId) {
            if (externalId == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceCloudProviderConfigAws", "externalId");
            }
            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder iamAssumedRoleArn(String iamAssumedRoleArn) {
            if (iamAssumedRoleArn == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceCloudProviderConfigAws", "iamAssumedRoleArn");
            }
            this.iamAssumedRoleArn = iamAssumedRoleArn;
            return this;
        }
        @CustomType.Setter
        public Builder iamUserArn(String iamUserArn) {
            if (iamUserArn == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceCloudProviderConfigAws", "iamUserArn");
            }
            this.iamUserArn = iamUserArn;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceCloudProviderConfigAws", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder testS3Bucket(String testS3Bucket) {
            if (testS3Bucket == null) {
              throw new MissingRequiredPropertyException("GetFederatedDatabaseInstanceCloudProviderConfigAws", "testS3Bucket");
            }
            this.testS3Bucket = testS3Bucket;
            return this;
        }
        public GetFederatedDatabaseInstanceCloudProviderConfigAws build() {
            final var _resultValue = new GetFederatedDatabaseInstanceCloudProviderConfigAws();
            _resultValue.externalId = externalId;
            _resultValue.iamAssumedRoleArn = iamAssumedRoleArn;
            _resultValue.iamUserArn = iamUserArn;
            _resultValue.roleId = roleId;
            _resultValue.testS3Bucket = testS3Bucket;
            return _resultValue;
        }
    }
}