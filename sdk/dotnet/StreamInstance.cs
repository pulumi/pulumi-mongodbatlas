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
    /// `mongodbatlas.StreamInstance` provides a Stream Instance resource. The resource lets you create, edit, and delete stream instances in a project.
    /// 
    /// ## Import
    /// 
    /// You can import stream instance resource using the project ID and instance name, in the format `PROJECT_ID-INSTANCE_NAME`. For example:
    /// 
    /// ```sh
    /// $ pulumi import mongodbatlas:index/streamInstance:StreamInstance test 650972848269185c55f40ca1-InstanceName
    /// ```
    /// To learn more, see: [MongoDB Atlas API - Stream Instance](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) Documentation.
    /// The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/streamInstance:StreamInstance")]
    public partial class StreamInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        /// </summary>
        [Output("dataProcessRegion")]
        public Output<Outputs.StreamInstanceDataProcessRegion> DataProcessRegion { get; private set; } = null!;

        /// <summary>
        /// List that contains the hostnames assigned to the stream instance.
        /// </summary>
        [Output("hostnames")]
        public Output<ImmutableArray<string>> Hostnames { get; private set; } = null!;

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Output("instanceName")]
        public Output<string> InstanceName { get; private set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Configuration options for an Atlas Stream Processing Instance. See stream config
        /// </summary>
        [Output("streamConfig")]
        public Output<Outputs.StreamInstanceStreamConfig> StreamConfig { get; private set; } = null!;


        /// <summary>
        /// Create a StreamInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StreamInstance(string name, StreamInstanceArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/streamInstance:StreamInstance", name, args ?? new StreamInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StreamInstance(string name, Input<string> id, StreamInstanceState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/streamInstance:StreamInstance", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StreamInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StreamInstance Get(string name, Input<string> id, StreamInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new StreamInstance(name, id, state, options);
        }
    }

    public sealed class StreamInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        /// </summary>
        [Input("dataProcessRegion", required: true)]
        public Input<Inputs.StreamInstanceDataProcessRegionArgs> DataProcessRegion { get; set; } = null!;

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

        /// <summary>
        /// Configuration options for an Atlas Stream Processing Instance. See stream config
        /// </summary>
        [Input("streamConfig")]
        public Input<Inputs.StreamInstanceStreamConfigArgs>? StreamConfig { get; set; }

        public StreamInstanceArgs()
        {
        }
        public static new StreamInstanceArgs Empty => new StreamInstanceArgs();
    }

    public sealed class StreamInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        /// </summary>
        [Input("dataProcessRegion")]
        public Input<Inputs.StreamInstanceDataProcessRegionGetArgs>? DataProcessRegion { get; set; }

        [Input("hostnames")]
        private InputList<string>? _hostnames;

        /// <summary>
        /// List that contains the hostnames assigned to the stream instance.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        /// <summary>
        /// Human-readable label that identifies the stream instance.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies your project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Configuration options for an Atlas Stream Processing Instance. See stream config
        /// </summary>
        [Input("streamConfig")]
        public Input<Inputs.StreamInstanceStreamConfigGetArgs>? StreamConfig { get; set; }

        public StreamInstanceState()
        {
        }
        public static new StreamInstanceState Empty => new StreamInstanceState();
    }
}
