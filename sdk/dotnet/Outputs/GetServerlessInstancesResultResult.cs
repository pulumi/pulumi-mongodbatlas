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
    public sealed class GetServerlessInstancesResultResult
    {
        public readonly ImmutableArray<string> ConnectionStringsPrivateEndpointSrvs;
        /// <summary>
        /// Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
        /// </summary>
        public readonly string ConnectionStringsStandardSrv;
        /// <summary>
        /// Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
        /// </summary>
        public readonly bool ContinuousBackupEnabled;
        public readonly string CreateDate;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the serverless instance.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetServerlessInstancesResultLinkResult> Links;
        /// <summary>
        /// Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
        /// </summary>
        public readonly string MongoDbVersion;
        /// <summary>
        /// (Required) Human-readable label that identifies your serverless instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
        /// </summary>
        public readonly string ProviderSettingsBackingProviderName;
        /// <summary>
        /// Cloud service provider that applies to the provisioned the serverless instance.
        /// </summary>
        public readonly string ProviderSettingsProviderName;
        /// <summary>
        /// Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
        /// </summary>
        public readonly string ProviderSettingsRegionName;
        /// <summary>
        /// Stage of deployment of this serverless instance when the resource made its request.
        /// </summary>
        public readonly string StateName;
        /// <summary>
        /// Flag that indicates whether termination protection is enabled on the cluster. If set to true, MongoDB Cloud won't delete the cluster. If set to false, MongoDB Cloud will delete the cluster.
        /// </summary>
        public readonly bool TerminationProtectionEnabled;

        [OutputConstructor]
        private GetServerlessInstancesResultResult(
            ImmutableArray<string> connectionStringsPrivateEndpointSrvs,

            string connectionStringsStandardSrv,

            bool continuousBackupEnabled,

            string createDate,

            string id,

            ImmutableArray<Outputs.GetServerlessInstancesResultLinkResult> links,

            string mongoDbVersion,

            string name,

            string projectId,

            string providerSettingsBackingProviderName,

            string providerSettingsProviderName,

            string providerSettingsRegionName,

            string stateName,

            bool terminationProtectionEnabled)
        {
            ConnectionStringsPrivateEndpointSrvs = connectionStringsPrivateEndpointSrvs;
            ConnectionStringsStandardSrv = connectionStringsStandardSrv;
            ContinuousBackupEnabled = continuousBackupEnabled;
            CreateDate = createDate;
            Id = id;
            Links = links;
            MongoDbVersion = mongoDbVersion;
            Name = name;
            ProjectId = projectId;
            ProviderSettingsBackingProviderName = providerSettingsBackingProviderName;
            ProviderSettingsProviderName = providerSettingsProviderName;
            ProviderSettingsRegionName = providerSettingsRegionName;
            StateName = stateName;
            TerminationProtectionEnabled = terminationProtectionEnabled;
        }
    }
}
