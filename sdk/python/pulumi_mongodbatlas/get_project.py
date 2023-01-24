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

__all__ = [
    'GetProjectResult',
    'AwaitableGetProjectResult',
    'get_project',
    'get_project_output',
]

@pulumi.output_type
class GetProjectResult:
    """
    A collection of values returned by getProject.
    """
    def __init__(__self__, api_keys=None, cluster_count=None, created=None, id=None, is_collect_database_specifics_statistics_enabled=None, is_data_explorer_enabled=None, is_performance_advisor_enabled=None, is_realtime_performance_panel_enabled=None, is_schema_advisor_enabled=None, name=None, org_id=None, project_id=None, region_usage_restrictions=None, teams=None):
        if api_keys and not isinstance(api_keys, list):
            raise TypeError("Expected argument 'api_keys' to be a list")
        pulumi.set(__self__, "api_keys", api_keys)
        if cluster_count and not isinstance(cluster_count, int):
            raise TypeError("Expected argument 'cluster_count' to be a int")
        pulumi.set(__self__, "cluster_count", cluster_count)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_collect_database_specifics_statistics_enabled and not isinstance(is_collect_database_specifics_statistics_enabled, bool):
            raise TypeError("Expected argument 'is_collect_database_specifics_statistics_enabled' to be a bool")
        pulumi.set(__self__, "is_collect_database_specifics_statistics_enabled", is_collect_database_specifics_statistics_enabled)
        if is_data_explorer_enabled and not isinstance(is_data_explorer_enabled, bool):
            raise TypeError("Expected argument 'is_data_explorer_enabled' to be a bool")
        pulumi.set(__self__, "is_data_explorer_enabled", is_data_explorer_enabled)
        if is_performance_advisor_enabled and not isinstance(is_performance_advisor_enabled, bool):
            raise TypeError("Expected argument 'is_performance_advisor_enabled' to be a bool")
        pulumi.set(__self__, "is_performance_advisor_enabled", is_performance_advisor_enabled)
        if is_realtime_performance_panel_enabled and not isinstance(is_realtime_performance_panel_enabled, bool):
            raise TypeError("Expected argument 'is_realtime_performance_panel_enabled' to be a bool")
        pulumi.set(__self__, "is_realtime_performance_panel_enabled", is_realtime_performance_panel_enabled)
        if is_schema_advisor_enabled and not isinstance(is_schema_advisor_enabled, bool):
            raise TypeError("Expected argument 'is_schema_advisor_enabled' to be a bool")
        pulumi.set(__self__, "is_schema_advisor_enabled", is_schema_advisor_enabled)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if region_usage_restrictions and not isinstance(region_usage_restrictions, str):
            raise TypeError("Expected argument 'region_usage_restrictions' to be a str")
        pulumi.set(__self__, "region_usage_restrictions", region_usage_restrictions)
        if teams and not isinstance(teams, list):
            raise TypeError("Expected argument 'teams' to be a list")
        pulumi.set(__self__, "teams", teams)

    @property
    @pulumi.getter(name="apiKeys")
    def api_keys(self) -> Sequence['outputs.GetProjectApiKeyResult']:
        return pulumi.get(self, "api_keys")

    @property
    @pulumi.getter(name="clusterCount")
    def cluster_count(self) -> int:
        """
        The number of Atlas clusters deployed in the project.
        """
        return pulumi.get(self, "cluster_count")

    @property
    @pulumi.getter
    def created(self) -> str:
        """
        The ISO-8601-formatted timestamp of when Atlas created the project.
        * `teams.#.team_id` - The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
        * `teams.#.role_names` - Each string in the array represents a project role assigned to the team. Every user associated with the team inherits these roles.
        The following are valid roles:
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isCollectDatabaseSpecificsStatisticsEnabled")
    def is_collect_database_specifics_statistics_enabled(self) -> bool:
        """
        Flag that indicates whether to enable statistics in [cluster metrics](https://www.mongodb.com/docs/atlas/monitor-cluster-metrics/) collection for the project.
        """
        return pulumi.get(self, "is_collect_database_specifics_statistics_enabled")

    @property
    @pulumi.getter(name="isDataExplorerEnabled")
    def is_data_explorer_enabled(self) -> bool:
        """
        Flag that indicates whether to enable Data Explorer for the project. If enabled, you can query your database with an easy to use interface.
        """
        return pulumi.get(self, "is_data_explorer_enabled")

    @property
    @pulumi.getter(name="isPerformanceAdvisorEnabled")
    def is_performance_advisor_enabled(self) -> bool:
        """
        Flag that indicates whether to enable Performance Advisor and Profiler for the project. If enabled, you can analyze database logs to recommend performance improvements.
        """
        return pulumi.get(self, "is_performance_advisor_enabled")

    @property
    @pulumi.getter(name="isRealtimePerformancePanelEnabled")
    def is_realtime_performance_panel_enabled(self) -> bool:
        """
        Flag that indicates whether to enable Real Time Performance Panel for the project. If enabled, you can see real time metrics from your MongoDB database.
        """
        return pulumi.get(self, "is_realtime_performance_panel_enabled")

    @property
    @pulumi.getter(name="isSchemaAdvisorEnabled")
    def is_schema_advisor_enabled(self) -> bool:
        """
        Flag that indicates whether to enable Schema Advisor for the project. If enabled, you receive customized recommendations to optimize your data model and enhance performance. Disable this setting to disable schema suggestions in the [Performance Advisor](https://www.mongodb.com/docs/atlas/performance-advisor/#std-label-performance-advisor) and the [Data Explorer](https://www.mongodb.com/docs/atlas/atlas-ui/#std-label-atlas-ui).
        """
        return pulumi.get(self, "is_schema_advisor_enabled")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the project you want to create. (Cannot be changed via this Provider after creation.)
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        The ID of the organization you want to create the project within.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="regionUsageRestrictions")
    def region_usage_restrictions(self) -> str:
        """
        If GOV_REGIONS_ONLY the project can be used for government regions only, otherwise defaults to standard regions. For more information see [MongoDB Atlas for Government](https://www.mongodb.com/docs/atlas/government/api/#creating-a-project).
        """
        return pulumi.get(self, "region_usage_restrictions")

    @property
    @pulumi.getter
    def teams(self) -> Sequence['outputs.GetProjectTeamResult']:
        return pulumi.get(self, "teams")


class AwaitableGetProjectResult(GetProjectResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectResult(
            api_keys=self.api_keys,
            cluster_count=self.cluster_count,
            created=self.created,
            id=self.id,
            is_collect_database_specifics_statistics_enabled=self.is_collect_database_specifics_statistics_enabled,
            is_data_explorer_enabled=self.is_data_explorer_enabled,
            is_performance_advisor_enabled=self.is_performance_advisor_enabled,
            is_realtime_performance_panel_enabled=self.is_realtime_performance_panel_enabled,
            is_schema_advisor_enabled=self.is_schema_advisor_enabled,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            region_usage_restrictions=self.region_usage_restrictions,
            teams=self.teams)


def get_project(name: Optional[str] = None,
                project_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectResult:
    """
    `Project` describes a MongoDB Atlas Project. This represents a project that has been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage


    :param str name: The unique ID for the project.
    :param str project_id: The unique ID for the project.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getProject:getProject', __args__, opts=opts, typ=GetProjectResult).value

    return AwaitableGetProjectResult(
        api_keys=__ret__.api_keys,
        cluster_count=__ret__.cluster_count,
        created=__ret__.created,
        id=__ret__.id,
        is_collect_database_specifics_statistics_enabled=__ret__.is_collect_database_specifics_statistics_enabled,
        is_data_explorer_enabled=__ret__.is_data_explorer_enabled,
        is_performance_advisor_enabled=__ret__.is_performance_advisor_enabled,
        is_realtime_performance_panel_enabled=__ret__.is_realtime_performance_panel_enabled,
        is_schema_advisor_enabled=__ret__.is_schema_advisor_enabled,
        name=__ret__.name,
        org_id=__ret__.org_id,
        project_id=__ret__.project_id,
        region_usage_restrictions=__ret__.region_usage_restrictions,
        teams=__ret__.teams)


@_utilities.lift_output_func(get_project)
def get_project_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                       project_id: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetProjectResult]:
    """
    `Project` describes a MongoDB Atlas Project. This represents a project that has been created.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage


    :param str name: The unique ID for the project.
    :param str project_id: The unique ID for the project.
    """
    ...
