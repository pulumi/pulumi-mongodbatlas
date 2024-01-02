// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataLakePipelineSinkPartitionFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataLakePipelineSinkPartitionFieldArgs Empty = new DataLakePipelineSinkPartitionFieldArgs();

    @Import(name="fieldName", required=true)
    private Output<String> fieldName;

    public Output<String> fieldName() {
        return this.fieldName;
    }

    @Import(name="order", required=true)
    private Output<Integer> order;

    public Output<Integer> order() {
        return this.order;
    }

    private DataLakePipelineSinkPartitionFieldArgs() {}

    private DataLakePipelineSinkPartitionFieldArgs(DataLakePipelineSinkPartitionFieldArgs $) {
        this.fieldName = $.fieldName;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakePipelineSinkPartitionFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakePipelineSinkPartitionFieldArgs $;

        public Builder() {
            $ = new DataLakePipelineSinkPartitionFieldArgs();
        }

        public Builder(DataLakePipelineSinkPartitionFieldArgs defaults) {
            $ = new DataLakePipelineSinkPartitionFieldArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldName(Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        public Builder order(Output<Integer> order) {
            $.order = order;
            return this;
        }

        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public DataLakePipelineSinkPartitionFieldArgs build() {
            if ($.fieldName == null) {
                throw new MissingRequiredPropertyException("DataLakePipelineSinkPartitionFieldArgs", "fieldName");
            }
            if ($.order == null) {
                throw new MissingRequiredPropertyException("DataLakePipelineSinkPartitionFieldArgs", "order");
            }
            return $;
        }
    }

}
