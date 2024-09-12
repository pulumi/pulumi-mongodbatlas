// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class StreamProcessorOptionsDlqGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the collection to use for the DLQ.
        /// </summary>
        [Input("coll", required: true)]
        public Input<string> Coll { get; set; } = null!;

        /// <summary>
        /// Name of the connection to write DLQ messages to. Must be an Atlas connection.
        /// </summary>
        [Input("connectionName", required: true)]
        public Input<string> ConnectionName { get; set; } = null!;

        /// <summary>
        /// Name of the database to use for the DLQ.
        /// </summary>
        [Input("db", required: true)]
        public Input<string> Db { get; set; } = null!;

        public StreamProcessorOptionsDlqGetArgs()
        {
        }
        public static new StreamProcessorOptionsDlqGetArgs Empty => new StreamProcessorOptionsDlqGetArgs();
    }
}
