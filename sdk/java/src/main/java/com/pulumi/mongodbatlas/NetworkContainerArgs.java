// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkContainerArgs Empty = new NetworkContainerArgs();

    /**
     * CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     * 
     * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     * 
     * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     * 
     */
    @Import(name="atlasCidrBlock", required=true)
    private Output<String> atlasCidrBlock;

    /**
     * @return CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
     * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
     * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
     * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
     * 
     * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
     * 
     * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
     * 
     */
    public Output<String> atlasCidrBlock() {
        return this.atlasCidrBlock;
    }

    /**
     * Unique identifier for the Atlas project for this Network Peering Container.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique identifier for the Atlas project for this Network Peering Container.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    /**
     * Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    @Import(name="regionName")
    private @Nullable Output<String> regionName;

    /**
     * @return The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    public Optional<Output<String>> regionName() {
        return Optional.ofNullable(this.regionName);
    }

    /**
     * Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    /**
     * @return Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
     * 
     */
    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    private NetworkContainerArgs() {}

    private NetworkContainerArgs(NetworkContainerArgs $) {
        this.atlasCidrBlock = $.atlasCidrBlock;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
        this.region = $.region;
        this.regionName = $.regionName;
        this.regions = $.regions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkContainerArgs $;

        public Builder() {
            $ = new NetworkContainerArgs();
        }

        public Builder(NetworkContainerArgs defaults) {
            $ = new NetworkContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param atlasCidrBlock CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
         * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
         * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
         * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
         * 
         * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
         * 
         * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
         * 
         * @return builder
         * 
         */
        public Builder atlasCidrBlock(Output<String> atlasCidrBlock) {
            $.atlasCidrBlock = atlasCidrBlock;
            return this;
        }

        /**
         * @param atlasCidrBlock CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
         * * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
         * * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
         * * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
         * 
         * **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
         * 
         * **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
         * 
         * @return builder
         * 
         */
        public Builder atlasCidrBlock(String atlasCidrBlock) {
            return atlasCidrBlock(Output.of(atlasCidrBlock));
        }

        /**
         * @param projectId Unique identifier for the Atlas project for this Network Peering Container.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier for the Atlas project for this Network Peering Container.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param providerName Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param region Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param regionName The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
         * 
         * @return builder
         * 
         */
        public Builder regionName(@Nullable Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        /**
         * @param regions Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
         * 
         * @return builder
         * 
         */
        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        /**
         * @param regions Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
         * 
         * @return builder
         * 
         */
        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        /**
         * @param regions Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
         * 
         * @return builder
         * 
         */
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public NetworkContainerArgs build() {
            if ($.atlasCidrBlock == null) {
                throw new MissingRequiredPropertyException("NetworkContainerArgs", "atlasCidrBlock");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("NetworkContainerArgs", "projectId");
            }
            return $;
        }
    }

}