// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOnlineArchiveArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOnlineArchiveArgs Empty = new GetOnlineArchiveArgs();

    /**
     * ID of the online archive.
     * 
     */
    @Import(name="archiveId", required=true)
    private Output<String> archiveId;

    /**
     * @return ID of the online archive.
     * 
     */
    public Output<String> archiveId() {
        return this.archiveId;
    }

    /**
     * Name of the cluster that contains the collection.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Name of the cluster that contains the collection.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The unique ID for the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetOnlineArchiveArgs() {}

    private GetOnlineArchiveArgs(GetOnlineArchiveArgs $) {
        this.archiveId = $.archiveId;
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOnlineArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOnlineArchiveArgs $;

        public Builder() {
            $ = new GetOnlineArchiveArgs();
        }

        public Builder(GetOnlineArchiveArgs defaults) {
            $ = new GetOnlineArchiveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveId ID of the online archive.
         * 
         * @return builder
         * 
         */
        public Builder archiveId(Output<String> archiveId) {
            $.archiveId = archiveId;
            return this;
        }

        /**
         * @param archiveId ID of the online archive.
         * 
         * @return builder
         * 
         */
        public Builder archiveId(String archiveId) {
            return archiveId(Output.of(archiveId));
        }

        /**
         * @param clusterName Name of the cluster that contains the collection.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the cluster that contains the collection.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param projectId The unique ID for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetOnlineArchiveArgs build() {
            $.archiveId = Objects.requireNonNull($.archiveId, "expected parameter 'archiveId' to be non-null");
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
