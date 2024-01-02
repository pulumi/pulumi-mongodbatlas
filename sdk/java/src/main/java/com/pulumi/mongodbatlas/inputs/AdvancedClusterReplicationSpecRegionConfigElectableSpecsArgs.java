// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs Empty = new AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs();

    /**
     * Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster.
     * 
     */
    @Import(name="diskIops")
    private @Nullable Output<Integer> diskIops;

    /**
     * @return Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster.
     * 
     */
    public Optional<Output<Integer>> diskIops() {
        return Optional.ofNullable(this.diskIops);
    }

    /**
     * Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster. Valid values are:
     * 
     */
    @Import(name="ebsVolumeType")
    private @Nullable Output<String> ebsVolumeType;

    /**
     * @return Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster. Valid values are:
     * 
     */
    public Optional<Output<String>> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }

    /**
     * Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
     * 
     */
    @Import(name="instanceSize", required=true)
    private Output<String> instanceSize;

    /**
     * @return Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
     * 
     */
    public Output<String> instanceSize() {
        return this.instanceSize;
    }

    /**
     * Number of nodes of the given type for MongoDB Atlas to deploy to the region.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return Number of nodes of the given type for MongoDB Atlas to deploy to the region.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    private AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs() {}

    private AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs $) {
        this.diskIops = $.diskIops;
        this.ebsVolumeType = $.ebsVolumeType;
        this.instanceSize = $.instanceSize;
        this.nodeCount = $.nodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs $;

        public Builder() {
            $ = new AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs();
        }

        public Builder(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs defaults) {
            $ = new AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskIops Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder diskIops(@Nullable Output<Integer> diskIops) {
            $.diskIops = diskIops;
            return this;
        }

        /**
         * @param diskIops Target throughput (IOPS) desired for AWS storage attached to your cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster.
         * 
         * @return builder
         * 
         */
        public Builder diskIops(Integer diskIops) {
            return diskIops(Output.of(diskIops));
        }

        /**
         * @param ebsVolumeType Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeType(@Nullable Output<String> ebsVolumeType) {
            $.ebsVolumeType = ebsVolumeType;
            return this;
        }

        /**
         * @param ebsVolumeType Type of storage you want to attach to your AWS-provisioned cluster. Set only if you selected AWS as your cloud service provider. You can&#39;t set this parameter for a multi-cloud cluster. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumeType(String ebsVolumeType) {
            return ebsVolumeType(Output.of(ebsVolumeType));
        }

        /**
         * @param instanceSize Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
         * 
         * @return builder
         * 
         */
        public Builder instanceSize(Output<String> instanceSize) {
            $.instanceSize = instanceSize;
            return this;
        }

        /**
         * @param instanceSize Hardware specification for the instance sizes in this region. Each instance size has a default storage and memory capacity. The instance size you select applies to all the data-bearing hosts in your instance size.
         * 
         * @return builder
         * 
         */
        public Builder instanceSize(String instanceSize) {
            return instanceSize(Output.of(instanceSize));
        }

        /**
         * @param nodeCount Number of nodes of the given type for MongoDB Atlas to deploy to the region.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount Number of nodes of the given type for MongoDB Atlas to deploy to the region.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        public AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs build() {
            if ($.instanceSize == null) {
                throw new MissingRequiredPropertyException("AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs", "instanceSize");
            }
            return $;
        }
    }

}
