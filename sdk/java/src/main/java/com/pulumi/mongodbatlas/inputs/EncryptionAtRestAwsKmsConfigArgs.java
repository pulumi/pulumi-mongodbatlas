// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionAtRestAwsKmsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionAtRestAwsKmsConfigArgs Empty = new EncryptionAtRestAwsKmsConfigArgs();

    @Import(name="accessKeyId")
    private @Nullable Output<String> accessKeyId;

    public Optional<Output<String>> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }

    /**
     * The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    @Import(name="customerMasterKeyId")
    private @Nullable Output<String> customerMasterKeyId;

    /**
     * @return The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    public Optional<Output<String>> customerMasterKeyId() {
        return Optional.ofNullable(this.customerMasterKeyId);
    }

    /**
     * Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    @Import(name="secretAccessKey")
    private @Nullable Output<String> secretAccessKey;

    public Optional<Output<String>> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    private EncryptionAtRestAwsKmsConfigArgs() {}

    private EncryptionAtRestAwsKmsConfigArgs(EncryptionAtRestAwsKmsConfigArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.customerMasterKeyId = $.customerMasterKeyId;
        this.enabled = $.enabled;
        this.region = $.region;
        this.roleId = $.roleId;
        this.secretAccessKey = $.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionAtRestAwsKmsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionAtRestAwsKmsConfigArgs $;

        public Builder() {
            $ = new EncryptionAtRestAwsKmsConfigArgs();
        }

        public Builder(EncryptionAtRestAwsKmsConfigArgs defaults) {
            $ = new EncryptionAtRestAwsKmsConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKeyId(@Nullable Output<String> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        public Builder accessKeyId(String accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
        }

        /**
         * @param customerMasterKeyId The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
         * 
         * @return builder
         * 
         */
        public Builder customerMasterKeyId(@Nullable Output<String> customerMasterKeyId) {
            $.customerMasterKeyId = customerMasterKeyId;
            return this;
        }

        /**
         * @param customerMasterKeyId The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
         * 
         * @return builder
         * 
         */
        public Builder customerMasterKeyId(String customerMasterKeyId) {
            return customerMasterKeyId(Output.of(customerMasterKeyId));
        }

        /**
         * @param enabled Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param region The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param roleId ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public Builder secretAccessKey(@Nullable Output<String> secretAccessKey) {
            $.secretAccessKey = secretAccessKey;
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            return secretAccessKey(Output.of(secretAccessKey));
        }

        public EncryptionAtRestAwsKmsConfigArgs build() {
            return $;
        }
    }

}
