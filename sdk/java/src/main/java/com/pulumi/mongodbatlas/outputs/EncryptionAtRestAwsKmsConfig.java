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
    /**
     * @return Unique alphanumeric string that identifies an Identity and Access Management (IAM) access key with permissions required to access your Amazon Web Services (AWS) Customer Master Key (CMK).
     * 
     */
    private @Nullable String accessKeyId;
    /**
     * @return Unique alphanumeric string that identifies the Amazon Web Services (AWS) Customer Master Key (CMK) you used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    private @Nullable String customerMasterKeyId;
    /**
     * @return Flag that indicates whether someone enabled encryption at rest for the specified project through Amazon Web Services (AWS) Key Management Service (KMS). To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Physical location where MongoDB Atlas deploys your AWS-hosted MongoDB cluster nodes. The region you choose can affect network latency for clients accessing your databases. When MongoDB Cloud deploys a dedicated cluster, it checks if a VPC or VPC connection exists for that provider and region. If not, MongoDB Atlas creates them as part of the deployment. MongoDB Atlas assigns the VPC a CIDR block. To limit a new VPC peering connection to one CIDR block and region, create the connection first. Deploy the cluster after the connection starts.
     * 
     */
    private @Nullable String region;
    /**
     * @return Enable connection to your Amazon Web Services (AWS) Key Management Service (KMS) over private networking.
     * 
     */
    private @Nullable Boolean requirePrivateNetworking;
    /**
     * @return Unique 24-hexadecimal digit string that identifies an Amazon Web Services (AWS) Identity and Access Management (IAM) role. This IAM role has the permissions required to manage your AWS customer master key.
     * 
     */
    private @Nullable String roleId;
    /**
     * @return Human-readable label of the Identity and Access Management (IAM) secret access key with permissions required to access your Amazon Web Services (AWS) customer master key.
     * 
     */
    private @Nullable String secretAccessKey;
    /**
     * @return Flag that indicates whether the Amazon Web Services (AWS) Key Management Service (KMS) encryption key can encrypt and decrypt data.
     * 
     */
    private @Nullable Boolean valid;

    private EncryptionAtRestAwsKmsConfig() {}
    /**
     * @return Unique alphanumeric string that identifies an Identity and Access Management (IAM) access key with permissions required to access your Amazon Web Services (AWS) Customer Master Key (CMK).
     * 
     */
    public Optional<String> accessKeyId() {
        return Optional.ofNullable(this.accessKeyId);
    }
    /**
     * @return Unique alphanumeric string that identifies the Amazon Web Services (AWS) Customer Master Key (CMK) you used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    public Optional<String> customerMasterKeyId() {
        return Optional.ofNullable(this.customerMasterKeyId);
    }
    /**
     * @return Flag that indicates whether someone enabled encryption at rest for the specified project through Amazon Web Services (AWS) Key Management Service (KMS). To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Physical location where MongoDB Atlas deploys your AWS-hosted MongoDB cluster nodes. The region you choose can affect network latency for clients accessing your databases. When MongoDB Cloud deploys a dedicated cluster, it checks if a VPC or VPC connection exists for that provider and region. If not, MongoDB Atlas creates them as part of the deployment. MongoDB Atlas assigns the VPC a CIDR block. To limit a new VPC peering connection to one CIDR block and region, create the connection first. Deploy the cluster after the connection starts.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Enable connection to your Amazon Web Services (AWS) Key Management Service (KMS) over private networking.
     * 
     */
    public Optional<Boolean> requirePrivateNetworking() {
        return Optional.ofNullable(this.requirePrivateNetworking);
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies an Amazon Web Services (AWS) Identity and Access Management (IAM) role. This IAM role has the permissions required to manage your AWS customer master key.
     * 
     */
    public Optional<String> roleId() {
        return Optional.ofNullable(this.roleId);
    }
    /**
     * @return Human-readable label of the Identity and Access Management (IAM) secret access key with permissions required to access your Amazon Web Services (AWS) customer master key.
     * 
     */
    public Optional<String> secretAccessKey() {
        return Optional.ofNullable(this.secretAccessKey);
    }
    /**
     * @return Flag that indicates whether the Amazon Web Services (AWS) Key Management Service (KMS) encryption key can encrypt and decrypt data.
     * 
     */
    public Optional<Boolean> valid() {
        return Optional.ofNullable(this.valid);
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
        private @Nullable Boolean requirePrivateNetworking;
        private @Nullable String roleId;
        private @Nullable String secretAccessKey;
        private @Nullable Boolean valid;
        public Builder() {}
        public Builder(EncryptionAtRestAwsKmsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.customerMasterKeyId = defaults.customerMasterKeyId;
    	      this.enabled = defaults.enabled;
    	      this.region = defaults.region;
    	      this.requirePrivateNetworking = defaults.requirePrivateNetworking;
    	      this.roleId = defaults.roleId;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.valid = defaults.valid;
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
        public Builder requirePrivateNetworking(@Nullable Boolean requirePrivateNetworking) {

            this.requirePrivateNetworking = requirePrivateNetworking;
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
        @CustomType.Setter
        public Builder valid(@Nullable Boolean valid) {

            this.valid = valid;
            return this;
        }
        public EncryptionAtRestAwsKmsConfig build() {
            final var _resultValue = new EncryptionAtRestAwsKmsConfig();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.customerMasterKeyId = customerMasterKeyId;
            _resultValue.enabled = enabled;
            _resultValue.region = region;
            _resultValue.requirePrivateNetworking = requirePrivateNetworking;
            _resultValue.roleId = roleId;
            _resultValue.secretAccessKey = secretAccessKey;
            _resultValue.valid = valid;
            return _resultValue;
        }
    }
}
