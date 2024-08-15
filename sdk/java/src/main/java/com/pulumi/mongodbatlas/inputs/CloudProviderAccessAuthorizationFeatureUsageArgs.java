// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudProviderAccessAuthorizationFeatureUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudProviderAccessAuthorizationFeatureUsageArgs Empty = new CloudProviderAccessAuthorizationFeatureUsageArgs();

    @Import(name="featureId")
    private @Nullable Output<Map<String,String>> featureId;

    public Optional<Output<Map<String,String>>> featureId() {
        return Optional.ofNullable(this.featureId);
    }

    @Import(name="featureType")
    private @Nullable Output<String> featureType;

    public Optional<Output<String>> featureType() {
        return Optional.ofNullable(this.featureType);
    }

    private CloudProviderAccessAuthorizationFeatureUsageArgs() {}

    private CloudProviderAccessAuthorizationFeatureUsageArgs(CloudProviderAccessAuthorizationFeatureUsageArgs $) {
        this.featureId = $.featureId;
        this.featureType = $.featureType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudProviderAccessAuthorizationFeatureUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudProviderAccessAuthorizationFeatureUsageArgs $;

        public Builder() {
            $ = new CloudProviderAccessAuthorizationFeatureUsageArgs();
        }

        public Builder(CloudProviderAccessAuthorizationFeatureUsageArgs defaults) {
            $ = new CloudProviderAccessAuthorizationFeatureUsageArgs(Objects.requireNonNull(defaults));
        }

        public Builder featureId(@Nullable Output<Map<String,String>> featureId) {
            $.featureId = featureId;
            return this;
        }

        public Builder featureId(Map<String,String> featureId) {
            return featureId(Output.of(featureId));
        }

        public Builder featureType(@Nullable Output<String> featureType) {
            $.featureType = featureType;
            return this;
        }

        public Builder featureType(String featureType) {
            return featureType(Output.of(featureType));
        }

        public CloudProviderAccessAuthorizationFeatureUsageArgs build() {
            return $;
        }
    }

}
