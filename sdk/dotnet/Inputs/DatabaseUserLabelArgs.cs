// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DatabaseUserLabelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key that you want to write.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The value that you want to write.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public DatabaseUserLabelArgs()
        {
        }
        public static new DatabaseUserLabelArgs Empty => new DatabaseUserLabelArgs();
    }
}
