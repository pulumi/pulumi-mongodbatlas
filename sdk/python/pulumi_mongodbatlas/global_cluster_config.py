# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
from ._inputs import *

__all__ = ['GlobalClusterConfigArgs', 'GlobalClusterConfig']

@pulumi.input_type
class GlobalClusterConfigArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[builtins.str],
                 project_id: pulumi.Input[builtins.str],
                 custom_zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]]] = None,
                 managed_namespaces: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]]] = None):
        """
        The set of arguments for constructing a GlobalClusterConfig resource.
        :param pulumi.Input[builtins.str] cluster_name: The name of the Global Cluster.
        :param pulumi.Input[builtins.str] project_id: The unique ID for the project.
        :param pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]] custom_zone_mappings: Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        :param pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]] managed_namespaces: Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "project_id", project_id)
        if custom_zone_mappings is not None:
            pulumi.set(__self__, "custom_zone_mappings", custom_zone_mappings)
        if managed_namespaces is not None:
            pulumi.set(__self__, "managed_namespaces", managed_namespaces)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[builtins.str]:
        """
        The name of the Global Cluster.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[builtins.str]:
        """
        The unique ID for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="customZoneMappings")
    def custom_zone_mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]]]:
        """
        Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        """
        return pulumi.get(self, "custom_zone_mappings")

    @custom_zone_mappings.setter
    def custom_zone_mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]]]):
        pulumi.set(self, "custom_zone_mappings", value)

    @property
    @pulumi.getter(name="managedNamespaces")
    def managed_namespaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]]]:
        """
        Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        """
        return pulumi.get(self, "managed_namespaces")

    @managed_namespaces.setter
    def managed_namespaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]]]):
        pulumi.set(self, "managed_namespaces", value)


@pulumi.input_type
class _GlobalClusterConfigState:
    def __init__(__self__, *,
                 cluster_name: Optional[pulumi.Input[builtins.str]] = None,
                 custom_zone_mapping: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 custom_zone_mapping_zone_id: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 custom_zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]]] = None,
                 managed_namespaces: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering GlobalClusterConfig resources.
        :param pulumi.Input[builtins.str] cluster_name: The name of the Global Cluster.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] custom_zone_mapping: (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead. This attribute is not set when a cluster uses independent shard scaling. To learn more, see the Sharding Configuration guide.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] custom_zone_mapping_zone_id: A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        :param pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]] custom_zone_mappings: Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        :param pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]] managed_namespaces: Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        :param pulumi.Input[builtins.str] project_id: The unique ID for the project.
        """
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if custom_zone_mapping is not None:
            warnings.warn("""This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.""", DeprecationWarning)
            pulumi.log.warn("""custom_zone_mapping is deprecated: This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.""")
        if custom_zone_mapping is not None:
            pulumi.set(__self__, "custom_zone_mapping", custom_zone_mapping)
        if custom_zone_mapping_zone_id is not None:
            pulumi.set(__self__, "custom_zone_mapping_zone_id", custom_zone_mapping_zone_id)
        if custom_zone_mappings is not None:
            pulumi.set(__self__, "custom_zone_mappings", custom_zone_mappings)
        if managed_namespaces is not None:
            pulumi.set(__self__, "managed_namespaces", managed_namespaces)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The name of the Global Cluster.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="customZoneMapping")
    @_utilities.deprecated("""This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.""")
    def custom_zone_mapping(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead. This attribute is not set when a cluster uses independent shard scaling. To learn more, see the Sharding Configuration guide.
        """
        return pulumi.get(self, "custom_zone_mapping")

    @custom_zone_mapping.setter
    def custom_zone_mapping(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "custom_zone_mapping", value)

    @property
    @pulumi.getter(name="customZoneMappingZoneId")
    def custom_zone_mapping_zone_id(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        """
        return pulumi.get(self, "custom_zone_mapping_zone_id")

    @custom_zone_mapping_zone_id.setter
    def custom_zone_mapping_zone_id(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "custom_zone_mapping_zone_id", value)

    @property
    @pulumi.getter(name="customZoneMappings")
    def custom_zone_mappings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]]]:
        """
        Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        """
        return pulumi.get(self, "custom_zone_mappings")

    @custom_zone_mappings.setter
    def custom_zone_mappings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigCustomZoneMappingArgs']]]]):
        pulumi.set(self, "custom_zone_mappings", value)

    @property
    @pulumi.getter(name="managedNamespaces")
    def managed_namespaces(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]]]:
        """
        Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        """
        return pulumi.get(self, "managed_namespaces")

    @managed_namespaces.setter
    def managed_namespaces(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GlobalClusterConfigManagedNamespaceArgs']]]]):
        pulumi.set(self, "managed_namespaces", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The unique ID for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "project_id", value)


class GlobalClusterConfig(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[builtins.str]] = None,
                 custom_zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigCustomZoneMappingArgs', 'GlobalClusterConfigCustomZoneMappingArgsDict']]]]] = None,
                 managed_namespaces: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigManagedNamespaceArgs', 'GlobalClusterConfigManagedNamespaceArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## # Resource: GlobalClusterConfig

        `GlobalClusterConfig` provides a Global Cluster Configuration resource.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **NOTE:** This resource can only be used with Atlas-managed clusters. See doc for `global_cluster_self_managed_sharding` attribute in `AdvancedCluster` resource for more information.

        > **IMPORTANT:** You can update a Global Cluster Configuration to add new custom zone mappings and managed namespaces. However, once configured, you can't modify or partially delete custom zone mappings (you must remove them all at once). You can add or remove, but can't modify, managed namespaces. Any update that changes an existing managed namespace results in an error. [Read more about Global Cluster Configuration](https://www.mongodb.com/docs/atlas/global-clusters/). For more details, see [Global Clusters API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Global-Clusters)

        ## Examples Usage

        ### Example Global cluster

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AdvancedCluster("test",
            project_id="<YOUR-PROJECT-ID>",
            name="<CLUSTER-NAME>",
            cluster_type="GEOSHARDED",
            backup_enabled=True,
            replication_specs=[
                {
                    "zone_name": "Zone 1",
                    "region_configs": [{
                        "electable_specs": {
                            "instance_size": "M30",
                            "node_count": 3,
                        },
                        "provider_name": "AWS",
                        "priority": 7,
                        "region_name": "EU_CENTRAL_1",
                    }],
                },
                {
                    "zone_name": "Zone 2",
                    "region_configs": [{
                        "electable_specs": {
                            "instance_size": "M30",
                            "node_count": 3,
                        },
                        "provider_name": "AWS",
                        "priority": 7,
                        "region_name": "US_EAST_2",
                    }],
                },
            ])
        config = mongodbatlas.GlobalClusterConfig("config",
            project_id=test.project_id,
            cluster_name=test.name,
            managed_namespaces=[{
                "db": "mydata",
                "collection": "publishers",
                "custom_shard_key": "city",
                "is_custom_shard_key_hashed": False,
                "is_shard_key_unique": False,
            }],
            custom_zone_mappings=[{
                "location": "CA",
                "zone": "Zone 1",
            }])
        ```

        ## Import

        Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
        ```
        See detailed information for arguments and attributes: [MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cluster_name: The name of the Global Cluster.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigCustomZoneMappingArgs', 'GlobalClusterConfigCustomZoneMappingArgsDict']]]] custom_zone_mappings: Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigManagedNamespaceArgs', 'GlobalClusterConfigManagedNamespaceArgsDict']]]] managed_namespaces: Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        :param pulumi.Input[builtins.str] project_id: The unique ID for the project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GlobalClusterConfigArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Resource: GlobalClusterConfig

        `GlobalClusterConfig` provides a Global Cluster Configuration resource.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **NOTE:** This resource can only be used with Atlas-managed clusters. See doc for `global_cluster_self_managed_sharding` attribute in `AdvancedCluster` resource for more information.

        > **IMPORTANT:** You can update a Global Cluster Configuration to add new custom zone mappings and managed namespaces. However, once configured, you can't modify or partially delete custom zone mappings (you must remove them all at once). You can add or remove, but can't modify, managed namespaces. Any update that changes an existing managed namespace results in an error. [Read more about Global Cluster Configuration](https://www.mongodb.com/docs/atlas/global-clusters/). For more details, see [Global Clusters API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Global-Clusters)

        ## Examples Usage

        ### Example Global cluster

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test = mongodbatlas.AdvancedCluster("test",
            project_id="<YOUR-PROJECT-ID>",
            name="<CLUSTER-NAME>",
            cluster_type="GEOSHARDED",
            backup_enabled=True,
            replication_specs=[
                {
                    "zone_name": "Zone 1",
                    "region_configs": [{
                        "electable_specs": {
                            "instance_size": "M30",
                            "node_count": 3,
                        },
                        "provider_name": "AWS",
                        "priority": 7,
                        "region_name": "EU_CENTRAL_1",
                    }],
                },
                {
                    "zone_name": "Zone 2",
                    "region_configs": [{
                        "electable_specs": {
                            "instance_size": "M30",
                            "node_count": 3,
                        },
                        "provider_name": "AWS",
                        "priority": 7,
                        "region_name": "US_EAST_2",
                    }],
                },
            ])
        config = mongodbatlas.GlobalClusterConfig("config",
            project_id=test.project_id,
            cluster_name=test.name,
            managed_namespaces=[{
                "db": "mydata",
                "collection": "publishers",
                "custom_shard_key": "city",
                "is_custom_shard_key_hashed": False,
                "is_shard_key_unique": False,
            }],
            custom_zone_mappings=[{
                "location": "CA",
                "zone": "Zone 1",
            }])
        ```

        ## Import

        Global Clusters can be imported using project ID and cluster name, in the format `PROJECTID-CLUSTER_NAME`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/globalClusterConfig:GlobalClusterConfig config 1112222b3bf99403840e8934-Cluster0
        ```
        See detailed information for arguments and attributes: [MongoDB API Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/)

        :param str resource_name: The name of the resource.
        :param GlobalClusterConfigArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalClusterConfigArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[builtins.str]] = None,
                 custom_zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigCustomZoneMappingArgs', 'GlobalClusterConfigCustomZoneMappingArgsDict']]]]] = None,
                 managed_namespaces: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigManagedNamespaceArgs', 'GlobalClusterConfigManagedNamespaceArgsDict']]]]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalClusterConfigArgs.__new__(GlobalClusterConfigArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            __props__.__dict__["custom_zone_mappings"] = custom_zone_mappings
            __props__.__dict__["managed_namespaces"] = managed_namespaces
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["custom_zone_mapping"] = None
            __props__.__dict__["custom_zone_mapping_zone_id"] = None
        super(GlobalClusterConfig, __self__).__init__(
            'mongodbatlas:index/globalClusterConfig:GlobalClusterConfig',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_name: Optional[pulumi.Input[builtins.str]] = None,
            custom_zone_mapping: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            custom_zone_mapping_zone_id: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            custom_zone_mappings: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigCustomZoneMappingArgs', 'GlobalClusterConfigCustomZoneMappingArgsDict']]]]] = None,
            managed_namespaces: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigManagedNamespaceArgs', 'GlobalClusterConfigManagedNamespaceArgsDict']]]]] = None,
            project_id: Optional[pulumi.Input[builtins.str]] = None) -> 'GlobalClusterConfig':
        """
        Get an existing GlobalClusterConfig resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] cluster_name: The name of the Global Cluster.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] custom_zone_mapping: (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead. This attribute is not set when a cluster uses independent shard scaling. To learn more, see the Sharding Configuration guide.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] custom_zone_mapping_zone_id: A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigCustomZoneMappingArgs', 'GlobalClusterConfigCustomZoneMappingArgsDict']]]] custom_zone_mappings: Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GlobalClusterConfigManagedNamespaceArgs', 'GlobalClusterConfigManagedNamespaceArgsDict']]]] managed_namespaces: Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        :param pulumi.Input[builtins.str] project_id: The unique ID for the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalClusterConfigState.__new__(_GlobalClusterConfigState)

        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["custom_zone_mapping"] = custom_zone_mapping
        __props__.__dict__["custom_zone_mapping_zone_id"] = custom_zone_mapping_zone_id
        __props__.__dict__["custom_zone_mappings"] = custom_zone_mappings
        __props__.__dict__["managed_namespaces"] = managed_namespaces
        __props__.__dict__["project_id"] = project_id
        return GlobalClusterConfig(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[builtins.str]:
        """
        The name of the Global Cluster.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="customZoneMapping")
    @_utilities.deprecated("""This parameter is deprecated and will be removed in version 1.23.0. Please transition to custom_zone_mapping_zone_id.""")
    def custom_zone_mapping(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        (Deprecated) A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.id`. This attribute is deprecated, use `custom_zone_mapping_zone_id` instead. This attribute is not set when a cluster uses independent shard scaling. To learn more, see the Sharding Configuration guide.
        """
        return pulumi.get(self, "custom_zone_mapping")

    @property
    @pulumi.getter(name="customZoneMappingZoneId")
    def custom_zone_mapping_zone_id(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        A map of all custom zone mappings defined for the Global Cluster to `replication_specs.*.zone_id`. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
        """
        return pulumi.get(self, "custom_zone_mapping_zone_id")

    @property
    @pulumi.getter(name="customZoneMappings")
    def custom_zone_mappings(self) -> pulumi.Output[Optional[Sequence['outputs.GlobalClusterConfigCustomZoneMapping']]]:
        """
        Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
        """
        return pulumi.get(self, "custom_zone_mappings")

    @property
    @pulumi.getter(name="managedNamespaces")
    def managed_namespaces(self) -> pulumi.Output[Sequence['outputs.GlobalClusterConfigManagedNamespace']]:
        """
        Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
        """
        return pulumi.get(self, "managed_namespaces")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[builtins.str]:
        """
        The unique ID for the project.
        """
        return pulumi.get(self, "project_id")

