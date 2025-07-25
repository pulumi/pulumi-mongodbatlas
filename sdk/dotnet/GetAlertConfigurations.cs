// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetAlertConfigurations
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.getAlertConfigurations
        /// 
        /// `mongodbatlas.getAlertConfigurations` describes all Alert Configurations by the provided project_id. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Task<GetAlertConfigurationsResult> InvokeAsync(GetAlertConfigurationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlertConfigurationsResult>("mongodbatlas:index/getAlertConfigurations:getAlertConfigurations", args ?? new GetAlertConfigurationsArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getAlertConfigurations
        /// 
        /// `mongodbatlas.getAlertConfigurations` describes all Alert Configurations by the provided project_id. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Output<GetAlertConfigurationsResult> Invoke(GetAlertConfigurationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlertConfigurationsResult>("mongodbatlas:index/getAlertConfigurations:getAlertConfigurations", args ?? new GetAlertConfigurationsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.getAlertConfigurations
        /// 
        /// `mongodbatlas.getAlertConfigurations` describes all Alert Configurations by the provided project_id. The data source requires your Project ID.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// </summary>
        public static Output<GetAlertConfigurationsResult> Invoke(GetAlertConfigurationsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlertConfigurationsResult>("mongodbatlas:index/getAlertConfigurations:getAlertConfigurations", args ?? new GetAlertConfigurationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlertConfigurationsArgs : global::Pulumi.InvokeArgs
    {
        [Input("listOptions")]
        private List<Inputs.GetAlertConfigurationsListOptionArgs>? _listOptions;

        /// <summary>
        /// Arguments that dictate how many and which results are returned by the data source
        /// * `list_options.page_num` - Which page of results to retrieve (default to first page)
        /// * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
        /// * `list_options.include_count` - Whether to include total count of results in the response (default false)
        /// </summary>
        public List<Inputs.GetAlertConfigurationsListOptionArgs> ListOptions
        {
            get => _listOptions ?? (_listOptions = new List<Inputs.GetAlertConfigurationsListOptionArgs>());
            set => _listOptions = value;
        }

        [Input("outputTypes")]
        private List<string>? _outputTypes;

        /// <summary>
        /// List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
        /// </summary>
        public List<string> OutputTypes
        {
            get => _outputTypes ?? (_outputTypes = new List<string>());
            set => _outputTypes = value;
        }

        /// <summary>
        /// The unique ID for the project to get the alert configurations.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetAlertConfigurationsArgs()
        {
        }
        public static new GetAlertConfigurationsArgs Empty => new GetAlertConfigurationsArgs();
    }

    public sealed class GetAlertConfigurationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("listOptions")]
        private InputList<Inputs.GetAlertConfigurationsListOptionInputArgs>? _listOptions;

        /// <summary>
        /// Arguments that dictate how many and which results are returned by the data source
        /// * `list_options.page_num` - Which page of results to retrieve (default to first page)
        /// * `list_options.items_per_page` - How many alerts to retrieve per page (default 100)
        /// * `list_options.include_count` - Whether to include total count of results in the response (default false)
        /// </summary>
        public InputList<Inputs.GetAlertConfigurationsListOptionInputArgs> ListOptions
        {
            get => _listOptions ?? (_listOptions = new InputList<Inputs.GetAlertConfigurationsListOptionInputArgs>());
            set => _listOptions = value;
        }

        [Input("outputTypes")]
        private InputList<string>? _outputTypes;

        /// <summary>
        /// List of requested string formatted output to be included on each individual result. Options are `resource_hcl` and `resource_import`. Available to make it easy to gather resource statements for existing alert configurations, and corresponding import statements to import said resource state into the statefile.
        /// </summary>
        public InputList<string> OutputTypes
        {
            get => _outputTypes ?? (_outputTypes = new InputList<string>());
            set => _outputTypes = value;
        }

        /// <summary>
        /// The unique ID for the project to get the alert configurations.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetAlertConfigurationsInvokeArgs()
        {
        }
        public static new GetAlertConfigurationsInvokeArgs Empty => new GetAlertConfigurationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlertConfigurationsResult
    {
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetAlertConfigurationsListOptionResult> ListOptions;
        public readonly ImmutableArray<string> OutputTypes;
        /// <summary>
        /// The ID of the project where the alert configuration exists
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// A list of alert configurations for the project_id, constrained by the `list_options`.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlertConfigurationsResultResult> Results;
        /// <summary>
        /// Total count of results
        /// </summary>
        public readonly int TotalCount;

        [OutputConstructor]
        private GetAlertConfigurationsResult(
            string id,

            ImmutableArray<Outputs.GetAlertConfigurationsListOptionResult> listOptions,

            ImmutableArray<string> outputTypes,

            string projectId,

            ImmutableArray<Outputs.GetAlertConfigurationsResultResult> results,

            int totalCount)
        {
            Id = id;
            ListOptions = listOptions;
            OutputTypes = outputTypes;
            ProjectId = projectId;
            Results = results;
            TotalCount = totalCount;
        }
    }
}
