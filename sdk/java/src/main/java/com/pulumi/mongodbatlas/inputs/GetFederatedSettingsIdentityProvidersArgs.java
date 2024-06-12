// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFederatedSettingsIdentityProvidersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedSettingsIdentityProvidersArgs Empty = new GetFederatedSettingsIdentityProvidersArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    @Import(name="federationSettingsId", required=true)
    private Output<String> federationSettingsId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
     * 
     */
    public Output<String> federationSettingsId() {
        return this.federationSettingsId;
    }

    /**
     * The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
     * 
     */
    @Import(name="idpTypes")
    private @Nullable Output<List<String>> idpTypes;

    /**
     * @return The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
     * 
     */
    public Optional<Output<List<String>>> idpTypes() {
        return Optional.ofNullable(this.idpTypes);
    }

    /**
     * Number of items to return per page, up to a maximum of 500. Defaults to `100`. **Note**: This attribute is deprecated and not being used. The implementation is currently limited to returning a maximum of 100 results.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    @Import(name="itemsPerPage")
    private @Nullable Output<Integer> itemsPerPage;

    /**
     * @return Number of items to return per page, up to a maximum of 500. Defaults to `100`. **Note**: This attribute is deprecated and not being used. The implementation is currently limited to returning a maximum of 100 results.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    public Optional<Output<Integer>> itemsPerPage() {
        return Optional.ofNullable(this.itemsPerPage);
    }

    /**
     * The page to return. Defaults to `1`. **Note**: This attribute is deprecated and not being used.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    @Import(name="pageNum")
    private @Nullable Output<Integer> pageNum;

    /**
     * @return The page to return. Defaults to `1`. **Note**: This attribute is deprecated and not being used.
     * 
     * @deprecated
     * This parameter is deprecated and will be removed in version 1.18.0.
     * 
     */
    @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
    public Optional<Output<Integer>> pageNum() {
        return Optional.ofNullable(this.pageNum);
    }

    /**
     * The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<String>> protocols;

    /**
     * @return The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
     * 
     */
    public Optional<Output<List<String>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    private GetFederatedSettingsIdentityProvidersArgs() {}

    private GetFederatedSettingsIdentityProvidersArgs(GetFederatedSettingsIdentityProvidersArgs $) {
        this.federationSettingsId = $.federationSettingsId;
        this.idpTypes = $.idpTypes;
        this.itemsPerPage = $.itemsPerPage;
        this.pageNum = $.pageNum;
        this.protocols = $.protocols;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedSettingsIdentityProvidersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedSettingsIdentityProvidersArgs $;

        public Builder() {
            $ = new GetFederatedSettingsIdentityProvidersArgs();
        }

        public Builder(GetFederatedSettingsIdentityProvidersArgs defaults) {
            $ = new GetFederatedSettingsIdentityProvidersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param federationSettingsId Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
         * 
         * @return builder
         * 
         */
        public Builder federationSettingsId(Output<String> federationSettingsId) {
            $.federationSettingsId = federationSettingsId;
            return this;
        }

        /**
         * @param federationSettingsId Unique 24-hexadecimal digit string that identifies the federated authentication configuration.
         * 
         * @return builder
         * 
         */
        public Builder federationSettingsId(String federationSettingsId) {
            return federationSettingsId(Output.of(federationSettingsId));
        }

        /**
         * @param idpTypes The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
         * 
         * @return builder
         * 
         */
        public Builder idpTypes(@Nullable Output<List<String>> idpTypes) {
            $.idpTypes = idpTypes;
            return this;
        }

        /**
         * @param idpTypes The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
         * 
         * @return builder
         * 
         */
        public Builder idpTypes(List<String> idpTypes) {
            return idpTypes(Output.of(idpTypes));
        }

        /**
         * @param idpTypes The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
         * 
         * @return builder
         * 
         */
        public Builder idpTypes(String... idpTypes) {
            return idpTypes(List.of(idpTypes));
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`. **Note**: This attribute is deprecated and not being used. The implementation is currently limited to returning a maximum of 100 results.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.18.0.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
        public Builder itemsPerPage(@Nullable Output<Integer> itemsPerPage) {
            $.itemsPerPage = itemsPerPage;
            return this;
        }

        /**
         * @param itemsPerPage Number of items to return per page, up to a maximum of 500. Defaults to `100`. **Note**: This attribute is deprecated and not being used. The implementation is currently limited to returning a maximum of 100 results.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.18.0.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
        public Builder itemsPerPage(Integer itemsPerPage) {
            return itemsPerPage(Output.of(itemsPerPage));
        }

        /**
         * @param pageNum The page to return. Defaults to `1`. **Note**: This attribute is deprecated and not being used.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.18.0.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
        public Builder pageNum(@Nullable Output<Integer> pageNum) {
            $.pageNum = pageNum;
            return this;
        }

        /**
         * @param pageNum The page to return. Defaults to `1`. **Note**: This attribute is deprecated and not being used.
         * 
         * @return builder
         * 
         * @deprecated
         * This parameter is deprecated and will be removed in version 1.18.0.
         * 
         */
        @Deprecated /* This parameter is deprecated and will be removed in version 1.18.0. */
        public Builder pageNum(Integer pageNum) {
            return pageNum(Output.of(pageNum));
        }

        /**
         * @param protocols The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<String>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<String> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }

        public GetFederatedSettingsIdentityProvidersArgs build() {
            if ($.federationSettingsId == null) {
                throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersArgs", "federationSettingsId");
            }
            return $;
        }
    }

}
