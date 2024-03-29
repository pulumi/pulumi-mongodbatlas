// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOnlineArchivePartitionField {
    private String fieldName;
    private String fieldType;
    private Integer order;

    private GetOnlineArchivePartitionField() {}
    public String fieldName() {
        return this.fieldName;
    }
    public String fieldType() {
        return this.fieldType;
    }
    public Integer order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineArchivePartitionField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fieldName;
        private String fieldType;
        private Integer order;
        public Builder() {}
        public Builder(GetOnlineArchivePartitionField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldName = defaults.fieldName;
    	      this.fieldType = defaults.fieldType;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder fieldName(String fieldName) {
            if (fieldName == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchivePartitionField", "fieldName");
            }
            this.fieldName = fieldName;
            return this;
        }
        @CustomType.Setter
        public Builder fieldType(String fieldType) {
            if (fieldType == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchivePartitionField", "fieldType");
            }
            this.fieldType = fieldType;
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            if (order == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchivePartitionField", "order");
            }
            this.order = order;
            return this;
        }
        public GetOnlineArchivePartitionField build() {
            final var _resultValue = new GetOnlineArchivePartitionField();
            _resultValue.fieldName = fieldName;
            _resultValue.fieldType = fieldType;
            _resultValue.order = order;
            return _resultValue;
        }
    }
}
