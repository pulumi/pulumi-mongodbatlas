// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ProjectIpAddressesServicesArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusters")]
        private InputList<Inputs.ProjectIpAddressesServicesClusterArgs>? _clusters;
        public InputList<Inputs.ProjectIpAddressesServicesClusterArgs> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<Inputs.ProjectIpAddressesServicesClusterArgs>());
            set => _clusters = value;
        }

        public ProjectIpAddressesServicesArgs()
        {
        }
        public static new ProjectIpAddressesServicesArgs Empty => new ProjectIpAddressesServicesArgs();
    }
}
