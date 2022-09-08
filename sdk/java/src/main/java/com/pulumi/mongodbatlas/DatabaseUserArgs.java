// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.DatabaseUserLabelArgs;
import com.pulumi.mongodbatlas.inputs.DatabaseUserRoleArgs;
import com.pulumi.mongodbatlas.inputs.DatabaseUserScopeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseUserArgs Empty = new DatabaseUserArgs();

    /**
     * Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     * 
     */
    @Import(name="authDatabaseName")
    private @Nullable Output<String> authDatabaseName;

    /**
     * @return Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
     * Accepted values include:
     * 
     */
    public Optional<Output<String>> authDatabaseName() {
        return Optional.ofNullable(this.authDatabaseName);
    }

    /**
     * If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    @Import(name="awsIamType")
    private @Nullable Output<String> awsIamType;

    /**
     * @return If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    public Optional<Output<String>> awsIamType() {
        return Optional.ofNullable(this.awsIamType);
    }

    /**
     * Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     * 
     * @deprecated
     * use auth_database_name instead
     * 
     */
    @Deprecated /* use auth_database_name instead */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     * 
     * @deprecated
     * use auth_database_name instead
     * 
     */
    @Deprecated /* use auth_database_name instead */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    @Import(name="labels")
    private @Nullable Output<List<DatabaseUserLabelArgs>> labels;

    public Optional<Output<List<DatabaseUserLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     * 
     */
    @Import(name="ldapAuthType")
    private @Nullable Output<String> ldapAuthType;

    /**
     * @return Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
     * 
     */
    public Optional<Output<String>> ldapAuthType() {
        return Optional.ofNullable(this.ldapAuthType);
    }

    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<DatabaseUserRoleArgs>> roles;

    /**
     * @return List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     * 
     */
    public Output<List<DatabaseUserRoleArgs>> roles() {
        return this.roles;
    }

    @Import(name="scopes")
    private @Nullable Output<List<DatabaseUserScopeArgs>> scopes;

    public Optional<Output<List<DatabaseUserScopeArgs>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     * X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    @Import(name="x509Type")
    private @Nullable Output<String> x509Type;

    /**
     * @return X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
     * 
     */
    public Optional<Output<String>> x509Type() {
        return Optional.ofNullable(this.x509Type);
    }

    private DatabaseUserArgs() {}

    private DatabaseUserArgs(DatabaseUserArgs $) {
        this.authDatabaseName = $.authDatabaseName;
        this.awsIamType = $.awsIamType;
        this.databaseName = $.databaseName;
        this.labels = $.labels;
        this.ldapAuthType = $.ldapAuthType;
        this.password = $.password;
        this.projectId = $.projectId;
        this.roles = $.roles;
        this.scopes = $.scopes;
        this.username = $.username;
        this.x509Type = $.x509Type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseUserArgs $;

        public Builder() {
            $ = new DatabaseUserArgs();
        }

        public Builder(DatabaseUserArgs defaults) {
            $ = new DatabaseUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authDatabaseName Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
         * Accepted values include:
         * 
         * @return builder
         * 
         */
        public Builder authDatabaseName(@Nullable Output<String> authDatabaseName) {
            $.authDatabaseName = authDatabaseName;
            return this;
        }

        /**
         * @param authDatabaseName Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
         * Accepted values include:
         * 
         * @return builder
         * 
         */
        public Builder authDatabaseName(String authDatabaseName) {
            return authDatabaseName(Output.of(authDatabaseName));
        }

        /**
         * @param awsIamType If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
         * 
         * @return builder
         * 
         */
        public Builder awsIamType(@Nullable Output<String> awsIamType) {
            $.awsIamType = awsIamType;
            return this;
        }

        /**
         * @param awsIamType If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
         * 
         * @return builder
         * 
         */
        public Builder awsIamType(String awsIamType) {
            return awsIamType(Output.of(awsIamType));
        }

        /**
         * @param databaseName Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
         * 
         * @return builder
         * 
         * @deprecated
         * use auth_database_name instead
         * 
         */
        @Deprecated /* use auth_database_name instead */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
         * 
         * @return builder
         * 
         * @deprecated
         * use auth_database_name instead
         * 
         */
        @Deprecated /* use auth_database_name instead */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder labels(@Nullable Output<List<DatabaseUserLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(List<DatabaseUserLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        public Builder labels(DatabaseUserLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param ldapAuthType Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder ldapAuthType(@Nullable Output<String> ldapAuthType) {
            $.ldapAuthType = ldapAuthType;
            return this;
        }

        /**
         * @param ldapAuthType Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder ldapAuthType(String ldapAuthType) {
            return ldapAuthType(Output.of(ldapAuthType));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param projectId The unique ID for the project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roles List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<DatabaseUserRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<DatabaseUserRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
         * 
         * @return builder
         * 
         */
        public Builder roles(DatabaseUserRoleArgs... roles) {
            return roles(List.of(roles));
        }

        public Builder scopes(@Nullable Output<List<DatabaseUserScopeArgs>> scopes) {
            $.scopes = scopes;
            return this;
        }

        public Builder scopes(List<DatabaseUserScopeArgs> scopes) {
            return scopes(Output.of(scopes));
        }

        public Builder scopes(DatabaseUserScopeArgs... scopes) {
            return scopes(List.of(scopes));
        }

        /**
         * @param username Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `aws_iam_type` is USER or ROLE.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param x509Type X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
         * 
         * @return builder
         * 
         */
        public Builder x509Type(@Nullable Output<String> x509Type) {
            $.x509Type = x509Type;
            return this;
        }

        /**
         * @param x509Type X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
         * 
         * @return builder
         * 
         */
        public Builder x509Type(String x509Type) {
            return x509Type(Output.of(x509Type));
        }

        public DatabaseUserArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
