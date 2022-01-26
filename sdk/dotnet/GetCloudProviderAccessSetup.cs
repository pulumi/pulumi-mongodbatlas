// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudProviderAccessSetup
    {
        /// <summary>
        /// `mongodbatlas.CloudProviderAccess` allows you to get a single role for a provider access role setup, currently only AWS is supported.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testRole = new Mongodbatlas.CloudProviderAccessSetup("testRole", new Mongodbatlas.CloudProviderAccessSetupArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             ProviderName = "AWS",
        ///         });
        ///         var singleSetup = Mongodbatlas.GetCloudProviderAccessSetup.Invoke(new Mongodbatlas.GetCloudProviderAccessSetupInvokeArgs
        ///         {
        ///             ProjectId = testRole.ProjectId,
        ///             ProviderName = testRole.ProviderName,
        ///             RoleId = testRole.RoleId,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCloudProviderAccessSetupResult> InvokeAsync(GetCloudProviderAccessSetupArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCloudProviderAccessSetupResult>("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", args ?? new GetCloudProviderAccessSetupArgs(), options.WithVersion());

        /// <summary>
        /// `mongodbatlas.CloudProviderAccess` allows you to get a single role for a provider access role setup, currently only AWS is supported.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testRole = new Mongodbatlas.CloudProviderAccessSetup("testRole", new Mongodbatlas.CloudProviderAccessSetupArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             ProviderName = "AWS",
        ///         });
        ///         var singleSetup = Mongodbatlas.GetCloudProviderAccessSetup.Invoke(new Mongodbatlas.GetCloudProviderAccessSetupInvokeArgs
        ///         {
        ///             ProjectId = testRole.ProjectId,
        ///             ProviderName = testRole.ProviderName,
        ///             RoleId = testRole.RoleId,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCloudProviderAccessSetupResult> Invoke(GetCloudProviderAccessSetupInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCloudProviderAccessSetupResult>("mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup", args ?? new GetCloudProviderAccessSetupInvokeArgs(), options.WithVersion());
    }


    public sealed class GetCloudProviderAccessSetupArgs : Pulumi.InvokeArgs
    {
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
    }

    public sealed class GetCloudProviderAccessSetupInvokeArgs : Pulumi.InvokeArgs
    {
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
    }


    [OutputType]
    public sealed class GetCloudProviderAccessSetupResult
    {
        /// <summary>
        /// aws related role information
        /// </summary>
        public readonly ImmutableDictionary<string, string> Aws;
        public readonly ImmutableArray<Outputs.GetCloudProviderAccessSetupAwsConfigResult> AwsConfigs;
        /// <summary>
        /// Date on which this role was created.
        /// </summary>
        public readonly string CreatedDate;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        public readonly string ProviderName;
        public readonly string RoleId;

        [OutputConstructor]
        private GetCloudProviderAccessSetupResult(
            ImmutableDictionary<string, string> aws,

            ImmutableArray<Outputs.GetCloudProviderAccessSetupAwsConfigResult> awsConfigs,

            string createdDate,

            string id,

            string projectId,

            string providerName,

            string roleId)
        {
            Aws = aws;
            AwsConfigs = awsConfigs;
            CreatedDate = createdDate;
            Id = id;
            ProjectId = projectId;
            ProviderName = providerName;
            RoleId = roleId;
        }
    }
}