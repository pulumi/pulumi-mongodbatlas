// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
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
     * The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
     * 
     */
    @Import(name="idpTypes")
    private @Nullable List<String> idpTypes;

    /**
     * @return The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
     * 
     */
    public Optional<List<String>> idpTypes() {
        return Optional.ofNullable(this.idpTypes);
    }

    /**
     * The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
     * 
     */
    @Import(name="protocols")
    private @Nullable List<String> protocols;

    /**
     * @return The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
     * 
     */
    public Optional<List<String>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    private GetFederatedSettingsIdentityProvidersPlainArgs() {}

    private GetFederatedSettingsIdentityProvidersPlainArgs(GetFederatedSettingsIdentityProvidersPlainArgs $) {
        this.federationSettingsId = $.federationSettingsId;
        this.idpTypes = $.idpTypes;
        this.protocols = $.protocols;
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
         * @param idpTypes The types of the target identity providers. Valid values are `WORKFORCE` and `WORKLOAD`.
         * 
         * @return builder
         * 
         */
        public Builder idpTypes(@Nullable List<String> idpTypes) {
            $.idpTypes = idpTypes;
            return this;
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
         * @param protocols The protocols of the target identity providers. Valid values are `SAML` and `OIDC`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable List<String> protocols) {
            $.protocols = protocols;
            return this;
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

        public GetFederatedSettingsIdentityProvidersPlainArgs build() {
            if ($.federationSettingsId == null) {
                throw new MissingRequiredPropertyException("GetFederatedSettingsIdentityProvidersPlainArgs", "federationSettingsId");
            }
            return $;
        }
    }

}
