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
    /// `privatelink_endpoint_service_serverless` Provides a Serverless PrivateLink Endpoint Service resource.
    /// This is the second of two resources required to configure PrivateLink for Serverless, the first is mongodbatlas_privatelink_endpoint_serverless.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// **NOTE:** Create waits for all serverless instances on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation of this resource. Default timeout is 2hrs.
    /// 
    /// ## Example with AWS
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         Name = "test-db",
    ///         ProviderSettingsBackingProviderName = "AWS",
    ///         ProviderSettingsProviderName = "SERVERLESS",
    ///         ProviderSettingsRegionName = "US_EAST_1",
    ///         ContinuousBackupEnabled = true,
    ///     });
    /// 
    ///     var test = new Mongodbatlas.PrivatelinkEndpointServerless("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         InstanceName = testServerlessInstance.Name,
    ///         ProviderName = "AWS",
    ///     });
    /// 
    ///     var ptfeService = new Aws.Index.VpcEndpoint("ptfe_service", new()
    ///     {
    ///         VpcId = "vpc-7fc0a543",
    ///         ServiceName = test.EndpointServiceName,
    ///         VpcEndpointType = "Interface",
    ///         SubnetIds = new[]
    ///         {
    ///             "subnet-de0406d2",
    ///         },
    ///         SecurityGroupIds = new[]
    ///         {
    ///             "sg-3f238186",
    ///         },
    ///     });
    /// 
    ///     var testPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         InstanceName = testServerlessInstance.Name,
    ///         EndpointId = test.EndpointId,
    ///         CloudProviderEndpointId = ptfeService.Id,
    ///         ProviderName = "AWS",
    ///         Comment = "New serverless endpoint",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Example with AZURE
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azurerm = Pulumi.Azurerm;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.PrivatelinkEndpointServerless("test", new()
    ///     {
    ///         ProjectId = projectId,
    ///         ProviderName = "AZURE",
    ///     });
    /// 
    ///     var testPrivateEndpoint = new Azurerm.Index.PrivateEndpoint("test", new()
    ///     {
    ///         Name = "endpoint-test",
    ///         Location = testAzurermResourceGroup.Location,
    ///         ResourceGroupName = resourceGroupName,
    ///         SubnetId = testAzurermSubnet.Id,
    ///         PrivateServiceConnection = new[]
    ///         {
    ///             
    ///             {
    ///                 { "name", test.PrivateLinkServiceName },
    ///                 { "privateConnectionResourceId", test.PrivateLinkServiceResourceId },
    ///                 { "isManualConnection", true },
    ///                 { "requestMessage", "Azure Private Link test" },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         Name = "test-db",
    ///         ProviderSettingsBackingProviderName = "AZURE",
    ///         ProviderSettingsProviderName = "SERVERLESS",
    ///         ProviderSettingsRegionName = "US_EAST",
    ///         ContinuousBackupEnabled = true,
    ///     });
    /// 
    ///     var testPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("test", new()
    ///     {
    ///         ProjectId = test.ProjectId,
    ///         InstanceName = testServerlessInstance.Name,
    ///         EndpointId = test.EndpointId,
    ///         CloudProviderEndpointId = testPrivateEndpoint.Id,
    ///         PrivateEndpointIpAddress = testPrivateEndpoint.PrivateServiceConnection[0].PrivateIpAddress,
    ///         ProviderName = "AZURE",
    ///         Comment = "test",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Available complete examples
    /// - Setup private connection to a MongoDB Atlas Serverless Instance with AWS VPC
    /// 
    /// ## Import
    /// 
    /// Serverless privatelink endpoint can be imported using project ID and endpoint ID, in the format `project_id`--`endpoint_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless test 1112222b3bf99403840e8934--serverless_name--vpce-jjg5e24qp93513h03
    /// ```
    /// For more information see: [MongoDB Atlas API - Serverless Private Endpoints](https://www.mongodb.com/docs/atlas/reference/api/serverless-private-endpoints-get-one/).
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless")]
    public partial class PrivatelinkEndpointServiceServerless : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique string that identifies the private endpoint's network interface.
        /// </summary>
        [Output("cloudProviderEndpointId")]
        public Output<string> CloudProviderEndpointId { get; private set; } = null!;

        /// <summary>
        /// Human-readable string to associate with this private endpoint.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the private endpoint.
        /// </summary>
        [Output("endpointId")]
        public Output<string> EndpointId { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the serverless instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        /// </summary>
        [Output("privateEndpointIpAddress")]
        public Output<string> PrivateEndpointIpAddress { get; private set; } = null!;

        /// <summary>
        /// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        /// </summary>
        [Output("privateLinkServiceResourceId")]
        public Output<string> PrivateLinkServiceResourceId { get; private set; } = null!;

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        /// </summary>
        [Output("providerName")]
        public Output<string> ProviderName { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a PrivatelinkEndpointServiceServerless resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivatelinkEndpointServiceServerless(string name, PrivatelinkEndpointServiceServerlessArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless", name, args ?? new PrivatelinkEndpointServiceServerlessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivatelinkEndpointServiceServerless(string name, Input<string> id, PrivatelinkEndpointServiceServerlessState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/privatelinkEndpointServiceServerless:PrivatelinkEndpointServiceServerless", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivatelinkEndpointServiceServerless resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivatelinkEndpointServiceServerless Get(string name, Input<string> id, PrivatelinkEndpointServiceServerlessState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivatelinkEndpointServiceServerless(name, id, state, options);
        }
    }

    public sealed class PrivatelinkEndpointServiceServerlessArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique string that identifies the private endpoint's network interface.
        /// </summary>
        [Input("cloudProviderEndpointId")]
        public Input<string>? CloudProviderEndpointId { get; set; }

        /// <summary>
        /// Human-readable string to associate with this private endpoint.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the private endpoint.
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the serverless instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        /// </summary>
        [Input("privateEndpointIpAddress")]
        public Input<string>? PrivateEndpointIpAddress { get; set; }

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        public PrivatelinkEndpointServiceServerlessArgs()
        {
        }
        public static new PrivatelinkEndpointServiceServerlessArgs Empty => new PrivatelinkEndpointServiceServerlessArgs();
    }

    public sealed class PrivatelinkEndpointServiceServerlessState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique string that identifies the private endpoint's network interface.
        /// </summary>
        [Input("cloudProviderEndpointId")]
        public Input<string>? CloudProviderEndpointId { get; set; }

        /// <summary>
        /// Human-readable string to associate with this private endpoint.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the private endpoint.
        /// </summary>
        [Input("endpointId")]
        public Input<string>? EndpointId { get; set; }

        /// <summary>
        /// Human-readable label that identifies the serverless instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        /// </summary>
        [Input("privateEndpointIpAddress")]
        public Input<string>? PrivateEndpointIpAddress { get; set; }

        /// <summary>
        /// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        /// </summary>
        [Input("privateLinkServiceResourceId")]
        public Input<string>? PrivateLinkServiceResourceId { get; set; }

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE`.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public PrivatelinkEndpointServiceServerlessState()
        {
        }
        public static new PrivatelinkEndpointServiceServerlessState Empty => new PrivatelinkEndpointServiceServerlessState();
    }
}
