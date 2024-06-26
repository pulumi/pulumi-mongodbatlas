// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs {
    /**
     * @return Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster.
     * 
     */
    private @Nullable Integer diskIops;
    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster. Valid values are:
     * * `STANDARD` volume types can&#39;t exceed the default IOPS rate for the selected volume size.
     * * `PROVISIONED` volume types must fall within the allowable IOPS range for the selected volume size.
     * 
     */
    private @Nullable String ebsVolumeType;
    /**
     * @return Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
     * 
     */
    private String instanceSize;
    /**
     * @return Number of nodes of the given type for MongoDB Atlas to deploy to the region.
     * 
     */
    private @Nullable Integer nodeCount;

    private AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs() {}
    /**
     * @return Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster.
     * 
     */
    public Optional<Integer> diskIops() {
        return Optional.ofNullable(this.diskIops);
    }
    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster. Valid values are:
     * * `STANDARD` volume types can&#39;t exceed the default IOPS rate for the selected volume size.
     * * `PROVISIONED` volume types must fall within the allowable IOPS range for the selected volume size.
     * 
     */
    public Optional<String> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }
    /**
     * @return Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
     * 
     */
    public String instanceSize() {
        return this.instanceSize;
    }
    /**
     * @return Number of nodes of the given type for MongoDB Atlas to deploy to the region.
     * 
     */
    public Optional<Integer> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer diskIops;
        private @Nullable String ebsVolumeType;
        private String instanceSize;
        private @Nullable Integer nodeCount;
        public Builder() {}
        public Builder(AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs defaults) {
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
            if (instanceSize == null) {
              throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs", "instanceSize");
            }
            this.instanceSize = instanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(@Nullable Integer nodeCount) {

            this.nodeCount = nodeCount;
            return this;
        }
        public AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs build() {
            final var _resultValue = new AdvancedClusterReplicationSpecRegionConfigReadOnlySpecs();
            _resultValue.diskIops = diskIops;
            _resultValue.ebsVolumeType = ebsVolumeType;
            _resultValue.instanceSize = instanceSize;
            _resultValue.nodeCount = nodeCount;
            return _resultValue;
        }
    }
}
