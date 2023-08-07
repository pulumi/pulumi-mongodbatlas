// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSharedTierSnapshotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSharedTierSnapshotPlainArgs Empty = new GetSharedTierSnapshotPlainArgs();

    @Import(name="clusterName", required=true)
    private String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    @Import(name="projectId", required=true)
    private String projectId;

    public String projectId() {
        return this.projectId;
    }

    @Import(name="snapshotId", required=true)
    private String snapshotId;

    public String snapshotId() {
        return this.snapshotId;
    }

    private GetSharedTierSnapshotPlainArgs() {}

    private GetSharedTierSnapshotPlainArgs(GetSharedTierSnapshotPlainArgs $) {
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSharedTierSnapshotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSharedTierSnapshotPlainArgs $;

        public Builder() {
            $ = new GetSharedTierSnapshotPlainArgs();
        }

        public Builder(GetSharedTierSnapshotPlainArgs defaults) {
            $ = new GetSharedTierSnapshotPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        public GetSharedTierSnapshotPlainArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            return $;
        }
    }

}
