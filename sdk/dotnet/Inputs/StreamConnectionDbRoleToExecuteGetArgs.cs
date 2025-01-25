// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class StreamConnectionDbRoleToExecuteGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the role to use. Value can be  `atlasAdmin`, `readWriteAnyDatabase`, or `readAnyDatabase` if `type` is set to `BUILT_IN`, or the name of a user-defined role if `type` is set to `CUSTOM`.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// Type of connection. Can be either `Cluster`, `Kafka` or `Sample`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public StreamConnectionDbRoleToExecuteGetArgs()
        {
        }
        public static new StreamConnectionDbRoleToExecuteGetArgs Empty => new StreamConnectionDbRoleToExecuteGetArgs();
    }
}