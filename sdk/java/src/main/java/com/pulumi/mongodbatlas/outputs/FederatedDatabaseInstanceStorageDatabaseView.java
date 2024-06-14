// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FederatedDatabaseInstanceStorageDatabaseView {
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    private @Nullable String name;
    private @Nullable String pipeline;
    private @Nullable String source;

    private FederatedDatabaseInstanceStorageDatabaseView() {}
    /**
     * @return Name of the Atlas Federated Database Instance.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> pipeline() {
        return Optional.ofNullable(this.pipeline);
    }
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FederatedDatabaseInstanceStorageDatabaseView defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String pipeline;
        private @Nullable String source;
        public Builder() {}
        public Builder(FederatedDatabaseInstanceStorageDatabaseView defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.pipeline = defaults.pipeline;
    	      this.source = defaults.source;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder pipeline(@Nullable String pipeline) {

            this.pipeline = pipeline;
            return this;
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {

            this.source = source;
            return this;
        }
        public FederatedDatabaseInstanceStorageDatabaseView build() {
            final var _resultValue = new FederatedDatabaseInstanceStorageDatabaseView();
            _resultValue.name = name;
            _resultValue.pipeline = pipeline;
            _resultValue.source = source;
            return _resultValue;
        }
    }
}