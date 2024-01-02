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


public final class GetPrivatelinkEndpointsServiceServerlessArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivatelinkEndpointsServiceServerlessArgs Empty = new GetPrivatelinkEndpointsServiceServerlessArgs();

    /**
     * Human-readable label that identifies the serverless instance
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    @Import(name="itemsPerPage")
    private @Nullable Output<Integer> itemsPerPage;

    public Optional<Output<Integer>> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    @Import(name="pageNum")
    private @Nullable Output<Integer> pageNum;

    public Optional<Output<Integer>> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetPrivatelinkEndpointsServiceServerlessArgs() {}

    private GetPrivatelinkEndpointsServiceServerlessArgs(GetPrivatelinkEndpointsServiceServerlessArgs $) {
        this.instanceName = $.instanceName;
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivatelinkEndpointsServiceServerlessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivatelinkEndpointsServiceServerlessArgs $;

        public Builder() {
            $ = new GetPrivatelinkEndpointsServiceServerlessArgs();
        }

        public Builder(GetPrivatelinkEndpointsServiceServerlessArgs defaults) {
            $ = new GetPrivatelinkEndpointsServiceServerlessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        public Builder itemsPerPage(@Nullable Output<Integer> itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        public Builder itemsPerPage(Integer itemsPerPage) {
            return itemsPerPage(Output.of(itemsPerPage));
        }

        public Builder pageNum(@Nullable Output<Integer> pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        public Builder pageNum(Integer pageNum) {
            return pageNum(Output.of(pageNum));
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetPrivatelinkEndpointsServiceServerlessArgs build() {
            if ($.instanceName == null) {
                throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessArgs", "instanceName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessArgs", "projectId");
            }
            return $;
        }
    }

}
