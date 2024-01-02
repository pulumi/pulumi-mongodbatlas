// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling {
    /**
     * @return Flag that indicates whether instance size auto-scaling is enabled.
     * 
     */
    private Boolean computeEnabled;
    /**
     * @return Maximum instance size to which your cluster can automatically scale (such as M40).
     * 
     */
    private String computeMaxInstanceSize;
    /**
     * @return Minimum instance size to which your cluster can automatically scale (such as M10).
     * 
     */
    private String computeMinInstanceSize;
    /**
     * @return Flag that indicates whether the instance size may scale down.
     * 
     */
    private Boolean computeScaleDownEnabled;
    /**
     * @return Flag that indicates whether this cluster enables disk auto-scaling.
     * 
     */
    private Boolean diskGbEnabled;

    private GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling() {}
    /**
     * @return Flag that indicates whether instance size auto-scaling is enabled.
     * 
     */
    public Boolean computeEnabled() {
        return this.computeEnabled;
    }
    /**
     * @return Maximum instance size to which your cluster can automatically scale (such as M40).
     * 
     */
    public String computeMaxInstanceSize() {
        return this.computeMaxInstanceSize;
    }
    /**
     * @return Minimum instance size to which your cluster can automatically scale (such as M10).
     * 
     */
    public String computeMinInstanceSize() {
        return this.computeMinInstanceSize;
    }
    /**
     * @return Flag that indicates whether the instance size may scale down.
     * 
     */
    public Boolean computeScaleDownEnabled() {
        return this.computeScaleDownEnabled;
    }
    /**
     * @return Flag that indicates whether this cluster enables disk auto-scaling.
     * 
     */
    public Boolean diskGbEnabled() {
        return this.diskGbEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean computeEnabled;
        private String computeMaxInstanceSize;
        private String computeMinInstanceSize;
        private Boolean computeScaleDownEnabled;
        private Boolean diskGbEnabled;
        public Builder() {}
        public Builder(GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnabled = defaults.computeEnabled;
    	      this.computeMaxInstanceSize = defaults.computeMaxInstanceSize;
    	      this.computeMinInstanceSize = defaults.computeMinInstanceSize;
    	      this.computeScaleDownEnabled = defaults.computeScaleDownEnabled;
    	      this.diskGbEnabled = defaults.diskGbEnabled;
        }

        @CustomType.Setter
        public Builder computeEnabled(Boolean computeEnabled) {
            if (computeEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling", "computeEnabled");
            }
            this.computeEnabled = computeEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder computeMaxInstanceSize(String computeMaxInstanceSize) {
            if (computeMaxInstanceSize == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling", "computeMaxInstanceSize");
            }
            this.computeMaxInstanceSize = computeMaxInstanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder computeMinInstanceSize(String computeMinInstanceSize) {
            if (computeMinInstanceSize == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling", "computeMinInstanceSize");
            }
            this.computeMinInstanceSize = computeMinInstanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder computeScaleDownEnabled(Boolean computeScaleDownEnabled) {
            if (computeScaleDownEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling", "computeScaleDownEnabled");
            }
            this.computeScaleDownEnabled = computeScaleDownEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder diskGbEnabled(Boolean diskGbEnabled) {
            if (diskGbEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling", "diskGbEnabled");
            }
            this.diskGbEnabled = diskGbEnabled;
            return this;
        }
        public GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling build() {
            final var _resultValue = new GetAdvancedClustersResultReplicationSpecRegionConfigAnalyticsAutoScaling();
            _resultValue.computeEnabled = computeEnabled;
            _resultValue.computeMaxInstanceSize = computeMaxInstanceSize;
            _resultValue.computeMinInstanceSize = computeMinInstanceSize;
            _resultValue.computeScaleDownEnabled = computeScaleDownEnabled;
            _resultValue.diskGbEnabled = diskGbEnabled;
            return _resultValue;
        }
    }
}
