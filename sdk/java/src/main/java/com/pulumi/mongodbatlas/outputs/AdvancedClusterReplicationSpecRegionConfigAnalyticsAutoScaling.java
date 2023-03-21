// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling {
    /**
     * @return Flag that indicates whether instance size auto-scaling is enabled. This parameter defaults to false.
     * 
     */
    private @Nullable Boolean computeEnabled;
    /**
     * @return Maximum instance size to which your cluster can automatically scale (such as M40). Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_enabled` is true.
     * 
     */
    private @Nullable String computeMaxInstanceSize;
    /**
     * @return Minimum instance size to which your cluster can automatically scale (such as M10). Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_scale_down_enabled` is true.
     * 
     */
    private @Nullable String computeMinInstanceSize;
    /**
     * @return Flag that indicates whether the instance size may scale down. Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_enabled` : true. If you enable this option, specify a value for `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_min_instance_size`.
     * 
     */
    private @Nullable Boolean computeScaleDownEnabled;
    /**
     * @return Flag that indicates whether this cluster enables disk auto-scaling. This parameter defaults to true.
     * 
     */
    private @Nullable Boolean diskGbEnabled;

    private AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling() {}
    /**
     * @return Flag that indicates whether instance size auto-scaling is enabled. This parameter defaults to false.
     * 
     */
    public Optional<Boolean> computeEnabled() {
        return Optional.ofNullable(this.computeEnabled);
    }
    /**
     * @return Maximum instance size to which your cluster can automatically scale (such as M40). Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_enabled` is true.
     * 
     */
    public Optional<String> computeMaxInstanceSize() {
        return Optional.ofNullable(this.computeMaxInstanceSize);
    }
    /**
     * @return Minimum instance size to which your cluster can automatically scale (such as M10). Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_scale_down_enabled` is true.
     * 
     */
    public Optional<String> computeMinInstanceSize() {
        return Optional.ofNullable(this.computeMinInstanceSize);
    }
    /**
     * @return Flag that indicates whether the instance size may scale down. Atlas requires this parameter if `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_enabled` : true. If you enable this option, specify a value for `replication_specs.#.region_configs.#.analytics_auto_scaling.0.compute_min_instance_size`.
     * 
     */
    public Optional<Boolean> computeScaleDownEnabled() {
        return Optional.ofNullable(this.computeScaleDownEnabled);
    }
    /**
     * @return Flag that indicates whether this cluster enables disk auto-scaling. This parameter defaults to true.
     * 
     */
    public Optional<Boolean> diskGbEnabled() {
        return Optional.ofNullable(this.diskGbEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean computeEnabled;
        private @Nullable String computeMaxInstanceSize;
        private @Nullable String computeMinInstanceSize;
        private @Nullable Boolean computeScaleDownEnabled;
        private @Nullable Boolean diskGbEnabled;
        public Builder() {}
        public Builder(AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnabled = defaults.computeEnabled;
    	      this.computeMaxInstanceSize = defaults.computeMaxInstanceSize;
    	      this.computeMinInstanceSize = defaults.computeMinInstanceSize;
    	      this.computeScaleDownEnabled = defaults.computeScaleDownEnabled;
    	      this.diskGbEnabled = defaults.diskGbEnabled;
        }

        @CustomType.Setter
        public Builder computeEnabled(@Nullable Boolean computeEnabled) {
            this.computeEnabled = computeEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder computeMaxInstanceSize(@Nullable String computeMaxInstanceSize) {
            this.computeMaxInstanceSize = computeMaxInstanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder computeMinInstanceSize(@Nullable String computeMinInstanceSize) {
            this.computeMinInstanceSize = computeMinInstanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder computeScaleDownEnabled(@Nullable Boolean computeScaleDownEnabled) {
            this.computeScaleDownEnabled = computeScaleDownEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder diskGbEnabled(@Nullable Boolean diskGbEnabled) {
            this.diskGbEnabled = diskGbEnabled;
            return this;
        }
        public AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling build() {
            final var o = new AdvancedClusterReplicationSpecRegionConfigAnalyticsAutoScaling();
            o.computeEnabled = computeEnabled;
            o.computeMaxInstanceSize = computeMaxInstanceSize;
            o.computeMinInstanceSize = computeMinInstanceSize;
            o.computeScaleDownEnabled = computeScaleDownEnabled;
            o.diskGbEnabled = diskGbEnabled;
            return o;
        }
    }
}