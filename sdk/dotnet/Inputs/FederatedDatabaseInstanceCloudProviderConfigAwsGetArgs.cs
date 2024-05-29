// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceCloudProviderConfigAwsGetArgs : global::Pulumi.ResourceArgs
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

        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        [Input("testS3Bucket", required: true)]
        public Input<string> TestS3Bucket { get; set; } = null!;

        public FederatedDatabaseInstanceCloudProviderConfigAwsGetArgs()
        {
        }
        public static new FederatedDatabaseInstanceCloudProviderConfigAwsGetArgs Empty => new FederatedDatabaseInstanceCloudProviderConfigAwsGetArgs();
    }
}
