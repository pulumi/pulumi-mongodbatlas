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
    public sealed class ResourcePolicyPolicy
    {
        /// <summary>
        /// A string that defines the permissions for the policy. The syntax used is the Cedar Policy language.
        /// </summary>
        public readonly string Body;
        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the policy.
        /// </summary>
        public readonly string? Id;

        [OutputConstructor]
        private ResourcePolicyPolicy(
            string body,

            string? id)
        {
            Body = body;
            Id = id;
        }
    }
}
