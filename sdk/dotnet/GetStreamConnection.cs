// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetStreamConnection
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.StreamConnection
        /// 
        /// `mongodbatlas.StreamConnection` describes a stream connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Mongodbatlas.GetStreamConnection.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "&lt;INSTANCE_NAME&gt;",
        ///         ConnectionName = "&lt;CONNECTION_NAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetStreamConnectionResult> InvokeAsync(GetStreamConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStreamConnectionResult>("mongodbatlas:index/getStreamConnection:getStreamConnection", args ?? new GetStreamConnectionArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.StreamConnection
        /// 
        /// `mongodbatlas.StreamConnection` describes a stream connection.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Mongodbatlas.GetStreamConnection.Invoke(new()
        ///     {
        ///         ProjectId = "&lt;PROJECT_ID&gt;",
        ///         InstanceName = "&lt;INSTANCE_NAME&gt;",
        ///         ConnectionName = "&lt;CONNECTION_NAME&gt;",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetStreamConnectionResult> Invoke(GetStreamConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStreamConnectionResult>("mongodbatlas:index/getStreamConnection:getStreamConnection", args ?? new GetStreamConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStreamConnectionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
        /// </summary>
        [Input("connectionName", required: true)]
        public string ConnectionName { get; set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public string InstanceName { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetStreamConnectionArgs()
        {
        }
        public static new GetStreamConnectionArgs Empty => new GetStreamConnectionArgs();
    }

    public sealed class GetStreamConnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
        /// </summary>
        [Input("connectionName", required: true)]
        public Input<string> ConnectionName { get; set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetStreamConnectionInvokeArgs()
        {
        }
        public static new GetStreamConnectionInvokeArgs Empty => new GetStreamConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetStreamConnectionResult
    {
        /// <summary>
        /// User credentials required to connect to a Kafka cluster. Includes the authentication type, as well as the parameters for that authentication mode. See authentication.
        /// </summary>
        public readonly Outputs.GetStreamConnectionAuthenticationResult Authentication;
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
        public readonly string ConnectionName;
        /// <summary>
        /// The name of a Built in or Custom DB Role to connect to an Atlas Cluster. See DBRoleToExecute.
        /// </summary>
        public readonly Outputs.GetStreamConnectionDbRoleToExecuteResult DbRoleToExecute;
        public readonly string Id;
        public readonly string InstanceName;
        public readonly string ProjectId;
        /// <summary>
        /// Properties for the secure transport connection to Kafka. For SSL, this can include the trusted certificate to use. See security.
        /// </summary>
        public readonly Outputs.GetStreamConnectionSecurityResult Security;
        /// <summary>
        /// Type of the DB role. Can be either BUILT_IN or CUSTOM.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetStreamConnectionResult(
            Outputs.GetStreamConnectionAuthenticationResult authentication,

            string bootstrapServers,

            string clusterName,

            ImmutableDictionary<string, string> config,

            string connectionName,

            Outputs.GetStreamConnectionDbRoleToExecuteResult dbRoleToExecute,

            string id,

            string instanceName,

            string projectId,

            Outputs.GetStreamConnectionSecurityResult security,

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
            ProjectId = projectId;
            Security = security;
            Type = type;
        }
    }
}