// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSharedTierRestoreJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedTierRestoreJobArgs Empty = new GetSharedTierRestoreJobArgs();

    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    @Import(name="jobId", required=true)
    private Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId;
    }

    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    private GetSharedTierRestoreJobArgs() {}

    private GetSharedTierRestoreJobArgs(GetSharedTierRestoreJobArgs $) {
        this.clusterName = $.clusterName;
        this.jobId = $.jobId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedTierRestoreJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedTierRestoreJobArgs $;

        public Builder() {
            $ = new GetSharedTierRestoreJobArgs();
        }

        public Builder(GetSharedTierRestoreJobArgs defaults) {
            $ = new GetSharedTierRestoreJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder jobId(Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetSharedTierRestoreJobArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetSharedTierRestoreJobArgs", "clusterName");
            }
            if ($.jobId == null) {
                throw new MissingRequiredPropertyException("GetSharedTierRestoreJobArgs", "jobId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetSharedTierRestoreJobArgs", "projectId");
            }
            return $;
        }
    }

}
