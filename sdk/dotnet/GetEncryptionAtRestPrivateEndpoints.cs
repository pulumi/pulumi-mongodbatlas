// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetEncryptionAtRestPrivateEndpoints
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getEncryptionAtRestPrivateEndpoints
        /// 
        /// `mongodbatlas.getEncryptionAtRestPrivateEndpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.
        /// 
        /// &gt; **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager. 
        /// To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// &gt; **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var plural = Mongodbatlas.GetEncryptionAtRestPrivateEndpoints.Invoke(new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         CloudProvider = "AZURE",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["numberOfEndpoints"] = plural.Apply(getEncryptionAtRestPrivateEndpointsResult =&gt; getEncryptionAtRestPrivateEndpointsResult.Results).Length,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEncryptionAtRestPrivateEndpointsResult> InvokeAsync(GetEncryptionAtRestPrivateEndpointsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEncryptionAtRestPrivateEndpointsResult>("mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints", args ?? new GetEncryptionAtRestPrivateEndpointsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getEncryptionAtRestPrivateEndpoints
        /// 
        /// `mongodbatlas.getEncryptionAtRestPrivateEndpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.
        /// 
        /// &gt; **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager. 
        /// To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// &gt; **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var plural = Mongodbatlas.GetEncryptionAtRestPrivateEndpoints.Invoke(new()
        ///     {
        ///         ProjectId = atlasProjectId,
        ///         CloudProvider = "AZURE",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["numberOfEndpoints"] = plural.Apply(getEncryptionAtRestPrivateEndpointsResult =&gt; getEncryptionAtRestPrivateEndpointsResult.Results).Length,
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEncryptionAtRestPrivateEndpointsResult> Invoke(GetEncryptionAtRestPrivateEndpointsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEncryptionAtRestPrivateEndpointsResult>("mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints", args ?? new GetEncryptionAtRestPrivateEndpointsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEncryptionAtRestPrivateEndpointsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Label that identifies the cloud provider of the private endpoint.
        /// </summary>
        [Input("cloudProvider", required: true)]
        public string CloudProvider { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetEncryptionAtRestPrivateEndpointsArgs()
        {
        }
        public static new GetEncryptionAtRestPrivateEndpointsArgs Empty => new GetEncryptionAtRestPrivateEndpointsArgs();
    }

    public sealed class GetEncryptionAtRestPrivateEndpointsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Label that identifies the cloud provider of the private endpoint.
        /// </summary>
        [Input("cloudProvider", required: true)]
        public Input<string> CloudProvider { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetEncryptionAtRestPrivateEndpointsInvokeArgs()
        {
        }
        public static new GetEncryptionAtRestPrivateEndpointsInvokeArgs Empty => new GetEncryptionAtRestPrivateEndpointsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEncryptionAtRestPrivateEndpointsResult
    {
        /// <summary>
        /// Label that identifies the cloud provider of the private endpoint.
        /// </summary>
        public readonly string CloudProvider;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// List of returned documents that MongoDB Cloud providers when completing this request.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEncryptionAtRestPrivateEndpointsResultResult> Results;

        [OutputConstructor]
        private GetEncryptionAtRestPrivateEndpointsResult(
            string cloudProvider,

            string id,

            string projectId,

            ImmutableArray<Outputs.GetEncryptionAtRestPrivateEndpointsResultResult> results)
        {
            CloudProvider = cloudProvider;
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
