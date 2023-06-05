// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.ClusterArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.ClusterState;
import com.pulumi.mongodbatlas.outputs.ClusterAdvancedConfiguration;
import com.pulumi.mongodbatlas.outputs.ClusterBiConnectorConfig;
import com.pulumi.mongodbatlas.outputs.ClusterConnectionString;
import com.pulumi.mongodbatlas.outputs.ClusterLabel;
import com.pulumi.mongodbatlas.outputs.ClusterReplicationSpec;
import com.pulumi.mongodbatlas.outputs.ClusterSnapshotBackupPolicy;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTERNAME`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/cluster:Cluster my_cluster 1112222b3bf99403840e8934-Cluster0
 * ```
 * 
 *  See detailed information for arguments and attributes[MongoDB API Clusters](https://docs.atlas.mongodb.com/reference/api/clusters-create-one/)
 * 
 */
@ResourceType(type="mongodbatlas:index/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    @Export(name="advancedConfiguration", type=ClusterAdvancedConfiguration.class, parameters={})
    private Output<ClusterAdvancedConfiguration> advancedConfiguration;

    public Output<ClusterAdvancedConfiguration> advancedConfiguration() {
        return this.advancedConfiguration;
    }
    @Export(name="autoScalingComputeEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> autoScalingComputeEnabled;

    public Output<Boolean> autoScalingComputeEnabled() {
        return this.autoScalingComputeEnabled;
    }
    /**
     * Set to `true` to enable the cluster tier to scale down. This option is only available if `autoScaling.compute.enabled` is `true`.
     * - If this option is enabled, you must specify a value for `providerSettings.autoScaling.compute.minInstanceSize`
     * 
     */
    @Export(name="autoScalingComputeScaleDownEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> autoScalingComputeScaleDownEnabled;

    /**
     * @return Set to `true` to enable the cluster tier to scale down. This option is only available if `autoScaling.compute.enabled` is `true`.
     * - If this option is enabled, you must specify a value for `providerSettings.autoScaling.compute.minInstanceSize`
     * 
     */
    public Output<Boolean> autoScalingComputeScaleDownEnabled() {
        return this.autoScalingComputeScaleDownEnabled;
    }
    /**
     * Specifies whether disk auto-scaling is enabled. The default is true.
     * - Set to `true` to enable disk auto-scaling.
     * - Set to `false` to disable disk auto-scaling.
     * 
     * &gt; **NOTE:** If `provider_name` is set to `TENANT`, the parameter `auto_scaling_disk_gb_enabled` will be ignored.
     * 
     */
    @Export(name="autoScalingDiskGbEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoScalingDiskGbEnabled;

    /**
     * @return Specifies whether disk auto-scaling is enabled. The default is true.
     * - Set to `true` to enable disk auto-scaling.
     * - Set to `false` to disable disk auto-scaling.
     * 
     * &gt; **NOTE:** If `provider_name` is set to `TENANT`, the parameter `auto_scaling_disk_gb_enabled` will be ignored.
     * 
     */
    public Output<Optional<Boolean>> autoScalingDiskGbEnabled() {
        return Codegen.optional(this.autoScalingDiskGbEnabled);
    }
    /**
     * Cloud service provider on which the server for a multi-tenant cluster is provisioned.
     * 
     * This setting is only valid when providerSetting.providerName is TENANT and providerSetting.instanceSizeName is M2 or M5.
     * 
     * The possible values are:
     * 
     * - AWS - Amazon AWS
     * - GCP - Google Cloud Platform
     * - AZURE - Microsoft Azure
     * 
     */
    @Export(name="backingProviderName", type=String.class, parameters={})
    private Output<String> backingProviderName;

    /**
     * @return Cloud service provider on which the server for a multi-tenant cluster is provisioned.
     * 
     * This setting is only valid when providerSetting.providerName is TENANT and providerSetting.instanceSizeName is M2 or M5.
     * 
     * The possible values are:
     * 
     * - AWS - Amazon AWS
     * - GCP - Google Cloud Platform
     * - AZURE - Microsoft Azure
     * 
     */
    public Output<String> backingProviderName() {
        return this.backingProviderName;
    }
    /**
     * Legacy Backup - Set to true to enable Atlas legacy backups for the cluster.
     * **Important** - MongoDB deprecated the Legacy Backup feature. Clusters that use Legacy Backup can continue to use it. MongoDB recommends using [Cloud Backups](https://docs.atlas.mongodb.com/backup/cloud-backup/overview/).
     * * New Atlas clusters of any type do not support this parameter. These clusters must use Cloud Backup, `cloud_backup`, to enable Cloud Backup.  If you create a new Atlas cluster and set `backup_enabled` to true, the Provider will respond with an error.  This change doesn’t affect existing clusters that use legacy backups.
     * * Setting this value to false to disable legacy backups for the cluster will let Atlas delete any stored snapshots. In order to preserve the legacy backups snapshots, disable the legacy backups and enable the cloud backups in the single **pulumi up** action.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * * The default value is false.  M10 and above only.
     * 
     */
    @Export(name="backupEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> backupEnabled;

    /**
     * @return Legacy Backup - Set to true to enable Atlas legacy backups for the cluster.
     * **Important** - MongoDB deprecated the Legacy Backup feature. Clusters that use Legacy Backup can continue to use it. MongoDB recommends using [Cloud Backups](https://docs.atlas.mongodb.com/backup/cloud-backup/overview/).
     * * New Atlas clusters of any type do not support this parameter. These clusters must use Cloud Backup, `cloud_backup`, to enable Cloud Backup.  If you create a new Atlas cluster and set `backup_enabled` to true, the Provider will respond with an error.  This change doesn’t affect existing clusters that use legacy backups.
     * * Setting this value to false to disable legacy backups for the cluster will let Atlas delete any stored snapshots. In order to preserve the legacy backups snapshots, disable the legacy backups and enable the cloud backups in the single **pulumi up** action.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * * The default value is false.  M10 and above only.
     * 
     */
    public Output<Optional<Boolean>> backupEnabled() {
        return Codegen.optional(this.backupEnabled);
    }
    /**
     * Specifies BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details. **DEPRECATED** Use `bi_connector_config` instead.
     * 
     * @deprecated
     * use bi_connector_config instead
     * 
     */
    @Deprecated /* use bi_connector_config instead */
    @Export(name="biConnector", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> biConnector;

    /**
     * @return Specifies BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details. **DEPRECATED** Use `bi_connector_config` instead.
     * 
     */
    public Output<Optional<Map<String,String>>> biConnector() {
        return Codegen.optional(this.biConnector);
    }
    /**
     * Specifies BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details.
     * 
     */
    @Export(name="biConnectorConfig", type=ClusterBiConnectorConfig.class, parameters={})
    private Output<ClusterBiConnectorConfig> biConnectorConfig;

    /**
     * @return Specifies BI Connector for Atlas configuration on this cluster. BI Connector for Atlas is only available for M10+ clusters. See BI Connector below for more details.
     * 
     */
    public Output<ClusterBiConnectorConfig> biConnectorConfig() {
        return this.biConnectorConfig;
    }
    @Export(name="cloudBackup", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cloudBackup;

    public Output<Optional<Boolean>> cloudBackup() {
        return Codegen.optional(this.cloudBackup);
    }
    /**
     * The cluster ID.
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The cluster ID.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Specifies the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
     * 
     * &gt; **WHEN SHOULD YOU USE CLUSTERTYPE?**
     * When you set replication_specs, when you are deploying Global Clusters or when you are deploying non-Global replica sets and sharded clusters.
     * 
     * Accepted values include:
     * 
     */
    @Export(name="clusterType", type=String.class, parameters={})
    private Output<String> clusterType;

    /**
     * @return Specifies the type of the cluster that you want to modify. You cannot convert a sharded cluster deployment to a replica set deployment.
     * 
     * &gt; **WHEN SHOULD YOU USE CLUSTERTYPE?**
     * When you set replication_specs, when you are deploying Global Clusters or when you are deploying non-Global replica sets and sharded clusters.
     * 
     * Accepted values include:
     * 
     */
    public Output<String> clusterType() {
        return this.clusterType;
    }
    /**
     * Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    @Export(name="connectionStrings", type=List.class, parameters={ClusterConnectionString.class})
    private Output<List<ClusterConnectionString>> connectionStrings;

    /**
     * @return Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    public Output<List<ClusterConnectionString>> connectionStrings() {
        return this.connectionStrings;
    }
    /**
     * The Container ID is the id of the container created when the first cluster in the region (AWS/Azure) or project (GCP) was created.
     * 
     */
    @Export(name="containerId", type=String.class, parameters={})
    private Output<String> containerId;

    /**
     * @return The Container ID is the id of the container created when the first cluster in the region (AWS/Azure) or project (GCP) was created.
     * 
     */
    public Output<String> containerId() {
        return this.containerId;
    }
    /**
     * Capacity, in gigabytes, of the host’s root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive integer.
     * * The minimum disk size for dedicated clusters is 10GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value.
     * * Note: The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider upgrading your cluster to a higher tier.
     * * Cannot be used with clusters with local NVMe SSDs
     * * Cannot be used with Azure clusters
     * 
     */
    @Export(name="diskSizeGb", type=Double.class, parameters={})
    private Output<Double> diskSizeGb;

    /**
     * @return Capacity, in gigabytes, of the host’s root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive integer.
     * * The minimum disk size for dedicated clusters is 10GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value.
     * * Note: The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider upgrading your cluster to a higher tier.
     * * Cannot be used with clusters with local NVMe SSDs
     * * Cannot be used with Azure clusters
     * 
     */
    public Output<Double> diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-aws-kms/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For complete documentation on configuring Encryption at Rest, see Encryption at Rest using Customer Key Management. Requires M10 or greater. and for legacy backups, backup_enabled, to be false or omitted. **Note: Atlas encrypts all cluster storage and snapshot volumes, securing all cluster data on disk: a concept known as encryption at rest, by default**.
     * 
     */
    @Export(name="encryptionAtRestProvider", type=String.class, parameters={})
    private Output<String> encryptionAtRestProvider;

    /**
     * @return Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-aws-kms/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For complete documentation on configuring Encryption at Rest, see Encryption at Rest using Customer Key Management. Requires M10 or greater. and for legacy backups, backup_enabled, to be false or omitted. **Note: Atlas encrypts all cluster storage and snapshot volumes, securing all cluster data on disk: a concept known as encryption at rest, by default**.
     * 
     */
    public Output<String> encryptionAtRestProvider() {
        return this.encryptionAtRestProvider;
    }
    @Export(name="labels", type=List.class, parameters={ClusterLabel.class})
    private Output<List<ClusterLabel>> labels;

    public Output<List<ClusterLabel>> labels() {
        return this.labels;
    }
    /**
     * Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.2`, `4.4`, `5.0`, or `6.0`. If omitted, Atlas deploys a cluster that runs MongoDB 5.0. If `provider_instance_size_name`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 5.0. Atlas always deploys the cluster with the latest stable release of the specified version. See [Release Notes](https://www.mongodb.com/docs/upcoming/release-notes/) for latest Current Stable Release.
     * 
     */
    @Export(name="mongoDbMajorVersion", type=String.class, parameters={})
    private Output<String> mongoDbMajorVersion;

    /**
     * @return Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.2`, `4.4`, `5.0`, or `6.0`. If omitted, Atlas deploys a cluster that runs MongoDB 5.0. If `provider_instance_size_name`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 5.0. Atlas always deploys the cluster with the latest stable release of the specified version. See [Release Notes](https://www.mongodb.com/docs/upcoming/release-notes/) for latest Current Stable Release.
     * 
     */
    public Output<String> mongoDbMajorVersion() {
        return this.mongoDbMajorVersion;
    }
    /**
     * Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     * 
     */
    @Export(name="mongoDbVersion", type=String.class, parameters={})
    private Output<String> mongoDbVersion;

    /**
     * @return Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     * 
     */
    public Output<String> mongoDbVersion() {
        return this.mongoDbVersion;
    }
    /**
     * Base connection string for the cluster. Atlas only displays this field after the cluster is operational, not while it builds the cluster.
     * 
     */
    @Export(name="mongoUri", type=String.class, parameters={})
    private Output<String> mongoUri;

    /**
     * @return Base connection string for the cluster. Atlas only displays this field after the cluster is operational, not while it builds the cluster.
     * 
     */
    public Output<String> mongoUri() {
        return this.mongoUri;
    }
    /**
     * Lists when the connection string was last updated. The connection string changes, for example, if you change a replica set to a sharded cluster.
     * 
     */
    @Export(name="mongoUriUpdated", type=String.class, parameters={})
    private Output<String> mongoUriUpdated;

    /**
     * @return Lists when the connection string was last updated. The connection string changes, for example, if you change a replica set to a sharded cluster.
     * 
     */
    public Output<String> mongoUriUpdated() {
        return this.mongoUriUpdated;
    }
    /**
     * connection string for connecting to the Atlas cluster. Includes the replicaSet, ssl, and authSource query parameters in the connection string with values appropriate for the cluster.
     * 
     */
    @Export(name="mongoUriWithOptions", type=String.class, parameters={})
    private Output<String> mongoUriWithOptions;

    /**
     * @return connection string for connecting to the Atlas cluster. Includes the replicaSet, ssl, and authSource query parameters in the connection string with values appropriate for the cluster.
     * 
     */
    public Output<String> mongoUriWithOptions() {
        return this.mongoUriWithOptions;
    }
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
     * 
     */
    @Export(name="numShards", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numShards;

    /**
     * @return Selects whether the cluster is a replica set or a sharded cluster. If you use the replicationSpecs parameter, you must set num_shards.
     * 
     */
    public Output<Optional<Integer>> numShards() {
        return Codegen.optional(this.numShards);
    }
    @Export(name="paused", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> paused;

    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup. If set to true, cloud_backup must also be set to true.
     * 
     */
    @Export(name="pitEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> pitEnabled;

    /**
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup. If set to true, cloud_backup must also be set to true.
     * 
     */
    public Output<Boolean> pitEnabled() {
        return this.pitEnabled;
    }
    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Maximum instance size to which your cluster can automatically scale (e.g., M40). Required if `autoScaling.compute.enabled` is `true`.
     * 
     */
    @Export(name="providerAutoScalingComputeMaxInstanceSize", type=String.class, parameters={})
    private Output<String> providerAutoScalingComputeMaxInstanceSize;

    /**
     * @return Maximum instance size to which your cluster can automatically scale (e.g., M40). Required if `autoScaling.compute.enabled` is `true`.
     * 
     */
    public Output<String> providerAutoScalingComputeMaxInstanceSize() {
        return this.providerAutoScalingComputeMaxInstanceSize;
    }
    /**
     * Minimum instance size to which your cluster can automatically scale (e.g., M10). Required if `autoScaling.compute.scaleDownEnabled` is `true`.
     * 
     */
    @Export(name="providerAutoScalingComputeMinInstanceSize", type=String.class, parameters={})
    private Output<String> providerAutoScalingComputeMinInstanceSize;

    /**
     * @return Minimum instance size to which your cluster can automatically scale (e.g., M10). Required if `autoScaling.compute.scaleDownEnabled` is `true`.
     * 
     */
    public Output<String> providerAutoScalingComputeMinInstanceSize() {
        return this.providerAutoScalingComputeMinInstanceSize;
    }
    /**
     * Flag indicating if the cluster uses Cloud Backup for backups. **Deprecated** use `cloud_backup` instead.
     * 
     * @deprecated
     * This field is deprecated,please use cloud_backup instead
     * 
     */
    @Deprecated /* This field is deprecated,please use cloud_backup instead */
    @Export(name="providerBackupEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> providerBackupEnabled;

    /**
     * @return Flag indicating if the cluster uses Cloud Backup for backups. **Deprecated** use `cloud_backup` instead.
     * 
     */
    public Output<Optional<Boolean>> providerBackupEnabled() {
        return Codegen.optional(this.providerBackupEnabled);
    }
    /**
     * The maximum input/output operations per second (IOPS) the system can perform. The possible values depend on the selected `provider_instance_size_name` and `disk_size_gb`.  This setting requires that `provider_instance_size_name` to be M30 or greater and cannot be used with clusters with local NVMe SSDs.  The default value for `provider_disk_iops` is the same as the cluster tier&#39;s Standard IOPS value, as viewable in the Atlas console.  It is used in cases where a higher number of IOPS is needed and possible.  If a value is submitted that is lower or equal to the default IOPS value for the cluster tier Atlas ignores the requested value and uses the default.  More details available under the providerSettings.diskIOPS parameter: [MongoDB API Clusters](https://docs.atlas.mongodb.com/reference/api/clusters-create-one/)
     * * You do not need to configure IOPS for a STANDARD disk configuration but only for a PROVISIONED configuration.
     * 
     */
    @Export(name="providerDiskIops", type=Integer.class, parameters={})
    private Output<Integer> providerDiskIops;

    /**
     * @return The maximum input/output operations per second (IOPS) the system can perform. The possible values depend on the selected `provider_instance_size_name` and `disk_size_gb`.  This setting requires that `provider_instance_size_name` to be M30 or greater and cannot be used with clusters with local NVMe SSDs.  The default value for `provider_disk_iops` is the same as the cluster tier&#39;s Standard IOPS value, as viewable in the Atlas console.  It is used in cases where a higher number of IOPS is needed and possible.  If a value is submitted that is lower or equal to the default IOPS value for the cluster tier Atlas ignores the requested value and uses the default.  More details available under the providerSettings.diskIOPS parameter: [MongoDB API Clusters](https://docs.atlas.mongodb.com/reference/api/clusters-create-one/)
     * * You do not need to configure IOPS for a STANDARD disk configuration but only for a PROVISIONED configuration.
     * 
     */
    public Output<Integer> providerDiskIops() {
        return this.providerDiskIops;
    }
    /**
     * Azure disk type of the server’s root volume. If omitted, Atlas uses the default disk type for the selected providerSettings.instanceSizeName.  Example disk types and associated storage sizes: P4 - 32GB, P6 - 64GB, P10 - 128GB, P15 - 256GB, P20 - 512GB, P30 - 1024GB, P40 - 2048GB, P50 - 4095GB.  More information and the most update to date disk types/storage sizes can be located at https://docs.atlas.mongodb.com/reference/api/clusters-create-one/.
     * 
     */
    @Export(name="providerDiskTypeName", type=String.class, parameters={})
    private Output<String> providerDiskTypeName;

    /**
     * @return Azure disk type of the server’s root volume. If omitted, Atlas uses the default disk type for the selected providerSettings.instanceSizeName.  Example disk types and associated storage sizes: P4 - 32GB, P6 - 64GB, P10 - 128GB, P15 - 256GB, P20 - 512GB, P30 - 1024GB, P40 - 2048GB, P50 - 4095GB.  More information and the most update to date disk types/storage sizes can be located at https://docs.atlas.mongodb.com/reference/api/clusters-create-one/.
     * 
     */
    public Output<String> providerDiskTypeName() {
        return this.providerDiskTypeName;
    }
    /**
     * **(Deprecated) The Flag is always true.** Flag that indicates whether the Amazon EBS encryption feature encrypts the host&#39;s root volume for both data at rest within the volume and for data moving between the volume and the cluster. Note: This setting is always enabled for clusters with local NVMe SSDs. **Atlas encrypts all cluster storage and snapshot volumes, securing all cluster data on disk: a concept known as encryption at rest, by default.**.
     * 
     * @deprecated
     * All EBS volumes are encrypted by default, the option to disable encryption has been removed
     * 
     */
    @Deprecated /* All EBS volumes are encrypted by default, the option to disable encryption has been removed */
    @Export(name="providerEncryptEbsVolume", type=Boolean.class, parameters={})
    private Output<Boolean> providerEncryptEbsVolume;

    /**
     * @return **(Deprecated) The Flag is always true.** Flag that indicates whether the Amazon EBS encryption feature encrypts the host&#39;s root volume for both data at rest within the volume and for data moving between the volume and the cluster. Note: This setting is always enabled for clusters with local NVMe SSDs. **Atlas encrypts all cluster storage and snapshot volumes, securing all cluster data on disk: a concept known as encryption at rest, by default.**.
     * 
     */
    public Output<Boolean> providerEncryptEbsVolume() {
        return this.providerEncryptEbsVolume;
    }
    @Export(name="providerEncryptEbsVolumeFlag", type=Boolean.class, parameters={})
    private Output<Boolean> providerEncryptEbsVolumeFlag;

    public Output<Boolean> providerEncryptEbsVolumeFlag() {
        return this.providerEncryptEbsVolumeFlag;
    }
    /**
     * Atlas provides different instance sizes, each with a default storage capacity and RAM size. The instance size you select is used for all the data-bearing servers in your cluster. See [Create a Cluster](https://docs.atlas.mongodb.com/reference/api/clusters-create-one/) `providerSettings.instanceSizeName` for valid values and default resources.
     * 
     */
    @Export(name="providerInstanceSizeName", type=String.class, parameters={})
    private Output<String> providerInstanceSizeName;

    /**
     * @return Atlas provides different instance sizes, each with a default storage capacity and RAM size. The instance size you select is used for all the data-bearing servers in your cluster. See [Create a Cluster](https://docs.atlas.mongodb.com/reference/api/clusters-create-one/) `providerSettings.instanceSizeName` for valid values and default resources.
     * 
     */
    public Output<String> providerInstanceSizeName() {
        return this.providerInstanceSizeName;
    }
    /**
     * Cloud service provider on which the servers are provisioned.
     * 
     * The possible values are:
     * 
     */
    @Export(name="providerName", type=String.class, parameters={})
    private Output<String> providerName;

    /**
     * @return Cloud service provider on which the servers are provisioned.
     * 
     * The possible values are:
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }
    /**
     * Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * Do not specify this field when creating a multi-region cluster using the replicationSpec document or a Global Cluster with the replicationSpecs array.
     * 
     */
    @Export(name="providerRegionName", type=String.class, parameters={})
    private Output<String> providerRegionName;

    /**
     * @return Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     * Do not specify this field when creating a multi-region cluster using the replicationSpec document or a Global Cluster with the replicationSpecs array.
     * 
     */
    public Output<String> providerRegionName() {
        return this.providerRegionName;
    }
    /**
     * The type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.  `PROVISIONED` is ONLY required if setting IOPS higher than the default instance IOPS.
     * 
     */
    @Export(name="providerVolumeType", type=String.class, parameters={})
    private Output<String> providerVolumeType;

    /**
     * @return The type of the volume. The possible values are: `STANDARD` and `PROVISIONED`.  `PROVISIONED` is ONLY required if setting IOPS higher than the default instance IOPS.
     * 
     */
    public Output<String> providerVolumeType() {
        return this.providerVolumeType;
    }
    /**
     * Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
     * 
     */
    @Export(name="replicationFactor", type=Integer.class, parameters={})
    private Output<Integer> replicationFactor;

    /**
     * @return Number of replica set members. Each member keeps a copy of your databases, providing high availability and data redundancy. The possible values are 3, 5, or 7. The default value is 3.
     * 
     */
    public Output<Integer> replicationFactor() {
        return this.replicationFactor;
    }
    /**
     * Configuration for cluster regions.  See Replication Spec below for more details.
     * 
     */
    @Export(name="replicationSpecs", type=List.class, parameters={ClusterReplicationSpec.class})
    private Output<List<ClusterReplicationSpec>> replicationSpecs;

    /**
     * @return Configuration for cluster regions.  See Replication Spec below for more details.
     * 
     */
    public Output<List<ClusterReplicationSpec>> replicationSpecs() {
        return this.replicationSpecs;
    }
    /**
     * current snapshot schedule and retention settings for the cluster.
     * 
     */
    @Export(name="snapshotBackupPolicies", type=List.class, parameters={ClusterSnapshotBackupPolicy.class})
    private Output<List<ClusterSnapshotBackupPolicy>> snapshotBackupPolicies;

    /**
     * @return current snapshot schedule and retention settings for the cluster.
     * 
     */
    public Output<List<ClusterSnapshotBackupPolicy>> snapshotBackupPolicies() {
        return this.snapshotBackupPolicies;
    }
    /**
     * Connection string for connecting to the Atlas cluster. The +srv modifier forces the connection to use TLS/SSL. See the mongoURI for additional options.
     * 
     */
    @Export(name="srvAddress", type=String.class, parameters={})
    private Output<String> srvAddress;

    /**
     * @return Connection string for connecting to the Atlas cluster. The +srv modifier forces the connection to use TLS/SSL. See the mongoURI for additional options.
     * 
     */
    public Output<String> srvAddress() {
        return this.srvAddress;
    }
    /**
     * Current state of the cluster. The possible states are:
     * - IDLE
     * - CREATING
     * - UPDATING
     * - DELETING
     * - DELETED
     * - REPAIRING
     * 
     */
    @Export(name="stateName", type=String.class, parameters={})
    private Output<String> stateName;

    /**
     * @return Current state of the cluster. The possible states are:
     * - IDLE
     * - CREATING
     * - UPDATING
     * - DELETING
     * - DELETED
     * - REPAIRING
     * 
     */
    public Output<String> stateName() {
        return this.stateName;
    }
    /**
     * Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    @Export(name="terminationProtectionEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> terminationProtectionEnabled;

    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    public Output<Boolean> terminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }
    /**
     * Release cadence that Atlas uses for this cluster. This parameter defaults to `LTS`. If you set this field to `CONTINUOUS`, you must omit the `mongo_db_major_version` field. Atlas accepts:
     * 
     */
    @Export(name="versionReleaseSystem", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionReleaseSystem;

    /**
     * @return Release cadence that Atlas uses for this cluster. This parameter defaults to `LTS`. If you set this field to `CONTINUOUS`, you must omit the `mongo_db_major_version` field. Atlas accepts:
     * 
     */
    public Output<Optional<String>> versionReleaseSystem() {
        return Codegen.optional(this.versionReleaseSystem);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
