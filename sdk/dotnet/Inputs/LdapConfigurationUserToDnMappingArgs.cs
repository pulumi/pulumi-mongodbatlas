// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class LdapConfigurationUserToDnMappingArgs : global::Pulumi.ResourceArgs
    {
        [Input("ldapQuery")]
        public Input<string>? LdapQuery { get; set; }

        [Input("match")]
        public Input<string>? Match { get; set; }

        [Input("substitution")]
        public Input<string>? Substitution { get; set; }

        public LdapConfigurationUserToDnMappingArgs()
        {
        }
        public static new LdapConfigurationUserToDnMappingArgs Empty => new LdapConfigurationUserToDnMappingArgs();
    }
}
