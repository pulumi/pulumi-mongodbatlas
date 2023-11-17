// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CustomDbRoleActionResourceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
        /// 
        /// &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
        /// </summary>
        [Input("cluster")]
        public Input<bool>? Cluster { get; set; }

        /// <summary>
        /// `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
        /// 
        /// &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
        /// </summary>
        [Input("collectionName")]
        public Input<string>? CollectionName { get; set; }

        /// <summary>
        /// `resources.#.database_name`	Database on which the action is granted.
        /// 
        /// &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        public CustomDbRoleActionResourceGetArgs()
        {
        }
        public static new CustomDbRoleActionResourceGetArgs Empty => new CustomDbRoleActionResourceGetArgs();
    }
}
