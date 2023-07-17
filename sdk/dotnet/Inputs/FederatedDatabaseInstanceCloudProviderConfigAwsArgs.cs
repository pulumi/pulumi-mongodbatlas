// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceCloudProviderConfigAwsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier associated with the IAM Role that the Federated Database Instance assumes when accessing the data stores.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the IAM Role that the Federated Database Instance assumes when accessing S3 Bucket data stores. The IAM Role must support the following actions against each S3 bucket:
        /// * `s3:GetObject`
        /// * `s3:ListBucket`
        /// * `s3:GetObjectVersion`
        /// </summary>
        [Input("iamAssumedRoleArn")]
        public Input<string>? IamAssumedRoleArn { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the user that the Federated Database Instance assumes when accessing S3 Bucket data stores.
        /// </summary>
        [Input("iamUserArn")]
        public Input<string>? IamUserArn { get; set; }

        /// <summary>
        /// Unique identifier of the role that the Federated Instance can use to access the data stores. If necessary, use the Atlas [UI](https://docs.atlas.mongodb.com/security/manage-iam-roles/) or [API](https://docs.atlas.mongodb.com/reference/api/cloud-provider-access-get-roles/) to retrieve the role ID. You must also specify the `test_s3_bucket`.
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        /// <summary>
        /// Name of the S3 data bucket that the provided role ID is authorized to access. You must also specify the `role_id`.
        /// ### `data_process_region` - (Optional) The cloud provider region to which the Federated Instance routes client connections for data processing.
        /// </summary>
        [Input("testS3Bucket", required: true)]
        public Input<string> TestS3Bucket { get; set; } = null!;

        public FederatedDatabaseInstanceCloudProviderConfigAwsArgs()
        {
        }
        public static new FederatedDatabaseInstanceCloudProviderConfigAwsArgs Empty => new FederatedDatabaseInstanceCloudProviderConfigAwsArgs();
    }
}