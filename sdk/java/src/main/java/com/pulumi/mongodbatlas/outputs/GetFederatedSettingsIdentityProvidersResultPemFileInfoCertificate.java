// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate {
    /**
     * @return Expiration  Date.
     * 
     */
    private String notAfter;
    /**
     * @return Start Date.
     * 
     */
    private String notBefore;

    private GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate() {}
    /**
     * @return Expiration  Date.
     * 
     */
    public String notAfter() {
        return this.notAfter;
    }
    /**
     * @return Start Date.
     * 
     */
    public String notBefore() {
        return this.notBefore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String notAfter;
        private String notBefore;
        public Builder() {}
        public Builder(GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
        }

        @CustomType.Setter
        public Builder notAfter(String notAfter) {
            if (notAfter == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate", "notAfter");
            }
            this.notAfter = notAfter;
            return this;
        }
        @CustomType.Setter
        public Builder notBefore(String notBefore) {
            if (notBefore == null) {
              throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate", "notBefore");
            }
            this.notBefore = notBefore;
            return this;
        }
        public GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate build() {
            final var _resultValue = new GetFederatedSettingsIdentityProvidersResultPemFileInfoCertificate();
            _resultValue.notAfter = notAfter;
            _resultValue.notBefore = notBefore;
            return _resultValue;
        }
    }
}
