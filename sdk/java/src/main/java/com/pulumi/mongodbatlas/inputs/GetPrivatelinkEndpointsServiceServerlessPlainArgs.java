// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivatelinkEndpointsServiceServerlessPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivatelinkEndpointsServiceServerlessPlainArgs Empty = new GetPrivatelinkEndpointsServiceServerlessPlainArgs();

    /**
     * Human-readable label that identifies the serverless instance
     * 
     */
    @Import(name="instanceName", required=true)
    private String instanceName;

    /**
     * @return Human-readable label that identifies the serverless instance
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.17.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.17.0 */
    @Import(name="itemsPerPage")
    private @Nullable Integer itemsPerPage;

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.17.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.17.0 */
    public Optional<Integer> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.17.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.17.0 */
    @Import(name="pageNum")
    private @Nullable Integer pageNum;

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.17.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.17.0 */
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique 24-digit hexadecimal string that identifies the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetPrivatelinkEndpointsServiceServerlessPlainArgs() {}

    private GetPrivatelinkEndpointsServiceServerlessPlainArgs(GetPrivatelinkEndpointsServiceServerlessPlainArgs $) {
        this.instanceName = $.instanceName;
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivatelinkEndpointsServiceServerlessPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivatelinkEndpointsServiceServerlessPlainArgs $;

        public Builder() {
            $ = new GetPrivatelinkEndpointsServiceServerlessPlainArgs();
        }

        public Builder(GetPrivatelinkEndpointsServiceServerlessPlainArgs defaults) {
            $ = new GetPrivatelinkEndpointsServiceServerlessPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Human-readable label that identifies the serverless instance
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * this parameter is deprecated and will be removed in version 1.17.0
         * 
         */
        @Deprecated /* this parameter is deprecated and will be removed in version 1.17.0 */
        public Builder itemsPerPage(@Nullable Integer itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * this parameter is deprecated and will be removed in version 1.17.0
         * 
         */
        @Deprecated /* this parameter is deprecated and will be removed in version 1.17.0 */
        public Builder pageNum(@Nullable Integer pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param projectId Unique 24-digit hexadecimal string that identifies the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetPrivatelinkEndpointsServiceServerlessPlainArgs build() {
            if ($.instanceName == null) {
                throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessPlainArgs", "instanceName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetPrivatelinkEndpointsServiceServerlessPlainArgs", "projectId");
            }
            return $;
        }
    }

}
