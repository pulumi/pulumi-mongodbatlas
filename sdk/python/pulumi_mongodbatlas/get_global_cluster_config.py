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
    'GetGlobalClusterConfigResult',
    'AwaitableGetGlobalClusterConfigResult',
    'get_global_cluster_config',
    'get_global_cluster_config_output',
]

@pulumi.output_type
class GetGlobalClusterConfigResult:
    """
    A collection of values returned by getGlobalClusterConfig.
    """
    def __init__(__self__, cluster_name=None, custom_zone_mapping=None, id=None, managed_namespaces=None, project_id=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if custom_zone_mapping and not isinstance(custom_zone_mapping, dict):
            raise TypeError("Expected argument 'custom_zone_mapping' to be a dict")
        pulumi.set(__self__, "custom_zone_mapping", custom_zone_mapping)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if managed_namespaces and not isinstance(managed_namespaces, list):
            raise TypeError("Expected argument 'managed_namespaces' to be a list")
        pulumi.set(__self__, "managed_namespaces", managed_namespaces)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="customZoneMapping")
    def custom_zone_mapping(self) -> Mapping[str, Any]:
        """
        A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        """
        return pulumi.get(self, "custom_zone_mapping")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="managedNamespaces")
    def managed_namespaces(self) -> Sequence['outputs.GetGlobalClusterConfigManagedNamespaceResult']:
        """
        Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        """
        return pulumi.get(self, "managed_namespaces")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")


class AwaitableGetGlobalClusterConfigResult(GetGlobalClusterConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalClusterConfigResult(
            cluster_name=self.cluster_name,
            custom_zone_mapping=self.custom_zone_mapping,
            id=self.id,
            managed_namespaces=self.managed_namespaces,
            project_id=self.project_id)


def get_global_cluster_config(cluster_name: Optional[str] = None,
                              managed_namespaces: Optional[Sequence[pulumi.InputType['GetGlobalClusterConfigManagedNamespaceArgs']]] = None,
                              project_id: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalClusterConfigResult:
    """
    `GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.Cluster("test",
        project_id="<YOUR-PROJECT-ID>",
        name="<CLUSTER-NAME>",
        cloud_backup=True,
        cluster_type="GEOSHARDED",
        provider_name="AWS",
        provider_instance_size_name="M30",
        replication_specs=[
            mongodbatlas.ClusterReplicationSpecArgs(
                zone_name="Zone 1",
                num_shards=2,
                regions_configs=[mongodbatlas.ClusterReplicationSpecRegionsConfigArgs(
                    region_name="EU_CENTRAL_1",
                    electable_nodes=3,
                    priority=7,
                    read_only_nodes=0,
                )],
            ),
            mongodbatlas.ClusterReplicationSpecArgs(
                zone_name="Zone 2",
                num_shards=2,
                regions_configs=[mongodbatlas.ClusterReplicationSpecRegionsConfigArgs(
                    region_name="US_EAST_2",
                    electable_nodes=3,
                    priority=7,
                    read_only_nodes=0,
                )],
            ),
        ])
    config_global_cluster_config = mongodbatlas.GlobalClusterConfig("config",
        project_id=test.project_id,
        cluster_name=test.name,
        managed_namespaces=[mongodbatlas.GlobalClusterConfigManagedNamespaceArgs(
            db="mydata",
            collection="publishers",
            custom_shard_key="city",
        )],
        custom_zone_mappings=[mongodbatlas.GlobalClusterConfigCustomZoneMappingArgs(
            location="CA",
            zone="Zone 1",
        )])
    config = mongodbatlas.get_global_cluster_config_output(project_id=config_global_cluster_config.project_id,
        cluster_name=config_global_cluster_config.cluster_name)
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetGlobalClusterConfigManagedNamespaceArgs']] managed_namespaces: Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
    :param str project_id: The unique ID for the project to create the database user.
           * `cluster_name - (Required) The name of the Global Cluster.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['managedNamespaces'] = managed_namespaces
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getGlobalClusterConfig:getGlobalClusterConfig', __args__, opts=opts, typ=GetGlobalClusterConfigResult).value

    return AwaitableGetGlobalClusterConfigResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        custom_zone_mapping=pulumi.get(__ret__, 'custom_zone_mapping'),
        id=pulumi.get(__ret__, 'id'),
        managed_namespaces=pulumi.get(__ret__, 'managed_namespaces'),
        project_id=pulumi.get(__ret__, 'project_id'))


@_utilities.lift_output_func(get_global_cluster_config)
def get_global_cluster_config_output(cluster_name: Optional[pulumi.Input[str]] = None,
                                     managed_namespaces: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetGlobalClusterConfigManagedNamespaceArgs']]]]] = None,
                                     project_id: Optional[pulumi.Input[str]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalClusterConfigResult]:
    """
    `GlobalClusterConfig` describes all managed namespaces and custom zone mappings associated with the specified Global Cluster.

    > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.Cluster("test",
        project_id="<YOUR-PROJECT-ID>",
        name="<CLUSTER-NAME>",
        cloud_backup=True,
        cluster_type="GEOSHARDED",
        provider_name="AWS",
        provider_instance_size_name="M30",
        replication_specs=[
            mongodbatlas.ClusterReplicationSpecArgs(
                zone_name="Zone 1",
                num_shards=2,
                regions_configs=[mongodbatlas.ClusterReplicationSpecRegionsConfigArgs(
                    region_name="EU_CENTRAL_1",
                    electable_nodes=3,
                    priority=7,
                    read_only_nodes=0,
                )],
            ),
            mongodbatlas.ClusterReplicationSpecArgs(
                zone_name="Zone 2",
                num_shards=2,
                regions_configs=[mongodbatlas.ClusterReplicationSpecRegionsConfigArgs(
                    region_name="US_EAST_2",
                    electable_nodes=3,
                    priority=7,
                    read_only_nodes=0,
                )],
            ),
        ])
    config_global_cluster_config = mongodbatlas.GlobalClusterConfig("config",
        project_id=test.project_id,
        cluster_name=test.name,
        managed_namespaces=[mongodbatlas.GlobalClusterConfigManagedNamespaceArgs(
            db="mydata",
            collection="publishers",
            custom_shard_key="city",
        )],
        custom_zone_mappings=[mongodbatlas.GlobalClusterConfigCustomZoneMappingArgs(
            location="CA",
            zone="Zone 1",
        )])
    config = mongodbatlas.get_global_cluster_config_output(project_id=config_global_cluster_config.project_id,
        cluster_name=config_global_cluster_config.cluster_name)
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetGlobalClusterConfigManagedNamespaceArgs']] managed_namespaces: Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
    :param str project_id: The unique ID for the project to create the database user.
           * `cluster_name - (Required) The name of the Global Cluster.
    """
    ...
