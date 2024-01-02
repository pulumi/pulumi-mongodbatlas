// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPeeringArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringArgs Empty = new NetworkPeeringArgs();

    /**
     * Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    @Import(name="accepterRegionName")
    private @Nullable Output<String> accepterRegionName;

    /**
     * @return Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    public Optional<Output<String>> accepterRegionName() {
        return Optional.ofNullable(this.accepterRegionName);
    }

    @Import(name="atlasCidrBlock")
    private @Nullable Output<String> atlasCidrBlock;

    public Optional<Output<String>> atlasCidrBlock() {
        return Optional.ofNullable(this.atlasCidrBlock);
    }

    /**
     * The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
     * 
     */
    @Import(name="atlasGcpProjectId")
    private @Nullable Output<String> atlasGcpProjectId;

    /**
     * @return The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
     * 
     */
    public Optional<Output<String>> atlasGcpProjectId() {
        return Optional.ofNullable(this.atlasGcpProjectId);
    }

    @Import(name="atlasVpcName")
    private @Nullable Output<String> atlasVpcName;

    public Optional<Output<String>> atlasVpcName() {
        return Optional.ofNullable(this.atlasVpcName);
    }

    /**
     * AWS Account ID of the owner of the peer VPC.
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return AWS Account ID of the owner of the peer VPC.
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * Unique identifier for an Azure AD directory.
     * 
     */
    @Import(name="azureDirectoryId")
    private @Nullable Output<String> azureDirectoryId;

    /**
     * @return Unique identifier for an Azure AD directory.
     * 
     */
    public Optional<Output<String>> azureDirectoryId() {
        return Optional.ofNullable(this.azureDirectoryId);
    }

    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     * 
     */
    @Import(name="azureSubscriptionId")
    private @Nullable Output<String> azureSubscriptionId;

    /**
     * @return Unique identifier of the Azure subscription in which the VNet resides.
     * 
     */
    public Optional<Output<String>> azureSubscriptionId() {
        return Optional.ofNullable(this.azureSubscriptionId);
    }

    /**
     * Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     * 
     */
    @Import(name="containerId", required=true)
    private Output<String> containerId;

    /**
     * @return Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     * 
     */
    public Output<String> containerId() {
        return this.containerId;
    }

    /**
     * GCP project ID of the owner of the network peer.
     * 
     */
    @Import(name="gcpProjectId")
    private @Nullable Output<String> gcpProjectId;

    /**
     * @return GCP project ID of the owner of the network peer.
     * 
     */
    public Optional<Output<String>> gcpProjectId() {
        return Optional.ofNullable(this.gcpProjectId);
    }

    /**
     * Name of the network peer to which Atlas connects.
     * 
     * **AZURE ONLY:**
     * 
     */
    @Import(name="networkName")
    private @Nullable Output<String> networkName;

    /**
     * @return Name of the network peer to which Atlas connects.
     * 
     * **AZURE ONLY:**
     * 
     */
    public Optional<Output<String>> networkName() {
        return Optional.ofNullable(this.networkName);
    }

    /**
     * The unique ID for the MongoDB Atlas project to create the database user.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the MongoDB Atlas project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
     * 
     * **AWS ONLY:**
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
     * 
     * **AWS ONLY:**
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     * Name of your Azure resource group.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Name of your Azure resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * AWS VPC CIDR block or subnet.
     * 
     * **GCP ONLY:**
     * 
     */
    @Import(name="routeTableCidrBlock")
    private @Nullable Output<String> routeTableCidrBlock;

    /**
     * @return AWS VPC CIDR block or subnet.
     * 
     * **GCP ONLY:**
     * 
     */
    public Optional<Output<String>> routeTableCidrBlock() {
        return Optional.ofNullable(this.routeTableCidrBlock);
    }

    /**
     * Name of your Azure VNet.
     * 
     */
    @Import(name="vnetName")
    private @Nullable Output<String> vnetName;

    /**
     * @return Name of your Azure VNet.
     * 
     */
    public Optional<Output<String>> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }

    /**
     * Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private NetworkPeeringArgs() {}

    private NetworkPeeringArgs(NetworkPeeringArgs $) {
        this.accepterRegionName = $.accepterRegionName;
        this.atlasCidrBlock = $.atlasCidrBlock;
        this.atlasGcpProjectId = $.atlasGcpProjectId;
        this.atlasVpcName = $.atlasVpcName;
        this.awsAccountId = $.awsAccountId;
        this.azureDirectoryId = $.azureDirectoryId;
        this.azureSubscriptionId = $.azureSubscriptionId;
        this.containerId = $.containerId;
        this.gcpProjectId = $.gcpProjectId;
        this.networkName = $.networkName;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
        this.resourceGroupName = $.resourceGroupName;
        this.routeTableCidrBlock = $.routeTableCidrBlock;
        this.vnetName = $.vnetName;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPeeringArgs $;

        public Builder() {
            $ = new NetworkPeeringArgs();
        }

        public Builder(NetworkPeeringArgs defaults) {
            $ = new NetworkPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accepterRegionName Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
         * 
         * @return builder
         * 
         */
        public Builder accepterRegionName(@Nullable Output<String> accepterRegionName) {
            $.accepterRegionName = accepterRegionName;
            return this;
        }

        /**
         * @param accepterRegionName Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
         * 
         * @return builder
         * 
         */
        public Builder accepterRegionName(String accepterRegionName) {
            return accepterRegionName(Output.of(accepterRegionName));
        }

        public Builder atlasCidrBlock(@Nullable Output<String> atlasCidrBlock) {
            $.atlasCidrBlock = atlasCidrBlock;
            return this;
        }

        public Builder atlasCidrBlock(String atlasCidrBlock) {
            return atlasCidrBlock(Output.of(atlasCidrBlock));
        }

        /**
         * @param atlasGcpProjectId The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
         * 
         * @return builder
         * 
         */
        public Builder atlasGcpProjectId(@Nullable Output<String> atlasGcpProjectId) {
            $.atlasGcpProjectId = atlasGcpProjectId;
            return this;
        }

        /**
         * @param atlasGcpProjectId The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
         * 
         * @return builder
         * 
         */
        public Builder atlasGcpProjectId(String atlasGcpProjectId) {
            return atlasGcpProjectId(Output.of(atlasGcpProjectId));
        }

        public Builder atlasVpcName(@Nullable Output<String> atlasVpcName) {
            $.atlasVpcName = atlasVpcName;
            return this;
        }

        public Builder atlasVpcName(String atlasVpcName) {
            return atlasVpcName(Output.of(atlasVpcName));
        }

        /**
         * @param awsAccountId AWS Account ID of the owner of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId AWS Account ID of the owner of the peer VPC.
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param azureDirectoryId Unique identifier for an Azure AD directory.
         * 
         * @return builder
         * 
         */
        public Builder azureDirectoryId(@Nullable Output<String> azureDirectoryId) {
            $.azureDirectoryId = azureDirectoryId;
            return this;
        }

        /**
         * @param azureDirectoryId Unique identifier for an Azure AD directory.
         * 
         * @return builder
         * 
         */
        public Builder azureDirectoryId(String azureDirectoryId) {
            return azureDirectoryId(Output.of(azureDirectoryId));
        }

        /**
         * @param azureSubscriptionId Unique identifier of the Azure subscription in which the VNet resides.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(@Nullable Output<String> azureSubscriptionId) {
            $.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        /**
         * @param azureSubscriptionId Unique identifier of the Azure subscription in which the VNet resides.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            return azureSubscriptionId(Output.of(azureSubscriptionId));
        }

        /**
         * @param containerId Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(Output<String> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(String containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param gcpProjectId GCP project ID of the owner of the network peer.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(@Nullable Output<String> gcpProjectId) {
            $.gcpProjectId = gcpProjectId;
            return this;
        }

        /**
         * @param gcpProjectId GCP project ID of the owner of the network peer.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(String gcpProjectId) {
            return gcpProjectId(Output.of(gcpProjectId));
        }

        /**
         * @param networkName Name of the network peer to which Atlas connects.
         * 
         * **AZURE ONLY:**
         * 
         * @return builder
         * 
         */
        public Builder networkName(@Nullable Output<String> networkName) {
            $.networkName = networkName;
            return this;
        }

        /**
         * @param networkName Name of the network peer to which Atlas connects.
         * 
         * **AZURE ONLY:**
         * 
         * @return builder
         * 
         */
        public Builder networkName(String networkName) {
            return networkName(Output.of(networkName));
        }

        /**
         * @param projectId The unique ID for the MongoDB Atlas project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the MongoDB Atlas project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param providerName Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
         * 
         * **AWS ONLY:**
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud provider to whom the peering connection is being made. (Possible Values `AWS`, `AZURE`, `GCP`).
         * 
         * **AWS ONLY:**
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param resourceGroupName Name of your Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of your Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routeTableCidrBlock AWS VPC CIDR block or subnet.
         * 
         * **GCP ONLY:**
         * 
         * @return builder
         * 
         */
        public Builder routeTableCidrBlock(@Nullable Output<String> routeTableCidrBlock) {
            $.routeTableCidrBlock = routeTableCidrBlock;
            return this;
        }

        /**
         * @param routeTableCidrBlock AWS VPC CIDR block or subnet.
         * 
         * **GCP ONLY:**
         * 
         * @return builder
         * 
         */
        public Builder routeTableCidrBlock(String routeTableCidrBlock) {
            return routeTableCidrBlock(Output.of(routeTableCidrBlock));
        }

        /**
         * @param vnetName Name of your Azure VNet.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(@Nullable Output<String> vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        /**
         * @param vnetName Name of your Azure VNet.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(String vnetName) {
            return vnetName(Output.of(vnetName));
        }

        /**
         * @param vpcId Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public NetworkPeeringArgs build() {
            if ($.containerId == null) {
                throw new MissingRequiredPropertyException("NetworkPeeringArgs", "containerId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("NetworkPeeringArgs", "projectId");
            }
            if ($.providerName == null) {
                throw new MissingRequiredPropertyException("NetworkPeeringArgs", "providerName");
            }
            return $;
        }
    }

}
