// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFlexSnapshots
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getFlexSnapshots
        /// 
        /// `mongodbatlas.getFlexSnapshots` returns all snapshots of a flex cluster.
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = Mongodbatlas.GetFlexSnapshot.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         Name = example_cluster.Name,
        ///         SnapshotId = snapshotId,
        ///     });
        /// 
        ///     var snapshots = Mongodbatlas.GetFlexSnapshots.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         Name = example_cluster.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbatlasFlexSnapshot"] = snapshot.Apply(getFlexSnapshotResult =&gt; getFlexSnapshotResult.Name),
        ///         ["mongodbatlasFlexSnapshots"] = .Select(snapshot =&gt; 
        ///         {
        ///             return snapshot.Apply(getFlexSnapshotResult =&gt; getFlexSnapshotResult.SnapshotId);
        ///         }).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetFlexSnapshotsResult> InvokeAsync(GetFlexSnapshotsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlexSnapshotsResult>("mongodbatlas:index/getFlexSnapshots:getFlexSnapshots", args ?? new GetFlexSnapshotsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getFlexSnapshots
        /// 
        /// `mongodbatlas.getFlexSnapshots` returns all snapshots of a flex cluster.
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = Mongodbatlas.GetFlexSnapshot.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         Name = example_cluster.Name,
        ///         SnapshotId = snapshotId,
        ///     });
        /// 
        ///     var snapshots = Mongodbatlas.GetFlexSnapshots.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         Name = example_cluster.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbatlasFlexSnapshot"] = snapshot.Apply(getFlexSnapshotResult =&gt; getFlexSnapshotResult.Name),
        ///         ["mongodbatlasFlexSnapshots"] = .Select(snapshot =&gt; 
        ///         {
        ///             return snapshot.Apply(getFlexSnapshotResult =&gt; getFlexSnapshotResult.SnapshotId);
        ///         }).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlexSnapshotsResult> Invoke(GetFlexSnapshotsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlexSnapshotsResult>("mongodbatlas:index/getFlexSnapshots:getFlexSnapshots", args ?? new GetFlexSnapshotsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getFlexSnapshots
        /// 
        /// `mongodbatlas.getFlexSnapshots` returns all snapshots of a flex cluster.
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snapshot = Mongodbatlas.GetFlexSnapshot.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         Name = example_cluster.Name,
        ///         SnapshotId = snapshotId,
        ///     });
        /// 
        ///     var snapshots = Mongodbatlas.GetFlexSnapshots.Invoke(new()
        ///     {
        ///         ProjectId = projectId,
        ///         Name = example_cluster.Name,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["mongodbatlasFlexSnapshot"] = snapshot.Apply(getFlexSnapshotResult =&gt; getFlexSnapshotResult.Name),
        ///         ["mongodbatlasFlexSnapshots"] = .Select(snapshot =&gt; 
        ///         {
        ///             return snapshot.Apply(getFlexSnapshotResult =&gt; getFlexSnapshotResult.SnapshotId);
        ///         }).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlexSnapshotsResult> Invoke(GetFlexSnapshotsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlexSnapshotsResult>("mongodbatlas:index/getFlexSnapshots:getFlexSnapshots", args ?? new GetFlexSnapshotsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlexSnapshotsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetFlexSnapshotsArgs()
        {
        }
        public static new GetFlexSnapshotsArgs Empty => new GetFlexSnapshotsArgs();
    }

    public sealed class GetFlexSnapshotsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetFlexSnapshotsInvokeArgs()
        {
        }
        public static new GetFlexSnapshotsInvokeArgs Empty => new GetFlexSnapshotsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlexSnapshotsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Human-readable label that identifies the flex cluster whose snapshot you want to restore.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        /// </summary>
        public readonly string ProjectId;
        public readonly ImmutableArray<Outputs.GetFlexSnapshotsResultResult> Results;

        [OutputConstructor]
        private GetFlexSnapshotsResult(
            string id,

            string name,

            string projectId,

            ImmutableArray<Outputs.GetFlexSnapshotsResultResult> results)
        {
            Id = id;
            Name = name;
            ProjectId = projectId;
            Results = results;
        }
    }
}
