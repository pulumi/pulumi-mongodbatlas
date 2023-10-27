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

__all__ = ['EncryptionAtRestArgs', 'EncryptionAtRest']

@pulumi.input_type
class EncryptionAtRestArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 aws_kms_config: Optional[pulumi.Input['EncryptionAtRestAwsKmsConfigArgs']] = None,
                 azure_key_vault_config: Optional[pulumi.Input['EncryptionAtRestAzureKeyVaultConfigArgs']] = None,
                 google_cloud_kms_config: Optional[pulumi.Input['EncryptionAtRestGoogleCloudKmsConfigArgs']] = None):
        """
        The set of arguments for constructing a EncryptionAtRest resource.
        :param pulumi.Input[str] project_id: The unique identifier for the project.
        """
        pulumi.set(__self__, "project_id", project_id)
        if aws_kms_config is not None:
            pulumi.set(__self__, "aws_kms_config", aws_kms_config)
        if azure_key_vault_config is not None:
            pulumi.set(__self__, "azure_key_vault_config", azure_key_vault_config)
        if google_cloud_kms_config is not None:
            pulumi.set(__self__, "google_cloud_kms_config", google_cloud_kms_config)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="awsKmsConfig")
    def aws_kms_config(self) -> Optional[pulumi.Input['EncryptionAtRestAwsKmsConfigArgs']]:
        return pulumi.get(self, "aws_kms_config")

    @aws_kms_config.setter
    def aws_kms_config(self, value: Optional[pulumi.Input['EncryptionAtRestAwsKmsConfigArgs']]):
        pulumi.set(self, "aws_kms_config", value)

    @property
    @pulumi.getter(name="azureKeyVaultConfig")
    def azure_key_vault_config(self) -> Optional[pulumi.Input['EncryptionAtRestAzureKeyVaultConfigArgs']]:
        return pulumi.get(self, "azure_key_vault_config")

    @azure_key_vault_config.setter
    def azure_key_vault_config(self, value: Optional[pulumi.Input['EncryptionAtRestAzureKeyVaultConfigArgs']]):
        pulumi.set(self, "azure_key_vault_config", value)

    @property
    @pulumi.getter(name="googleCloudKmsConfig")
    def google_cloud_kms_config(self) -> Optional[pulumi.Input['EncryptionAtRestGoogleCloudKmsConfigArgs']]:
        return pulumi.get(self, "google_cloud_kms_config")

    @google_cloud_kms_config.setter
    def google_cloud_kms_config(self, value: Optional[pulumi.Input['EncryptionAtRestGoogleCloudKmsConfigArgs']]):
        pulumi.set(self, "google_cloud_kms_config", value)


@pulumi.input_type
class _EncryptionAtRestState:
    def __init__(__self__, *,
                 aws_kms_config: Optional[pulumi.Input['EncryptionAtRestAwsKmsConfigArgs']] = None,
                 azure_key_vault_config: Optional[pulumi.Input['EncryptionAtRestAzureKeyVaultConfigArgs']] = None,
                 google_cloud_kms_config: Optional[pulumi.Input['EncryptionAtRestGoogleCloudKmsConfigArgs']] = None,
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EncryptionAtRest resources.
        :param pulumi.Input[str] project_id: The unique identifier for the project.
        """
        if aws_kms_config is not None:
            pulumi.set(__self__, "aws_kms_config", aws_kms_config)
        if azure_key_vault_config is not None:
            pulumi.set(__self__, "azure_key_vault_config", azure_key_vault_config)
        if google_cloud_kms_config is not None:
            pulumi.set(__self__, "google_cloud_kms_config", google_cloud_kms_config)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="awsKmsConfig")
    def aws_kms_config(self) -> Optional[pulumi.Input['EncryptionAtRestAwsKmsConfigArgs']]:
        return pulumi.get(self, "aws_kms_config")

    @aws_kms_config.setter
    def aws_kms_config(self, value: Optional[pulumi.Input['EncryptionAtRestAwsKmsConfigArgs']]):
        pulumi.set(self, "aws_kms_config", value)

    @property
    @pulumi.getter(name="azureKeyVaultConfig")
    def azure_key_vault_config(self) -> Optional[pulumi.Input['EncryptionAtRestAzureKeyVaultConfigArgs']]:
        return pulumi.get(self, "azure_key_vault_config")

    @azure_key_vault_config.setter
    def azure_key_vault_config(self, value: Optional[pulumi.Input['EncryptionAtRestAzureKeyVaultConfigArgs']]):
        pulumi.set(self, "azure_key_vault_config", value)

    @property
    @pulumi.getter(name="googleCloudKmsConfig")
    def google_cloud_kms_config(self) -> Optional[pulumi.Input['EncryptionAtRestGoogleCloudKmsConfigArgs']]:
        return pulumi.get(self, "google_cloud_kms_config")

    @google_cloud_kms_config.setter
    def google_cloud_kms_config(self, value: Optional[pulumi.Input['EncryptionAtRestGoogleCloudKmsConfigArgs']]):
        pulumi.set(self, "google_cloud_kms_config", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


class EncryptionAtRest(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_kms_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsConfigArgs']]] = None,
                 azure_key_vault_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultConfigArgs']]] = None,
                 google_cloud_kms_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsConfigArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Encryption at Rest Settings can be imported using project ID, in the format `project_id`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/encryptionAtRest:EncryptionAtRest example 1112222b3bf99403840e8934
        ```
         For more information see[MongoDB Atlas API Reference for Encryption at Rest using Customer Key Management.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: The unique identifier for the project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EncryptionAtRestArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Encryption at Rest Settings can be imported using project ID, in the format `project_id`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/encryptionAtRest:EncryptionAtRest example 1112222b3bf99403840e8934
        ```
         For more information see[MongoDB Atlas API Reference for Encryption at Rest using Customer Key Management.](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Encryption-at-Rest-using-Customer-Key-Management)

        :param str resource_name: The name of the resource.
        :param EncryptionAtRestArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EncryptionAtRestArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_kms_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsConfigArgs']]] = None,
                 azure_key_vault_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultConfigArgs']]] = None,
                 google_cloud_kms_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsConfigArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EncryptionAtRestArgs.__new__(EncryptionAtRestArgs)

            __props__.__dict__["aws_kms_config"] = aws_kms_config
            __props__.__dict__["azure_key_vault_config"] = azure_key_vault_config
            __props__.__dict__["google_cloud_kms_config"] = google_cloud_kms_config
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
        super(EncryptionAtRest, __self__).__init__(
            'mongodbatlas:index/encryptionAtRest:EncryptionAtRest',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_kms_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAwsKmsConfigArgs']]] = None,
            azure_key_vault_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestAzureKeyVaultConfigArgs']]] = None,
            google_cloud_kms_config: Optional[pulumi.Input[pulumi.InputType['EncryptionAtRestGoogleCloudKmsConfigArgs']]] = None,
            project_id: Optional[pulumi.Input[str]] = None) -> 'EncryptionAtRest':
        """
        Get an existing EncryptionAtRest resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: The unique identifier for the project.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EncryptionAtRestState.__new__(_EncryptionAtRestState)

        __props__.__dict__["aws_kms_config"] = aws_kms_config
        __props__.__dict__["azure_key_vault_config"] = azure_key_vault_config
        __props__.__dict__["google_cloud_kms_config"] = google_cloud_kms_config
        __props__.__dict__["project_id"] = project_id
        return EncryptionAtRest(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsKmsConfig")
    def aws_kms_config(self) -> pulumi.Output[Optional['outputs.EncryptionAtRestAwsKmsConfig']]:
        return pulumi.get(self, "aws_kms_config")

    @property
    @pulumi.getter(name="azureKeyVaultConfig")
    def azure_key_vault_config(self) -> pulumi.Output[Optional['outputs.EncryptionAtRestAzureKeyVaultConfig']]:
        return pulumi.get(self, "azure_key_vault_config")

    @property
    @pulumi.getter(name="googleCloudKmsConfig")
    def google_cloud_kms_config(self) -> pulumi.Output[Optional['outputs.EncryptionAtRestGoogleCloudKmsConfig']]:
        return pulumi.get(self, "google_cloud_kms_config")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique identifier for the project.
        """
        return pulumi.get(self, "project_id")

