# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TeamsArgs', 'Teams']

@pulumi.input_type
class TeamsArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 usernames: pulumi.Input[Sequence[pulumi.Input[str]]],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Teams resource.
        :param pulumi.Input[str] org_id: The unique identifier for the organization you want to associate the team with.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] usernames: The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        :param pulumi.Input[str] name: The name of the team you want to create.
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "usernames", usernames)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        The unique identifier for the organization you want to associate the team with.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def usernames(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        """
        return pulumi.get(self, "usernames")

    @usernames.setter
    def usernames(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "usernames", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the team you want to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TeamsState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 usernames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Teams resources.
        :param pulumi.Input[str] name: The name of the team you want to create.
        :param pulumi.Input[str] org_id: The unique identifier for the organization you want to associate the team with.
        :param pulumi.Input[str] team_id: The unique identifier for the team.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] usernames: The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)
        if usernames is not None:
            pulumi.set(__self__, "usernames", usernames)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the team you want to create.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the organization you want to associate the team with.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the team.
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_id", value)

    @property
    @pulumi.getter
    def usernames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        """
        return pulumi.get(self, "usernames")

    @usernames.setter
    def usernames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "usernames", value)


class Teams(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 usernames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        `Teams` provides a Team resource. The resource lets you create, edit and delete Teams. Also, Teams can be assigned to multiple projects, and team members’ access to the project is determined by the team’s project role.

        > **IMPORTANT:** MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.Teams("test",
            org_id="<ORGANIZATION-ID>",
            usernames=[
                "user1@email.com",
                "user2@email.com",
                "user3@email.com",
            ])
        ```

        ## Import

        Teams can be imported using the organization ID and team id, in the format ORGID-TEAMID, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/teams:Teams my_team 1112222b3bf99403840e8934-1112222b3bf99403840e8935
        ```

         See detailed information for arguments and attributes[MongoDB API Teams](https://docs.atlas.mongodb.com/reference/api/teams-create-one/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the team you want to create.
        :param pulumi.Input[str] org_id: The unique identifier for the organization you want to associate the team with.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] usernames: The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `Teams` provides a Team resource. The resource lets you create, edit and delete Teams. Also, Teams can be assigned to multiple projects, and team members’ access to the project is determined by the team’s project role.

        > **IMPORTANT:** MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        MongoDB Atlas Team limits: max 250 teams in an organization and max 100 teams per project.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.Teams("test",
            org_id="<ORGANIZATION-ID>",
            usernames=[
                "user1@email.com",
                "user2@email.com",
                "user3@email.com",
            ])
        ```

        ## Import

        Teams can be imported using the organization ID and team id, in the format ORGID-TEAMID, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/teams:Teams my_team 1112222b3bf99403840e8934-1112222b3bf99403840e8935
        ```

         See detailed information for arguments and attributes[MongoDB API Teams](https://docs.atlas.mongodb.com/reference/api/teams-create-one/)

        :param str resource_name: The name of the resource.
        :param TeamsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 usernames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamsArgs.__new__(TeamsArgs)

            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if usernames is None and not opts.urn:
                raise TypeError("Missing required property 'usernames'")
            __props__.__dict__["usernames"] = usernames
            __props__.__dict__["team_id"] = None
        super(Teams, __self__).__init__(
            'mongodbatlas:index/teams:Teams',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            team_id: Optional[pulumi.Input[str]] = None,
            usernames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'Teams':
        """
        Get an existing Teams resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the team you want to create.
        :param pulumi.Input[str] org_id: The unique identifier for the organization you want to associate the team with.
        :param pulumi.Input[str] team_id: The unique identifier for the team.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] usernames: The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamsState.__new__(_TeamsState)

        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["team_id"] = team_id
        __props__.__dict__["usernames"] = usernames
        return Teams(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the team you want to create.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the organization you want to associate the team with.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the team.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter
    def usernames(self) -> pulumi.Output[Sequence[str]]:
        """
        The Atlas usernames (email address). You can only add Atlas users who are part of the organization. Users who have not accepted an invitation to join the organization cannot be added as team members. There is a maximum of 250 Atlas users per team.
        """
        return pulumi.get(self, "usernames")

