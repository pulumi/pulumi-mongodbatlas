// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterAdvancedConfiguration;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterBiConnectorConfig;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterConnectionString;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterLabel;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterPinnedFcv;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterReplicationSpec;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClusterTag;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAdvancedClusterResult {
    /**
     * @return Get the advanced configuration options. See Advanced Configuration below for more details.
     * 
     */
    private List<GetAdvancedClusterAdvancedConfiguration> advancedConfigurations;
    private Boolean backupEnabled;
    /**
     * @return Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `bi_connector`
     * 
     */
    private List<GetAdvancedClusterBiConnectorConfig> biConnectorConfigs;
    /**
     * @return Type of the cluster that you want to create.
     * 
     */
    private String clusterType;
    /**
     * @return Config Server Management Mode for creating or updating a sharded cluster. Valid values are `ATLAS_MANAGED` (default) and `FIXED_TO_DEDICATED`. When configured as `ATLAS_MANAGED`, Atlas may automatically switch the cluster&#39;s config server type for optimal performance and savings. When configured as `FIXED_TO_DEDICATED`, the cluster will always use a dedicated config server. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
     * 
     */
    private String configServerManagementMode;
    /**
     * @return Describes a sharded cluster&#39;s config server type. Valid values are `DEDICATED` and `EMBEDDED`. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
     * 
     */
    private String configServerType;
    /**
     * @return Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    private List<GetAdvancedClusterConnectionString> connectionStrings;
    private String createDate;
    /**
     * @return Storage capacity that the host&#39;s root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    private Double diskSizeGb;
    /**
     * @return Possible values are AWS, GCP, AZURE or NONE.
     * 
     */
    private String encryptionAtRestProvider;
    /**
     * @return Flag that indicates if cluster uses Atlas-Managed Sharding (false) or Self-Managed Sharding (true).
     * 
     */
    private Boolean globalClusterSelfManagedSharding;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **(DEPRECATED.)** Use `tags` instead.
     * 
     */
    private List<GetAdvancedClusterLabel> labels;
    /**
     * @return Version of the cluster to deploy.
     * 
     */
    private String mongoDbMajorVersion;
    /**
     * @return Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     * 
     */
    private String mongoDbVersion;
    private String name;
    /**
     * @return Flag that indicates whether the cluster is paused or not.
     * 
     */
    private Boolean paused;
    /**
     * @return The pinned Feature Compatibility Version (FCV) with its associated expiration date. See below.
     * 
     */
    private List<GetAdvancedClusterPinnedFcv> pinnedFcvs;
    /**
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    private Boolean pitEnabled;
    private String projectId;
    /**
     * @return (Optional) Flag that enables or disables log redaction, see the [manual](https://www.mongodb.com/docs/manual/administration/monitoring/#log-redaction) for more info.
     * 
     */
    private Boolean redactClientLogData;
    /**
     * @return (Optional) Replica set scaling mode for your cluster.
     * 
     */
    private String replicaSetScalingStrategy;
    /**
     * @return List of settings that configure your cluster regions. If `use_replication_spec_per_shard = true`, this array has one object per shard representing node configurations in each shard. For replica sets there is only one object representing node configurations. See below.
     * 
     */
    private List<GetAdvancedClusterReplicationSpec> replicationSpecs;
    /**
     * @return Certificate Authority that MongoDB Atlas clusters use.
     * 
     */
    private String rootCertType;
    /**
     * @return Current state of the cluster. The possible states are:
     * 
     */
    private String stateName;
    /**
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     * 
     */
    private List<GetAdvancedClusterTag> tags;
    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    private Boolean terminationProtectionEnabled;
    private @Nullable Boolean useReplicationSpecPerShard;
    /**
     * @return Release cadence that Atlas uses for this cluster.
     * 
     */
    private String versionReleaseSystem;

    private GetAdvancedClusterResult() {}
    /**
     * @return Get the advanced configuration options. See Advanced Configuration below for more details.
     * 
     */
    public List<GetAdvancedClusterAdvancedConfiguration> advancedConfigurations() {
        return this.advancedConfigurations;
    }
    public Boolean backupEnabled() {
        return this.backupEnabled;
    }
    /**
     * @return Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `bi_connector`
     * 
     */
    public List<GetAdvancedClusterBiConnectorConfig> biConnectorConfigs() {
        return this.biConnectorConfigs;
    }
    /**
     * @return Type of the cluster that you want to create.
     * 
     */
    public String clusterType() {
        return this.clusterType;
    }
    /**
     * @return Config Server Management Mode for creating or updating a sharded cluster. Valid values are `ATLAS_MANAGED` (default) and `FIXED_TO_DEDICATED`. When configured as `ATLAS_MANAGED`, Atlas may automatically switch the cluster&#39;s config server type for optimal performance and savings. When configured as `FIXED_TO_DEDICATED`, the cluster will always use a dedicated config server. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
     * 
     */
    public String configServerManagementMode() {
        return this.configServerManagementMode;
    }
    /**
     * @return Describes a sharded cluster&#39;s config server type. Valid values are `DEDICATED` and `EMBEDDED`. To learn more, see the [Sharded Cluster Config Servers documentation](https://dochub.mongodb.org/docs/manual/core/sharded-cluster-config-servers/).
     * 
     */
    public String configServerType() {
        return this.configServerType;
    }
    /**
     * @return Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    public List<GetAdvancedClusterConnectionString> connectionStrings() {
        return this.connectionStrings;
    }
    public String createDate() {
        return this.createDate;
    }
    /**
     * @return Storage capacity that the host&#39;s root volume possesses expressed in gigabytes. If disk size specified is below the minimum (10 GB), this parameter defaults to the minimum disk size value. Storage charge calculations depend on whether you choose the default value or a custom value.  The maximum value for disk storage cannot exceed 50 times the maximum RAM for the selected cluster. If you require more storage space, consider upgrading your cluster to a higher tier.
     * 
     * @deprecated
     * This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown
     * 
     */
    @Deprecated /* This parameter is deprecated. Please refer to our examples, documentation, and 1.18.0 migration guide for more details at https://registry.terraform.io/providers/mongodb/mongodbatlas/latest/docs/guides/1.18.0-upgrade-guide.html.markdown */
    public Double diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return Possible values are AWS, GCP, AZURE or NONE.
     * 
     */
    public String encryptionAtRestProvider() {
        return this.encryptionAtRestProvider;
    }
    /**
     * @return Flag that indicates if cluster uses Atlas-Managed Sharding (false) or Self-Managed Sharding (true).
     * 
     */
    public Boolean globalClusterSelfManagedSharding() {
        return this.globalClusterSelfManagedSharding;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below. **(DEPRECATED.)** Use `tags` instead.
     * 
     */
    public List<GetAdvancedClusterLabel> labels() {
        return this.labels;
    }
    /**
     * @return Version of the cluster to deploy.
     * 
     */
    public String mongoDbMajorVersion() {
        return this.mongoDbMajorVersion;
    }
    /**
     * @return Version of MongoDB the cluster runs, in `major-version`.`minor-version` format.
     * 
     */
    public String mongoDbVersion() {
        return this.mongoDbVersion;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Flag that indicates whether the cluster is paused or not.
     * 
     */
    public Boolean paused() {
        return this.paused;
    }
    /**
     * @return The pinned Feature Compatibility Version (FCV) with its associated expiration date. See below.
     * 
     */
    public List<GetAdvancedClusterPinnedFcv> pinnedFcvs() {
        return this.pinnedFcvs;
    }
    /**
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    public Boolean pitEnabled() {
        return this.pitEnabled;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return (Optional) Flag that enables or disables log redaction, see the [manual](https://www.mongodb.com/docs/manual/administration/monitoring/#log-redaction) for more info.
     * 
     */
    public Boolean redactClientLogData() {
        return this.redactClientLogData;
    }
    /**
     * @return (Optional) Replica set scaling mode for your cluster.
     * 
     */
    public String replicaSetScalingStrategy() {
        return this.replicaSetScalingStrategy;
    }
    /**
     * @return List of settings that configure your cluster regions. If `use_replication_spec_per_shard = true`, this array has one object per shard representing node configurations in each shard. For replica sets there is only one object representing node configurations. See below.
     * 
     */
    public List<GetAdvancedClusterReplicationSpec> replicationSpecs() {
        return this.replicationSpecs;
    }
    /**
     * @return Certificate Authority that MongoDB Atlas clusters use.
     * 
     */
    public String rootCertType() {
        return this.rootCertType;
    }
    /**
     * @return Current state of the cluster. The possible states are:
     * 
     */
    public String stateName() {
        return this.stateName;
    }
    /**
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     * 
     */
    public List<GetAdvancedClusterTag> tags() {
        return this.tags;
    }
    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    public Boolean terminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }
    public Optional<Boolean> useReplicationSpecPerShard() {
        return Optional.ofNullable(this.useReplicationSpecPerShard);
    }
    /**
     * @return Release cadence that Atlas uses for this cluster.
     * 
     */
    public String versionReleaseSystem() {
        return this.versionReleaseSystem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdvancedClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAdvancedClusterAdvancedConfiguration> advancedConfigurations;
        private Boolean backupEnabled;
        private List<GetAdvancedClusterBiConnectorConfig> biConnectorConfigs;
        private String clusterType;
        private String configServerManagementMode;
        private String configServerType;
        private List<GetAdvancedClusterConnectionString> connectionStrings;
        private String createDate;
        private Double diskSizeGb;
        private String encryptionAtRestProvider;
        private Boolean globalClusterSelfManagedSharding;
        private String id;
        private List<GetAdvancedClusterLabel> labels;
        private String mongoDbMajorVersion;
        private String mongoDbVersion;
        private String name;
        private Boolean paused;
        private List<GetAdvancedClusterPinnedFcv> pinnedFcvs;
        private Boolean pitEnabled;
        private String projectId;
        private Boolean redactClientLogData;
        private String replicaSetScalingStrategy;
        private List<GetAdvancedClusterReplicationSpec> replicationSpecs;
        private String rootCertType;
        private String stateName;
        private List<GetAdvancedClusterTag> tags;
        private Boolean terminationProtectionEnabled;
        private @Nullable Boolean useReplicationSpecPerShard;
        private String versionReleaseSystem;
        public Builder() {}
        public Builder(GetAdvancedClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedConfigurations = defaults.advancedConfigurations;
    	      this.backupEnabled = defaults.backupEnabled;
    	      this.biConnectorConfigs = defaults.biConnectorConfigs;
    	      this.clusterType = defaults.clusterType;
    	      this.configServerManagementMode = defaults.configServerManagementMode;
    	      this.configServerType = defaults.configServerType;
    	      this.connectionStrings = defaults.connectionStrings;
    	      this.createDate = defaults.createDate;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.encryptionAtRestProvider = defaults.encryptionAtRestProvider;
    	      this.globalClusterSelfManagedSharding = defaults.globalClusterSelfManagedSharding;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.mongoDbMajorVersion = defaults.mongoDbMajorVersion;
    	      this.mongoDbVersion = defaults.mongoDbVersion;
    	      this.name = defaults.name;
    	      this.paused = defaults.paused;
    	      this.pinnedFcvs = defaults.pinnedFcvs;
    	      this.pitEnabled = defaults.pitEnabled;
    	      this.projectId = defaults.projectId;
    	      this.redactClientLogData = defaults.redactClientLogData;
    	      this.replicaSetScalingStrategy = defaults.replicaSetScalingStrategy;
    	      this.replicationSpecs = defaults.replicationSpecs;
    	      this.rootCertType = defaults.rootCertType;
    	      this.stateName = defaults.stateName;
    	      this.tags = defaults.tags;
    	      this.terminationProtectionEnabled = defaults.terminationProtectionEnabled;
    	      this.useReplicationSpecPerShard = defaults.useReplicationSpecPerShard;
    	      this.versionReleaseSystem = defaults.versionReleaseSystem;
        }

        @CustomType.Setter
        public Builder advancedConfigurations(List<GetAdvancedClusterAdvancedConfiguration> advancedConfigurations) {
            if (advancedConfigurations == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "advancedConfigurations");
            }
            this.advancedConfigurations = advancedConfigurations;
            return this;
        }
        public Builder advancedConfigurations(GetAdvancedClusterAdvancedConfiguration... advancedConfigurations) {
            return advancedConfigurations(List.of(advancedConfigurations));
        }
        @CustomType.Setter
        public Builder backupEnabled(Boolean backupEnabled) {
            if (backupEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "backupEnabled");
            }
            this.backupEnabled = backupEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder biConnectorConfigs(List<GetAdvancedClusterBiConnectorConfig> biConnectorConfigs) {
            if (biConnectorConfigs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "biConnectorConfigs");
            }
            this.biConnectorConfigs = biConnectorConfigs;
            return this;
        }
        public Builder biConnectorConfigs(GetAdvancedClusterBiConnectorConfig... biConnectorConfigs) {
            return biConnectorConfigs(List.of(biConnectorConfigs));
        }
        @CustomType.Setter
        public Builder clusterType(String clusterType) {
            if (clusterType == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "clusterType");
            }
            this.clusterType = clusterType;
            return this;
        }
        @CustomType.Setter
        public Builder configServerManagementMode(String configServerManagementMode) {
            if (configServerManagementMode == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "configServerManagementMode");
            }
            this.configServerManagementMode = configServerManagementMode;
            return this;
        }
        @CustomType.Setter
        public Builder configServerType(String configServerType) {
            if (configServerType == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "configServerType");
            }
            this.configServerType = configServerType;
            return this;
        }
        @CustomType.Setter
        public Builder connectionStrings(List<GetAdvancedClusterConnectionString> connectionStrings) {
            if (connectionStrings == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "connectionStrings");
            }
            this.connectionStrings = connectionStrings;
            return this;
        }
        public Builder connectionStrings(GetAdvancedClusterConnectionString... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }
        @CustomType.Setter
        public Builder createDate(String createDate) {
            if (createDate == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "createDate");
            }
            this.createDate = createDate;
            return this;
        }
        @CustomType.Setter
        public Builder diskSizeGb(Double diskSizeGb) {
            if (diskSizeGb == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "diskSizeGb");
            }
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionAtRestProvider(String encryptionAtRestProvider) {
            if (encryptionAtRestProvider == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "encryptionAtRestProvider");
            }
            this.encryptionAtRestProvider = encryptionAtRestProvider;
            return this;
        }
        @CustomType.Setter
        public Builder globalClusterSelfManagedSharding(Boolean globalClusterSelfManagedSharding) {
            if (globalClusterSelfManagedSharding == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "globalClusterSelfManagedSharding");
            }
            this.globalClusterSelfManagedSharding = globalClusterSelfManagedSharding;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(List<GetAdvancedClusterLabel> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        public Builder labels(GetAdvancedClusterLabel... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder mongoDbMajorVersion(String mongoDbMajorVersion) {
            if (mongoDbMajorVersion == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "mongoDbMajorVersion");
            }
            this.mongoDbMajorVersion = mongoDbMajorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder mongoDbVersion(String mongoDbVersion) {
            if (mongoDbVersion == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "mongoDbVersion");
            }
            this.mongoDbVersion = mongoDbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder paused(Boolean paused) {
            if (paused == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "paused");
            }
            this.paused = paused;
            return this;
        }
        @CustomType.Setter
        public Builder pinnedFcvs(List<GetAdvancedClusterPinnedFcv> pinnedFcvs) {
            if (pinnedFcvs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "pinnedFcvs");
            }
            this.pinnedFcvs = pinnedFcvs;
            return this;
        }
        public Builder pinnedFcvs(GetAdvancedClusterPinnedFcv... pinnedFcvs) {
            return pinnedFcvs(List.of(pinnedFcvs));
        }
        @CustomType.Setter
        public Builder pitEnabled(Boolean pitEnabled) {
            if (pitEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "pitEnabled");
            }
            this.pitEnabled = pitEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder redactClientLogData(Boolean redactClientLogData) {
            if (redactClientLogData == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "redactClientLogData");
            }
            this.redactClientLogData = redactClientLogData;
            return this;
        }
        @CustomType.Setter
        public Builder replicaSetScalingStrategy(String replicaSetScalingStrategy) {
            if (replicaSetScalingStrategy == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "replicaSetScalingStrategy");
            }
            this.replicaSetScalingStrategy = replicaSetScalingStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder replicationSpecs(List<GetAdvancedClusterReplicationSpec> replicationSpecs) {
            if (replicationSpecs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "replicationSpecs");
            }
            this.replicationSpecs = replicationSpecs;
            return this;
        }
        public Builder replicationSpecs(GetAdvancedClusterReplicationSpec... replicationSpecs) {
            return replicationSpecs(List.of(replicationSpecs));
        }
        @CustomType.Setter
        public Builder rootCertType(String rootCertType) {
            if (rootCertType == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "rootCertType");
            }
            this.rootCertType = rootCertType;
            return this;
        }
        @CustomType.Setter
        public Builder stateName(String stateName) {
            if (stateName == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "stateName");
            }
            this.stateName = stateName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetAdvancedClusterTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetAdvancedClusterTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder terminationProtectionEnabled(Boolean terminationProtectionEnabled) {
            if (terminationProtectionEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "terminationProtectionEnabled");
            }
            this.terminationProtectionEnabled = terminationProtectionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder useReplicationSpecPerShard(@Nullable Boolean useReplicationSpecPerShard) {

            this.useReplicationSpecPerShard = useReplicationSpecPerShard;
            return this;
        }
        @CustomType.Setter
        public Builder versionReleaseSystem(String versionReleaseSystem) {
            if (versionReleaseSystem == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClusterResult", "versionReleaseSystem");
            }
            this.versionReleaseSystem = versionReleaseSystem;
            return this;
        }
        public GetAdvancedClusterResult build() {
            final var _resultValue = new GetAdvancedClusterResult();
            _resultValue.advancedConfigurations = advancedConfigurations;
            _resultValue.backupEnabled = backupEnabled;
            _resultValue.biConnectorConfigs = biConnectorConfigs;
            _resultValue.clusterType = clusterType;
            _resultValue.configServerManagementMode = configServerManagementMode;
            _resultValue.configServerType = configServerType;
            _resultValue.connectionStrings = connectionStrings;
            _resultValue.createDate = createDate;
            _resultValue.diskSizeGb = diskSizeGb;
            _resultValue.encryptionAtRestProvider = encryptionAtRestProvider;
            _resultValue.globalClusterSelfManagedSharding = globalClusterSelfManagedSharding;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.mongoDbMajorVersion = mongoDbMajorVersion;
            _resultValue.mongoDbVersion = mongoDbVersion;
            _resultValue.name = name;
            _resultValue.paused = paused;
            _resultValue.pinnedFcvs = pinnedFcvs;
            _resultValue.pitEnabled = pitEnabled;
            _resultValue.projectId = projectId;
            _resultValue.redactClientLogData = redactClientLogData;
            _resultValue.replicaSetScalingStrategy = replicaSetScalingStrategy;
            _resultValue.replicationSpecs = replicationSpecs;
            _resultValue.rootCertType = rootCertType;
            _resultValue.stateName = stateName;
            _resultValue.tags = tags;
            _resultValue.terminationProtectionEnabled = terminationProtectionEnabled;
            _resultValue.useReplicationSpecPerShard = useReplicationSpecPerShard;
            _resultValue.versionReleaseSystem = versionReleaseSystem;
            return _resultValue;
        }
    }
}
