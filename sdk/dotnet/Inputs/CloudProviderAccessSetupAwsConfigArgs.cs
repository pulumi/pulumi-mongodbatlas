// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudProviderAccessSetupAwsConfigArgs : global::Pulumi.ResourceArgs
    {
        [Input("atlasAssumedRoleExternalId")]
        public Input<string>? AtlasAssumedRoleExternalId { get; set; }

        [Input("atlasAwsAccountArn")]
        public Input<string>? AtlasAwsAccountArn { get; set; }

        public CloudProviderAccessSetupAwsConfigArgs()
        {
        }
        public static new CloudProviderAccessSetupAwsConfigArgs Empty => new CloudProviderAccessSetupAwsConfigArgs();
    }
}
