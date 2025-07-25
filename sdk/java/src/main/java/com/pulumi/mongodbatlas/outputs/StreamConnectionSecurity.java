// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamConnectionSecurity {
    /**
     * @return A trusted, public x509 certificate for connecting to Kafka over SSL. String value of the certificate must be defined in the attribute.
     * 
     */
    private @Nullable String brokerPublicCertificate;
    /**
     * @return Describes the transport type. Can be either `SASL_PLAINTEXT` or `SASL_SSL`.
     * 
     */
    private @Nullable String protocol;

    private StreamConnectionSecurity() {}
    /**
     * @return A trusted, public x509 certificate for connecting to Kafka over SSL. String value of the certificate must be defined in the attribute.
     * 
     */
    public Optional<String> brokerPublicCertificate() {
        return Optional.ofNullable(this.brokerPublicCertificate);
    }
    /**
     * @return Describes the transport type. Can be either `SASL_PLAINTEXT` or `SASL_SSL`.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConnectionSecurity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String brokerPublicCertificate;
        private @Nullable String protocol;
        public Builder() {}
        public Builder(StreamConnectionSecurity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerPublicCertificate = defaults.brokerPublicCertificate;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder brokerPublicCertificate(@Nullable String brokerPublicCertificate) {

            this.brokerPublicCertificate = brokerPublicCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(@Nullable String protocol) {

            this.protocol = protocol;
            return this;
        }
        public StreamConnectionSecurity build() {
            final var _resultValue = new StreamConnectionSecurity();
            _resultValue.brokerPublicCertificate = brokerPublicCertificate;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
