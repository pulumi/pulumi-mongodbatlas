# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetProjectIpAccessListResult',
    'AwaitableGetProjectIpAccessListResult',
    'get_project_ip_access_list',
]

@pulumi.output_type
class GetProjectIpAccessListResult:
    """
    A collection of values returned by getProjectIpAccessList.
    """
    def __init__(__self__, aws_security_group=None, cidr_block=None, comment=None, id=None, ip_address=None, project_id=None):
        if aws_security_group and not isinstance(aws_security_group, str):
            raise TypeError("Expected argument 'aws_security_group' to be a str")
        pulumi.set(__self__, "aws_security_group", aws_security_group)
        if cidr_block and not isinstance(cidr_block, str):
            raise TypeError("Expected argument 'cidr_block' to be a str")
        pulumi.set(__self__, "cidr_block", cidr_block)
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_address and not isinstance(ip_address, str):
            raise TypeError("Expected argument 'ip_address' to be a str")
        pulumi.set(__self__, "ip_address", ip_address)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="awsSecurityGroup")
    def aws_security_group(self) -> str:
        return pulumi.get(self, "aws_security_group")

    @property
    @pulumi.getter(name="cidrBlock")
    def cidr_block(self) -> str:
        return pulumi.get(self, "cidr_block")

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        Comment to add to the access list entry.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipAddress")
    def ip_address(self) -> str:
        return pulumi.get(self, "ip_address")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")


class AwaitableGetProjectIpAccessListResult(GetProjectIpAccessListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectIpAccessListResult(
            aws_security_group=self.aws_security_group,
            cidr_block=self.cidr_block,
            comment=self.comment,
            id=self.id,
            ip_address=self.ip_address,
            project_id=self.project_id)


def get_project_ip_access_list(aws_security_group: Optional[str] = None,
                               cidr_block: Optional[str] = None,
                               ip_address: Optional[str] = None,
                               project_id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectIpAccessListResult:
    """
    `ProjectIpAccessList` describes an IP Access List entry resource. The access list grants access from IPs, CIDRs or AWS Security Groups (if VPC Peering is enabled) to clusters within the Project.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    > **IMPORTANT:**
    When you remove an entry from the access list, existing connections from the removed address(es) may remain open for a variable amount of time. How much time passes before Atlas closes the connection depends on several factors, including how the connection was established, the particular behavior of the application or driver using the address, and the connection protocol (e.g., TCP or UDP). This is particularly important to consider when changing an existing IP address or CIDR block as they cannot be updated via the Provider (comments can however), hence a change will force the destruction and recreation of entries.

    ## Example Usage


    :param str aws_security_group: Unique identifier of the AWS security group to add to the access list.
    :param str cidr_block: Range of IP addresses in CIDR notation to be added to the access list.
    :param str ip_address: Single IP address to be added to the access list.
    :param str project_id: Unique identifier for the project to which you want to add one or more access list entries.
    """
    __args__ = dict()
    __args__['awsSecurityGroup'] = aws_security_group
    __args__['cidrBlock'] = cidr_block
    __args__['ipAddress'] = ip_address
    __args__['projectId'] = project_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getProjectIpAccessList:getProjectIpAccessList', __args__, opts=opts, typ=GetProjectIpAccessListResult).value

    return AwaitableGetProjectIpAccessListResult(
        aws_security_group=__ret__.aws_security_group,
        cidr_block=__ret__.cidr_block,
        comment=__ret__.comment,
        id=__ret__.id,
        ip_address=__ret__.ip_address,
        project_id=__ret__.project_id)
