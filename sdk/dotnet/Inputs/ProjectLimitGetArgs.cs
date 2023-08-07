// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ProjectLimitGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("currentUsage")]
        public Input<int>? CurrentUsage { get; set; }

        [Input("defaultLimit")]
        public Input<int>? DefaultLimit { get; set; }

        [Input("maximumLimit")]
        public Input<int>? MaximumLimit { get; set; }

        /// <summary>
        /// Human-readable label that identifies this project limit. See [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to find all the limits that can be defined.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Amount to set the limit to. Use the [Project Limit Documentation](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Projects/operation/setProjectLimit) under `limitName` parameter to verify the override limits.
        /// </summary>
        [Input("value", required: true)]
        public Input<int> Value { get; set; } = null!;

        public ProjectLimitGetArgs()
        {
        }
        public static new ProjectLimitGetArgs Empty => new ProjectLimitGetArgs();
    }
}
