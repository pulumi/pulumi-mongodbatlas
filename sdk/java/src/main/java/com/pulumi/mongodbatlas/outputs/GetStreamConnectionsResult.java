// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetStreamConnectionsResultAuthentication;
import com.pulumi.mongodbatlas.outputs.GetStreamConnectionsResultAws;
import com.pulumi.mongodbatlas.outputs.GetStreamConnectionsResultDbRoleToExecute;
import com.pulumi.mongodbatlas.outputs.GetStreamConnectionsResultNetworking;
import com.pulumi.mongodbatlas.outputs.GetStreamConnectionsResultSecurity;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetStreamConnectionsResult {
    /**
     * @return User credentials required to connect to a Kafka cluster. Includes the authentication type, as well as the parameters for that authentication mode. See authentication.
     * 
     */
    private GetStreamConnectionsResultAuthentication authentication;
    /**
     * @return The configuration for AWS Lambda connection. See AWS
     * 
     */
    private GetStreamConnectionsResultAws aws;
    /**
     * @return Comma separated list of server addresses.
     * 
     */
    private String bootstrapServers;
    /**
     * @return Name of the cluster configured for this connection.
     * 
     */
    private String clusterName;
    /**
     * @return A map of Kafka key-value pairs for optional configuration. This is a flat object, and keys can have &#39;.&#39; characters.
     * 
     */
    private Map<String,String> config;
    /**
     * @return Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     * 
     */
    private String connectionName;
    /**
     * @return The name of a Built in or Custom DB Role to connect to an Atlas Cluster. See DBRoleToExecute.
     * 
     */
    private GetStreamConnectionsResultDbRoleToExecute dbRoleToExecute;
    /**
     * @return A map of key-value pairs for optional headers.
     * 
     */
    private Map<String,String> headers;
    private String id;
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    private String instanceName;
    /**
     * @return Networking Access Type can either be `PUBLIC` (default) or `VPC`. See networking.
     * 
     */
    private GetStreamConnectionsResultNetworking networking;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    private String projectId;
    /**
     * @return Properties for the secure transport connection to Kafka. For SSL, this can include the trusted certificate to use. See security.
     * 
     */
    private GetStreamConnectionsResultSecurity security;
    /**
     * @return Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
     * 
     */
    private String type;
    /**
     * @return URL of the HTTPs endpoint that will be used for creating a connection.
     * 
     */
    private String url;

    private GetStreamConnectionsResult() {}
    /**
     * @return User credentials required to connect to a Kafka cluster. Includes the authentication type, as well as the parameters for that authentication mode. See authentication.
     * 
     */
    public GetStreamConnectionsResultAuthentication authentication() {
        return this.authentication;
    }
    /**
     * @return The configuration for AWS Lambda connection. See AWS
     * 
     */
    public GetStreamConnectionsResultAws aws() {
        return this.aws;
    }
    /**
     * @return Comma separated list of server addresses.
     * 
     */
    public String bootstrapServers() {
        return this.bootstrapServers;
    }
    /**
     * @return Name of the cluster configured for this connection.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return A map of Kafka key-value pairs for optional configuration. This is a flat object, and keys can have &#39;.&#39; characters.
     * 
     */
    public Map<String,String> config() {
        return this.config;
    }
    /**
     * @return Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }
    /**
     * @return The name of a Built in or Custom DB Role to connect to an Atlas Cluster. See DBRoleToExecute.
     * 
     */
    public GetStreamConnectionsResultDbRoleToExecute dbRoleToExecute() {
        return this.dbRoleToExecute;
    }
    /**
     * @return A map of key-value pairs for optional headers.
     * 
     */
    public Map<String,String> headers() {
        return this.headers;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Networking Access Type can either be `PUBLIC` (default) or `VPC`. See networking.
     * 
     */
    public GetStreamConnectionsResultNetworking networking() {
        return this.networking;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Properties for the secure transport connection to Kafka. For SSL, this can include the trusted certificate to use. See security.
     * 
     */
    public GetStreamConnectionsResultSecurity security() {
        return this.security;
    }
    /**
     * @return Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return URL of the HTTPs endpoint that will be used for creating a connection.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamConnectionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetStreamConnectionsResultAuthentication authentication;
        private GetStreamConnectionsResultAws aws;
        private String bootstrapServers;
        private String clusterName;
        private Map<String,String> config;
        private String connectionName;
        private GetStreamConnectionsResultDbRoleToExecute dbRoleToExecute;
        private Map<String,String> headers;
        private String id;
        private String instanceName;
        private GetStreamConnectionsResultNetworking networking;
        private String projectId;
        private GetStreamConnectionsResultSecurity security;
        private String type;
        private String url;
        public Builder() {}
        public Builder(GetStreamConnectionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.aws = defaults.aws;
    	      this.bootstrapServers = defaults.bootstrapServers;
    	      this.clusterName = defaults.clusterName;
    	      this.config = defaults.config;
    	      this.connectionName = defaults.connectionName;
    	      this.dbRoleToExecute = defaults.dbRoleToExecute;
    	      this.headers = defaults.headers;
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.networking = defaults.networking;
    	      this.projectId = defaults.projectId;
    	      this.security = defaults.security;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder authentication(GetStreamConnectionsResultAuthentication authentication) {
            if (authentication == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "authentication");
            }
            this.authentication = authentication;
            return this;
        }
        @CustomType.Setter
        public Builder aws(GetStreamConnectionsResultAws aws) {
            if (aws == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "aws");
            }
            this.aws = aws;
            return this;
        }
        @CustomType.Setter
        public Builder bootstrapServers(String bootstrapServers) {
            if (bootstrapServers == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "bootstrapServers");
            }
            this.bootstrapServers = bootstrapServers;
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            if (clusterName == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "clusterName");
            }
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder config(Map<String,String> config) {
            if (config == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "config");
            }
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder connectionName(String connectionName) {
            if (connectionName == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "connectionName");
            }
            this.connectionName = connectionName;
            return this;
        }
        @CustomType.Setter
        public Builder dbRoleToExecute(GetStreamConnectionsResultDbRoleToExecute dbRoleToExecute) {
            if (dbRoleToExecute == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "dbRoleToExecute");
            }
            this.dbRoleToExecute = dbRoleToExecute;
            return this;
        }
        @CustomType.Setter
        public Builder headers(Map<String,String> headers) {
            if (headers == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "headers");
            }
            this.headers = headers;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder networking(GetStreamConnectionsResultNetworking networking) {
            if (networking == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "networking");
            }
            this.networking = networking;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder security(GetStreamConnectionsResultSecurity security) {
            if (security == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "security");
            }
            this.security = security;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetStreamConnectionsResult", "url");
            }
            this.url = url;
            return this;
        }
        public GetStreamConnectionsResult build() {
            final var _resultValue = new GetStreamConnectionsResult();
            _resultValue.authentication = authentication;
            _resultValue.aws = aws;
            _resultValue.bootstrapServers = bootstrapServers;
            _resultValue.clusterName = clusterName;
            _resultValue.config = config;
            _resultValue.connectionName = connectionName;
            _resultValue.dbRoleToExecute = dbRoleToExecute;
            _resultValue.headers = headers;
            _resultValue.id = id;
            _resultValue.instanceName = instanceName;
            _resultValue.networking = networking;
            _resultValue.projectId = projectId;
            _resultValue.security = security;
            _resultValue.type = type;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
