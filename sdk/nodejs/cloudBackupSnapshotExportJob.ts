// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## # Resource: mongodbatlas.CloudBackupSnapshotExportJob
 *
 * `mongodbatlas.CloudBackupSnapshotExportJob` allows you to create a cloud backup snapshot export job for the specified project.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 *
 * ### Export one snapshot
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const test = new mongodbatlas.CloudBackupSnapshotExportBucket("test", {
 *     projectId: "{PROJECT_ID}",
 *     iamRoleId: "{IAM_ROLE_ID}",
 *     bucketName: "example_bucket",
 *     cloudProvider: "AWS",
 * });
 * const testCloudBackupSnapshotExportJob = new mongodbatlas.CloudBackupSnapshotExportJob("test", {
 *     projectId: "{PROJECT_ID}",
 *     clusterName: "{CLUSTER_NAME}",
 *     snapshotId: "{SNAPSHOT_ID}",
 *     exportBucketId: test.exportBucketId,
 *     customDatas: [{
 *         key: "exported by",
 *         value: "myName",
 *     }],
 * });
 * ```
 *
 * ### Create backup and automatic snapshot export policies
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const _export = new mongodbatlas.CloudBackupSnapshotExportBucket("export", {
 *     projectId: "{PROJECT_ID}",
 *     iamRoleId: "{IAM_ROLE_ID}",
 *     bucketName: "example_bucket",
 *     cloudProvider: "AWS",
 * });
 * const backup = new mongodbatlas.CloudBackupSchedule("backup", {
 *     projectId: "{PROJECT_ID}",
 *     clusterName: "{CLUSTER_NAME}",
 *     autoExportEnabled: true,
 *     "export": {
 *         exportBucketId: _export.exportBucketId,
 *         frequencyType: "daily",
 *     },
 *     useOrgAndGroupNamesInExportPrefix: true,
 *     referenceHourOfDay: 7,
 *     referenceMinuteOfHour: 0,
 *     restoreWindowDays: 5,
 *     policyItemHourly: {
 *         frequencyInterval: 6,
 *         retentionUnit: "days",
 *         retentionValue: 7,
 *     },
 *     policyItemDaily: {
 *         frequencyInterval: 1,
 *         retentionUnit: "days",
 *         retentionValue: 7,
 *     },
 *     policyItemWeeklies: [{
 *         frequencyInterval: 6,
 *         retentionUnit: "weeks",
 *         retentionValue: 4,
 *     }],
 *     policyItemMonthlies: [{
 *         frequencyInterval: 28,
 *         retentionUnit: "months",
 *         retentionValue: 12,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Backup Snapshot Export Backup entries can be imported using project project_id, cluster_name and export_job_id (Unique identifier of the snapshot export job), in the format `PROJECTID-CLUSTERNAME-EXPORTJOBID`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob test 5d0f1f73cf09a29120e173cf-5d116d82014b764445b2f9b5-5d116d82014b764445b2f9b5
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/export/create-one-export-job/)
 */
export class CloudBackupSnapshotExportJob extends pulumi.CustomResource {
    /**
     * Get an existing CloudBackupSnapshotExportJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudBackupSnapshotExportJobState, opts?: pulumi.CustomResourceOptions): CloudBackupSnapshotExportJob {
        return new CloudBackupSnapshotExportJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/cloudBackupSnapshotExportJob:CloudBackupSnapshotExportJob';

    /**
     * Returns true if the given object is an instance of CloudBackupSnapshotExportJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudBackupSnapshotExportJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudBackupSnapshotExportJob.__pulumiType;
    }

    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     */
    public /*out*/ readonly components!: pulumi.Output<outputs.CloudBackupSnapshotExportJobComponent[]>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     */
    public readonly customDatas!: pulumi.Output<outputs.CloudBackupSnapshotExportJobCustomData[]>;
    /**
     * Error message, only if the export job failed.
     */
    public /*out*/ readonly errMsg!: pulumi.Output<string>;
    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the Get All Snapshot Export Buckets
     */
    public readonly exportBucketId!: pulumi.Output<string>;
    /**
     * Unique identifier of the export job.
     * * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     */
    public /*out*/ readonly exportJobId!: pulumi.Output<string>;
    public /*out*/ readonly exportStatusExportedCollections!: pulumi.Output<number>;
    public /*out*/ readonly exportStatusTotalCollections!: pulumi.Output<number>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     */
    public /*out*/ readonly finishedAt!: pulumi.Output<string>;
    public /*out*/ readonly prefix!: pulumi.Output<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the Get All Cloud Backups
     */
    public readonly snapshotId!: pulumi.Output<string>;
    /**
     * Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     */
    public /*out*/ readonly state!: pulumi.Output<string>;

    /**
     * Create a CloudBackupSnapshotExportJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudBackupSnapshotExportJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudBackupSnapshotExportJobArgs | CloudBackupSnapshotExportJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudBackupSnapshotExportJobState | undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["components"] = state ? state.components : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["customDatas"] = state ? state.customDatas : undefined;
            resourceInputs["errMsg"] = state ? state.errMsg : undefined;
            resourceInputs["exportBucketId"] = state ? state.exportBucketId : undefined;
            resourceInputs["exportJobId"] = state ? state.exportJobId : undefined;
            resourceInputs["exportStatusExportedCollections"] = state ? state.exportStatusExportedCollections : undefined;
            resourceInputs["exportStatusTotalCollections"] = state ? state.exportStatusTotalCollections : undefined;
            resourceInputs["finishedAt"] = state ? state.finishedAt : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
        } else {
            const args = argsOrState as CloudBackupSnapshotExportJobArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.customDatas === undefined) && !opts.urn) {
                throw new Error("Missing required property 'customDatas'");
            }
            if ((!args || args.exportBucketId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'exportBucketId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.snapshotId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snapshotId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["customDatas"] = args ? args.customDatas : undefined;
            resourceInputs["exportBucketId"] = args ? args.exportBucketId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
            resourceInputs["components"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["errMsg"] = undefined /*out*/;
            resourceInputs["exportJobId"] = undefined /*out*/;
            resourceInputs["exportStatusExportedCollections"] = undefined /*out*/;
            resourceInputs["exportStatusTotalCollections"] = undefined /*out*/;
            resourceInputs["finishedAt"] = undefined /*out*/;
            resourceInputs["prefix"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudBackupSnapshotExportJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudBackupSnapshotExportJob resources.
 */
export interface CloudBackupSnapshotExportJobState {
    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     */
    components?: pulumi.Input<pulumi.Input<inputs.CloudBackupSnapshotExportJobComponent>[]>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     */
    customDatas?: pulumi.Input<pulumi.Input<inputs.CloudBackupSnapshotExportJobCustomData>[]>;
    /**
     * Error message, only if the export job failed.
     */
    errMsg?: pulumi.Input<string>;
    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the Get All Snapshot Export Buckets
     */
    exportBucketId?: pulumi.Input<string>;
    /**
     * Unique identifier of the export job.
     * * `prefix ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     */
    exportJobId?: pulumi.Input<string>;
    exportStatusExportedCollections?: pulumi.Input<number>;
    exportStatusTotalCollections?: pulumi.Input<number>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     */
    finishedAt?: pulumi.Input<string>;
    prefix?: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the Get All Cloud Backups
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     */
    state?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudBackupSnapshotExportJob resource.
 */
export interface CloudBackupSnapshotExportJobArgs {
    /**
     * Name of the Atlas cluster whose snapshot you want to export.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     */
    customDatas: pulumi.Input<pulumi.Input<inputs.CloudBackupSnapshotExportJobCustomData>[]>;
    /**
     * Unique identifier of the AWS bucket to export the Cloud Backup snapshot to. If necessary, use the Get All Snapshot Export Buckets
     */
    exportBucketId: pulumi.Input<string>;
    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to export.
     */
    projectId: pulumi.Input<string>;
    /**
     * Unique identifier of the Cloud Backup snapshot to export. If necessary, use the Get All Cloud Backups
     */
    snapshotId: pulumi.Input<string>;
}
