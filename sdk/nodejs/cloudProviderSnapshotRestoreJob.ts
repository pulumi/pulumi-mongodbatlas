// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * **WARNING:** This resource is deprecated, use `mongodbatlas.CloudBackupSnapshotRestoreJob`
 *
 * `mongodbatlas.CloudProviderSnapshotRestoreJob` provides a resource to create a new restore job from a cloud backup snapshot of a specified cluster. The restore job can be one of three types:
 * * **automated:** Atlas automatically restores the snapshot with snapshotId to the Atlas cluster with name targetClusterName in the Atlas project with targetGroupId.
 *
 * * **download:** Atlas provides a URL to download a .tar.gz of the snapshot with snapshotId. The contents of the archive contain the data files for your Atlas cluster.
 *
 * * **pointInTime:**  Atlas performs a Continuous Cloud Backup restore.
 *
 * > **Important:** If you specify `deliveryType` : `automated` or `deliveryType` : `pointInTime` in your request body to create an automated restore job, Atlas removes all existing data on the target cluster prior to the restore.
 *
 * > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
 *
 * ## Example Usage
 * ### Example automated delivery type.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.Cluster("myCluster", {
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     diskSizeGb: 5,
 *     providerName: "AWS",
 *     providerRegionName: "EU_WEST_2",
 *     providerInstanceSizeName: "M10",
 *     cloudBackup: true,
 * });
 * // enable cloud backup snapshots
 * const testCloudProviderSnapshot = new mongodbatlas.CloudProviderSnapshot("testCloudProviderSnapshot", {
 *     projectId: myCluster.projectId,
 *     clusterName: myCluster.name,
 *     description: "myDescription",
 *     retentionInDays: 1,
 * });
 * const testCloudProviderSnapshotRestoreJob = new mongodbatlas.CloudProviderSnapshotRestoreJob("testCloudProviderSnapshotRestoreJob", {
 *     projectId: testCloudProviderSnapshot.projectId,
 *     clusterName: testCloudProviderSnapshot.clusterName,
 *     snapshotId: testCloudProviderSnapshot.snapshotId,
 *     deliveryTypeConfig: {
 *         automated: true,
 *         targetClusterName: "MyCluster",
 *         targetProjectId: "5cf5a45a9ccf6400e60981b6",
 *     },
 * }, {
 *     dependsOn: [testCloudProviderSnapshot],
 * });
 * ```
 * ### Example download delivery type.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as mongodbatlas from "@pulumi/mongodbatlas";
 *
 * const myCluster = new mongodbatlas.Cluster("myCluster", {
 *     projectId: "5cf5a45a9ccf6400e60981b6",
 *     diskSizeGb: 5,
 *     providerName: "AWS",
 *     providerRegionName: "EU_WEST_2",
 *     providerInstanceSizeName: "M10",
 *     cloudBackup: true,
 * });
 * // enable cloud backup snapshots
 * const testCloudProviderSnapshot = new mongodbatlas.CloudProviderSnapshot("testCloudProviderSnapshot", {
 *     projectId: myCluster.projectId,
 *     clusterName: myCluster.name,
 *     description: "myDescription",
 *     retentionInDays: 1,
 * });
 * const testCloudProviderSnapshotRestoreJob = new mongodbatlas.CloudProviderSnapshotRestoreJob("testCloudProviderSnapshotRestoreJob", {
 *     projectId: testCloudProviderSnapshot.projectId,
 *     clusterName: testCloudProviderSnapshot.clusterName,
 *     snapshotId: testCloudProviderSnapshot.snapshotId,
 *     deliveryTypeConfig: {
 *         download: true,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Cloud Backup Snapshot Restore Job entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-JOBID`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/cloudProviderSnapshotRestoreJob:CloudProviderSnapshotRestoreJob test 5cf5a45a9ccf6400e60981b6-MyCluster-5d1b654ecf09a24b888f4c79
 * ```
 *
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/restore/restores/)
 */
export class CloudProviderSnapshotRestoreJob extends pulumi.CustomResource {
    /**
     * Get an existing CloudProviderSnapshotRestoreJob resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudProviderSnapshotRestoreJobState, opts?: pulumi.CustomResourceOptions): CloudProviderSnapshotRestoreJob {
        return new CloudProviderSnapshotRestoreJob(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/cloudProviderSnapshotRestoreJob:CloudProviderSnapshotRestoreJob';

    /**
     * Returns true if the given object is an instance of CloudProviderSnapshotRestoreJob.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudProviderSnapshotRestoreJob {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudProviderSnapshotRestoreJob.__pulumiType;
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
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
     *
     * @deprecated use delivery_type_config instead
     */
    public readonly deliveryType!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Type of restore job to create. Possible values are: automated and download.
     */
    public readonly deliveryTypeConfig!: pulumi.Output<outputs.CloudProviderSnapshotRestoreJobDeliveryTypeConfig | undefined>;
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
     * Unique identifier of the snapshot to restore.
     */
    public readonly snapshotId!: pulumi.Output<string>;
    /**
     * The unique identifier of the restore job.
     */
    public /*out*/ readonly snapshotRestoreJobId!: pulumi.Output<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     */
    public /*out*/ readonly timestamp!: pulumi.Output<string>;

    /**
     * Create a CloudProviderSnapshotRestoreJob resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudProviderSnapshotRestoreJobArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudProviderSnapshotRestoreJobArgs | CloudProviderSnapshotRestoreJobState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudProviderSnapshotRestoreJobState | undefined;
            resourceInputs["cancelled"] = state ? state.cancelled : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["deliveryType"] = state ? state.deliveryType : undefined;
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
            const args = argsOrState as CloudProviderSnapshotRestoreJobArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.snapshotId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'snapshotId'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["deliveryType"] = args ? args.deliveryType : undefined;
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
        super(CloudProviderSnapshotRestoreJob.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudProviderSnapshotRestoreJob resources.
 */
export interface CloudProviderSnapshotRestoreJobState {
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
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
     *
     * @deprecated use delivery_type_config instead
     */
    deliveryType?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of restore job to create. Possible values are: automated and download.
     */
    deliveryTypeConfig?: pulumi.Input<inputs.CloudProviderSnapshotRestoreJobDeliveryTypeConfig>;
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
     * Unique identifier of the snapshot to restore.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * The unique identifier of the restore job.
     */
    snapshotRestoreJobId?: pulumi.Input<string>;
    /**
     * Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     */
    timestamp?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudProviderSnapshotRestoreJob resource.
 */
export interface CloudProviderSnapshotRestoreJobArgs {
    /**
     * The name of the Atlas cluster whose snapshot you want to restore.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Type of restore job to create. Possible values are: **download** or **automated**, only one must be set it in ``true``.
     *
     * @deprecated use delivery_type_config instead
     */
    deliveryType?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Type of restore job to create. Possible values are: automated and download.
     */
    deliveryTypeConfig?: pulumi.Input<inputs.CloudProviderSnapshotRestoreJobDeliveryTypeConfig>;
    /**
     * The unique identifier of the project for the Atlas cluster whose snapshot you want to restore.
     */
    projectId: pulumi.Input<string>;
    /**
     * Unique identifier of the snapshot to restore.
     */
    snapshotId: pulumi.Input<string>;
}
