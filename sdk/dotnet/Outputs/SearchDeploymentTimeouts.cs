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
    public sealed class SearchDeploymentTimeouts
    {
        public readonly string? Create;
        public readonly string? Delete;
        public readonly string? Update;

        [OutputConstructor]
        private SearchDeploymentTimeouts(
            string? create,

            string? delete,

            string? update)
        {
            Create = create;
            Delete = delete;
            Update = update;
        }
    }
}
