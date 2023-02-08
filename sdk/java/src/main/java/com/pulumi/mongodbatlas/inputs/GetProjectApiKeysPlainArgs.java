// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectApiKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectApiKeysPlainArgs Empty = new GetProjectApiKeysPlainArgs();

    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    @Import(name="itemsPerPage")
    private @Nullable Integer itemsPerPage;

    /**
     * @return Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    public Optional<Integer> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * The page to return. Defaults to `1`.
     * 
     */
    @Import(name="pageNum")
    private @Nullable Integer pageNum;

    /**
     * @return The page to return. Defaults to `1`.
     * 
     */
    public Optional<Integer> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * Unique identifier for the project whose API keys you want to retrieve. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique identifier for the project whose API keys you want to retrieve. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetProjectApiKeysPlainArgs() {}

    private GetProjectApiKeysPlainArgs(GetProjectApiKeysPlainArgs $) {
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectApiKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectApiKeysPlainArgs $;

        public Builder() {
            $ = new GetProjectApiKeysPlainArgs();
        }

        public Builder(GetProjectApiKeysPlainArgs defaults) {
            $ = new GetProjectApiKeysPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(@Nullable Integer itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(@Nullable Integer pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param projectId Unique identifier for the project whose API keys you want to retrieve. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetProjectApiKeysPlainArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
