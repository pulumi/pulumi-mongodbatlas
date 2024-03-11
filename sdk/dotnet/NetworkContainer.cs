// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.NetworkContainer` provides a Network Peering Container resource. The resource lets you create, edit and delete network peering containers. You must delete network peering containers before creating clusters in your project. You can't delete a network peering container if your project contains clusters. The resource requires your Project ID.  Each cloud provider requires slightly different attributes so read the argument reference carefully.
    /// 
    ///  Network peering container is a general term used to describe any cloud providers' VPC/VNet concept.  Containers only need to be created if the peering connection to the cloud provider will be created before the first cluster that requires the container.  If the cluster has been/will be created first Atlas automatically creates the required container per the "containers per cloud provider" information that follows (in this case you can obtain the container id from the cluster resource attribute `container_id`).
    /// 
    /// The following is the maximum number of Network Peering containers per cloud provider:
    /// &lt;br&gt; &amp;#8226;  GCP -  One container per project.
    /// &lt;br&gt; &amp;#8226;  AWS and Azure - One container per cloud provider region.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ### Example with AWS
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.NetworkContainer("test", new()
    ///     {
    ///         AtlasCidrBlock = "10.8.0.0/21",
    ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
    ///         ProviderName = "AWS",
    ///         RegionName = "US_EAST_1",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Example with GCP
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.NetworkContainer("test", new()
    ///     {
    ///         AtlasCidrBlock = "10.8.0.0/21",
    ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
    ///         ProviderName = "GCP",
    ///         Regions = new[]
    ///         {
    ///             "US_EAST_4",
    ///             "US_WEST_3",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Example with Azure
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.NetworkContainer("test", new()
    ///     {
    ///         AtlasCidrBlock = "10.8.0.0/21",
    ///         ProjectId = "&lt;YOUR-PROJECT-ID&gt;",
    ///         ProviderName = "AZURE",
    ///         Region = "US_EAST_2",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Network Peering Containers can be imported using project ID and network peering container id, in the format `PROJECTID-CONTAINER-ID`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/networkContainer:NetworkContainer my_container 1112222b3bf99403840e8934-5cbf563d87d9d67253be590a
    /// ```
    /// See detailed information for arguments and attributes: [MongoDB API Network Peering Container](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/)
    /// 
    /// -&gt; __NOTE:__ If you need to get an existing container ID see the How-To Guide.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/networkContainer:NetworkContainer")]
    public partial class NetworkContainer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
        /// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
        /// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
        /// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
        /// 
        /// **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
        /// 
        /// **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
        /// </summary>
        [Output("atlasCidrBlock")]
        public Output<string> AtlasCidrBlock { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Azure subscription in which the VNet resides.
        /// </summary>
        [Output("azureSubscriptionId")]
        public Output<string> AzureSubscriptionId { get; private set; } = null!;

        /// <summary>
        /// The Network Peering Container ID.
        /// </summary>
        [Output("containerId")]
        public Output<string> ContainerId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
        /// </summary>
        [Output("gcpProjectId")]
        public Output<string> GcpProjectId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
        /// </summary>
        [Output("networkName")]
        public Output<string> NetworkName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the Atlas project for this Network Peering Container.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
        /// </summary>
        [Output("providerName")]
        public Output<string?> ProviderName { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the project has Network Peering connections deployed in the container.
        /// </summary>
        [Output("provisioned")]
        public Output<bool> Provisioned { get; private set; } = null!;

        /// <summary>
        /// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        [Output("regionName")]
        public Output<string> RegionName { get; private set; } = null!;

        /// <summary>
        /// Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
        /// </summary>
        [Output("regions")]
        public Output<ImmutableArray<string>> Regions { get; private set; } = null!;

        /// <summary>
        /// The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
        /// </summary>
        [Output("vnetName")]
        public Output<string> VnetName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of Atlas' AWS VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkContainer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkContainer(string name, NetworkContainerArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/networkContainer:NetworkContainer", name, args ?? new NetworkContainerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkContainer(string name, Input<string> id, NetworkContainerState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/networkContainer:NetworkContainer", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NetworkContainer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkContainer Get(string name, Input<string> id, NetworkContainerState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkContainer(name, id, state, options);
        }
    }

    public sealed class NetworkContainerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
        /// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
        /// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
        /// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
        /// 
        /// **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
        /// 
        /// **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
        /// </summary>
        [Input("atlasCidrBlock", required: true)]
        public Input<string> AtlasCidrBlock { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the Atlas project for this Network Peering Container.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        public NetworkContainerArgs()
        {
        }
        public static new NetworkContainerArgs Empty => new NetworkContainerArgs();
    }

    public sealed class NetworkContainerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR block that Atlas uses for the Network Peering containers in your project.  Atlas uses the specified CIDR block for all other Network Peering connections created in the project. The Atlas CIDR block must be at least a /24 and at most a /21 in one of the following [private networks](https://tools.ietf.org/html/rfc1918.html#section-3):
        /// * Lower bound: 10.0.0.0 -	Upper bound: 10.255.255.255 -	Prefix: 10/8
        /// * Lower bound: 172.16.0.0 -	Upper bound:172.31.255.255 -	Prefix:	172.16/12
        /// * Lower bound: 192.168.0.0 -	Upper bound:192.168.255.255 -	Prefix:	192.168/16
        /// 
        /// **Atlas locks this value** if an M10+ cluster or a Network Peering connection already exists. To modify the CIDR block, ensure there are no M10+ clusters in the project and no other Network Peering connections in the project.
        /// 
        /// **Important**: Atlas limits the number of MongoDB nodes per Network Peering connection based on the CIDR block and the region selected for the project. Contact [MongoDB Support](https://www.mongodb.com/contact?tck=docs_atlas) for any questions on Atlas limits of MongoDB nodes per Network Peering connection.
        /// </summary>
        [Input("atlasCidrBlock")]
        public Input<string>? AtlasCidrBlock { get; set; }

        /// <summary>
        /// Unique identifier of the Azure subscription in which the VNet resides.
        /// </summary>
        [Input("azureSubscriptionId")]
        public Input<string>? AzureSubscriptionId { get; set; }

        /// <summary>
        /// The Network Peering Container ID.
        /// </summary>
        [Input("containerId")]
        public Input<string>? ContainerId { get; set; }

        /// <summary>
        /// Unique identifier of the GCP project in which the network peer resides. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
        /// </summary>
        [Input("gcpProjectId")]
        public Input<string>? GcpProjectId { get; set; }

        /// <summary>
        /// Unique identifier of the Network Peering connection in the Atlas project. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
        /// </summary>
        [Input("networkName")]
        public Input<string>? NetworkName { get; set; }

        /// <summary>
        /// Unique identifier for the Atlas project for this Network Peering Container.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Cloud provider for this Network Peering connection.  Accepted values are GCP, AWS, AZURE. If omitted, Atlas sets this parameter to AWS.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Indicates whether the project has Network Peering connections deployed in the container.
        /// </summary>
        [Input("provisioned")]
        public Input<bool>? Provisioned { get; set; }

        /// <summary>
        /// Atlas region where the container resides, see the reference list for Atlas Azure region names [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The Atlas AWS region name for where this container will exist, see the reference list for Atlas AWS region names [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/).
        /// </summary>
        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// Atlas regions where the container resides. Provide this field only if you provide an `atlas_cidr_block` smaller than `/18`. [GCP Regions values](https://docs.atlas.mongodb.com/reference/api/vpc-create-container/#request-body-parameters).
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        /// <summary>
        /// The name of the Azure VNet. Returns null. This value is populated once you create a new network peering connection with the network peering resource.
        /// </summary>
        [Input("vnetName")]
        public Input<string>? VnetName { get; set; }

        /// <summary>
        /// Unique identifier of Atlas' AWS VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public NetworkContainerState()
        {
        }
        public static new NetworkContainerState Empty => new NetworkContainerState();
    }
}
