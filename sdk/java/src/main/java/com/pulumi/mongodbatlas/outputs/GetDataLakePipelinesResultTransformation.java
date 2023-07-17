// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataLakePipelinesResultTransformation {
    private String field;
    /**
     * @return Type of ingestion source of this Data Lake Pipeline.
     * 
     */
    private String type;

    private GetDataLakePipelinesResultTransformation() {}
    public String field() {
        return this.field;
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

    public static Builder builder(GetDataLakePipelinesResultTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String field;
        private String type;
        public Builder() {}
        public Builder(GetDataLakePipelinesResultTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDataLakePipelinesResultTransformation build() {
            final var o = new GetDataLakePipelinesResultTransformation();
            o.field = field;
            o.type = type;
            return o;
        }
    }
}