// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.ClusterOutageSimulation` provides a Cluster Outage Simulation resource. For more details see https://www.mongodb.com/docs/atlas/tutorial/test-resilience/simulate-regional-outage/
    /// 
    /// Test Outage on Minority of Electable Nodes - Select fewer than half of your electable nodes.
    /// 
    /// Test Outage on Majority of Electable Nodes - Select at least one more than half of your electable nodes and keep at least one electable node remaining.
    /// 
    /// **IMPORTANT:** Test Outage on Majority of Electable Nodes will leave the Atlas cluster without a majority quorum. There will be no primary so write operations will not succeed, and reads will succeed only when configured with a suitable [readPreference](https://www.mongodb.com/docs/manual/core/read-preference/). To recover the majority quorum, you will have the option to manually reconfigure your cluster by adding new nodes to existing regions or adding new regions at the risk of losing recent writes, or end the simulation.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// &gt; **IMPORTANT:** This resource cannot be updated.
    /// **IMPORTANT:** An existing Cluster Outage Simulation cannot be imported as this resource does not support import operation.
    /// 
    /// ## Example Usage
    /// ### S
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var outageSimulation = new Mongodbatlas.ClusterOutageSimulation("outageSimulation", new()
    ///     {
    ///         ClusterName = "Cluster0",
    ///         OutageFilters = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.ClusterOutageSimulationOutageFilterArgs
    ///             {
    ///                 CloudProvider = "AWS",
    ///                 RegionName = "US_EAST_1",
    ///             },
    ///             new Mongodbatlas.Inputs.ClusterOutageSimulationOutageFilterArgs
    ///             {
    ///                 CloudProvider = "AWS",
    ///                 RegionName = "US_EAST_2",
    ///             },
    ///         },
    ///         ProjectId = "64707f06c519c20c3a2b1b03",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// The `mongodbatlas_cluster_outage_simulation` resource does not support import operation. See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cluster-Outage-Simulation) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation")]
    public partial class ClusterOutageSimulation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the Atlas Cluster that is/will undergoing outage simulation.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// (Minimum one required) List of settings that specify the type of cluster outage simulation.
        /// </summary>
        [Output("outageFilters")]
        public Output<ImmutableArray<Outputs.ClusterOutageSimulationOutageFilter>> OutageFilters { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the outage simulation.
        /// </summary>
        [Output("simulationId")]
        public Output<string> SimulationId { get; private set; } = null!;

        /// <summary>
        /// Date and time when MongoDB Cloud started the regional outage simulation.
        /// </summary>
        [Output("startRequestDate")]
        public Output<string> StartRequestDate { get; private set; } = null!;

        /// <summary>
        /// Current phase of the outage simulation:
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterOutageSimulation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterOutageSimulation(string name, ClusterOutageSimulationArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation", name, args ?? new ClusterOutageSimulationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterOutageSimulation(string name, Input<string> id, ClusterOutageSimulationState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ClusterOutageSimulation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterOutageSimulation Get(string name, Input<string> id, ClusterOutageSimulationState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterOutageSimulation(name, id, state, options);
        }
    }

    public sealed class ClusterOutageSimulationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Atlas Cluster that is/will undergoing outage simulation.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        [Input("outageFilters", required: true)]
        private InputList<Inputs.ClusterOutageSimulationOutageFilterArgs>? _outageFilters;

        /// <summary>
        /// (Minimum one required) List of settings that specify the type of cluster outage simulation.
        /// </summary>
        public InputList<Inputs.ClusterOutageSimulationOutageFilterArgs> OutageFilters
        {
            get => _outageFilters ?? (_outageFilters = new InputList<Inputs.ClusterOutageSimulationOutageFilterArgs>());
            set => _outageFilters = value;
        }

        /// <summary>
        /// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public ClusterOutageSimulationArgs()
        {
        }
        public static new ClusterOutageSimulationArgs Empty => new ClusterOutageSimulationArgs();
    }

    public sealed class ClusterOutageSimulationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Atlas Cluster that is/will undergoing outage simulation.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("outageFilters")]
        private InputList<Inputs.ClusterOutageSimulationOutageFilterGetArgs>? _outageFilters;

        /// <summary>
        /// (Minimum one required) List of settings that specify the type of cluster outage simulation.
        /// </summary>
        public InputList<Inputs.ClusterOutageSimulationOutageFilterGetArgs> OutageFilters
        {
            get => _outageFilters ?? (_outageFilters = new InputList<Inputs.ClusterOutageSimulationOutageFilterGetArgs>());
            set => _outageFilters = value;
        }

        /// <summary>
        /// The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the outage simulation.
        /// </summary>
        [Input("simulationId")]
        public Input<string>? SimulationId { get; set; }

        /// <summary>
        /// Date and time when MongoDB Cloud started the regional outage simulation.
        /// </summary>
        [Input("startRequestDate")]
        public Input<string>? StartRequestDate { get; set; }

        /// <summary>
        /// Current phase of the outage simulation:
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public ClusterOutageSimulationState()
        {
        }
        public static new ClusterOutageSimulationState Empty => new ClusterOutageSimulationState();
    }
}
