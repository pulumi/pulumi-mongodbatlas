// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationsArgs Empty = new GetOrganizationsArgs();

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.16.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
    @Import(name="includeDeletedOrgs")
    private @Nullable Output<Boolean> includeDeletedOrgs;

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.16.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
    public Optional<Output<Boolean>> includeDeletedOrgs() {
        return Optional.ofNullable(this.includeDeletedOrgs);
    }

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
     * Human-readable label that identifies the organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human-readable label that identifies the organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    private GetOrganizationsArgs() {}

    private GetOrganizationsArgs(GetOrganizationsArgs $) {
        this.includeDeletedOrgs = $.includeDeletedOrgs;
        this.itemsPerPage = $.itemsPerPage;
        this.name = $.name;
        this.pageNum = $.pageNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationsArgs $;

        public Builder() {
            $ = new GetOrganizationsArgs();
        }

        public Builder(GetOrganizationsArgs defaults) {
            $ = new GetOrganizationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * this parameter is deprecated and will be removed in version 1.16.0
         * 
         */
        @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
        public Builder includeDeletedOrgs(@Nullable Output<Boolean> includeDeletedOrgs) {
            $.includeDeletedOrgs = includeDeletedOrgs;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * this parameter is deprecated and will be removed in version 1.16.0
         * 
         */
        @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
        public Builder includeDeletedOrgs(Boolean includeDeletedOrgs) {
            return includeDeletedOrgs(Output.of(includeDeletedOrgs));
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
         * @param name Human-readable label that identifies the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human-readable label that identifies the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public GetOrganizationsArgs build() {
            return $;
        }
    }

}
