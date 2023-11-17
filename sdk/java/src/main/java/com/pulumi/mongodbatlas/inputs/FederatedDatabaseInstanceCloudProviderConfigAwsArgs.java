// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FederatedDatabaseInstanceCloudProviderConfigAwsArgs extends com.pulumi.resources.ResourceArgs {

    public static final FederatedDatabaseInstanceCloudProviderConfigAwsArgs Empty = new FederatedDatabaseInstanceCloudProviderConfigAwsArgs();

    /**
     * Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    @Import(name="iamAssumedRoleArn")
    private @Nullable Output<String> iamAssumedRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
     * * `s3:GetObject`
     * * `s3:ListBucket`
     * * `s3:GetObjectVersion`
     * 
     */
    public Optional<Output<String>> iamAssumedRoleArn() {
        return Optional.ofNullable(this.iamAssumedRoleArn);
    }

    /**
     * Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    @Import(name="iamUserArn")
    private @Nullable Output<String> iamUserArn;

    /**
     * @return Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
     * 
     */
    public Optional<Output<String>> iamUserArn() {
        return Optional.ofNullable(this.iamUserArn);
    }

    /**
     * Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    /**
     * @return Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }

    /**
     * Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
     * 
     */
    @Import(name="testS3Bucket", required=true)
    private Output<String> testS3Bucket;

    /**
     * @return Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
     * 
     */
    public Output<String> testS3Bucket() {
        return this.testS3Bucket;
    }

    private FederatedDatabaseInstanceCloudProviderConfigAwsArgs() {}

    private FederatedDatabaseInstanceCloudProviderConfigAwsArgs(FederatedDatabaseInstanceCloudProviderConfigAwsArgs $) {
        this.externalId = $.externalId;
        this.iamAssumedRoleArn = $.iamAssumedRoleArn;
        this.iamUserArn = $.iamUserArn;
        this.roleId = $.roleId;
        this.testS3Bucket = $.testS3Bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FederatedDatabaseInstanceCloudProviderConfigAwsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FederatedDatabaseInstanceCloudProviderConfigAwsArgs $;

        public Builder() {
            $ = new FederatedDatabaseInstanceCloudProviderConfigAwsArgs();
        }

        public Builder(FederatedDatabaseInstanceCloudProviderConfigAwsArgs defaults) {
            $ = new FederatedDatabaseInstanceCloudProviderConfigAwsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalId Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
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
        public Builder iamAssumedRoleArn(@Nullable Output<String> iamAssumedRoleArn) {
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
        public Builder iamUserArn(@Nullable Output<String> iamUserArn) {
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
         * @param roleId Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
         * 
         * @return builder
         * 
         */
        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param testS3Bucket Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
         * 
         * @return builder
         * 
         */
        public Builder testS3Bucket(Output<String> testS3Bucket) {
            $.testS3Bucket = testS3Bucket;
            return this;
        }

        /**
         * @param testS3Bucket Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
         * 
         * @return builder
         * 
         */
        public Builder testS3Bucket(String testS3Bucket) {
            return testS3Bucket(Output.of(testS3Bucket));
        }

        public FederatedDatabaseInstanceCloudProviderConfigAwsArgs build() {
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            $.testS3Bucket = Objects.requireNonNull($.testS3Bucket, "expected parameter 'testS3Bucket' to be non-null");
            return $;
        }
    }

}
