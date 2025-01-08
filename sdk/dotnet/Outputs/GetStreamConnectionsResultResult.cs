// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// Comma separated list of server addresses.
        /// </summary>
        public readonly string BootstrapServers;
        /// <summary>
        /// Name of the cluster configured for this connection.
        /// </summary>
        public readonly string ClusterName;
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
        /// Properties for the secure transport connection to Kafka. For SSL, this can include the trusted certificate to use. See security.
        /// </summary>
        public readonly Outputs.GetStreamConnectionsResultSecurityResult Security;
        /// <summary>
        /// Networking type. Either `PUBLIC` or `VPC`. Default is `PUBLIC`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetStreamConnectionsResultResult(
            Outputs.GetStreamConnectionsResultAuthenticationResult authentication,

            string bootstrapServers,

            string clusterName,

            ImmutableDictionary<string, string> config,

            string connectionName,

            Outputs.GetStreamConnectionsResultDbRoleToExecuteResult dbRoleToExecute,

            string id,

            string instanceName,

            Outputs.GetStreamConnectionsResultNetworkingResult networking,

            string projectId,

            Outputs.GetStreamConnectionsResultSecurityResult security,

            string type)
        {
            Authentication = authentication;
            BootstrapServers = bootstrapServers;
            ClusterName = clusterName;
            Config = config;
            ConnectionName = connectionName;
            DbRoleToExecute = dbRoleToExecute;
            Id = id;
            InstanceName = instanceName;
            Networking = networking;
            ProjectId = projectId;
            Security = security;
            Type = type;
        }
    }
}
