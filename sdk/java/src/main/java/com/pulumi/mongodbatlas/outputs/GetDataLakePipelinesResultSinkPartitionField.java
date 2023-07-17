// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataLakePipelinesResultSinkPartitionField {
    private String fieldName;
    private Integer order;

    private GetDataLakePipelinesResultSinkPartitionField() {}
    public String fieldName() {
        return this.fieldName;
    }
    public Integer order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakePipelinesResultSinkPartitionField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldName;
        private Integer order;
        public Builder() {}
        public Builder(GetDataLakePipelinesResultSinkPartitionField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public GetDataLakePipelinesResultSinkPartitionField build() {
            final var o = new GetDataLakePipelinesResultSinkPartitionField();
            o.fieldName = fieldName;
            o.order = order;
            return o;
        }
    }
}