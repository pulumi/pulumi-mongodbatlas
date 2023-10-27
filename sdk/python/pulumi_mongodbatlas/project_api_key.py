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

__all__ = ['ProjectApiKeyArgs', 'ProjectApiKey']

@pulumi.input_type
class ProjectApiKeyArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 project_assignments: Optional[pulumi.Input[Sequence[pulumi.Input['ProjectApiKeyProjectAssignmentArgs']]]] = None):
        """
        The set of arguments for constructing a ProjectApiKey resource.
        :param pulumi.Input[str] description: Description of this Project API key.
               
               > **NOTE:** Project created by API Keys must belong to an existing organization.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        """
        pulumi.set(__self__, "description", description)
        pulumi.set(__self__, "project_id", project_id)
        if project_assignments is not None:
            pulumi.set(__self__, "project_assignments", project_assignments)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description of this Project API key.

        > **NOTE:** Project created by API Keys must belong to an existing organization.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="projectAssignments")
    def project_assignments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProjectApiKeyProjectAssignmentArgs']]]]:
        return pulumi.get(self, "project_assignments")

    @project_assignments.setter
    def project_assignments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProjectApiKeyProjectAssignmentArgs']]]]):
        pulumi.set(self, "project_assignments", value)


@pulumi.input_type
class _ProjectApiKeyState:
    def __init__(__self__, *,
                 api_key_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 private_key: Optional[pulumi.Input[str]] = None,
                 project_assignments: Optional[pulumi.Input[Sequence[pulumi.Input['ProjectApiKeyProjectAssignmentArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 public_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProjectApiKey resources.
        :param pulumi.Input[str] api_key_id: Unique identifier for this Project API key.
        :param pulumi.Input[str] description: Description of this Project API key.
               
               > **NOTE:** Project created by API Keys must belong to an existing organization.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        """
        if api_key_id is not None:
            pulumi.set(__self__, "api_key_id", api_key_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if private_key is not None:
            pulumi.set(__self__, "private_key", private_key)
        if project_assignments is not None:
            pulumi.set(__self__, "project_assignments", project_assignments)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if public_key is not None:
            pulumi.set(__self__, "public_key", public_key)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for this Project API key.
        """
        return pulumi.get(self, "api_key_id")

    @api_key_id.setter
    def api_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of this Project API key.

        > **NOTE:** Project created by API Keys must belong to an existing organization.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "private_key")

    @private_key.setter
    def private_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_key", value)

    @property
    @pulumi.getter(name="projectAssignments")
    def project_assignments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProjectApiKeyProjectAssignmentArgs']]]]:
        return pulumi.get(self, "project_assignments")

    @project_assignments.setter
    def project_assignments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProjectApiKeyProjectAssignmentArgs']]]]):
        pulumi.set(self, "project_assignments", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "public_key")

    @public_key.setter
    def public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key", value)


class ProjectApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectApiKeyProjectAssignmentArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage
        ### Create And Assign PAK Together

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectApiKey("test",
            description="Description of your API key",
            project_assignments=[mongodbatlas.ProjectApiKeyProjectAssignmentArgs(
                project_id="64259ee860c43338194b0f8e",
                role_names=["GROUP_OWNER"],
            )],
            project_id="64259ee860c43338194b0f8e")
        ```
        ### Create And Assign PAK To Multiple Projects

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectApiKey("test",
            description="Description of your API key",
            project_assignments=[
                mongodbatlas.ProjectApiKeyProjectAssignmentArgs(
                    project_id="64259ee860c43338194b0f8e",
                    role_names=[
                        "GROUP_READ_ONLY",
                        "GROUP_OWNER",
                    ],
                ),
                mongodbatlas.ProjectApiKeyProjectAssignmentArgs(
                    project_id="74259ee860c43338194b0f8e",
                    role_names=["GROUP_READ_ONLY"],
                ),
            ],
            project_id="64259ee860c43338194b0f8e")
        ```

        ## Import

        API Keys must be imported using org ID, API Key ID e.g.

        ```sh
         $ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
        ```
         See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information. See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of this Project API key.
               
               > **NOTE:** Project created by API Keys must belong to an existing organization.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProjectApiKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage
        ### Create And Assign PAK Together

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectApiKey("test",
            description="Description of your API key",
            project_assignments=[mongodbatlas.ProjectApiKeyProjectAssignmentArgs(
                project_id="64259ee860c43338194b0f8e",
                role_names=["GROUP_OWNER"],
            )],
            project_id="64259ee860c43338194b0f8e")
        ```
        ### Create And Assign PAK To Multiple Projects

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.ProjectApiKey("test",
            description="Description of your API key",
            project_assignments=[
                mongodbatlas.ProjectApiKeyProjectAssignmentArgs(
                    project_id="64259ee860c43338194b0f8e",
                    role_names=[
                        "GROUP_READ_ONLY",
                        "GROUP_OWNER",
                    ],
                ),
                mongodbatlas.ProjectApiKeyProjectAssignmentArgs(
                    project_id="74259ee860c43338194b0f8e",
                    role_names=["GROUP_READ_ONLY"],
                ),
            ],
            project_id="64259ee860c43338194b0f8e")
        ```

        ## Import

        API Keys must be imported using org ID, API Key ID e.g.

        ```sh
         $ pulumi import mongodbatlas:index/projectApiKey:ProjectApiKey test 5d09d6a59ccf6445652a444a-6576974933969669
        ```
         See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information. See [MongoDB Atlas API - API Key](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Programmatic-API-Keys/operation/createProjectApiKey) - Documentation for more information.

        :param str resource_name: The name of the resource.
        :param ProjectApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProjectApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 project_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectApiKeyProjectAssignmentArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProjectApiKeyArgs.__new__(ProjectApiKeyArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["project_assignments"] = project_assignments
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["api_key_id"] = None
            __props__.__dict__["private_key"] = None
            __props__.__dict__["public_key"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["privateKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ProjectApiKey, __self__).__init__(
            'mongodbatlas:index/projectApiKey:ProjectApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_key_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            private_key: Optional[pulumi.Input[str]] = None,
            project_assignments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectApiKeyProjectAssignmentArgs']]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            public_key: Optional[pulumi.Input[str]] = None) -> 'ProjectApiKey':
        """
        Get an existing ProjectApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_key_id: Unique identifier for this Project API key.
        :param pulumi.Input[str] description: Description of this Project API key.
               
               > **NOTE:** Project created by API Keys must belong to an existing organization.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProjectApiKeyState.__new__(_ProjectApiKeyState)

        __props__.__dict__["api_key_id"] = api_key_id
        __props__.__dict__["description"] = description
        __props__.__dict__["private_key"] = private_key
        __props__.__dict__["project_assignments"] = project_assignments
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["public_key"] = public_key
        return ProjectApiKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiKeyId")
    def api_key_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for this Project API key.
        """
        return pulumi.get(self, "api_key_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of this Project API key.

        > **NOTE:** Project created by API Keys must belong to an existing organization.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="privateKey")
    def private_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "private_key")

    @property
    @pulumi.getter(name="projectAssignments")
    def project_assignments(self) -> pulumi.Output[Optional[Sequence['outputs.ProjectApiKeyProjectAssignment']]]:
        return pulumi.get(self, "project_assignments")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="publicKey")
    def public_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "public_key")

