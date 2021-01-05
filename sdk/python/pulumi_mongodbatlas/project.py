# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Project']


class Project(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 teams: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectTeamArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        ## Import

        Project must be imported using project ID, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/project:Project my_project 5d09d6a59ccf6445652a444a
        ```

         For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/projects/) - [and MongoDB Atlas API - Teams](https://docs.atlas.mongodb.com/reference/api/teams/) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        :param pulumi.Input[str] org_id: The ID of the organization you want to create the project within.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['name'] = name
            if org_id is None:
                raise TypeError("Missing required property 'org_id'")
            __props__['org_id'] = org_id
            __props__['teams'] = teams
            __props__['cluster_count'] = None
            __props__['created'] = None
        super(Project, __self__).__init__(
            'mongodbatlas:index/project:Project',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_count: Optional[pulumi.Input[int]] = None,
            created: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            teams: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProjectTeamArgs']]]]] = None) -> 'Project':
        """
        Get an existing Project resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] cluster_count: The number of Atlas clusters deployed in the project..
        :param pulumi.Input[str] created: The ISO-8601-formatted timestamp of when Atlas created the project..
        :param pulumi.Input[str] name: The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        :param pulumi.Input[str] org_id: The ID of the organization you want to create the project within.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cluster_count"] = cluster_count
        __props__["created"] = created
        __props__["name"] = name
        __props__["org_id"] = org_id
        __props__["teams"] = teams
        return Project(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterCount")
    def cluster_count(self) -> pulumi.Output[int]:
        """
        The number of Atlas clusters deployed in the project..
        """
        return pulumi.get(self, "cluster_count")

    @property
    @pulumi.getter
    def created(self) -> pulumi.Output[str]:
        """
        The ISO-8601-formatted timestamp of when Atlas created the project..
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        The ID of the organization you want to create the project within.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def teams(self) -> pulumi.Output[Optional[Sequence['outputs.ProjectTeam']]]:
        return pulumi.get(self, "teams")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

