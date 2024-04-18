# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProjectInvitationArgs', 'ProjectInvitation']

@pulumi.input_type
class ProjectInvitationArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 roles: pulumi.Input[Sequence[pulumi.Input[str]]],
                 username: pulumi.Input[str]):
        """
        The set of arguments for constructing a ProjectInvitation resource.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        :param pulumi.Input[str] username: Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "roles", roles)
        pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class _ProjectInvitationState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 invitation_id: Optional[pulumi.Input[str]] = None,
                 inviter_username: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProjectInvitation resources.
        :param pulumi.Input[str] created_at: Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        :param pulumi.Input[str] expires_at: Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        :param pulumi.Input[str] invitation_id: Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        :param pulumi.Input[str] inviter_username: Atlas user who invited `username` to the project.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        :param pulumi.Input[str] username: Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if invitation_id is not None:
            pulumi.set(__self__, "invitation_id", invitation_id)
        if inviter_username is not None:
            pulumi.set(__self__, "inviter_username", inviter_username)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
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
        Atlas user who invited `username` to the project.
        """
        return pulumi.get(self, "inviter_username")

    @inviter_username.setter
    def inviter_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "inviter_username", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class ProjectInvitation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ### S

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectInvitation("test",
            username="test-acc-username",
            project_id="<PROJECT-ID>",
            roles=["GROUP_DATA_ACCESS_READ_WRITE"])
        ```
        <!--End PulumiCodeChooser -->

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectInvitation("test",
            username="test-acc-username",
            project_id="<PROJECT-ID>",
            roles=[
                "GROUP_READ_ONLY",
                "GROUP_DATA_ACCESS_READ_ONLY",
            ])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ~> __IMPORTANT:__
        A project invitation can __not__ be imported once it has been accepted.

        Import a user's invitation to a project by separating the `project_id` and the `username` with a hyphen:

        ```sh
        $ pulumi import mongodbatlas:index/projectInvitation:ProjectInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        :param pulumi.Input[str] username: Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectInvitationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ### S

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectInvitation("test",
            username="test-acc-username",
            project_id="<PROJECT-ID>",
            roles=["GROUP_DATA_ACCESS_READ_WRITE"])
        ```
        <!--End PulumiCodeChooser -->

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectInvitation("test",
            username="test-acc-username",
            project_id="<PROJECT-ID>",
            roles=[
                "GROUP_READ_ONLY",
                "GROUP_DATA_ACCESS_READ_ONLY",
            ])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        ~> __IMPORTANT:__
        A project invitation can __not__ be imported once it has been accepted.

        Import a user's invitation to a project by separating the `project_id` and the `username` with a hyphen:

        ```sh
        $ pulumi import mongodbatlas:index/projectInvitation:ProjectInvitation my_user 1112222b3bf99403840e8934-my_user@mongodb.com
        ```

        :param str resource_name: The name of the resource.
        :param ProjectInvitationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectInvitationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectInvitationArgs.__new__(ProjectInvitationArgs)

            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
            __props__.__dict__["created_at"] = None
            __props__.__dict__["expires_at"] = None
            __props__.__dict__["invitation_id"] = None
            __props__.__dict__["inviter_username"] = None
        super(ProjectInvitation, __self__).__init__(
            'mongodbatlas:index/projectInvitation:ProjectInvitation',
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
            project_id: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'ProjectInvitation':
        """
        Get an existing ProjectInvitation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: Timestamp in ISO 8601 date and time format in UTC when Atlas sent the invitation.
        :param pulumi.Input[str] expires_at: Timestamp in ISO 8601 date and time format in UTC when the invitation expires. Users have 30 days to accept an invitation.
        :param pulumi.Input[str] invitation_id: Unique 24-hexadecimal digit string that identifies the invitation in Atlas.
        :param pulumi.Input[str] inviter_username: Atlas user who invited `username` to the project.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        :param pulumi.Input[str] username: Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectInvitationState.__new__(_ProjectInvitationState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["invitation_id"] = invitation_id
        __props__.__dict__["inviter_username"] = inviter_username
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["roles"] = roles
        __props__.__dict__["username"] = username
        return ProjectInvitation(resource_name, opts=opts, __props__=__props__)

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
        Atlas user who invited `username` to the project.
        """
        return pulumi.get(self, "inviter_username")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies the project to which you want to invite a user.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence[str]]:
        """
        List of Atlas roles to assign to the invited user. If the user accepts the invitation, Atlas assigns these roles to them. Refer to the [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#project-roles) for information on valid roles.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        Email address to which Atlas sent the invitation. The user uses this email address as their Atlas username if they accept this invitation.
        """
        return pulumi.get(self, "username")

