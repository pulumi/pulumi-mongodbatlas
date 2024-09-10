// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetDataLakePipelineRuns
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getDataLakePipelineRuns
        /// 
        /// `mongodbatlas.getDataLakePipelineRun` describes Data Lake Pipeline Runs.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetDataLakePipelineRunsResult> InvokeAsync(GetDataLakePipelineRunsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDataLakePipelineRunsResult>("mongodbatlas:index/getDataLakePipelineRuns:getDataLakePipelineRuns", args ?? new GetDataLakePipelineRunsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getDataLakePipelineRuns
        /// 
        /// `mongodbatlas.getDataLakePipelineRun` describes Data Lake Pipeline Runs.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Output<GetDataLakePipelineRunsResult> Invoke(GetDataLakePipelineRunsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDataLakePipelineRunsResult>("mongodbatlas:index/getDataLakePipelineRuns:getDataLakePipelineRuns", args ?? new GetDataLakePipelineRunsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataLakePipelineRunsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the Data Lake Pipeline.
        /// </summary>
        [Input("pipelineName", required: true)]
        public string PipelineName { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetDataLakePipelineRunsArgs()
        {
        }
        public static new GetDataLakePipelineRunsArgs Empty => new GetDataLakePipelineRunsArgs();
    }

    public sealed class GetDataLakePipelineRunsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the Data Lake Pipeline.
        /// </summary>
        [Input("pipelineName", required: true)]
        public Input<string> PipelineName { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetDataLakePipelineRunsInvokeArgs()
        {
        }
        public static new GetDataLakePipelineRunsInvokeArgs Empty => new GetDataLakePipelineRunsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDataLakePipelineRunsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string PipelineName;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Data Lake Pipeline Run.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakePipelineRunsResultResult> Results;

        [OutputConstructor]
        private GetDataLakePipelineRunsResult(
            string id,

            string pipelineName,

            string projectId,

            ImmutableArray<Outputs.GetDataLakePipelineRunsResultResult> results)
        {
            Id = id;
            PipelineName = pipelineName;
            ProjectId = projectId;
            Results = results;
        }
    }
}