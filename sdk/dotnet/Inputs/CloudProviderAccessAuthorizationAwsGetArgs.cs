// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CloudProviderAccessAuthorizationAwsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("iamAssumedRoleArn", required: true)]
        public Input<string> IamAssumedRoleArn { get; set; } = null!;

        public CloudProviderAccessAuthorizationAwsGetArgs()
        {
        }
        public static new CloudProviderAccessAuthorizationAwsGetArgs Empty => new CloudProviderAccessAuthorizationAwsGetArgs();
    }
}
