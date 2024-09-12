// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetStreamProcessorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamProcessorPlainArgs Empty = new GetStreamProcessorPlainArgs();

    /**
     * Human-readable label that identifies the stream instance.
     * 
     */
    @Import(name="instanceName", required=true)
    private String instanceName;

    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Human-readable label that identifies the stream processor.
     * 
     */
    @Import(name="processorName", required=true)
    private String processorName;

    /**
     * @return Human-readable label that identifies the stream processor.
     * 
     */
    public String processorName() {
        return this.processorName;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetStreamProcessorPlainArgs() {}

    private GetStreamProcessorPlainArgs(GetStreamProcessorPlainArgs $) {
        this.instanceName = $.instanceName;
        this.processorName = $.processorName;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamProcessorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamProcessorPlainArgs $;

        public Builder() {
            $ = new GetStreamProcessorPlainArgs();
        }

        public Builder(GetStreamProcessorPlainArgs defaults) {
            $ = new GetStreamProcessorPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Human-readable label that identifies the stream instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param processorName Human-readable label that identifies the stream processor.
         * 
         * @return builder
         * 
         */
        public Builder processorName(String processorName) {
            $.processorName = processorName;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetStreamProcessorPlainArgs build() {
            if ($.instanceName == null) {
                throw new MissingRequiredPropertyException("GetStreamProcessorPlainArgs", "instanceName");
            }
            if ($.processorName == null) {
                throw new MissingRequiredPropertyException("GetStreamProcessorPlainArgs", "processorName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetStreamProcessorPlainArgs", "projectId");
            }
            return $;
        }
    }

}
