// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetCustomDbRoleInheritedRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCustomDbRoleInheritedRoleArgs Empty = new GetCustomDbRoleInheritedRoleArgs();

    /**
     * (Required) Database on which the inherited role is granted.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return (Required) Database on which the inherited role is granted.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Name of the custom role.
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return Name of the custom role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    private GetCustomDbRoleInheritedRoleArgs() {}

    private GetCustomDbRoleInheritedRoleArgs(GetCustomDbRoleInheritedRoleArgs $) {
        this.databaseName = $.databaseName;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomDbRoleInheritedRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomDbRoleInheritedRoleArgs $;

        public Builder() {
            $ = new GetCustomDbRoleInheritedRoleArgs();
        }

        public Builder(GetCustomDbRoleInheritedRoleArgs defaults) {
            $ = new GetCustomDbRoleInheritedRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName (Required) Database on which the inherited role is granted.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName (Required) Database on which the inherited role is granted.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param roleName Name of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName Name of the custom role.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public GetCustomDbRoleInheritedRoleArgs build() {
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("GetCustomDbRoleInheritedRoleArgs", "databaseName");
            }
            if ($.roleName == null) {
                throw new MissingRequiredPropertyException("GetCustomDbRoleInheritedRoleArgs", "roleName");
            }
            return $;
        }
    }

}