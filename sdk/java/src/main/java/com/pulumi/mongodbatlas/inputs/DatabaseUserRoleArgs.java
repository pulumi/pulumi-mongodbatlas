// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseUserRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseUserRoleArgs Empty = new DatabaseUserRoleArgs();

    /**
     * Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
     * 
     */
    @Import(name="collectionName")
    private @Nullable Output<String> collectionName;

    /**
     * @return Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
     * 
     */
    public Optional<Output<String>> collectionName() {
        return Optional.ofNullable(this.collectionName);
    }

    /**
     * Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases. This field should be set to `admin` for a custom MongoDB role.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases. This field should be set to `admin` for a custom MongoDB role.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
     * 
     */
    @Import(name="roleName", required=true)
    private Output<String> roleName;

    /**
     * @return Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    private DatabaseUserRoleArgs() {}

    private DatabaseUserRoleArgs(DatabaseUserRoleArgs $) {
        this.collectionName = $.collectionName;
        this.databaseName = $.databaseName;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseUserRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseUserRoleArgs $;

        public Builder() {
            $ = new DatabaseUserRoleArgs();
        }

        public Builder(DatabaseUserRoleArgs defaults) {
            $ = new DatabaseUserRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collectionName Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
         * 
         * @return builder
         * 
         */
        public Builder collectionName(@Nullable Output<String> collectionName) {
            $.collectionName = collectionName;
            return this;
        }

        /**
         * @param collectionName Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
         * 
         * @return builder
         * 
         */
        public Builder collectionName(String collectionName) {
            return collectionName(Output.of(collectionName));
        }

        /**
         * @param databaseName Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases. This field should be set to `admin` for a custom MongoDB role.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases. This field should be set to `admin` for a custom MongoDB role.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param roleName Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
         * 
         * @return builder
         * 
         */
        public Builder roleName(Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public DatabaseUserRoleArgs build() {
            if ($.databaseName == null) {
                throw new MissingRequiredPropertyException("DatabaseUserRoleArgs", "databaseName");
            }
            if ($.roleName == null) {
                throw new MissingRequiredPropertyException("DatabaseUserRoleArgs", "roleName");
            }
            return $;
        }
    }

}
