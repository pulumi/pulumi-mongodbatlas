# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CloudProviderAccessSetupArgs', 'CloudProviderAccessSetup']

@pulumi.input_type
class CloudProviderAccessSetupArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 provider_name: pulumi.Input[str],
                 azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]] = None):
        """
        The set of arguments for constructing a CloudProviderAccessSetup resource.
        """
        CloudProviderAccessSetupArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            project_id=project_id,
            provider_name=provider_name,
            azure_configs=azure_configs,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             project_id: pulumi.Input[str],
             provider_name: pulumi.Input[str],
             azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("project_id", project_id)
        _setter("provider_name", provider_name)
        if azure_configs is not None:
            _setter("azure_configs", azure_configs)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter(name="azureConfigs")
    def azure_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]]:
        return pulumi.get(self, "azure_configs")

    @azure_configs.setter
    def azure_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]]):
        pulumi.set(self, "azure_configs", value)


@pulumi.input_type
class _CloudProviderAccessSetupState:
    def __init__(__self__, *,
                 aws_configs: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAwsConfigArgs']]]] = None,
                 azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 last_updated_date: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 role_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CloudProviderAccessSetup resources.
        """
        _CloudProviderAccessSetupState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            aws_configs=aws_configs,
            azure_configs=azure_configs,
            created_date=created_date,
            last_updated_date=last_updated_date,
            project_id=project_id,
            provider_name=provider_name,
            role_id=role_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             aws_configs: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAwsConfigArgs']]]] = None,
             azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]] = None,
             created_date: Optional[pulumi.Input[str]] = None,
             last_updated_date: Optional[pulumi.Input[str]] = None,
             project_id: Optional[pulumi.Input[str]] = None,
             provider_name: Optional[pulumi.Input[str]] = None,
             role_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if aws_configs is not None:
            _setter("aws_configs", aws_configs)
        if azure_configs is not None:
            _setter("azure_configs", azure_configs)
        if created_date is not None:
            _setter("created_date", created_date)
        if last_updated_date is not None:
            _setter("last_updated_date", last_updated_date)
        if project_id is not None:
            _setter("project_id", project_id)
        if provider_name is not None:
            _setter("provider_name", provider_name)
        if role_id is not None:
            _setter("role_id", role_id)

    @property
    @pulumi.getter(name="awsConfigs")
    def aws_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAwsConfigArgs']]]]:
        return pulumi.get(self, "aws_configs")

    @aws_configs.setter
    def aws_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAwsConfigArgs']]]]):
        pulumi.set(self, "aws_configs", value)

    @property
    @pulumi.getter(name="azureConfigs")
    def azure_configs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]]:
        return pulumi.get(self, "azure_configs")

    @azure_configs.setter
    def azure_configs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CloudProviderAccessSetupAzureConfigArgs']]]]):
        pulumi.set(self, "azure_configs", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "last_updated_date")

    @last_updated_date.setter
    def last_updated_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_date", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "role_id")

    @role_id.setter
    def role_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_id", value)


class CloudProviderAccessSetup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderAccessSetupAzureConfigArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a CloudProviderAccessSetup resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CloudProviderAccessSetupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a CloudProviderAccessSetup resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param CloudProviderAccessSetupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CloudProviderAccessSetupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            CloudProviderAccessSetupArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderAccessSetupAzureConfigArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CloudProviderAccessSetupArgs.__new__(CloudProviderAccessSetupArgs)

            __props__.__dict__["azure_configs"] = azure_configs
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["aws_configs"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_updated_date"] = None
            __props__.__dict__["role_id"] = None
        super(CloudProviderAccessSetup, __self__).__init__(
            'mongodbatlas:index/cloudProviderAccessSetup:CloudProviderAccessSetup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderAccessSetupAwsConfigArgs']]]]] = None,
            azure_configs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CloudProviderAccessSetupAzureConfigArgs']]]]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            last_updated_date: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None,
            role_id: Optional[pulumi.Input[str]] = None) -> 'CloudProviderAccessSetup':
        """
        Get an existing CloudProviderAccessSetup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CloudProviderAccessSetupState.__new__(_CloudProviderAccessSetupState)

        __props__.__dict__["aws_configs"] = aws_configs
        __props__.__dict__["azure_configs"] = azure_configs
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["last_updated_date"] = last_updated_date
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["provider_name"] = provider_name
        __props__.__dict__["role_id"] = role_id
        return CloudProviderAccessSetup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsConfigs")
    def aws_configs(self) -> pulumi.Output[Sequence['outputs.CloudProviderAccessSetupAwsConfig']]:
        return pulumi.get(self, "aws_configs")

    @property
    @pulumi.getter(name="azureConfigs")
    def azure_configs(self) -> pulumi.Output[Optional[Sequence['outputs.CloudProviderAccessSetupAzureConfig']]]:
        return pulumi.get(self, "azure_configs")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> pulumi.Output[str]:
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "role_id")

