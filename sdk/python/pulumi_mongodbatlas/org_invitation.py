# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['OrgInvitationArgs', 'OrgInvitation']

@pulumi.input_type
class OrgInvitationArgs:
    def __init__(__self__, *,
                 org_id: pulumi.Input[str],
                 roles: pulumi.Input[Sequence[pulumi.Input[str]]],
                 username: pulumi.Input[str],
                 teams_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a OrgInvitation resource.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        :param pulumi.Input[str] username: Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams_ids: An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        """
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "roles", roles)
        pulumi.set(__self__, "username", username)
        if teams_ids is not None:
            pulumi.set(__self__, "teams_ids", teams_ids)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter(name="teamsIds")
    def teams_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        """
        return pulumi.get(self, "teams_ids")

    @teams_ids.setter
    def teams_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "teams_ids", value)


@pulumi.input_type
class _OrgInvitationState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 invitation_id: Optional[pulumi.Input[str]] = None,
                 inviter_username: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 teams_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrgInvitation resources.
        :param pulumi.Input[str] created_at: Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        :param pulumi.Input[str] expires_at: Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        :param pulumi.Input[str] invitation_id: Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        :param pulumi.Input[str] inviter_username: Atlas user who invited `username` to the organization.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams_ids: An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        :param pulumi.Input[str] username: Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if invitation_id is not None:
            pulumi.set(__self__, "invitation_id", invitation_id)
        if inviter_username is not None:
            pulumi.set(__self__, "inviter_username", inviter_username)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if teams_ids is not None:
            pulumi.set(__self__, "teams_ids", teams_ids)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter(name="invitationId")
    def invitation_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        """
        return pulumi.get(self, "invitation_id")

    @invitation_id.setter
    def invitation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "invitation_id", value)

    @property
    @pulumi.getter(name="inviterUsername")
    def inviter_username(self) -> Optional[pulumi.Input[str]]:
        """
        Atlas user who invited `username` to the organization.
        """
        return pulumi.get(self, "inviter_username")

    @inviter_username.setter
    def inviter_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inviter_username", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="teamsIds")
    def teams_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        """
        return pulumi.get(self, "teams_ids")

    @teams_ids.setter
    def teams_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "teams_ids", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class OrgInvitation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 teams_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test0 = mongodbatlas.OrgInvitation("test0",
            org_id="<ORG-ID>",
            roles=["ORG_OWNER"],
            username="test0-acc-username")
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test0 = mongodbatlas.OrgInvitation("test0",
            org_id="<ORG-ID>",
            roles=[
                "ORG_MEMBER",
                "ORG_BILLING_ADMIN",
            ],
            username="test0-acc-username")
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test1 = mongodbatlas.OrgInvitation("test1",
            org_id="<ORG-ID>",
            roles=["ORG_MEMBER"],
            teams_ids=[
                "<TEAM-0-ID>",
                "<TEAM-1-ID>",
            ],
            username="test1-acc-username")
        ```

        ## Import

        ~> **IMPORTANT:** An organization invitation can **not** be imported once it has been accepted. Import a user's invitation to an organization by separating the `org_id` and the `username` with a hyphen

        ```sh
         $ pulumi import mongodbatlas:index/orgInvitation:OrgInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams_ids: An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        :param pulumi.Input[str] username: Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrgInvitationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test0 = mongodbatlas.OrgInvitation("test0",
            org_id="<ORG-ID>",
            roles=["ORG_OWNER"],
            username="test0-acc-username")
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test0 = mongodbatlas.OrgInvitation("test0",
            org_id="<ORG-ID>",
            roles=[
                "ORG_MEMBER",
                "ORG_BILLING_ADMIN",
            ],
            username="test0-acc-username")
        ```

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test1 = mongodbatlas.OrgInvitation("test1",
            org_id="<ORG-ID>",
            roles=["ORG_MEMBER"],
            teams_ids=[
                "<TEAM-0-ID>",
                "<TEAM-1-ID>",
            ],
            username="test1-acc-username")
        ```

        ## Import

        ~> **IMPORTANT:** An organization invitation can **not** be imported once it has been accepted. Import a user's invitation to an organization by separating the `org_id` and the `username` with a hyphen

        ```sh
         $ pulumi import mongodbatlas:index/orgInvitation:OrgInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
        ```

        :param str resource_name: The name of the resource.
        :param OrgInvitationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrgInvitationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 teams_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrgInvitationArgs.__new__(OrgInvitationArgs)

            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            __props__.__dict__["teams_ids"] = teams_ids
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["created_at"] = None
            __props__.__dict__["expires_at"] = None
            __props__.__dict__["invitation_id"] = None
            __props__.__dict__["inviter_username"] = None
        super(OrgInvitation, __self__).__init__(
            'mongodbatlas:index/orgInvitation:OrgInvitation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            invitation_id: Optional[pulumi.Input[str]] = None,
            inviter_username: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            teams_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'OrgInvitation':
        """
        Get an existing OrgInvitation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        :param pulumi.Input[str] expires_at: Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        :param pulumi.Input[str] invitation_id: Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        :param pulumi.Input[str] inviter_username: Atlas user who invited `username` to the organization.
        :param pulumi.Input[str] org_id: Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] teams_ids: An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        :param pulumi.Input[str] username: Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrgInvitationState.__new__(_OrgInvitationState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["invitation_id"] = invitation_id
        __props__.__dict__["inviter_username"] = inviter_username
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["roles"] = roles
        __props__.__dict__["teams_ids"] = teams_ids
        __props__.__dict__["username"] = username
        return OrgInvitation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[str]:
        """
        Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter(name="invitationId")
    def invitation_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        """
        return pulumi.get(self, "invitation_id")

    @property
    @pulumi.getter(name="inviterUsername")
    def inviter_username(self) -> pulumi.Output[str]:
        """
        Atlas user who invited `username` to the organization.
        """
        return pulumi.get(self, "inviter_username")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the organization to which you want to invite a user.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence[str]]:
        """
        Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#organization-roles) describes the roles a user can have.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="teamsIds")
    def teams_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        An array of unique 24-hexadecimal digit strings that identify the teams that the user was invited to join.
        """
        return pulumi.get(self, "teams_ids")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        Email address of the invited user. This is the address to which Atlas sends the invite. If the user accepts the invitation, they log in to Atlas with this username.
        """
        return pulumi.get(self, "username")

