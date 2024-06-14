// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetDataLakePipeline
    {
        /// <summary>
        /// `mongodbatlas.DataLakePipeline` describes a Data Lake Pipeline.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Task<GetDataLakePipelineResult> InvokeAsync(GetDataLakePipelineArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDataLakePipelineResult>("mongodbatlas:index/getDataLakePipeline:getDataLakePipeline", args ?? new GetDataLakePipelineArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.DataLakePipeline` describes a Data Lake Pipeline.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Output<GetDataLakePipelineResult> Invoke(GetDataLakePipelineInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDataLakePipelineResult>("mongodbatlas:index/getDataLakePipeline:getDataLakePipeline", args ?? new GetDataLakePipelineInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataLakePipelineArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas Data Lake Pipeline.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Data Lake Pipeline.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetDataLakePipelineArgs()
        {
        }
        public static new GetDataLakePipelineArgs Empty => new GetDataLakePipelineArgs();
    }

    public sealed class GetDataLakePipelineInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the Atlas Data Lake Pipeline.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a Data Lake Pipeline.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetDataLakePipelineInvokeArgs()
        {
        }
        public static new GetDataLakePipelineInvokeArgs Empty => new GetDataLakePipelineInvokeArgs();
    }


    [OutputType]
    public sealed class GetDataLakePipelineResult
    {
        /// <summary>
        /// Timestamp that indicates when the Data Lake Pipeline was created.
        /// </summary>
        public readonly string CreatedDate;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// List of backup schedule policy items that you can use as a Data Lake Pipeline source.
        /// * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
        /// * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
        /// * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
        /// * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
        /// * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakePipelineIngestionScheduleResult> IngestionSchedules;
        /// <summary>
        /// Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        /// </summary>
        public readonly string LastUpdatedDate;
        public readonly string Name;
        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// * `policyItemId` - Unique 24-hexadecimal character string that identifies a policy item.
        /// </summary>
        public readonly string ProjectId;
        public readonly ImmutableArray<Outputs.GetDataLakePipelineSinkResult> Sinks;
        /// <summary>
        /// List of backup snapshots that you can use to trigger an on demand pipeline run.
        /// * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
        /// * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
        /// * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
        /// * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
        /// * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
        /// * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
        /// * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
        /// * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
        /// * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
        /// * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
        /// * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
        /// * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
        /// * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
        /// * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakePipelineSnapshotResult> Snapshots;
        public readonly ImmutableArray<Outputs.GetDataLakePipelineSourceResult> Sources;
        /// <summary>
        /// State of this Data Lake Pipeline.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Fields to be excluded for this Data Lake Pipeline.
        /// * `transformations.#.field` - Key in the document.
        /// * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakePipelineTransformationResult> Transformations;

        [OutputConstructor]
        private GetDataLakePipelineResult(
            string createdDate,

            string id,

            ImmutableArray<Outputs.GetDataLakePipelineIngestionScheduleResult> ingestionSchedules,

            string lastUpdatedDate,

            string name,

            string projectId,

            ImmutableArray<Outputs.GetDataLakePipelineSinkResult> sinks,

            ImmutableArray<Outputs.GetDataLakePipelineSnapshotResult> snapshots,

            ImmutableArray<Outputs.GetDataLakePipelineSourceResult> sources,

            string state,

            ImmutableArray<Outputs.GetDataLakePipelineTransformationResult> transformations)
        {
            CreatedDate = createdDate;
            Id = id;
            IngestionSchedules = ingestionSchedules;
            LastUpdatedDate = lastUpdatedDate;
            Name = name;
            ProjectId = projectId;
            Sinks = sinks;
            Snapshots = snapshots;
            Sources = sources;
            State = state;
            Transformations = transformations;
        }
    }
}