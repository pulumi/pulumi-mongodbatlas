// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataLakeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataLakeArgs Empty = new GetDataLakeArgs();

    /**
     * Name of the data lake.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the data lake.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The unique ID for the project to create a data lake.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create a data lake.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetDataLakeArgs() {}

    private GetDataLakeArgs(GetDataLakeArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataLakeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataLakeArgs $;

        public Builder() {
            $ = new GetDataLakeArgs();
        }

        public Builder(GetDataLakeArgs defaults) {
            $ = new GetDataLakeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the data lake.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the data lake.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The unique ID for the project to create a data lake.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create a data lake.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetDataLakeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}