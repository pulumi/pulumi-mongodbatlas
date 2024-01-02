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


public final class GetFederatedSettingsIdentityProvidersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedSettingsIdentityProvidersPlainArgs Empty = new GetFederatedSettingsIdentityProvidersPlainArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    @Import(name="federationSettingsId", required=true)
    private String federationSettingsId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public String federationSettingsId() {
        return this.federationSettingsId;
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

    private GetFederatedSettingsIdentityProvidersPlainArgs() {}

    private GetFederatedSettingsIdentityProvidersPlainArgs(GetFederatedSettingsIdentityProvidersPlainArgs $) {
        this.federationSettingsId = $.federationSettingsId;
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedSettingsIdentityProvidersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedSettingsIdentityProvidersPlainArgs $;

        public Builder() {
            $ = new GetFederatedSettingsIdentityProvidersPlainArgs();
        }

        public Builder(GetFederatedSettingsIdentityProvidersPlainArgs defaults) {
            $ = new GetFederatedSettingsIdentityProvidersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param federationSettingsId Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
         * 
         * @return builder
         * 
         */
        public Builder federationSettingsId(String federationSettingsId) {
            $.federationSettingsId = federationSettingsId;
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
         * @param pageNum The page to return. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder pageNum(@Nullable Integer pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        public GetFederatedSettingsIdentityProvidersPlainArgs build() {
            if ($.federationSettingsId == null) {
                throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersPlainArgs", "federationSettingsId");
            }
            return $;
        }
    }

}
