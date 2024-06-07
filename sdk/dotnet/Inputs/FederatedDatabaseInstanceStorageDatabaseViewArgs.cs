// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceStorageDatabaseViewArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("pipeline")]
        public Input<string>? Pipeline { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        public FederatedDatabaseInstanceStorageDatabaseViewArgs()
        {
        }
        public static new FederatedDatabaseInstanceStorageDatabaseViewArgs Empty => new FederatedDatabaseInstanceStorageDatabaseViewArgs();
    }
}
