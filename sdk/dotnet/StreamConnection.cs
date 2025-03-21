// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// ## # Resource: mongodbatlas.StreamConnection
    /// 
    /// `mongodbatlas.StreamConnection` provides a Stream Connection resource. The resource lets you create, edit, and delete stream instance connections.
    /// 
    /// &gt; **IMPORTANT:** All arguments including the Kafka authentication password will be stored in the raw state as plaintext. Read more about sensitive data in state.
    /// 
    /// ## Example Usage
    /// 
    /// ### Example Cluster Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.StreamConnection("test", new()
    ///     {
    ///         ProjectId = projectId,
    ///         InstanceName = "InstanceName",
    ///         ConnectionName = "ConnectionName",
    ///         Type = "Cluster",
    ///         ClusterName = "Cluster0",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Kafka Plaintext Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.StreamConnection("test", new()
    ///     {
    ///         ProjectId = projectId,
    ///         InstanceName = "NewInstance",
    ///         ConnectionName = "KafkaConnection",
    ///         Type = "Kafka",
    ///         Authentication = new Mongodbatlas.Inputs.StreamConnectionAuthenticationArgs
    ///         {
    ///             Mechanism = "SCRAM-256",
    ///             Username = "user",
    ///             Password = "somepassword",
    ///         },
    ///         Security = new Mongodbatlas.Inputs.StreamConnectionSecurityArgs
    ///         {
    ///             Protocol = "PLAINTEXT",
    ///         },
    ///         Config = 
    ///         {
    ///             { "auto.offset.reset", "latest" },
    ///         },
    ///         BootstrapServers = "localhost:9091,localhost:9092",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example Https Connection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example_https = new Mongodbatlas.StreamConnection("example-https", new()
    ///     {
    ///         ProjectId = projectId,
    ///         InstanceName = example.InstanceName,
    ///         ConnectionName = "https_connection_tf_new",
    ///         Type = "Https",
    ///         Url = "https://example.com",
    ///         Headers = 
    ///         {
    ///             { "key1", "value1" },
    ///             { "key2", "value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// You can import a stream connection resource using the instance name, project ID, and connection name. The format must be `INSTANCE_NAME-PROJECT_ID-CONNECTION_NAME`. For example:
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/streamConnection:StreamConnection test "DefaultInstance-12251446ae5f3f6ec7968b13-NewConnection"
    /// ```
    /// To learn more, see: [MongoDB Atlas API - Stream Connection](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamConnection) Documentation.
    /// The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/streamConnection:StreamConnection")]
    public partial class StreamConnection : global::Pulumi.CustomResource
    {
        [Output("authentication")]
        public Output<Outputs.StreamConnectionAuthentication?> Authentication { get; private set; } = null!;

        [Output("aws")]
        public Output<Outputs.StreamConnectionAws?> Aws { get; private set; } = null!;

        [Output("bootstrapServers")]
        public Output<string?> BootstrapServers { get; private set; } = null!;

        [Output("clusterName")]
        public Output<string?> ClusterName { get; private set; } = null!;

        [Output("config")]
        public Output<ImmutableDictionary<string, string>?> Config { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
        /// </summary>
        [Output("connectionName")]
        public Output<string> ConnectionName { get; private set; } = null!;

        [Output("dbRoleToExecute")]
        public Output<Outputs.StreamConnectionDbRoleToExecute?> DbRoleToExecute { get; private set; } = null!;

        [Output("headers")]
        public Output<ImmutableDictionary<string, string>?> Headers { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        [Output("networking")]
        public Output<Outputs.StreamConnectionNetworking> Networking { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        [Output("security")]
        public Output<Outputs.StreamConnectionSecurity?> Security { get; private set; } = null!;

        /// <summary>
        /// Type of connection. Can be `AWSLambda`, `Cluster`, `Https`, `Kafka` or `Sample`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        [Output("url")]
        public Output<string?> Url { get; private set; } = null!;


        /// <summary>
        /// Create a StreamConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StreamConnection(string name, StreamConnectionArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/streamConnection:StreamConnection", name, args ?? new StreamConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StreamConnection(string name, Input<string> id, StreamConnectionState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/streamConnection:StreamConnection", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing StreamConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StreamConnection Get(string name, Input<string> id, StreamConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new StreamConnection(name, id, state, options);
        }
    }

    public sealed class StreamConnectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.StreamConnectionAuthenticationArgs>? Authentication { get; set; }

        [Input("aws")]
        public Input<Inputs.StreamConnectionAwsArgs>? Aws { get; set; }

        [Input("bootstrapServers")]
        public Input<string>? BootstrapServers { get; set; }

        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("config")]
        private InputMap<string>? _config;
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
        /// </summary>
        [Input("connectionName", required: true)]
        public Input<string> ConnectionName { get; set; } = null!;

        [Input("dbRoleToExecute")]
        public Input<Inputs.StreamConnectionDbRoleToExecuteArgs>? DbRoleToExecute { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        [Input("networking")]
        public Input<Inputs.StreamConnectionNetworkingArgs>? Networking { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("security")]
        public Input<Inputs.StreamConnectionSecurityArgs>? Security { get; set; }

        /// <summary>
        /// Type of connection. Can be `AWSLambda`, `Cluster`, `Https`, `Kafka` or `Sample`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("url")]
        public Input<string>? Url { get; set; }

        public StreamConnectionArgs()
        {
        }
        public static new StreamConnectionArgs Empty => new StreamConnectionArgs();
    }

    public sealed class StreamConnectionState : global::Pulumi.ResourceArgs
    {
        [Input("authentication")]
        public Input<Inputs.StreamConnectionAuthenticationGetArgs>? Authentication { get; set; }

        [Input("aws")]
        public Input<Inputs.StreamConnectionAwsGetArgs>? Aws { get; set; }

        [Input("bootstrapServers")]
        public Input<string>? BootstrapServers { get; set; }

        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("config")]
        private InputMap<string>? _config;
        public InputMap<string> Config
        {
            get => _config ?? (_config = new InputMap<string>());
            set => _config = value;
        }

        /// <summary>
        /// Human-readable label that identifies the stream connection. In the case of the Sample type, this is the name of the sample source.
        /// </summary>
        [Input("connectionName")]
        public Input<string>? ConnectionName { get; set; }

        [Input("dbRoleToExecute")]
        public Input<Inputs.StreamConnectionDbRoleToExecuteGetArgs>? DbRoleToExecute { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        [Input("networking")]
        public Input<Inputs.StreamConnectionNetworkingGetArgs>? Networking { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("security")]
        public Input<Inputs.StreamConnectionSecurityGetArgs>? Security { get; set; }

        /// <summary>
        /// Type of connection. Can be `AWSLambda`, `Cluster`, `Https`, `Kafka` or `Sample`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public StreamConnectionState()
        {
        }
        public static new StreamConnectionState Empty => new StreamConnectionState();
    }
}
