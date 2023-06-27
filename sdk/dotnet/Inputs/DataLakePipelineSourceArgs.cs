// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class DataLakePipelineSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Human-readable name that identifies the cluster.
        /// </summary>
        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        /// <summary>
        /// Human-readable name that identifies the collection.
        /// </summary>
        [Input("collectionName")]
        public Input<string>? CollectionName { get; set; }

        /// <summary>
        /// Human-readable name that identifies the database.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("policyItemId")]
        public Input<string>? PolicyItemId { get; set; }

        /// <summary>
        /// The unique ID for the project to create a data lake pipeline.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of ingestion source of this Data Lake Pipeline.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DataLakePipelineSourceArgs()
        {
        }
        public static new DataLakePipelineSourceArgs Empty => new DataLakePipelineSourceArgs();
    }
}
