// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetDataLakePipelineSinkPartitionField;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDataLakePipelineSink {
    /**
     * @return Ordered fields used to physically organize data in the destination.
     * * `partition_fields.#.field_name` - Human-readable label that identifies the field name used to partition data.
     * * `partition_fields.#.order` - Sequence in which MongoDB Atlas slices the collection data to create partitions. The resource expresses this sequence starting with zero.
     * 
     */
    private List<GetDataLakePipelineSinkPartitionField> partitionFields;
    /**
     * @return Target cloud provider for this Data Lake Pipeline.
     * 
     */
    private String provider;
    /**
     * @return Target cloud provider region for this Data Lake Pipeline. [Supported cloud provider regions](https://www.mongodb.com/docs/datalake/limitations).
     * 
     */
    private String region;
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    private String type;

    private GetDataLakePipelineSink() {}
    /**
     * @return Ordered fields used to physically organize data in the destination.
     * * `partition_fields.#.field_name` - Human-readable label that identifies the field name used to partition data.
     * * `partition_fields.#.order` - Sequence in which MongoDB Atlas slices the collection data to create partitions. The resource expresses this sequence starting with zero.
     * 
     */
    public List<GetDataLakePipelineSinkPartitionField> partitionFields() {
        return this.partitionFields;
    }
    /**
     * @return Target cloud provider for this Data Lake Pipeline.
     * 
     */
    public String provider() {
        return this.provider;
    }
    /**
     * @return Target cloud provider region for this Data Lake Pipeline. [Supported cloud provider regions](https://www.mongodb.com/docs/datalake/limitations).
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataLakePipelineSink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDataLakePipelineSinkPartitionField> partitionFields;
        private String provider;
        private String region;
        private String type;
        public Builder() {}
        public Builder(GetDataLakePipelineSink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionFields = defaults.partitionFields;
    	      this.provider = defaults.provider;
    	      this.region = defaults.region;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder partitionFields(List<GetDataLakePipelineSinkPartitionField> partitionFields) {
            if (partitionFields == null) {
              throw new MissingRequiredPropertyException("GetDataLakePipelineSink", "partitionFields");
            }
            this.partitionFields = partitionFields;
            return this;
        }
        public Builder partitionFields(GetDataLakePipelineSinkPartitionField... partitionFields) {
            return partitionFields(List.of(partitionFields));
        }
        @CustomType.Setter
        public Builder provider(String provider) {
            if (provider == null) {
              throw new MissingRequiredPropertyException("GetDataLakePipelineSink", "provider");
            }
            this.provider = provider;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetDataLakePipelineSink", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDataLakePipelineSink", "type");
            }
            this.type = type;
            return this;
        }
        public GetDataLakePipelineSink build() {
            final var _resultValue = new GetDataLakePipelineSink();
            _resultValue.partitionFields = partitionFields;
            _resultValue.provider = provider;
            _resultValue.region = region;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}