// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudBackupSchedule
    {
        /// <summary>
        /// `mongodbatlas.CloudBackupSchedule` provides a Cloud Backup Schedule datasource. An Atlas Cloud Backup Schedule provides the current cloud backup schedule for the cluster. 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetCloudBackupScheduleResult> InvokeAsync(GetCloudBackupScheduleArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCloudBackupScheduleResult>("mongodbatlas:index/getCloudBackupSchedule:getCloudBackupSchedule", args ?? new GetCloudBackupScheduleArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.CloudBackupSchedule` provides a Cloud Backup Schedule datasource. An Atlas Cloud Backup Schedule provides the current cloud backup schedule for the cluster. 
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Output<GetCloudBackupScheduleResult> Invoke(GetCloudBackupScheduleInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCloudBackupScheduleResult>("mongodbatlas:index/getCloudBackupSchedule:getCloudBackupSchedule", args ?? new GetCloudBackupScheduleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudBackupScheduleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public string ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudBackupScheduleArgs()
        {
        }
        public static new GetCloudBackupScheduleArgs Empty => new GetCloudBackupScheduleArgs();
    }

    public sealed class GetCloudBackupScheduleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        /// <summary>
        /// The unique identifier of the project for the Atlas cluster.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetCloudBackupScheduleInvokeArgs()
        {
        }
        public static new GetCloudBackupScheduleInvokeArgs Empty => new GetCloudBackupScheduleInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudBackupScheduleResult
    {
        /// <summary>
        /// Flag that indicates whether automatic export of cloud backup snapshots to the AWS bucket is enabled. Value can be one of the following:
        /// </summary>
        public readonly bool AutoExportEnabled;
        /// <summary>
        /// Unique identifier of the Atlas cluster.
        /// </summary>
        public readonly string ClusterId;
        public readonly string ClusterName;
        public readonly ImmutableArray<Outputs.GetCloudBackupScheduleExportResult> Exports;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the backup policy.
        /// </summary>
        public readonly string IdPolicy;
        /// <summary>
        /// UTC ISO 8601 formatted point in time when Atlas will take the next snapshot.
        /// </summary>
        public readonly string NextSnapshot;
        /// <summary>
        /// Daily policy item
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemDailyResult> PolicyItemDailies;
        /// <summary>
        /// Hourly policy item
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemHourlyResult> PolicyItemHourlies;
        /// <summary>
        /// Monthly policy item
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemMonthlyResult> PolicyItemMonthlies;
        /// <summary>
        /// Weekly policy item
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemWeeklyResult> PolicyItemWeeklies;
        public readonly string ProjectId;
        /// <summary>
        /// UTC Hour of day between 0 and 23 representing which hour of the day that Atlas takes a snapshot.
        /// </summary>
        public readonly int ReferenceHourOfDay;
        /// <summary>
        /// UTC Minute of day between 0 and 59 representing which minute of the `reference_hour_of_day` that Atlas takes the snapshot.
        /// </summary>
        public readonly int ReferenceMinuteOfHour;
        /// <summary>
        /// Specifies a restore window in days for cloud backup to maintain.
        /// </summary>
        public readonly int RestoreWindowDays;
        /// <summary>
        /// Specify true to use organization and project names instead of organization and project UUIDs in the path for the metadata files that Atlas uploads to your S3 bucket after it finishes exporting the snapshots. To learn more about the metadata files that Atlas uploads, see [Export Cloud Backup Snapshot](https://www.mongodb.com/docs/atlas/backup/cloud-backup/export/#std-label-cloud-provider-snapshot-export).
        /// </summary>
        public readonly bool UseOrgAndGroupNamesInExportPrefix;

        [OutputConstructor]
        private GetCloudBackupScheduleResult(
            bool autoExportEnabled,

            string clusterId,

            string clusterName,

            ImmutableArray<Outputs.GetCloudBackupScheduleExportResult> exports,

            string id,

            string idPolicy,

            string nextSnapshot,

            ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemDailyResult> policyItemDailies,

            ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemHourlyResult> policyItemHourlies,

            ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemMonthlyResult> policyItemMonthlies,

            ImmutableArray<Outputs.GetCloudBackupSchedulePolicyItemWeeklyResult> policyItemWeeklies,

            string projectId,

            int referenceHourOfDay,

            int referenceMinuteOfHour,

            int restoreWindowDays,

            bool useOrgAndGroupNamesInExportPrefix)
        {
            AutoExportEnabled = autoExportEnabled;
            ClusterId = clusterId;
            ClusterName = clusterName;
            Exports = exports;
            Id = id;
            IdPolicy = idPolicy;
            NextSnapshot = nextSnapshot;
            PolicyItemDailies = policyItemDailies;
            PolicyItemHourlies = policyItemHourlies;
            PolicyItemMonthlies = policyItemMonthlies;
            PolicyItemWeeklies = policyItemWeeklies;
            ProjectId = projectId;
            ReferenceHourOfDay = referenceHourOfDay;
            ReferenceMinuteOfHour = referenceMinuteOfHour;
            RestoreWindowDays = restoreWindowDays;
            UseOrgAndGroupNamesInExportPrefix = useOrgAndGroupNamesInExportPrefix;
        }
    }
}
