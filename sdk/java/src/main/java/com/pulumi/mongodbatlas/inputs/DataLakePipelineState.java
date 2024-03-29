// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.DataLakePipelineIngestionScheduleArgs;
import com.pulumi.mongodbatlas.inputs.DataLakePipelineSinkArgs;
import com.pulumi.mongodbatlas.inputs.DataLakePipelineSnapshotArgs;
import com.pulumi.mongodbatlas.inputs.DataLakePipelineSourceArgs;
import com.pulumi.mongodbatlas.inputs.DataLakePipelineTransformationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataLakePipelineState extends com.pulumi.resources.ResourceArgs {

    public static final DataLakePipelineState Empty = new DataLakePipelineState();

    /**
     * Timestamp that indicates when the Data Lake Pipeline was created.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return Timestamp that indicates when the Data Lake Pipeline was created.
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * List of backup schedule policy items that you can use as a Data Lake Pipeline source.
     * * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
     * * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
     * * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
     * * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
     * * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
     * 
     */
    @Import(name="ingestionSchedules")
    private @Nullable Output<List<DataLakePipelineIngestionScheduleArgs>> ingestionSchedules;

    /**
     * @return List of backup schedule policy items that you can use as a Data Lake Pipeline source.
     * * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
     * * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
     * * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
     * * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
     * * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
     * 
     */
    public Optional<Output<List<DataLakePipelineIngestionScheduleArgs>>> ingestionSchedules() {
        return Optional.ofNullable(this.ingestionSchedules);
    }

    /**
     * Timestamp that indicates the last time that the Data Lake Pipeline was updated.
     * 
     */
    @Import(name="lastUpdatedDate")
    private @Nullable Output<String> lastUpdatedDate;

    /**
     * @return Timestamp that indicates the last time that the Data Lake Pipeline was updated.
     * 
     */
    public Optional<Output<String>> lastUpdatedDate() {
        return Optional.ofNullable(this.lastUpdatedDate);
    }

    /**
     * Name of the Atlas Data Lake Pipeline.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Atlas Data Lake Pipeline.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique ID for the project to create a data lake pipeline.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique ID for the project to create a data lake pipeline.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    @Import(name="sink")
    private @Nullable Output<DataLakePipelineSinkArgs> sink;

    public Optional<Output<DataLakePipelineSinkArgs>> sink() {
        return Optional.ofNullable(this.sink);
    }

    /**
     * List of backup snapshots that you can use to trigger an on demand pipeline run.
     * * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
     * * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
     * * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
     * * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
     * * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
     * * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
     * * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
     * * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
     * * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
     * * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
     * * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
     * * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
     * * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
     * * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
     * 
     */
    @Import(name="snapshots")
    private @Nullable Output<List<DataLakePipelineSnapshotArgs>> snapshots;

    /**
     * @return List of backup snapshots that you can use to trigger an on demand pipeline run.
     * * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
     * * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
     * * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
     * * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
     * * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
     * * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
     * * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
     * * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
     * * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
     * * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
     * * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
     * * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
     * * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
     * * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
     * 
     */
    public Optional<Output<List<DataLakePipelineSnapshotArgs>>> snapshots() {
        return Optional.ofNullable(this.snapshots);
    }

    @Import(name="source")
    private @Nullable Output<DataLakePipelineSourceArgs> source;

    public Optional<Output<DataLakePipelineSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * State of this Data Lake Pipeline.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of this Data Lake Pipeline.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Fields to be excluded for this Data Lake Pipeline.
     * * `transformations.#.field` - Key in the document.
     * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
     * 
     */
    @Import(name="transformations")
    private @Nullable Output<List<DataLakePipelineTransformationArgs>> transformations;

    /**
     * @return Fields to be excluded for this Data Lake Pipeline.
     * * `transformations.#.field` - Key in the document.
     * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
     * 
     */
    public Optional<Output<List<DataLakePipelineTransformationArgs>>> transformations() {
        return Optional.ofNullable(this.transformations);
    }

    private DataLakePipelineState() {}

    private DataLakePipelineState(DataLakePipelineState $) {
        this.createdDate = $.createdDate;
        this.ingestionSchedules = $.ingestionSchedules;
        this.lastUpdatedDate = $.lastUpdatedDate;
        this.name = $.name;
        this.projectId = $.projectId;
        this.sink = $.sink;
        this.snapshots = $.snapshots;
        this.source = $.source;
        this.state = $.state;
        this.transformations = $.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakePipelineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakePipelineState $;

        public Builder() {
            $ = new DataLakePipelineState();
        }

        public Builder(DataLakePipelineState defaults) {
            $ = new DataLakePipelineState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdDate Timestamp that indicates when the Data Lake Pipeline was created.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate Timestamp that indicates when the Data Lake Pipeline was created.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param ingestionSchedules List of backup schedule policy items that you can use as a Data Lake Pipeline source.
         * * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
         * * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
         * * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
         * * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
         * * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder ingestionSchedules(@Nullable Output<List<DataLakePipelineIngestionScheduleArgs>> ingestionSchedules) {
            $.ingestionSchedules = ingestionSchedules;
            return this;
        }

        /**
         * @param ingestionSchedules List of backup schedule policy items that you can use as a Data Lake Pipeline source.
         * * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
         * * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
         * * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
         * * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
         * * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder ingestionSchedules(List<DataLakePipelineIngestionScheduleArgs> ingestionSchedules) {
            return ingestionSchedules(Output.of(ingestionSchedules));
        }

        /**
         * @param ingestionSchedules List of backup schedule policy items that you can use as a Data Lake Pipeline source.
         * * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
         * * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
         * * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
         * * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
         * * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder ingestionSchedules(DataLakePipelineIngestionScheduleArgs... ingestionSchedules) {
            return ingestionSchedules(List.of(ingestionSchedules));
        }

        /**
         * @param lastUpdatedDate Timestamp that indicates the last time that the Data Lake Pipeline was updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            $.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        /**
         * @param lastUpdatedDate Timestamp that indicates the last time that the Data Lake Pipeline was updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            return lastUpdatedDate(Output.of(lastUpdatedDate));
        }

        /**
         * @param name Name of the Atlas Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Atlas Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The unique ID for the project to create a data lake pipeline.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create a data lake pipeline.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder sink(@Nullable Output<DataLakePipelineSinkArgs> sink) {
            $.sink = sink;
            return this;
        }

        public Builder sink(DataLakePipelineSinkArgs sink) {
            return sink(Output.of(sink));
        }

        /**
         * @param snapshots List of backup snapshots that you can use to trigger an on demand pipeline run.
         * * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
         * * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
         * * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
         * * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
         * * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
         * * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
         * * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
         * * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
         * * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
         * * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
         * * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
         * * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
         * * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
         * * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
         * 
         * @return builder
         * 
         */
        public Builder snapshots(@Nullable Output<List<DataLakePipelineSnapshotArgs>> snapshots) {
            $.snapshots = snapshots;
            return this;
        }

        /**
         * @param snapshots List of backup snapshots that you can use to trigger an on demand pipeline run.
         * * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
         * * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
         * * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
         * * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
         * * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
         * * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
         * * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
         * * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
         * * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
         * * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
         * * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
         * * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
         * * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
         * * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
         * 
         * @return builder
         * 
         */
        public Builder snapshots(List<DataLakePipelineSnapshotArgs> snapshots) {
            return snapshots(Output.of(snapshots));
        }

        /**
         * @param snapshots List of backup snapshots that you can use to trigger an on demand pipeline run.
         * * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
         * * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
         * * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
         * * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
         * * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
         * * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
         * * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
         * * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
         * * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
         * * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
         * * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
         * * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
         * * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
         * * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
         * 
         * @return builder
         * 
         */
        public Builder snapshots(DataLakePipelineSnapshotArgs... snapshots) {
            return snapshots(List.of(snapshots));
        }

        public Builder source(@Nullable Output<DataLakePipelineSourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(DataLakePipelineSourceArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param state State of this Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of this Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param transformations Fields to be excluded for this Data Lake Pipeline.
         * * `transformations.#.field` - Key in the document.
         * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder transformations(@Nullable Output<List<DataLakePipelineTransformationArgs>> transformations) {
            $.transformations = transformations;
            return this;
        }

        /**
         * @param transformations Fields to be excluded for this Data Lake Pipeline.
         * * `transformations.#.field` - Key in the document.
         * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder transformations(List<DataLakePipelineTransformationArgs> transformations) {
            return transformations(Output.of(transformations));
        }

        /**
         * @param transformations Fields to be excluded for this Data Lake Pipeline.
         * * `transformations.#.field` - Key in the document.
         * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder transformations(DataLakePipelineTransformationArgs... transformations) {
            return transformations(List.of(transformations));
        }

        public DataLakePipelineState build() {
            return $;
        }
    }

}
