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
    /// ## Import
    /// 
    /// The Cloud Provider Access resource can be imported using project ID and the provider name and mongodbatlas role id, in the format `project_id`-`provider_name`-`role_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/cloudProviderAccess:CloudProviderAccess my_role 1112222b3bf99403840e8934-AWS-5fc17d476f7a33224f5b224e
    /// ```
    /// 
    ///  See [MongoDB Atlas API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-create-one-role/) Documentation for more information.
    /// </summary>
    public partial class CloudProviderAccess : Pulumi.CustomResource
    {
        /// <summary>
        /// Unique external ID Atlas uses when assuming the IAM role in your AWS account.
        /// </summary>
        [Output("atlasAssumedRoleExternalId")]
        public Output<string> AtlasAssumedRoleExternalId { get; private set; } = null!;

        /// <summary>
        /// ARN associated with the Atlas AWS account used to assume IAM roles in your AWS account.
        /// </summary>
        [Output("atlasAwsAccountArn")]
        public Output<string> AtlasAwsAccountArn { get; private set; } = null!;

        /// <summary>
        /// Date on which this role was authorized.
        /// </summary>
        [Output("authorizedDate")]
        public Output<string> AuthorizedDate { get; private set; } = null!;

        /// <summary>
        /// Date on which this role was created.
        /// </summary>
        [Output("createdDate")]
        public Output<string> CreatedDate { get; private set; } = null!;

        /// <summary>
        /// Atlas features this AWS IAM role is linked to.
        /// </summary>
        [Output("featureUsages")]
        public Output<ImmutableArray<Outputs.CloudProviderAccessFeatureUsage>> FeatureUsages { get; private set; } = null!;

        /// <summary>
        /// - ARN of the IAM Role that Atlas assumes when accessing resources in your AWS account. This value is required after the creation (register of the role) as part of [Set Up Unified AWS Access](https://docs.atlas.mongodb.com/security/set-up-unified-aws-access/#set-up-unified-aws-access).
        /// </summary>
        [Output("iamAssumedRoleArn")]
        public Output<string?> IamAssumedRoleArn { get; private set; } = null!;

        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The cloud provider for which to create a new role. Currently only AWS is supported.
        /// </summary>
        [Output("providerName")]
        public Output<string> ProviderName { get; private set; } = null!;

        /// <summary>
        /// Unique ID of this role.
        /// </summary>
        [Output("roleId")]
        public Output<string> RoleId { get; private set; } = null!;


        /// <summary>
        /// Create a CloudProviderAccess resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudProviderAccess(string name, CloudProviderAccessArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudProviderAccess:CloudProviderAccess", name, args ?? new CloudProviderAccessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudProviderAccess(string name, Input<string> id, CloudProviderAccessState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/cloudProviderAccess:CloudProviderAccess", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CloudProviderAccess resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudProviderAccess Get(string name, Input<string> id, CloudProviderAccessState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudProviderAccess(name, id, state, options);
        }
    }

    public sealed class CloudProviderAccessArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// - ARN of the IAM Role that Atlas assumes when accessing resources in your AWS account. This value is required after the creation (register of the role) as part of [Set Up Unified AWS Access](https://docs.atlas.mongodb.com/security/set-up-unified-aws-access/#set-up-unified-aws-access).
        /// </summary>
        [Input("iamAssumedRoleArn")]
        public Input<string>? IamAssumedRoleArn { get; set; }

        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The cloud provider for which to create a new role. Currently only AWS is supported.
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        public CloudProviderAccessArgs()
        {
        }
    }

    public sealed class CloudProviderAccessState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique external ID Atlas uses when assuming the IAM role in your AWS account.
        /// </summary>
        [Input("atlasAssumedRoleExternalId")]
        public Input<string>? AtlasAssumedRoleExternalId { get; set; }

        /// <summary>
        /// ARN associated with the Atlas AWS account used to assume IAM roles in your AWS account.
        /// </summary>
        [Input("atlasAwsAccountArn")]
        public Input<string>? AtlasAwsAccountArn { get; set; }

        /// <summary>
        /// Date on which this role was authorized.
        /// </summary>
        [Input("authorizedDate")]
        public Input<string>? AuthorizedDate { get; set; }

        /// <summary>
        /// Date on which this role was created.
        /// </summary>
        [Input("createdDate")]
        public Input<string>? CreatedDate { get; set; }

        [Input("featureUsages")]
        private InputList<Inputs.CloudProviderAccessFeatureUsageGetArgs>? _featureUsages;

        /// <summary>
        /// Atlas features this AWS IAM role is linked to.
        /// </summary>
        public InputList<Inputs.CloudProviderAccessFeatureUsageGetArgs> FeatureUsages
        {
            get => _featureUsages ?? (_featureUsages = new InputList<Inputs.CloudProviderAccessFeatureUsageGetArgs>());
            set => _featureUsages = value;
        }

        /// <summary>
        /// - ARN of the IAM Role that Atlas assumes when accessing resources in your AWS account. This value is required after the creation (register of the role) as part of [Set Up Unified AWS Access](https://docs.atlas.mongodb.com/security/set-up-unified-aws-access/#set-up-unified-aws-access).
        /// </summary>
        [Input("iamAssumedRoleArn")]
        public Input<string>? IamAssumedRoleArn { get; set; }

        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The cloud provider for which to create a new role. Currently only AWS is supported.
        /// </summary>
        [Input("providerName")]
        public Input<string>? ProviderName { get; set; }

        /// <summary>
        /// Unique ID of this role.
        /// </summary>
        [Input("roleId")]
        public Input<string>? RoleId { get; set; }

        public CloudProviderAccessState()
        {
        }
    }
}
