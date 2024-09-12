// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.OnlineArchiveCriteriaArgs;
import com.pulumi.mongodbatlas.inputs.OnlineArchiveDataExpirationRuleArgs;
import com.pulumi.mongodbatlas.inputs.OnlineArchiveDataProcessRegionArgs;
import com.pulumi.mongodbatlas.inputs.OnlineArchivePartitionFieldArgs;
import com.pulumi.mongodbatlas.inputs.OnlineArchiveScheduleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineArchiveArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineArchiveArgs Empty = new OnlineArchiveArgs();

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
     * Name of the collection.
     * 
     */
    @Import(name="collName", required=true)
    private Output<String> collName;

    /**
     * @return Name of the collection.
     * 
     */
    public Output<String> collName() {
        return this.collName;
    }

    /**
     * Type of MongoDB collection that you want to return. This value can be &#34;TIMESERIES&#34; or &#34;STANDARD&#34;. Default is &#34;STANDARD&#34;.
     * 
     */
    @Import(name="collectionType")
    private @Nullable Output<String> collectionType;

    /**
     * @return Type of MongoDB collection that you want to return. This value can be &#34;TIMESERIES&#34; or &#34;STANDARD&#34;. Default is &#34;STANDARD&#34;.
     * 
     */
    public Optional<Output<String>> collectionType() {
        return Optional.ofNullable(this.collectionType);
    }

    /**
     * Criteria to use for archiving data. See criteria.
     * 
     */
    @Import(name="criteria", required=true)
    private Output<OnlineArchiveCriteriaArgs> criteria;

    /**
     * @return Criteria to use for archiving data. See criteria.
     * 
     */
    public Output<OnlineArchiveCriteriaArgs> criteria() {
        return this.criteria;
    }

    /**
     * Rule for specifying when data should be deleted from the archive. See data expiration rule.
     * 
     */
    @Import(name="dataExpirationRule")
    private @Nullable Output<OnlineArchiveDataExpirationRuleArgs> dataExpirationRule;

    /**
     * @return Rule for specifying when data should be deleted from the archive. See data expiration rule.
     * 
     */
    public Optional<Output<OnlineArchiveDataExpirationRuleArgs>> dataExpirationRule() {
        return Optional.ofNullable(this.dataExpirationRule);
    }

    /**
     * Settings to configure the region where you wish to store your archived data. See data process region. This field is immutable hence cannot be updated.
     * 
     */
    @Import(name="dataProcessRegion")
    private @Nullable Output<OnlineArchiveDataProcessRegionArgs> dataProcessRegion;

    /**
     * @return Settings to configure the region where you wish to store your archived data. See data process region. This field is immutable hence cannot be updated.
     * 
     */
    public Optional<Output<OnlineArchiveDataProcessRegionArgs>> dataProcessRegion() {
        return Optional.ofNullable(this.dataProcessRegion);
    }

    /**
     * Name of the database that contains the collection.
     * 
     */
    @Import(name="dbName", required=true)
    private Output<String> dbName;

    /**
     * @return Name of the database that contains the collection.
     * 
     */
    public Output<String> dbName() {
        return this.dbName;
    }

    /**
     * Fields to use to partition data. You can specify up to two frequently queried fields (or up to three fields when one of them is `date_field`) to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
     * 
     */
    @Import(name="partitionFields")
    private @Nullable Output<List<OnlineArchivePartitionFieldArgs>> partitionFields;

    /**
     * @return Fields to use to partition data. You can specify up to two frequently queried fields (or up to three fields when one of them is `date_field`) to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
     * 
     */
    public Optional<Output<List<OnlineArchivePartitionFieldArgs>>> partitionFields() {
        return Optional.ofNullable(this.partitionFields);
    }

    /**
     * State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * The unique ID for the project
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Regular frequency and duration when archiving process occurs. See schedule.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<OnlineArchiveScheduleArgs> schedule;

    /**
     * @return Regular frequency and duration when archiving process occurs. See schedule.
     * 
     */
    public Optional<Output<OnlineArchiveScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * Flag that indicates whether the provider will wait for the state of the online archive to reach `IDLE` or `ACTIVE` when creating an online archive. Defaults to `false`.
     * 
     */
    @Import(name="syncCreation")
    private @Nullable Output<Boolean> syncCreation;

    /**
     * @return Flag that indicates whether the provider will wait for the state of the online archive to reach `IDLE` or `ACTIVE` when creating an online archive. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> syncCreation() {
        return Optional.ofNullable(this.syncCreation);
    }

    private OnlineArchiveArgs() {}

    private OnlineArchiveArgs(OnlineArchiveArgs $) {
        this.clusterName = $.clusterName;
        this.collName = $.collName;
        this.collectionType = $.collectionType;
        this.criteria = $.criteria;
        this.dataExpirationRule = $.dataExpirationRule;
        this.dataProcessRegion = $.dataProcessRegion;
        this.dbName = $.dbName;
        this.partitionFields = $.partitionFields;
        this.paused = $.paused;
        this.projectId = $.projectId;
        this.schedule = $.schedule;
        this.syncCreation = $.syncCreation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineArchiveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineArchiveArgs $;

        public Builder() {
            $ = new OnlineArchiveArgs();
        }

        public Builder(OnlineArchiveArgs defaults) {
            $ = new OnlineArchiveArgs(Objects.requireNonNull(defaults));
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
         * @param collName Name of the collection.
         * 
         * @return builder
         * 
         */
        public Builder collName(Output<String> collName) {
            $.collName = collName;
            return this;
        }

        /**
         * @param collName Name of the collection.
         * 
         * @return builder
         * 
         */
        public Builder collName(String collName) {
            return collName(Output.of(collName));
        }

        /**
         * @param collectionType Type of MongoDB collection that you want to return. This value can be &#34;TIMESERIES&#34; or &#34;STANDARD&#34;. Default is &#34;STANDARD&#34;.
         * 
         * @return builder
         * 
         */
        public Builder collectionType(@Nullable Output<String> collectionType) {
            $.collectionType = collectionType;
            return this;
        }

        /**
         * @param collectionType Type of MongoDB collection that you want to return. This value can be &#34;TIMESERIES&#34; or &#34;STANDARD&#34;. Default is &#34;STANDARD&#34;.
         * 
         * @return builder
         * 
         */
        public Builder collectionType(String collectionType) {
            return collectionType(Output.of(collectionType));
        }

        /**
         * @param criteria Criteria to use for archiving data. See criteria.
         * 
         * @return builder
         * 
         */
        public Builder criteria(Output<OnlineArchiveCriteriaArgs> criteria) {
            $.criteria = criteria;
            return this;
        }

        /**
         * @param criteria Criteria to use for archiving data. See criteria.
         * 
         * @return builder
         * 
         */
        public Builder criteria(OnlineArchiveCriteriaArgs criteria) {
            return criteria(Output.of(criteria));
        }

        /**
         * @param dataExpirationRule Rule for specifying when data should be deleted from the archive. See data expiration rule.
         * 
         * @return builder
         * 
         */
        public Builder dataExpirationRule(@Nullable Output<OnlineArchiveDataExpirationRuleArgs> dataExpirationRule) {
            $.dataExpirationRule = dataExpirationRule;
            return this;
        }

        /**
         * @param dataExpirationRule Rule for specifying when data should be deleted from the archive. See data expiration rule.
         * 
         * @return builder
         * 
         */
        public Builder dataExpirationRule(OnlineArchiveDataExpirationRuleArgs dataExpirationRule) {
            return dataExpirationRule(Output.of(dataExpirationRule));
        }

        /**
         * @param dataProcessRegion Settings to configure the region where you wish to store your archived data. See data process region. This field is immutable hence cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder dataProcessRegion(@Nullable Output<OnlineArchiveDataProcessRegionArgs> dataProcessRegion) {
            $.dataProcessRegion = dataProcessRegion;
            return this;
        }

        /**
         * @param dataProcessRegion Settings to configure the region where you wish to store your archived data. See data process region. This field is immutable hence cannot be updated.
         * 
         * @return builder
         * 
         */
        public Builder dataProcessRegion(OnlineArchiveDataProcessRegionArgs dataProcessRegion) {
            return dataProcessRegion(Output.of(dataProcessRegion));
        }

        /**
         * @param dbName Name of the database that contains the collection.
         * 
         * @return builder
         * 
         */
        public Builder dbName(Output<String> dbName) {
            $.dbName = dbName;
            return this;
        }

        /**
         * @param dbName Name of the database that contains the collection.
         * 
         * @return builder
         * 
         */
        public Builder dbName(String dbName) {
            return dbName(Output.of(dbName));
        }

        /**
         * @param partitionFields Fields to use to partition data. You can specify up to two frequently queried fields (or up to three fields when one of them is `date_field`) to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
         * 
         * @return builder
         * 
         */
        public Builder partitionFields(@Nullable Output<List<OnlineArchivePartitionFieldArgs>> partitionFields) {
            $.partitionFields = partitionFields;
            return this;
        }

        /**
         * @param partitionFields Fields to use to partition data. You can specify up to two frequently queried fields (or up to three fields when one of them is `date_field`) to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
         * 
         * @return builder
         * 
         */
        public Builder partitionFields(List<OnlineArchivePartitionFieldArgs> partitionFields) {
            return partitionFields(Output.of(partitionFields));
        }

        /**
         * @param partitionFields Fields to use to partition data. You can specify up to two frequently queried fields (or up to three fields when one of them is `date_field`) to use for partitioning data. Queries that don’t contain the specified fields require a full collection scan of all archived documents, which takes longer and increases your costs. To learn more about how partition improves query performance, see [Data Structure in S3](https://docs.mongodb.com/datalake/admin/optimize-query-performance/#data-structure-in-s3). The value of a partition field can be up to a maximum of 700 characters. Documents with values exceeding 700 characters are not archived. See partition fields.
         * 
         * @return builder
         * 
         */
        public Builder partitionFields(OnlineArchivePartitionFieldArgs... partitionFields) {
            return partitionFields(List.of(partitionFields));
        }

        /**
         * @param paused State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused State of the online archive. This is required for pausing an active online archive or resuming a paused online archive. If the collection has another active online archive, the resume request fails.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param projectId The unique ID for the project
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param schedule Regular frequency and duration when archiving process occurs. See schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<OnlineArchiveScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Regular frequency and duration when archiving process occurs. See schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(OnlineArchiveScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param syncCreation Flag that indicates whether the provider will wait for the state of the online archive to reach `IDLE` or `ACTIVE` when creating an online archive. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder syncCreation(@Nullable Output<Boolean> syncCreation) {
            $.syncCreation = syncCreation;
            return this;
        }

        /**
         * @param syncCreation Flag that indicates whether the provider will wait for the state of the online archive to reach `IDLE` or `ACTIVE` when creating an online archive. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder syncCreation(Boolean syncCreation) {
            return syncCreation(Output.of(syncCreation));
        }

        public OnlineArchiveArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("OnlineArchiveArgs", "clusterName");
            }
            if ($.collName == null) {
                throw new MissingRequiredPropertyException("OnlineArchiveArgs", "collName");
            }
            if ($.criteria == null) {
                throw new MissingRequiredPropertyException("OnlineArchiveArgs", "criteria");
            }
            if ($.dbName == null) {
                throw new MissingRequiredPropertyException("OnlineArchiveArgs", "dbName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("OnlineArchiveArgs", "projectId");
            }
            return $;
        }
    }

}
