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
        public readonly string Role;
        /// <summary>
        /// Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
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
