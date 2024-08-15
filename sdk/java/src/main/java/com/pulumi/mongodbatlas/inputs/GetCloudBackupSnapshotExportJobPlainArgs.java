// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCloudBackupSnapshotExportJobPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudBackupSnapshotExportJobPlainArgs Empty = new GetCloudBackupSnapshotExportJobPlainArgs();

    /**
     * Name of the Atlas cluster whose export job you want to retrieve.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return Name of the Atlas cluster whose export job you want to retrieve.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Unique identifier of the export job to retrieve.
     * 
     */
    @Import(name="exportJobId", required=true)
    private String exportJobId;

    /**
     * @return Unique identifier of the export job to retrieve.
     * 
     */
    public String exportJobId() {
        return this.exportJobId;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetCloudBackupSnapshotExportJobPlainArgs() {}

    private GetCloudBackupSnapshotExportJobPlainArgs(GetCloudBackupSnapshotExportJobPlainArgs $) {
        this.clusterName = $.clusterName;
        this.exportJobId = $.exportJobId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudBackupSnapshotExportJobPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudBackupSnapshotExportJobPlainArgs $;

        public Builder() {
            $ = new GetCloudBackupSnapshotExportJobPlainArgs();
        }

        public Builder(GetCloudBackupSnapshotExportJobPlainArgs defaults) {
            $ = new GetCloudBackupSnapshotExportJobPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Atlas cluster whose export job you want to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param exportJobId Unique identifier of the export job to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder exportJobId(String exportJobId) {
            $.exportJobId = exportJobId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project which contains the Atlas cluster whose snapshot you want to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetCloudBackupSnapshotExportJobPlainArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobPlainArgs", "clusterName");
            }
            if ($.exportJobId == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobPlainArgs", "exportJobId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupSnapshotExportJobPlainArgs", "projectId");
            }
            return $;
        }
    }

}
