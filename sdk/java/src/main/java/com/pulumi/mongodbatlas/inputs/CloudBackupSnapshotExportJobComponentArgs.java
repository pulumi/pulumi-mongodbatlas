// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudBackupSnapshotExportJobComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudBackupSnapshotExportJobComponentArgs Empty = new CloudBackupSnapshotExportJobComponentArgs();

    /**
     * *Returned for sharded clusters only.* Export job details for each replica set in the sharded cluster.
     * 
     */
    @Import(name="exportId")
    private @Nullable Output<String> exportId;

    /**
     * @return *Returned for sharded clusters only.* Export job details for each replica set in the sharded cluster.
     * 
     */
    public Optional<Output<String>> exportId() {
        return Optional.ofNullable(this.exportId);
    }

    /**
     * *Returned for sharded clusters only.* Unique identifier of the export job for the replica set.
     * 
     */
    @Import(name="replicaSetName")
    private @Nullable Output<String> replicaSetName;

    /**
     * @return *Returned for sharded clusters only.* Unique identifier of the export job for the replica set.
     * 
     */
    public Optional<Output<String>> replicaSetName() {
        return Optional.ofNullable(this.replicaSetName);
    }

    private CloudBackupSnapshotExportJobComponentArgs() {}

    private CloudBackupSnapshotExportJobComponentArgs(CloudBackupSnapshotExportJobComponentArgs $) {
        this.exportId = $.exportId;
        this.replicaSetName = $.replicaSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudBackupSnapshotExportJobComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBackupSnapshotExportJobComponentArgs $;

        public Builder() {
            $ = new CloudBackupSnapshotExportJobComponentArgs();
        }

        public Builder(CloudBackupSnapshotExportJobComponentArgs defaults) {
            $ = new CloudBackupSnapshotExportJobComponentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exportId *Returned for sharded clusters only.* Export job details for each replica set in the sharded cluster.
         * 
         * @return builder
         * 
         */
        public Builder exportId(@Nullable Output<String> exportId) {
            $.exportId = exportId;
            return this;
        }

        /**
         * @param exportId *Returned for sharded clusters only.* Export job details for each replica set in the sharded cluster.
         * 
         * @return builder
         * 
         */
        public Builder exportId(String exportId) {
            return exportId(Output.of(exportId));
        }

        /**
         * @param replicaSetName *Returned for sharded clusters only.* Unique identifier of the export job for the replica set.
         * 
         * @return builder
         * 
         */
        public Builder replicaSetName(@Nullable Output<String> replicaSetName) {
            $.replicaSetName = replicaSetName;
            return this;
        }

        /**
         * @param replicaSetName *Returned for sharded clusters only.* Unique identifier of the export job for the replica set.
         * 
         * @return builder
         * 
         */
        public Builder replicaSetName(String replicaSetName) {
            return replicaSetName(Output.of(replicaSetName));
        }

        public CloudBackupSnapshotExportJobComponentArgs build() {
            return $;
        }
    }

}
