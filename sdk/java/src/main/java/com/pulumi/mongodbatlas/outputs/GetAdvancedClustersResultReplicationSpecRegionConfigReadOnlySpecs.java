// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs {
    /**
     * @return Target throughput (IOPS) desired for AWS storage attached to your cluster.
     * 
     */
    private @Nullable Integer diskIops;
    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster.
     * 
     */
    private @Nullable String ebsVolumeType;
    /**
     * @return Hardware specification for the instance sizes in this region.
     * 
     */
    private String instanceSize;
    /**
     * @return Number of read-only nodes for Atlas to deploy to the region.
     * 
     */
    private @Nullable Integer nodeCount;

    private GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs() {}
    /**
     * @return Target throughput (IOPS) desired for AWS storage attached to your cluster.
     * 
     */
    public Optional<Integer> diskIops() {
        return Optional.ofNullable(this.diskIops);
    }
    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster.
     * 
     */
    public Optional<String> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }
    /**
     * @return Hardware specification for the instance sizes in this region.
     * 
     */
    public String instanceSize() {
        return this.instanceSize;
    }
    /**
     * @return Number of read-only nodes for Atlas to deploy to the region.
     * 
     */
    public Optional<Integer> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer diskIops;
        private @Nullable String ebsVolumeType;
        private String instanceSize;
        private @Nullable Integer nodeCount;
        public Builder() {}
        public Builder(GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskIops = defaults.diskIops;
    	      this.ebsVolumeType = defaults.ebsVolumeType;
    	      this.instanceSize = defaults.instanceSize;
    	      this.nodeCount = defaults.nodeCount;
        }

        @CustomType.Setter
        public Builder diskIops(@Nullable Integer diskIops) {
            this.diskIops = diskIops;
            return this;
        }
        @CustomType.Setter
        public Builder ebsVolumeType(@Nullable String ebsVolumeType) {
            this.ebsVolumeType = ebsVolumeType;
            return this;
        }
        @CustomType.Setter
        public Builder instanceSize(String instanceSize) {
            this.instanceSize = Objects.requireNonNull(instanceSize);
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs build() {
            final var o = new GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs();
            o.diskIops = diskIops;
            o.ebsVolumeType = ebsVolumeType;
            o.instanceSize = instanceSize;
            o.nodeCount = nodeCount;
            return o;
        }
    }
}
