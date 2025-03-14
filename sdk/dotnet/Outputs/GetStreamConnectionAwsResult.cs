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
    public sealed class GetStreamConnectionAwsResult
    {
        /// <summary>
        /// Amazon Resource Name (ARN) that identifies the Amazon Web Services (AWS) Identity and Access Management (IAM) role that MongoDB Cloud assumes when it accesses resources in your AWS account.
        /// </summary>
        public readonly string RoleArn;

        [OutputConstructor]
        private GetStreamConnectionAwsResult(string roleArn)
        {
            RoleArn = roleArn;
        }
    }
}
