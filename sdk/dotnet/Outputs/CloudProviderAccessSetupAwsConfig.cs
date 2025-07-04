// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class CloudProviderAccessSetupAwsConfig
    {
        public readonly string? AtlasAssumedRoleExternalId;
        public readonly string? AtlasAwsAccountArn;

        [OutputConstructor]
        private CloudProviderAccessSetupAwsConfig(
            string? atlasAssumedRoleExternalId,

            string? atlasAwsAccountArn)
        {
            AtlasAssumedRoleExternalId = atlasAssumedRoleExternalId;
            AtlasAwsAccountArn = atlasAwsAccountArn;
        }
    }
}
