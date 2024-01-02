// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultAdvancedConfiguration;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultBiConnectorConfig;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultConnectionString;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultLabel;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultReplicationSpec;
import com.pulumi.mongodbatlas.outputs.GetAdvancedClustersResultTag;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAdvancedClustersResult {
    /**
     * @return Get the advanced configuration options. See Advanced Configuration below for more details.
     * 
     */
    private List<GetAdvancedClustersResultAdvancedConfiguration> advancedConfigurations;
    private Boolean backupEnabled;
    /**
     * @return Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `bi_connector`
     * 
     */
    private List<GetAdvancedClustersResultBiConnectorConfig> biConnectorConfigs;
    /**
     * @return Type of the cluster that you want to create.
     * 
     */
    private String clusterType;
    /**
     * @return Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    private List<GetAdvancedClustersResultConnectionString> connectionStrings;
    private String createDate;
    /**
     * @return Capacity, in gigabytes, of the host&#39;s root volume.
     * 
     */
    private Double diskSizeGb;
    /**
     * @return Possible values are AWS, GCP, AZURE or NONE.
     * 
     */
    private String encryptionAtRestProvider;
    /**
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     * 
     * @deprecated
     * this parameter is deprecated and will be removed by September 2024, please transition to tags
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed by September 2024, please transition to tags */
    private List<GetAdvancedClustersResultLabel> labels;
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
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    private Boolean pitEnabled;
    /**
     * @return Configuration for cluster regions and the hardware provisioned in them. See below
     * 
     */
    private List<GetAdvancedClustersResultReplicationSpec> replicationSpecs;
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
    private List<GetAdvancedClustersResultTag> tags;
    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    private Boolean terminationProtectionEnabled;
    /**
     * @return Release cadence that Atlas uses for this cluster.
     * 
     */
    private String versionReleaseSystem;

    private GetAdvancedClustersResult() {}
    /**
     * @return Get the advanced configuration options. See Advanced Configuration below for more details.
     * 
     */
    public List<GetAdvancedClustersResultAdvancedConfiguration> advancedConfigurations() {
        return this.advancedConfigurations;
    }
    public Boolean backupEnabled() {
        return this.backupEnabled;
    }
    /**
     * @return Configuration settings applied to BI Connector for Atlas on this cluster. See below. **NOTE** Prior version of provider had parameter as `bi_connector`
     * 
     */
    public List<GetAdvancedClustersResultBiConnectorConfig> biConnectorConfigs() {
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
     * @return Set of connection strings that your applications use to connect to this cluster. More info in [Connection-strings](https://docs.mongodb.com/manual/reference/connection-string/). Use the parameters in this object to connect your applications to this cluster. To learn more about the formats of connection strings, see [Connection String Options](https://docs.atlas.mongodb.com/reference/faq/connection-changes/). NOTE: Atlas returns the contents of this object after the cluster is operational, not while it builds the cluster.
     * 
     */
    public List<GetAdvancedClustersResultConnectionString> connectionStrings() {
        return this.connectionStrings;
    }
    public String createDate() {
        return this.createDate;
    }
    /**
     * @return Capacity, in gigabytes, of the host&#39;s root volume.
     * 
     */
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
     * @return Set that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the cluster. See below.
     * 
     * @deprecated
     * this parameter is deprecated and will be removed by September 2024, please transition to tags
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed by September 2024, please transition to tags */
    public List<GetAdvancedClustersResultLabel> labels() {
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
     * @return Flag that indicates if the cluster uses Continuous Cloud Backup.
     * 
     */
    public Boolean pitEnabled() {
        return this.pitEnabled;
    }
    /**
     * @return Configuration for cluster regions and the hardware provisioned in them. See below
     * 
     */
    public List<GetAdvancedClustersResultReplicationSpec> replicationSpecs() {
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
    public List<GetAdvancedClustersResultTag> tags() {
        return this.tags;
    }
    /**
     * @return Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won&#39;t delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
     * 
     */
    public Boolean terminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
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

    public static Builder builder(GetAdvancedClustersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAdvancedClustersResultAdvancedConfiguration> advancedConfigurations;
        private Boolean backupEnabled;
        private List<GetAdvancedClustersResultBiConnectorConfig> biConnectorConfigs;
        private String clusterType;
        private List<GetAdvancedClustersResultConnectionString> connectionStrings;
        private String createDate;
        private Double diskSizeGb;
        private String encryptionAtRestProvider;
        private List<GetAdvancedClustersResultLabel> labels;
        private String mongoDbMajorVersion;
        private String mongoDbVersion;
        private String name;
        private Boolean paused;
        private Boolean pitEnabled;
        private List<GetAdvancedClustersResultReplicationSpec> replicationSpecs;
        private String rootCertType;
        private String stateName;
        private List<GetAdvancedClustersResultTag> tags;
        private Boolean terminationProtectionEnabled;
        private String versionReleaseSystem;
        public Builder() {}
        public Builder(GetAdvancedClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedConfigurations = defaults.advancedConfigurations;
    	      this.backupEnabled = defaults.backupEnabled;
    	      this.biConnectorConfigs = defaults.biConnectorConfigs;
    	      this.clusterType = defaults.clusterType;
    	      this.connectionStrings = defaults.connectionStrings;
    	      this.createDate = defaults.createDate;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.encryptionAtRestProvider = defaults.encryptionAtRestProvider;
    	      this.labels = defaults.labels;
    	      this.mongoDbMajorVersion = defaults.mongoDbMajorVersion;
    	      this.mongoDbVersion = defaults.mongoDbVersion;
    	      this.name = defaults.name;
    	      this.paused = defaults.paused;
    	      this.pitEnabled = defaults.pitEnabled;
    	      this.replicationSpecs = defaults.replicationSpecs;
    	      this.rootCertType = defaults.rootCertType;
    	      this.stateName = defaults.stateName;
    	      this.tags = defaults.tags;
    	      this.terminationProtectionEnabled = defaults.terminationProtectionEnabled;
    	      this.versionReleaseSystem = defaults.versionReleaseSystem;
        }

        @CustomType.Setter
        public Builder advancedConfigurations(List<GetAdvancedClustersResultAdvancedConfiguration> advancedConfigurations) {
            if (advancedConfigurations == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "advancedConfigurations");
            }
            this.advancedConfigurations = advancedConfigurations;
            return this;
        }
        public Builder advancedConfigurations(GetAdvancedClustersResultAdvancedConfiguration... advancedConfigurations) {
            return advancedConfigurations(List.of(advancedConfigurations));
        }
        @CustomType.Setter
        public Builder backupEnabled(Boolean backupEnabled) {
            if (backupEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "backupEnabled");
            }
            this.backupEnabled = backupEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder biConnectorConfigs(List<GetAdvancedClustersResultBiConnectorConfig> biConnectorConfigs) {
            if (biConnectorConfigs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "biConnectorConfigs");
            }
            this.biConnectorConfigs = biConnectorConfigs;
            return this;
        }
        public Builder biConnectorConfigs(GetAdvancedClustersResultBiConnectorConfig... biConnectorConfigs) {
            return biConnectorConfigs(List.of(biConnectorConfigs));
        }
        @CustomType.Setter
        public Builder clusterType(String clusterType) {
            if (clusterType == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "clusterType");
            }
            this.clusterType = clusterType;
            return this;
        }
        @CustomType.Setter
        public Builder connectionStrings(List<GetAdvancedClustersResultConnectionString> connectionStrings) {
            if (connectionStrings == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "connectionStrings");
            }
            this.connectionStrings = connectionStrings;
            return this;
        }
        public Builder connectionStrings(GetAdvancedClustersResultConnectionString... connectionStrings) {
            return connectionStrings(List.of(connectionStrings));
        }
        @CustomType.Setter
        public Builder createDate(String createDate) {
            if (createDate == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "createDate");
            }
            this.createDate = createDate;
            return this;
        }
        @CustomType.Setter
        public Builder diskSizeGb(Double diskSizeGb) {
            if (diskSizeGb == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "diskSizeGb");
            }
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionAtRestProvider(String encryptionAtRestProvider) {
            if (encryptionAtRestProvider == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "encryptionAtRestProvider");
            }
            this.encryptionAtRestProvider = encryptionAtRestProvider;
            return this;
        }
        @CustomType.Setter
        public Builder labels(List<GetAdvancedClustersResultLabel> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "labels");
            }
            this.labels = labels;
            return this;
        }
        public Builder labels(GetAdvancedClustersResultLabel... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder mongoDbMajorVersion(String mongoDbMajorVersion) {
            if (mongoDbMajorVersion == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "mongoDbMajorVersion");
            }
            this.mongoDbMajorVersion = mongoDbMajorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder mongoDbVersion(String mongoDbVersion) {
            if (mongoDbVersion == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "mongoDbVersion");
            }
            this.mongoDbVersion = mongoDbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder paused(Boolean paused) {
            if (paused == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "paused");
            }
            this.paused = paused;
            return this;
        }
        @CustomType.Setter
        public Builder pitEnabled(Boolean pitEnabled) {
            if (pitEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "pitEnabled");
            }
            this.pitEnabled = pitEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder replicationSpecs(List<GetAdvancedClustersResultReplicationSpec> replicationSpecs) {
            if (replicationSpecs == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "replicationSpecs");
            }
            this.replicationSpecs = replicationSpecs;
            return this;
        }
        public Builder replicationSpecs(GetAdvancedClustersResultReplicationSpec... replicationSpecs) {
            return replicationSpecs(List.of(replicationSpecs));
        }
        @CustomType.Setter
        public Builder rootCertType(String rootCertType) {
            if (rootCertType == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "rootCertType");
            }
            this.rootCertType = rootCertType;
            return this;
        }
        @CustomType.Setter
        public Builder stateName(String stateName) {
            if (stateName == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "stateName");
            }
            this.stateName = stateName;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<GetAdvancedClustersResultTag> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(GetAdvancedClustersResultTag... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder terminationProtectionEnabled(Boolean terminationProtectionEnabled) {
            if (terminationProtectionEnabled == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "terminationProtectionEnabled");
            }
            this.terminationProtectionEnabled = terminationProtectionEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder versionReleaseSystem(String versionReleaseSystem) {
            if (versionReleaseSystem == null) {
              throw new MissingRequiredPropertyException("GetAdvancedClustersResult", "versionReleaseSystem");
            }
            this.versionReleaseSystem = versionReleaseSystem;
            return this;
        }
        public GetAdvancedClustersResult build() {
            final var _resultValue = new GetAdvancedClustersResult();
            _resultValue.advancedConfigurations = advancedConfigurations;
            _resultValue.backupEnabled = backupEnabled;
            _resultValue.biConnectorConfigs = biConnectorConfigs;
            _resultValue.clusterType = clusterType;
            _resultValue.connectionStrings = connectionStrings;
            _resultValue.createDate = createDate;
            _resultValue.diskSizeGb = diskSizeGb;
            _resultValue.encryptionAtRestProvider = encryptionAtRestProvider;
            _resultValue.labels = labels;
            _resultValue.mongoDbMajorVersion = mongoDbMajorVersion;
            _resultValue.mongoDbVersion = mongoDbVersion;
            _resultValue.name = name;
            _resultValue.paused = paused;
            _resultValue.pitEnabled = pitEnabled;
            _resultValue.replicationSpecs = replicationSpecs;
            _resultValue.rootCertType = rootCertType;
            _resultValue.stateName = stateName;
            _resultValue.tags = tags;
            _resultValue.terminationProtectionEnabled = terminationProtectionEnabled;
            _resultValue.versionReleaseSystem = versionReleaseSystem;
            return _resultValue;
        }
    }
}
