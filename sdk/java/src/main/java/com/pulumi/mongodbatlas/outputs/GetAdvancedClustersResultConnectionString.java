// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultConnectionStringPrivateEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersResultConnectionString {
    private String private_;
    private List<GetAdvancedClustersResultConnectionStringPrivateEndpoint> privateEndpoints;
    private String privateSrv;
    private String standard;
    private String standardSrv;

    private GetAdvancedClustersResultConnectionString() {}
    public String private_() {
        return this.private_;
    }
    public List<GetAdvancedClustersResultConnectionStringPrivateEndpoint> privateEndpoints() {
        return this.privateEndpoints;
    }
    public String privateSrv() {
        return this.privateSrv;
    }
    public String standard() {
        return this.standard;
    }
    public String standardSrv() {
        return this.standardSrv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultConnectionString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String private_;
        private List<GetAdvancedClustersResultConnectionStringPrivateEndpoint> privateEndpoints;
        private String privateSrv;
        private String standard;
        private String standardSrv;
        public Builder() {}
        public Builder(GetAdvancedClustersResultConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.private_ = defaults.private_;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.privateSrv = defaults.privateSrv;
    	      this.standard = defaults.standard;
    	      this.standardSrv = defaults.standardSrv;
        }

        @CustomType.Setter("private")
        public Builder private_(String private_) {
            this.private_ = Objects.requireNonNull(private_);
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpoints(List<GetAdvancedClustersResultConnectionStringPrivateEndpoint> privateEndpoints) {
            this.privateEndpoints = Objects.requireNonNull(privateEndpoints);
            return this;
        }
        public Builder privateEndpoints(GetAdvancedClustersResultConnectionStringPrivateEndpoint... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }
        @CustomType.Setter
        public Builder privateSrv(String privateSrv) {
            this.privateSrv = Objects.requireNonNull(privateSrv);
            return this;
        }
        @CustomType.Setter
        public Builder standard(String standard) {
            this.standard = Objects.requireNonNull(standard);
            return this;
        }
        @CustomType.Setter
        public Builder standardSrv(String standardSrv) {
            this.standardSrv = Objects.requireNonNull(standardSrv);
            return this;
        }
        public GetAdvancedClustersResultConnectionString build() {
            final var o = new GetAdvancedClustersResultConnectionString();
            o.private_ = private_;
            o.privateEndpoints = privateEndpoints;
            o.privateSrv = privateSrv;
            o.standard = standard;
            o.standardSrv = standardSrv;
            return o;
        }
    }
}
