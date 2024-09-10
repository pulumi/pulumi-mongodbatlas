// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectsArgs Empty = new GetProjectsArgs();

    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    @Import(name="itemsPerPage")
    private @Nullable Output<Integer> itemsPerPage;

    /**
     * @return Number of items to return per page, up to a maximum of 500. Defaults to `100`.
     * 
     */
    public Optional<Output<Integer>> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * The page to return. Defaults to `1`.
     * 
     */
    @Import(name="pageNum")
    private @Nullable Output<Integer> pageNum;

    /**
     * @return The page to return. Defaults to `1`.
     * 
     */
    public Optional<Output<Integer>> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    private GetProjectsArgs() {}

    private GetProjectsArgs(GetProjectsArgs $) {
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectsArgs $;

        public Builder() {
            $ = new GetProjectsArgs();
        }

        public Builder(GetProjectsArgs defaults) {
            $ = new GetProjectsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(@Nullable Output<Integer> itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`.
         * 
         * @return builder
         * 
         */
        public Builder itemsPerPage(Integer itemsPerPage) {
            return itemsPerPage(Output.of(itemsPerPage));
        }

        /**
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(@Nullable Output<Integer> pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(Integer pageNum) {
            return pageNum(Output.of(pageNum));
        }

        public GetProjectsArgs build() {
            return $;
        }
    }

}