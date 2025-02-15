// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePoliciesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePoliciesArgs Empty = new GetResourcePoliciesArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    private GetResourcePoliciesArgs() {}

    private GetResourcePoliciesArgs(GetResourcePoliciesArgs $) {
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePoliciesArgs $;

        public Builder() {
            $ = new GetResourcePoliciesArgs();
        }

        public Builder(GetResourcePoliciesArgs defaults) {
            $ = new GetResourcePoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        public GetResourcePoliciesArgs build() {
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetResourcePoliciesArgs", "orgId");
            }
            return $;
        }
    }

}
