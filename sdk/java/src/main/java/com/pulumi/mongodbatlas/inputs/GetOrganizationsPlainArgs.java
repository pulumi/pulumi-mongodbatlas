// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationsPlainArgs Empty = new GetOrganizationsPlainArgs();

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.16.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
    @Import(name="includeDeletedOrgs")
    private @Nullable Boolean includeDeletedOrgs;

    /**
     * @deprecated
     * this parameter is deprecated and will be removed in version 1.16.0
     * 
     */
    @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
    public Optional<Boolean> includeDeletedOrgs() {
        return Optional.ofNullable(this.includeDeletedOrgs);
    }

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
     * Human-readable label that identifies the organization.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Human-readable label that identifies the organization.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
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

    private GetOrganizationsPlainArgs() {}

    private GetOrganizationsPlainArgs(GetOrganizationsPlainArgs $) {
        this.includeDeletedOrgs = $.includeDeletedOrgs;
        this.itemsPerPage = $.itemsPerPage;
        this.name = $.name;
        this.pageNum = $.pageNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationsPlainArgs $;

        public Builder() {
            $ = new GetOrganizationsPlainArgs();
        }

        public Builder(GetOrganizationsPlainArgs defaults) {
            $ = new GetOrganizationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * this parameter is deprecated and will be removed in version 1.16.0
         * 
         */
        @Deprecated /* this parameter is deprecated and will be removed in version 1.16.0 */
        public Builder includeDeletedOrgs(@Nullable Boolean includeDeletedOrgs) {
            $.includeDeletedOrgs = includeDeletedOrgs;
            return this;
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
         * @param name Human-readable label that identifies the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
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

        public GetOrganizationsPlainArgs build() {
            return $;
        }
    }

}
