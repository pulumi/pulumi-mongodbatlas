// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetStreamProcessorsResultOptions;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamProcessorsResult {
    /**
     * @return Unique 24-hexadecimal character string that identifies the stream processor.
     * 
     */
    private String id;
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    private String instanceName;
    /**
     * @return Optional configuration for the stream processor.
     * 
     */
    private GetStreamProcessorsResultOptions options;
    /**
     * @return Stream aggregation pipeline you want to apply to your streaming data.
     * 
     */
    private String pipeline;
    /**
     * @return Human-readable label that identifies the stream processor.
     * 
     */
    private String processorName;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    private String projectId;
    /**
     * @return The state of the stream processor.
     * 
     */
    private String state;
    /**
     * @return The stats associated with the stream processor.
     * 
     */
    private String stats;

    private GetStreamProcessorsResult() {}
    /**
     * @return Unique 24-hexadecimal character string that identifies the stream processor.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Optional configuration for the stream processor.
     * 
     */
    public GetStreamProcessorsResultOptions options() {
        return this.options;
    }
    /**
     * @return Stream aggregation pipeline you want to apply to your streaming data.
     * 
     */
    public String pipeline() {
        return this.pipeline;
    }
    /**
     * @return Human-readable label that identifies the stream processor.
     * 
     */
    public String processorName() {
        return this.processorName;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return The state of the stream processor.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The stats associated with the stream processor.
     * 
     */
    public String stats() {
        return this.stats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamProcessorsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceName;
        private GetStreamProcessorsResultOptions options;
        private String pipeline;
        private String processorName;
        private String projectId;
        private String state;
        private String stats;
        public Builder() {}
        public Builder(GetStreamProcessorsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.options = defaults.options;
    	      this.pipeline = defaults.pipeline;
    	      this.processorName = defaults.processorName;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder options(GetStreamProcessorsResultOptions options) {
            if (options == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "options");
            }
            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder pipeline(String pipeline) {
            if (pipeline == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "pipeline");
            }
            this.pipeline = pipeline;
            return this;
        }
        @CustomType.Setter
        public Builder processorName(String processorName) {
            if (processorName == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "processorName");
            }
            this.processorName = processorName;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder stats(String stats) {
            if (stats == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResult", "stats");
            }
            this.stats = stats;
            return this;
        }
        public GetStreamProcessorsResult build() {
            final var _resultValue = new GetStreamProcessorsResult();
            _resultValue.id = id;
            _resultValue.instanceName = instanceName;
            _resultValue.options = options;
            _resultValue.pipeline = pipeline;
            _resultValue.processorName = processorName;
            _resultValue.projectId = projectId;
            _resultValue.state = state;
            _resultValue.stats = stats;
            return _resultValue;
        }
    }
}