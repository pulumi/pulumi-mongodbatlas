// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.SearchDeploymentSpecArgs;
import com.pulumi.mongodbatlas.inputs.SearchDeploymentTimeoutsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SearchDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final SearchDeploymentArgs Empty = new SearchDeploymentArgs();

    /**
     * Label that identifies the cluster to return the search nodes for.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Label that identifies the cluster to return the search nodes for.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Flag that indicates whether to delete the search deployment if the creation times out, default is false.
     * 
     */
    @Import(name="deleteOnCreateTimeout")
    private @Nullable Output<Boolean> deleteOnCreateTimeout;

    /**
     * @return Flag that indicates whether to delete the search deployment if the creation times out, default is false.
     * 
     */
    public Optional<Output<Boolean>> deleteOnCreateTimeout() {
        return Optional.ofNullable(this.deleteOnCreateTimeout);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    @Import(name="skipWaitOnUpdate")
    private @Nullable Output<Boolean> skipWaitOnUpdate;

    public Optional<Output<Boolean>> skipWaitOnUpdate() {
        return Optional.ofNullable(this.skipWaitOnUpdate);
    }

    /**
     * List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
     * 
     */
    @Import(name="specs", required=true)
    private Output<List<SearchDeploymentSpecArgs>> specs;

    /**
     * @return List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
     * 
     */
    public Output<List<SearchDeploymentSpecArgs>> specs() {
        return this.specs;
    }

    @Import(name="timeouts")
    private @Nullable Output<SearchDeploymentTimeoutsArgs> timeouts;

    public Optional<Output<SearchDeploymentTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private SearchDeploymentArgs() {}

    private SearchDeploymentArgs(SearchDeploymentArgs $) {
        this.clusterName = $.clusterName;
        this.deleteOnCreateTimeout = $.deleteOnCreateTimeout;
        this.projectId = $.projectId;
        this.skipWaitOnUpdate = $.skipWaitOnUpdate;
        this.specs = $.specs;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SearchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SearchDeploymentArgs $;

        public Builder() {
            $ = new SearchDeploymentArgs();
        }

        public Builder(SearchDeploymentArgs defaults) {
            $ = new SearchDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Label that identifies the cluster to return the search nodes for.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Label that identifies the cluster to return the search nodes for.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param deleteOnCreateTimeout Flag that indicates whether to delete the search deployment if the creation times out, default is false.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnCreateTimeout(@Nullable Output<Boolean> deleteOnCreateTimeout) {
            $.deleteOnCreateTimeout = deleteOnCreateTimeout;
            return this;
        }

        /**
         * @param deleteOnCreateTimeout Flag that indicates whether to delete the search deployment if the creation times out, default is false.
         * 
         * @return builder
         * 
         */
        public Builder deleteOnCreateTimeout(Boolean deleteOnCreateTimeout) {
            return deleteOnCreateTimeout(Output.of(deleteOnCreateTimeout));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder skipWaitOnUpdate(@Nullable Output<Boolean> skipWaitOnUpdate) {
            $.skipWaitOnUpdate = skipWaitOnUpdate;
            return this;
        }

        public Builder skipWaitOnUpdate(Boolean skipWaitOnUpdate) {
            return skipWaitOnUpdate(Output.of(skipWaitOnUpdate));
        }

        /**
         * @param specs List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
         * 
         * @return builder
         * 
         */
        public Builder specs(Output<List<SearchDeploymentSpecArgs>> specs) {
            $.specs = specs;
            return this;
        }

        /**
         * @param specs List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
         * 
         * @return builder
         * 
         */
        public Builder specs(List<SearchDeploymentSpecArgs> specs) {
            return specs(Output.of(specs));
        }

        /**
         * @param specs List of settings that configure the search nodes for your cluster. This list is currently limited to defining a single element.
         * 
         * @return builder
         * 
         */
        public Builder specs(SearchDeploymentSpecArgs... specs) {
            return specs(List.of(specs));
        }

        public Builder timeouts(@Nullable Output<SearchDeploymentTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(SearchDeploymentTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public SearchDeploymentArgs build() {
            if ($.clusterName == null) {
                throw new MissingRequiredPropertyException("SearchDeploymentArgs", "clusterName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("SearchDeploymentArgs", "projectId");
            }
            if ($.specs == null) {
                throw new MissingRequiredPropertyException("SearchDeploymentArgs", "specs");
            }
            return $;
        }
    }

}
