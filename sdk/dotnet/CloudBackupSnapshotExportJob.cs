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
    /// `mongodbatlas.CloudBackupSnapshotExportJob` resource allows you to create a cloud backup snapshot export job for the specified project.
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var testCloudBackupSnapshotExportBucket = new Mongodbatlas.CloudBackupSnapshotExportBucket("testCloudBackupSnapshotExportBucket", new Mongodbatlas.CloudBackupSnapshotExportBucketArgs
    ///         {
    ///             ProjectId = "{PROJECT_ID}",
    ///             IamRoleId = "{IAM_ROLE_ID}",
    ///             BucketName = "example_bucket",
    ///             CloudProvider = "AWS",
    ///         });
    ///         var testCloudBackupSnapshotExportJob = new Mongodbatlas.CloudBackupSnapshotExportJob("testCloudBackupSnapshotExportJob", new Mongodbatlas.CloudBackupSnapshotExportJobArgs
    ///         {
    ///             ProjectId = "{PROJECT_ID}",
    ///             ClusterName = "{CLUSTER_NAME}",
    ///             SnapshotId = "{SNAPSHOT_ID}",
    ///             ExportBucketId = testCloudBackupSnapshotExportBucket.ExportBucketId,
    ///             CustomDatas = 
    ///             {
    ///                 new Mongodbatlas.Inputs.CloudBackupSnapshotExportJobCustomDataArgs
    ///                 {
    ///                     Key = "exported by",
    ///                     Value = "myName",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Cloud Backup Snapshot Export Backup entries can be imported using project project_id, cluster_name and export_job_id (Unique identifier of the snapshot export job), in the format `PROJECTID-CLUSTERNAME-EXPORTJOBID`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob test 5d0f1f73cf09a29120e173cf-5d116d82014b764445b2f9b5-5d116d82014b764445b2f9b5
    /// ```
    /// 
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/create-one-export-job/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob")]
    public partial class CloudBackupSnapshotExportJob : Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the Atlas cluster whose snapshot you want to export.
        /// </summary>
        [Output("clusterName")]
        public Output<string> ClusterName { get; private set; } = null!;

        /// <summary>
        /// _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
        /// </summary>
        [Output("components")]
        public Output<ImmutableArray<Outputs.CloudBackupSnapshotExportJobComponent>> Components { get; private set; } = null!;

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job was created.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
        /// </summary>
        [Output("customDatas")]
        public Output<ImmutableArray<Outputs.CloudBackupSnapshotExportJobCustomData>> CustomDatas { get; private set; } = null!;

        /// <summary>
        /// Error message, only if the export job failed.
        /// </summary>
        [Output("errMsg")]
        public Output<string> ErrMsg { get; private set; } = null!;

        [Output("exportBucketId")]
        public Output<string> ExportBucketId { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the export job.
        /// * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
        /// </summary>
        [Output("exportJobId")]
        public Output<string> ExportJobId { get; private set; } = null!;

        [Output("exportStatusExportedCollections")]
        public Output<int> ExportStatusExportedCollections { get; private set; } = null!;

        [Output("exportStatusTotalCollections")]
        public Output<int> ExportStatusTotalCollections { get; private set; } = null!;

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job completes.
        /// </summary>
        [Output("finishedAt")]
        public Output<string> FinishedAt { get; private set; } = null!;

        [Output("prefix")]
        public Output<string> Prefix { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        [Output("snapshotId")]
        public Output<string> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// Status of the export job. Value can be one of the following:
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;


        /// <summary>
        /// Create a CloudBackupSnapshotExportJob resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudBackupSnapshotExportJob(string name, CloudBackupSnapshotExportJobArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob", name, args ?? new CloudBackupSnapshotExportJobArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudBackupSnapshotExportJob(string name, Input<string> id, CloudBackupSnapshotExportJobState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CloudBackupSnapshotExportJob resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudBackupSnapshotExportJob Get(string name, Input<string> id, CloudBackupSnapshotExportJobState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudBackupSnapshotExportJob(name, id, state, options);
        }
    }

    public sealed class CloudBackupSnapshotExportJobArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Atlas cluster whose snapshot you want to export.
        /// </summary>
        [Input("clusterName", required: true)]
        public Input<string> ClusterName { get; set; } = null!;

        [Input("customDatas", required: true)]
        private InputList<Inputs.CloudBackupSnapshotExportJobCustomDataArgs>? _customDatas;

        /// <summary>
        /// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
        /// </summary>
        public InputList<Inputs.CloudBackupSnapshotExportJobCustomDataArgs> CustomDatas
        {
            get => _customDatas ?? (_customDatas = new InputList<Inputs.CloudBackupSnapshotExportJobCustomDataArgs>());
            set => _customDatas = value;
        }

        [Input("exportBucketId", required: true)]
        public Input<string> ExportBucketId { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("snapshotId", required: true)]
        public Input<string> SnapshotId { get; set; } = null!;

        public CloudBackupSnapshotExportJobArgs()
        {
        }
    }

    public sealed class CloudBackupSnapshotExportJobState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Atlas cluster whose snapshot you want to export.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("components")]
        private InputList<Inputs.CloudBackupSnapshotExportJobComponentGetArgs>? _components;

        /// <summary>
        /// _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
        /// </summary>
        public InputList<Inputs.CloudBackupSnapshotExportJobComponentGetArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.CloudBackupSnapshotExportJobComponentGetArgs>());
            set => _components = value;
        }

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("customDatas")]
        private InputList<Inputs.CloudBackupSnapshotExportJobCustomDataGetArgs>? _customDatas;

        /// <summary>
        /// Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
        /// </summary>
        public InputList<Inputs.CloudBackupSnapshotExportJobCustomDataGetArgs> CustomDatas
        {
            get => _customDatas ?? (_customDatas = new InputList<Inputs.CloudBackupSnapshotExportJobCustomDataGetArgs>());
            set => _customDatas = value;
        }

        /// <summary>
        /// Error message, only if the export job failed.
        /// </summary>
        [Input("errMsg")]
        public Input<string>? ErrMsg { get; set; }

        [Input("exportBucketId")]
        public Input<string>? ExportBucketId { get; set; }

        /// <summary>
        /// Unique identifier of the export job.
        /// * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
        /// </summary>
        [Input("exportJobId")]
        public Input<string>? ExportJobId { get; set; }

        [Input("exportStatusExportedCollections")]
        public Input<int>? ExportStatusExportedCollections { get; set; }

        [Input("exportStatusTotalCollections")]
        public Input<int>? ExportStatusTotalCollections { get; set; }

        /// <summary>
        /// Timestamp in ISO 8601 date and time format in UTC when the export job completes.
        /// </summary>
        [Input("finishedAt")]
        public Input<string>? FinishedAt { get; set; }

        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        /// <summary>
        /// Status of the export job. Value can be one of the following:
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public CloudBackupSnapshotExportJobState()
        {
        }
    }
}
