# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetCustomDbRoleResult',
    'AwaitableGetCustomDbRoleResult',
    'get_custom_db_role',
    'get_custom_db_role_output',
]

@pulumi.output_type
class GetCustomDbRoleResult:
    """
    A collection of values returned by getCustomDbRole.
    """
    def __init__(__self__, actions=None, id=None, inherited_roles=None, project_id=None, role_name=None):
        if actions and not isinstance(actions, list):
            raise TypeError("Expected argument 'actions' to be a list")
        pulumi.set(__self__, "actions", actions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if inherited_roles and not isinstance(inherited_roles, list):
            raise TypeError("Expected argument 'inherited_roles' to be a list")
        pulumi.set(__self__, "inherited_roles", inherited_roles)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if role_name and not isinstance(role_name, str):
            raise TypeError("Expected argument 'role_name' to be a str")
        pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter
    def actions(self) -> Sequence['outputs.GetCustomDbRoleActionResult']:
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inheritedRoles")
    def inherited_roles(self) -> Optional[Sequence['outputs.GetCustomDbRoleInheritedRoleResult']]:
        return pulumi.get(self, "inherited_roles")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> str:
        """
        (Required) Name of the inherited role. This can either be another custom role or a built-in role.
        """
        return pulumi.get(self, "role_name")


class AwaitableGetCustomDbRoleResult(GetCustomDbRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCustomDbRoleResult(
            actions=self.actions,
            id=self.id,
            inherited_roles=self.inherited_roles,
            project_id=self.project_id,
            role_name=self.role_name)


def get_custom_db_role(inherited_roles: Optional[Sequence[pulumi.InputType['GetCustomDbRoleInheritedRoleArgs']]] = None,
                       project_id: Optional[str] = None,
                       role_name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCustomDbRoleResult:
    """
    `CustomDbRole` describe a Custom DB Role. This represents a custom db role.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_role = mongodbatlas.CustomDbRole("test_role",
        project_id="<PROJECT-ID>",
        role_name="myCustomRole",
        actions=[
            mongodbatlas.CustomDbRoleActionArgs(
                action="UPDATE",
                resources=[mongodbatlas.CustomDbRoleActionResourceArgs(
                    collection_name="",
                    database_name="anyDatabase",
                )],
            ),
            mongodbatlas.CustomDbRoleActionArgs(
                action="INSERT",
                resources=[mongodbatlas.CustomDbRoleActionResourceArgs(
                    collection_name="",
                    database_name="anyDatabase",
                )],
            ),
        ])
    test = mongodbatlas.get_custom_db_role_output(project_id=test_role.project_id,
        role_name=test_role.role_name)
    ```
    <!--End PulumiCodeChooser -->


    :param str project_id: The unique ID for the project to create the database user.
    :param str role_name: Name of the custom role.
    """
    __args__ = dict()
    __args__['inheritedRoles'] = inherited_roles
    __args__['projectId'] = project_id
    __args__['roleName'] = role_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCustomDbRole:getCustomDbRole', __args__, opts=opts, typ=GetCustomDbRoleResult).value

    return AwaitableGetCustomDbRoleResult(
        actions=pulumi.get(__ret__, 'actions'),
        id=pulumi.get(__ret__, 'id'),
        inherited_roles=pulumi.get(__ret__, 'inherited_roles'),
        project_id=pulumi.get(__ret__, 'project_id'),
        role_name=pulumi.get(__ret__, 'role_name'))


@_utilities.lift_output_func(get_custom_db_role)
def get_custom_db_role_output(inherited_roles: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetCustomDbRoleInheritedRoleArgs']]]]] = None,
                              project_id: Optional[pulumi.Input[str]] = None,
                              role_name: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCustomDbRoleResult]:
    """
    `CustomDbRole` describe a Custom DB Role. This represents a custom db role.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_role = mongodbatlas.CustomDbRole("test_role",
        project_id="<PROJECT-ID>",
        role_name="myCustomRole",
        actions=[
            mongodbatlas.CustomDbRoleActionArgs(
                action="UPDATE",
                resources=[mongodbatlas.CustomDbRoleActionResourceArgs(
                    collection_name="",
                    database_name="anyDatabase",
                )],
            ),
            mongodbatlas.CustomDbRoleActionArgs(
                action="INSERT",
                resources=[mongodbatlas.CustomDbRoleActionResourceArgs(
                    collection_name="",
                    database_name="anyDatabase",
                )],
            ),
        ])
    test = mongodbatlas.get_custom_db_role_output(project_id=test_role.project_id,
        role_name=test_role.role_name)
    ```
    <!--End PulumiCodeChooser -->


    :param str project_id: The unique ID for the project to create the database user.
    :param str role_name: Name of the custom role.
    """
    ...
