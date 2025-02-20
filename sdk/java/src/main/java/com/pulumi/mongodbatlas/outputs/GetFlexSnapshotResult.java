// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFlexSnapshotResult {
    private String expiration;
    private String finishTime;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String mongoDbVersion;
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
    private String scheduledTime;
    private String snapshotId;
    private String startTime;
    private String status;

    private GetFlexSnapshotResult() {}
    public String expiration() {
        return this.expiration;
    }
    public String finishTime() {
        return this.finishTime;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String mongoDbVersion() {
        return this.mongoDbVersion;
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
    public String scheduledTime() {
        return this.scheduledTime;
    }
    public String snapshotId() {
        return this.snapshotId;
    }
    public String startTime() {
        return this.startTime;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlexSnapshotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expiration;
        private String finishTime;
        private String id;
        private String mongoDbVersion;
        private String name;
        private String projectId;
        private String scheduledTime;
        private String snapshotId;
        private String startTime;
        private String status;
        public Builder() {}
        public Builder(GetFlexSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiration = defaults.expiration;
    	      this.finishTime = defaults.finishTime;
    	      this.id = defaults.id;
    	      this.mongoDbVersion = defaults.mongoDbVersion;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.scheduledTime = defaults.scheduledTime;
    	      this.snapshotId = defaults.snapshotId;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder expiration(String expiration) {
            if (expiration == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "expiration");
            }
            this.expiration = expiration;
            return this;
        }
        @CustomType.Setter
        public Builder finishTime(String finishTime) {
            if (finishTime == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "finishTime");
            }
            this.finishTime = finishTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mongoDbVersion(String mongoDbVersion) {
            if (mongoDbVersion == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "mongoDbVersion");
            }
            this.mongoDbVersion = mongoDbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder scheduledTime(String scheduledTime) {
            if (scheduledTime == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "scheduledTime");
            }
            this.scheduledTime = scheduledTime;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            if (startTime == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "startTime");
            }
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetFlexSnapshotResult", "status");
            }
            this.status = status;
            return this;
        }
        public GetFlexSnapshotResult build() {
            final var _resultValue = new GetFlexSnapshotResult();
            _resultValue.expiration = expiration;
            _resultValue.finishTime = finishTime;
            _resultValue.id = id;
            _resultValue.mongoDbVersion = mongoDbVersion;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.scheduledTime = scheduledTime;
            _resultValue.snapshotId = snapshotId;
            _resultValue.startTime = startTime;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
