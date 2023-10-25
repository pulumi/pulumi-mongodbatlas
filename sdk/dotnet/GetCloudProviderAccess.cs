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
        /// **WARNING:** The data source `mongodbatlas.CloudProviderAccess` is deprecated and will be removed in version v1.14.0, use the data source `mongodbatlas.CloudProviderAccessSetup` instead.
        /// 
        /// `mongodbatlas.CloudProviderAccess` allows you to get the list of cloud provider access roles, currently only AWS and Azure is supported.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Task<GetCloudProviderAccessResult> InvokeAsync(GetCloudProviderAccessArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudProviderAccessResult>("mongodbatlas:index/getCloudProviderAccess:getCloudProviderAccess", args ?? new GetCloudProviderAccessArgs(), options.WithDefaults());

        /// <summary>
        /// **WARNING:** The data source `mongodbatlas.CloudProviderAccess` is deprecated and will be removed in version v1.14.0, use the data source `mongodbatlas.CloudProviderAccessSetup` instead.
        /// 
        /// `mongodbatlas.CloudProviderAccess` allows you to get the list of cloud provider access roles, currently only AWS and Azure is supported.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// </summary>
        public static Output<GetCloudProviderAccessResult> Invoke(GetCloudProviderAccessInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudProviderAccessResult>("mongodbatlas:index/getCloudProviderAccess:getCloudProviderAccess", args ?? new GetCloudProviderAccessInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudProviderAccessArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetCloudProviderAccessArgs()
        {
        }
        public static new GetCloudProviderAccessArgs Empty => new GetCloudProviderAccessArgs();
    }

    public sealed class GetCloudProviderAccessInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID for the project to get all Cloud Provider Access
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetCloudProviderAccessInvokeArgs()
        {
        }
        public static new GetCloudProviderAccessInvokeArgs Empty => new GetCloudProviderAccessInvokeArgs();
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
