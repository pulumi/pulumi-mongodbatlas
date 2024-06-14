// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationArgs Empty = new GetOrganizationArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies the organization.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    private GetOrganizationArgs() {}

    private GetOrganizationArgs(GetOrganizationArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationArgs $;

        public Builder() {
            $ = new GetOrganizationArgs();
        }

        public Builder(GetOrganizationArgs defaults) {
            $ = new GetOrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetOrganizationArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetOrganizationArgs", "orgId");
            }
            return $;
        }
    }

}