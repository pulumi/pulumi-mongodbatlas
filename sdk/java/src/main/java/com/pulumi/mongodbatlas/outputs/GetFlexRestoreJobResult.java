// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFlexRestoreJobResult {
    private String deliveryType;
    private String expirationDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Human-readable label that identifies the flex cluster whose snapshot you want to restore.
     * 
     */
    private String name;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    private String projectId;
    private String restoreFinishedDate;
    private String restoreJobId;
    private String restoreScheduledDate;
    private String snapshotFinishedDate;
    private String snapshotId;
    private String snapshotUrl;
    private String status;
    private String targetDeploymentItemName;
    private String targetProjectId;

    private GetFlexRestoreJobResult() {}
    public String deliveryType() {
        return this.deliveryType;
    }
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that identifies the flex cluster whose snapshot you want to restore.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    public String restoreFinishedDate() {
        return this.restoreFinishedDate;
    }
    public String restoreJobId() {
        return this.restoreJobId;
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

    public static Builder builder(GetFlexRestoreJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String deliveryType;
        private String expirationDate;
        private String id;
        private String name;
        private String projectId;
        private String restoreFinishedDate;
        private String restoreJobId;
        private String restoreScheduledDate;
        private String snapshotFinishedDate;
        private String snapshotId;
        private String snapshotUrl;
        private String status;
        private String targetDeploymentItemName;
        private String targetProjectId;
        public Builder() {}
        public Builder(GetFlexRestoreJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryType = defaults.deliveryType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.restoreFinishedDate = defaults.restoreFinishedDate;
    	      this.restoreJobId = defaults.restoreJobId;
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
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "deliveryType");
            }
            this.deliveryType = deliveryType;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(String expirationDate) {
            if (expirationDate == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "expirationDate");
            }
            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder restoreFinishedDate(String restoreFinishedDate) {
            if (restoreFinishedDate == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "restoreFinishedDate");
            }
            this.restoreFinishedDate = restoreFinishedDate;
            return this;
        }
        @CustomType.Setter
        public Builder restoreJobId(String restoreJobId) {
            if (restoreJobId == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "restoreJobId");
            }
            this.restoreJobId = restoreJobId;
            return this;
        }
        @CustomType.Setter
        public Builder restoreScheduledDate(String restoreScheduledDate) {
            if (restoreScheduledDate == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "restoreScheduledDate");
            }
            this.restoreScheduledDate = restoreScheduledDate;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotFinishedDate(String snapshotFinishedDate) {
            if (snapshotFinishedDate == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "snapshotFinishedDate");
            }
            this.snapshotFinishedDate = snapshotFinishedDate;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotUrl(String snapshotUrl) {
            if (snapshotUrl == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "snapshotUrl");
            }
            this.snapshotUrl = snapshotUrl;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder targetDeploymentItemName(String targetDeploymentItemName) {
            if (targetDeploymentItemName == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "targetDeploymentItemName");
            }
            this.targetDeploymentItemName = targetDeploymentItemName;
            return this;
        }
        @CustomType.Setter
        public Builder targetProjectId(String targetProjectId) {
            if (targetProjectId == null) {
              throw new MissingRequiredPropertyException("GetFlexRestoreJobResult", "targetProjectId");
            }
            this.targetProjectId = targetProjectId;
            return this;
        }
        public GetFlexRestoreJobResult build() {
            final var _resultValue = new GetFlexRestoreJobResult();
            _resultValue.deliveryType = deliveryType;
            _resultValue.expirationDate = expirationDate;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.restoreFinishedDate = restoreFinishedDate;
            _resultValue.restoreJobId = restoreJobId;
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
