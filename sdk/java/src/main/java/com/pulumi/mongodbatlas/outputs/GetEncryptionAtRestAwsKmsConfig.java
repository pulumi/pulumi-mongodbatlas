// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEncryptionAtRestAwsKmsConfig {
    /**
     * @return Unique alphanumeric string that identifies an Identity and Access Management (IAM) access key with permissions required to access your Amazon Web Services (AWS) Customer Master Key (CMK).
     * 
     */
    private String accessKeyId;
    /**
     * @return Unique alphanumeric string that identifies the Amazon Web Services (AWS) Customer Master Key (CMK) you used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    private String customerMasterKeyId;
    /**
     * @return Flag that indicates whether someone enabled encryption at rest for the specified project through Amazon Web Services (AWS) Key Management Service (KMS). To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
     * 
     */
    private Boolean enabled;
    /**
     * @return Physical location where MongoDB Atlas deploys your AWS-hosted MongoDB cluster nodes. The region you choose can affect network latency for clients accessing your databases. When MongoDB Atlas deploys a dedicated cluster, it checks if a VPC or VPC connection exists for that provider and region. If not, MongoDB Atlas creates them as part of the deployment. MongoDB Atlas assigns the VPC a CIDR block. To limit a new VPC peering connection to one CIDR block and region, create the connection first. Deploy the cluster after the connection starts.
     * 
     */
    private String region;
    /**
     * @return Unique 24-hexadecimal digit string that identifies an Amazon Web Services (AWS) Identity and Access Management (IAM) role. This IAM role has the permissions required to manage your AWS customer master key.
     * 
     */
    private String roleId;
    /**
     * @return Human-readable label of the Identity and Access Management (IAM) secret access key with permissions required to access your Amazon Web Services (AWS) customer master key.
     * 
     */
    private String secretAccessKey;
    /**
     * @return Flag that indicates whether the Amazon Web Services (AWS) Key Management Service (KMS) encryption key can encrypt and decrypt data.
     * 
     */
    private Boolean valid;

    private GetEncryptionAtRestAwsKmsConfig() {}
    /**
     * @return Unique alphanumeric string that identifies an Identity and Access Management (IAM) access key with permissions required to access your Amazon Web Services (AWS) Customer Master Key (CMK).
     * 
     */
    public String accessKeyId() {
        return this.accessKeyId;
    }
    /**
     * @return Unique alphanumeric string that identifies the Amazon Web Services (AWS) Customer Master Key (CMK) you used to encrypt and decrypt the MongoDB master keys.
     * 
     */
    public String customerMasterKeyId() {
        return this.customerMasterKeyId;
    }
    /**
     * @return Flag that indicates whether someone enabled encryption at rest for the specified project through Amazon Web Services (AWS) Key Management Service (KMS). To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Physical location where MongoDB Atlas deploys your AWS-hosted MongoDB cluster nodes. The region you choose can affect network latency for clients accessing your databases. When MongoDB Atlas deploys a dedicated cluster, it checks if a VPC or VPC connection exists for that provider and region. If not, MongoDB Atlas creates them as part of the deployment. MongoDB Atlas assigns the VPC a CIDR block. To limit a new VPC peering connection to one CIDR block and region, create the connection first. Deploy the cluster after the connection starts.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies an Amazon Web Services (AWS) Identity and Access Management (IAM) role. This IAM role has the permissions required to manage your AWS customer master key.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    /**
     * @return Human-readable label of the Identity and Access Management (IAM) secret access key with permissions required to access your Amazon Web Services (AWS) customer master key.
     * 
     */
    public String secretAccessKey() {
        return this.secretAccessKey;
    }
    /**
     * @return Flag that indicates whether the Amazon Web Services (AWS) Key Management Service (KMS) encryption key can encrypt and decrypt data.
     * 
     */
    public Boolean valid() {
        return this.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionAtRestAwsKmsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKeyId;
        private String customerMasterKeyId;
        private Boolean enabled;
        private String region;
        private String roleId;
        private String secretAccessKey;
        private Boolean valid;
        public Builder() {}
        public Builder(GetEncryptionAtRestAwsKmsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.customerMasterKeyId = defaults.customerMasterKeyId;
    	      this.enabled = defaults.enabled;
    	      this.region = defaults.region;
    	      this.roleId = defaults.roleId;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.valid = defaults.valid;
        }

        @CustomType.Setter
        public Builder accessKeyId(String accessKeyId) {
            if (accessKeyId == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "accessKeyId");
            }
            this.accessKeyId = accessKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder customerMasterKeyId(String customerMasterKeyId) {
            if (customerMasterKeyId == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "customerMasterKeyId");
            }
            this.customerMasterKeyId = customerMasterKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder secretAccessKey(String secretAccessKey) {
            if (secretAccessKey == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "secretAccessKey");
            }
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        @CustomType.Setter
        public Builder valid(Boolean valid) {
            if (valid == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestAwsKmsConfig", "valid");
            }
            this.valid = valid;
            return this;
        }
        public GetEncryptionAtRestAwsKmsConfig build() {
            final var _resultValue = new GetEncryptionAtRestAwsKmsConfig();
            _resultValue.accessKeyId = accessKeyId;
            _resultValue.customerMasterKeyId = customerMasterKeyId;
            _resultValue.enabled = enabled;
            _resultValue.region = region;
            _resultValue.roleId = roleId;
            _resultValue.secretAccessKey = secretAccessKey;
            _resultValue.valid = valid;
            return _resultValue;
        }
    }
}
