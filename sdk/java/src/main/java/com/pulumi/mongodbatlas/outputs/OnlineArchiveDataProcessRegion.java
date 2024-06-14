// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OnlineArchiveDataProcessRegion {
    /**
     * @return Human-readable label that identifies the Cloud service provider where you wish to store your archived data. `AZURE` may be selected only if Azure is the Cloud service provider for the cluster and no AWS online archive has been created for the cluster.
     * 
     */
    private @Nullable String cloudProvider;
    /**
     * @return Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
     * 
     */
    private @Nullable String region;

    private OnlineArchiveDataProcessRegion() {}
    /**
     * @return Human-readable label that identifies the Cloud service provider where you wish to store your archived data. `AZURE` may be selected only if Azure is the Cloud service provider for the cluster and no AWS online archive has been created for the cluster.
     * 
     */
    public Optional<String> cloudProvider() {
        return Optional.ofNullable(this.cloudProvider);
    }
    /**
     * @return Human-readable label that identifies the geographic location of the region where you wish to store your archived data. For allowed values, see [MongoDB Atlas API documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Online-Archive/operation/createOnlineArchive)
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineArchiveDataProcessRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cloudProvider;
        private @Nullable String region;
        public Builder() {}
        public Builder(OnlineArchiveDataProcessRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProvider = defaults.cloudProvider;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder cloudProvider(@Nullable String cloudProvider) {

            this.cloudProvider = cloudProvider;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public OnlineArchiveDataProcessRegion build() {
            final var _resultValue = new OnlineArchiveDataProcessRegion();
            _resultValue.cloudProvider = cloudProvider;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}