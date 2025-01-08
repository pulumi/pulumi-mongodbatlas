// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class StreamConnectionNetworkingAccessGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Selected networking type. Either `PUBLIC` or `VPC`. Defaults to `PUBLIC`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public StreamConnectionNetworkingAccessGetArgs()
        {
        }
        public static new StreamConnectionNetworkingAccessGetArgs Empty => new StreamConnectionNetworkingAccessGetArgs();
    }
}
