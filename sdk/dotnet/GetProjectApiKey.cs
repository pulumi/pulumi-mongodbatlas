// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetProjectApiKey
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetProjectApiKeyResult> InvokeAsync(GetProjectApiKeyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectApiKeyResult>("mongodbatlas:index/getProjectApiKey:getProjectApiKey", args ?? new GetProjectApiKeyArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetProjectApiKeyResult> Invoke(GetProjectApiKeyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectApiKeyResult>("mongodbatlas:index/getProjectApiKey:getProjectApiKey", args ?? new GetProjectApiKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectApiKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for this Project API key.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public string ApiKeyId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectApiKeyArgs()
        {
        }
        public static new GetProjectApiKeyArgs Empty => new GetProjectApiKeyArgs();
    }

    public sealed class GetProjectApiKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for this Project API key.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public Input<string> ApiKeyId { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetProjectApiKeyInvokeArgs()
        {
        }
        public static new GetProjectApiKeyInvokeArgs Empty => new GetProjectApiKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectApiKeyResult
    {
        public readonly string ApiKeyId;
        /// <summary>
        /// Description of this Project API key.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Private key for this Organization API key.
        /// </summary>
        public readonly string PrivateKey;
        public readonly ImmutableArray<Outputs.GetProjectApiKeyProjectAssignmentResult> ProjectAssignments;
        /// <summary>
        /// Project ID to assign to Access Key
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Public key for this Organization API key.
        /// </summary>
        public readonly string PublicKey;

        [OutputConstructor]
        private GetProjectApiKeyResult(
            string apiKeyId,

            string description,

            string id,

            string privateKey,

            ImmutableArray<Outputs.GetProjectApiKeyProjectAssignmentResult> projectAssignments,

            string projectId,

            string publicKey)
        {
            ApiKeyId = apiKeyId;
            Description = description;
            Id = id;
            PrivateKey = privateKey;
            ProjectAssignments = projectAssignments;
            ProjectId = projectId;
            PublicKey = publicKey;
        }
    }
}
