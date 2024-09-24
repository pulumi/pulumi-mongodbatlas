// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceStorageStoreArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalStorageClasses")]
        private InputList<string>? _additionalStorageClasses;
        public InputList<string> AdditionalStorageClasses
        {
            get => _additionalStorageClasses ?? (_additionalStorageClasses = new InputList<string>());
            set => _additionalStorageClasses = value;
        }

        [Input("allowInsecure")]
        public Input<bool>? AllowInsecure { get; set; }

        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        [Input("clusterName")]
        public Input<string>? ClusterName { get; set; }

        [Input("defaultFormat")]
        public Input<string>? DefaultFormat { get; set; }

        [Input("delimiter")]
        public Input<string>? Delimiter { get; set; }

        [Input("includeTags")]
        public Input<bool>? IncludeTags { get; set; }

        /// <summary>
        /// Name of the Atlas Federated Database Instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// The unique ID for the project to create a Federated Database Instance.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("provider")]
        public Input<string>? Provider { get; set; }

        [Input("public")]
        public Input<string>? Public { get; set; }

        [Input("readPreference")]
        public Input<Inputs.FederatedDatabaseInstanceStorageStoreReadPreferenceArgs>? ReadPreference { get; set; }

        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("urls")]
        private InputList<string>? _urls;
        public InputList<string> Urls
        {
            get => _urls ?? (_urls = new InputList<string>());
            set => _urls = value;
        }

        public FederatedDatabaseInstanceStorageStoreArgs()
        {
        }
        public static new FederatedDatabaseInstanceStorageStoreArgs Empty => new FederatedDatabaseInstanceStorageStoreArgs();
    }
}
