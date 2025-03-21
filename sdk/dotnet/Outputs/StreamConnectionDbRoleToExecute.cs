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
    public sealed class StreamConnectionDbRoleToExecute
    {
        /// <summary>
        /// The name of the role to use. Value can be  `atlasAdmin`, `readWriteAnyDatabase`, or `readAnyDatabase` if `type` is set to `BUILT_IN`, or the name of a user-defined role if `type` is set to `CUSTOM`.
        /// </summary>
        public readonly string Role;
        /// <summary>
        /// Type of connection. Can be `AWSLambda`, `Cluster`, `Https`, `Kafka` or `Sample`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private StreamConnectionDbRoleToExecute(
            string role,

            string type)
        {
            Role = role;
            Type = type;
        }
    }
}
