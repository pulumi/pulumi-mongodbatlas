// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs Empty = new GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs();

    /**
     * Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    @Import(name="externalId", required=true)
    private Output<String> externalId;

    /**
     * @return Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    @Import(name="iamAssumedRoleArn", required=true)
    private Output<String> iamAssumedRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    public Output<String> iamAssumedRoleArn() {
        return this.iamAssumedRoleArn;
    }

    /**
     * Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    @Import(name="iamUserArn", required=true)
    private Output<String> iamUserArn;

    /**
     * @return Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    public Output<String> iamUserArn() {
        return this.iamUserArn;
    }

    /**
     * Unique identifier of the role that the data lake can use to access the data stores.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    /**
     * @return Unique identifier of the role that the data lake can use to access the data stores.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }

    @Import(name="testS3Bucket", required=true)
    private Output<String> testS3Bucket;

    public Output<String> testS3Bucket() {
        return this.testS3Bucket;
    }

    private GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs() {}

    private GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs(GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs $) {
        this.externalId = $.externalId;
        this.iamAssumedRoleArn = $.iamAssumedRoleArn;
        this.iamUserArn = $.iamUserArn;
        this.roleId = $.roleId;
        this.testS3Bucket = $.testS3Bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs $;

        public Builder() {
            $ = new GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs();
        }

        public Builder(GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs defaults) {
            $ = new GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalId Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
         * 
         * @return builder
         * 
         */
        public Builder externalId(Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param iamAssumedRoleArn Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
         * * `s3:GetObject`
         * * `s3:ListBucket`
         * * `s3:GetObjectVersion`
         * 
         * @return builder
         * 
         */
        public Builder iamAssumedRoleArn(Output<String> iamAssumedRoleArn) {
            $.iamAssumedRoleArn = iamAssumedRoleArn;
            return this;
        }

        /**
         * @param iamAssumedRoleArn Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
         * * `s3:GetObject`
         * * `s3:ListBucket`
         * * `s3:GetObjectVersion`
         * 
         * @return builder
         * 
         */
        public Builder iamAssumedRoleArn(String iamAssumedRoleArn) {
            return iamAssumedRoleArn(Output.of(iamAssumedRoleArn));
        }

        /**
         * @param iamUserArn Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
         * 
         * @return builder
         * 
         */
        public Builder iamUserArn(Output<String> iamUserArn) {
            $.iamUserArn = iamUserArn;
            return this;
        }

        /**
         * @param iamUserArn Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
         * 
         * @return builder
         * 
         */
        public Builder iamUserArn(String iamUserArn) {
            return iamUserArn(Output.of(iamUserArn));
        }

        /**
         * @param roleId Unique identifier of the role that the data lake can use to access the data stores.
         * 
         * @return builder
         * 
         */
        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId Unique identifier of the role that the data lake can use to access the data stores.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public Builder testS3Bucket(Output<String> testS3Bucket) {
            $.testS3Bucket = testS3Bucket;
            return this;
        }

        public Builder testS3Bucket(String testS3Bucket) {
            return testS3Bucket(Output.of(testS3Bucket));
        }

        public GetFederatedDatabaseInstanceCloudProviderConfigAwsArgs build() {
            $.externalId = Objects.requireNonNull($.externalId, "expected parameter 'externalId' to be non-null");
            $.iamAssumedRoleArn = Objects.requireNonNull($.iamAssumedRoleArn, "expected parameter 'iamAssumedRoleArn' to be non-null");
            $.iamUserArn = Objects.requireNonNull($.iamUserArn, "expected parameter 'iamUserArn' to be non-null");
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            $.testS3Bucket = Objects.requireNonNull($.testS3Bucket, "expected parameter 'testS3Bucket' to be non-null");
            return $;
        }
    }

}