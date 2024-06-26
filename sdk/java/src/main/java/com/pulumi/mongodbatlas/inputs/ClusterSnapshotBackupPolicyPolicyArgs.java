// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.ClusterSnapshotBackupPolicyPolicyPolicyItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterSnapshotBackupPolicyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotBackupPolicyPolicyArgs Empty = new ClusterSnapshotBackupPolicyPolicyArgs();

    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="policyItems")
    private @Nullable Output<List<ClusterSnapshotBackupPolicyPolicyPolicyItemArgs>> policyItems;

    public Optional<Output<List<ClusterSnapshotBackupPolicyPolicyPolicyItemArgs>>> policyItems() {
        return Optional.ofNullable(this.policyItems);
    }

    private ClusterSnapshotBackupPolicyPolicyArgs() {}

    private ClusterSnapshotBackupPolicyPolicyArgs(ClusterSnapshotBackupPolicyPolicyArgs $) {
        this.id = $.id;
        this.policyItems = $.policyItems;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterSnapshotBackupPolicyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSnapshotBackupPolicyPolicyArgs $;

        public Builder() {
            $ = new ClusterSnapshotBackupPolicyPolicyArgs();
        }

        public Builder(ClusterSnapshotBackupPolicyPolicyArgs defaults) {
            $ = new ClusterSnapshotBackupPolicyPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder policyItems(@Nullable Output<List<ClusterSnapshotBackupPolicyPolicyPolicyItemArgs>> policyItems) {
            $.policyItems = policyItems;
            return this;
        }

        public Builder policyItems(List<ClusterSnapshotBackupPolicyPolicyPolicyItemArgs> policyItems) {
            return policyItems(Output.of(policyItems));
        }

        public Builder policyItems(ClusterSnapshotBackupPolicyPolicyPolicyItemArgs... policyItems) {
            return policyItems(List.of(policyItems));
        }

        public ClusterSnapshotBackupPolicyPolicyArgs build() {
            return $;
        }
    }

}
