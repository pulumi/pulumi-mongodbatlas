// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetCloudBackupSnapshotExportJobComponent;
import com.pulumi.mongodbatlas.outputs.GetCloudBackupSnapshotExportJobCustomData;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudBackupSnapshotExportJobResult {
    private String clusterName;
    /**
     * @return _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     * 
     */
    private List<GetCloudBackupSnapshotExportJobComponent> components;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     * 
     */
    private String createdAt;
    /**
     * @return Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    private List<GetCloudBackupSnapshotExportJobCustomData> customDatas;
    /**
     * @return Error message, only if the export job failed.
     * 
     */
    private String errMsg;
    /**
     * @return Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
     * 
     */
    private String exportBucketId;
    /**
     * @return Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    private String exportJobId;
    private Integer exportStatusExportedCollections;
    private Integer exportStatusTotalCollections;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    private String finishedAt;
    private String id;
    private String prefix;
    private String projectId;
    /**
     * @return Unique identifier of the Cloud Backup snapshot to export.
     * 
     */
    private String snapshotId;
    /**
     * @return Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     * 
     */
    private String state;

    private GetCloudBackupSnapshotExportJobResult() {}
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return _Returned for sharded clusters only._ Export job details for each replica set in the sharded cluster.
     * 
     */
    public List<GetCloudBackupSnapshotExportJobComponent> components() {
        return this.components;
    }
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Custom data to include in the metadata file named `.complete` that Atlas uploads to the bucket when the export job finishes. Custom data can be specified as key and value pairs.
     * 
     */
    public List<GetCloudBackupSnapshotExportJobCustomData> customDatas() {
        return this.customDatas;
    }
    /**
     * @return Error message, only if the export job failed.
     * 
     */
    public String errMsg() {
        return this.errMsg;
    }
    /**
     * @return Unique identifier of the AWS bucket to export the Cloud Backup snapshot to.
     * 
     */
    public String exportBucketId() {
        return this.exportBucketId;
    }
    /**
     * @return Unique identifier of the export job.
     * * ` prefix  ` - Full path on the cloud provider bucket to the folder where the snapshot is exported. The path is in the following format:`/exported_snapshots/{ORG-NAME}/{PROJECT-NAME}/{CLUSTER-NAME}/{SNAPSHOT-INITIATION-DATE}/{TIMESTAMP}`
     * 
     */
    public String exportJobId() {
        return this.exportJobId;
    }
    public Integer exportStatusExportedCollections() {
        return this.exportStatusExportedCollections;
    }
    public Integer exportStatusTotalCollections() {
        return this.exportStatusTotalCollections;
    }
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the export job completes.
     * 
     */
    public String finishedAt() {
        return this.finishedAt;
    }
    public String id() {
        return this.id;
    }
    public String prefix() {
        return this.prefix;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Unique identifier of the Cloud Backup snapshot to export.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return Status of the export job. Value can be one of the following:
     * * `Queued` - indicates that the export job is queued
     * * `InProgress` - indicates that the snapshot is being exported
     * * `Successful` - indicates that the export job has completed successfully
     * * `Failed` - indicates that the export job has failed
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudBackupSnapshotExportJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterName;
        private List<GetCloudBackupSnapshotExportJobComponent> components;
        private String createdAt;
        private List<GetCloudBackupSnapshotExportJobCustomData> customDatas;
        private String errMsg;
        private String exportBucketId;
        private String exportJobId;
        private Integer exportStatusExportedCollections;
        private Integer exportStatusTotalCollections;
        private String finishedAt;
        private String id;
        private String prefix;
        private String projectId;
        private String snapshotId;
        private String state;
        public Builder() {}
        public Builder(GetCloudBackupSnapshotExportJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.components = defaults.components;
    	      this.createdAt = defaults.createdAt;
    	      this.customDatas = defaults.customDatas;
    	      this.errMsg = defaults.errMsg;
    	      this.exportBucketId = defaults.exportBucketId;
    	      this.exportJobId = defaults.exportJobId;
    	      this.exportStatusExportedCollections = defaults.exportStatusExportedCollections;
    	      this.exportStatusTotalCollections = defaults.exportStatusTotalCollections;
    	      this.finishedAt = defaults.finishedAt;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.projectId = defaults.projectId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder components(List<GetCloudBackupSnapshotExportJobComponent> components) {
            if (components == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "components");
            }
            this.components = components;
            return this;
        }
        public Builder components(GetCloudBackupSnapshotExportJobComponent... components) {
            return components(List.of(components));
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder customDatas(List<GetCloudBackupSnapshotExportJobCustomData> customDatas) {
            if (customDatas == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "customDatas");
            }
            this.customDatas = customDatas;
            return this;
        }
        public Builder customDatas(GetCloudBackupSnapshotExportJobCustomData... customDatas) {
            return customDatas(List.of(customDatas));
        }
        @CustomType.Setter
        public Builder errMsg(String errMsg) {
            if (errMsg == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "errMsg");
            }
            this.errMsg = errMsg;
            return this;
        }
        @CustomType.Setter
        public Builder exportBucketId(String exportBucketId) {
            if (exportBucketId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "exportBucketId");
            }
            this.exportBucketId = exportBucketId;
            return this;
        }
        @CustomType.Setter
        public Builder exportJobId(String exportJobId) {
            if (exportJobId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "exportJobId");
            }
            this.exportJobId = exportJobId;
            return this;
        }
        @CustomType.Setter
        public Builder exportStatusExportedCollections(Integer exportStatusExportedCollections) {
            if (exportStatusExportedCollections == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "exportStatusExportedCollections");
            }
            this.exportStatusExportedCollections = exportStatusExportedCollections;
            return this;
        }
        @CustomType.Setter
        public Builder exportStatusTotalCollections(Integer exportStatusTotalCollections) {
            if (exportStatusTotalCollections == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "exportStatusTotalCollections");
            }
            this.exportStatusTotalCollections = exportStatusTotalCollections;
            return this;
        }
        @CustomType.Setter
        public Builder finishedAt(String finishedAt) {
            if (finishedAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "finishedAt");
            }
            this.finishedAt = finishedAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobResult", "state");
            }
            this.state = state;
            return this;
        }
        public GetCloudBackupSnapshotExportJobResult build() {
            final var _resultValue = new GetCloudBackupSnapshotExportJobResult();
            _resultValue.clusterName = clusterName;
            _resultValue.components = components;
            _resultValue.createdAt = createdAt;
            _resultValue.customDatas = customDatas;
            _resultValue.errMsg = errMsg;
            _resultValue.exportBucketId = exportBucketId;
            _resultValue.exportJobId = exportJobId;
            _resultValue.exportStatusExportedCollections = exportStatusExportedCollections;
            _resultValue.exportStatusTotalCollections = exportStatusTotalCollections;
            _resultValue.finishedAt = finishedAt;
            _resultValue.id = id;
            _resultValue.prefix = prefix;
            _resultValue.projectId = projectId;
            _resultValue.snapshotId = snapshotId;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
