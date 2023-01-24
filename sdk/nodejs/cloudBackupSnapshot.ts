// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Cloud Backup Snapshot entries can be imported using project project_id, cluster_name and snapshot_id (Unique identifier of the snapshot), in the format `PROJECTID-CLUSTERNAME-SNAPSHOTID`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot test 5d0f1f73cf09a29120e173cf-MyClusterTest-5d116d82014b764445b2f9b5
 * ```
 *
 *  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/cloud-backup/backup/backups/)
 */
export class CloudBackupSnapshot extends pulumi.CustomResource {
    /**
     * Get an existing CloudBackupSnapshot resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CloudBackupSnapshotState, opts?: pulumi.CustomResourceOptions): CloudBackupSnapshot {
        return new CloudBackupSnapshot(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/cloudBackupSnapshot:CloudBackupSnapshot';

    /**
     * Returns true if the given object is an instance of CloudBackupSnapshot.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CloudBackupSnapshot {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CloudBackupSnapshot.__pulumiType;
    }

    /**
     * Cloud provider that stores this snapshot.
     */
    public /*out*/ readonly cloudProvider!: pulumi.Output<string>;
    /**
     * The name of the Atlas cluster that contains the snapshots you want to retrieve.
     */
    public readonly clusterName!: pulumi.Output<string>;
    /**
     * UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Description of the on-demand snapshot.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     */
    public /*out*/ readonly expiresAt!: pulumi.Output<string>;
    /**
     * Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     */
    public /*out*/ readonly masterKeyUuid!: pulumi.Output<string>;
    /**
     * Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
     */
    public /*out*/ readonly members!: pulumi.Output<outputs.CloudBackupSnapshotMember[]>;
    /**
     * Version of the MongoDB server.
     */
    public /*out*/ readonly mongodVersion!: pulumi.Output<string>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Label given to a shard or config server from which Atlas took this snapshot.
     */
    public /*out*/ readonly replicaSetName!: pulumi.Output<string>;
    /**
     * The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
     */
    public readonly retentionInDays!: pulumi.Output<number>;
    /**
     * Unique identifier of the snapshot.
     */
    public /*out*/ readonly snapshotId!: pulumi.Output<string>;
    /**
     * Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
     */
    public /*out*/ readonly snapshotIds!: pulumi.Output<string[]>;
    /**
     * Specified the type of snapshot. Valid values are onDemand and scheduled.
     */
    public /*out*/ readonly snapshotType!: pulumi.Output<string>;
    /**
     * Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Specifies the size of the snapshot in bytes.
     */
    public /*out*/ readonly storageSizeBytes!: pulumi.Output<number>;
    /**
     * Specifies the type of cluster: replicaSet or shardedCluster.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a CloudBackupSnapshot resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CloudBackupSnapshotArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CloudBackupSnapshotArgs | CloudBackupSnapshotState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CloudBackupSnapshotState | undefined;
            resourceInputs["cloudProvider"] = state ? state.cloudProvider : undefined;
            resourceInputs["clusterName"] = state ? state.clusterName : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expiresAt"] = state ? state.expiresAt : undefined;
            resourceInputs["masterKeyUuid"] = state ? state.masterKeyUuid : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["mongodVersion"] = state ? state.mongodVersion : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["replicaSetName"] = state ? state.replicaSetName : undefined;
            resourceInputs["retentionInDays"] = state ? state.retentionInDays : undefined;
            resourceInputs["snapshotId"] = state ? state.snapshotId : undefined;
            resourceInputs["snapshotIds"] = state ? state.snapshotIds : undefined;
            resourceInputs["snapshotType"] = state ? state.snapshotType : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["storageSizeBytes"] = state ? state.storageSizeBytes : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as CloudBackupSnapshotArgs | undefined;
            if ((!args || args.clusterName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterName'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.retentionInDays === undefined) && !opts.urn) {
                throw new Error("Missing required property 'retentionInDays'");
            }
            resourceInputs["clusterName"] = args ? args.clusterName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["retentionInDays"] = args ? args.retentionInDays : undefined;
            resourceInputs["cloudProvider"] = undefined /*out*/;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["expiresAt"] = undefined /*out*/;
            resourceInputs["masterKeyUuid"] = undefined /*out*/;
            resourceInputs["members"] = undefined /*out*/;
            resourceInputs["mongodVersion"] = undefined /*out*/;
            resourceInputs["replicaSetName"] = undefined /*out*/;
            resourceInputs["snapshotId"] = undefined /*out*/;
            resourceInputs["snapshotIds"] = undefined /*out*/;
            resourceInputs["snapshotType"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["storageSizeBytes"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CloudBackupSnapshot.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CloudBackupSnapshot resources.
 */
export interface CloudBackupSnapshotState {
    /**
     * Cloud provider that stores this snapshot.
     */
    cloudProvider?: pulumi.Input<string>;
    /**
     * The name of the Atlas cluster that contains the snapshots you want to retrieve.
     */
    clusterName?: pulumi.Input<string>;
    /**
     * UTC ISO 8601 formatted point in time when Atlas took the snapshot.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Description of the on-demand snapshot.
     */
    description?: pulumi.Input<string>;
    /**
     * UTC ISO 8601 formatted point in time when Atlas will delete the snapshot.
     */
    expiresAt?: pulumi.Input<string>;
    /**
     * Unique ID of the AWS KMS Customer Master Key used to encrypt the snapshot. Only visible for clusters using Encryption at Rest via Customer KMS.
     */
    masterKeyUuid?: pulumi.Input<string>;
    /**
     * Block of List of snapshots and the cloud provider where the snapshots are stored. Atlas returns this parameter when `type` is `shardedCluster`. See below
     */
    members?: pulumi.Input<pulumi.Input<inputs.CloudBackupSnapshotMember>[]>;
    /**
     * Version of the MongoDB server.
     */
    mongodVersion?: pulumi.Input<string>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Label given to a shard or config server from which Atlas took this snapshot.
     */
    replicaSetName?: pulumi.Input<string>;
    /**
     * The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
     */
    retentionInDays?: pulumi.Input<number>;
    /**
     * Unique identifier of the snapshot.
     */
    snapshotId?: pulumi.Input<string>;
    /**
     * Unique identifiers of the snapshots created for the shards and config server for a sharded cluster. Atlas returns this parameter when `type` is `shardedCluster`. These identifiers should match those given in the `members[n].id` parameters. This allows you to map a snapshot to its shard or config server name.
     */
    snapshotIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specified the type of snapshot. Valid values are onDemand and scheduled.
     */
    snapshotType?: pulumi.Input<string>;
    /**
     * Current status of the snapshot. One of the following values will be returned: queued, inProgress, completed, failed.
     */
    status?: pulumi.Input<string>;
    /**
     * Specifies the size of the snapshot in bytes.
     */
    storageSizeBytes?: pulumi.Input<number>;
    /**
     * Specifies the type of cluster: replicaSet or shardedCluster.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CloudBackupSnapshot resource.
 */
export interface CloudBackupSnapshotArgs {
    /**
     * The name of the Atlas cluster that contains the snapshots you want to retrieve.
     */
    clusterName: pulumi.Input<string>;
    /**
     * Description of the on-demand snapshot.
     */
    description: pulumi.Input<string>;
    /**
     * The unique identifier of the project for the Atlas cluster.
     */
    projectId: pulumi.Input<string>;
    /**
     * The number of days that Atlas should retain the on-demand snapshot. Must be at least 1.
     */
    retentionInDays: pulumi.Input<number>;
}
