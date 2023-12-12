// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetLdapConfigurationUserToDnMapping;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLdapConfigurationResult {
    /**
     * @return Specifies whether user authentication with LDAP is enabled.
     * 
     */
    private Boolean authenticationEnabled;
    /**
     * @return Specifies whether user authorization with LDAP is enabled.
     * 
     */
    private Boolean authorizationEnabled;
    /**
     * @return An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs.
     * 
     */
    private String authzQueryTemplate;
    /**
     * @return The password used to authenticate the `bind_username`.
     * 
     */
    private String bindPassword;
    /**
     * @return The user DN that Atlas uses to connect to the LDAP server.
     * 
     */
    private String bindUsername;
    /**
     * @return CA certificate used to verify the identify of the LDAP server.
     * 
     */
    private String caCertificate;
    /**
     * @return (Required) The hostname or IP address of the LDAP server.
     * 
     */
    private String hostname;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The port to which the LDAP server listens for client connections.
     * 
     */
    private Integer port;
    private String projectId;
    /**
     * @return Maps an LDAP username for authentication to an LDAP Distinguished Name (DN).
     * * `user_to_dn_mapping.0.match` - A regular expression to match against a provided LDAP username.
     * * `user_to_dn_mapping.0.substitution` - An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name.
     * * `user_to_dn_mapping.0.ldap_query` - An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516.
     * 
     */
    private List<GetLdapConfigurationUserToDnMapping> userToDnMappings;

    private GetLdapConfigurationResult() {}
    /**
     * @return Specifies whether user authentication with LDAP is enabled.
     * 
     */
    public Boolean authenticationEnabled() {
        return this.authenticationEnabled;
    }
    /**
     * @return Specifies whether user authorization with LDAP is enabled.
     * 
     */
    public Boolean authorizationEnabled() {
        return this.authorizationEnabled;
    }
    /**
     * @return An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs.
     * 
     */
    public String authzQueryTemplate() {
        return this.authzQueryTemplate;
    }
    /**
     * @return The password used to authenticate the `bind_username`.
     * 
     */
    public String bindPassword() {
        return this.bindPassword;
    }
    /**
     * @return The user DN that Atlas uses to connect to the LDAP server.
     * 
     */
    public String bindUsername() {
        return this.bindUsername;
    }
    /**
     * @return CA certificate used to verify the identify of the LDAP server.
     * 
     */
    public String caCertificate() {
        return this.caCertificate;
    }
    /**
     * @return (Required) The hostname or IP address of the LDAP server.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The port to which the LDAP server listens for client connections.
     * 
     */
    public Integer port() {
        return this.port;
    }
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Maps an LDAP username for authentication to an LDAP Distinguished Name (DN).
     * * `user_to_dn_mapping.0.match` - A regular expression to match against a provided LDAP username.
     * * `user_to_dn_mapping.0.substitution` - An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name.
     * * `user_to_dn_mapping.0.ldap_query` - An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516.
     * 
     */
    public List<GetLdapConfigurationUserToDnMapping> userToDnMappings() {
        return this.userToDnMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLdapConfigurationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean authenticationEnabled;
        private Boolean authorizationEnabled;
        private String authzQueryTemplate;
        private String bindPassword;
        private String bindUsername;
        private String caCertificate;
        private String hostname;
        private String id;
        private Integer port;
        private String projectId;
        private List<GetLdapConfigurationUserToDnMapping> userToDnMappings;
        public Builder() {}
        public Builder(GetLdapConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationEnabled = defaults.authenticationEnabled;
    	      this.authorizationEnabled = defaults.authorizationEnabled;
    	      this.authzQueryTemplate = defaults.authzQueryTemplate;
    	      this.bindPassword = defaults.bindPassword;
    	      this.bindUsername = defaults.bindUsername;
    	      this.caCertificate = defaults.caCertificate;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.port = defaults.port;
    	      this.projectId = defaults.projectId;
    	      this.userToDnMappings = defaults.userToDnMappings;
        }

        @CustomType.Setter
        public Builder authenticationEnabled(Boolean authenticationEnabled) {
            this.authenticationEnabled = Objects.requireNonNull(authenticationEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder authorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = Objects.requireNonNull(authorizationEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder authzQueryTemplate(String authzQueryTemplate) {
            this.authzQueryTemplate = Objects.requireNonNull(authzQueryTemplate);
            return this;
        }
        @CustomType.Setter
        public Builder bindPassword(String bindPassword) {
            this.bindPassword = Objects.requireNonNull(bindPassword);
            return this;
        }
        @CustomType.Setter
        public Builder bindUsername(String bindUsername) {
            this.bindUsername = Objects.requireNonNull(bindUsername);
            return this;
        }
        @CustomType.Setter
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder userToDnMappings(List<GetLdapConfigurationUserToDnMapping> userToDnMappings) {
            this.userToDnMappings = Objects.requireNonNull(userToDnMappings);
            return this;
        }
        public Builder userToDnMappings(GetLdapConfigurationUserToDnMapping... userToDnMappings) {
            return userToDnMappings(List.of(userToDnMappings));
        }
        public GetLdapConfigurationResult build() {
            final var _resultValue = new GetLdapConfigurationResult();
            _resultValue.authenticationEnabled = authenticationEnabled;
            _resultValue.authorizationEnabled = authorizationEnabled;
            _resultValue.authzQueryTemplate = authzQueryTemplate;
            _resultValue.bindPassword = bindPassword;
            _resultValue.bindUsername = bindUsername;
            _resultValue.caCertificate = caCertificate;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.port = port;
            _resultValue.projectId = projectId;
            _resultValue.userToDnMappings = userToDnMappings;
            return _resultValue;
        }
    }
}
