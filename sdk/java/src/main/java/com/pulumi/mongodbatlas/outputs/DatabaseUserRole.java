// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseUserRole {
    /**
     * @return Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
     * 
     */
    private @Nullable String collectionName;
    /**
     * @return Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases. This field should be set to `admin` for a custom MongoDB role.
     * 
     */
    private String databaseName;
    /**
     * @return Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
     * 
     */
    private String roleName;

    private DatabaseUserRole() {}
    /**
     * @return Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
     * 
     */
    public Optional<String> collectionName() {
        return Optional.ofNullable(this.collectionName);
    }
    /**
     * @return Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases. This field should be set to `admin` for a custom MongoDB role.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
     * 
     */
    public String roleName() {
        return this.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseUserRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String collectionName;
        private String databaseName;
        private String roleName;
        public Builder() {}
        public Builder(DatabaseUserRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionName = defaults.collectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.roleName = defaults.roleName;
        }

        @CustomType.Setter
        public Builder collectionName(@Nullable String collectionName) {

            this.collectionName = collectionName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("DatabaseUserRole", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder roleName(String roleName) {
            if (roleName == null) {
              throw new MissingRequiredPropertyException("DatabaseUserRole", "roleName");
            }
            this.roleName = roleName;
            return this;
        }
        public DatabaseUserRole build() {
            final var _resultValue = new DatabaseUserRole();
            _resultValue.collectionName = collectionName;
            _resultValue.databaseName = databaseName;
            _resultValue.roleName = roleName;
            return _resultValue;
        }
    }
}
