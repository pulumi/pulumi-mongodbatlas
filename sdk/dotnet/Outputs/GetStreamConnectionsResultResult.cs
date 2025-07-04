// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetStreamConnectionsResultResult
    {
        /// <summary>
        /// User credentials required to connect to a Kafka cluster. Includes the authentication type, as well as the parameters for that authentication mode. See authentication.
        /// </summary>
        public readonly Outputs.GetStreamConnectionsResultAuthenticationResult Authentication;
        /// <summary>
        /// The configuration for AWS Lambda connection. See AWS
        /// </summary>
        public readonly Outputs.GetStreamConnectionsResultAwsResult Aws;
        /// <summary>
        /// Comma separated list of server addresses.
        /// </summary>
        public readonly string BootstrapServers;
        /// <summary>
        /// Name of the cluster configured for this connection.
        /// </summary>
        public readonly string ClusterName;
        public readonly string ClusterProjectId;
        /// <summary>
        /// A map of Kafka key-value pairs for optional configuration. This is a flat object, and keys can have '.' characters.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Config;
        /// <summary>
        /// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
        /// </summary>
        public readonly string ConnectionName;
        /// <summary>
        /// The name of a Built in or Custom DB Role to connect to an Atlas Cluster. See DBRoleToExecute.
        /// </summary>
        public readonly Outputs.GetStreamConnectionsResultDbRoleToExecuteResult DbRoleToExecute;
        /// <summary>
        /// A map of key-value pairs for optional headers.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Headers;
        public readonly string Id;
        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        public readonly string InstanceName;
        /// <summary>
        /// Networking Access Type can either be `PUBLIC` (default) or `VPC`. See networking.
        /// </summary>
        public readonly Outputs.GetStreamConnectionsResultNetworkingResult Networking;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Properties for the secure transport connection to Kafka. For SASL_SSL, this can include the trusted certificate to use. See security.
        /// </summary>
        public readonly Outputs.GetStreamConnectionsResultSecurityResult Security;
        /// <summary>
        /// Selected networking type. Either `PUBLIC`, `VPC` or `PRIVATE_LINK`. Defaults to `PUBLIC`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// URL of the HTTPs endpoint that will be used for creating a connection.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetStreamConnectionsResultResult(
            Outputs.GetStreamConnectionsResultAuthenticationResult authentication,

            Outputs.GetStreamConnectionsResultAwsResult aws,

            string bootstrapServers,

            string clusterName,

            string clusterProjectId,

            ImmutableDictionary<string, string> config,

            string connectionName,

            Outputs.GetStreamConnectionsResultDbRoleToExecuteResult dbRoleToExecute,

            ImmutableDictionary<string, string> headers,

            string id,

            string instanceName,

            Outputs.GetStreamConnectionsResultNetworkingResult networking,

            string projectId,

            Outputs.GetStreamConnectionsResultSecurityResult security,

            string type,

            string url)
        {
            Authentication = authentication;
            Aws = aws;
            BootstrapServers = bootstrapServers;
            ClusterName = clusterName;
            ClusterProjectId = clusterProjectId;
            Config = config;
            ConnectionName = connectionName;
            DbRoleToExecute = dbRoleToExecute;
            Headers = headers;
            Id = id;
            InstanceName = instanceName;
            Networking = networking;
            ProjectId = projectId;
            Security = security;
            Type = type;
            Url = url;
        }
    }
}
