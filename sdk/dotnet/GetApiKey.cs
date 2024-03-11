// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetApiKey
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetApiKeyResult> InvokeAsync(GetApiKeyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetApiKeyResult>("mongodbatlas:index/getApiKey:getApiKey", args ?? new GetApiKeyArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetApiKeyResult> Invoke(GetApiKeyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetApiKeyResult>("mongodbatlas:index/getApiKey:getApiKey", args ?? new GetApiKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetApiKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the organization API key.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public string ApiKeyId { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetApiKeyArgs()
        {
        }
        public static new GetApiKeyArgs Empty => new GetApiKeyArgs();
    }

    public sealed class GetApiKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the organization API key.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public Input<string> ApiKeyId { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetApiKeyInvokeArgs()
        {
        }
        public static new GetApiKeyInvokeArgs Empty => new GetApiKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetApiKeyResult
    {
        public readonly string ApiKeyId;
        /// <summary>
        /// Description of this Organization API key.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string OrgId;
        /// <summary>
        /// Public key for this Organization API key.
        /// </summary>
        public readonly string PublicKey;
        /// <summary>
        /// Name of the role. This resource returns all the roles the user has in Atlas.
        /// The following are valid roles:
        /// </summary>
        public readonly ImmutableArray<string> RoleNames;

        [OutputConstructor]
        private GetApiKeyResult(
            string apiKeyId,

            string description,

            string id,

            string orgId,

            string publicKey,

            ImmutableArray<string> roleNames)
        {
            ApiKeyId = apiKeyId;
            Description = description;
            Id = id;
            OrgId = orgId;
            PublicKey = publicKey;
            RoleNames = roleNames;
        }
    }
}
