// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudProviderAccessSetup
    {
        /// <summary>
        /// # Data Source: mongodbatlas.CloudProviderAccessSetup
        /// 
        /// `mongodbatlas.CloudProviderAccessSetup` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### with AWS
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testRole = new Mongodbatlas.CloudProviderAccessSetup("test_role", new()
        ///     {
        ///         ProjectId = "64259ee860c43338194b0f8e",
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var singleSetup = Mongodbatlas.GetCloudProviderAccessSetup.Invoke(new()
        ///     {
        ///         ProjectId = testRole.ProjectId,
        ///         ProviderName = testRole.ProviderName,
        ///         RoleId = testRole.RoleId,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### with AZURE
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testRole = new Mongodbatlas.CloudProviderAccessSetup("test_role", new()
        ///     {
        ///         ProjectId = "64259ee860c43338194b0f8e",
        ///         ProviderName = "AZURE",
        ///         AzureConfigs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudProviderAccessSetupAzureConfigArgs
        ///             {
        ///                 AtlasAzureAppId = "9f2deb0d-be22-4524-a403-df531868bac0",
        ///                 ServicePrincipalId = "22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1",
        ///                 TenantId = "91402384-d71e-22f5-22dd-759e272cdc1c",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var singleSetup = Mongodbatlas.GetCloudProviderAccessSetup.Invoke(new()
        ///     {
        ///         ProjectId = testRole.ProjectId,
        ///         ProviderName = testRole.ProviderName,
        ///         RoleId = testRole.RoleId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudProviderAccessSetupResult> InvokeAsync(GetCloudProviderAccessSetupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudProviderAccessSetupResult>("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", args ?? new GetCloudProviderAccessSetupArgs(), options.WithDefaults());

        /// <summary>
        /// # Data Source: mongodbatlas.CloudProviderAccessSetup
        /// 
        /// `mongodbatlas.CloudProviderAccessSetup` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### with AWS
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testRole = new Mongodbatlas.CloudProviderAccessSetup("test_role", new()
        ///     {
        ///         ProjectId = "64259ee860c43338194b0f8e",
        ///         ProviderName = "AWS",
        ///     });
        /// 
        ///     var singleSetup = Mongodbatlas.GetCloudProviderAccessSetup.Invoke(new()
        ///     {
        ///         ProjectId = testRole.ProjectId,
        ///         ProviderName = testRole.ProviderName,
        ///         RoleId = testRole.RoleId,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### with AZURE
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testRole = new Mongodbatlas.CloudProviderAccessSetup("test_role", new()
        ///     {
        ///         ProjectId = "64259ee860c43338194b0f8e",
        ///         ProviderName = "AZURE",
        ///         AzureConfigs = new[]
        ///         {
        ///             new Mongodbatlas.Inputs.CloudProviderAccessSetupAzureConfigArgs
        ///             {
        ///                 AtlasAzureAppId = "9f2deb0d-be22-4524-a403-df531868bac0",
        ///                 ServicePrincipalId = "22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1",
        ///                 TenantId = "91402384-d71e-22f5-22dd-759e272cdc1c",
        ///             },
        ///         },
        ///     });
        /// 
        ///     var singleSetup = Mongodbatlas.GetCloudProviderAccessSetup.Invoke(new()
        ///     {
        ///         ProjectId = testRole.ProjectId,
        ///         ProviderName = testRole.ProviderName,
        ///         RoleId = testRole.RoleId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudProviderAccessSetupResult> Invoke(GetCloudProviderAccessSetupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudProviderAccessSetupResult>("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", args ?? new GetCloudProviderAccessSetupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudProviderAccessSetupArgs : global::Pulumi.InvokeArgs
    {
        [Input("azureConfigs")]
        private List<Inputs.GetCloudProviderAccessSetupAzureConfigArgs>? _azureConfigs;

        /// <summary>
        /// azure related configurations
        /// </summary>
        public List<Inputs.GetCloudProviderAccessSetupAzureConfigArgs> AzureConfigs
        {
            get => _azureConfigs ?? (_azureConfigs = new List<Inputs.GetCloudProviderAccessSetupAzureConfigArgs>());
            set => _azureConfigs = value;
        }

        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// cloud provider name, currently only AWS is supported
        /// </summary>
        [Input("providerName", required: true)]
        public string ProviderName { get; set; } = null!;

        /// <summary>
        /// unique role id among all the aws roles provided by mongodb atlas
        /// </summary>
        [Input("roleId", required: true)]
        public string RoleId { get; set; } = null!;

        public GetCloudProviderAccessSetupArgs()
        {
        }
        public static new GetCloudProviderAccessSetupArgs Empty => new GetCloudProviderAccessSetupArgs();
    }

    public sealed class GetCloudProviderAccessSetupInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("azureConfigs")]
        private InputList<Inputs.GetCloudProviderAccessSetupAzureConfigInputArgs>? _azureConfigs;

        /// <summary>
        /// azure related configurations
        /// </summary>
        public InputList<Inputs.GetCloudProviderAccessSetupAzureConfigInputArgs> AzureConfigs
        {
            get => _azureConfigs ?? (_azureConfigs = new InputList<Inputs.GetCloudProviderAccessSetupAzureConfigInputArgs>());
            set => _azureConfigs = value;
        }

        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// cloud provider name, currently only AWS is supported
        /// </summary>
        [Input("providerName", required: true)]
        public Input<string> ProviderName { get; set; } = null!;

        /// <summary>
        /// unique role id among all the aws roles provided by mongodb atlas
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public GetCloudProviderAccessSetupInvokeArgs()
        {
        }
        public static new GetCloudProviderAccessSetupInvokeArgs Empty => new GetCloudProviderAccessSetupInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudProviderAccessSetupResult
    {
        /// <summary>
        /// aws related role information
        /// </summary>
        public readonly ImmutableDictionary<string, string> Aws;
        /// <summary>
        /// aws related role information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudProviderAccessSetupAwsConfigResult> AwsConfigs;
        /// <summary>
        /// azure related configurations
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudProviderAccessSetupAzureConfigResult> AzureConfigs;
        /// <summary>
        /// Date on which this role was created.
        /// </summary>
        public readonly string CreatedDate;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Date and time when this Azure Service Principal was last updated. This parameter expresses its value in the ISO 8601 timestamp format in UTC.
        /// </summary>
        public readonly string LastUpdatedDate;
        public readonly string ProjectId;
        public readonly string ProviderName;
        public readonly string RoleId;

        [OutputConstructor]
        private GetCloudProviderAccessSetupResult(
            ImmutableDictionary<string, string> aws,

            ImmutableArray<Outputs.GetCloudProviderAccessSetupAwsConfigResult> awsConfigs,

            ImmutableArray<Outputs.GetCloudProviderAccessSetupAzureConfigResult> azureConfigs,

            string createdDate,

            string id,

            string lastUpdatedDate,

            string projectId,

            string providerName,

            string roleId)
        {
            Aws = aws;
            AwsConfigs = awsConfigs;
            AzureConfigs = azureConfigs;
            CreatedDate = createdDate;
            Id = id;
            LastUpdatedDate = lastUpdatedDate;
            ProjectId = projectId;
            ProviderName = providerName;
            RoleId = roleId;
        }
    }
}
