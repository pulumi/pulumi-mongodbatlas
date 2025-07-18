// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class GetAlertConfigurationOutputInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
        /// - `PRIMARY`
        /// - `SECONDARY`
        /// - `STANDALONE`
        /// - `CONFIG`
        /// - `MONGOS`
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public GetAlertConfigurationOutputInputArgs()
        {
        }
        public static new GetAlertConfigurationOutputInputArgs Empty => new GetAlertConfigurationOutputInputArgs();
    }
}
