// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamConnectionAuthentication {
    /**
     * @return Style of authentication. Can be one of `PLAIN`, `SCRAM-256`, or `SCRAM-512`.
     * 
     */
    private String mechanism;
    /**
     * @return Password of the account to connect to the Kafka cluster.
     * 
     */
    private String password;
    /**
     * @return Username of the account to connect to the Kafka cluster.
     * 
     */
    private String username;

    private GetStreamConnectionAuthentication() {}
    /**
     * @return Style of authentication. Can be one of `PLAIN`, `SCRAM-256`, or `SCRAM-512`.
     * 
     */
    public String mechanism() {
        return this.mechanism;
    }
    /**
     * @return Password of the account to connect to the Kafka cluster.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Username of the account to connect to the Kafka cluster.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamConnectionAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mechanism;
        private String password;
        private String username;
        public Builder() {}
        public Builder(GetStreamConnectionAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mechanism = defaults.mechanism;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder mechanism(String mechanism) {
            if (mechanism == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionAuthentication", "mechanism");
            }
            this.mechanism = mechanism;
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            if (password == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionAuthentication", "password");
            }
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionAuthentication", "username");
            }
            this.username = username;
            return this;
        }
        public GetStreamConnectionAuthentication build() {
            final var _resultValue = new GetStreamConnectionAuthentication();
            _resultValue.mechanism = mechanism;
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}