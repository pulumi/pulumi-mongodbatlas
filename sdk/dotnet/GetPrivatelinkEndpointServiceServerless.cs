// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetPrivatelinkEndpointServiceServerless
    {
        /// <summary>
        /// `privatelink_endpoint_service_serverless` Provides a Serverless PrivateLink Endpoint Service resource.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example with AWS
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("testServerlessInstance", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         ProviderSettingsBackingProviderName = "AWS",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST_1",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = Mongodbatlas.GetPrivatelinkEndpointServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///     });
        /// 
        ///     var testIndex_privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("testIndex/privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
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
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("testServerlessInstance", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         ProviderSettingsBackingProviderName = "AZURE",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AZURE",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = Mongodbatlas.GetPrivatelinkEndpointServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///     });
        /// 
        ///     var testIndex_privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("testIndex/privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///         ProviderName = "AZURE",
        ///         Comment = "New serverless endpoint",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Available complete examples
        /// - Setup private connection to a MongoDB Atlas Serverless Instance with AWS VPC
        /// </summary>
        public static Task<GetPrivatelinkEndpointServiceServerlessResult> InvokeAsync(GetPrivatelinkEndpointServiceServerlessArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivatelinkEndpointServiceServerlessResult>("mongodbatlas:index/getPrivatelinkEndpointServiceServerless:getPrivatelinkEndpointServiceServerless", args ?? new GetPrivatelinkEndpointServiceServerlessArgs(), options.WithDefaults());

        /// <summary>
        /// `privatelink_endpoint_service_serverless` Provides a Serverless PrivateLink Endpoint Service resource.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example with AWS
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("testServerlessInstance", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         ProviderSettingsBackingProviderName = "AWS",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST_1",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = Mongodbatlas.GetPrivatelinkEndpointServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///     });
        /// 
        ///     var testIndex_privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("testIndex/privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
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
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testServerlessInstance = new Mongodbatlas.ServerlessInstance("testServerlessInstance", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         ProviderSettingsBackingProviderName = "AZURE",
        ///         ProviderSettingsProviderName = "SERVERLESS",
        ///         ProviderSettingsRegionName = "US_EAST",
        ///         ContinuousBackupEnabled = true,
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServerless = new Mongodbatlas.PrivatelinkEndpointServerless("testPrivatelinkEndpointServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         ProviderName = "AZURE",
        ///     });
        /// 
        ///     var testPrivatelinkEndpointServiceServerless = Mongodbatlas.GetPrivatelinkEndpointServiceServerless.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = testServerlessInstance.Name,
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///     });
        /// 
        ///     var testIndex_privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless = new Mongodbatlas.PrivatelinkEndpointServiceServerless("testIndex/privatelinkEndpointServiceServerlessPrivatelinkEndpointServiceServerless", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "test-db",
        ///         EndpointId = testPrivatelinkEndpointServerless.EndpointId,
        ///         ProviderName = "AZURE",
        ///         Comment = "New serverless endpoint",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Available complete examples
        /// - Setup private connection to a MongoDB Atlas Serverless Instance with AWS VPC
        /// </summary>
        public static Output<GetPrivatelinkEndpointServiceServerlessResult> Invoke(GetPrivatelinkEndpointServiceServerlessInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivatelinkEndpointServiceServerlessResult>("mongodbatlas:index/getPrivatelinkEndpointServiceServerless:getPrivatelinkEndpointServiceServerless", args ?? new GetPrivatelinkEndpointServiceServerlessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivatelinkEndpointServiceServerlessArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [AWS PrivateLink](https://aws.amazon.com/privatelink/) feature.
        /// </summary>
        [Input("endpointId", required: true)]
        public string EndpointId { get; set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the serverless instance
        /// </summary>
        [Input("instanceName", required: true)]
        public string InstanceName { get; set; } = null!;

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceServerlessArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceServerlessArgs Empty => new GetPrivatelinkEndpointServiceServerlessArgs();
    }

    public sealed class GetPrivatelinkEndpointServiceServerlessInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. Atlas supports AWS private endpoints using the [AWS PrivateLink](https://aws.amazon.com/privatelink/) feature.
        /// </summary>
        [Input("endpointId", required: true)]
        public Input<string> EndpointId { get; set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the serverless instance
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// Unique 24-digit hexadecimal string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetPrivatelinkEndpointServiceServerlessInvokeArgs()
        {
        }
        public static new GetPrivatelinkEndpointServiceServerlessInvokeArgs Empty => new GetPrivatelinkEndpointServiceServerlessInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivatelinkEndpointServiceServerlessResult
    {
        public readonly string CloudProviderEndpointId;
        public readonly string Comment;
        public readonly string EndpointId;
        /// <summary>
        /// Unique string that identifies the PrivateLink endpoint service. MongoDB Cloud returns null while it creates the endpoint service.
        /// </summary>
        public readonly string EndpointServiceName;
        public readonly string ErrorMessage;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceName;
        /// <summary>
        /// IPv4 address of the private endpoint in your Azure VNet that someone added to this private endpoint service.
        /// </summary>
        public readonly string PrivateEndpointIpAddress;
        /// <summary>
        /// Root-relative path that identifies the Azure Private Link Service that MongoDB Cloud manages.
        /// </summary>
        public readonly string PrivateLinkServiceResourceId;
        public readonly string ProjectId;
        /// <summary>
        /// Human-readable label that indicates the current operating status of the private endpoint. Values include: RESERVATION_REQUESTED, RESERVED, INITIATING, AVAILABLE, FAILED, DELETING.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetPrivatelinkEndpointServiceServerlessResult(
            string cloudProviderEndpointId,

            string comment,

            string endpointId,

            string endpointServiceName,

            string errorMessage,

            string id,

            string instanceName,

            string privateEndpointIpAddress,

            string privateLinkServiceResourceId,

            string projectId,

            string status)
        {
            CloudProviderEndpointId = cloudProviderEndpointId;
            Comment = comment;
            EndpointId = endpointId;
            EndpointServiceName = endpointServiceName;
            ErrorMessage = errorMessage;
            Id = id;
            InstanceName = instanceName;
            PrivateEndpointIpAddress = privateEndpointIpAddress;
            PrivateLinkServiceResourceId = privateLinkServiceResourceId;
            ProjectId = projectId;
            Status = status;
        }
    }
}
