// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.NetworkPeeringArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.NetworkPeeringState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.NetworkPeering` provides a Network Peering Connection resource. The resource lets you create, edit and delete network peering connections. The resource requires your Project ID.
 * 
 * Ensure you have first created a network container if it is required for your configuration.  See the network_container resource documentation to determine if you need a network container first.  Examples for creating both container and peering resource are shown below as well as examples for creating the peering connection only.
 * 
 * &gt; **GCP AND AZURE ONLY:** Connect via Peering Only mode is deprecated, so no longer needed.  See disable Peering Only mode to disable.
 * 
 * &gt; **AZURE ONLY:** To create the peering request with an Azure VNET, you must grant Atlas the following permissions on the virtual network.
 *     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/read
 *     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/write
 *     Microsoft.Network/virtualNetworks/virtualNetworkPeerings/delete
 *     Microsoft.Network/virtualNetworks/peer/action
 * For more information see https://docs.atlas.mongodb.com/security-vpc-peering/ and https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/
 * 
 * &gt; **Create a Whitelist:** Ensure you whitelist the private IP ranges of the subnets in which your application is hosted in order to connect to your Atlas cluster.  See the project_ip_whitelist resource.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
 * 
 * ## Example Usage
 * 
 * ### Container &amp; Peering Connection
 * ### Example with AWS
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.aws.ec2.VpcPeeringConnectionAccepter;
 * import com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testNetworkContainer = new NetworkContainer(&#34;testNetworkContainer&#34;, NetworkContainerArgs.builder()        
 *             .projectId(local.project_id())
 *             .atlasCidrBlock(&#34;10.8.0.0/21&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .regionName(&#34;US_EAST_1&#34;)
 *             .build());
 * 
 *         var testNetworkPeering = new NetworkPeering(&#34;testNetworkPeering&#34;, NetworkPeeringArgs.builder()        
 *             .accepterRegionName(&#34;us-east-1&#34;)
 *             .projectId(local.project_id())
 *             .containerId(&#34;507f1f77bcf86cd799439011&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .routeTableCidrBlock(&#34;192.168.0.0/24&#34;)
 *             .vpcId(&#34;vpc-abc123abc123&#34;)
 *             .awsAccountId(&#34;abc123abc123&#34;)
 *             .build());
 * 
 *         var peer = new VpcPeeringConnectionAccepter(&#34;peer&#34;, VpcPeeringConnectionAccepterArgs.builder()        
 *             .vpcPeeringConnectionId(testNetworkPeering.connectionId())
 *             .autoAccept(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example with GCP
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetNetworkArgs;
 * import com.pulumi.gcp.compute.NetworkPeering;
 * import com.pulumi.gcp.compute.NetworkPeeringArgs;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testNetworkContainer = new NetworkContainer(&#34;testNetworkContainer&#34;, NetworkContainerArgs.builder()        
 *             .projectId(local.project_id())
 *             .atlasCidrBlock(&#34;10.8.0.0/21&#34;)
 *             .providerName(&#34;GCP&#34;)
 *             .build());
 * 
 *         var testNetworkPeering = new NetworkPeering(&#34;testNetworkPeering&#34;, NetworkPeeringArgs.builder()        
 *             .projectId(local.project_id())
 *             .containerId(testNetworkContainer.containerId())
 *             .providerName(&#34;GCP&#34;)
 *             .gcpProjectId(local.GCP_PROJECT_ID())
 *             .networkName(&#34;default&#34;)
 *             .build());
 * 
 *         final var default = ComputeFunctions.getNetwork(GetNetworkArgs.builder()
 *             .name(&#34;default&#34;)
 *             .build());
 * 
 *         var peering = new NetworkPeering(&#34;peering&#34;, NetworkPeeringArgs.builder()        
 *             .network(default_.selfLink())
 *             .peerNetwork(Output.tuple(testNetworkPeering.atlasGcpProjectId(), testNetworkPeering.atlasVpcName()).applyValue(values -&gt; {
 *                 var atlasGcpProjectId = values.t1;
 *                 var atlasVpcName = values.t2;
 *                 return String.format(&#34;https://www.googleapis.com/compute/v1/projects/%s/global/networks/%s&#34;, atlasGcpProjectId,atlasVpcName);
 *             }))
 *             .build());
 * 
 *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
 *             .projectId(local.project_id())
 *             .numShards(1)
 *             .clusterType(&#34;REPLICASET&#34;)
 *             .replicationSpecs(ClusterReplicationSpecArgs.builder()
 *                 .numShards(1)
 *                 .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                     .regionName(&#34;US_EAST_4&#34;)
 *                     .electableNodes(3)
 *                     .priority(7)
 *                     .readOnlyNodes(0)
 *                     .build())
 *                 .build())
 *             .autoScalingDiskGbEnabled(true)
 *             .mongoDbMajorVersion(&#34;4.2&#34;)
 *             .providerName(&#34;GCP&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(&#34;google_compute_network_peering.peering&#34;)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Example with Azure
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testNetworkContainer = new NetworkContainer(&#34;testNetworkContainer&#34;, NetworkContainerArgs.builder()        
 *             .projectId(local.project_id())
 *             .atlasCidrBlock(local.ATLAS_CIDR_BLOCK())
 *             .providerName(&#34;AZURE&#34;)
 *             .region(&#34;US_EAST_2&#34;)
 *             .build());
 * 
 *         var testNetworkPeering = new NetworkPeering(&#34;testNetworkPeering&#34;, NetworkPeeringArgs.builder()        
 *             .projectId(local.project_id())
 *             .containerId(testNetworkContainer.containerId())
 *             .providerName(&#34;AZURE&#34;)
 *             .azureDirectoryId(local.AZURE_DIRECTORY_ID())
 *             .azureSubscriptionId(local.AZURE_SUBSCRIPTION_ID())
 *             .resourceGroupName(local.AZURE_RESOURCES_GROUP_NAME())
 *             .vnetName(local.AZURE_VNET_NAME())
 *             .build());
 * 
 *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
 *             .projectId(local.project_id())
 *             .clusterType(&#34;REPLICASET&#34;)
 *             .replicationSpecs(ClusterReplicationSpecArgs.builder()
 *                 .numShards(1)
 *                 .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                     .regionName(&#34;US_EAST_2&#34;)
 *                     .electableNodes(3)
 *                     .priority(7)
 *                     .readOnlyNodes(0)
 *                     .build())
 *                 .build())
 *             .autoScalingDiskGbEnabled(true)
 *             .mongoDbMajorVersion(&#34;4.2&#34;)
 *             .providerName(&#34;AZURE&#34;)
 *             .providerDiskTypeName(&#34;P4&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(&#34;mongodbatlas_network_peering.test&#34;)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Peering Connection Only, Container Exists
 * You can create a peering connection if an appropriate container for your cloud provider already exists in your project (see the network_container resource for more information).  A container may already exist if you have already created a cluster in your project, if so you may obtain the `container_id` from the cluster resource as shown in the examples below.
 * ### Example with AWS
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.aws.ec2.DefaultVpc;
 * import com.pulumi.aws.ec2.DefaultVpcArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.aws.ec2.VpcPeeringConnectionAccepter;
 * import com.pulumi.aws.ec2.VpcPeeringConnectionAccepterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new Cluster(&#34;test&#34;, ClusterArgs.builder()        
 *             .projectId(local.project_id())
 *             .clusterType(&#34;REPLICASET&#34;)
 *             .replicationSpecs(ClusterReplicationSpecArgs.builder()
 *                 .numShards(1)
 *                 .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                     .regionName(&#34;US_EAST_2&#34;)
 *                     .electableNodes(3)
 *                     .priority(7)
 *                     .readOnlyNodes(0)
 *                     .build())
 *                 .build())
 *             .autoScalingDiskGbEnabled(false)
 *             .mongoDbMajorVersion(&#34;4.2&#34;)
 *             .providerName(&#34;AWS&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .build());
 * 
 *         var default_ = new DefaultVpc(&#34;default&#34;, DefaultVpcArgs.builder()        
 *             .tags(Map.of(&#34;Name&#34;, &#34;Default VPC&#34;))
 *             .build());
 * 
 *         var mongoPeer = new NetworkPeering(&#34;mongoPeer&#34;, NetworkPeeringArgs.builder()        
 *             .accepterRegionName(&#34;us-east-2&#34;)
 *             .projectId(local.project_id())
 *             .containerId(test.containerId())
 *             .providerName(&#34;AWS&#34;)
 *             .routeTableCidrBlock(&#34;172.31.0.0/16&#34;)
 *             .vpcId(default_.id())
 *             .awsAccountId(local.AWS_ACCOUNT_ID())
 *             .build());
 * 
 *         var awsPeer = new VpcPeeringConnectionAccepter(&#34;awsPeer&#34;, VpcPeeringConnectionAccepterArgs.builder()        
 *             .vpcPeeringConnectionId(mongoPeer.connectionId())
 *             .autoAccept(true)
 *             .tags(Map.of(&#34;Side&#34;, &#34;Accepter&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example with GCP
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetNetworkArgs;
 * import com.pulumi.gcp.compute.NetworkPeering;
 * import com.pulumi.gcp.compute.NetworkPeeringArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
 *             .projectId(local.project_id())
 *             .clusterType(&#34;REPLICASET&#34;)
 *             .replicationSpecs(ClusterReplicationSpecArgs.builder()
 *                 .numShards(1)
 *                 .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                     .regionName(&#34;US_EAST_2&#34;)
 *                     .electableNodes(3)
 *                     .priority(7)
 *                     .readOnlyNodes(0)
 *                     .build())
 *                 .build())
 *             .autoScalingDiskGbEnabled(true)
 *             .mongoDbMajorVersion(&#34;4.2&#34;)
 *             .providerName(&#34;GCP&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .build());
 * 
 *         var testNetworkPeering = new NetworkPeering(&#34;testNetworkPeering&#34;, NetworkPeeringArgs.builder()        
 *             .projectId(local.project_id())
 *             .atlasCidrBlock(&#34;192.168.0.0/18&#34;)
 *             .containerId(testCluster.containerId())
 *             .providerName(&#34;GCP&#34;)
 *             .gcpProjectId(local.GCP_PROJECT_ID())
 *             .networkName(&#34;default&#34;)
 *             .build());
 * 
 *         final var default = ComputeFunctions.getNetwork(GetNetworkArgs.builder()
 *             .name(&#34;default&#34;)
 *             .build());
 * 
 *         var peering = new NetworkPeering(&#34;peering&#34;, NetworkPeeringArgs.builder()        
 *             .network(default_.selfLink())
 *             .peerNetwork(Output.tuple(testNetworkPeering.atlasGcpProjectId(), testNetworkPeering.atlasVpcName()).applyValue(values -&gt; {
 *                 var atlasGcpProjectId = values.t1;
 *                 var atlasVpcName = values.t2;
 *                 return String.format(&#34;https://www.googleapis.com/compute/v1/projects/%s/global/networks/%s&#34;, atlasGcpProjectId,atlasVpcName);
 *             }))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Example with Azure
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.Cluster;
 * import com.pulumi.mongodbatlas.ClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.ClusterReplicationSpecArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testCluster = new Cluster(&#34;testCluster&#34;, ClusterArgs.builder()        
 *             .projectId(local.project_id())
 *             .clusterType(&#34;REPLICASET&#34;)
 *             .replicationSpecs(ClusterReplicationSpecArgs.builder()
 *                 .numShards(1)
 *                 .regionsConfigs(ClusterReplicationSpecRegionsConfigArgs.builder()
 *                     .regionName(&#34;US_EAST_2&#34;)
 *                     .electableNodes(3)
 *                     .priority(7)
 *                     .readOnlyNodes(0)
 *                     .build())
 *                 .build())
 *             .autoScalingDiskGbEnabled(false)
 *             .mongoDbMajorVersion(&#34;4.2&#34;)
 *             .providerName(&#34;AZURE&#34;)
 *             .providerInstanceSizeName(&#34;M10&#34;)
 *             .build());
 * 
 *         var testNetworkPeering = new NetworkPeering(&#34;testNetworkPeering&#34;, NetworkPeeringArgs.builder()        
 *             .projectId(local.project_id())
 *             .containerId(testCluster.containerId())
 *             .providerName(&#34;AZURE&#34;)
 *             .azureDirectoryId(local.AZURE_DIRECTORY_ID())
 *             .azureSubscriptionId(local.AZURE_SUBSCRIPTION_ID())
 *             .resourceGroupName(local.AZURE_RESOURCE_GROUP_NAME())
 *             .vnetName(local.AZURE_VNET_NAME())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Network Peering Connections can be imported using project ID and network peering id, in the format `PROJECTID-PEERID-PROVIDERNAME`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/networkPeering:NetworkPeering my_peering 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a-AWS
 * ```
 * 
 *  See detailed information for arguments and attributes[MongoDB API Network Peering Connection](https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/)
 * 
 */
@ResourceType(type="mongodbatlas:index/networkPeering:NetworkPeering")
public class NetworkPeering extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    @Export(name="accepterRegionName", refs={String.class}, tree="[0]")
    private Output<String> accepterRegionName;

    /**
     * @return Specifies the AWS region where the peer VPC resides. For complete lists of supported regions, see [Amazon Web Services](https://docs.atlas.mongodb.com/reference/amazon-aws/).
     * 
     */
    public Output<String> accepterRegionName() {
        return this.accepterRegionName;
    }
    @Export(name="atlasCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> atlasCidrBlock;

    public Output<String> atlasCidrBlock() {
        return this.atlasCidrBlock;
    }
    /**
     * The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
     * 
     */
    @Export(name="atlasGcpProjectId", refs={String.class}, tree="[0]")
    private Output<String> atlasGcpProjectId;

    /**
     * @return The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that it is need to set up the reciprocal connection.
     * 
     */
    public Output<String> atlasGcpProjectId() {
        return this.atlasGcpProjectId;
    }
    @Export(name="atlasId", refs={String.class}, tree="[0]")
    private Output<String> atlasId;

    public Output<String> atlasId() {
        return this.atlasId;
    }
    @Export(name="atlasVpcName", refs={String.class}, tree="[0]")
    private Output<String> atlasVpcName;

    public Output<String> atlasVpcName() {
        return this.atlasVpcName;
    }
    /**
     * AWS Account ID of the owner of the peer VPC.
     * 
     */
    @Export(name="awsAccountId", refs={String.class}, tree="[0]")
    private Output<String> awsAccountId;

    /**
     * @return AWS Account ID of the owner of the peer VPC.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * Unique identifier for an Azure AD directory.
     * 
     */
    @Export(name="azureDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> azureDirectoryId;

    /**
     * @return Unique identifier for an Azure AD directory.
     * 
     */
    public Output<String> azureDirectoryId() {
        return this.azureDirectoryId;
    }
    /**
     * Unique identifier of the Azure subscription in which the VNet resides.
     * 
     */
    @Export(name="azureSubscriptionId", refs={String.class}, tree="[0]")
    private Output<String> azureSubscriptionId;

    /**
     * @return Unique identifier of the Azure subscription in which the VNet resides.
     * 
     */
    public Output<String> azureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * Unique identifier of the Atlas network peering container.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return Unique identifier of the Atlas network peering container.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     * 
     */
    @Export(name="containerId", refs={String.class}, tree="[0]")
    private Output<String> containerId;

    /**
     * @return Unique identifier of the MongoDB Atlas container for the provider (GCP) or provider/region (AWS, AZURE). You can create an MongoDB Atlas container using the network_container resource or it can be obtained from the cluster returned values if a cluster has been created before the first container.
     * 
     */
    public Output<String> containerId() {
        return this.containerId;
    }
    /**
     * When `&#34;status&#34; : &#34;FAILED&#34;`, Atlas provides a description of the error.
     * 
     */
    @Export(name="errorMessage", refs={String.class}, tree="[0]")
    private Output<String> errorMessage;

    /**
     * @return When `&#34;status&#34; : &#34;FAILED&#34;`, Atlas provides a description of the error.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
     * 
     */
    @Export(name="errorState", refs={String.class}, tree="[0]")
    private Output<String> errorState;

    /**
     * @return Description of the Atlas error when `status` is `Failed`, Otherwise, Atlas returns `null`.
     * 
     */
    public Output<String> errorState() {
        return this.errorState;
    }
    /**
     * Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
     * 
     */
    @Export(name="errorStateName", refs={String.class}, tree="[0]")
    private Output<String> errorStateName;

    /**
     * @return Error state, if any. The VPC peering connection error state value can be one of the following: `REJECTED`, `EXPIRED`, `INVALID_ARGUMENT`.
     * 
     */
    public Output<String> errorStateName() {
        return this.errorStateName;
    }
    /**
     * GCP project ID of the owner of the network peer.
     * 
     */
    @Export(name="gcpProjectId", refs={String.class}, tree="[0]")
    private Output<String> gcpProjectId;

    /**
     * @return GCP project ID of the owner of the network peer.
     * 
     */
    public Output<String> gcpProjectId() {
        return this.gcpProjectId;
    }
    /**
     * Name of the network peer to which Atlas connects.
     * 
     * **AZURE ONLY:**
     * 
     */
    @Export(name="networkName", refs={String.class}, tree="[0]")
    private Output<String> networkName;

    /**
     * @return Name of the network peer to which Atlas connects.
     * 
     * **AZURE ONLY:**
     * 
     */
    public Output<String> networkName() {
        return this.networkName;
    }
    /**
     * Unique identifier of the Atlas network peer.
     * 
     */
    @Export(name="peerId", refs={String.class}, tree="[0]")
    private Output<String> peerId;

    /**
     * @return Unique identifier of the Atlas network peer.
     * 
     */
    public Output<String> peerId() {
        return this.peerId;
    }
    /**
     * The unique ID for the MongoDB Atlas project to create the database user.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
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
    @Export(name="providerName", refs={String.class}, tree="[0]")
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
    @Export(name="resourceGroupName", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupName;

    /**
     * @return Name of your Azure resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * AWS VPC CIDR block or subnet.
     * 
     * **GCP ONLY:**
     * 
     */
    @Export(name="routeTableCidrBlock", refs={String.class}, tree="[0]")
    private Output<String> routeTableCidrBlock;

    /**
     * @return AWS VPC CIDR block or subnet.
     * 
     * **GCP ONLY:**
     * 
     */
    public Output<String> routeTableCidrBlock() {
        return this.routeTableCidrBlock;
    }
    /**
     * Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the Atlas network peering connection.  Azure/GCP: `ADDING_PEER`, `AVAILABLE`, `FAILED`, `DELETING` GCP Only:  `WAITING_FOR_USER`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
     * 
     */
    @Export(name="statusName", refs={String.class}, tree="[0]")
    private Output<String> statusName;

    /**
     * @return (AWS Only) The VPC peering connection status value can be one of the following: `INITIATING`, `PENDING_ACCEPTANCE`, `FAILED`, `FINALIZING`, `AVAILABLE`, `TERMINATING`.
     * 
     */
    public Output<String> statusName() {
        return this.statusName;
    }
    /**
     * Name of your Azure VNet.
     * 
     */
    @Export(name="vnetName", refs={String.class}, tree="[0]")
    private Output<String> vnetName;

    /**
     * @return Name of your Azure VNet.
     * 
     */
    public Output<String> vnetName() {
        return this.vnetName;
    }
    /**
     * Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return Unique identifier of the AWS peer VPC (Note: this is **not** the same as the Atlas AWS VPC that is returned by the network_container resource).
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkPeering(String name) {
        this(name, NetworkPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkPeering(String name, NetworkPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkPeering(String name, NetworkPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/networkPeering:NetworkPeering", name, args == null ? NetworkPeeringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkPeering(String name, Output<String> id, @Nullable NetworkPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/networkPeering:NetworkPeering", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NetworkPeering get(String name, Output<String> id, @Nullable NetworkPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPeering(name, id, state, options);
    }
}
