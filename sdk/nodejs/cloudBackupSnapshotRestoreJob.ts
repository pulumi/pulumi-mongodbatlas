// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ### Example automated delivery type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.AdvancedCluster("my_cluster", {
 *     projectId: "<PROJECT-ID>",
 *     name: "MyCluster",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "EU_WEST_2",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const test = new mongodbatlas.index.CloudProviderSnapshot("test", {
 *     projectId: myCluster.projectId,
 *     clusterName: myCluster.name,
 *     description: "myDescription",
 *     retentionInDays: 1,
 * });
 * const testCloudBackupSnapshotRestoreJob = new mongodbatlas.CloudBackupSnapshotRestoreJob("test", {
 *     projectId: test.projectId,
 *     clusterName: test.clusterName,
 *     snapshotId: test.snapshotId,
 *     deliveryTypeConfig: {
 *         automated: true,
 *         targetClusterName: "MyCluster",
 *         targetProjectId: "5cf5a45a9ccf6400e60981b6",
 *     },
 * });
 * ```
 *
 * ### Example download delivery type
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.AdvancedCluster("my_cluster", {
 *     projectId: "<PROJECT-ID>",
 *     name: "MyCluster",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "EU_WEST_2",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const test = new mongodbatlas.index.CloudProviderSnapshot("test", {
 *     projectId: myCluster.projectId,
 *     clusterName: myCluster.name,
 *     description: "myDescription",
 *     retentionInDays: 1,
 * });
 * const testCloudBackupSnapshotRestoreJob = new mongodbatlas.CloudBackupSnapshotRestoreJob("test", {
 *     projectId: test.projectId,
 *     clusterName: test.clusterName,
 *     snapshotId: test.snapshotId,
 *     deliveryTypeConfig: {
 *         download: true,
 *     },
 * });
 * ```
 *
 * ### Example of a point in time restore
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.AdvancedCluster("my_cluster", {
 *     projectId: "<PROJECT-ID>",
 *     name: "MyCluster",
 *     clusterType: "REPLICASET",
 *     backupEnabled: true,
 *     replicationSpecs: [{
 *         regionConfigs: [{
 *             priority: 7,
 *             providerName: "AWS",
 *             regionName: "EU_WEST_2",
 *             electableSpecs: {
 *                 instanceSize: "M10",
 *                 nodeCount: 3,
 *             },
 *         }],
 *     }],
 * });
 * const test = new mongodbatlas.CloudBackupSnapshot("test", {
 *     projectId: clusterTest.projectId,
 *     clusterName: clusterTest.name,
 *     description: "My description",
 *     retentionInDays: 1,
 * });
 * const testCloudBackupSnapshotRestoreJob: mongodbatlas.CloudBackupSnapshotRestoreJob[] = [];
 * for (const range = {value: 0}; range.value < (pointInTimeUtcSeconds == 0 ? 0 : 1); range.value++) {
 *     testCloudBackupSnapshotRestoreJob.push(new mongodbatlas.CloudBackupSnapshotRestoreJob(`test-${range.value}`, {
 *         projectId: test.projectId,
 *         clusterName: test.clusterName,
 *         snapshotId: test.id,
 *         deliveryTypeConfig: {
 *             pointInTime: true,
 *             targetClusterName: clusterTest.name,
 *             targetProjectId: clusterTest.projectId,
 *             pointInTimeUtcSeconds: pointInTimeUtcSeconds,
 *         },
 *     }));
 * }
 * ```
 *
 * ### Available complete examples
 * - Restore from backup snapshot at point in time
 * - Restore from backup snapshot using an advanced cluster resource
 *
 * ## Import
 *
 * Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.
 *
 * ```sh
 * $ pulumi import mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
 * ```
 * For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
 */
export class CloudBackupSnapshotRestoreJob extends pulumi.CustomResource {
    /**
     * Get an existing CloudBackupSnapshotRestoreJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudBackupSnapshotRestoreJobState, opts?: pulumi.CustomResourceOptions): CloudBackupSnapshotRestoreJob {
        return new CloudBackupSnapshotRestoreJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/cloudBackupSnapshotRestoreJob:CloudBackupSnapshotRestoreJob';

    /**
     * Returns true if the given object is an instance of CloudBackupSnapshotRestoreJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudBackupSnapshotRestoreJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudBackupSnapshotRestoreJob.__pulumiType;
    }

    /**
     * Indicates whether the restore job was canceled.
     */
    public /*out*/ readonly cancelled!: pulumi.Output<boolean>;
    /**
     * The name of the Atlas cluster whose snapshot you want to restore.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * UTC ISO 8601 formatted point in time when Atlas created the restore job.
     *
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     */
    public readonly deliveryTypeConfig!: pulumi.Output<outputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfig | undefined>;
    /**
     * One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     */
    public /*out*/ readonly deliveryUrls!: pulumi.Output<string[]>;
    /**
     * Indicates whether the restore job expired.
     */
    public /*out*/ readonly expired!: pulumi.Output<boolean>;
    /**
     * UTC ISO 8601 formatted point in time when the restore job expires.
     */
    public /*out*/ readonly expiresAt!: pulumi.Output<string>;
    /**
     * UTC ISO 8601 formatted point in time when the restore job completed.
     */
    public /*out*/ readonly finishedAt!: pulumi.Output<string>;
    /**
     * The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     */
    public readonly snapshotId!: pulumi.Output<string | undefined>;
    /**
     * The unique identifier of the restore job.
     */
    public /*out*/ readonly snapshotRestoreJobId!: pulumi.Output<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
     * Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogInc.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
     * Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogTs.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
     * Two conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
     */
    public /*out*/ readonly timestamp!: pulumi.Output<string>;

    /**
     * Create a CloudBackupSnapshotRestoreJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudBackupSnapshotRestoreJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudBackupSnapshotRestoreJobArgs | CloudBackupSnapshotRestoreJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudBackupSnapshotRestoreJobState | undefined;
            resourceInputs["cancelled"] = state ? state.cancelled : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["deliveryTypeConfig"] = state ? state.deliveryTypeConfig : undefined;
            resourceInputs["deliveryUrls"] = state ? state.deliveryUrls : undefined;
            resourceInputs["expired"] = state ? state.expired : undefined;
            resourceInputs["expiresAt"] = state ? state.expiresAt : undefined;
            resourceInputs["finishedAt"] = state ? state.finishedAt : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["snapshotRestoreJobId"] = state ? state.snapshotRestoreJobId : undefined;
            resourceInputs["timestamp"] = state ? state.timestamp : undefined;
        } else {
            const args = argsOrState as CloudBackupSnapshotRestoreJobArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["deliveryTypeConfig"] = args ? args.deliveryTypeConfig : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["snapshotId"] = args ? args.snapshotId : undefined;
            resourceInputs["cancelled"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["deliveryUrls"] = undefined /*out*/;
            resourceInputs["expired"] = undefined /*out*/;
            resourceInputs["expiresAt"] = undefined /*out*/;
            resourceInputs["finishedAt"] = undefined /*out*/;
            resourceInputs["snapshotRestoreJobId"] = undefined /*out*/;
            resourceInputs["timestamp"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudBackupSnapshotRestoreJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudBackupSnapshotRestoreJob resources.
 */
export interface CloudBackupSnapshotRestoreJobState {
    /**
     * Indicates whether the restore job was canceled.
     */
    cancelled?: pulumi.Input<boolean>;
    /**
     * The name of the Atlas cluster whose snapshot you want to restore.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * UTC ISO 8601 formatted point in time when Atlas created the restore job.
     *
     * @deprecated This parameter is deprecated and will be removed in version 1.18.0.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     */
    deliveryTypeConfig?: pulumi.Input<inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfig>;
    /**
     * One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     */
    deliveryUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether the restore job expired.
     */
    expired?: pulumi.Input<boolean>;
    /**
     * UTC ISO 8601 formatted point in time when the restore job expires.
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * UTC ISO 8601 formatted point in time when the restore job completed.
     */
    finishedAt?: pulumi.Input<string>;
    /**
     * The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * The unique identifier of the restore job.
     */
    snapshotRestoreJobId?: pulumi.Input<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot.
     * Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogInc.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp.
     * Three conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify oplogTs.
     * * Specify either oplogTs and oplogInc or pointInTimeUTCSeconds, but not both.
     * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot.
     * Two conditions apply to this parameter:
     * * Enable Continuous Cloud Backup on your cluster.
     * * Specify either pointInTimeUTCSeconds or oplogTs and oplogInc, but not both.
     */
    timestamp?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudBackupSnapshotRestoreJob resource.
 */
export interface CloudBackupSnapshotRestoreJobArgs {
    /**
     * The name of the Atlas cluster whose snapshot you want to restore.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Type of restore job to create. Possible configurations are: **download**, **automated**, or **pointInTime** only one must be set it in ``true``.
     * * `delivery_type_config.automated` - Set to `true` to use the automated configuration.
     * * `delivery_type_config.download` - Set to `true` to use the download configuration.
     * * `delivery_type_config.pointInTime` - Set to `true` to use the pointInTime configuration. If using pointInTime configuration, you must also specify either `oplogTs` and `oplogInc`, or `pointInTimeUtcSeconds`.
     * * `delivery_type_config.target_cluster_name` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.target_project_id` - Name of the target Atlas cluster to which the restore job restores the snapshot. Required for **automated** and **pointInTime**.
     * * `delivery_type_config.oplog_ts` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which to you want to restore this snapshot. This is the first part of an Oplog timestamp.
     * * `delivery_type_config.oplog_inc` - Optional setting for **pointInTime** configuration. Oplog operation number from which to you want to restore this snapshot. This is the second part of an Oplog timestamp. Used in conjunction with `oplogTs`.
     * * `delivery_type_config.point_in_time_utc_seconds` - Optional setting for **pointInTime** configuration. Timestamp in the number of seconds that have elapsed since the UNIX epoch from which you want to restore this snapshot. Used instead of oplog settings.
     */
    deliveryTypeConfig?: pulumi.Input<inputs.CloudBackupSnapshotRestoreJobDeliveryTypeConfig>;
    /**
     * The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     */
    projectId: pulumi.Input<string>;
    /**
     * Optional setting for **pointInTime** configuration. Unique identifier of the snapshot to restore.
     */
    snapshotId?: pulumi.Input<string>;
}
