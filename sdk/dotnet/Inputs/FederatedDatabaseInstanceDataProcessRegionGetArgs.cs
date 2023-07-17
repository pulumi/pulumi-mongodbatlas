// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceDataProcessRegionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the cloud service provider. Atlas Federated Database only supports AWS.
        /// </summary>
        [Input("cloudProvider", required: true)]
        public Input<string> CloudProvider { get; set; } = null!;

        /// <summary>
        /// Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public FederatedDatabaseInstanceDataProcessRegionGetArgs()
        {
        }
        public static new FederatedDatabaseInstanceDataProcessRegionGetArgs Empty => new FederatedDatabaseInstanceDataProcessRegionGetArgs();
    }
}