// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSharedTierRestoreJobsResult {
    private String deliveryType;
    private String expirationDate;
    private String jobId;
    private String restoreFinishedDate;
    private String restoreScheduledDate;
    private String snapshotFinishedDate;
    private String snapshotId;
    private String snapshotUrl;
    private String status;
    private String targetDeploymentItemName;
    private String targetProjectId;

    private GetSharedTierRestoreJobsResult() {}
    public String deliveryType() {
        return this.deliveryType;
    }
    public String expirationDate() {
        return this.expirationDate;
    }
    public String jobId() {
        return this.jobId;
    }
    public String restoreFinishedDate() {
        return this.restoreFinishedDate;
    }
    public String restoreScheduledDate() {
        return this.restoreScheduledDate;
    }
    public String snapshotFinishedDate() {
        return this.snapshotFinishedDate;
    }
    public String snapshotId() {
        return this.snapshotId;
    }
    public String snapshotUrl() {
        return this.snapshotUrl;
    }
    public String status() {
        return this.status;
    }
    public String targetDeploymentItemName() {
        return this.targetDeploymentItemName;
    }
    public String targetProjectId() {
        return this.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedTierRestoreJobsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deliveryType;
        private String expirationDate;
        private String jobId;
        private String restoreFinishedDate;
        private String restoreScheduledDate;
        private String snapshotFinishedDate;
        private String snapshotId;
        private String snapshotUrl;
        private String status;
        private String targetDeploymentItemName;
        private String targetProjectId;
        public Builder() {}
        public Builder(GetSharedTierRestoreJobsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryType = defaults.deliveryType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.jobId = defaults.jobId;
    	      this.restoreFinishedDate = defaults.restoreFinishedDate;
    	      this.restoreScheduledDate = defaults.restoreScheduledDate;
    	      this.snapshotFinishedDate = defaults.snapshotFinishedDate;
    	      this.snapshotId = defaults.snapshotId;
    	      this.snapshotUrl = defaults.snapshotUrl;
    	      this.status = defaults.status;
    	      this.targetDeploymentItemName = defaults.targetDeploymentItemName;
    	      this.targetProjectId = defaults.targetProjectId;
        }

        @CustomType.Setter
        public Builder deliveryType(String deliveryType) {
            if (deliveryType == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "deliveryType");
            }
            this.deliveryType = deliveryType;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(String expirationDate) {
            if (expirationDate == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "expirationDate");
            }
            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(String jobId) {
            if (jobId == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "jobId");
            }
            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder restoreFinishedDate(String restoreFinishedDate) {
            if (restoreFinishedDate == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "restoreFinishedDate");
            }
            this.restoreFinishedDate = restoreFinishedDate;
            return this;
        }
        @CustomType.Setter
        public Builder restoreScheduledDate(String restoreScheduledDate) {
            if (restoreScheduledDate == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "restoreScheduledDate");
            }
            this.restoreScheduledDate = restoreScheduledDate;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotFinishedDate(String snapshotFinishedDate) {
            if (snapshotFinishedDate == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "snapshotFinishedDate");
            }
            this.snapshotFinishedDate = snapshotFinishedDate;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotUrl(String snapshotUrl) {
            if (snapshotUrl == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "snapshotUrl");
            }
            this.snapshotUrl = snapshotUrl;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder targetDeploymentItemName(String targetDeploymentItemName) {
            if (targetDeploymentItemName == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "targetDeploymentItemName");
            }
            this.targetDeploymentItemName = targetDeploymentItemName;
            return this;
        }
        @CustomType.Setter
        public Builder targetProjectId(String targetProjectId) {
            if (targetProjectId == null) {
              throw new MissingRequiredPropertyException("GetSharedTierRestoreJobsResult", "targetProjectId");
            }
            this.targetProjectId = targetProjectId;
            return this;
        }
        public GetSharedTierRestoreJobsResult build() {
            final var _resultValue = new GetSharedTierRestoreJobsResult();
            _resultValue.deliveryType = deliveryType;
            _resultValue.expirationDate = expirationDate;
            _resultValue.jobId = jobId;
            _resultValue.restoreFinishedDate = restoreFinishedDate;
            _resultValue.restoreScheduledDate = restoreScheduledDate;
            _resultValue.snapshotFinishedDate = snapshotFinishedDate;
            _resultValue.snapshotId = snapshotId;
            _resultValue.snapshotUrl = snapshotUrl;
            _resultValue.status = status;
            _resultValue.targetDeploymentItemName = targetDeploymentItemName;
            _resultValue.targetProjectId = targetProjectId;
            return _resultValue;
        }
    }
}