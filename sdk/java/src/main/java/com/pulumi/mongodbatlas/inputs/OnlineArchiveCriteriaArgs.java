// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnlineArchiveCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineArchiveCriteriaArgs Empty = new OnlineArchiveCriteriaArgs();

    /**
     * Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter.
     * 
     */
    @Import(name="dateField")
    private @Nullable Output<String> dateField;

    /**
     * @return Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter.
     * 
     */
    public Optional<Output<String>> dateField() {
        return Optional.ofNullable(this.dateField);
    }

    /**
     * Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
     * 
     */
    @Import(name="dateFormat")
    private @Nullable Output<String> dateFormat;

    /**
     * @return Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
     * 
     */
    public Optional<Output<String>> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster.
     * 
     * **_NOTE: if `DATE` is selected, the `partition_fields.field_name` must be completed with the `date_field` value_**
     * 
     * The only field required for criteria type `CUSTOM`
     * 
     */
    @Import(name="expireAfterDays")
    private @Nullable Output<Integer> expireAfterDays;

    /**
     * @return Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster.
     * 
     * **_NOTE: if `DATE` is selected, the `partition_fields.field_name` must be completed with the `date_field` value_**
     * 
     * The only field required for criteria type `CUSTOM`
     * 
     */
    public Optional<Output<Integer>> expireAfterDays() {
        return Optional.ofNullable(this.expireAfterDays);
    }

    /**
     * JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Type of criteria (DATE, CUSTOM)
     * 
     * The following fields are required for criteria type `DATE`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of criteria (DATE, CUSTOM)
     * 
     * The following fields are required for criteria type `DATE`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private OnlineArchiveCriteriaArgs() {}

    private OnlineArchiveCriteriaArgs(OnlineArchiveCriteriaArgs $) {
        this.dateField = $.dateField;
        this.dateFormat = $.dateFormat;
        this.expireAfterDays = $.expireAfterDays;
        this.query = $.query;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineArchiveCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineArchiveCriteriaArgs $;

        public Builder() {
            $ = new OnlineArchiveCriteriaArgs();
        }

        public Builder(OnlineArchiveCriteriaArgs defaults) {
            $ = new OnlineArchiveCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dateField Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter.
         * 
         * @return builder
         * 
         */
        public Builder dateField(@Nullable Output<String> dateField) {
            $.dateField = dateField;
            return this;
        }

        /**
         * @param dateField Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter.
         * 
         * @return builder
         * 
         */
        public Builder dateField(String dateField) {
            return dateField(Output.of(dateField));
        }

        /**
         * @param dateFormat Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable Output<String> dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param dateFormat Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(String dateFormat) {
            return dateFormat(Output.of(dateFormat));
        }

        /**
         * @param expireAfterDays Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster.
         * 
         * **_NOTE: if `DATE` is selected, the `partition_fields.field_name` must be completed with the `date_field` value_**
         * 
         * The only field required for criteria type `CUSTOM`
         * 
         * @return builder
         * 
         */
        public Builder expireAfterDays(@Nullable Output<Integer> expireAfterDays) {
            $.expireAfterDays = expireAfterDays;
            return this;
        }

        /**
         * @param expireAfterDays Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster.
         * 
         * **_NOTE: if `DATE` is selected, the `partition_fields.field_name` must be completed with the `date_field` value_**
         * 
         * The only field required for criteria type `CUSTOM`
         * 
         * @return builder
         * 
         */
        public Builder expireAfterDays(Integer expireAfterDays) {
            return expireAfterDays(Output.of(expireAfterDays));
        }

        /**
         * @param query JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param type Type of criteria (DATE, CUSTOM)
         * 
         * The following fields are required for criteria type `DATE`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of criteria (DATE, CUSTOM)
         * 
         * The following fields are required for criteria type `DATE`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OnlineArchiveCriteriaArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("OnlineArchiveCriteriaArgs", "type");
            }
            return $;
        }
    }

}