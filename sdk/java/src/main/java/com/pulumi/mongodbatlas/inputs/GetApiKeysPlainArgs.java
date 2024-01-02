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


public final class GetApiKeysPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiKeysPlainArgs Empty = new GetApiKeysPlainArgs();

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
     * Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     * 
     */
    public String orgId() {
        return this.orgId;
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

    private GetApiKeysPlainArgs() {}

    private GetApiKeysPlainArgs(GetApiKeysPlainArgs $) {
        this.itemsPerPage = $.itemsPerPage;
        this.orgId = $.orgId;
        this.pageNum = $.pageNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiKeysPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiKeysPlainArgs $;

        public Builder() {
            $ = new GetApiKeysPlainArgs();
        }

        public Builder(GetApiKeysPlainArgs defaults) {
            $ = new GetApiKeysPlainArgs(Objects.requireNonNull(defaults));
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
         * @param orgId Unique identifier for the organization whose API keys you want to retrieve. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
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

        public GetApiKeysPlainArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetApiKeysPlainArgs", "orgId");
            }
            return $;
        }
    }

}
