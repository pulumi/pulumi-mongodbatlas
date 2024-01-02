// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionAtRestAwsKmsConfig {
    private @Nullable String accessKeyId;
    /**
     * @return The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    private @Nullable String customerMasterKeyId;
    /**
     * @return Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
     * 
     */
    private @Nullable String region;
    /**
     * @return ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
     * 
     */
    private @Nullable String roleId;
    private @Nullable String secretAccessKey;

    private EncryptionAtRestAwsKmsConfig() {}
    public Optional<String> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }
    /**
     * @return The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    public Optional<String> customerMasterKeyId() {
        return Optional.ofNullable(this.customerMasterKeyId);
    }
    /**
     * @return Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
     * 
     */
    public Optional<String> roleId() {
        return Optional.ofNullable(this.roleId);
    }
    public Optional<String> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionAtRestAwsKmsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessKeyId;
        private @Nullable String customerMasterKeyId;
        private @Nullable Boolean enabled;
        private @Nullable String region;
        private @Nullable String roleId;
        private @Nullable String secretAccessKey;
        public Builder() {}
        public Builder(EncryptionAtRestAwsKmsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.customerMasterKeyId = defaults.customerMasterKeyId;
    	      this.enabled = defaults.enabled;
    	      this.region = defaults.region;
    	      this.roleId = defaults.roleId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        @CustomType.Setter
        public Builder accessKeyId(@Nullable String accessKeyId) {

            this.accessKeyId = accessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder customerMasterKeyId(@Nullable String customerMasterKeyId) {

            this.customerMasterKeyId = customerMasterKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(@Nullable String roleId) {

            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder secretAccessKey(@Nullable String secretAccessKey) {

            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public EncryptionAtRestAwsKmsConfig build() {
            final var _resultValue = new EncryptionAtRestAwsKmsConfig();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.customerMasterKeyId = customerMasterKeyId;
            _resultValue.enabled = enabled;
            _resultValue.region = region;
            _resultValue.roleId = roleId;
            _resultValue.secretAccessKey = secretAccessKey;
            return _resultValue;
        }
    }
}
