// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetServerlessInstances
    {
        /// <summary>
        /// `mongodbatlas.getServerlessInstances` describe all serverless instances. This represents serverless instances that have been created for the specified group id.
        /// 
        /// &gt; **NOTE:**  Serverless instances do not support some Atlas features at this time.
        /// For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dataServerless = Mongodbatlas.GetServerlessInstances.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetServerlessInstancesResult> InvokeAsync(GetServerlessInstancesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServerlessInstancesResult>("mongodbatlas:index/getServerlessInstances:getServerlessInstances", args ?? new GetServerlessInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getServerlessInstances` describe all serverless instances. This represents serverless instances that have been created for the specified group id.
        /// 
        /// &gt; **NOTE:**  Serverless instances do not support some Atlas features at this time.
        /// For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dataServerless = Mongodbatlas.GetServerlessInstances.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetServerlessInstancesResult> Invoke(GetServerlessInstancesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServerlessInstancesResult>("mongodbatlas:index/getServerlessInstances:getServerlessInstances", args ?? new GetServerlessInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServerlessInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetServerlessInstancesArgs()
        {
        }
        public static new GetServerlessInstancesArgs Empty => new GetServerlessInstancesArgs();
    }

    public sealed class GetServerlessInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetServerlessInstancesInvokeArgs()
        {
        }
        public static new GetServerlessInstancesInvokeArgs Empty => new GetServerlessInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetServerlessInstancesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        /// <summary>
        /// A list where each result represents a Serverless Instance. To learn more, see Serverless Instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServerlessInstancesResultResult> Results;

        [OutputConstructor]
        private GetServerlessInstancesResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetServerlessInstancesResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
