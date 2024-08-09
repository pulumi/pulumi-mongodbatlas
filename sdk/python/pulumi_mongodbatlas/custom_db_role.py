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

__all__ = ['CustomDbRoleArgs', 'CustomDbRole']

@pulumi.input_type
class CustomDbRoleArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 role_name: pulumi.Input[str],
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleActionArgs']]]] = None,
                 inherited_roles: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleInheritedRoleArgs']]]] = None):
        """
        The set of arguments for constructing a CustomDbRole resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to create the database user.
        :param pulumi.Input[str] role_name: Name of the custom role.
               
               > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
               
               * Is a name already used by an existing custom role in the project
               * Is a name of any of the built-in roles
               * Is `atlasAdmin`
               * Starts with `xgen-`
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "role_name", role_name)
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if inherited_roles is not None:
            pulumi.set(__self__, "inherited_roles", inherited_roles)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique ID for the project to create the database user.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[str]:
        """
        Name of the custom role.

        > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:

        * Is a name already used by an existing custom role in the project
        * Is a name of any of the built-in roles
        * Is `atlasAdmin`
        * Starts with `xgen-`
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleActionArgs']]]]:
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter(name="inheritedRoles")
    def inherited_roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleInheritedRoleArgs']]]]:
        return pulumi.get(self, "inherited_roles")

    @inherited_roles.setter
    def inherited_roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleInheritedRoleArgs']]]]):
        pulumi.set(self, "inherited_roles", value)


@pulumi.input_type
class _CustomDbRoleState:
    def __init__(__self__, *,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleActionArgs']]]] = None,
                 inherited_roles: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleInheritedRoleArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomDbRole resources.
        :param pulumi.Input[str] project_id: The unique ID for the project to create the database user.
        :param pulumi.Input[str] role_name: Name of the custom role.
               
               > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
               
               * Is a name already used by an existing custom role in the project
               * Is a name of any of the built-in roles
               * Is `atlasAdmin`
               * Starts with `xgen-`
        """
        if actions is not None:
            pulumi.set(__self__, "actions", actions)
        if inherited_roles is not None:
            pulumi.set(__self__, "inherited_roles", inherited_roles)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)

    @property
    @pulumi.getter
    def actions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleActionArgs']]]]:
        return pulumi.get(self, "actions")

    @actions.setter
    def actions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleActionArgs']]]]):
        pulumi.set(self, "actions", value)

    @property
    @pulumi.getter(name="inheritedRoles")
    def inherited_roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleInheritedRoleArgs']]]]:
        return pulumi.get(self, "inherited_roles")

    @inherited_roles.setter
    def inherited_roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomDbRoleInheritedRoleArgs']]]]):
        pulumi.set(self, "inherited_roles", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID for the project to create the database user.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the custom role.

        > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:

        * Is a name already used by an existing custom role in the project
        * Is a name of any of the built-in roles
        * Is `atlasAdmin`
        * Starts with `xgen-`
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)


class CustomDbRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDbRoleActionArgs', 'CustomDbRoleActionArgsDict']]]]] = None,
                 inherited_roles: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDbRoleInheritedRoleArgs', 'CustomDbRoleInheritedRoleArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## # Resource: CustomDbRole

        `CustomDbRole` provides a Custom DB Role resource. The customDBRoles resource lets you retrieve, create and modify the custom MongoDB roles in your cluster. Use custom MongoDB roles to specify custom sets of actions which cannot be described by the built-in Atlas database user privileges.

        > **IMPORTANT**  You define custom roles at the project level for all clusters in the project. The `CustomDbRole` resource supports a subset of MongoDB privilege actions. For a complete list of [privilege actions](https://docs.mongodb.com/manual/reference/privilege-actions/) available for this resource, see [Custom Role actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions/). Custom roles must include actions that all project's clusters support, and that are compatible with each MongoDB version used by your project's clusters. For example, if your project has MongoDB 4.2 clusters, you can't create custom roles that use actions introduced in MongoDB 4.4.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test_role = mongodbatlas.CustomDbRole("test_role",
            project_id="<PROJECT-ID>",
            role_name="myCustomRole",
            actions=[
                {
                    "action": "UPDATE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
                {
                    "action": "INSERT",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
                {
                    "action": "REMOVE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
            ])
        ```

        ### With Inherited Roles

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        inherited_role_one = mongodbatlas.CustomDbRole("inherited_role_one",
            project_id="<PROJECT-ID>",
            role_name="insertRole",
            actions=[{
                "action": "INSERT",
                "resources": [{
                    "collection_name": "",
                    "database_name": "anyDatabase",
                }],
            }])
        inherited_role_two = mongodbatlas.CustomDbRole("inherited_role_two",
            project_id=inherited_role_one.project_id,
            role_name="statusServerRole",
            actions=[{
                "action": "SERVER_STATUS",
                "resources": [{
                    "cluster": True,
                }],
            }])
        test_role = mongodbatlas.CustomDbRole("test_role",
            project_id=inherited_role_one.project_id,
            role_name="myCustomRole",
            actions=[
                {
                    "action": "UPDATE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
                {
                    "action": "REMOVE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
            ],
            inherited_roles=[
                {
                    "role_name": inherited_role_one.role_name,
                    "database_name": "admin",
                },
                {
                    "role_name": inherited_role_two.role_name,
                    "database_name": "admin",
                },
            ])
        ```

        ## Import

        Database users can be imported using project ID and username, in the format `PROJECTID-ROLENAME`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/customDbRole:CustomDbRole my_role 1112222b3bf99403840e8934-MyCustomRole
        ```
        For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/custom-roles/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to create the database user.
        :param pulumi.Input[str] role_name: Name of the custom role.
               
               > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
               
               * Is a name already used by an existing custom role in the project
               * Is a name of any of the built-in roles
               * Is `atlasAdmin`
               * Starts with `xgen-`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomDbRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Resource: CustomDbRole

        `CustomDbRole` provides a Custom DB Role resource. The customDBRoles resource lets you retrieve, create and modify the custom MongoDB roles in your cluster. Use custom MongoDB roles to specify custom sets of actions which cannot be described by the built-in Atlas database user privileges.

        > **IMPORTANT**  You define custom roles at the project level for all clusters in the project. The `CustomDbRole` resource supports a subset of MongoDB privilege actions. For a complete list of [privilege actions](https://docs.mongodb.com/manual/reference/privilege-actions/) available for this resource, see [Custom Role actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions/). Custom roles must include actions that all project's clusters support, and that are compatible with each MongoDB version used by your project's clusters. For example, if your project has MongoDB 4.2 clusters, you can't create custom roles that use actions introduced in MongoDB 4.4.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test_role = mongodbatlas.CustomDbRole("test_role",
            project_id="<PROJECT-ID>",
            role_name="myCustomRole",
            actions=[
                {
                    "action": "UPDATE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
                {
                    "action": "INSERT",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
                {
                    "action": "REMOVE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
            ])
        ```

        ### With Inherited Roles

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        inherited_role_one = mongodbatlas.CustomDbRole("inherited_role_one",
            project_id="<PROJECT-ID>",
            role_name="insertRole",
            actions=[{
                "action": "INSERT",
                "resources": [{
                    "collection_name": "",
                    "database_name": "anyDatabase",
                }],
            }])
        inherited_role_two = mongodbatlas.CustomDbRole("inherited_role_two",
            project_id=inherited_role_one.project_id,
            role_name="statusServerRole",
            actions=[{
                "action": "SERVER_STATUS",
                "resources": [{
                    "cluster": True,
                }],
            }])
        test_role = mongodbatlas.CustomDbRole("test_role",
            project_id=inherited_role_one.project_id,
            role_name="myCustomRole",
            actions=[
                {
                    "action": "UPDATE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
                {
                    "action": "REMOVE",
                    "resources": [{
                        "collection_name": "",
                        "database_name": "anyDatabase",
                    }],
                },
            ],
            inherited_roles=[
                {
                    "role_name": inherited_role_one.role_name,
                    "database_name": "admin",
                },
                {
                    "role_name": inherited_role_two.role_name,
                    "database_name": "admin",
                },
            ])
        ```

        ## Import

        Database users can be imported using project ID and username, in the format `PROJECTID-ROLENAME`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/customDbRole:CustomDbRole my_role 1112222b3bf99403840e8934-MyCustomRole
        ```
        For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/custom-roles/)

        :param str resource_name: The name of the resource.
        :param CustomDbRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomDbRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDbRoleActionArgs', 'CustomDbRoleActionArgsDict']]]]] = None,
                 inherited_roles: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDbRoleInheritedRoleArgs', 'CustomDbRoleInheritedRoleArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomDbRoleArgs.__new__(CustomDbRoleArgs)

            __props__.__dict__["actions"] = actions
            __props__.__dict__["inherited_roles"] = inherited_roles
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
        super(CustomDbRole, __self__).__init__(
            'mongodbatlas:index/customDbRole:CustomDbRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDbRoleActionArgs', 'CustomDbRoleActionArgsDict']]]]] = None,
            inherited_roles: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomDbRoleInheritedRoleArgs', 'CustomDbRoleInheritedRoleArgsDict']]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            role_name: Optional[pulumi.Input[str]] = None) -> 'CustomDbRole':
        """
        Get an existing CustomDbRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to create the database user.
        :param pulumi.Input[str] role_name: Name of the custom role.
               
               > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:
               
               * Is a name already used by an existing custom role in the project
               * Is a name of any of the built-in roles
               * Is `atlasAdmin`
               * Starts with `xgen-`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomDbRoleState.__new__(_CustomDbRoleState)

        __props__.__dict__["actions"] = actions
        __props__.__dict__["inherited_roles"] = inherited_roles
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["role_name"] = role_name
        return CustomDbRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Optional[Sequence['outputs.CustomDbRoleAction']]]:
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="inheritedRoles")
    def inherited_roles(self) -> pulumi.Output[Optional[Sequence['outputs.CustomDbRoleInheritedRole']]]:
        return pulumi.get(self, "inherited_roles")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project to create the database user.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        Name of the custom role.

        > **IMPORTANT** The specified role name can only contain letters, digits, underscores, and dashes. Additionally, you cannot specify a role name which meets any of the following criteria:

        * Is a name already used by an existing custom role in the project
        * Is a name of any of the built-in roles
        * Is `atlasAdmin`
        * Starts with `xgen-`
        """
        return pulumi.get(self, "role_name")

