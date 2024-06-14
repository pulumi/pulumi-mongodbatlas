// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedDatabaseInstances
    {
        /// <summary>
        /// `mongodbatlas_federated_database_instancess` provides a Federated Database Instance data source.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Task<GetFederatedDatabaseInstancesResult> InvokeAsync(GetFederatedDatabaseInstancesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedDatabaseInstancesResult>("mongodbatlas:index/getFederatedDatabaseInstances:getFederatedDatabaseInstances", args ?? new GetFederatedDatabaseInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas_federated_database_instancess` provides a Federated Database Instance data source.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// &gt; **IMPORTANT:** All arguments including the password will be stored in the raw state as plain text. Read more about sensitive data in state.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Output<GetFederatedDatabaseInstancesResult> Invoke(GetFederatedDatabaseInstancesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedDatabaseInstancesResult>("mongodbatlas:index/getFederatedDatabaseInstances:getFederatedDatabaseInstances", args ?? new GetFederatedDatabaseInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedDatabaseInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetFederatedDatabaseInstancesArgs()
        {
        }
        public static new GetFederatedDatabaseInstancesArgs Empty => new GetFederatedDatabaseInstancesArgs();
    }

    public sealed class GetFederatedDatabaseInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetFederatedDatabaseInstancesInvokeArgs()
        {
        }
        public static new GetFederatedDatabaseInstancesInvokeArgs Empty => new GetFederatedDatabaseInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedDatabaseInstancesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// Includes Federated Database instance for each item detailed in the results array section.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFederatedDatabaseInstancesResultResult> Results;

        [OutputConstructor]
        private GetFederatedDatabaseInstancesResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetFederatedDatabaseInstancesResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}