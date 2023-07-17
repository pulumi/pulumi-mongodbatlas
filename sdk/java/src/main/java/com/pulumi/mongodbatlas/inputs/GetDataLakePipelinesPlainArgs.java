// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataLakePipelinesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataLakePipelinesPlainArgs Empty = new GetDataLakePipelinesPlainArgs();

    /**
     * The unique ID for the project to create a data lake pipeline.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to create a data lake pipeline.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetDataLakePipelinesPlainArgs() {}

    private GetDataLakePipelinesPlainArgs(GetDataLakePipelinesPlainArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataLakePipelinesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataLakePipelinesPlainArgs $;

        public Builder() {
            $ = new GetDataLakePipelinesPlainArgs();
        }

        public Builder(GetDataLakePipelinesPlainArgs defaults) {
            $ = new GetDataLakePipelinesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The unique ID for the project to create a data lake pipeline.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetDataLakePipelinesPlainArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}