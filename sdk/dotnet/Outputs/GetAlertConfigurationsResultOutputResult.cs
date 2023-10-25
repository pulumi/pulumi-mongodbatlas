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
    public sealed class GetAlertConfigurationsResultOutputResult
    {
        public readonly string Label;
        public readonly string Type;
        /// <summary>
        /// Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private GetAlertConfigurationsResultOutputResult(
            string label,

            string type,

            string value)
        {
            Label = label;
            Type = type;
            Value = value;
        }
    }
}
