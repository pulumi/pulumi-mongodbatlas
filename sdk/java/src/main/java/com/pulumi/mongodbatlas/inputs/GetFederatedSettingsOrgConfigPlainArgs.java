// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFederatedSettingsOrgConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFederatedSettingsOrgConfigPlainArgs Empty = new GetFederatedSettingsOrgConfigPlainArgs();

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
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    private GetFederatedSettingsOrgConfigPlainArgs() {}

    private GetFederatedSettingsOrgConfigPlainArgs(GetFederatedSettingsOrgConfigPlainArgs $) {
        this.federationSettingsId = $.federationSettingsId;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFederatedSettingsOrgConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFederatedSettingsOrgConfigPlainArgs $;

        public Builder() {
            $ = new GetFederatedSettingsOrgConfigPlainArgs();
        }

        public Builder(GetFederatedSettingsOrgConfigPlainArgs defaults) {
            $ = new GetFederatedSettingsOrgConfigPlainArgs(Objects.requireNonNull(defaults));
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
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetFederatedSettingsOrgConfigPlainArgs build() {
            if ($.federationSettingsId == null) {
                throw new MissingRequiredPropertyException("GetFederatedSettingsOrgConfigPlainArgs", "federationSettingsId");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetFederatedSettingsOrgConfigPlainArgs", "orgId");
            }
            return $;
        }
    }

}
