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
    /// `mongodbatlas.ServerlessInstance` provides a Serverless Instance resource. This allows serverless instances to be created.
    /// 
    /// &gt; **NOTE:**  Serverless instances do not support some Atlas features at this time.
    /// For a full list of unsupported features, see [Serverless Instance Limitations](https://docs.atlas.mongodb.com/reference/serverless-instance-limitations/).
    /// 
    /// ## Example Usage
    /// ### Basic
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.ServerlessInstance("test", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT_ID&gt;",
    ///         ProviderSettingsBackingProviderName = "AWS",
    ///         ProviderSettingsProviderName = "SERVERLESS",
    ///         ProviderSettingsRegionName = "US_EAST_1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Serverless Instance can be imported using the group ID and serverless instance name, in the format `GROUP_ID-SERVERLESS_INSTANCE_NAME`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/serverlessInstance:ServerlessInstance my_serverless_instance 1112222b3bf99403840e8934-My Serverless Instance
    /// ```
    /// 
    ///  For more information see[MongoDB Atlas API - Serverless Instance](https://docs.atlas.mongodb.com/reference/api/serverless-instances/) Documentation.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/serverlessInstance:ServerlessInstance")]
    public partial class ServerlessInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
        /// </summary>
        [Output("connectionStringsStandardSrv")]
        public Output<string> ConnectionStringsStandardSrv { get; private set; } = null!;

        /// <summary>
        /// Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
        /// </summary>
        [Output("createDate")]
        public Output<string> CreateDate { get; private set; } = null!;

        [Output("links")]
        public Output<ImmutableArray<Outputs.ServerlessInstanceLink>> Links { get; private set; } = null!;

        /// <summary>
        /// Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
        /// </summary>
        [Output("mongoDbVersion")]
        public Output<string> MongoDbVersion { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the serverless instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the organization or project you want to create the serverless instance within.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
        /// </summary>
        [Output("providerSettingsBackingProviderName")]
        public Output<string> ProviderSettingsBackingProviderName { get; private set; } = null!;

        /// <summary>
        /// Cloud service provider that applies to the provisioned the serverless instance.
        /// </summary>
        [Output("providerSettingsProviderName")]
        public Output<string> ProviderSettingsProviderName { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
        /// </summary>
        [Output("providerSettingsRegionName")]
        public Output<string> ProviderSettingsRegionName { get; private set; } = null!;

        /// <summary>
        /// Stage of deployment of this serverless instance when the resource made its request.
        /// </summary>
        [Output("stateName")]
        public Output<string> StateName { get; private set; } = null!;


        /// <summary>
        /// Create a ServerlessInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServerlessInstance(string name, ServerlessInstanceArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/serverlessInstance:ServerlessInstance", name, args ?? new ServerlessInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServerlessInstance(string name, Input<string> id, ServerlessInstanceState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/serverlessInstance:ServerlessInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServerlessInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServerlessInstance Get(string name, Input<string> id, ServerlessInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new ServerlessInstance(name, id, state, options);
        }
    }

    public sealed class ServerlessInstanceArgs : global::Pulumi.ResourceArgs
    {
        [Input("links")]
        private InputList<Inputs.ServerlessInstanceLinkArgs>? _links;
        public InputList<Inputs.ServerlessInstanceLinkArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.ServerlessInstanceLinkArgs>());
            set => _links = value;
        }

        /// <summary>
        /// Human-readable label that identifies the serverless instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization or project you want to create the serverless instance within.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
        /// </summary>
        [Input("providerSettingsBackingProviderName", required: true)]
        public Input<string> ProviderSettingsBackingProviderName { get; set; } = null!;

        /// <summary>
        /// Cloud service provider that applies to the provisioned the serverless instance.
        /// </summary>
        [Input("providerSettingsProviderName", required: true)]
        public Input<string> ProviderSettingsProviderName { get; set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
        /// </summary>
        [Input("providerSettingsRegionName", required: true)]
        public Input<string> ProviderSettingsRegionName { get; set; } = null!;

        /// <summary>
        /// Stage of deployment of this serverless instance when the resource made its request.
        /// </summary>
        [Input("stateName")]
        public Input<string>? StateName { get; set; }

        public ServerlessInstanceArgs()
        {
        }
        public static new ServerlessInstanceArgs Empty => new ServerlessInstanceArgs();
    }

    public sealed class ServerlessInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
        /// </summary>
        [Input("connectionStringsStandardSrv")]
        public Input<string>? ConnectionStringsStandardSrv { get; set; }

        /// <summary>
        /// Timestamp that indicates when MongoDB Cloud created the serverless instance. The timestamp displays in the ISO 8601 date and time format in UTC.
        /// </summary>
        [Input("createDate")]
        public Input<string>? CreateDate { get; set; }

        [Input("links")]
        private InputList<Inputs.ServerlessInstanceLinkGetArgs>? _links;
        public InputList<Inputs.ServerlessInstanceLinkGetArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.ServerlessInstanceLinkGetArgs>());
            set => _links = value;
        }

        /// <summary>
        /// Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
        /// </summary>
        [Input("mongoDbVersion")]
        public Input<string>? MongoDbVersion { get; set; }

        /// <summary>
        /// Human-readable label that identifies the serverless instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the organization or project you want to create the serverless instance within.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
        /// </summary>
        [Input("providerSettingsBackingProviderName")]
        public Input<string>? ProviderSettingsBackingProviderName { get; set; }

        /// <summary>
        /// Cloud service provider that applies to the provisioned the serverless instance.
        /// </summary>
        [Input("providerSettingsProviderName")]
        public Input<string>? ProviderSettingsProviderName { get; set; }

        /// <summary>
        /// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
        /// </summary>
        [Input("providerSettingsRegionName")]
        public Input<string>? ProviderSettingsRegionName { get; set; }

        /// <summary>
        /// Stage of deployment of this serverless instance when the resource made its request.
        /// </summary>
        [Input("stateName")]
        public Input<string>? StateName { get; set; }

        public ServerlessInstanceState()
        {
        }
        public static new ServerlessInstanceState Empty => new ServerlessInstanceState();
    }
}
