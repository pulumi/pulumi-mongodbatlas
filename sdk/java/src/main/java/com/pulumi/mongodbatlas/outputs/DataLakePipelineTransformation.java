// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakePipelineTransformation {
    private @Nullable String field;
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    private @Nullable String type;

    private DataLakePipelineTransformation() {}
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakePipelineTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String field;
        private @Nullable String type;
        public Builder() {}
        public Builder(DataLakePipelineTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DataLakePipelineTransformation build() {
            final var o = new DataLakePipelineTransformation();
            o.field = field;
            o.type = type;
            return o;
        }
    }
}
