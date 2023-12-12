// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOnlineArchivesResultDataProcessRegion {
    private String cloudProvider;
    private String region;

    private GetOnlineArchivesResultDataProcessRegion() {}
    public String cloudProvider() {
        return this.cloudProvider;
    }
    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineArchivesResultDataProcessRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudProvider;
        private String region;
        public Builder() {}
        public Builder(GetOnlineArchivesResultDataProcessRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder cloudProvider(String cloudProvider) {
            this.cloudProvider = Objects.requireNonNull(cloudProvider);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetOnlineArchivesResultDataProcessRegion build() {
            final var _resultValue = new GetOnlineArchivesResultDataProcessRegion();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
