// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetStreamProcessorOptionsDlq;
import java.util.Objects;

@CustomType
public final class GetStreamProcessorOptions {
    /**
     * @return Dead letter queue for the stream processor. Refer to the [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/reference/glossary/#std-term-dead-letter-queue) for more information.
     * 
     */
    private GetStreamProcessorOptionsDlq dlq;

    private GetStreamProcessorOptions() {}
    /**
     * @return Dead letter queue for the stream processor. Refer to the [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/reference/glossary/#std-term-dead-letter-queue) for more information.
     * 
     */
    public GetStreamProcessorOptionsDlq dlq() {
        return this.dlq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamProcessorOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetStreamProcessorOptionsDlq dlq;
        public Builder() {}
        public Builder(GetStreamProcessorOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dlq = defaults.dlq;
        }

        @CustomType.Setter
        public Builder dlq(GetStreamProcessorOptionsDlq dlq) {
            if (dlq == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorOptions", "dlq");
            }
            this.dlq = dlq;
            return this;
        }
        public GetStreamProcessorOptions build() {
            final var _resultValue = new GetStreamProcessorOptions();
            _resultValue.dlq = dlq;
            return _resultValue;
        }
    }
}