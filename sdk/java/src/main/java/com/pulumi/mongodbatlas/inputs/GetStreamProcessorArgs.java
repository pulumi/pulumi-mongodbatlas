// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamProcessorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamProcessorArgs Empty = new GetStreamProcessorArgs();

    /**
     * Human-readable label that identifies the stream instance.
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * Human-readable label that identifies the stream processor.
     * 
     */
    @Import(name="processorName", required=true)
    private Output<String> processorName;

    /**
     * @return Human-readable label that identifies the stream processor.
     * 
     */
    public Output<String> processorName() {
        return this.processorName;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetStreamProcessorArgs() {}

    private GetStreamProcessorArgs(GetStreamProcessorArgs $) {
        this.instanceName = $.instanceName;
        this.processorName = $.processorName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamProcessorArgs $;

        public Builder() {
            $ = new GetStreamProcessorArgs();
        }

        public Builder(GetStreamProcessorArgs defaults) {
            $ = new GetStreamProcessorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Human-readable label that identifies the stream instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
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
         * @param processorName Human-readable label that identifies the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder processorName(Output<String> processorName) {
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
        public Builder projectId(Output<String> projectId) {
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

        public GetStreamProcessorArgs build() {
            if ($.instanceName == null) {
                throw new MissingRequiredPropertyException("GetStreamProcessorArgs", "instanceName");
            }
            if ($.processorName == null) {
                throw new MissingRequiredPropertyException("GetStreamProcessorArgs", "processorName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetStreamProcessorArgs", "projectId");
            }
            return $;
        }
    }

}