// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GlobalClusterConfigCustomZoneMapping {
    private @Nullable String location;
    private @Nullable String zone;

    private GlobalClusterConfigCustomZoneMapping() {}
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalClusterConfigCustomZoneMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String location;
        private @Nullable String zone;
        public Builder() {}
        public Builder(GlobalClusterConfigCustomZoneMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder location(@Nullable String location) {

            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {

            this.zone = zone;
            return this;
        }
        public GlobalClusterConfigCustomZoneMapping build() {
            final var _resultValue = new GlobalClusterConfigCustomZoneMapping();
            _resultValue.location = location;
            _resultValue.zone = zone;
            return _resultValue;
        }
    }
}