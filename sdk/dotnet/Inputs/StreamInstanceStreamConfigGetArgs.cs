// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class StreamInstanceStreamConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Selected tier for the Stream Instance. Configures Memory / VCPU allowances. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
        /// </summary>
        [Input("tier")]
        public Input<string>? Tier { get; set; }

        public StreamInstanceStreamConfigGetArgs()
        {
        }
        public static new StreamInstanceStreamConfigGetArgs Empty => new StreamInstanceStreamConfigGetArgs();
    }
}
