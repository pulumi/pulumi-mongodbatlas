// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetDataLakes
    {
        /// <summary>
        /// `mongodbatlas.getDataLakes` describe all Data Lakes.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetDataLakes.Invoke(new()
        ///     {
        ///         ProjectId = "PROJECT ID",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDataLakesResult> InvokeAsync(GetDataLakesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDataLakesResult>("mongodbatlas:index/getDataLakes:getDataLakes", args ?? new GetDataLakesArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getDataLakes` describe all Data Lakes.
        /// 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Mongodbatlas.GetDataLakes.Invoke(new()
        ///     {
        ///         ProjectId = "PROJECT ID",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDataLakesResult> Invoke(GetDataLakesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDataLakesResult>("mongodbatlas:index/getDataLakes:getDataLakes", args ?? new GetDataLakesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataLakesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all data lakes.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetDataLakesArgs()
        {
        }
        public static new GetDataLakesArgs Empty => new GetDataLakesArgs();
    }

    public sealed class GetDataLakesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all data lakes.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetDataLakesInvokeArgs()
        {
        }
        public static new GetDataLakesInvokeArgs Empty => new GetDataLakesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDataLakesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Data lake.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakesResultResult> Results;

        [OutputConstructor]
        private GetDataLakesResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetDataLakesResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
