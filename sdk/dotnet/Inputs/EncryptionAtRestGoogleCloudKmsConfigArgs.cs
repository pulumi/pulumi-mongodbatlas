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
        /// Flag that indicates whether someone enabled encryption at rest for the specified  project. To disable encryption at rest using customer key management and remove the configuration details, pass only this parameter with a value of `false`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("keyVersionResourceId")]
        private Input<string>? _keyVersionResourceId;

        /// <summary>
        /// Resource path that displays the key version resource ID for your Google Cloud KMS.
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
        /// JavaScript Object Notation (JSON) object that contains the Google Cloud Key Management Service (KMS). Format the JSON as a string and not as an object.
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

        /// <summary>
        /// Flag that indicates whether the Google Cloud Key Management Service (KMS) encryption key can encrypt and decrypt data.
        /// </summary>
        [Input("valid")]
        public Input<bool>? Valid { get; set; }

        public EncryptionAtRestGoogleCloudKmsConfigArgs()
        {
        }
        public static new EncryptionAtRestGoogleCloudKmsConfigArgs Empty => new EncryptionAtRestGoogleCloudKmsConfigArgs();
    }
}
