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
    public sealed class FederatedDatabaseInstanceDataProcessRegion
    {
        /// <summary>
        /// Name of the cloud service provider. Atlas Federated Database only supports AWS.
        /// </summary>
        public readonly string CloudProvider;
        /// <summary>
        /// Name of the region to which the Federanted Instnace routes client connections for data processing. See the [documention](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createFederatedDatabase) for the available region.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private FederatedDatabaseInstanceDataProcessRegion(
            string cloudProvider,

            string region)
        {
            CloudProvider = cloudProvider;
            Region = region;
        }
    }
}
