// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class EncryptionAtRestGoogleCloudKmsConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("keyVersionResourceId")]
        private Input<string>? _keyVersionResourceId;

        /// <summary>
        /// The Key Version Resource ID from your GCP account.
        /// </summary>
        public Input<string>? KeyVersionResourceId
        {
            get => _keyVersionResourceId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyVersionResourceId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("serviceAccountKey")]
        private Input<string>? _serviceAccountKey;

        /// <summary>
        /// String-formatted JSON object containing GCP KMS credentials from your GCP account.
        /// </summary>
        public Input<string>? ServiceAccountKey
        {
            get => _serviceAccountKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceAccountKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public EncryptionAtRestGoogleCloudKmsConfigArgs()
        {
        }
        public static new EncryptionAtRestGoogleCloudKmsConfigArgs Empty => new EncryptionAtRestGoogleCloudKmsConfigArgs();
    }
}
