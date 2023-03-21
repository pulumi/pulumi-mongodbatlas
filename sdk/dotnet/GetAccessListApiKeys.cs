// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAccessListApiKeys
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccessListApiKeysResult> InvokeAsync(GetAccessListApiKeysArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessListApiKeysResult>("mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys", args ?? new GetAccessListApiKeysArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccessListApiKeysResult> Invoke(GetAccessListApiKeysInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessListApiKeysResult>("mongodbatlas:index/getAccessListApiKeys:getAccessListApiKeys", args ?? new GetAccessListApiKeysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessListApiKeysArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
        /// *
        /// &gt; **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address`.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public string ApiKeyId { get; set; } = null!;

        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        /// <summary>
        /// Unique identifier for the Organization to which you want to retrieve one or more access list entries.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public int? PageNum { get; set; }

        public GetAccessListApiKeysArgs()
        {
        }
        public static new GetAccessListApiKeysArgs Empty => new GetAccessListApiKeysArgs();
    }

    public sealed class GetAccessListApiKeysInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the Organization API Key for which you want to retrieve an access list entry.
        /// *
        /// &gt; **NOTE:** One of the following attributes must set: `cidr_block`  or `ip_address`.
        /// </summary>
        [Input("apiKeyId", required: true)]
        public Input<string> ApiKeyId { get; set; } = null!;

        /// <summary>
        /// Number of items to return per page, up to a maximum of 500. Defaults to `100`.
        /// </summary>
        [Input("itemsPerPage")]
        public Input<int>? ItemsPerPage { get; set; }

        /// <summary>
        /// Unique identifier for the Organization to which you want to retrieve one or more access list entries.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// The page to return. Defaults to `1`.
        /// </summary>
        [Input("pageNum")]
        public Input<int>? PageNum { get; set; }

        public GetAccessListApiKeysInvokeArgs()
        {
        }
        public static new GetAccessListApiKeysInvokeArgs Empty => new GetAccessListApiKeysInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessListApiKeysResult
    {
        public readonly string ApiKeyId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int? ItemsPerPage;
        public readonly string OrgId;
        public readonly int? PageNum;
        public readonly ImmutableArray<Outputs.GetAccessListApiKeysResultResult> Results;

        [OutputConstructor]
        private GetAccessListApiKeysResult(
            string apiKeyId,

            string id,

            int? itemsPerPage,

            string orgId,

            int? pageNum,

            ImmutableArray<Outputs.GetAccessListApiKeysResultResult> results)
        {
            ApiKeyId = apiKeyId;
            Id = id;
            ItemsPerPage = itemsPerPage;
            OrgId = orgId;
            PageNum = pageNum;
            Results = results;
        }
    }
}