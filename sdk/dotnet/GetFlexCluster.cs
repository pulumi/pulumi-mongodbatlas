// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFlexCluster
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.FlexCluster
        /// 
        /// `mongodbatlas.FlexCluster` describes a flex cluster.
        /// 
        /// **NOTE:** Flex Cluster is in Public Preview. In order to use the resource and data sources you need to set the environment variable MONGODB_ATLAS_ENABLE_PREVIEW to true.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Task<GetFlexClusterResult> InvokeAsync(GetFlexClusterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlexClusterResult>("mongodbatlas:index/getFlexCluster:getFlexCluster", args ?? new GetFlexClusterArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.FlexCluster
        /// 
        /// `mongodbatlas.FlexCluster` describes a flex cluster.
        /// 
        /// **NOTE:** Flex Cluster is in Public Preview. In order to use the resource and data sources you need to set the environment variable MONGODB_ATLAS_ENABLE_PREVIEW to true.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Output<GetFlexClusterResult> Invoke(GetFlexClusterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlexClusterResult>("mongodbatlas:index/getFlexCluster:getFlexCluster", args ?? new GetFlexClusterInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.FlexCluster
        /// 
        /// `mongodbatlas.FlexCluster` describes a flex cluster.
        /// 
        /// **NOTE:** Flex Cluster is in Public Preview. In order to use the resource and data sources you need to set the environment variable MONGODB_ATLAS_ENABLE_PREVIEW to true.
        /// 
        /// ## Example Usage
        /// </summary>
        public static Output<GetFlexClusterResult> Invoke(GetFlexClusterInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlexClusterResult>("mongodbatlas:index/getFlexCluster:getFlexCluster", args ?? new GetFlexClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlexClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the instance.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetFlexClusterArgs()
        {
        }
        public static new GetFlexClusterArgs Empty => new GetFlexClusterArgs();
    }

    public sealed class GetFlexClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Human-readable label that identifies the instance.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetFlexClusterInvokeArgs()
        {
        }
        public static new GetFlexClusterInvokeArgs Empty => new GetFlexClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlexClusterResult
    {
        /// <summary>
        /// Flex backup configuration
        /// </summary>
        public readonly Outputs.GetFlexClusterBackupSettingsResult BackupSettings;
        /// <summary>
        /// Flex cluster topology.
        /// </summary>
        public readonly string ClusterType;
        /// <summary>
        /// Collection of Uniform Resource Locators that point to the MongoDB database.
        /// </summary>
        public readonly Outputs.GetFlexClusterConnectionStringsResult ConnectionStrings;
        /// <summary>
        /// Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        /// </summary>
        public readonly string CreateDate;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the instance.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Version of MongoDB that the instance runs.
        /// </summary>
        public readonly string MongoDbVersion;
        /// <summary>
        /// Human-readable label that identifies the instance.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Unique 24-hexadecimal character string that identifies the project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        /// </summary>
        public readonly Outputs.GetFlexClusterProviderSettingsResult ProviderSettings;
        /// <summary>
        /// Human-readable label that indicates the current operating condition of this instance.
        /// </summary>
        public readonly string StateName;
        /// <summary>
        /// Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        /// </summary>
        public readonly bool TerminationProtectionEnabled;
        /// <summary>
        /// Method by which the cluster maintains the MongoDB versions.
        /// </summary>
        public readonly string VersionReleaseSystem;

        [OutputConstructor]
        private GetFlexClusterResult(
            Outputs.GetFlexClusterBackupSettingsResult backupSettings,

            string clusterType,

            Outputs.GetFlexClusterConnectionStringsResult connectionStrings,

            string createDate,

            string id,

            string mongoDbVersion,

            string name,

            string projectId,

            Outputs.GetFlexClusterProviderSettingsResult providerSettings,

            string stateName,

            ImmutableDictionary<string, string> tags,

            bool terminationProtectionEnabled,

            string versionReleaseSystem)
        {
            BackupSettings = backupSettings;
            ClusterType = clusterType;
            ConnectionStrings = connectionStrings;
            CreateDate = createDate;
            Id = id;
            MongoDbVersion = mongoDbVersion;
            Name = name;
            ProjectId = projectId;
            ProviderSettings = providerSettings;
            StateName = stateName;
            Tags = tags;
            TerminationProtectionEnabled = terminationProtectionEnabled;
            VersionReleaseSystem = versionReleaseSystem;
        }
    }
}
