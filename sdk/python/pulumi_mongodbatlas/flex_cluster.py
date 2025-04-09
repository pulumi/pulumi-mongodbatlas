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

__all__ = ['FlexClusterArgs', 'FlexCluster']

@pulumi.input_type
class FlexClusterArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[builtins.str],
                 provider_settings: pulumi.Input['FlexClusterProviderSettingsArgs'],
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 termination_protection_enabled: Optional[pulumi.Input[builtins.bool]] = None):
        """
        The set of arguments for constructing a FlexCluster resource.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal character string that identifies the project.
        :param pulumi.Input['FlexClusterProviderSettingsArgs'] provider_settings: Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        :param pulumi.Input[builtins.str] name: Human-readable label that identifies the instance.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] tags: Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        :param pulumi.Input[builtins.bool] termination_protection_enabled: Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "provider_settings", provider_settings)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if termination_protection_enabled is not None:
            pulumi.set(__self__, "termination_protection_enabled", termination_protection_enabled)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[builtins.str]:
        """
        Unique 24-hexadecimal character string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerSettings")
    def provider_settings(self) -> pulumi.Input['FlexClusterProviderSettingsArgs']:
        """
        Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        """
        return pulumi.get(self, "provider_settings")

    @provider_settings.setter
    def provider_settings(self, value: pulumi.Input['FlexClusterProviderSettingsArgs']):
        pulumi.set(self, "provider_settings", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Human-readable label that identifies the instance.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="terminationProtectionEnabled")
    def termination_protection_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        """
        return pulumi.get(self, "termination_protection_enabled")

    @termination_protection_enabled.setter
    def termination_protection_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "termination_protection_enabled", value)


@pulumi.input_type
class _FlexClusterState:
    def __init__(__self__, *,
                 backup_settings: Optional[pulumi.Input['FlexClusterBackupSettingsArgs']] = None,
                 cluster_type: Optional[pulumi.Input[builtins.str]] = None,
                 connection_strings: Optional[pulumi.Input['FlexClusterConnectionStringsArgs']] = None,
                 create_date: Optional[pulumi.Input[builtins.str]] = None,
                 mongo_db_version: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 provider_settings: Optional[pulumi.Input['FlexClusterProviderSettingsArgs']] = None,
                 state_name: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 termination_protection_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 version_release_system: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering FlexCluster resources.
        :param pulumi.Input['FlexClusterBackupSettingsArgs'] backup_settings: Flex backup configuration
        :param pulumi.Input[builtins.str] cluster_type: Flex cluster topology.
        :param pulumi.Input['FlexClusterConnectionStringsArgs'] connection_strings: Collection of Uniform Resource Locators that point to the MongoDB database.
        :param pulumi.Input[builtins.str] create_date: Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        :param pulumi.Input[builtins.str] mongo_db_version: Version of MongoDB that the instance runs.
        :param pulumi.Input[builtins.str] name: Human-readable label that identifies the instance.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal character string that identifies the project.
        :param pulumi.Input['FlexClusterProviderSettingsArgs'] provider_settings: Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        :param pulumi.Input[builtins.str] state_name: Human-readable label that indicates the current operating condition of this instance.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] tags: Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        :param pulumi.Input[builtins.bool] termination_protection_enabled: Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        :param pulumi.Input[builtins.str] version_release_system: Method by which the cluster maintains the MongoDB versions.
        """
        if backup_settings is not None:
            pulumi.set(__self__, "backup_settings", backup_settings)
        if cluster_type is not None:
            pulumi.set(__self__, "cluster_type", cluster_type)
        if connection_strings is not None:
            pulumi.set(__self__, "connection_strings", connection_strings)
        if create_date is not None:
            pulumi.set(__self__, "create_date", create_date)
        if mongo_db_version is not None:
            pulumi.set(__self__, "mongo_db_version", mongo_db_version)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if provider_settings is not None:
            pulumi.set(__self__, "provider_settings", provider_settings)
        if state_name is not None:
            pulumi.set(__self__, "state_name", state_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if termination_protection_enabled is not None:
            pulumi.set(__self__, "termination_protection_enabled", termination_protection_enabled)
        if version_release_system is not None:
            pulumi.set(__self__, "version_release_system", version_release_system)

    @property
    @pulumi.getter(name="backupSettings")
    def backup_settings(self) -> Optional[pulumi.Input['FlexClusterBackupSettingsArgs']]:
        """
        Flex backup configuration
        """
        return pulumi.get(self, "backup_settings")

    @backup_settings.setter
    def backup_settings(self, value: Optional[pulumi.Input['FlexClusterBackupSettingsArgs']]):
        pulumi.set(self, "backup_settings", value)

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Flex cluster topology.
        """
        return pulumi.get(self, "cluster_type")

    @cluster_type.setter
    def cluster_type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cluster_type", value)

    @property
    @pulumi.getter(name="connectionStrings")
    def connection_strings(self) -> Optional[pulumi.Input['FlexClusterConnectionStringsArgs']]:
        """
        Collection of Uniform Resource Locators that point to the MongoDB database.
        """
        return pulumi.get(self, "connection_strings")

    @connection_strings.setter
    def connection_strings(self, value: Optional[pulumi.Input['FlexClusterConnectionStringsArgs']]):
        pulumi.set(self, "connection_strings", value)

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        """
        return pulumi.get(self, "create_date")

    @create_date.setter
    def create_date(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "create_date", value)

    @property
    @pulumi.getter(name="mongoDbVersion")
    def mongo_db_version(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Version of MongoDB that the instance runs.
        """
        return pulumi.get(self, "mongo_db_version")

    @mongo_db_version.setter
    def mongo_db_version(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "mongo_db_version", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Human-readable label that identifies the instance.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Unique 24-hexadecimal character string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerSettings")
    def provider_settings(self) -> Optional[pulumi.Input['FlexClusterProviderSettingsArgs']]:
        """
        Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        """
        return pulumi.get(self, "provider_settings")

    @provider_settings.setter
    def provider_settings(self, value: Optional[pulumi.Input['FlexClusterProviderSettingsArgs']]):
        pulumi.set(self, "provider_settings", value)

    @property
    @pulumi.getter(name="stateName")
    def state_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Human-readable label that indicates the current operating condition of this instance.
        """
        return pulumi.get(self, "state_name")

    @state_name.setter
    def state_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "state_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="terminationProtectionEnabled")
    def termination_protection_enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        """
        return pulumi.get(self, "termination_protection_enabled")

    @termination_protection_enabled.setter
    def termination_protection_enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "termination_protection_enabled", value)

    @property
    @pulumi.getter(name="versionReleaseSystem")
    def version_release_system(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Method by which the cluster maintains the MongoDB versions.
        """
        return pulumi.get(self, "version_release_system")

    @version_release_system.setter
    def version_release_system(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "version_release_system", value)


class FlexCluster(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 provider_settings: Optional[pulumi.Input[Union['FlexClusterProviderSettingsArgs', 'FlexClusterProviderSettingsArgsDict']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 termination_protection_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        """
        ## # Resource: FlexCluster

        `FlexCluster` provides a Flex Cluster resource. The resource lets you create, update, delete and import a flex cluster.

        **RECOMMENDATION:** We recommend using the `AdvancedCluster` resource instead of the `FlexCluster` resource to create and manage Flex clusters. The `AdvancedCluster` resource not only supports Flex clusters, but also supports tenant and dedicated clusters, providing easier migration between different cluster types. For more information, see the Advanced Cluster resource.

        ## Example Usage

        ## Import

        You can import the Flex Cluster resource by using the Project ID and Flex Cluster name, in the format `PROJECT_ID-FLEX_CLUSTER_NAME`. For example:

        For more information see: [MongoDB Atlas API - Flex Cluster](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Flex-Clusters/operation/createFlexcluster) Documentation.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] name: Human-readable label that identifies the instance.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal character string that identifies the project.
        :param pulumi.Input[Union['FlexClusterProviderSettingsArgs', 'FlexClusterProviderSettingsArgsDict']] provider_settings: Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] tags: Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        :param pulumi.Input[builtins.bool] termination_protection_enabled: Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FlexClusterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## # Resource: FlexCluster

        `FlexCluster` provides a Flex Cluster resource. The resource lets you create, update, delete and import a flex cluster.

        **RECOMMENDATION:** We recommend using the `AdvancedCluster` resource instead of the `FlexCluster` resource to create and manage Flex clusters. The `AdvancedCluster` resource not only supports Flex clusters, but also supports tenant and dedicated clusters, providing easier migration between different cluster types. For more information, see the Advanced Cluster resource.

        ## Example Usage

        ## Import

        You can import the Flex Cluster resource by using the Project ID and Flex Cluster name, in the format `PROJECT_ID-FLEX_CLUSTER_NAME`. For example:

        For more information see: [MongoDB Atlas API - Flex Cluster](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Flex-Clusters/operation/createFlexcluster) Documentation.

        :param str resource_name: The name of the resource.
        :param FlexClusterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FlexClusterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                 provider_settings: Optional[pulumi.Input[Union['FlexClusterProviderSettingsArgs', 'FlexClusterProviderSettingsArgsDict']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 termination_protection_enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FlexClusterArgs.__new__(FlexClusterArgs)

            __props__.__dict__["name"] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if provider_settings is None and not opts.urn:
                raise TypeError("Missing required property 'provider_settings'")
            __props__.__dict__["provider_settings"] = provider_settings
            __props__.__dict__["tags"] = tags
            __props__.__dict__["termination_protection_enabled"] = termination_protection_enabled
            __props__.__dict__["backup_settings"] = None
            __props__.__dict__["cluster_type"] = None
            __props__.__dict__["connection_strings"] = None
            __props__.__dict__["create_date"] = None
            __props__.__dict__["mongo_db_version"] = None
            __props__.__dict__["state_name"] = None
            __props__.__dict__["version_release_system"] = None
        super(FlexCluster, __self__).__init__(
            'mongodbatlas:index/flexCluster:FlexCluster',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_settings: Optional[pulumi.Input[Union['FlexClusterBackupSettingsArgs', 'FlexClusterBackupSettingsArgsDict']]] = None,
            cluster_type: Optional[pulumi.Input[builtins.str]] = None,
            connection_strings: Optional[pulumi.Input[Union['FlexClusterConnectionStringsArgs', 'FlexClusterConnectionStringsArgsDict']]] = None,
            create_date: Optional[pulumi.Input[builtins.str]] = None,
            mongo_db_version: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            project_id: Optional[pulumi.Input[builtins.str]] = None,
            provider_settings: Optional[pulumi.Input[Union['FlexClusterProviderSettingsArgs', 'FlexClusterProviderSettingsArgsDict']]] = None,
            state_name: Optional[pulumi.Input[builtins.str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            termination_protection_enabled: Optional[pulumi.Input[builtins.bool]] = None,
            version_release_system: Optional[pulumi.Input[builtins.str]] = None) -> 'FlexCluster':
        """
        Get an existing FlexCluster resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['FlexClusterBackupSettingsArgs', 'FlexClusterBackupSettingsArgsDict']] backup_settings: Flex backup configuration
        :param pulumi.Input[builtins.str] cluster_type: Flex cluster topology.
        :param pulumi.Input[Union['FlexClusterConnectionStringsArgs', 'FlexClusterConnectionStringsArgsDict']] connection_strings: Collection of Uniform Resource Locators that point to the MongoDB database.
        :param pulumi.Input[builtins.str] create_date: Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        :param pulumi.Input[builtins.str] mongo_db_version: Version of MongoDB that the instance runs.
        :param pulumi.Input[builtins.str] name: Human-readable label that identifies the instance.
        :param pulumi.Input[builtins.str] project_id: Unique 24-hexadecimal character string that identifies the project.
        :param pulumi.Input[Union['FlexClusterProviderSettingsArgs', 'FlexClusterProviderSettingsArgsDict']] provider_settings: Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        :param pulumi.Input[builtins.str] state_name: Human-readable label that indicates the current operating condition of this instance.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] tags: Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        :param pulumi.Input[builtins.bool] termination_protection_enabled: Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        :param pulumi.Input[builtins.str] version_release_system: Method by which the cluster maintains the MongoDB versions.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FlexClusterState.__new__(_FlexClusterState)

        __props__.__dict__["backup_settings"] = backup_settings
        __props__.__dict__["cluster_type"] = cluster_type
        __props__.__dict__["connection_strings"] = connection_strings
        __props__.__dict__["create_date"] = create_date
        __props__.__dict__["mongo_db_version"] = mongo_db_version
        __props__.__dict__["name"] = name
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["provider_settings"] = provider_settings
        __props__.__dict__["state_name"] = state_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["termination_protection_enabled"] = termination_protection_enabled
        __props__.__dict__["version_release_system"] = version_release_system
        return FlexCluster(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupSettings")
    def backup_settings(self) -> pulumi.Output['outputs.FlexClusterBackupSettings']:
        """
        Flex backup configuration
        """
        return pulumi.get(self, "backup_settings")

    @property
    @pulumi.getter(name="clusterType")
    def cluster_type(self) -> pulumi.Output[builtins.str]:
        """
        Flex cluster topology.
        """
        return pulumi.get(self, "cluster_type")

    @property
    @pulumi.getter(name="connectionStrings")
    def connection_strings(self) -> pulumi.Output['outputs.FlexClusterConnectionStrings']:
        """
        Collection of Uniform Resource Locators that point to the MongoDB database.
        """
        return pulumi.get(self, "connection_strings")

    @property
    @pulumi.getter(name="createDate")
    def create_date(self) -> pulumi.Output[builtins.str]:
        """
        Date and time when MongoDB Cloud created this instance. This parameter expresses its value in ISO 8601 format in UTC.
        """
        return pulumi.get(self, "create_date")

    @property
    @pulumi.getter(name="mongoDbVersion")
    def mongo_db_version(self) -> pulumi.Output[builtins.str]:
        """
        Version of MongoDB that the instance runs.
        """
        return pulumi.get(self, "mongo_db_version")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Human-readable label that identifies the instance.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[builtins.str]:
        """
        Unique 24-hexadecimal character string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerSettings")
    def provider_settings(self) -> pulumi.Output['outputs.FlexClusterProviderSettings']:
        """
        Group of cloud provider settings that configure the provisioned MongoDB flex cluster.
        """
        return pulumi.get(self, "provider_settings")

    @property
    @pulumi.getter(name="stateName")
    def state_name(self) -> pulumi.Output[builtins.str]:
        """
        Human-readable label that indicates the current operating condition of this instance.
        """
        return pulumi.get(self, "state_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, builtins.str]]]:
        """
        Map that contains key-value pairs between 1 to 255 characters in length for tagging and categorizing the instance.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="terminationProtectionEnabled")
    def termination_protection_enabled(self) -> pulumi.Output[builtins.bool]:
        """
        Flag that indicates whether termination protection is enabled on the cluster. If set to `true`, MongoDB Cloud won't delete the cluster. If set to `false`, MongoDB Cloud will delete the cluster.
        """
        return pulumi.get(self, "termination_protection_enabled")

    @property
    @pulumi.getter(name="versionReleaseSystem")
    def version_release_system(self) -> pulumi.Output[builtins.str]:
        """
        Method by which the cluster maintains the MongoDB versions.
        """
        return pulumi.get(self, "version_release_system")

