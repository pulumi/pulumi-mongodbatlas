// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationArgs Empty = new OrganizationArgs();

    @Import(name="description", required=true)
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }

    /**
     * The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys.  [https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
     * 
     */
    @Import(name="orgOwnerId", required=true)
    private Output<String> orgOwnerId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys.  [https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
     * 
     */
    public Output<String> orgOwnerId() {
        return this.orgOwnerId;
    }

    /**
     * List of Organization roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key.
     * The following are valid roles:
     * 
     */
    @Import(name="roleNames", required=true)
    private Output<List<String>> roleNames;

    /**
     * @return List of Organization roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key.
     * The following are valid roles:
     * 
     */
    public Output<List<String>> roleNames() {
        return this.roleNames;
    }

    private OrganizationArgs() {}

    private OrganizationArgs(OrganizationArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.orgOwnerId = $.orgOwnerId;
        this.roleNames = $.roleNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationArgs $;

        public Builder() {
            $ = new OrganizationArgs();
        }

        public Builder(OrganizationArgs defaults) {
            $ = new OrganizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the organization you want to create. (Cannot be changed via this Provider after creation.)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgOwnerId Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys.  [https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
         * 
         * @return builder
         * 
         */
        public Builder orgOwnerId(Output<String> orgOwnerId) {
            $.orgOwnerId = orgOwnerId;
            return this;
        }

        /**
         * @param orgOwnerId Unique 24-hexadecimal digit string that identifies the Atlas user that you want to assign the Organization Owner role. This user must be a member of the same organization as the calling API key.  This is only required when authenticating with Programmatic API Keys.  [https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/MongoDB-Cloud-Users/operation/getUserByUsername)
         * 
         * @return builder
         * 
         */
        public Builder orgOwnerId(String orgOwnerId) {
            return orgOwnerId(Output.of(orgOwnerId));
        }

        /**
         * @param roleNames List of Organization roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key.
         * The following are valid roles:
         * 
         * @return builder
         * 
         */
        public Builder roleNames(Output<List<String>> roleNames) {
            $.roleNames = roleNames;
            return this;
        }

        /**
         * @param roleNames List of Organization roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key.
         * The following are valid roles:
         * 
         * @return builder
         * 
         */
        public Builder roleNames(List<String> roleNames) {
            return roleNames(Output.of(roleNames));
        }

        /**
         * @param roleNames List of Organization roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Organization.  You must specify an array even if you are only associating a single role with the Programmatic API key.
         * The following are valid roles:
         * 
         * @return builder
         * 
         */
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }

        public OrganizationArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.orgOwnerId = Objects.requireNonNull($.orgOwnerId, "expected parameter 'orgOwnerId' to be non-null");
            $.roleNames = Objects.requireNonNull($.roleNames, "expected parameter 'roleNames' to be non-null");
            return $;
        }
    }

}
