// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAccessListApiKey
    {
        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Task<GetAccessListApiKeyResult> InvokeAsync(GetAccessListApiKeyArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessListApiKeyResult>("mongodbatlas:index/getAccessListApiKey:getAccessListApiKey", args ?? new GetAccessListApiKeyArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetAccessListApiKeyResult> Invoke(GetAccessListApiKeyInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessListApiKeyResult>("mongodbatlas:index/getAccessListApiKey:getAccessListApiKey", args ?? new GetAccessListApiKeyInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// </summary>
        public static Output<GetAccessListApiKeyResult> Invoke(GetAccessListApiKeyInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessListApiKeyResult>("mongodbatlas:index/getAccessListApiKey:getAccessListApiKey", args ?? new GetAccessListApiKeyInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessListApiKeyArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
        /// *
        /// -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don't set both.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public string ApiKeyId { get; set; } = null!;

        /// <summary>
        /// Single IP address to be added to the access list.
        /// </summary>
        [Input("ipAddress", required: true)]
        public string IpAddress { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetAccessListApiKeyArgs()
        {
        }
        public static new GetAccessListApiKeyArgs Empty => new GetAccessListApiKeyArgs();
    }

    public sealed class GetAccessListApiKeyInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
        /// *
        /// -&gt;**NOTE:** You must set either the `cidr_block` attribute or the `ip_address` attribute. Don't set both.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public Input<string> ApiKeyId { get; set; } = null!;

        /// <summary>
        /// Single IP address to be added to the access list.
        /// </summary>
        [Input("ipAddress", required: true)]
        public Input<string> IpAddress { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetAccessListApiKeyInvokeArgs()
        {
        }
        public static new GetAccessListApiKeyInvokeArgs Empty => new GetAccessListApiKeyInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessListApiKeyResult
    {
        public readonly int AccessCount;
        public readonly string ApiKeyId;
        public readonly string CidrBlock;
        public readonly string Created;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string IpAddress;
        public readonly string LastUsed;
        public readonly string LastUsedAddress;
        public readonly string OrgId;

        [OutputConstructor]
        private GetAccessListApiKeyResult(
            int accessCount,

            string apiKeyId,

            string cidrBlock,

            string created,

            string id,

            string ipAddress,

            string lastUsed,

            string lastUsedAddress,

            string orgId)
        {
            AccessCount = accessCount;
            ApiKeyId = apiKeyId;
            CidrBlock = cidrBlock;
            Created = created;
            Id = id;
            IpAddress = ipAddress;
            LastUsed = lastUsed;
            LastUsedAddress = lastUsedAddress;
            OrgId = orgId;
        }
    }
}
