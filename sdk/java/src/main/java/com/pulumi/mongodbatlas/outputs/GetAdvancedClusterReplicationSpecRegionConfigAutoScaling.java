// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAdvancedClusterReplicationSpecRegionConfigAutoScaling {
    /**
     * @return Flag that indicates whether instance size auto-scaling is enabled.
     * 
     */
    private Boolean computeEnabled;
    /**
     * @return Maximum instance size to which your cluster can automatically scale (such as M40).
     * #### Advanced Configuration
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

    private GetAdvancedClusterReplicationSpecRegionConfigAutoScaling() {}
    /**
     * @return Flag that indicates whether instance size auto-scaling is enabled.
     * 
     */
    public Boolean computeEnabled() {
        return this.computeEnabled;
    }
    /**
     * @return Maximum instance size to which your cluster can automatically scale (such as M40).
     * #### Advanced Configuration
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

    public static Builder builder(GetAdvancedClusterReplicationSpecRegionConfigAutoScaling defaults) {
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
        public Builder(GetAdvancedClusterReplicationSpecRegionConfigAutoScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnabled = defaults.computeEnabled;
    	      this.computeMaxInstanceSize = defaults.computeMaxInstanceSize;
    	      this.computeMinInstanceSize = defaults.computeMinInstanceSize;
    	      this.computeScaleDownEnabled = defaults.computeScaleDownEnabled;
    	      this.diskGbEnabled = defaults.diskGbEnabled;
        }

        @CustomType.Setter
        public Builder computeEnabled(Boolean computeEnabled) {
            this.computeEnabled = Objects.requireNonNull(computeEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder computeMaxInstanceSize(String computeMaxInstanceSize) {
            this.computeMaxInstanceSize = Objects.requireNonNull(computeMaxInstanceSize);
            return this;
        }
        @CustomType.Setter
        public Builder computeMinInstanceSize(String computeMinInstanceSize) {
            this.computeMinInstanceSize = Objects.requireNonNull(computeMinInstanceSize);
            return this;
        }
        @CustomType.Setter
        public Builder computeScaleDownEnabled(Boolean computeScaleDownEnabled) {
            this.computeScaleDownEnabled = Objects.requireNonNull(computeScaleDownEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder diskGbEnabled(Boolean diskGbEnabled) {
            this.diskGbEnabled = Objects.requireNonNull(diskGbEnabled);
            return this;
        }
        public GetAdvancedClusterReplicationSpecRegionConfigAutoScaling build() {
            final var o = new GetAdvancedClusterReplicationSpecRegionConfigAutoScaling();
            o.computeEnabled = computeEnabled;
            o.computeMaxInstanceSize = computeMaxInstanceSize;
            o.computeMinInstanceSize = computeMinInstanceSize;
            o.computeScaleDownEnabled = computeScaleDownEnabled;
            o.diskGbEnabled = diskGbEnabled;
            return o;
        }
    }
}
