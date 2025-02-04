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
    public sealed class GetResourcePoliciesResourcePolicyCreatedByUserResult
    {
        /// <summary>
        /// Unique 24-hexadecimal character string that identifies a user.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Human-readable label that describes a user.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetResourcePoliciesResourcePolicyCreatedByUserResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
