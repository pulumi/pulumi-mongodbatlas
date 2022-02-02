// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetCloudProviderAccess
    {
        /// <summary>
        /// `mongodbatlas.CloudProviderAccess` allows you to get the list of cloud provider access roles, currently only AWS is supported.
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
        ///         var testRole = new Mongodbatlas.CloudProviderAccess("testRole", new Mongodbatlas.CloudProviderAccessArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             ProviderName = "AWS",
        ///         });
        ///         var all = Mongodbatlas.GetCloudProviderAccess.Invoke(new Mongodbatlas.GetCloudProviderAccessInvokeArgs
        ///         {
        ///             ProjectId = testRole.ProjectId,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCloudProviderAccessResult> InvokeAsync(GetCloudProviderAccessArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCloudProviderAccessResult>("mongodbatlas:index/getCloudProviderAccess:getCloudProviderAccess", args ?? new GetCloudProviderAccessArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.CloudProviderAccess` allows you to get the list of cloud provider access roles, currently only AWS is supported.
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
        ///         var testRole = new Mongodbatlas.CloudProviderAccess("testRole", new Mongodbatlas.CloudProviderAccessArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             ProviderName = "AWS",
        ///         });
        ///         var all = Mongodbatlas.GetCloudProviderAccess.Invoke(new Mongodbatlas.GetCloudProviderAccessInvokeArgs
        ///         {
        ///             ProjectId = testRole.ProjectId,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCloudProviderAccessResult> Invoke(GetCloudProviderAccessInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCloudProviderAccessResult>("mongodbatlas:index/getCloudProviderAccess:getCloudProviderAccess", args ?? new GetCloudProviderAccessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudProviderAccessArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudProviderAccessArgs()
        {
        }
    }

    public sealed class GetCloudProviderAccessInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetCloudProviderAccessInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCloudProviderAccessResult
    {
        /// <summary>
        /// A list where each represents a Cloud Provider Access Role.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudProviderAccessAwsIamRoleResult> AwsIamRoles;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetCloudProviderAccessResult(
            ImmutableArray<Outputs.GetCloudProviderAccessAwsIamRoleResult> awsIamRoles,

            string id,

            string projectId)
        {
            AwsIamRoles = awsIamRoles;
            Id = id;
            ProjectId = projectId;
        }
    }
}
