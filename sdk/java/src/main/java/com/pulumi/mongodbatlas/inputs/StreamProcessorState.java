// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.StreamProcessorOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamProcessorState extends com.pulumi.resources.ResourceArgs {

    public static final StreamProcessorState Empty = new StreamProcessorState();

    /**
     * Human-readable label that identifies the stream instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * Optional configuration for the stream processor.
     * 
     */
    @Import(name="options")
    private @Nullable Output<StreamProcessorOptionsArgs> options;

    /**
     * @return Optional configuration for the stream processor.
     * 
     */
    public Optional<Output<StreamProcessorOptionsArgs>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
     * 
     */
    @Import(name="pipeline")
    private @Nullable Output<String> pipeline;

    /**
     * @return Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
     * 
     */
    public Optional<Output<String>> pipeline() {
        return Optional.ofNullable(this.pipeline);
    }

    /**
     * Human-readable label that identifies the stream processor.
     * 
     */
    @Import(name="processorName")
    private @Nullable Output<String> processorName;

    /**
     * @return Human-readable label that identifies the stream processor.
     * 
     */
    public Optional<Output<String>> processorName() {
        return Optional.ofNullable(this.processorName);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The state of the stream processor. Commonly occurring states are &#39;CREATED&#39;, &#39;STARTED&#39;, &#39;STOPPED&#39; and &#39;FAILED&#39;. Used to
     * start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
     * created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
     * setting the state to STARTED can automatically start the stream processor.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the stream processor. Commonly occurring states are &#39;CREATED&#39;, &#39;STARTED&#39;, &#39;STOPPED&#39; and &#39;FAILED&#39;. Used to
     * start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
     * created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
     * setting the state to STARTED can automatically start the stream processor.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The stats associated with the stream processor. Refer to the [MongoDB Atlas
     * Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
     * for more information.
     * 
     */
    @Import(name="stats")
    private @Nullable Output<String> stats;

    /**
     * @return The stats associated with the stream processor. Refer to the [MongoDB Atlas
     * Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
     * for more information.
     * 
     */
    public Optional<Output<String>> stats() {
        return Optional.ofNullable(this.stats);
    }

    private StreamProcessorState() {}

    private StreamProcessorState(StreamProcessorState $) {
        this.instanceName = $.instanceName;
        this.options = $.options;
        this.pipeline = $.pipeline;
        this.processorName = $.processorName;
        this.projectId = $.projectId;
        this.state = $.state;
        this.stats = $.stats;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamProcessorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamProcessorState $;

        public Builder() {
            $ = new StreamProcessorState();
        }

        public Builder(StreamProcessorState defaults) {
            $ = new StreamProcessorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Human-readable label that identifies the stream instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName Human-readable label that identifies the stream instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param options Optional configuration for the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<StreamProcessorOptionsArgs> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Optional configuration for the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder options(StreamProcessorOptionsArgs options) {
            return options(Output.of(options));
        }

        /**
         * @param pipeline Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
         * 
         * @return builder
         * 
         */
        public Builder pipeline(@Nullable Output<String> pipeline) {
            $.pipeline = pipeline;
            return this;
        }

        /**
         * @param pipeline Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
         * 
         * @return builder
         * 
         */
        public Builder pipeline(String pipeline) {
            return pipeline(Output.of(pipeline));
        }

        /**
         * @param processorName Human-readable label that identifies the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder processorName(@Nullable Output<String> processorName) {
            $.processorName = processorName;
            return this;
        }

        /**
         * @param processorName Human-readable label that identifies the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder processorName(String processorName) {
            return processorName(Output.of(processorName));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param state The state of the stream processor. Commonly occurring states are &#39;CREATED&#39;, &#39;STARTED&#39;, &#39;STOPPED&#39; and &#39;FAILED&#39;. Used to
         * start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
         * created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
         * setting the state to STARTED can automatically start the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the stream processor. Commonly occurring states are &#39;CREATED&#39;, &#39;STARTED&#39;, &#39;STOPPED&#39; and &#39;FAILED&#39;. Used to
         * start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
         * created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
         * setting the state to STARTED can automatically start the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stats The stats associated with the stream processor. Refer to the [MongoDB Atlas
         * Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
         * for more information.
         * 
         * @return builder
         * 
         */
        public Builder stats(@Nullable Output<String> stats) {
            $.stats = stats;
            return this;
        }

        /**
         * @param stats The stats associated with the stream processor. Refer to the [MongoDB Atlas
         * Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
         * for more information.
         * 
         * @return builder
         * 
         */
        public Builder stats(String stats) {
            return stats(Output.of(stats));
        }

        public StreamProcessorState build() {
            return $;
        }
    }

}
