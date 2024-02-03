// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class EncryptionAtRestAwsKmsConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyId")]
        private Input<string>? _accessKeyId;
        public Input<string>? AccessKeyId
        {
            get => _accessKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("customerMasterKeyId")]
        private Input<string>? _customerMasterKeyId;

        /// <summary>
        /// The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
        /// </summary>
        public Input<string>? CustomerMasterKeyId
        {
            get => _customerMasterKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _customerMasterKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies whether Encryption at Rest is enabled for an Atlas project, To disable Encryption at Rest, pass only this parameter with a value of false, When you disable Encryption at Rest, Atlas also removes the configuration details.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `role_id` attribute of the `mongodbatlas_cloud_provider_access` resource.
        /// </summary>
        [Input("roleId")]
        public Input<string>? RoleId { get; set; }

        [Input("secretAccessKey")]
        private Input<string>? _secretAccessKey;
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public EncryptionAtRestAwsKmsConfigGetArgs()
        {
        }
        public static new EncryptionAtRestAwsKmsConfigGetArgs Empty => new EncryptionAtRestAwsKmsConfigGetArgs();
    }
}
