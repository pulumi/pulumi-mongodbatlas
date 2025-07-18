// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DataLakePipelineSinkArgs : global::Pulumi.ResourceArgs
    {
        [Input("partitionFields")]
        private InputList<Inputs.DataLakePipelineSinkPartitionFieldArgs>? _partitionFields;

        /// <summary>
        /// Ordered fields used to physically organize data in the destination.
        /// * `partition_fields.#.field_name` - Human-readable label that identifies the field name used to partition data.
        /// * `partition_fields.#.order` - Sequence in which MongoDB Atlas slices the collection data to create partitions. The resource expresses this sequence starting with zero.
        /// </summary>
        public InputList<Inputs.DataLakePipelineSinkPartitionFieldArgs> PartitionFields
        {
            get => _partitionFields ?? (_partitionFields = new InputList<Inputs.DataLakePipelineSinkPartitionFieldArgs>());
            set => _partitionFields = value;
        }

        /// <summary>
        /// Target cloud provider for this Data Lake Pipeline.
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        /// <summary>
        /// Target cloud provider region for this Data Lake Pipeline. [Supported cloud provider regions](https://www.mongodb.com/docs/datalake/limitations).
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Type of ingestion source of this Data Lake Pipeline.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DataLakePipelineSinkArgs()
        {
        }
        public static new DataLakePipelineSinkArgs Empty => new DataLakePipelineSinkArgs();
    }
}
