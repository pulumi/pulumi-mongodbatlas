// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyPlainArgs Empty = new GetResourcePolicyPlainArgs();

    /**
     * Unique 24-hexadecimal digit string that identifies an Atlas resource policy.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Unique 24-hexadecimal digit string that identifies an Atlas resource policy.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    private GetResourcePolicyPlainArgs() {}

    private GetResourcePolicyPlainArgs(GetResourcePolicyPlainArgs $) {
        this.id = $.id;
        this.orgId = $.orgId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePolicyPlainArgs $;

        public Builder() {
            $ = new GetResourcePolicyPlainArgs();
        }

        public Builder(GetResourcePolicyPlainArgs defaults) {
            $ = new GetResourcePolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Unique 24-hexadecimal digit string that identifies an Atlas resource policy.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param orgId Unique 24-hexadecimal digit string that identifies the organization that contains your projects. Use the /orgs endpoint to retrieve all organizations to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        public GetResourcePolicyPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetResourcePolicyPlainArgs", "id");
            }
            if ($.orgId == null) {
                throw new MissingRequiredPropertyException("GetResourcePolicyPlainArgs", "orgId");
            }
            return $;
        }
    }

}
