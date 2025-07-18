// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetMaintenanceWindow
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.MaintenanceWindow
        /// 
        /// `mongodbatlas.MaintenanceWindow` provides a Maintenance Window entry datasource. Gets information regarding the configured maintenance window for a MongoDB Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Examples Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testMaintenanceWindow = new Mongodbatlas.MaintenanceWindow("test", new()
        ///     {
        ///         ProjectId = "&lt;your-project-id&gt;",
        ///         DayOfWeek = 3,
        ///         HourOfDay = 4,
        ///         AutoDeferOnceEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetMaintenanceWindow.Invoke(new()
        ///     {
        ///         ProjectId = testMaintenanceWindow.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testMaintenanceWindow = new Mongodbatlas.MaintenanceWindow("test", new()
        ///     {
        ///         ProjectId = "&lt;your-project-id&gt;",
        ///         StartAsap = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetMaintenanceWindow.Invoke(new()
        ///     {
        ///         ProjectId = testMaintenanceWindow.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetMaintenanceWindowResult> InvokeAsync(GetMaintenanceWindowArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMaintenanceWindowResult>("mongodbatlas:index/getMaintenanceWindow:getMaintenanceWindow", args ?? new GetMaintenanceWindowArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.MaintenanceWindow
        /// 
        /// `mongodbatlas.MaintenanceWindow` provides a Maintenance Window entry datasource. Gets information regarding the configured maintenance window for a MongoDB Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Examples Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testMaintenanceWindow = new Mongodbatlas.MaintenanceWindow("test", new()
        ///     {
        ///         ProjectId = "&lt;your-project-id&gt;",
        ///         DayOfWeek = 3,
        ///         HourOfDay = 4,
        ///         AutoDeferOnceEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetMaintenanceWindow.Invoke(new()
        ///     {
        ///         ProjectId = testMaintenanceWindow.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testMaintenanceWindow = new Mongodbatlas.MaintenanceWindow("test", new()
        ///     {
        ///         ProjectId = "&lt;your-project-id&gt;",
        ///         StartAsap = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetMaintenanceWindow.Invoke(new()
        ///     {
        ///         ProjectId = testMaintenanceWindow.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMaintenanceWindowResult> Invoke(GetMaintenanceWindowInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaintenanceWindowResult>("mongodbatlas:index/getMaintenanceWindow:getMaintenanceWindow", args ?? new GetMaintenanceWindowInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.MaintenanceWindow
        /// 
        /// `mongodbatlas.MaintenanceWindow` provides a Maintenance Window entry datasource. Gets information regarding the configured maintenance window for a MongoDB Atlas project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Examples Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testMaintenanceWindow = new Mongodbatlas.MaintenanceWindow("test", new()
        ///     {
        ///         ProjectId = "&lt;your-project-id&gt;",
        ///         DayOfWeek = 3,
        ///         HourOfDay = 4,
        ///         AutoDeferOnceEnabled = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetMaintenanceWindow.Invoke(new()
        ///     {
        ///         ProjectId = testMaintenanceWindow.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testMaintenanceWindow = new Mongodbatlas.MaintenanceWindow("test", new()
        ///     {
        ///         ProjectId = "&lt;your-project-id&gt;",
        ///         StartAsap = true,
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetMaintenanceWindow.Invoke(new()
        ///     {
        ///         ProjectId = testMaintenanceWindow.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetMaintenanceWindowResult> Invoke(GetMaintenanceWindowInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaintenanceWindowResult>("mongodbatlas:index/getMaintenanceWindow:getMaintenanceWindow", args ?? new GetMaintenanceWindowInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMaintenanceWindowArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of the project for the Maintenance Window.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetMaintenanceWindowArgs()
        {
        }
        public static new GetMaintenanceWindowArgs Empty => new GetMaintenanceWindowArgs();
    }

    public sealed class GetMaintenanceWindowInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of the project for the Maintenance Window.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetMaintenanceWindowInvokeArgs()
        {
        }
        public static new GetMaintenanceWindowInvokeArgs Empty => new GetMaintenanceWindowInvokeArgs();
    }


    [OutputType]
    public sealed class GetMaintenanceWindowResult
    {
        /// <summary>
        /// Flag that indicates whether you want to defer all maintenance windows one week they would be triggered.
        /// </summary>
        public readonly bool AutoDeferOnceEnabled;
        /// <summary>
        /// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        /// </summary>
        public readonly int DayOfWeek;
        /// <summary>
        /// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12  (Time zone is UTC).
        /// </summary>
        public readonly int HourOfDay;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        /// </summary>
        public readonly int NumberOfDeferrals;
        public readonly string ProjectId;
        /// <summary>
        /// (Optional) Defines the time period during which there will be no standard updates to the clusters. See Protected Hours.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMaintenanceWindowProtectedHourResult> ProtectedHours;
        /// <summary>
        /// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        /// </summary>
        public readonly bool StartAsap;
        /// <summary>
        /// Identifier for the current time zone of the maintenance window. This can only be updated via the Project Settings UI.
        /// </summary>
        public readonly string TimeZoneId;

        [OutputConstructor]
        private GetMaintenanceWindowResult(
            bool autoDeferOnceEnabled,

            int dayOfWeek,

            int hourOfDay,

            string id,

            int numberOfDeferrals,

            string projectId,

            ImmutableArray<Outputs.GetMaintenanceWindowProtectedHourResult> protectedHours,

            bool startAsap,

            string timeZoneId)
        {
            AutoDeferOnceEnabled = autoDeferOnceEnabled;
            DayOfWeek = dayOfWeek;
            HourOfDay = hourOfDay;
            Id = id;
            NumberOfDeferrals = numberOfDeferrals;
            ProjectId = projectId;
            ProtectedHours = protectedHours;
            StartAsap = startAsap;
            TimeZoneId = timeZoneId;
        }
    }
}
