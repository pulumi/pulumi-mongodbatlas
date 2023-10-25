// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedQueryLimit
    {
        /// <summary>
        /// ## Data Source: mongodbatlas.FederatedQueryLimit
        /// 
        /// `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/. 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Task<GetFederatedQueryLimitResult> InvokeAsync(GetFederatedQueryLimitArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedQueryLimitResult>("mongodbatlas:index/getFederatedQueryLimit:getFederatedQueryLimit", args ?? new GetFederatedQueryLimitArgs(), options.WithDefaults());

        /// <summary>
        /// ## Data Source: mongodbatlas.FederatedQueryLimit
        /// 
        /// `mongodbatlas.FederatedQueryLimit` provides a Federated Database Instance Query Limit data source. To learn more about Atlas Data Federation see https://www.mongodb.com/docs/atlas/data-federation/overview/. 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Output<GetFederatedQueryLimitResult> Invoke(GetFederatedQueryLimitInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedQueryLimitResult>("mongodbatlas:index/getFederatedQueryLimit:getFederatedQueryLimit", args ?? new GetFederatedQueryLimitInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedQueryLimitArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// String enum that indicates whether the identity provider is active or not. Accepted values are:
        /// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        /// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        /// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        /// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        /// </summary>
        [Input("limitName", required: true)]
        public string LimitName { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("tenantName", required: true)]
        public string TenantName { get; set; } = null!;

        public GetFederatedQueryLimitArgs()
        {
        }
        public static new GetFederatedQueryLimitArgs Empty => new GetFederatedQueryLimitArgs();
    }

    public sealed class GetFederatedQueryLimitInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// String enum that indicates whether the identity provider is active or not. Accepted values are:
        /// * `bytesProcessed.query`: Limit on the number of bytes processed during a single data federation query.
        /// * `bytesProcessed.daily`: Limit on the number of bytes processed for the data federation instance for the current day.
        /// * `bytesProcessed.weekly`: Limit on the number of bytes processed for the data federation instance for the current week.
        /// * `bytesProcessed.monthly`: Limit on the number of bytes processed for the data federation instance for the current month.
        /// </summary>
        [Input("limitName", required: true)]
        public Input<string> LimitName { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("tenantName", required: true)]
        public Input<string> TenantName { get; set; } = null!;

        public GetFederatedQueryLimitInvokeArgs()
        {
        }
        public static new GetFederatedQueryLimitInvokeArgs Empty => new GetFederatedQueryLimitInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedQueryLimitResult
    {
        /// <summary>
        /// Amount that indicates the current usage of the limit.
        /// </summary>
        public readonly int CurrentUsage;
        /// <summary>
        /// Default value of the limit.
        /// </summary>
        public readonly int DefaultLimit;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string LastModifiedDate;
        public readonly string LimitName;
        public readonly int MaximumLimit;
        public readonly string OverrunPolicy;
        public readonly string ProjectId;
        public readonly string TenantName;
        public readonly int Value;

        [OutputConstructor]
        private GetFederatedQueryLimitResult(
            int currentUsage,

            int defaultLimit,

            string id,

            string lastModifiedDate,

            string limitName,

            int maximumLimit,

            string overrunPolicy,

            string projectId,

            string tenantName,

            int value)
        {
            CurrentUsage = currentUsage;
            DefaultLimit = defaultLimit;
            Id = id;
            LastModifiedDate = lastModifiedDate;
            LimitName = limitName;
            MaximumLimit = maximumLimit;
            OverrunPolicy = overrunPolicy;
            ProjectId = projectId;
            TenantName = tenantName;
            Value = value;
        }
    }
}
