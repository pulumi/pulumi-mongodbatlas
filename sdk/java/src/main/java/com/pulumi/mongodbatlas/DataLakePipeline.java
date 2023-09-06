// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mongodbatlas.DataLakePipelineArgs;
import com.pulumi.mongodbatlas.Utilities;
import com.pulumi.mongodbatlas.inputs.DataLakePipelineState;
import com.pulumi.mongodbatlas.outputs.DataLakePipelineIngestionSchedule;
import com.pulumi.mongodbatlas.outputs.DataLakePipelineSink;
import com.pulumi.mongodbatlas.outputs.DataLakePipelineSnapshot;
import com.pulumi.mongodbatlas.outputs.DataLakePipelineSource;
import com.pulumi.mongodbatlas.outputs.DataLakePipelineTransformation;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * `mongodbatlas.DataLakePipeline` provides a Data Lake Pipeline resource.
 * 
 * &gt; **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Data Lake Pipeline can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`, e.g.
 * 
 * ```sh
 *  $ pulumi import mongodbatlas:index/dataLakePipeline:DataLakePipeline example 1112222b3bf99403840e8934--test-data-lake-pipeline-test
 * ```
 *  See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Lake-Pipelines) Documentation for more information.
 * 
 */
@ResourceType(type="mongodbatlas:index/dataLakePipeline:DataLakePipeline")
public class DataLakePipeline extends com.pulumi.resources.CustomResource {
    /**
     * Timestamp that indicates when the Data Lake Pipeline was created.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Timestamp that indicates when the Data Lake Pipeline was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
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
    @Export(name="ingestionSchedules", refs={List.class,DataLakePipelineIngestionSchedule.class}, tree="[0,1]")
    private Output<List<DataLakePipelineIngestionSchedule>> ingestionSchedules;

    /**
     * @return List of backup schedule policy items that you can use as a Data Lake Pipeline source.
     * * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
     * * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
     * * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
     * * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
     * * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
     * 
     */
    public Output<List<DataLakePipelineIngestionSchedule>> ingestionSchedules() {
        return this.ingestionSchedules;
    }
    /**
     * Timestamp that indicates the last time that the Data Lake Pipeline was updated.
     * 
     */
    @Export(name="lastUpdatedDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDate;

    /**
     * @return Timestamp that indicates the last time that the Data Lake Pipeline was updated.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Name of the Atlas Data Lake Pipeline.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Atlas Data Lake Pipeline.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique ID for the project to create a data lake pipeline.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create a data lake pipeline.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    @Export(name="sink", refs={DataLakePipelineSink.class}, tree="[0]")
    private Output</* @Nullable */ DataLakePipelineSink> sink;

    public Output<Optional<DataLakePipelineSink>> sink() {
        return Codegen.optional(this.sink);
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
    @Export(name="snapshots", refs={List.class,DataLakePipelineSnapshot.class}, tree="[0,1]")
    private Output<List<DataLakePipelineSnapshot>> snapshots;

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
    public Output<List<DataLakePipelineSnapshot>> snapshots() {
        return this.snapshots;
    }
    @Export(name="source", refs={DataLakePipelineSource.class}, tree="[0]")
    private Output</* @Nullable */ DataLakePipelineSource> source;

    public Output<Optional<DataLakePipelineSource>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * State of this Data Lake Pipeline.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of this Data Lake Pipeline.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Fields to be excluded for this Data Lake Pipeline.
     * * `transformations.#.field` - Key in the document.
     * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
     * 
     */
    @Export(name="transformations", refs={List.class,DataLakePipelineTransformation.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DataLakePipelineTransformation>> transformations;

    /**
     * @return Fields to be excluded for this Data Lake Pipeline.
     * * `transformations.#.field` - Key in the document.
     * * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
     * 
     */
    public Output<Optional<List<DataLakePipelineTransformation>>> transformations() {
        return Codegen.optional(this.transformations);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataLakePipeline(String name) {
        this(name, DataLakePipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataLakePipeline(String name, DataLakePipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataLakePipeline(String name, DataLakePipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/dataLakePipeline:DataLakePipeline", name, args == null ? DataLakePipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataLakePipeline(String name, Output<String> id, @Nullable DataLakePipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mongodbatlas:index/dataLakePipeline:DataLakePipeline", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataLakePipeline get(String name, Output<String> id, @Nullable DataLakePipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataLakePipeline(name, id, state, options);
    }
}
