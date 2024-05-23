// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudBackupSnapshotRestoreJobResult {
    /**
     * @return Indicates whether the restore job was canceled.
     * 
     */
    private Boolean cancelled;
    private String clusterName;
    /**
     * @return UTC ISO 8601 formatted point in time when Atlas created the restore job.
     * 
     */
    private String createdAt;
    /**
     * @return Type of restore job to create. Possible values are: automated and download.
     * 
     */
    private String deliveryType;
    /**
     * @return One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     * 
     */
    private List<String> deliveryUrls;
    /**
     * @return Indicates whether the restore job expired.
     * 
     */
    private Boolean expired;
    /**
     * @return UTC ISO 8601 formatted point in time when the restore job expires.
     * 
     */
    private String expiresAt;
    /**
     * @return UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    private String finishedAt;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String jobId;
    private Integer oplogInc;
    private Integer oplogTs;
    private Integer pointInTimeUtcSeconds;
    private String projectId;
    /**
     * @return Unique identifier of the source snapshot ID of the restore job.
     * 
     */
    private String snapshotId;
    /**
     * @return Name of the target Atlas cluster to which the restore job restores the snapshot. Only visible if deliveryType is automated.
     * 
     */
    private String targetClusterName;
    /**
     * @return Name of the target Atlas project of the restore job. Only visible if deliveryType is automated.
     * 
     */
    private String targetProjectId;
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch.
     * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot.
     * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch.
     * 
     */
    private String timestamp;

    private GetCloudBackupSnapshotRestoreJobResult() {}
    /**
     * @return Indicates whether the restore job was canceled.
     * 
     */
    public Boolean cancelled() {
        return this.cancelled;
    }
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return UTC ISO 8601 formatted point in time when Atlas created the restore job.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Type of restore job to create. Possible values are: automated and download.
     * 
     */
    public String deliveryType() {
        return this.deliveryType;
    }
    /**
     * @return One or more URLs for the compressed snapshot files for manual download. Only visible if deliveryType is download.
     * 
     */
    public List<String> deliveryUrls() {
        return this.deliveryUrls;
    }
    /**
     * @return Indicates whether the restore job expired.
     * 
     */
    public Boolean expired() {
        return this.expired;
    }
    /**
     * @return UTC ISO 8601 formatted point in time when the restore job expires.
     * 
     */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * @return UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    public String finishedAt() {
        return this.finishedAt;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String jobId() {
        return this.jobId;
    }
    public Integer oplogInc() {
        return this.oplogInc;
    }
    public Integer oplogTs() {
        return this.oplogTs;
    }
    public Integer pointInTimeUtcSeconds() {
        return this.pointInTimeUtcSeconds;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Unique identifier of the source snapshot ID of the restore job.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return Name of the target Atlas cluster to which the restore job restores the snapshot. Only visible if deliveryType is automated.
     * 
     */
    public String targetClusterName() {
        return this.targetClusterName;
    }
    /**
     * @return Name of the target Atlas project of the restore job. Only visible if deliveryType is automated.
     * 
     */
    public String targetProjectId() {
        return this.targetProjectId;
    }
    /**
     * @return Timestamp in ISO 8601 date and time format in UTC when the snapshot associated to snapshotId was taken.
     * * `oplogTs` - Timestamp in the number of seconds that have elapsed since the UNIX epoch.
     * * `oplogInc` - Oplog operation number from which to you want to restore this snapshot.
     * * `pointInTimeUTCSeconds` - Timestamp in the number of seconds that have elapsed since the UNIX epoch.
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudBackupSnapshotRestoreJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cancelled;
        private String clusterName;
        private String createdAt;
        private String deliveryType;
        private List<String> deliveryUrls;
        private Boolean expired;
        private String expiresAt;
        private String finishedAt;
        private String id;
        private String jobId;
        private Integer oplogInc;
        private Integer oplogTs;
        private Integer pointInTimeUtcSeconds;
        private String projectId;
        private String snapshotId;
        private String targetClusterName;
        private String targetProjectId;
        private String timestamp;
        public Builder() {}
        public Builder(GetCloudBackupSnapshotRestoreJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancelled = defaults.cancelled;
    	      this.clusterName = defaults.clusterName;
    	      this.createdAt = defaults.createdAt;
    	      this.deliveryType = defaults.deliveryType;
    	      this.deliveryUrls = defaults.deliveryUrls;
    	      this.expired = defaults.expired;
    	      this.expiresAt = defaults.expiresAt;
    	      this.finishedAt = defaults.finishedAt;
    	      this.id = defaults.id;
    	      this.jobId = defaults.jobId;
    	      this.oplogInc = defaults.oplogInc;
    	      this.oplogTs = defaults.oplogTs;
    	      this.pointInTimeUtcSeconds = defaults.pointInTimeUtcSeconds;
    	      this.projectId = defaults.projectId;
    	      this.snapshotId = defaults.snapshotId;
    	      this.targetClusterName = defaults.targetClusterName;
    	      this.targetProjectId = defaults.targetProjectId;
    	      this.timestamp = defaults.timestamp;
        }

        @CustomType.Setter
        public Builder cancelled(Boolean cancelled) {
            if (cancelled == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "cancelled");
            }
            this.cancelled = cancelled;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryType(String deliveryType) {
            if (deliveryType == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "deliveryType");
            }
            this.deliveryType = deliveryType;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryUrls(List<String> deliveryUrls) {
            if (deliveryUrls == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "deliveryUrls");
            }
            this.deliveryUrls = deliveryUrls;
            return this;
        }
        public Builder deliveryUrls(String... deliveryUrls) {
            return deliveryUrls(List.of(deliveryUrls));
        }
        @CustomType.Setter
        public Builder expired(Boolean expired) {
            if (expired == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "expired");
            }
            this.expired = expired;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            if (expiresAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "expiresAt");
            }
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder finishedAt(String finishedAt) {
            if (finishedAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "finishedAt");
            }
            this.finishedAt = finishedAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(String jobId) {
            if (jobId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "jobId");
            }
            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder oplogInc(Integer oplogInc) {
            if (oplogInc == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "oplogInc");
            }
            this.oplogInc = oplogInc;
            return this;
        }
        @CustomType.Setter
        public Builder oplogTs(Integer oplogTs) {
            if (oplogTs == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "oplogTs");
            }
            this.oplogTs = oplogTs;
            return this;
        }
        @CustomType.Setter
        public Builder pointInTimeUtcSeconds(Integer pointInTimeUtcSeconds) {
            if (pointInTimeUtcSeconds == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "pointInTimeUtcSeconds");
            }
            this.pointInTimeUtcSeconds = pointInTimeUtcSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder targetClusterName(String targetClusterName) {
            if (targetClusterName == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "targetClusterName");
            }
            this.targetClusterName = targetClusterName;
            return this;
        }
        @CustomType.Setter
        public Builder targetProjectId(String targetProjectId) {
            if (targetProjectId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "targetProjectId");
            }
            this.targetProjectId = targetProjectId;
            return this;
        }
        @CustomType.Setter
        public Builder timestamp(String timestamp) {
            if (timestamp == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobResult", "timestamp");
            }
            this.timestamp = timestamp;
            return this;
        }
        public GetCloudBackupSnapshotRestoreJobResult build() {
            final var _resultValue = new GetCloudBackupSnapshotRestoreJobResult();
            _resultValue.cancelled = cancelled;
            _resultValue.clusterName = clusterName;
            _resultValue.createdAt = createdAt;
            _resultValue.deliveryType = deliveryType;
            _resultValue.deliveryUrls = deliveryUrls;
            _resultValue.expired = expired;
            _resultValue.expiresAt = expiresAt;
            _resultValue.finishedAt = finishedAt;
            _resultValue.id = id;
            _resultValue.jobId = jobId;
            _resultValue.oplogInc = oplogInc;
            _resultValue.oplogTs = oplogTs;
            _resultValue.pointInTimeUtcSeconds = pointInTimeUtcSeconds;
            _resultValue.projectId = projectId;
            _resultValue.snapshotId = snapshotId;
            _resultValue.targetClusterName = targetClusterName;
            _resultValue.targetProjectId = targetProjectId;
            _resultValue.timestamp = timestamp;
            return _resultValue;
        }
    }
}
