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
 * ## # Resource: mongodbatlas.NetworkPeering
 * 
 * `mongodbatlas.NetworkPeering` provides a Network Peering Connection resource. The resource lets you create, edit and delete network peering connections. The resource requires your Project ID.
 * 
 * Ensure you have first created a network container if it is required for your configuration.  See the network_container resource documentation to determine if you need a network container first.  Examples for creating both container and peering resource are shown below as well as examples for creating the peering connection only.
 * 
 * &gt; **GCP AND AZURE ONLY:** Connect via Peering Only mode is deprecated, so no longer needed.  See [disable Peering Only mode](https://docs.atlas.mongodb.com/reference/faq/connection-changes/#disable-peering-mode) for details
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
 * 
 * ### Example with AWS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.aws.vpcPeeringConnectionAccepter;
 * import com.pulumi.aws.vpcPeeringConnectionAccepterArgs;
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
 *         // Container example provided but not always required, 
 *         // see network_container documentation for details. 
 *         var test = new NetworkContainer("test", NetworkContainerArgs.builder()
 *             .projectId(projectId)
 *             .atlasCidrBlock("10.8.0.0/21")
 *             .providerName("AWS")
 *             .regionName("US_EAST_1")
 *             .build());
 * 
 *         // Create the peering connection request
 *         var testNetworkPeering = new NetworkPeering("testNetworkPeering", NetworkPeeringArgs.builder()
 *             .accepterRegionName("us-east-1")
 *             .projectId(projectId)
 *             .containerId("507f1f77bcf86cd799439011")
 *             .providerName("AWS")
 *             .routeTableCidrBlock("192.168.0.0/24")
 *             .vpcId("vpc-abc123abc123")
 *             .awsAccountId("abc123abc123")
 *             .build());
 * 
 *         // the following assumes an AWS provider is configured
 *         // Accept the peering connection request
 *         var peer = new VpcPeeringConnectionAccepter("peer", VpcPeeringConnectionAccepterArgs.builder()
 *             .vpcPeeringConnectionId(testNetworkPeering.connectionId())
 *             .autoAccept(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Example with Azure
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mongodbatlas.NetworkContainer;
 * import com.pulumi.mongodbatlas.NetworkContainerArgs;
 * import com.pulumi.mongodbatlas.NetworkPeering;
 * import com.pulumi.mongodbatlas.NetworkPeeringArgs;
 * import com.pulumi.mongodbatlas.AdvancedCluster;
 * import com.pulumi.mongodbatlas.AdvancedClusterArgs;
 * import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecArgs;
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
 *         // Ensure you have created the required Azure service principal first, see
 *         // see https://docs.atlas.mongodb.com/security-vpc-peering/
 *         // Container example provided but not always required, 
 *         // see network_container documentation for details. 
 *         var test = new NetworkContainer("test", NetworkContainerArgs.builder()
 *             .projectId(projectId)
 *             .atlasCidrBlock(ATLAS_CIDR_BLOCK)
 *             .providerName("AZURE")
 *             .region("US_EAST_2")
 *             .build());
 * 
 *         // Create the peering connection request
 *         var testNetworkPeering = new NetworkPeering("testNetworkPeering", NetworkPeeringArgs.builder()
 *             .projectId(projectId)
 *             .containerId(test.containerId())
 *             .providerName("AZURE")
 *             .azureDirectoryId(AZURE_DIRECTORY_ID)
 *             .azureSubscriptionId(AZURE_SUBSCRIPTION_ID)
 *             .resourceGroupName(AZURE_RESOURCES_GROUP_NAME)
 *             .vnetName(AZURE_VNET_NAME)
 *             .build());
 * 
 *         // Create the cluster once the peering connection is completed
 *         var testAdvancedCluster = new AdvancedCluster("testAdvancedCluster", AdvancedClusterArgs.builder()
 *             .projectId(projectId)
 *             .name("terraform-manually-test")
 *             .clusterType("REPLICASET")
 *             .backupEnabled(true)
 *             .replicationSpecs(AdvancedClusterReplicationSpecArgs.builder()
 *                 .regionConfigs(AdvancedClusterReplicationSpecRegionConfigArgs.builder()
 *                     .priority(7)
 *                     .providerName("AZURE")
 *                     .regionName("US_EAST_2")
 *                     .electableSpecs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs.builder()
 *                         .instanceSize("M10")
 *                         .nodeCount(3)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(testNetworkPeering)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Peering Connection Only, Container Exists
 * You can create a peering connection if an appropriate container for your cloud provider already exists in your project (see the network_container resource for more information).  A container may already exist if you have already created a cluster in your project, if so you may obtain the `container_id` from the cluster resource as shown in the examples below.
 * 
 * ## Import
 * 
 * Network Peering Connections can be imported using project ID and network peering id, in the format `PROJECTID-PEERID-PROVIDERNAME`, e.g.
 * 
 * ```sh
 * $ pulumi import mongodbatlas:index/networkPeering:NetworkPeering my_peering 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a-AWS
 * ```
 * 
 * Use the [MongoDB Atlas CLI][https://www.mongodb.com/docs/atlas/cli/current/command/atlas-networking-peering-list/#std-label-atlas-networking-peering-list] to obtain your `project_id` and `peering_id`. Attention gcp and azure users: The `atlas networking peering list` command returns only `AWS` peerings by default. You have to include the `--provider` parameter to list peerings for your cloud provider. Valid values are AWS, AZURE, or GCP.
 * 
 * atlas projects list
 * 
 * atlas networking peering list --projectId &lt;projectId&gt; --provider &lt;AZURE|GCP|AWS&gt;
 * 
 * See detailed information for arguments and attributes: [MongoDB API Network Peering Connection](https://docs.atlas.mongodb.com/reference/api/vpc-create-peering-connection/)
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
     * The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     * 
     */
    @Export(name="atlasGcpProjectId", refs={String.class}, tree="[0]")
    private Output<String> atlasGcpProjectId;

    /**
     * @return The Atlas GCP Project ID for the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
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
    /**
     * Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     * 
     */
    @Export(name="atlasVpcName", refs={String.class}, tree="[0]")
    private Output<String> atlasVpcName;

    /**
     * @return Name of the GCP VPC used by your atlas cluster that is needed to set up the reciprocal connection.
     * 
     */
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
     * The unique ID for the MongoDB Atlas project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the MongoDB Atlas project.
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
    public NetworkPeering(java.lang.String name) {
        this(name, NetworkPeeringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkPeering(java.lang.String name, NetworkPeeringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkPeering(java.lang.String name, NetworkPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/networkPeering:NetworkPeering", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NetworkPeering(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/networkPeering:NetworkPeering", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkPeeringArgs makeArgs(NetworkPeeringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkPeeringArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static NetworkPeering get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkPeeringState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPeering(name, id, state, options);
    }
}
