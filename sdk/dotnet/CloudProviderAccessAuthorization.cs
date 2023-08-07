// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    [MongodbatlasResourceType("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization")]
    public partial class CloudProviderAccessAuthorization : global::Pulumi.CustomResource
    {
        [Output("authorizedDate")]
        public Output<string> AuthorizedDate { get; private set; } = null!;

        [Output("aws")]
        public Output<Outputs.CloudProviderAccessAuthorizationAws?> Aws { get; private set; } = null!;

        [Output("azure")]
        public Output<Outputs.CloudProviderAccessAuthorizationAzure?> Azure { get; private set; } = null!;

        [Output("featureUsages")]
        public Output<ImmutableArray<Outputs.CloudProviderAccessAuthorizationFeatureUsage>> FeatureUsages { get; private set; } = null!;

        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        [Output("roleId")]
        public Output<string> RoleId { get; private set; } = null!;


        /// <summary>
        /// Create a CloudProviderAccessAuthorization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudProviderAccessAuthorization(string name, CloudProviderAccessAuthorizationArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization", name, args ?? new CloudProviderAccessAuthorizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudProviderAccessAuthorization(string name, Input<string> id, CloudProviderAccessAuthorizationState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudProviderAccessAuthorization:CloudProviderAccessAuthorization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CloudProviderAccessAuthorization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudProviderAccessAuthorization Get(string name, Input<string> id, CloudProviderAccessAuthorizationState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudProviderAccessAuthorization(name, id, state, options);
        }
    }

    public sealed class CloudProviderAccessAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        public Input<Inputs.CloudProviderAccessAuthorizationAwsArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.CloudProviderAccessAuthorizationAzureArgs>? Azure { get; set; }

        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public CloudProviderAccessAuthorizationArgs()
        {
        }
        public static new CloudProviderAccessAuthorizationArgs Empty => new CloudProviderAccessAuthorizationArgs();
    }

    public sealed class CloudProviderAccessAuthorizationState : global::Pulumi.ResourceArgs
    {
        [Input("authorizedDate")]
        public Input<string>? AuthorizedDate { get; set; }

        [Input("aws")]
        public Input<Inputs.CloudProviderAccessAuthorizationAwsGetArgs>? Aws { get; set; }

        [Input("azure")]
        public Input<Inputs.CloudProviderAccessAuthorizationAzureGetArgs>? Azure { get; set; }

        [Input("featureUsages")]
        private InputList<Inputs.CloudProviderAccessAuthorizationFeatureUsageGetArgs>? _featureUsages;
        public InputList<Inputs.CloudProviderAccessAuthorizationFeatureUsageGetArgs> FeatureUsages
        {
            get => _featureUsages ?? (_featureUsages = new InputList<Inputs.CloudProviderAccessAuthorizationFeatureUsageGetArgs>());
            set => _featureUsages = value;
        }

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("roleId")]
        public Input<string>? RoleId { get; set; }

        public CloudProviderAccessAuthorizationState()
        {
        }
        public static new CloudProviderAccessAuthorizationState Empty => new CloudProviderAccessAuthorizationState();
    }
}
