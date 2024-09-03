// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetDataLakePipelines
    {
        /// <summary>
        /// # Data Source: mongodbatlas.getDataLakePipelines
        /// 
        /// `mongodbatlas.getDataLakePipelines` describes Data Lake Pipelines.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Task<GetDataLakePipelinesResult> InvokeAsync(GetDataLakePipelinesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDataLakePipelinesResult>("mongodbatlas:index/getDataLakePipelines:getDataLakePipelines", args ?? new GetDataLakePipelinesArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.getDataLakePipelines
        /// 
        /// `mongodbatlas.getDataLakePipelines` describes Data Lake Pipelines.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Output<GetDataLakePipelinesResult> Invoke(GetDataLakePipelinesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDataLakePipelinesResult>("mongodbatlas:index/getDataLakePipelines:getDataLakePipelines", args ?? new GetDataLakePipelinesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataLakePipelinesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create a data lake pipeline.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetDataLakePipelinesArgs()
        {
        }
        public static new GetDataLakePipelinesArgs Empty => new GetDataLakePipelinesArgs();
    }

    public sealed class GetDataLakePipelinesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to create a data lake pipeline.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetDataLakePipelinesInvokeArgs()
        {
        }
        public static new GetDataLakePipelinesInvokeArgs Empty => new GetDataLakePipelinesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDataLakePipelinesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// * `policyItemId` - Unique 24-hexadecimal character string that identifies a policy item.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Data Lake Pipeline.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakePipelinesResultResult> Results;

        [OutputConstructor]
        private GetDataLakePipelinesResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetDataLakePipelinesResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
