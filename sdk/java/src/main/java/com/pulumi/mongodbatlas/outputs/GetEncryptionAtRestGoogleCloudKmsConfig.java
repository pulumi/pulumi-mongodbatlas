// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEncryptionAtRestGoogleCloudKmsConfig {
    /**
     * @return Flag that indicates whether someone enabled encryption at rest for the specified  project. To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
     * 
     */
    private Boolean enabled;
    /**
     * @return Resource path that displays the key version resource ID for your Google Cloud KMS.
     * 
     */
    private String keyVersionResourceId;
    /**
     * @return JavaScript Object Notation (JSON) object that contains the Google Cloud Key Management Service (KMS). Format the JSON as a string and not as an object.
     * 
     */
    private String serviceAccountKey;
    /**
     * @return Flag that indicates whether the Google Cloud Key Management Service (KMS) encryption key can encrypt and decrypt data.
     * 
     */
    private Boolean valid;

    private GetEncryptionAtRestGoogleCloudKmsConfig() {}
    /**
     * @return Flag that indicates whether someone enabled encryption at rest for the specified  project. To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Resource path that displays the key version resource ID for your Google Cloud KMS.
     * 
     */
    public String keyVersionResourceId() {
        return this.keyVersionResourceId;
    }
    /**
     * @return JavaScript Object Notation (JSON) object that contains the Google Cloud Key Management Service (KMS). Format the JSON as a string and not as an object.
     * 
     */
    public String serviceAccountKey() {
        return this.serviceAccountKey;
    }
    /**
     * @return Flag that indicates whether the Google Cloud Key Management Service (KMS) encryption key can encrypt and decrypt data.
     * 
     */
    public Boolean valid() {
        return this.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionAtRestGoogleCloudKmsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String keyVersionResourceId;
        private String serviceAccountKey;
        private Boolean valid;
        public Builder() {}
        public Builder(GetEncryptionAtRestGoogleCloudKmsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyVersionResourceId = defaults.keyVersionResourceId;
    	      this.serviceAccountKey = defaults.serviceAccountKey;
    	      this.valid = defaults.valid;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestGoogleCloudKmsConfig", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder keyVersionResourceId(String keyVersionResourceId) {
            if (keyVersionResourceId == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestGoogleCloudKmsConfig", "keyVersionResourceId");
            }
            this.keyVersionResourceId = keyVersionResourceId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountKey(String serviceAccountKey) {
            if (serviceAccountKey == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestGoogleCloudKmsConfig", "serviceAccountKey");
            }
            this.serviceAccountKey = serviceAccountKey;
            return this;
        }
        @CustomType.Setter
        public Builder valid(Boolean valid) {
            if (valid == null) {
              throw new MissingRequiredPropertyException("GetEncryptionAtRestGoogleCloudKmsConfig", "valid");
            }
            this.valid = valid;
            return this;
        }
        public GetEncryptionAtRestGoogleCloudKmsConfig build() {
            final var _resultValue = new GetEncryptionAtRestGoogleCloudKmsConfig();
            _resultValue.enabled = enabled;
            _resultValue.keyVersionResourceId = keyVersionResourceId;
            _resultValue.serviceAccountKey = serviceAccountKey;
            _resultValue.valid = valid;
            return _resultValue;
        }
    }
}