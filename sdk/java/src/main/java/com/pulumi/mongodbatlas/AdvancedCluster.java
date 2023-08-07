// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.AdvancedClusterArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterState;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterAdvancedConfiguration;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterBiConnector;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterBiConnectorConfig;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterConnectionString;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterLabel;
import com.pulumi.mongodbatlas.outputs.AdvancedClusterReplicationSpec;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

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
 * 
 */
@ResourceType(type="mongodbatlas:index/advancedCluster:AdvancedCluster")
public class AdvancedCluster extends com.pulumi.resources.CustomResource {
    @Export(name="advancedConfiguration", refs={AdvancedClusterAdvancedConfiguration.class}, tree="[0]")
    private Output<AdvancedClusterAdvancedConfiguration> advancedConfiguration;

    public Output<AdvancedClusterAdvancedConfiguration> advancedConfiguration() {
        return this.advancedConfiguration;
    }
    /**
     * Flag that indicates whether the cluster can perform backups.
     * If `true`, the cluster can perform backups. You must set this value to `true` for NVMe clusters.
     * 
     * Backup uses:
     * [Cloud Backups](https://docs.atlas.mongodb.com/backup/cloud-backup/overview/#std-label-backup-cloud-provider) for dedicated clusters.
     * [Shared Cluster Backups](https://docs.atlas.mongodb.com/backup/shared-tier/overview/#std-label-m2-m5-snapshots) for tenant clusters.
     * If &#34;`backup_enabled`&#34; : `false`, the cluster doesn&#39;t use Atlas backups.
     * 
     * This parameter defaults to false.
     * 
     */
    @Export(name="backupEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> backupEnabled;

    /**
     * @return Flag that indicates whether the cluster can perform backups.
     * If `true`, the cluster can perform backups. You must set this value to `true` for NVMe clusters.
     * 
     * Backup uses:
     * [Cloud Backups](https://docs.atlas.mongodb.com/backup/cloud-backup/overview/#std-label-backup-cloud-provider) for dedicated clusters.
     * [Shared Cluster Backups](https://docs.atlas.mongodb.com/backup/shared-tier/overview/#std-label-m2-m5-snapshots) for tenant clusters.
     * If &#34;`backup_enabled`&#34; : `false`, the cluster doesn&#39;t use Atlas backups.
     * 
     * This parameter defaults to false.
     * 
     */
    public Output<Boolean> backupEnabled() {
        return this.backupEnabled;
    }
    /**
     * @deprecated
     * use bi_connector_config instead
     * 
     */
    @Deprecated /* use bi_connector_config instead */
    @Export(name="biConnector", refs={AdvancedClusterBiConnector.class}, tree="[0]")
    private Output<AdvancedClusterBiConnector> biConnector;

    public Output<AdvancedClusterBiConnector> biConnector() {
        return this.biConnector;
    }
    /**
     * Configuration settings applied to BI Connector for Atlas on this cluster. The MongoDB Connector for Business Intelligence for Atlas (BI Connector) is only available for M10 and larger clusters. The BI Connector is a powerful tool which provides users SQL-based access to their MongoDB databases. As a result, the BI Connector performs operations which may be CPU and memory intensive. Given the limited hardware resources on M10 and M20 cluster tiers, you may experience performance degradation of the cluster when enabling the BI Connector. If this occurs, upgrade to an M30 or larger cluster or disable the BI Connector. See below.
     * 
     */
    @Export(name="biConnectorConfig", refs={AdvancedClusterBiConnectorConfig.class}, tree="[0]")
    private Output<AdvancedClusterBiConnectorConfig> biConnectorConfig;

    /**
     * @return Configuration settings applied to BI Connector for Atlas on this cluster. The MongoDB Connector for Business Intelligence for Atlas (BI Connector) is only available for M10 and larger clusters. The BI Connector is a powerful tool which provides users SQL-based access to their MongoDB databases. As a result, the BI Connector performs operations which may be CPU and memory intensive. Given the limited hardware resources on M10 and M20 cluster tiers, you may experience performance degradation of the cluster when enabling the BI Connector. If this occurs, upgrade to an M30 or larger cluster or disable the BI Connector. See below.
     * 
     */
    public Output<AdvancedClusterBiConnectorConfig> biConnectorConfig() {
        return this.biConnectorConfig;
    }
    /**
     * The cluster ID.
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The cluster ID.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Type of the cluster that you want to create.
     * Accepted values include:
     * 
     */
    @Export(name="clusterType", refs={String.class}, tree="[0]")
    private Output<String> clusterType;

    /**
     * @return Type of the cluster that you want to create.
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
    @Export(name="connectionStrings", refs={List.class,AdvancedClusterConnectionString.class}, tree="[0,1]")
    private Output<List<AdvancedClusterConnectionString>> connectionStrings;

    /**
     * @return Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    public Output<List<AdvancedClusterConnectionString>> connectionStrings() {
        return this.connectionStrings;
    }
    @Export(name="createDate", refs={String.class}, tree="[0]")
    private Output<String> createDate;

    public Output<String> createDate() {
        return this.createDate;
    }
    /**
     * Capacity, in gigabytes, of the host&#39;s root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive number. You can&#39;t set this value with clusters with local [NVMe SSDs](https://docs.atlas.mongodb.com/cluster-tier/#std-label-nvme-storage). The minimum disk size for dedicated clusters is 10 GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value. If your cluster includes Azure nodes, this value must correspond to an existing Azure disk type (8, 16, 32, 64, 128, 256, 512, 1024, 2048, or 4095)Atlas calculates storage charges differently depending on whether you choose the default value or a custom value. The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider [upgrading your cluster](https://docs.atlas.mongodb.com/scale-cluster/#std-label-scale-cluster-instance) to a higher tier. If your cluster spans cloud service providers, this value defaults to the minimum default of the providers involved.
     * 
     */
    @Export(name="diskSizeGb", refs={Double.class}, tree="[0]")
    private Output<Double> diskSizeGb;

    /**
     * @return Capacity, in gigabytes, of the host&#39;s root volume. Increase this number to add capacity, up to a maximum possible value of 4096 (i.e., 4 TB). This value must be a positive number. You can&#39;t set this value with clusters with local [NVMe SSDs](https://docs.atlas.mongodb.com/cluster-tier/#std-label-nvme-storage). The minimum disk size for dedicated clusters is 10 GB for AWS and GCP. If you specify diskSizeGB with a lower disk size, Atlas defaults to the minimum disk size value. If your cluster includes Azure nodes, this value must correspond to an existing Azure disk type (8, 16, 32, 64, 128, 256, 512, 1024, 2048, or 4095)Atlas calculates storage charges differently depending on whether you choose the default value or a custom value. The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require additional storage space beyond this limitation, consider [upgrading your cluster](https://docs.atlas.mongodb.com/scale-cluster/#std-label-scale-cluster-instance) to a higher tier. If your cluster spans cloud service providers, this value defaults to the minimum default of the providers involved.
     * 
     */
    public Output<Double> diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-kms-encryption/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For Documentation, see [AWS](https://docs.atlas.mongodb.com/security-aws-kms/), [GCP](https://docs.atlas.mongodb.com/security-kms-encryption/) and [Azure](https://docs.atlas.mongodb.com/security-azure-kms/#std-label-security-azure-kms). Requirements are if `replication_specs.#.region_configs.#.&lt;type&gt;Specs.instance_size` is M10 or greater and `backup_enabled` is false or omitted.
     * 
     */
    @Export(name="encryptionAtRestProvider", refs={String.class}, tree="[0]")
    private Output<String> encryptionAtRestProvider;

    /**
     * @return Possible values are AWS, GCP, AZURE or NONE.  Only needed if you desire to manage the keys, see [Encryption at Rest using Customer Key Management](https://docs.atlas.mongodb.com/security-kms-encryption/) for complete documentation.  You must configure encryption at rest for the Atlas project before enabling it on any cluster in the project. For Documentation, see [AWS](https://docs.atlas.mongodb.com/security-aws-kms/), [GCP](https://docs.atlas.mongodb.com/security-kms-encryption/) and [Azure](https://docs.atlas.mongodb.com/security-azure-kms/#std-label-security-azure-kms). Requirements are if `replication_specs.#.region_configs.#.&lt;type&gt;Specs.instance_size` is M10 or greater and `backup_enabled` is false or omitted.
     * 
     */
    public Output<String> encryptionAtRestProvider() {
        return this.encryptionAtRestProvider;
    }
    /**
     * Configuration for the collection of key-value pairs that tag and categorize the cluster. See below.
     * 
     */
    @Export(name="labels", refs={List.class,AdvancedClusterLabel.class}, tree="[0,1]")
    private Output<List<AdvancedClusterLabel>> labels;

    /**
     * @return Configuration for the collection of key-value pairs that tag and categorize the cluster. See below.
     * 
     */
    public Output<List<AdvancedClusterLabel>> labels() {
        return this.labels;
    }
    /**
     * Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.0`, `4.2`, `4.4`, or `5.0`. If omitted, Atlas deploys a cluster that runs MongoDB 4.4. If `replication_specs#.region_configs#.&lt;type&gt;Specs.instance_size`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 4.4. Atlas always deploys the cluster with the latest stable release of the specified version.  If you set a value to this parameter and set `version_release_system` `CONTINUOUS`, the resource returns an error. Either clear this parameter or set `version_release_system`: `LTS`.
     * 
     */
    @Export(name="mongoDbMajorVersion", refs={String.class}, tree="[0]")
    private Output<String> mongoDbMajorVersion;

    /**
     * @return Version of the cluster to deploy. Atlas supports the following MongoDB versions for M10+ clusters: `4.0`, `4.2`, `4.4`, or `5.0`. If omitted, Atlas deploys a cluster that runs MongoDB 4.4. If `replication_specs#.region_configs#.&lt;type&gt;Specs.instance_size`: `M0`, `M2` or `M5`, Atlas deploys MongoDB 4.4. Atlas always deploys the cluster with the latest stable release of the specified version.  If you set a value to this parameter and set `version_release_system` `CONTINUOUS`, the resource returns an error. Either clear this parameter or set `version_release_system`: `LTS`.
     * 
     */
    public Output<String> mongoDbMajorVersion() {
        return this.mongoDbMajorVersion;
    }
    /**
     * Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     * 
     */
    @Export(name="mongoDbVersion", refs={String.class}, tree="[0]")
    private Output<String> mongoDbVersion;

    /**
     * @return Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     * 
     */
    public Output<String> mongoDbVersion() {
        return this.mongoDbVersion;
    }
    /**
     * Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the cluster as it appears in Atlas. Once the cluster is created, its name cannot be changed. **WARNING** Changing the name will result in destruction of the existing cluster and the creation of a new cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> paused;

    public Output<Optional<Boolean>> paused() {
        return Codegen.optional(this.paused);
    }
    /**
     * Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    @Export(name="pitEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> pitEnabled;

    /**
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    public Output<Boolean> pitEnabled() {
        return this.pitEnabled;
    }
    /**
     * Unique ID for the project to create the database user.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Configuration for cluster regions and the hardware provisioned in them. See below
     * 
     */
    @Export(name="replicationSpecs", refs={List.class,AdvancedClusterReplicationSpec.class}, tree="[0,1]")
    private Output<List<AdvancedClusterReplicationSpec>> replicationSpecs;

    /**
     * @return Configuration for cluster regions and the hardware provisioned in them. See below
     * 
     */
    public Output<List<AdvancedClusterReplicationSpec>> replicationSpecs() {
        return this.replicationSpecs;
    }
    /**
     * Flag that indicates whether to retain backup snapshots for the deleted dedicated cluster
     * 
     */
    @Export(name="retainBackupsEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> retainBackupsEnabled;

    /**
     * @return Flag that indicates whether to retain backup snapshots for the deleted dedicated cluster
     * 
     */
    public Output<Optional<Boolean>> retainBackupsEnabled() {
        return Codegen.optional(this.retainBackupsEnabled);
    }
    /**
     * Certificate Authority that MongoDB Atlas clusters use. You can specify ISRGROOTX1 (for ISRG Root X1).
     * 
     */
    @Export(name="rootCertType", refs={String.class}, tree="[0]")
    private Output<String> rootCertType;

    /**
     * @return Certificate Authority that MongoDB Atlas clusters use. You can specify ISRGROOTX1 (for ISRG Root X1).
     * 
     */
    public Output<String> rootCertType() {
        return this.rootCertType;
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
    @Export(name="stateName", refs={String.class}, tree="[0]")
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
    @Export(name="terminationProtectionEnabled", refs={Boolean.class}, tree="[0]")
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
    @Export(name="versionReleaseSystem", refs={String.class}, tree="[0]")
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
    public AdvancedCluster(String name) {
        this(name, AdvancedClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AdvancedCluster(String name, AdvancedClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AdvancedCluster(String name, AdvancedClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/advancedCluster:AdvancedCluster", name, args == null ? AdvancedClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AdvancedCluster(String name, Output<String> id, @Nullable AdvancedClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/advancedCluster:AdvancedCluster", name, state, makeResourceOptions(options, id));
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
    public static AdvancedCluster get(String name, Output<String> id, @Nullable AdvancedClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AdvancedCluster(name, id, state, options);
    }
}
