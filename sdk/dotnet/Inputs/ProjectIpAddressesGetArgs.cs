// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class ProjectIpAddressesGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("services")]
        public Input<Inputs.ProjectIpAddressesServicesGetArgs>? Services { get; set; }

        public ProjectIpAddressesGetArgs()
        {
        }
        public static new ProjectIpAddressesGetArgs Empty => new ProjectIpAddressesGetArgs();
    }
}
