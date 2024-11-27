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
public final class GetCloudBackupSnapshotRestoreJobsResult {
    /**
     * @return Indicates whether the restore job was canceled.
     * 
     */
    private Boolean cancelled;
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
     * @return Indicates whether the restore job failed.
     * 
     */
    private Boolean failed;
    /**
     * @return UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    private String finishedAt;
    /**
     * @return The unique identifier of the restore job.
     * 
     */
    private String id;
    private Integer oplogInc;
    private Integer oplogTs;
    private Integer pointInTimeUtcSeconds;
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

    private GetCloudBackupSnapshotRestoreJobsResult() {}
    /**
     * @return Indicates whether the restore job was canceled.
     * 
     */
    public Boolean cancelled() {
        return this.cancelled;
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
     * @return Indicates whether the restore job failed.
     * 
     */
    public Boolean failed() {
        return this.failed;
    }
    /**
     * @return UTC ISO 8601 formatted point in time when the restore job completed.
     * 
     */
    public String finishedAt() {
        return this.finishedAt;
    }
    /**
     * @return The unique identifier of the restore job.
     * 
     */
    public String id() {
        return this.id;
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

    public static Builder builder(GetCloudBackupSnapshotRestoreJobsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cancelled;
        private String deliveryType;
        private List<String> deliveryUrls;
        private Boolean expired;
        private String expiresAt;
        private Boolean failed;
        private String finishedAt;
        private String id;
        private Integer oplogInc;
        private Integer oplogTs;
        private Integer pointInTimeUtcSeconds;
        private String snapshotId;
        private String targetClusterName;
        private String targetProjectId;
        private String timestamp;
        public Builder() {}
        public Builder(GetCloudBackupSnapshotRestoreJobsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancelled = defaults.cancelled;
    	      this.deliveryType = defaults.deliveryType;
    	      this.deliveryUrls = defaults.deliveryUrls;
    	      this.expired = defaults.expired;
    	      this.expiresAt = defaults.expiresAt;
    	      this.failed = defaults.failed;
    	      this.finishedAt = defaults.finishedAt;
    	      this.id = defaults.id;
    	      this.oplogInc = defaults.oplogInc;
    	      this.oplogTs = defaults.oplogTs;
    	      this.pointInTimeUtcSeconds = defaults.pointInTimeUtcSeconds;
    	      this.snapshotId = defaults.snapshotId;
    	      this.targetClusterName = defaults.targetClusterName;
    	      this.targetProjectId = defaults.targetProjectId;
    	      this.timestamp = defaults.timestamp;
        }

        @CustomType.Setter
        public Builder cancelled(Boolean cancelled) {
            if (cancelled == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "cancelled");
            }
            this.cancelled = cancelled;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryType(String deliveryType) {
            if (deliveryType == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "deliveryType");
            }
            this.deliveryType = deliveryType;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryUrls(List<String> deliveryUrls) {
            if (deliveryUrls == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "deliveryUrls");
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
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "expired");
            }
            this.expired = expired;
            return this;
        }
        @CustomType.Setter
        public Builder expiresAt(String expiresAt) {
            if (expiresAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "expiresAt");
            }
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder failed(Boolean failed) {
            if (failed == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "failed");
            }
            this.failed = failed;
            return this;
        }
        @CustomType.Setter
        public Builder finishedAt(String finishedAt) {
            if (finishedAt == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "finishedAt");
            }
            this.finishedAt = finishedAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder oplogInc(Integer oplogInc) {
            if (oplogInc == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "oplogInc");
            }
            this.oplogInc = oplogInc;
            return this;
        }
        @CustomType.Setter
        public Builder oplogTs(Integer oplogTs) {
            if (oplogTs == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "oplogTs");
            }
            this.oplogTs = oplogTs;
            return this;
        }
        @CustomType.Setter
        public Builder pointInTimeUtcSeconds(Integer pointInTimeUtcSeconds) {
            if (pointInTimeUtcSeconds == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "pointInTimeUtcSeconds");
            }
            this.pointInTimeUtcSeconds = pointInTimeUtcSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder targetClusterName(String targetClusterName) {
            if (targetClusterName == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "targetClusterName");
            }
            this.targetClusterName = targetClusterName;
            return this;
        }
        @CustomType.Setter
        public Builder targetProjectId(String targetProjectId) {
            if (targetProjectId == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "targetProjectId");
            }
            this.targetProjectId = targetProjectId;
            return this;
        }
        @CustomType.Setter
        public Builder timestamp(String timestamp) {
            if (timestamp == null) {
              throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobsResult", "timestamp");
            }
            this.timestamp = timestamp;
            return this;
        }
        public GetCloudBackupSnapshotRestoreJobsResult build() {
            final var _resultValue = new GetCloudBackupSnapshotRestoreJobsResult();
            _resultValue.cancelled = cancelled;
            _resultValue.deliveryType = deliveryType;
            _resultValue.deliveryUrls = deliveryUrls;
            _resultValue.expired = expired;
            _resultValue.expiresAt = expiresAt;
            _resultValue.failed = failed;
            _resultValue.finishedAt = finishedAt;
            _resultValue.id = id;
            _resultValue.oplogInc = oplogInc;
            _resultValue.oplogTs = oplogTs;
            _resultValue.pointInTimeUtcSeconds = pointInTimeUtcSeconds;
            _resultValue.snapshotId = snapshotId;
            _resultValue.targetClusterName = targetClusterName;
            _resultValue.targetProjectId = targetProjectId;
            _resultValue.timestamp = timestamp;
            return _resultValue;
        }
    }
}
