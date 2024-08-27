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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.PrivateLinkEndpoint("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         ProviderName = "AWS/AZURE",
    ///         Region = "US_EAST_1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Available complete examples
    /// - Setup private connection to a MongoDB Atlas Cluster with AWS VPC
    /// 
    /// ## Import
    /// 
    /// Private Endpoint Service can be imported using project ID, private link ID, provider name and region, in the format `{project_id}-{private_link_id}-{provider_name}-{region}`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint test 1112222b3bf99403840e8934-3242342343112-AWS-us-east-1
    /// ```
    /// See detailed information for arguments and attributes: [MongoDB API Private Endpoint Service](https://docs.atlas.mongodb.com/reference/api/private-endpoints-service-create-one/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint")]
    public partial class PrivateLinkEndpoint : global::Pulumi.CustomResource
    {
        /// <summary>
        /// GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
        /// </summary>
        [Output("endpointGroupNames")]
        public Output<ImmutableArray<string>> EndpointGroupNames { get; private set; } = null!;

        /// <summary>
        /// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
        /// </summary>
        [Output("endpointServiceName")]
        public Output<string> EndpointServiceName { get; private set; } = null!;

        /// <summary>
        /// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
        /// AWS:
        /// </summary>
        [Output("errorMessage")]
        public Output<string> ErrorMessage { get; private set; } = null!;

        /// <summary>
        /// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
        /// AZURE:
        /// </summary>
        [Output("interfaceEndpoints")]
        public Output<ImmutableArray<string>> InterfaceEndpoints { get; private set; } = null!;

        /// <summary>
        /// All private endpoints that you have added to this Azure Private Link Service.
        /// </summary>
        [Output("privateEndpoints")]
        public Output<ImmutableArray<string>> PrivateEndpoints { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the AWS PrivateLink connection.
        /// </summary>
        [Output("privateLinkId")]
        public Output<string> PrivateLinkId { get; private set; } = null!;

        /// <summary>
        /// Name of the Azure Private Link Service that Atlas manages.
        /// GCP:
        /// </summary>
        [Output("privateLinkServiceName")]
        public Output<string> PrivateLinkServiceName { get; private set; } = null!;

        [Output("privateLinkServiceResourceId")]
        public Output<string> PrivateLinkServiceResourceId { get; private set; } = null!;

        /// <summary>
        /// Required 	Unique identifier for the project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
        /// </summary>
        [Output("providerName")]
        public Output<string> ProviderName { get; private set; } = null!;

        /// <summary>
        /// Cloud provider region in which you want to create the private endpoint connection.
        /// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// GCP region for the Private Service Connect endpoint service.
        /// </summary>
        [Output("regionName")]
        public Output<string> RegionName { get; private set; } = null!;

        /// <summary>
        /// Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
        /// </summary>
        [Output("serviceAttachmentNames")]
        public Output<ImmutableArray<string>> ServiceAttachmentNames { get; private set; } = null!;

        /// <summary>
        /// Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
        /// AWS:
        /// * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
        /// * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
        /// * `FAILED` 	A system failure has occurred.
        /// * `DELETING` 	The AWS PrivateLink connection is being deleted.
        /// AZURE:
        /// * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
        /// * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
        /// * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
        /// * `DELETING` 	Atlas is deleting the Private Link service.
        /// GCP:
        /// * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
        /// * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
        /// * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
        /// * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateLinkEndpoint resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateLinkEndpoint(string name, PrivateLinkEndpointArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, args ?? new PrivateLinkEndpointArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateLinkEndpoint(string name, Input<string> id, PrivateLinkEndpointState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/privateLinkEndpoint:PrivateLinkEndpoint", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateLinkEndpoint resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateLinkEndpoint Get(string name, Input<string> id, PrivateLinkEndpointState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateLinkEndpoint(name, id, state, options);
        }
    }

    public sealed class PrivateLinkEndpointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Required 	Unique identifier for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        /// <summary>
        /// Cloud provider region in which you want to create the private endpoint connection.
        /// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public PrivateLinkEndpointArgs()
        {
        }
        public static new PrivateLinkEndpointArgs Empty => new PrivateLinkEndpointArgs();
    }

    public sealed class PrivateLinkEndpointState : global::Pulumi.ResourceArgs
    {
        [Input("endpointGroupNames")]
        private InputList<string>? _endpointGroupNames;

        /// <summary>
        /// GCP network endpoint groups corresponding to the Private Service Connect endpoint service.
        /// </summary>
        public InputList<string> EndpointGroupNames
        {
            get => _endpointGroupNames ?? (_endpointGroupNames = new InputList<string>());
            set => _endpointGroupNames = value;
        }

        /// <summary>
        /// Name of the PrivateLink endpoint service in AWS. Returns null while the endpoint service is being created.
        /// </summary>
        [Input("endpointServiceName")]
        public Input<string>? EndpointServiceName { get; set; }

        /// <summary>
        /// Error message pertaining to the AWS PrivateLink connection. Returns null if there are no errors.
        /// AWS:
        /// </summary>
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("interfaceEndpoints")]
        private InputList<string>? _interfaceEndpoints;

        /// <summary>
        /// Unique identifiers of the interface endpoints in your VPC that you added to the AWS PrivateLink connection.
        /// AZURE:
        /// </summary>
        public InputList<string> InterfaceEndpoints
        {
            get => _interfaceEndpoints ?? (_interfaceEndpoints = new InputList<string>());
            set => _interfaceEndpoints = value;
        }

        [Input("privateEndpoints")]
        private InputList<string>? _privateEndpoints;

        /// <summary>
        /// All private endpoints that you have added to this Azure Private Link Service.
        /// </summary>
        public InputList<string> PrivateEndpoints
        {
            get => _privateEndpoints ?? (_privateEndpoints = new InputList<string>());
            set => _privateEndpoints = value;
        }

        /// <summary>
        /// Unique identifier of the AWS PrivateLink connection.
        /// </summary>
        [Input("privateLinkId")]
        public Input<string>? PrivateLinkId { get; set; }

        /// <summary>
        /// Name of the Azure Private Link Service that Atlas manages.
        /// GCP:
        /// </summary>
        [Input("privateLinkServiceName")]
        public Input<string>? PrivateLinkServiceName { get; set; }

        [Input("privateLinkServiceResourceId")]
        public Input<string>? PrivateLinkServiceResourceId { get; set; }

        /// <summary>
        /// Required 	Unique identifier for the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Name of the cloud provider for which you want to create the private endpoint service. Atlas accepts `AWS`, `AZURE` or `GCP`.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Cloud provider region in which you want to create the private endpoint connection.
        /// Accepted values are: [AWS regions](https://docs.atlas.mongodb.com/reference/amazon-aws/#amazon-aws), [AZURE regions](https://docs.atlas.mongodb.com/reference/microsoft-azure/#microsoft-azure) and [GCP regions](https://docs.atlas.mongodb.com/reference/google-gcp/#std-label-google-gcp)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// GCP region for the Private Service Connect endpoint service.
        /// </summary>
        [Input("regionName")]
        public Input<string>? RegionName { get; set; }

        [Input("serviceAttachmentNames")]
        private InputList<string>? _serviceAttachmentNames;

        /// <summary>
        /// Unique alphanumeric and special character strings that identify the service attachments associated with the GCP Private Service Connect endpoint service. Returns an empty list while Atlas creates the service attachments.
        /// </summary>
        public InputList<string> ServiceAttachmentNames
        {
            get => _serviceAttachmentNames ?? (_serviceAttachmentNames = new InputList<string>());
            set => _serviceAttachmentNames = value;
        }

        /// <summary>
        /// Status of the AWS PrivateLink connection or Status of the Azure Private Link Service. Atlas returns one of the following values:
        /// AWS:
        /// * `AVAILABLE` 	Atlas is creating the network load balancer and VPC endpoint service.
        /// * `WAITING_FOR_USER` The Atlas network load balancer and VPC endpoint service are created and ready to receive connection requests. When you receive this status, create an interface endpoint to continue configuring the AWS PrivateLink connection.
        /// * `FAILED` 	A system failure has occurred.
        /// * `DELETING` 	The AWS PrivateLink connection is being deleted.
        /// AZURE:
        /// * `AVAILABLE` 	Atlas created the load balancer and the Private Link Service.
        /// * `INITIATING` 	Atlas is creating the load balancer and the Private Link Service.
        /// * `FAILED` 	Atlas failed to create the load balancer and the Private Link service.
        /// * `DELETING` 	Atlas is deleting the Private Link service.
        /// GCP:
        /// * `AVAILABLE` 	Atlas created the load balancer and the GCP Private Service Connect service.
        /// * `INITIATING` 	Atlas is creating the load balancer and the GCP Private Service Connect service.
        /// * `FAILED`  	Atlas failed to create the load balancer and the GCP Private Service Connect service.
        /// * `DELETING` 	Atlas is deleting the GCP Private Service Connect service.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public PrivateLinkEndpointState()
        {
        }
        public static new PrivateLinkEndpointState Empty => new PrivateLinkEndpointState();
    }
}
