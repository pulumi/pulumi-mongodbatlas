// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    /**
     * The unique ID for the project.
     * 
     * &gt; **IMPORTANT:** Either `project_id` or `name` must be configurated.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique ID for the project.
     * 
     * &gt; **IMPORTANT:** Either `project_id` or `name` must be configurated.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The unique ID for the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique ID for the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The unique ID for the project.
         * 
         * &gt; **IMPORTANT:** Either `project_id` or `name` must be configurated.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique ID for the project.
         * 
         * &gt; **IMPORTANT:** Either `project_id` or `name` must be configurated.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The unique ID for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetProjectArgs build() {
            return $;
        }
    }

}