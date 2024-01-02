// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectLimitArgs Empty = new ProjectLimitArgs();

    @Import(name="currentUsage")
    private @Nullable Output<Integer> currentUsage;

    public Optional<Output<Integer>> currentUsage() {
        return Optional.ofNullable(this.currentUsage);
    }

    @Import(name="defaultLimit")
    private @Nullable Output<Integer> defaultLimit;

    public Optional<Output<Integer>> defaultLimit() {
        return Optional.ofNullable(this.defaultLimit);
    }

    @Import(name="maximumLimit")
    private @Nullable Output<Integer> maximumLimit;

    public Optional<Output<Integer>> maximumLimit() {
        return Optional.ofNullable(this.maximumLimit);
    }

    /**
     * Human-readable label that identifies this project limit. See [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to find all the limits that can be defined.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Human-readable label that identifies this project limit. See [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to find all the limits that can be defined.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Amount to set the limit to. Use the [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to verify the override limits.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return Amount to set the limit to. Use the [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to verify the override limits.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private ProjectLimitArgs() {}

    private ProjectLimitArgs(ProjectLimitArgs $) {
        this.currentUsage = $.currentUsage;
        this.defaultLimit = $.defaultLimit;
        this.maximumLimit = $.maximumLimit;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectLimitArgs $;

        public Builder() {
            $ = new ProjectLimitArgs();
        }

        public Builder(ProjectLimitArgs defaults) {
            $ = new ProjectLimitArgs(Objects.requireNonNull(defaults));
        }

        public Builder currentUsage(@Nullable Output<Integer> currentUsage) {
            $.currentUsage = currentUsage;
            return this;
        }

        public Builder currentUsage(Integer currentUsage) {
            return currentUsage(Output.of(currentUsage));
        }

        public Builder defaultLimit(@Nullable Output<Integer> defaultLimit) {
            $.defaultLimit = defaultLimit;
            return this;
        }

        public Builder defaultLimit(Integer defaultLimit) {
            return defaultLimit(Output.of(defaultLimit));
        }

        public Builder maximumLimit(@Nullable Output<Integer> maximumLimit) {
            $.maximumLimit = maximumLimit;
            return this;
        }

        public Builder maximumLimit(Integer maximumLimit) {
            return maximumLimit(Output.of(maximumLimit));
        }

        /**
         * @param name Human-readable label that identifies this project limit. See [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to find all the limits that can be defined.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human-readable label that identifies this project limit. See [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to find all the limits that can be defined.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Amount to set the limit to. Use the [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to verify the override limits.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Amount to set the limit to. Use the [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to verify the override limits.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public ProjectLimitArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ProjectLimitArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ProjectLimitArgs", "value");
            }
            return $;
        }
    }

}
