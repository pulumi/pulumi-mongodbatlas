# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetOrganizationResult',
    'AwaitableGetOrganizationResult',
    'get_organization',
    'get_organization_output',
]

@pulumi.output_type
class GetOrganizationResult:
    """
    A collection of values returned by getOrganization.
    """
    def __init__(__self__, api_access_list_required=None, id=None, is_deleted=None, links=None, multi_factor_auth_required=None, name=None, org_id=None, restrict_employee_access=None):
        if api_access_list_required and not isinstance(api_access_list_required, bool):
            raise TypeError("Expected argument 'api_access_list_required' to be a bool")
        pulumi.set(__self__, "api_access_list_required", api_access_list_required)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_deleted and not isinstance(is_deleted, bool):
            raise TypeError("Expected argument 'is_deleted' to be a bool")
        pulumi.set(__self__, "is_deleted", is_deleted)
        if links and not isinstance(links, list):
            raise TypeError("Expected argument 'links' to be a list")
        pulumi.set(__self__, "links", links)
        if multi_factor_auth_required and not isinstance(multi_factor_auth_required, bool):
            raise TypeError("Expected argument 'multi_factor_auth_required' to be a bool")
        pulumi.set(__self__, "multi_factor_auth_required", multi_factor_auth_required)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if restrict_employee_access and not isinstance(restrict_employee_access, bool):
            raise TypeError("Expected argument 'restrict_employee_access' to be a bool")
        pulumi.set(__self__, "restrict_employee_access", restrict_employee_access)

    @property
    @pulumi.getter(name="apiAccessListRequired")
    def api_access_list_required(self) -> bool:
        """
        (Optional) Flag that indicates whether to require API operations to originate from an IP Address added to the API access list for the specified organization.
        """
        return pulumi.get(self, "api_access_list_required")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isDeleted")
    def is_deleted(self) -> bool:
        """
        Flag that indicates whether this organization has been deleted.
        """
        return pulumi.get(self, "is_deleted")

    @property
    @pulumi.getter
    def links(self) -> Sequence['outputs.GetOrganizationLinkResult']:
        return pulumi.get(self, "links")

    @property
    @pulumi.getter(name="multiFactorAuthRequired")
    def multi_factor_auth_required(self) -> bool:
        """
        (Optional) Flag that indicates whether to require users to set up Multi-Factor Authentication (MFA) before accessing the specified organization. To learn more, see: https://www.mongodb.com/docs/atlas/security-multi-factor-authentication/.
        """
        return pulumi.get(self, "multi_factor_auth_required")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Human-readable label that identifies the organization.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="restrictEmployeeAccess")
    def restrict_employee_access(self) -> bool:
        """
        (Optional) Flag that indicates whether to block MongoDB Support from accessing Atlas infrastructure for any deployment in the specified organization without explicit permission. Once this setting is turned on, you can grant MongoDB Support a 24-hour bypass access to the Atlas deployment to resolve support issues. To learn more, see: https://www.mongodb.com/docs/atlas/security-restrict-support-access/.
        """
        return pulumi.get(self, "restrict_employee_access")


class AwaitableGetOrganizationResult(GetOrganizationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetOrganizationResult(
            api_access_list_required=self.api_access_list_required,
            id=self.id,
            is_deleted=self.is_deleted,
            links=self.links,
            multi_factor_auth_required=self.multi_factor_auth_required,
            name=self.name,
            org_id=self.org_id,
            restrict_employee_access=self.restrict_employee_access)


def get_organization(org_id: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetOrganizationResult:
    """
    ## # Data Source: Organization

    `Organization` describes all MongoDB Atlas Organizations. This represents organizations that have been created.

    ## Example Usage

    ### Using project_id attribute to query
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_organization(org_id="<org_id>")
    ```


    :param str org_id: Unique 24-hexadecimal digit string that identifies the organization.
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getOrganization:getOrganization', __args__, opts=opts, typ=GetOrganizationResult).value

    return AwaitableGetOrganizationResult(
        api_access_list_required=pulumi.get(__ret__, 'api_access_list_required'),
        id=pulumi.get(__ret__, 'id'),
        is_deleted=pulumi.get(__ret__, 'is_deleted'),
        links=pulumi.get(__ret__, 'links'),
        multi_factor_auth_required=pulumi.get(__ret__, 'multi_factor_auth_required'),
        name=pulumi.get(__ret__, 'name'),
        org_id=pulumi.get(__ret__, 'org_id'),
        restrict_employee_access=pulumi.get(__ret__, 'restrict_employee_access'))
def get_organization_output(org_id: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetOrganizationResult]:
    """
    ## # Data Source: Organization

    `Organization` describes all MongoDB Atlas Organizations. This represents organizations that have been created.

    ## Example Usage

    ### Using project_id attribute to query
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_organization(org_id="<org_id>")
    ```


    :param str org_id: Unique 24-hexadecimal digit string that identifies the organization.
    """
    __args__ = dict()
    __args__['orgId'] = org_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getOrganization:getOrganization', __args__, opts=opts, typ=GetOrganizationResult)
    return __ret__.apply(lambda __response__: GetOrganizationResult(
        api_access_list_required=pulumi.get(__response__, 'api_access_list_required'),
        id=pulumi.get(__response__, 'id'),
        is_deleted=pulumi.get(__response__, 'is_deleted'),
        links=pulumi.get(__response__, 'links'),
        multi_factor_auth_required=pulumi.get(__response__, 'multi_factor_auth_required'),
        name=pulumi.get(__response__, 'name'),
        org_id=pulumi.get(__response__, 'org_id'),
        restrict_employee_access=pulumi.get(__response__, 'restrict_employee_access')))
