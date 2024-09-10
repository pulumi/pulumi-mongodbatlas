// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudBackupScheduleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudBackupScheduleArgs Empty = new GetCloudBackupScheduleArgs();

    /**
     * The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
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

    /**
     * Set this field to `true` to allow the data source to use the latest schema that populates `copy_settings.#.zone_id` instead of the deprecated `copy_settings.#.replication_spec_id`. These fields also enable you to reference cluster zones using independent shard scaling, which no longer supports `replication_spec.*.id`. To learn more, see the 1.18.0 upgrade guide.
     * 
     */
    @Import(name="useZoneIdForCopySettings")
    private @Nullable Output<Boolean> useZoneIdForCopySettings;

    /**
     * @return Set this field to `true` to allow the data source to use the latest schema that populates `copy_settings.#.zone_id` instead of the deprecated `copy_settings.#.replication_spec_id`. These fields also enable you to reference cluster zones using independent shard scaling, which no longer supports `replication_spec.*.id`. To learn more, see the 1.18.0 upgrade guide.
     * 
     */
    public Optional<Output<Boolean>> useZoneIdForCopySettings() {
        return Optional.ofNullable(this.useZoneIdForCopySettings);
    }

    private GetCloudBackupScheduleArgs() {}

    private GetCloudBackupScheduleArgs(GetCloudBackupScheduleArgs $) {
        this.clusterName = $.clusterName;
        this.projectId = $.projectId;
        this.useZoneIdForCopySettings = $.useZoneIdForCopySettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudBackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudBackupScheduleArgs $;

        public Builder() {
            $ = new GetCloudBackupScheduleArgs();
        }

        public Builder(GetCloudBackupScheduleArgs defaults) {
            $ = new GetCloudBackupScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Atlas cluster that contains the snapshots backup policy you want to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
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

        /**
         * @param useZoneIdForCopySettings Set this field to `true` to allow the data source to use the latest schema that populates `copy_settings.#.zone_id` instead of the deprecated `copy_settings.#.replication_spec_id`. These fields also enable you to reference cluster zones using independent shard scaling, which no longer supports `replication_spec.*.id`. To learn more, see the 1.18.0 upgrade guide.
         * 
         * @return builder
         * 
         */
        public Builder useZoneIdForCopySettings(@Nullable Output<Boolean> useZoneIdForCopySettings) {
            $.useZoneIdForCopySettings = useZoneIdForCopySettings;
            return this;
        }

        /**
         * @param useZoneIdForCopySettings Set this field to `true` to allow the data source to use the latest schema that populates `copy_settings.#.zone_id` instead of the deprecated `copy_settings.#.replication_spec_id`. These fields also enable you to reference cluster zones using independent shard scaling, which no longer supports `replication_spec.*.id`. To learn more, see the 1.18.0 upgrade guide.
         * 
         * @return builder
         * 
         */
        public Builder useZoneIdForCopySettings(Boolean useZoneIdForCopySettings) {
            return useZoneIdForCopySettings(Output.of(useZoneIdForCopySettings));
        }

        public GetCloudBackupScheduleArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupScheduleArgs", "clusterName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetCloudBackupScheduleArgs", "projectId");
            }
            return $;
        }
    }

}