// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetClusterOutageSimulation
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var outageSimulation = Mongodbatlas.GetClusterOutageSimulation.Invoke(new()
        ///     {
        ///         ClusterName = "Cluster0",
        ///         ProjectId = "64707f06c519c20c3a2b1b03",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetClusterOutageSimulationResult> InvokeAsync(GetClusterOutageSimulationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClusterOutageSimulationResult>("mongodbatlas:index/getClusterOutageSimulation:getClusterOutageSimulation", args ?? new GetClusterOutageSimulationArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var outageSimulation = Mongodbatlas.GetClusterOutageSimulation.Invoke(new()
        ///     {
        ///         ClusterName = "Cluster0",
        ///         ProjectId = "64707f06c519c20c3a2b1b03",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetClusterOutageSimulationResult> Invoke(GetClusterOutageSimulationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClusterOutageSimulationResult>("mongodbatlas:index/getClusterOutageSimulation:getClusterOutageSimulation", args ?? new GetClusterOutageSimulationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClusterOutageSimulationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas Cluster that is undergoing outage simulation.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project that contains the cluster that is undergoing outage simulation.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetClusterOutageSimulationArgs()
        {
        }
        public static new GetClusterOutageSimulationArgs Empty => new GetClusterOutageSimulationArgs();
    }

    public sealed class GetClusterOutageSimulationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas Cluster that is undergoing outage simulation.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project that contains the cluster that is undergoing outage simulation.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetClusterOutageSimulationInvokeArgs()
        {
        }
        public static new GetClusterOutageSimulationInvokeArgs Empty => new GetClusterOutageSimulationInvokeArgs();
    }


    [OutputType]
    public sealed class GetClusterOutageSimulationResult
    {
        public readonly string ClusterName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of settings that specify the type of cluster outage simulation.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClusterOutageSimulationOutageFilterResult> OutageFilters;
        public readonly string ProjectId;
        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the outage simulation.
        /// </summary>
        public readonly string SimulationId;
        /// <summary>
        /// Date and time when MongoDB Cloud started the regional outage simulation.
        /// </summary>
        public readonly string StartRequestDate;
        /// <summary>
        /// Current phase of the outage simulation:
        /// </summary>
        public readonly string State;

        [OutputConstructor]
        private GetClusterOutageSimulationResult(
            string clusterName,

            string id,

            ImmutableArray<Outputs.GetClusterOutageSimulationOutageFilterResult> outageFilters,

            string projectId,

            string simulationId,

            string startRequestDate,

            string state)
        {
            ClusterName = clusterName;
            Id = id;
            OutageFilters = outageFilters;
            ProjectId = projectId;
            SimulationId = simulationId;
            StartRequestDate = startRequestDate;
            State = state;
        }
    }
}
