// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ProjectIpAddressesArgs : global::Pulumi.ResourceArgs
    {
        [Input("services")]
        public Input<Inputs.ProjectIpAddressesServicesArgs>? Services { get; set; }

        public ProjectIpAddressesArgs()
        {
        }
        public static new ProjectIpAddressesArgs Empty => new ProjectIpAddressesArgs();
    }
}
