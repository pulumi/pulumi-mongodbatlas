# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CustomDnsConfigurationClusterAwsArgs', 'CustomDnsConfigurationClusterAws']

@pulumi.input_type
class CustomDnsConfigurationClusterAwsArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 project_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a CustomDnsConfigurationClusterAws resource.
        :param pulumi.Input[bool] enabled: Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        :param pulumi.Input[str] project_id: Required 	Unique identifier for the project.
        """
        CustomDnsConfigurationClusterAwsArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            project_id=project_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: Optional[pulumi.Input[bool]] = None,
             project_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if enabled is None:
            raise TypeError("Missing 'enabled' argument")
        if project_id is None and 'projectId' in kwargs:
            project_id = kwargs['projectId']
        if project_id is None:
            raise TypeError("Missing 'project_id' argument")

        _setter("enabled", enabled)
        _setter("project_id", project_id)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Required 	Unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _CustomDnsConfigurationClusterAwsState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomDnsConfigurationClusterAws resources.
        :param pulumi.Input[bool] enabled: Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        :param pulumi.Input[str] project_id: Required 	Unique identifier for the project.
        """
        _CustomDnsConfigurationClusterAwsState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enabled=enabled,
            project_id=project_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enabled: Optional[pulumi.Input[bool]] = None,
             project_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if project_id is None and 'projectId' in kwargs:
            project_id = kwargs['projectId']

        if enabled is not None:
            _setter("enabled", enabled)
        if project_id is not None:
            _setter("project_id", project_id)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Required 	Unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


class CustomDnsConfigurationClusterAws(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `CustomDnsConfigurationClusterAws` provides a Custom DNS Configuration for Atlas Clusters on AWS resource. This represents a Custom DNS Configuration for Atlas Clusters on AWS that can be updated in an Atlas project.

        > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
          * Organization Owner
          * Project Owner

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Import

        Custom DNS Configuration for Atlas Clusters on AWS must be imported using Project ID, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws test 1112222b3bf99403840e8934
        ```
         See detailed information for arguments and attributes[MongoDB API Custom DNS Configuration for Atlas Clusters on AWS](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/AWS-Clusters-DNS/operation/getAWSCustomDNS).

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        :param pulumi.Input[str] project_id: Required 	Unique identifier for the project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomDnsConfigurationClusterAwsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `CustomDnsConfigurationClusterAws` provides a Custom DNS Configuration for Atlas Clusters on AWS resource. This represents a Custom DNS Configuration for Atlas Clusters on AWS that can be updated in an Atlas project.

        > **IMPORTANT:**You must have one of the following roles to successfully handle the resource:
          * Organization Owner
          * Project Owner

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        ## Import

        Custom DNS Configuration for Atlas Clusters on AWS must be imported using Project ID, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws test 1112222b3bf99403840e8934
        ```
         See detailed information for arguments and attributes[MongoDB API Custom DNS Configuration for Atlas Clusters on AWS](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/AWS-Clusters-DNS/operation/getAWSCustomDNS).

        :param str resource_name: The name of the resource.
        :param CustomDnsConfigurationClusterAwsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomDnsConfigurationClusterAwsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CustomDnsConfigurationClusterAwsArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomDnsConfigurationClusterAwsArgs.__new__(CustomDnsConfigurationClusterAwsArgs)

            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
        super(CustomDnsConfigurationClusterAws, __self__).__init__(
            'mongodbatlas:index/customDnsConfigurationClusterAws:CustomDnsConfigurationClusterAws',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'CustomDnsConfigurationClusterAws':
        """
        Get an existing CustomDnsConfigurationClusterAws resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        :param pulumi.Input[str] project_id: Required 	Unique identifier for the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomDnsConfigurationClusterAwsState.__new__(_CustomDnsConfigurationClusterAwsState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["project_id"] = project_id
        return CustomDnsConfigurationClusterAws(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Indicates whether the project's clusters deployed to AWS use custom DNS. If `true`, the `Get All Clusters` and `Get One Cluster` endpoints return the `connectionStrings.private` and `connectionStrings.privateSrv` fields for clusters deployed to AWS .
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Required 	Unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

