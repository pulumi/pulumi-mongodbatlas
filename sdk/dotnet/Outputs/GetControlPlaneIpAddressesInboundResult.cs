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
    public sealed class GetControlPlaneIpAddressesInboundResult
    {
        /// <summary>
        /// Control plane IP addresses in AWS. Each key identifies an Amazon Web Services (AWS) region. Each value identifies control plane IP addresses in the AWS region.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> Aws;
        /// <summary>
        /// Control plane IP addresses in Azure. Each key identifies an Azure region. Each value identifies control plane IP addresses in the Azure region.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> Azure;
        /// <summary>
        /// Control plane IP addresses in GCP. Each key identifies a Google Cloud (GCP) region. Each value identifies control plane IP addresses in the GCP region.
        /// </summary>
        public readonly ImmutableDictionary<string, ImmutableArray<string>> Gcp;

        [OutputConstructor]
        private GetControlPlaneIpAddressesInboundResult(
            ImmutableDictionary<string, ImmutableArray<string>> aws,

            ImmutableDictionary<string, ImmutableArray<string>> azure,

            ImmutableDictionary<string, ImmutableArray<string>> gcp)
        {
            Aws = aws;
            Azure = azure;
            Gcp = gcp;
        }
    }
}