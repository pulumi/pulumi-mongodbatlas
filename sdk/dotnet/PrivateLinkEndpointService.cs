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
    /// `mongodbatlas.PrivateLinkEndpointService` provides a Private Endpoint Interface Link resource. This represents a Private Endpoint Interface Link, which adds one interface endpoint to a private endpoint connection in an Atlas project.
    /// 
    /// &gt; **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
    ///   * Organization Owner
    ///   * Project Owner
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// **NOTE:** Create and delete wait for all clusters on the project to IDLE in order for their operations to complete. This ensures the latest connection strings can be retrieved following creation or deletion of this resource. Default timeout is 2hrs.
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
    ///     var testPrivateLinkEndpoint = new Mongodbatlas.PrivateLinkEndpoint("testPrivateLinkEndpoint", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         ProviderName = "AWS",
    ///         Region = "US_EAST_1",
    ///     });
    /// 
    ///     var ptfeService = new Aws.Ec2.VpcEndpoint("ptfeService", new()
    ///     {
    ///         VpcId = "vpc-7fc0a543",
    ///         ServiceName = testPrivateLinkEndpoint.EndpointServiceName,
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
    ///     var testPrivateLinkEndpointService = new Mongodbatlas.PrivateLinkEndpointService("testPrivateLinkEndpointService", new()
    ///     {
    ///         ProjectId = testPrivateLinkEndpoint.ProjectId,
    ///         PrivateLinkId = testPrivateLinkEndpoint.PrivateLinkId,
    ///         EndpointServiceId = ptfeService.Id,
    ///         ProviderName = "AWS",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Example with Azure
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Azure = Pulumi.Azure;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testPrivateLinkEndpoint = new Mongodbatlas.PrivateLinkEndpoint("testPrivateLinkEndpoint", new()
    ///     {
    ///         ProjectId = @var.Project_id,
    ///         ProviderName = "AZURE",
    ///         Region = "eastus2",
    ///     });
    /// 
    ///     var testEndpoint = new Azure.PrivateLink.Endpoint("testEndpoint", new()
    ///     {
    ///         Location = data.Azurerm_resource_group.Test.Location,
    ///         ResourceGroupName = @var.Resource_group_name,
    ///         SubnetId = azurerm_subnet.Test.Id,
    ///         PrivateServiceConnection = new Azure.PrivateLink.Inputs.EndpointPrivateServiceConnectionArgs
    ///         {
    ///             Name = testPrivateLinkEndpoint.PrivateLinkServiceName,
    ///             PrivateConnectionResourceId = testPrivateLinkEndpoint.PrivateLinkServiceResourceId,
    ///             IsManualConnection = true,
    ///             RequestMessage = "Azure Private Link test",
    ///         },
    ///     });
    /// 
    ///     var testPrivateLinkEndpointService = new Mongodbatlas.PrivateLinkEndpointService("testPrivateLinkEndpointService", new()
    ///     {
    ///         ProjectId = testPrivateLinkEndpoint.ProjectId,
    ///         PrivateLinkId = testPrivateLinkEndpoint.PrivateLinkId,
    ///         EndpointServiceId = testEndpoint.Id,
    ///         PrivateEndpointIpAddress = testEndpoint.PrivateServiceConnection.Apply(privateServiceConnection =&gt; privateServiceConnection.PrivateIpAddress),
    ///         ProviderName = "AZURE",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Example with GCP
    /// ### Available complete examples
    /// - Setup private connection to a MongoDB Atlas Cluster with AWS VPC
    /// 
    /// ## Import
    /// 
    /// Private Endpoint Link Connection can be imported using project ID and username, in the format `{project_id}--{private_link_id}--{endpoint_service_id}--{provider_name}`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService test 1112222b3bf99403840e8934--3242342343112--vpce-4242342343--AWS
    /// ```
    ///  See detailed information for arguments and attributes: [MongoDB API Private Endpoint Link Connection](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService")]
    public partial class PrivateLinkEndpointService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Status of the interface endpoint for AWS.
        /// Returns one of the following values:
        /// </summary>
        [Output("awsConnectionStatus")]
        public Output<string> AwsConnectionStatus { get; private set; } = null!;

        /// <summary>
        /// Status of the interface endpoint for AZURE.
        /// Returns one of the following values:
        /// </summary>
        [Output("azureStatus")]
        public Output<string> AzureStatus { get; private set; } = null!;

        /// <summary>
        /// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        /// </summary>
        [Output("deleteRequested")]
        public Output<bool> DeleteRequested { get; private set; } = null!;

        /// <summary>
        /// (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
        /// </summary>
        [Output("endpointGroupName")]
        public Output<string> EndpointGroupName { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
        /// </summary>
        [Output("endpointServiceId")]
        public Output<string> EndpointServiceId { get; private set; } = null!;

        /// <summary>
        /// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
        /// </summary>
        [Output("endpoints")]
        public Output<ImmutableArray<Outputs.PrivateLinkEndpointServiceEndpoint>> Endpoints { get; private set; } = null!;

        /// <summary>
        /// Error message pertaining to the interface endpoint. Returns null if there are no errors.
        /// </summary>
        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
        /// </summary>
        [Output("gcpProjectId")]
        public Output<string?> GcpProjectId { get; private set; } = null!;

        /// <summary>
        /// Status of the interface endpoint for GCP.
        /// Returns one of the following values:
        /// </summary>
        [Output("gcpStatus")]
        public Output<string> GcpStatus { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the interface endpoint.
        /// </summary>
        [Output("interfaceEndpointId")]
        public Output<string> InterfaceEndpointId { get; private set; } = null!;

        /// <summary>
        /// Name of the connection for this private endpoint that Atlas generates.
        /// </summary>
        [Output("privateEndpointConnectionName")]
        public Output<string> PrivateEndpointConnectionName { get; private set; } = null!;

        /// <summary>
        /// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        /// </summary>
        [Output("privateEndpointIpAddress")]
        public Output<string> PrivateEndpointIpAddress { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the private endpoint.
        /// </summary>
        [Output("privateEndpointResourceId")]
        public Output<string> PrivateEndpointResourceId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
        /// </summary>
        [Output("privateLinkId")]
        public Output<string> PrivateLinkId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
        /// </summary>
        [Output("providerName")]
        public Output<string> ProviderName { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateLinkEndpointService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateLinkEndpointService(string name, PrivateLinkEndpointServiceArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService", name, args ?? new PrivateLinkEndpointServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateLinkEndpointService(string name, Input<string> id, PrivateLinkEndpointServiceState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/privateLinkEndpointService:PrivateLinkEndpointService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateLinkEndpointService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateLinkEndpointService Get(string name, Input<string> id, PrivateLinkEndpointServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateLinkEndpointService(name, id, state, options);
        }
    }

    public sealed class PrivateLinkEndpointServiceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
        /// </summary>
        [Input("endpointServiceId", required: true)]
        public Input<string> EndpointServiceId { get; set; } = null!;

        [Input("endpoints")]
        private InputList<Inputs.PrivateLinkEndpointServiceEndpointArgs>? _endpoints;

        /// <summary>
        /// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
        /// </summary>
        public InputList<Inputs.PrivateLinkEndpointServiceEndpointArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.PrivateLinkEndpointServiceEndpointArgs>());
            set => _endpoints = value;
        }

        /// <summary>
        /// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
        /// </summary>
        [Input("gcpProjectId")]
        public Input<string>? GcpProjectId { get; set; }

        /// <summary>
        /// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        /// </summary>
        [Input("privateEndpointIpAddress")]
        public Input<string>? PrivateEndpointIpAddress { get; set; }

        /// <summary>
        /// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
        /// </summary>
        [Input("privateLinkId", required: true)]
        public Input<string> PrivateLinkId { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        public PrivateLinkEndpointServiceArgs()
        {
        }
        public static new PrivateLinkEndpointServiceArgs Empty => new PrivateLinkEndpointServiceArgs();
    }

    public sealed class PrivateLinkEndpointServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Status of the interface endpoint for AWS.
        /// Returns one of the following values:
        /// </summary>
        [Input("awsConnectionStatus")]
        public Input<string>? AwsConnectionStatus { get; set; }

        /// <summary>
        /// Status of the interface endpoint for AZURE.
        /// Returns one of the following values:
        /// </summary>
        [Input("azureStatus")]
        public Input<string>? AzureStatus { get; set; }

        /// <summary>
        /// Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
        /// </summary>
        [Input("deleteRequested")]
        public Input<bool>? DeleteRequested { get; set; }

        /// <summary>
        /// (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
        /// </summary>
        [Input("endpointGroupName")]
        public Input<string>? EndpointGroupName { get; set; }

        /// <summary>
        /// Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
        /// </summary>
        [Input("endpointServiceId")]
        public Input<string>? EndpointServiceId { get; set; }

        [Input("endpoints")]
        private InputList<Inputs.PrivateLinkEndpointServiceEndpointGetArgs>? _endpoints;

        /// <summary>
        /// Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
        /// </summary>
        public InputList<Inputs.PrivateLinkEndpointServiceEndpointGetArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.PrivateLinkEndpointServiceEndpointGetArgs>());
            set => _endpoints = value;
        }

        /// <summary>
        /// Error message pertaining to the interface endpoint. Returns null if there are no errors.
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        /// <summary>
        /// Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
        /// </summary>
        [Input("gcpProjectId")]
        public Input<string>? GcpProjectId { get; set; }

        /// <summary>
        /// Status of the interface endpoint for GCP.
        /// Returns one of the following values:
        /// </summary>
        [Input("gcpStatus")]
        public Input<string>? GcpStatus { get; set; }

        /// <summary>
        /// Unique identifier of the interface endpoint.
        /// </summary>
        [Input("interfaceEndpointId")]
        public Input<string>? InterfaceEndpointId { get; set; }

        /// <summary>
        /// Name of the connection for this private endpoint that Atlas generates.
        /// </summary>
        [Input("privateEndpointConnectionName")]
        public Input<string>? PrivateEndpointConnectionName { get; set; }

        /// <summary>
        /// Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
        /// </summary>
        [Input("privateEndpointIpAddress")]
        public Input<string>? PrivateEndpointIpAddress { get; set; }

        /// <summary>
        /// Unique identifier of the private endpoint.
        /// </summary>
        [Input("privateEndpointResourceId")]
        public Input<string>? PrivateEndpointResourceId { get; set; }

        /// <summary>
        /// Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
        /// </summary>
        [Input("privateLinkId")]
        public Input<string>? PrivateLinkId { get; set; }

        /// <summary>
        /// Unique identifier for the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        public PrivateLinkEndpointServiceState()
        {
        }
        public static new PrivateLinkEndpointServiceState Empty => new PrivateLinkEndpointServiceState();
    }
}
