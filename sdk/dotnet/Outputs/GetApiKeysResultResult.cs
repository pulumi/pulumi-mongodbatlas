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
    public sealed class GetApiKeysResultResult
    {
        public readonly string ApiKeyId;
        public readonly string Description;
        public readonly string PublicKey;
        public readonly ImmutableArray<string> RoleNames;

        [OutputConstructor]
        private GetApiKeysResultResult(
            string apiKeyId,

            string description,

            string publicKey,

            ImmutableArray<string> roleNames)
        {
            ApiKeyId = apiKeyId;
            Description = description;
            PublicKey = publicKey;
            RoleNames = roleNames;
        }
    }
}
