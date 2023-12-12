// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetDatabaseUserLabel;
import com.pulumi.mongodbatlas.outputs.GetDatabaseUserRole;
import com.pulumi.mongodbatlas.outputs.GetDatabaseUserScope;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseUserResult {
    private String authDatabaseName;
    /**
     * @return The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
     * 
     */
    private String awsIamType;
    /**
     * @return Autogenerated Unique ID for this data source.
     * 
     */
    private String id;
    private List<GetDatabaseUserLabel> labels;
    /**
     * @return Method by which the provided username is authenticated. Default is `NONE`. Other valid values are: `USER`, `GROUP`.
     * 
     */
    private String ldapAuthType;
    /**
     * @return (Optional) Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     * 
     */
    private String oidcAuthType;
    private String password;
    private String projectId;
    /**
     * @return List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     * 
     */
    private List<GetDatabaseUserRole> roles;
    /**
     * @return Array of clusters and Atlas Data Lakes that this user has access to.
     * 
     */
    private List<GetDatabaseUserScope> scopes;
    private String username;
    /**
     * @return X.509 method by which the provided username is authenticated.
     * 
     */
    private String x509Type;

    private GetDatabaseUserResult() {}
    public String authDatabaseName() {
        return this.authDatabaseName;
    }
    /**
     * @return The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
     * 
     */
    public String awsIamType() {
        return this.awsIamType;
    }
    /**
     * @return Autogenerated Unique ID for this data source.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetDatabaseUserLabel> labels() {
        return this.labels;
    }
    /**
     * @return Method by which the provided username is authenticated. Default is `NONE`. Other valid values are: `USER`, `GROUP`.
     * 
     */
    public String ldapAuthType() {
        return this.ldapAuthType;
    }
    /**
     * @return (Optional) Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
     * 
     */
    public String oidcAuthType() {
        return this.oidcAuthType;
    }
    public String password() {
        return this.password;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
     * 
     */
    public List<GetDatabaseUserRole> roles() {
        return this.roles;
    }
    /**
     * @return Array of clusters and Atlas Data Lakes that this user has access to.
     * 
     */
    public List<GetDatabaseUserScope> scopes() {
        return this.scopes;
    }
    public String username() {
        return this.username;
    }
    /**
     * @return X.509 method by which the provided username is authenticated.
     * 
     */
    public String x509Type() {
        return this.x509Type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authDatabaseName;
        private String awsIamType;
        private String id;
        private List<GetDatabaseUserLabel> labels;
        private String ldapAuthType;
        private String oidcAuthType;
        private String password;
        private String projectId;
        private List<GetDatabaseUserRole> roles;
        private List<GetDatabaseUserScope> scopes;
        private String username;
        private String x509Type;
        public Builder() {}
        public Builder(GetDatabaseUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authDatabaseName = defaults.authDatabaseName;
    	      this.awsIamType = defaults.awsIamType;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.ldapAuthType = defaults.ldapAuthType;
    	      this.oidcAuthType = defaults.oidcAuthType;
    	      this.password = defaults.password;
    	      this.projectId = defaults.projectId;
    	      this.roles = defaults.roles;
    	      this.scopes = defaults.scopes;
    	      this.username = defaults.username;
    	      this.x509Type = defaults.x509Type;
        }

        @CustomType.Setter
        public Builder authDatabaseName(String authDatabaseName) {
            this.authDatabaseName = Objects.requireNonNull(authDatabaseName);
            return this;
        }
        @CustomType.Setter
        public Builder awsIamType(String awsIamType) {
            this.awsIamType = Objects.requireNonNull(awsIamType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(List<GetDatabaseUserLabel> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(GetDatabaseUserLabel... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder ldapAuthType(String ldapAuthType) {
            this.ldapAuthType = Objects.requireNonNull(ldapAuthType);
            return this;
        }
        @CustomType.Setter
        public Builder oidcAuthType(String oidcAuthType) {
            this.oidcAuthType = Objects.requireNonNull(oidcAuthType);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<GetDatabaseUserRole> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(GetDatabaseUserRole... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder scopes(List<GetDatabaseUserScope> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(GetDatabaseUserScope... scopes) {
            return scopes(List.of(scopes));
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        @CustomType.Setter
        public Builder x509Type(String x509Type) {
            this.x509Type = Objects.requireNonNull(x509Type);
            return this;
        }
        public GetDatabaseUserResult build() {
            final var _resultValue = new GetDatabaseUserResult();
            _resultValue.authDatabaseName = authDatabaseName;
            _resultValue.awsIamType = awsIamType;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.ldapAuthType = ldapAuthType;
            _resultValue.oidcAuthType = oidcAuthType;
            _resultValue.password = password;
            _resultValue.projectId = projectId;
            _resultValue.roles = roles;
            _resultValue.scopes = scopes;
            _resultValue.username = username;
            _resultValue.x509Type = x509Type;
            return _resultValue;
        }
    }
}
