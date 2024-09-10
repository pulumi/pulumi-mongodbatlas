// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataLakePipelineSinkPartitionField {
    private String fieldName;
    private Integer order;

    private DataLakePipelineSinkPartitionField() {}
    public String fieldName() {
        return this.fieldName;
    }
    public Integer order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakePipelineSinkPartitionField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldName;
        private Integer order;
        public Builder() {}
        public Builder(DataLakePipelineSinkPartitionField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            if (fieldName == null) {
              throw new MissingRequiredPropertyException("DataLakePipelineSinkPartitionField", "fieldName");
            }
            this.fieldName = fieldName;
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("DataLakePipelineSinkPartitionField", "order");
            }
            this.order = order;
            return this;
        }
        public DataLakePipelineSinkPartitionField build() {
            final var _resultValue = new DataLakePipelineSinkPartitionField();
            _resultValue.fieldName = fieldName;
            _resultValue.order = order;
            return _resultValue;
        }
    }
}