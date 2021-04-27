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
    public sealed class EncryptionAtRestAwsKms
    {
        public readonly string? AccessKeyId;
        /// <summary>
        /// The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
        /// </summary>
        public readonly string? CustomerMasterKeyId;
        /// <summary>
        /// Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas.CloudProviderAccess` resource.
        /// </summary>
        public readonly string? RoleId;
        public readonly string? SecretAccessKey;

        [OutputConstructor]
        private EncryptionAtRestAwsKms(
            string? accessKeyId,

            string? customerMasterKeyId,

            bool? enabled,

            string? region,

            string? roleId,

            string? secretAccessKey)
        {
            AccessKeyId = accessKeyId;
            CustomerMasterKeyId = customerMasterKeyId;
            Enabled = enabled;
            Region = region;
            RoleId = roleId;
            SecretAccessKey = secretAccessKey;
        }
    }
}
