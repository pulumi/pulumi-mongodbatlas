// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterConnectionStringPrivateEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedClusterConnectionString {
    private @Nullable String private_;
    private @Nullable List<AdvancedClusterConnectionStringPrivateEndpoint> privateEndpoints;
    private @Nullable String privateSrv;
    private @Nullable String standard;
    private @Nullable String standardSrv;

    private AdvancedClusterConnectionString() {}
    public Optional<String> private_() {
        return Optional.ofNullable(this.private_);
    }
    public List<AdvancedClusterConnectionStringPrivateEndpoint> privateEndpoints() {
        return this.privateEndpoints == null ? List.of() : this.privateEndpoints;
    }
    public Optional<String> privateSrv() {
        return Optional.ofNullable(this.privateSrv);
    }
    public Optional<String> standard() {
        return Optional.ofNullable(this.standard);
    }
    public Optional<String> standardSrv() {
        return Optional.ofNullable(this.standardSrv);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedClusterConnectionString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String private_;
        private @Nullable List<AdvancedClusterConnectionStringPrivateEndpoint> privateEndpoints;
        private @Nullable String privateSrv;
        private @Nullable String standard;
        private @Nullable String standardSrv;
        public Builder() {}
        public Builder(AdvancedClusterConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.private_ = defaults.private_;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.privateSrv = defaults.privateSrv;
    	      this.standard = defaults.standard;
    	      this.standardSrv = defaults.standardSrv;
        }

        @CustomType.Setter("private")
        public Builder private_(@Nullable String private_) {
            this.private_ = private_;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpoints(@Nullable List<AdvancedClusterConnectionStringPrivateEndpoint> privateEndpoints) {
            this.privateEndpoints = privateEndpoints;
            return this;
        }
        public Builder privateEndpoints(AdvancedClusterConnectionStringPrivateEndpoint... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }
        @CustomType.Setter
        public Builder privateSrv(@Nullable String privateSrv) {
            this.privateSrv = privateSrv;
            return this;
        }
        @CustomType.Setter
        public Builder standard(@Nullable String standard) {
            this.standard = standard;
            return this;
        }
        @CustomType.Setter
        public Builder standardSrv(@Nullable String standardSrv) {
            this.standardSrv = standardSrv;
            return this;
        }
        public AdvancedClusterConnectionString build() {
            final var o = new AdvancedClusterConnectionString();
            o.private_ = private_;
            o.privateEndpoints = privateEndpoints;
            o.privateSrv = privateSrv;
            o.standard = standard;
            o.standardSrv = standardSrv;
            return o;
        }
    }
}
