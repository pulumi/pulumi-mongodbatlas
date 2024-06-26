// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamConnectionAuthentication {
    /**
     * @return Style of authentication. Can be one of `PLAIN`, `SCRAM-256`, or `SCRAM-512`.
     * 
     */
    private @Nullable String mechanism;
    /**
     * @return Password of the account to connect to the Kafka cluster.
     * 
     */
    private @Nullable String password;
    /**
     * @return Username of the account to connect to the Kafka cluster.
     * 
     */
    private @Nullable String username;

    private StreamConnectionAuthentication() {}
    /**
     * @return Style of authentication. Can be one of `PLAIN`, `SCRAM-256`, or `SCRAM-512`.
     * 
     */
    public Optional<String> mechanism() {
        return Optional.ofNullable(this.mechanism);
    }
    /**
     * @return Password of the account to connect to the Kafka cluster.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Username of the account to connect to the Kafka cluster.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConnectionAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String mechanism;
        private @Nullable String password;
        private @Nullable String username;
        public Builder() {}
        public Builder(StreamConnectionAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mechanism = defaults.mechanism;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder mechanism(@Nullable String mechanism) {

            this.mechanism = mechanism;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {

            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {

            this.username = username;
            return this;
        }
        public StreamConnectionAuthentication build() {
            final var _resultValue = new StreamConnectionAuthentication();
            _resultValue.mechanism = mechanism;
            _resultValue.password = password;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
