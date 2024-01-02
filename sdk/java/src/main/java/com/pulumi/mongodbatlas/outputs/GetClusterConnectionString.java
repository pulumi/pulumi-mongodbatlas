// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetClusterConnectionStringPrivateEndpoint;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterConnectionString {
    private Map<String,Object> awsPrivateLink;
    private Map<String,Object> awsPrivateLinkSrv;
    private String private_;
    private List<GetClusterConnectionStringPrivateEndpoint> privateEndpoints;
    private String privateSrv;
    private String standard;
    private String standardSrv;

    private GetClusterConnectionString() {}
    public Map<String,Object> awsPrivateLink() {
        return this.awsPrivateLink;
    }
    public Map<String,Object> awsPrivateLinkSrv() {
        return this.awsPrivateLinkSrv;
    }
    public String private_() {
        return this.private_;
    }
    public List<GetClusterConnectionStringPrivateEndpoint> privateEndpoints() {
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

    public static Builder builder(GetClusterConnectionString defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,Object> awsPrivateLink;
        private Map<String,Object> awsPrivateLinkSrv;
        private String private_;
        private List<GetClusterConnectionStringPrivateEndpoint> privateEndpoints;
        private String privateSrv;
        private String standard;
        private String standardSrv;
        public Builder() {}
        public Builder(GetClusterConnectionString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsPrivateLink = defaults.awsPrivateLink;
    	      this.awsPrivateLinkSrv = defaults.awsPrivateLinkSrv;
    	      this.private_ = defaults.private_;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.privateSrv = defaults.privateSrv;
    	      this.standard = defaults.standard;
    	      this.standardSrv = defaults.standardSrv;
        }

        @CustomType.Setter
        public Builder awsPrivateLink(Map<String,Object> awsPrivateLink) {
            if (awsPrivateLink == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "awsPrivateLink");
            }
            this.awsPrivateLink = awsPrivateLink;
            return this;
        }
        @CustomType.Setter
        public Builder awsPrivateLinkSrv(Map<String,Object> awsPrivateLinkSrv) {
            if (awsPrivateLinkSrv == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "awsPrivateLinkSrv");
            }
            this.awsPrivateLinkSrv = awsPrivateLinkSrv;
            return this;
        }
        @CustomType.Setter("private")
        public Builder private_(String private_) {
            if (private_ == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "private_");
            }
            this.private_ = private_;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpoints(List<GetClusterConnectionStringPrivateEndpoint> privateEndpoints) {
            if (privateEndpoints == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "privateEndpoints");
            }
            this.privateEndpoints = privateEndpoints;
            return this;
        }
        public Builder privateEndpoints(GetClusterConnectionStringPrivateEndpoint... privateEndpoints) {
            return privateEndpoints(List.of(privateEndpoints));
        }
        @CustomType.Setter
        public Builder privateSrv(String privateSrv) {
            if (privateSrv == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "privateSrv");
            }
            this.privateSrv = privateSrv;
            return this;
        }
        @CustomType.Setter
        public Builder standard(String standard) {
            if (standard == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "standard");
            }
            this.standard = standard;
            return this;
        }
        @CustomType.Setter
        public Builder standardSrv(String standardSrv) {
            if (standardSrv == null) {
              throw new MissingRequiredPropertyException("GetClusterConnectionString", "standardSrv");
            }
            this.standardSrv = standardSrv;
            return this;
        }
        public GetClusterConnectionString build() {
            final var _resultValue = new GetClusterConnectionString();
            _resultValue.awsPrivateLink = awsPrivateLink;
            _resultValue.awsPrivateLinkSrv = awsPrivateLinkSrv;
            _resultValue.private_ = private_;
            _resultValue.privateEndpoints = privateEndpoints;
            _resultValue.privateSrv = privateSrv;
            _resultValue.standard = standard;
            _resultValue.standardSrv = standardSrv;
            return _resultValue;
        }
    }
}
