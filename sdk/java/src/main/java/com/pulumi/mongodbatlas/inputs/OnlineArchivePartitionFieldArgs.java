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


public final class OnlineArchivePartitionFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final OnlineArchivePartitionFieldArgs Empty = new OnlineArchivePartitionFieldArgs();

    /**
     * Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
     * 
     */
    @Import(name="fieldName", required=true)
    private Output<String> fieldName;

    /**
     * @return Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
     * 
     */
    public Output<String> fieldName() {
        return this.fieldName;
    }

    /**
     * Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
     * 
     */
    @Import(name="fieldType")
    private @Nullable Output<String> fieldType;

    /**
     * @return Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
     * 
     */
    public Optional<Output<String>> fieldType() {
        return Optional.ofNullable(this.fieldType);
    }

    /**
     * Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
     * 
     */
    @Import(name="order", required=true)
    private Output<Integer> order;

    /**
     * @return Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }

    private OnlineArchivePartitionFieldArgs() {}

    private OnlineArchivePartitionFieldArgs(OnlineArchivePartitionFieldArgs $) {
        this.fieldName = $.fieldName;
        this.fieldType = $.fieldType;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OnlineArchivePartitionFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OnlineArchivePartitionFieldArgs $;

        public Builder() {
            $ = new OnlineArchivePartitionFieldArgs();
        }

        public Builder(OnlineArchivePartitionFieldArgs defaults) {
            $ = new OnlineArchivePartitionFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldName Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        /**
         * @param fieldName Human-readable label that identifies the parameter that MongoDB Cloud uses to partition data. To specify a nested parameter, use the dot notation.
         * 
         * @return builder
         * 
         */
        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        /**
         * @param fieldType Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
         * 
         * @return builder
         * 
         */
        public Builder fieldType(@Nullable Output<String> fieldType) {
            $.fieldType = fieldType;
            return this;
        }

        /**
         * @param fieldType Data type of the parameter that that MongoDB Cloud uses to partition data. Partition parameters of type UUID must be of binary subtype 4. MongoDB Cloud skips partition parameters of type UUID with subtype 3. Valid values: `date`, `int`, `long`, `objectId`, `string`, `uuid`.
         * 
         * @return builder
         * 
         */
        public Builder fieldType(String fieldType) {
            return fieldType(Output.of(fieldType));
        }

        /**
         * @param order Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
         * 
         * @return builder
         * 
         */
        public Builder order(Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Sequence in which MongoDB Cloud slices the collection data to create partitions. The resource expresses this sequence starting with zero. The value of the `criteria.dateField` parameter defaults as the first item in the partition sequence.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public OnlineArchivePartitionFieldArgs build() {
            if ($.fieldName == null) {
                throw new MissingRequiredPropertyException("OnlineArchivePartitionFieldArgs", "fieldName");
            }
            if ($.order == null) {
                throw new MissingRequiredPropertyException("OnlineArchivePartitionFieldArgs", "order");
            }
            return $;
        }
    }

}
