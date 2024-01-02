// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudBackupSnapshotRestoreJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudBackupSnapshotRestoreJobArgs Empty = new GetCloudBackupSnapshotRestoreJobArgs();

    /**
     * The name of the Atlas cluster for which you want to retrieve the restore job.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster for which you want to retrieve the restore job.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The unique identifier of the restore job to retrieve.
     * 
     */
    @Import(name="jobId", required=true)
    private Output<String> jobId;

    /**
     * @return The unique identifier of the restore job to retrieve.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }

    /**
     * The unique identifier of the project for the Atlas cluster.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique identifier of the project for the Atlas cluster.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetCloudBackupSnapshotRestoreJobArgs() {}

    private GetCloudBackupSnapshotRestoreJobArgs(GetCloudBackupSnapshotRestoreJobArgs $) {
        this.clusterName = $.clusterName;
        this.jobId = $.jobId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudBackupSnapshotRestoreJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudBackupSnapshotRestoreJobArgs $;

        public Builder() {
            $ = new GetCloudBackupSnapshotRestoreJobArgs();
        }

        public Builder(GetCloudBackupSnapshotRestoreJobArgs defaults) {
            $ = new GetCloudBackupSnapshotRestoreJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Atlas cluster for which you want to retrieve the restore job.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Atlas cluster for which you want to retrieve the restore job.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param jobId The unique identifier of the restore job to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder jobId(Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The unique identifier of the restore job to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique identifier of the project for the Atlas cluster.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetCloudBackupSnapshotRestoreJobArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobArgs", "clusterName");
            }
            if ($.jobId == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobArgs", "jobId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupSnapshotRestoreJobArgs", "projectId");
            }
            return $;
        }
    }

}
