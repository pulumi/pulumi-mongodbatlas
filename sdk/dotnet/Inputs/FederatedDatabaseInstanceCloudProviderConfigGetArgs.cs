// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class FederatedDatabaseInstanceCloudProviderConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aws", required: true)]
        public Input<Inputs.FederatedDatabaseInstanceCloudProviderConfigAwsGetArgs> Aws { get; set; } = null!;

        public FederatedDatabaseInstanceCloudProviderConfigGetArgs()
        {
        }
        public static new FederatedDatabaseInstanceCloudProviderConfigGetArgs Empty => new FederatedDatabaseInstanceCloudProviderConfigGetArgs();
    }
}
