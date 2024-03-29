// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDataLakePipelineRunPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataLakePipelineRunPlainArgs Empty = new GetDataLakePipelineRunPlainArgs();

    /**
     * Human-readable label that identifies the Data Lake Pipeline.
     * 
     */
    @Import(name="pipelineName", required=true)
    private String pipelineName;

    /**
     * @return Human-readable label that identifies the Data Lake Pipeline.
     * 
     */
    public String pipelineName() {
        return this.pipelineName;
    }

    /**
     * Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    @Import(name="pipelineRunId", required=true)
    private String pipelineRunId;

    /**
     * @return Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
     * 
     */
    public String pipelineRunId() {
        return this.pipelineRunId;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetDataLakePipelineRunPlainArgs() {}

    private GetDataLakePipelineRunPlainArgs(GetDataLakePipelineRunPlainArgs $) {
        this.pipelineName = $.pipelineName;
        this.pipelineRunId = $.pipelineRunId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataLakePipelineRunPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataLakePipelineRunPlainArgs $;

        public Builder() {
            $ = new GetDataLakePipelineRunPlainArgs();
        }

        public Builder(GetDataLakePipelineRunPlainArgs defaults) {
            $ = new GetDataLakePipelineRunPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pipelineName Human-readable label that identifies the Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder pipelineName(String pipelineName) {
            $.pipelineName = pipelineName;
            return this;
        }

        /**
         * @param pipelineRunId Unique 24-hexadecimal character string that identifies a Data Lake Pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder pipelineRunId(String pipelineRunId) {
            $.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetDataLakePipelineRunPlainArgs build() {
            if ($.pipelineName == null) {
                throw new MissingRequiredPropertyException("GetDataLakePipelineRunPlainArgs", "pipelineName");
            }
            if ($.pipelineRunId == null) {
                throw new MissingRequiredPropertyException("GetDataLakePipelineRunPlainArgs", "pipelineRunId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetDataLakePipelineRunPlainArgs", "projectId");
            }
            return $;
        }
    }

}
