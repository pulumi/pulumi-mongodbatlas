// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DataLakeAwsArgs : Pulumi.ResourceArgs
    {
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("iamAssumedRoleArn")]
        public Input<string>? IamAssumedRoleArn { get; set; }

        [Input("iamUserArn")]
        public Input<string>? IamUserArn { get; set; }

        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        [Input("testS3Bucket", required: true)]
        public Input<string> TestS3Bucket { get; set; } = null!;

        public DataLakeAwsArgs()
        {
        }
    }
}