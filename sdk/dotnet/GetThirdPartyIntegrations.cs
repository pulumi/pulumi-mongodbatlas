// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetThirdPartyIntegrations
    {
        /// <summary>
        /// `mongodbatlas.getThirdPartyIntegrations` describe all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `DATADOG`
        /// applied across the project. 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
        ///     var testPagerDuty = new Mongodbatlas.ThirdPartyIntegration("test_pager_duty", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Type = "PAGER_DUTY",
        ///         ServiceKey = "&lt;PAGER-DUTY-SERVICE-KEY&gt;",
        ///     });
        /// 
        ///     var testDatadog = new Mongodbatlas.ThirdPartyIntegration("test_datadog", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Type = "DATADOG",
        ///         ApiKey = "&lt;API-KEY&gt;",
        ///         Region = "&lt;REGION&gt;",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetThirdPartyIntegrations.Invoke(new()
        ///     {
        ///         ProjectId = testPagerDuty.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetThirdPartyIntegrationsResult> InvokeAsync(GetThirdPartyIntegrationsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetThirdPartyIntegrationsResult>("mongodbatlas:index/getThirdPartyIntegrations:getThirdPartyIntegrations", args ?? new GetThirdPartyIntegrationsArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getThirdPartyIntegrations` describe all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `DATADOG`
        /// applied across the project. 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
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
        ///     var testPagerDuty = new Mongodbatlas.ThirdPartyIntegration("test_pager_duty", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Type = "PAGER_DUTY",
        ///         ServiceKey = "&lt;PAGER-DUTY-SERVICE-KEY&gt;",
        ///     });
        /// 
        ///     var testDatadog = new Mongodbatlas.ThirdPartyIntegration("test_datadog", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         Type = "DATADOG",
        ///         ApiKey = "&lt;API-KEY&gt;",
        ///         Region = "&lt;REGION&gt;",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetThirdPartyIntegrations.Invoke(new()
        ///     {
        ///         ProjectId = testPagerDuty.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetThirdPartyIntegrationsResult> Invoke(GetThirdPartyIntegrationsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetThirdPartyIntegrationsResult>("mongodbatlas:index/getThirdPartyIntegrations:getThirdPartyIntegrations", args ?? new GetThirdPartyIntegrationsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetThirdPartyIntegrationsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetThirdPartyIntegrationsArgs()
        {
        }
        public static new GetThirdPartyIntegrationsArgs Empty => new GetThirdPartyIntegrationsArgs();
    }

    public sealed class GetThirdPartyIntegrationsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all Third-Party service integrations
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetThirdPartyIntegrationsInvokeArgs()
        {
        }
        public static new GetThirdPartyIntegrationsInvokeArgs Empty => new GetThirdPartyIntegrationsInvokeArgs();
    }


    [OutputType]
    public sealed class GetThirdPartyIntegrationsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// (Required) ID of the Atlas project the Third-Party Service Integration belongs to.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// A list where each represents a Third-Party service integration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetThirdPartyIntegrationsResultResult> Results;

        [OutputConstructor]
        private GetThirdPartyIntegrationsResult(
            string id,

            string projectId,

            ImmutableArray<Outputs.GetThirdPartyIntegrationsResultResult> results)
        {
            Id = id;
            ProjectId = projectId;
            Results = results;
        }
    }
}
