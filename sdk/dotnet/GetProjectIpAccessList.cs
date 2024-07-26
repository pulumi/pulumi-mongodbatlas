// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetProjectIpAccessList
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.ProjectIpAccessList
        /// 
        /// `mongodbatlas.ProjectIpAccessList` describes an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// &gt; **IMPORTANT:**
        /// When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.   
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Using CIDR Block
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testProjectIpAccessList = new Mongodbatlas.ProjectIpAccessList("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         CidrBlock = "1.2.3.4/32",
        ///         Comment = "cidr block for tf acc testing",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectIpAccessList.Invoke(new()
        ///     {
        ///         ProjectId = testProjectIpAccessList.ProjectId,
        ///         CidrBlock = testProjectIpAccessList.CidrBlock,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using IP Address
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testProjectIpAccessList = new Mongodbatlas.ProjectIpAccessList("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         IpAddress = "2.3.4.5",
        ///         Comment = "ip address for tf acc testing",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectIpAccessList.Invoke(new()
        ///     {
        ///         ProjectId = testProjectIpAccessList.ProjectId,
        ///         IpAddress = testProjectIpAccessList.IpAddress,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using an AWS Security Group
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         AtlasCidrBlock = "192.168.208.0/21",
        ///         ProviderName = "AWS",
        ///         RegionName = "US_EAST_1",
        ///     });
        /// 
        ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         ContainerId = testNetworkContainer.ContainerId,
        ///         AccepterRegionName = "us-east-1",
        ///         ProviderName = "AWS",
        ///         RouteTableCidrBlock = "172.31.0.0/16",
        ///         VpcId = "vpc-0d93d6f69f1578bd8",
        ///         AwsAccountId = "232589400519",
        ///     });
        /// 
        ///     var testProjectIpAccessList = new Mongodbatlas.ProjectIpAccessList("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         AwsSecurityGroup = "sg-0026348ec11780bd1",
        ///         Comment = "TestAcc for awsSecurityGroup",
        ///     }, new CustomResourceOptions
        ///     {
        ///         DependsOn =
        ///         {
        ///             testNetworkPeering,
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectIpAccessList.Invoke(new()
        ///     {
        ///         ProjectId = testProjectIpAccessList.ProjectId,
        ///         AwsSecurityGroup = testProjectIpAccessList.AwsSecurityGroup,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **IMPORTANT:** In order to use AWS Security Group(s) VPC Peering must be enabled like in the above example.
        /// </summary>
        public static Task<GetProjectIpAccessListResult> InvokeAsync(GetProjectIpAccessListArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetProjectIpAccessListResult>("mongodbatlas:index/getProjectIpAccessList:getProjectIpAccessList", args ?? new GetProjectIpAccessListArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.ProjectIpAccessList
        /// 
        /// `mongodbatlas.ProjectIpAccessList` describes an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
        /// 
        /// &gt; **IMPORTANT:**
        /// When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.   
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// ### Using CIDR Block
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testProjectIpAccessList = new Mongodbatlas.ProjectIpAccessList("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         CidrBlock = "1.2.3.4/32",
        ///         Comment = "cidr block for tf acc testing",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectIpAccessList.Invoke(new()
        ///     {
        ///         ProjectId = testProjectIpAccessList.ProjectId,
        ///         CidrBlock = testProjectIpAccessList.CidrBlock,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using IP Address
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testProjectIpAccessList = new Mongodbatlas.ProjectIpAccessList("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         IpAddress = "2.3.4.5",
        ///         Comment = "ip address for tf acc testing",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectIpAccessList.Invoke(new()
        ///     {
        ///         ProjectId = testProjectIpAccessList.ProjectId,
        ///         IpAddress = testProjectIpAccessList.IpAddress,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// ### Using an AWS Security Group
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testNetworkContainer = new Mongodbatlas.NetworkContainer("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         AtlasCidrBlock = "192.168.208.0/21",
        ///         ProviderName = "AWS",
        ///         RegionName = "US_EAST_1",
        ///     });
        /// 
        ///     var testNetworkPeering = new Mongodbatlas.NetworkPeering("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         ContainerId = testNetworkContainer.ContainerId,
        ///         AccepterRegionName = "us-east-1",
        ///         ProviderName = "AWS",
        ///         RouteTableCidrBlock = "172.31.0.0/16",
        ///         VpcId = "vpc-0d93d6f69f1578bd8",
        ///         AwsAccountId = "232589400519",
        ///     });
        /// 
        ///     var testProjectIpAccessList = new Mongodbatlas.ProjectIpAccessList("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         AwsSecurityGroup = "sg-0026348ec11780bd1",
        ///         Comment = "TestAcc for awsSecurityGroup",
        ///     }, new CustomResourceOptions
        ///     {
        ///         DependsOn =
        ///         {
        ///             testNetworkPeering,
        ///         },
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetProjectIpAccessList.Invoke(new()
        ///     {
        ///         ProjectId = testProjectIpAccessList.ProjectId,
        ///         AwsSecurityGroup = testProjectIpAccessList.AwsSecurityGroup,
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// &gt; **IMPORTANT:** In order to use AWS Security Group(s) VPC Peering must be enabled like in the above example.
        /// </summary>
        public static Output<GetProjectIpAccessListResult> Invoke(GetProjectIpAccessListInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetProjectIpAccessListResult>("mongodbatlas:index/getProjectIpAccessList:getProjectIpAccessList", args ?? new GetProjectIpAccessListInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetProjectIpAccessListArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the AWS security group to add to the access list.
        /// </summary>
        [Input("awsSecurityGroup")]
        public string? AwsSecurityGroup { get; set; }

        /// <summary>
        /// Range of IP addresses in CIDR notation to be added to the access list.
        /// </summary>
        [Input("cidrBlock")]
        public string? CidrBlock { get; set; }

        /// <summary>
        /// Single IP address to be added to the access list.
        /// 
        /// &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
        /// </summary>
        [Input("ipAddress")]
        public string? IpAddress { get; set; }

        /// <summary>
        /// Unique identifier for the project to which you want to add one or more access list entries.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetProjectIpAccessListArgs()
        {
        }
        public static new GetProjectIpAccessListArgs Empty => new GetProjectIpAccessListArgs();
    }

    public sealed class GetProjectIpAccessListInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the AWS security group to add to the access list.
        /// </summary>
        [Input("awsSecurityGroup")]
        public Input<string>? AwsSecurityGroup { get; set; }

        /// <summary>
        /// Range of IP addresses in CIDR notation to be added to the access list.
        /// </summary>
        [Input("cidrBlock")]
        public Input<string>? CidrBlock { get; set; }

        /// <summary>
        /// Single IP address to be added to the access list.
        /// 
        /// &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Unique identifier for the project to which you want to add one or more access list entries.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetProjectIpAccessListInvokeArgs()
        {
        }
        public static new GetProjectIpAccessListInvokeArgs Empty => new GetProjectIpAccessListInvokeArgs();
    }


    [OutputType]
    public sealed class GetProjectIpAccessListResult
    {
        public readonly string AwsSecurityGroup;
        public readonly string CidrBlock;
        /// <summary>
        /// Comment to add to the access list entry.
        /// </summary>
        public readonly string Comment;
        public readonly string Id;
        public readonly string IpAddress;
        public readonly string ProjectId;

        [OutputConstructor]
        private GetProjectIpAccessListResult(
            string awsSecurityGroup,

            string cidrBlock,

            string comment,

            string id,

            string ipAddress,

            string projectId)
        {
            AwsSecurityGroup = awsSecurityGroup;
            CidrBlock = cidrBlock;
            Comment = comment;
            Id = id;
            IpAddress = ipAddress;
            ProjectId = projectId;
        }
    }
}
