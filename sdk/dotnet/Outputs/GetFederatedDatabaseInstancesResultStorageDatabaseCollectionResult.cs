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
    public sealed class GetFederatedDatabaseInstancesResultStorageDatabaseCollectionResult
    {
        public readonly ImmutableArray<Outputs.GetFederatedDatabaseInstancesResultStorageDatabaseCollectionDataSourceResult> DataSources;
        public readonly string Name;

        [OutputConstructor]
        private GetFederatedDatabaseInstancesResultStorageDatabaseCollectionResult(
            ImmutableArray<Outputs.GetFederatedDatabaseInstancesResultStorageDatabaseCollectionDataSourceResult> dataSources,

            string name)
        {
            DataSources = dataSources;
            Name = name;
        }
    }
}
