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
    public sealed class GetStreamInstancesResultDataProcessRegionResult
    {
        /// <summary>
        /// Label that identifies the cloud service provider where MongoDB Cloud performs stream processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
        /// </summary>
        public readonly string CloudProvider;
        /// <summary>
        /// Name of the cloud provider region hosting Atlas Stream Processing. The [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) describes the valid values.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private GetStreamInstancesResultDataProcessRegionResult(
            string cloudProvider,

            string region)
        {
            CloudProvider = cloudProvider;
            Region = region;
        }
    }
}