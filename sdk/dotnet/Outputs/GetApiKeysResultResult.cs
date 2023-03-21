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
        /// <summary>
        /// Unique identifier for the API key you want to update. Use the /orgs/{ORG-ID}/apiKeys endpoint to retrieve all API keys to which the authenticated user has access for the specified organization.
        /// </summary>
        public readonly string ApiKeyId;
        /// <summary>
        /// Description of this Organization API key.
        /// </summary>
        public readonly string Description;
        public readonly string PublicKey;
        /// <summary>
        /// Name of the role. This resource returns all the roles the user has in Atlas.
        /// </summary>
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