// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDataLakePipelinePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataLakePipelinePlainArgs Empty = new GetDataLakePipelinePlainArgs();

    /**
     * Name of the Atlas Data Lake Pipeline.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the Atlas Data Lake Pipeline.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The unique ID for the project to create a Data Lake Pipeline.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return The unique ID for the project to create a Data Lake Pipeline.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetDataLakePipelinePlainArgs() {}

    private GetDataLakePipelinePlainArgs(GetDataLakePipelinePlainArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataLakePipelinePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataLakePipelinePlainArgs $;

        public Builder() {
            $ = new GetDataLakePipelinePlainArgs();
        }

        public Builder(GetDataLakePipelinePlainArgs defaults) {
            $ = new GetDataLakePipelinePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the Atlas Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create a Data Lake Pipeline.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetDataLakePipelinePlainArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetDataLakePipelinePlainArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetDataLakePipelinePlainArgs", "projectId");
            }
            return $;
        }
    }

}