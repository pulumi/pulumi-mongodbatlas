// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTERNAME`, e.g.
 *
 * ```sh
 *  $ pulumi import mongodbatlas:index/advancedCluster:AdvancedCluster my_cluster 1112222b3bf99403840e8934-Cluster0
 * ```
 *
 *  See detailed information for arguments and attributes[MongoDB API Advanced Clusters](https://docs.atlas.mongodb.com/reference/api/cluster-advanced/create-one-cluster-advanced/)
 */
export class AdvancedCluster extends pulumi.CustomResource {
    /**
     * Get an existing AdvancedCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AdvancedClusterState, opts?: pulumi.CustomResourceOptions): AdvancedCluster {
        return new AdvancedCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'mongodbatlas:index/advancedCluster:AdvancedCluster';

    /**
     * Returns true if the given object is an instance of AdvancedCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AdvancedCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AdvancedCluster.__pulumiType;
    }

    public readonly advancedConfiguration!: pulumi.Output<outputs.AdvancedClusterAdvancedConfiguration>;
    /**
     * Flag that indicates whether the cluster can perform backups.
     * If `true`, the cluster can perform backups. You must set this value to `true` for NVMe clusters.
     */
    public readonly backupEnabled!: pulumi.Output<boolean>;
    /**
     * Configuration settings applied to BI Connector for Atlas on this cluster. The MongoDB Connector for Business Intelligence for Atlas (BI Connector) is only available for M10 and larger clusters. The BI Connector is a powerful tool which provides users SQL-based access to their MongoDB databases. As a result, the BI Connector performs operations which may be CPU and memory intensive. Given the limited hardware resources on M10 and M20 cluster tiers, you may experience performance degradation of the cluster when enabling the BI Connector. If this occurs, upgrade to an M30 or larger cluster or disable the BI Connector. See below.
     */
    public readonly biConnector!: pulumi.Output<outputs.AdvancedClusterBiConnector>;
    /**
     * The cluster ID.
     */
    public /*out*/ readonly clusterId!: pulumi.Output<string>;
    /**
     * Type of the cluster that you want to create.
     * Accepted values include:
     */
    public readonly clusterType!: pulumi.Output<string>;
    /**
     * Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     */
    public /*out*/ readonly connectionStrings!: pulumi.Output<outputs.AdvancedClusterConnectionString[]>;
    public /*out*/ readonly createDate!: pulumi.Output<string>;
    /**
     * Capacity, in gigabytes, of the host's root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive number. You can't set this value with clusters with local [NVMe SSDs](https://docs.atlas.mongodb.com/cluster-tier/#std-label-nvme-storage). The minimum disk size for dedicated clusters is 10 GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value. If your cluster includes Azure nodes, this value must correspond to an existing Azure disk type (8, 16, 32, 64, 128, 256, 512, 1024, 2048, or 4095)Atlas calculates storage charges differently depending on whether you choose the default value or a custom value. The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider [upgrading your cluster](https://docs.atlas.mongodb.com/scale-cluster/#std-label-scale-cluster-instance) to a higher tier. If your cluster spans cloud service providers, this value defaults to the minimum default of the providers involved.
     */
    public readonly diskSizeGb!: pulumi.Output<number>;
    /**
     * Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-kms-encryption/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For Documentation, see [AWS](https://docs.atlas.mongodb.com/security-aws-kms/), [GCP](https://docs.atlas.mongodb.com/security-kms-encryption/) and [Azure](https://docs.atlas.mongodb.com/security-azure-kms/#std-label-security-azure-kms). Requirements are if `replication_specs.#.region_configs.#.<type>Specs.instance_size` is M10 or greater and `backupEnabled` is false or omitted.
     */
    public readonly encryptionAtRestProvider!: pulumi.Output<string>;
    /**
     * Configuration for the collection of key-value pairs that tag and categorize the cluster. See below.
     */
    public readonly labels!: pulumi.Output<outputs.AdvancedClusterLabel[]>;
    /**
     * Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.0`, `4.2`, `4.4`, or `5.0`. If omitted, Atlas deploys a cluster that runs MongoDB 4.4. If `replication_specs#.region_configs#.<type>Specs.instance_size`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 4.4. Atlas always deploys the cluster with the latest stable release of the specified version.  If you set a value to this parameter and set `versionReleaseSystem` `CONTINUOUS`, the resource returns an error. Either clear this parameter or set `versionReleaseSystem`: `LTS`.
     */
    public readonly mongoDbMajorVersion!: pulumi.Output<string>;
    /**
     * Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     */
    public /*out*/ readonly mongoDbVersion!: pulumi.Output<string>;
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly paused!: pulumi.Output<boolean | undefined>;
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     */
    public readonly pitEnabled!: pulumi.Output<boolean>;
    /**
     * Unique ID for the project to create the database user.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Configuration for cluster regions and the hardware provisioned in them. See below
     */
    public readonly replicationSpecs!: pulumi.Output<outputs.AdvancedClusterReplicationSpec[]>;
    /**
     * Certificate Authority that MongoDB Atlas clusters use. You can specify ISRGROOTX1 (for ISRG Root X1).
     */
    public readonly rootCertType!: pulumi.Output<string>;
    /**
     * Current state of the cluster. The possible states are:
     * - IDLE
     * - CREATING
     * - UPDATING
     * - DELETING
     * - DELETED
     * - REPAIRING
     */
    public /*out*/ readonly stateName!: pulumi.Output<string>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    public readonly terminationProtectionEnabled!: pulumi.Output<boolean>;
    /**
     * Release cadence that Atlas uses for this cluster. This parameter defaults to `LTS`. If you set this field to `CONTINUOUS`, you must omit the `mongoDbMajorVersion` field. Atlas accepts:
     */
    public readonly versionReleaseSystem!: pulumi.Output<string | undefined>;

    /**
     * Create a AdvancedCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AdvancedClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AdvancedClusterArgs | AdvancedClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AdvancedClusterState | undefined;
            resourceInputs["advancedConfiguration"] = state ? state.advancedConfiguration : undefined;
            resourceInputs["backupEnabled"] = state ? state.backupEnabled : undefined;
            resourceInputs["biConnector"] = state ? state.biConnector : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterType"] = state ? state.clusterType : undefined;
            resourceInputs["connectionStrings"] = state ? state.connectionStrings : undefined;
            resourceInputs["createDate"] = state ? state.createDate : undefined;
            resourceInputs["diskSizeGb"] = state ? state.diskSizeGb : undefined;
            resourceInputs["encryptionAtRestProvider"] = state ? state.encryptionAtRestProvider : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["mongoDbMajorVersion"] = state ? state.mongoDbMajorVersion : undefined;
            resourceInputs["mongoDbVersion"] = state ? state.mongoDbVersion : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["paused"] = state ? state.paused : undefined;
            resourceInputs["pitEnabled"] = state ? state.pitEnabled : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["replicationSpecs"] = state ? state.replicationSpecs : undefined;
            resourceInputs["rootCertType"] = state ? state.rootCertType : undefined;
            resourceInputs["stateName"] = state ? state.stateName : undefined;
            resourceInputs["terminationProtectionEnabled"] = state ? state.terminationProtectionEnabled : undefined;
            resourceInputs["versionReleaseSystem"] = state ? state.versionReleaseSystem : undefined;
        } else {
            const args = argsOrState as AdvancedClusterArgs | undefined;
            if ((!args || args.clusterType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterType'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.replicationSpecs === undefined) && !opts.urn) {
                throw new Error("Missing required property 'replicationSpecs'");
            }
            resourceInputs["advancedConfiguration"] = args ? args.advancedConfiguration : undefined;
            resourceInputs["backupEnabled"] = args ? args.backupEnabled : undefined;
            resourceInputs["biConnector"] = args ? args.biConnector : undefined;
            resourceInputs["clusterType"] = args ? args.clusterType : undefined;
            resourceInputs["diskSizeGb"] = args ? args.diskSizeGb : undefined;
            resourceInputs["encryptionAtRestProvider"] = args ? args.encryptionAtRestProvider : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["mongoDbMajorVersion"] = args ? args.mongoDbMajorVersion : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["paused"] = args ? args.paused : undefined;
            resourceInputs["pitEnabled"] = args ? args.pitEnabled : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["replicationSpecs"] = args ? args.replicationSpecs : undefined;
            resourceInputs["rootCertType"] = args ? args.rootCertType : undefined;
            resourceInputs["terminationProtectionEnabled"] = args ? args.terminationProtectionEnabled : undefined;
            resourceInputs["versionReleaseSystem"] = args ? args.versionReleaseSystem : undefined;
            resourceInputs["clusterId"] = undefined /*out*/;
            resourceInputs["connectionStrings"] = undefined /*out*/;
            resourceInputs["createDate"] = undefined /*out*/;
            resourceInputs["mongoDbVersion"] = undefined /*out*/;
            resourceInputs["stateName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AdvancedCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AdvancedCluster resources.
 */
export interface AdvancedClusterState {
    advancedConfiguration?: pulumi.Input<inputs.AdvancedClusterAdvancedConfiguration>;
    /**
     * Flag that indicates whether the cluster can perform backups.
     * If `true`, the cluster can perform backups. You must set this value to `true` for NVMe clusters.
     */
    backupEnabled?: pulumi.Input<boolean>;
    /**
     * Configuration settings applied to BI Connector for Atlas on this cluster. The MongoDB Connector for Business Intelligence for Atlas (BI Connector) is only available for M10 and larger clusters. The BI Connector is a powerful tool which provides users SQL-based access to their MongoDB databases. As a result, the BI Connector performs operations which may be CPU and memory intensive. Given the limited hardware resources on M10 and M20 cluster tiers, you may experience performance degradation of the cluster when enabling the BI Connector. If this occurs, upgrade to an M30 or larger cluster or disable the BI Connector. See below.
     */
    biConnector?: pulumi.Input<inputs.AdvancedClusterBiConnector>;
    /**
     * The cluster ID.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * Type of the cluster that you want to create.
     * Accepted values include:
     */
    clusterType?: pulumi.Input<string>;
    /**
     * Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     */
    connectionStrings?: pulumi.Input<pulumi.Input<inputs.AdvancedClusterConnectionString>[]>;
    createDate?: pulumi.Input<string>;
    /**
     * Capacity, in gigabytes, of the host's root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive number. You can't set this value with clusters with local [NVMe SSDs](https://docs.atlas.mongodb.com/cluster-tier/#std-label-nvme-storage). The minimum disk size for dedicated clusters is 10 GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value. If your cluster includes Azure nodes, this value must correspond to an existing Azure disk type (8, 16, 32, 64, 128, 256, 512, 1024, 2048, or 4095)Atlas calculates storage charges differently depending on whether you choose the default value or a custom value. The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider [upgrading your cluster](https://docs.atlas.mongodb.com/scale-cluster/#std-label-scale-cluster-instance) to a higher tier. If your cluster spans cloud service providers, this value defaults to the minimum default of the providers involved.
     */
    diskSizeGb?: pulumi.Input<number>;
    /**
     * Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-kms-encryption/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For Documentation, see [AWS](https://docs.atlas.mongodb.com/security-aws-kms/), [GCP](https://docs.atlas.mongodb.com/security-kms-encryption/) and [Azure](https://docs.atlas.mongodb.com/security-azure-kms/#std-label-security-azure-kms). Requirements are if `replication_specs.#.region_configs.#.<type>Specs.instance_size` is M10 or greater and `backupEnabled` is false or omitted.
     */
    encryptionAtRestProvider?: pulumi.Input<string>;
    /**
     * Configuration for the collection of key-value pairs that tag and categorize the cluster. See below.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.AdvancedClusterLabel>[]>;
    /**
     * Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.0`, `4.2`, `4.4`, or `5.0`. If omitted, Atlas deploys a cluster that runs MongoDB 4.4. If `replication_specs#.region_configs#.<type>Specs.instance_size`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 4.4. Atlas always deploys the cluster with the latest stable release of the specified version.  If you set a value to this parameter and set `versionReleaseSystem` `CONTINUOUS`, the resource returns an error. Either clear this parameter or set `versionReleaseSystem`: `LTS`.
     */
    mongoDbMajorVersion?: pulumi.Input<string>;
    /**
     * Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     */
    mongoDbVersion?: pulumi.Input<string>;
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     */
    name?: pulumi.Input<string>;
    paused?: pulumi.Input<boolean>;
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     */
    pitEnabled?: pulumi.Input<boolean>;
    /**
     * Unique ID for the project to create the database user.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Configuration for cluster regions and the hardware provisioned in them. See below
     */
    replicationSpecs?: pulumi.Input<pulumi.Input<inputs.AdvancedClusterReplicationSpec>[]>;
    /**
     * Certificate Authority that MongoDB Atlas clusters use. You can specify ISRGROOTX1 (for ISRG Root X1).
     */
    rootCertType?: pulumi.Input<string>;
    /**
     * Current state of the cluster. The possible states are:
     * - IDLE
     * - CREATING
     * - UPDATING
     * - DELETING
     * - DELETED
     * - REPAIRING
     */
    stateName?: pulumi.Input<string>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    terminationProtectionEnabled?: pulumi.Input<boolean>;
    /**
     * Release cadence that Atlas uses for this cluster. This parameter defaults to `LTS`. If you set this field to `CONTINUOUS`, you must omit the `mongoDbMajorVersion` field. Atlas accepts:
     */
    versionReleaseSystem?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AdvancedCluster resource.
 */
export interface AdvancedClusterArgs {
    advancedConfiguration?: pulumi.Input<inputs.AdvancedClusterAdvancedConfiguration>;
    /**
     * Flag that indicates whether the cluster can perform backups.
     * If `true`, the cluster can perform backups. You must set this value to `true` for NVMe clusters.
     */
    backupEnabled?: pulumi.Input<boolean>;
    /**
     * Configuration settings applied to BI Connector for Atlas on this cluster. The MongoDB Connector for Business Intelligence for Atlas (BI Connector) is only available for M10 and larger clusters. The BI Connector is a powerful tool which provides users SQL-based access to their MongoDB databases. As a result, the BI Connector performs operations which may be CPU and memory intensive. Given the limited hardware resources on M10 and M20 cluster tiers, you may experience performance degradation of the cluster when enabling the BI Connector. If this occurs, upgrade to an M30 or larger cluster or disable the BI Connector. See below.
     */
    biConnector?: pulumi.Input<inputs.AdvancedClusterBiConnector>;
    /**
     * Type of the cluster that you want to create.
     * Accepted values include:
     */
    clusterType: pulumi.Input<string>;
    /**
     * Capacity, in gigabytes, of the host's root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive number. You can't set this value with clusters with local [NVMe SSDs](https://docs.atlas.mongodb.com/cluster-tier/#std-label-nvme-storage). The minimum disk size for dedicated clusters is 10 GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value. If your cluster includes Azure nodes, this value must correspond to an existing Azure disk type (8, 16, 32, 64, 128, 256, 512, 1024, 2048, or 4095)Atlas calculates storage charges differently depending on whether you choose the default value or a custom value. The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider [upgrading your cluster](https://docs.atlas.mongodb.com/scale-cluster/#std-label-scale-cluster-instance) to a higher tier. If your cluster spans cloud service providers, this value defaults to the minimum default of the providers involved.
     */
    diskSizeGb?: pulumi.Input<number>;
    /**
     * Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-kms-encryption/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For Documentation, see [AWS](https://docs.atlas.mongodb.com/security-aws-kms/), [GCP](https://docs.atlas.mongodb.com/security-kms-encryption/) and [Azure](https://docs.atlas.mongodb.com/security-azure-kms/#std-label-security-azure-kms). Requirements are if `replication_specs.#.region_configs.#.<type>Specs.instance_size` is M10 or greater and `backupEnabled` is false or omitted.
     */
    encryptionAtRestProvider?: pulumi.Input<string>;
    /**
     * Configuration for the collection of key-value pairs that tag and categorize the cluster. See below.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.AdvancedClusterLabel>[]>;
    /**
     * Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.0`, `4.2`, `4.4`, or `5.0`. If omitted, Atlas deploys a cluster that runs MongoDB 4.4. If `replication_specs#.region_configs#.<type>Specs.instance_size`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 4.4. Atlas always deploys the cluster with the latest stable release of the specified version.  If you set a value to this parameter and set `versionReleaseSystem` `CONTINUOUS`, the resource returns an error. Either clear this parameter or set `versionReleaseSystem`: `LTS`.
     */
    mongoDbMajorVersion?: pulumi.Input<string>;
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     */
    name?: pulumi.Input<string>;
    paused?: pulumi.Input<boolean>;
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     */
    pitEnabled?: pulumi.Input<boolean>;
    /**
     * Unique ID for the project to create the database user.
     */
    projectId: pulumi.Input<string>;
    /**
     * Configuration for cluster regions and the hardware provisioned in them. See below
     */
    replicationSpecs: pulumi.Input<pulumi.Input<inputs.AdvancedClusterReplicationSpec>[]>;
    /**
     * Certificate Authority that MongoDB Atlas clusters use. You can specify ISRGROOTX1 (for ISRG Root X1).
     */
    rootCertType?: pulumi.Input<string>;
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     */
    terminationProtectionEnabled?: pulumi.Input<boolean>;
    /**
     * Release cadence that Atlas uses for this cluster. This parameter defaults to `LTS`. If you set this field to `CONTINUOUS`, you must omit the `mongoDbMajorVersion` field. Atlas accepts:
     */
    versionReleaseSystem?: pulumi.Input<string>;
}
