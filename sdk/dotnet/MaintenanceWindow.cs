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
    /// ## # Resource: mongodbatlas.MaintenanceWindow
    /// 
    /// `mongodbatlas.MaintenanceWindow` provides a resource to schedule the maintenance window for your MongoDB Atlas Project and/or set to defer a scheduled maintenance up to two times. Please refer to [Maintenance Windows](https://www.mongodb.com/docs/atlas/tutorial/cluster-maintenance-window/#configure-maintenance-window) documentation for more details.
    /// 
    /// &gt; **NOTE:** Only a single maintenance window resource can be defined per project.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
    /// 
    /// ## Maintenance Window Considerations:
    /// 
    /// - Urgent Maintenance Activities Cannot Wait: Urgent maintenance activities such as security patches cannot wait for your chosen window. Atlas will start those maintenance activities when needed.
    /// 
    /// Once maintenance is scheduled for your cluster, you cannot change your maintenance window until the current maintenance efforts have completed.
    /// - Maintenance Requires Replica Set Elections: Atlas performs maintenance the same way as the manual maintenance procedure. This requires at least one replica set election during the maintenance window per replica set.
    /// - Maintenance Starts As Close to the Hour As Possible: Maintenance always begins as close to the scheduled hour as possible, but in-progress cluster updates or expected system issues could delay the start time.
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
    ///     var test = new Mongodbatlas.MaintenanceWindow("test", new()
    ///     {
    ///         ProjectId = "&lt;your-project-id&gt;",
    ///         DayOfWeek = 3,
    ///         HourOfDay = 4,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.MaintenanceWindow("test", new()
    ///     {
    ///         ProjectId = "&lt;your-project-id&gt;",
    ///         Defer = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Maintenance Window entries can be imported using project project_id, in the format `PROJECTID`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/maintenanceWindow:MaintenanceWindow test 5d0f1f73cf09a29120e173cf
    /// ```
    /// For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/maintenance-windows/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/maintenanceWindow:MaintenanceWindow")]
    public partial class MaintenanceWindow : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Defer any scheduled maintenance for the given project for one week.
        /// </summary>
        [Output("autoDefer")]
        public Output<bool> AutoDefer { get; private set; } = null!;

        [Output("autoDeferOnceEnabled")]
        public Output<bool> AutoDeferOnceEnabled { get; private set; } = null!;

        /// <summary>
        /// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        /// </summary>
        [Output("dayOfWeek")]
        public Output<int> DayOfWeek { get; private set; } = null!;

        /// <summary>
        /// Defer the next scheduled maintenance for the given project for one week.
        /// </summary>
        [Output("defer")]
        public Output<bool> Defer { get; private set; } = null!;

        /// <summary>
        /// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        /// </summary>
        [Output("hourOfDay")]
        public Output<int> HourOfDay { get; private set; } = null!;

        /// <summary>
        /// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        /// </summary>
        [Output("numberOfDeferrals")]
        public Output<int> NumberOfDeferrals { get; private set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Maintenance Window.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        /// </summary>
        [Output("startAsap")]
        public Output<bool> StartAsap { get; private set; } = null!;


        /// <summary>
        /// Create a MaintenanceWindow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MaintenanceWindow(string name, MaintenanceWindowArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/maintenanceWindow:MaintenanceWindow", name, args ?? new MaintenanceWindowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MaintenanceWindow(string name, Input<string> id, MaintenanceWindowState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/maintenanceWindow:MaintenanceWindow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MaintenanceWindow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MaintenanceWindow Get(string name, Input<string> id, MaintenanceWindowState? state = null, CustomResourceOptions? options = null)
        {
            return new MaintenanceWindow(name, id, state, options);
        }
    }

    public sealed class MaintenanceWindowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defer any scheduled maintenance for the given project for one week.
        /// </summary>
        [Input("autoDefer")]
        public Input<bool>? AutoDefer { get; set; }

        [Input("autoDeferOnceEnabled")]
        public Input<bool>? AutoDeferOnceEnabled { get; set; }

        /// <summary>
        /// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        /// </summary>
        [Input("dayOfWeek", required: true)]
        public Input<int> DayOfWeek { get; set; } = null!;

        /// <summary>
        /// Defer the next scheduled maintenance for the given project for one week.
        /// </summary>
        [Input("defer")]
        public Input<bool>? Defer { get; set; }

        /// <summary>
        /// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        /// </summary>
        [Input("hourOfDay")]
        public Input<int>? HourOfDay { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Maintenance Window.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        /// </summary>
        [Input("startAsap")]
        public Input<bool>? StartAsap { get; set; }

        public MaintenanceWindowArgs()
        {
        }
        public static new MaintenanceWindowArgs Empty => new MaintenanceWindowArgs();
    }

    public sealed class MaintenanceWindowState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defer any scheduled maintenance for the given project for one week.
        /// </summary>
        [Input("autoDefer")]
        public Input<bool>? AutoDefer { get; set; }

        [Input("autoDeferOnceEnabled")]
        public Input<bool>? AutoDeferOnceEnabled { get; set; }

        /// <summary>
        /// Day of the week when you would like the maintenance window to start as a 1-based integer: Su=1, M=2, T=3, W=4, T=5, F=6, Sa=7.
        /// </summary>
        [Input("dayOfWeek")]
        public Input<int>? DayOfWeek { get; set; }

        /// <summary>
        /// Defer the next scheduled maintenance for the given project for one week.
        /// </summary>
        [Input("defer")]
        public Input<bool>? Defer { get; set; }

        /// <summary>
        /// Hour of the day when you would like the maintenance window to start. This parameter uses the 24-hour clock, where midnight is 0, noon is 12 (Time zone is UTC).
        /// </summary>
        [Input("hourOfDay")]
        public Input<int>? HourOfDay { get; set; }

        /// <summary>
        /// Number of times the current maintenance event for this project has been deferred, there can be a maximum of 2 deferrals.
        /// </summary>
        [Input("numberOfDeferrals")]
        public Input<int>? NumberOfDeferrals { get; set; }

        /// <summary>
        /// The unique identifier of the project for the Maintenance Window.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Flag indicating whether project maintenance has been directed to start immediately. If you request that maintenance begin immediately, this field returns true from the time the request was made until the time the maintenance event completes.
        /// </summary>
        [Input("startAsap")]
        public Input<bool>? StartAsap { get; set; }

        public MaintenanceWindowState()
        {
        }
        public static new MaintenanceWindowState Empty => new MaintenanceWindowState();
    }
}
