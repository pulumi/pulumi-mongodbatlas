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
    public sealed class GetDataLakePipelinesResultSinkResult
    {
        /// <summary>
        /// Ordered fields used to physically organize data in the destination.
        /// * `partition_fields.#.field_name` - Human-readable label that identifies the field name used to partition data.
        /// * `partition_fields.#.order` - Sequence in which MongoDB Atlas slices the collection data to create partitions. The resource expresses this sequence starting with zero.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDataLakePipelinesResultSinkPartitionFieldResult> PartitionFields;
        /// <summary>
        /// Target cloud provider for this Data Lake Pipeline.
        /// </summary>
        public readonly string Provider;
        /// <summary>
        /// Target cloud provider region for this Data Lake Pipeline. [Supported cloud provider regions](https://www.mongodb.com/docs/datalake/limitations).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Type of ingestion source of this Data Lake Pipeline.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDataLakePipelinesResultSinkResult(
            ImmutableArray<Outputs.GetDataLakePipelinesResultSinkPartitionFieldResult> partitionFields,

            string provider,

            string region,

            string type)
        {
            PartitionFields = partitionFields;
            Provider = provider;
            Region = region;
            Type = type;
        }
    }
}
