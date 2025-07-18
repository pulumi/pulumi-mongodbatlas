// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// **WARNING:** Data Lake is deprecated. To learn more, see &lt;https://dochub.mongodb.org/core/data-lake-deprecation&gt;
    /// 
    /// `mongodbatlas.DataLakePipeline` provides a Data Lake Pipeline resource.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Data Lake Pipeline can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/dataLakePipeline:DataLakePipeline example 1112222b3bf99403840e8934--test-data-lake-pipeline-test
    /// ```
    /// 
    /// See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Lake-Pipelines) Documentation for more information.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/dataLakePipeline:DataLakePipeline")]
    public partial class DataLakePipeline : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Timestamp that indicates when the Data Lake Pipeline was created.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// List of backup schedule policy items that you can use as a Data Lake Pipeline source.
        /// * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
        /// * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
        /// * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
        /// * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
        /// * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        /// </summary>
        [Output("ingestionSchedules")]
        public Output<ImmutableArray<Outputs.DataLakePipelineIngestionSchedule>> IngestionSchedules { get; private set; } = null!;

        /// <summary>
        /// Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        /// </summary>
        [Output("lastUpdatedDate")]
        public Output<string> LastUpdatedDate { get; private set; } = null!;

        /// <summary>
        /// Name of the Atlas Data Lake Pipeline.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to create a data lake pipeline.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        [Output("sink")]
        public Output<Outputs.DataLakePipelineSink?> Sink { get; private set; } = null!;

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
        [Output("snapshots")]
        public Output<ImmutableArray<Outputs.DataLakePipelineSnapshot>> Snapshots { get; private set; } = null!;

        [Output("source")]
        public Output<Outputs.DataLakePipelineSource?> Source { get; private set; } = null!;

        /// <summary>
        /// State of this Data Lake Pipeline.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Fields to be excluded for this Data Lake Pipeline.
        /// * `transformations.#.field` - Key in the document.
        /// * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        /// </summary>
        [Output("transformations")]
        public Output<ImmutableArray<Outputs.DataLakePipelineTransformation>> Transformations { get; private set; } = null!;


        /// <summary>
        /// Create a DataLakePipeline resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DataLakePipeline(string name, DataLakePipelineArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/dataLakePipeline:DataLakePipeline", name, args ?? new DataLakePipelineArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DataLakePipeline(string name, Input<string> id, DataLakePipelineState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/dataLakePipeline:DataLakePipeline", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DataLakePipeline resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DataLakePipeline Get(string name, Input<string> id, DataLakePipelineState? state = null, CustomResourceOptions? options = null)
        {
            return new DataLakePipeline(name, id, state, options);
        }
    }

    public sealed class DataLakePipelineArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Atlas Data Lake Pipeline.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create a data lake pipeline.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("sink")]
        public Input<Inputs.DataLakePipelineSinkArgs>? Sink { get; set; }

        [Input("source")]
        public Input<Inputs.DataLakePipelineSourceArgs>? Source { get; set; }

        [Input("transformations")]
        private InputList<Inputs.DataLakePipelineTransformationArgs>? _transformations;

        /// <summary>
        /// Fields to be excluded for this Data Lake Pipeline.
        /// * `transformations.#.field` - Key in the document.
        /// * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        /// </summary>
        public InputList<Inputs.DataLakePipelineTransformationArgs> Transformations
        {
            get => _transformations ?? (_transformations = new InputList<Inputs.DataLakePipelineTransformationArgs>());
            set => _transformations = value;
        }

        public DataLakePipelineArgs()
        {
        }
        public static new DataLakePipelineArgs Empty => new DataLakePipelineArgs();
    }

    public sealed class DataLakePipelineState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Timestamp that indicates when the Data Lake Pipeline was created.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        [Input("ingestionSchedules")]
        private InputList<Inputs.DataLakePipelineIngestionScheduleGetArgs>? _ingestionSchedules;

        /// <summary>
        /// List of backup schedule policy items that you can use as a Data Lake Pipeline source.
        /// * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
        /// * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
        /// * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
        /// * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
        /// * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        /// </summary>
        public InputList<Inputs.DataLakePipelineIngestionScheduleGetArgs> IngestionSchedules
        {
            get => _ingestionSchedules ?? (_ingestionSchedules = new InputList<Inputs.DataLakePipelineIngestionScheduleGetArgs>());
            set => _ingestionSchedules = value;
        }

        /// <summary>
        /// Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        /// </summary>
        [Input("lastUpdatedDate")]
        public Input<string>? LastUpdatedDate { get; set; }

        /// <summary>
        /// Name of the Atlas Data Lake Pipeline.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique ID for the project to create a data lake pipeline.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("sink")]
        public Input<Inputs.DataLakePipelineSinkGetArgs>? Sink { get; set; }

        [Input("snapshots")]
        private InputList<Inputs.DataLakePipelineSnapshotGetArgs>? _snapshots;

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
        public InputList<Inputs.DataLakePipelineSnapshotGetArgs> Snapshots
        {
            get => _snapshots ?? (_snapshots = new InputList<Inputs.DataLakePipelineSnapshotGetArgs>());
            set => _snapshots = value;
        }

        [Input("source")]
        public Input<Inputs.DataLakePipelineSourceGetArgs>? Source { get; set; }

        /// <summary>
        /// State of this Data Lake Pipeline.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("transformations")]
        private InputList<Inputs.DataLakePipelineTransformationGetArgs>? _transformations;

        /// <summary>
        /// Fields to be excluded for this Data Lake Pipeline.
        /// * `transformations.#.field` - Key in the document.
        /// * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        /// </summary>
        public InputList<Inputs.DataLakePipelineTransformationGetArgs> Transformations
        {
            get => _transformations ?? (_transformations = new InputList<Inputs.DataLakePipelineTransformationGetArgs>());
            set => _transformations = value;
        }

        public DataLakePipelineState()
        {
        }
        public static new DataLakePipelineState Empty => new DataLakePipelineState();
    }
}
