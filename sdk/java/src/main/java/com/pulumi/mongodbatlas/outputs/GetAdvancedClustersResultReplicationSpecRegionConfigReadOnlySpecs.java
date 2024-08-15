// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs {
    /**
     * @return Target IOPS (Input/Output Operations Per Second) desired for storage attached to this hardware. This parameter defaults to the cluster tier&#39;s standard IOPS value.
     * 
     */
    private Integer diskIops;
    /**
     * @return Storage capacity that the host&#39;s root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
     * 
     */
    private Double diskSizeGb;
    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster.
     * * `STANDARD` volume types can&#39;t exceed the default IOPS rate for the selected volume size.
     * * `PROVISIONED` volume types must fall within the allowable IOPS range for the selected volume size.
     * 
     */
    private String ebsVolumeType;
    /**
     * @return Hardware specification for the instance sizes in this region.
     * 
     */
    private String instanceSize;
    /**
     * @return Number of nodes of the given type for MongoDB Atlas to deploy to the region.
     * 
     */
    private @Nullable Integer nodeCount;

    private GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs() {}
    /**
     * @return Target IOPS (Input/Output Operations Per Second) desired for storage attached to this hardware. This parameter defaults to the cluster tier&#39;s standard IOPS value.
     * 
     */
    public Integer diskIops() {
        return this.diskIops;
    }
    /**
     * @return Storage capacity that the host&#39;s root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
     * 
     */
    public Double diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster.
     * * `STANDARD` volume types can&#39;t exceed the default IOPS rate for the selected volume size.
     * * `PROVISIONED` volume types must fall within the allowable IOPS range for the selected volume size.
     * 
     */
    public String ebsVolumeType() {
        return this.ebsVolumeType;
    }
    /**
     * @return Hardware specification for the instance sizes in this region.
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

    public static Builder builder(GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer diskIops;
        private Double diskSizeGb;
        private String ebsVolumeType;
        private String instanceSize;
        private @Nullable Integer nodeCount;
        public Builder() {}
        public Builder(GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskIops = defaults.diskIops;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.ebsVolumeType = defaults.ebsVolumeType;
    	      this.instanceSize = defaults.instanceSize;
    	      this.nodeCount = defaults.nodeCount;
        }

        @CustomType.Setter
        public Builder diskIops(Integer diskIops) {
            if (diskIops == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs", "diskIops");
            }
            this.diskIops = diskIops;
            return this;
        }
        @CustomType.Setter
        public Builder diskSizeGb(Double diskSizeGb) {
            if (diskSizeGb == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs", "diskSizeGb");
            }
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder ebsVolumeType(String ebsVolumeType) {
            if (ebsVolumeType == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs", "ebsVolumeType");
            }
            this.ebsVolumeType = ebsVolumeType;
            return this;
        }
        @CustomType.Setter
        public Builder instanceSize(String instanceSize) {
            if (instanceSize == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs", "instanceSize");
            }
            this.instanceSize = instanceSize;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(@Nullable Integer nodeCount) {

            this.nodeCount = nodeCount;
            return this;
        }
        public GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs build() {
            final var _resultValue = new GetAdvancedClustersResultReplicationSpecRegionConfigReadOnlySpecs();
            _resultValue.diskIops = diskIops;
            _resultValue.diskSizeGb = diskSizeGb;
            _resultValue.ebsVolumeType = ebsVolumeType;
            _resultValue.instanceSize = instanceSize;
            _resultValue.nodeCount = nodeCount;
            return _resultValue;
        }
    }
}
