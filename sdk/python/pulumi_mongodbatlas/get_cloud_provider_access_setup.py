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
    'GetCloudProviderAccessSetupResult',
    'AwaitableGetCloudProviderAccessSetupResult',
    'get_cloud_provider_access_setup',
    'get_cloud_provider_access_setup_output',
]

@pulumi.output_type
class GetCloudProviderAccessSetupResult:
    """
    A collection of values returned by getCloudProviderAccessSetup.
    """
    def __init__(__self__, aws=None, aws_configs=None, azure_configs=None, created_date=None, id=None, last_updated_date=None, project_id=None, provider_name=None, role_id=None):
        if aws and not isinstance(aws, dict):
            raise TypeError("Expected argument 'aws' to be a dict")
        pulumi.set(__self__, "aws", aws)
        if aws_configs and not isinstance(aws_configs, list):
            raise TypeError("Expected argument 'aws_configs' to be a list")
        pulumi.set(__self__, "aws_configs", aws_configs)
        if azure_configs and not isinstance(azure_configs, list):
            raise TypeError("Expected argument 'azure_configs' to be a list")
        pulumi.set(__self__, "azure_configs", azure_configs)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_updated_date and not isinstance(last_updated_date, str):
            raise TypeError("Expected argument 'last_updated_date' to be a str")
        pulumi.set(__self__, "last_updated_date", last_updated_date)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)
        if role_id and not isinstance(role_id, str):
            raise TypeError("Expected argument 'role_id' to be a str")
        pulumi.set(__self__, "role_id", role_id)

    @property
    @pulumi.getter
    def aws(self) -> Mapping[str, str]:
        """
        aws related role information
        """
        return pulumi.get(self, "aws")

    @property
    @pulumi.getter(name="awsConfigs")
    def aws_configs(self) -> Sequence['outputs.GetCloudProviderAccessSetupAwsConfigResult']:
        """
        aws related role information
        """
        return pulumi.get(self, "aws_configs")

    @property
    @pulumi.getter(name="azureConfigs")
    def azure_configs(self) -> Optional[Sequence['outputs.GetCloudProviderAccessSetupAzureConfigResult']]:
        """
        azure related configurations
        """
        return pulumi.get(self, "azure_configs")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> str:
        """
        Date on which this role was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> str:
        """
        Date and time when this Azure Service Principal was last updated. This parameter expresses its value in the ISO 8601 timestamp format in UTC.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> str:
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter(name="roleId")
    def role_id(self) -> str:
        return pulumi.get(self, "role_id")


class AwaitableGetCloudProviderAccessSetupResult(GetCloudProviderAccessSetupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCloudProviderAccessSetupResult(
            aws=self.aws,
            aws_configs=self.aws_configs,
            azure_configs=self.azure_configs,
            created_date=self.created_date,
            id=self.id,
            last_updated_date=self.last_updated_date,
            project_id=self.project_id,
            provider_name=self.provider_name,
            role_id=self.role_id)


def get_cloud_provider_access_setup(azure_configs: Optional[Sequence[pulumi.InputType['GetCloudProviderAccessSetupAzureConfigArgs']]] = None,
                                    project_id: Optional[str] = None,
                                    provider_name: Optional[str] = None,
                                    role_id: Optional[str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCloudProviderAccessSetupResult:
    """
    `CloudProviderAccessSetup` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ### With AWS
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_role = mongodbatlas.CloudProviderAccessSetup("test_role",
        project_id="64259ee860c43338194b0f8e",
        provider_name="AWS")
    single_setup = mongodbatlas.get_cloud_provider_access_setup_output(project_id=test_role.project_id,
        provider_name=test_role.provider_name,
        role_id=test_role.role_id)
    ```

    ### With AZURE
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_role = mongodbatlas.CloudProviderAccessSetup("test_role",
        project_id="64259ee860c43338194b0f8e",
        provider_name="AZURE",
        azure_configs=[mongodbatlas.CloudProviderAccessSetupAzureConfigArgs(
            atlas_azure_app_id="9f2deb0d-be22-4524-a403-df531868bac0",
            service_principal_id="22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1",
            tenant_id="91402384-d71e-22f5-22dd-759e272cdc1c",
        )])
    single_setup = mongodbatlas.get_cloud_provider_access_setup_output(project_id=test_role.project_id,
        provider_name=test_role.provider_name,
        role_id=test_role.role_id)
    ```


    :param Sequence[pulumi.InputType['GetCloudProviderAccessSetupAzureConfigArgs']] azure_configs: azure related configurations
    :param str project_id: The unique ID for the project to get all Cloud Provider Access
    :param str provider_name: cloud provider name, currently only AWS is supported
    :param str role_id: unique role id among all the aws roles provided by mongodb atlas
    """
    __args__ = dict()
    __args__['azureConfigs'] = azure_configs
    __args__['projectId'] = project_id
    __args__['providerName'] = provider_name
    __args__['roleId'] = role_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getCloudProviderAccessSetup:getCloudProviderAccessSetup', __args__, opts=opts, typ=GetCloudProviderAccessSetupResult).value

    return AwaitableGetCloudProviderAccessSetupResult(
        aws=pulumi.get(__ret__, 'aws'),
        aws_configs=pulumi.get(__ret__, 'aws_configs'),
        azure_configs=pulumi.get(__ret__, 'azure_configs'),
        created_date=pulumi.get(__ret__, 'created_date'),
        id=pulumi.get(__ret__, 'id'),
        last_updated_date=pulumi.get(__ret__, 'last_updated_date'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_name=pulumi.get(__ret__, 'provider_name'),
        role_id=pulumi.get(__ret__, 'role_id'))


@_utilities.lift_output_func(get_cloud_provider_access_setup)
def get_cloud_provider_access_setup_output(azure_configs: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetCloudProviderAccessSetupAzureConfigArgs']]]]] = None,
                                           project_id: Optional[pulumi.Input[str]] = None,
                                           provider_name: Optional[pulumi.Input[str]] = None,
                                           role_id: Optional[pulumi.Input[str]] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCloudProviderAccessSetupResult]:
    """
    `CloudProviderAccessSetup` allows you to get a single role for a provider access role setup, currently only AWS and Azure are supported.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ### With AWS
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_role = mongodbatlas.CloudProviderAccessSetup("test_role",
        project_id="64259ee860c43338194b0f8e",
        provider_name="AWS")
    single_setup = mongodbatlas.get_cloud_provider_access_setup_output(project_id=test_role.project_id,
        provider_name=test_role.provider_name,
        role_id=test_role.role_id)
    ```

    ### With AZURE
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_role = mongodbatlas.CloudProviderAccessSetup("test_role",
        project_id="64259ee860c43338194b0f8e",
        provider_name="AZURE",
        azure_configs=[mongodbatlas.CloudProviderAccessSetupAzureConfigArgs(
            atlas_azure_app_id="9f2deb0d-be22-4524-a403-df531868bac0",
            service_principal_id="22f1d2a6-d0e9-482a-83a4-b8dd7dddc2c1",
            tenant_id="91402384-d71e-22f5-22dd-759e272cdc1c",
        )])
    single_setup = mongodbatlas.get_cloud_provider_access_setup_output(project_id=test_role.project_id,
        provider_name=test_role.provider_name,
        role_id=test_role.role_id)
    ```


    :param Sequence[pulumi.InputType['GetCloudProviderAccessSetupAzureConfigArgs']] azure_configs: azure related configurations
    :param str project_id: The unique ID for the project to get all Cloud Provider Access
    :param str provider_name: cloud provider name, currently only AWS is supported
    :param str role_id: unique role id among all the aws roles provided by mongodb atlas
    """
    ...
