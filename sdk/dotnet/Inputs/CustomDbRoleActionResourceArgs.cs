// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class CustomDbRoleActionResourceArgs : global::Pulumi.ResourceArgs
    {
        [Input("cluster")]
        public Input<bool>? Cluster { get; set; }

        [Input("collectionName")]
        public Input<string>? CollectionName { get; set; }

        /// <summary>
        /// Database on which the inherited role is granted.
        /// 
        /// &gt; **NOTE** This value should be admin for all roles except read and readWrite.
        /// </summary>
        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        public CustomDbRoleActionResourceArgs()
        {
        }
        public static new CustomDbRoleActionResourceArgs Empty => new CustomDbRoleActionResourceArgs();
    }
}
