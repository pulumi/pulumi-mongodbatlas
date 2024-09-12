# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetEncryptionAtRestPrivateEndpointResult',
    'AwaitableGetEncryptionAtRestPrivateEndpointResult',
    'get_encryption_at_rest_private_endpoint',
    'get_encryption_at_rest_private_endpoint_output',
]

@pulumi.output_type
class GetEncryptionAtRestPrivateEndpointResult:
    """
    A collection of values returned by getEncryptionAtRestPrivateEndpoint.
    """
    def __init__(__self__, cloud_provider=None, error_message=None, id=None, private_endpoint_connection_name=None, project_id=None, region_name=None, status=None):
        if cloud_provider and not isinstance(cloud_provider, str):
            raise TypeError("Expected argument 'cloud_provider' to be a str")
        pulumi.set(__self__, "cloud_provider", cloud_provider)
        if error_message and not isinstance(error_message, str):
            raise TypeError("Expected argument 'error_message' to be a str")
        pulumi.set(__self__, "error_message", error_message)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if private_endpoint_connection_name and not isinstance(private_endpoint_connection_name, str):
            raise TypeError("Expected argument 'private_endpoint_connection_name' to be a str")
        pulumi.set(__self__, "private_endpoint_connection_name", private_endpoint_connection_name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if region_name and not isinstance(region_name, str):
            raise TypeError("Expected argument 'region_name' to be a str")
        pulumi.set(__self__, "region_name", region_name)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> str:
        """
        Label that identifies the cloud provider of the private endpoint.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter(name="errorMessage")
    def error_message(self) -> str:
        """
        Error message for failures associated with the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "error_message")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="privateEndpointConnectionName")
    def private_endpoint_connection_name(self) -> str:
        """
        Connection name of the Azure Private Endpoint.
        """
        return pulumi.get(self, "private_endpoint_connection_name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="regionName")
    def region_name(self) -> str:
        """
        Cloud provider region in which the Encryption At Rest private endpoint is located.
        """
        return pulumi.get(self, "region_name")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        State of the Encryption At Rest private endpoint.
        """
        return pulumi.get(self, "status")


class AwaitableGetEncryptionAtRestPrivateEndpointResult(GetEncryptionAtRestPrivateEndpointResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEncryptionAtRestPrivateEndpointResult(
            cloud_provider=self.cloud_provider,
            error_message=self.error_message,
            id=self.id,
            private_endpoint_connection_name=self.private_endpoint_connection_name,
            project_id=self.project_id,
            region_name=self.region_name,
            status=self.status)


def get_encryption_at_rest_private_endpoint(cloud_provider: Optional[str] = None,
                                            id: Optional[str] = None,
                                            project_id: Optional[str] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEncryptionAtRestPrivateEndpointResult:
    """
    ## # Data Source: EncryptionAtRestPrivateEndpoint

    `EncryptionAtRestPrivateEndpoint` describes a private endpoint used for encryption at rest using customer-managed keys.

    > **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager.
    To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).

    ## Example Usage

    ### S

    > **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    single = mongodbatlas.get_encryption_at_rest_private_endpoint(project_id=atlas_project_id,
        cloud_provider="AZURE",
        id=endpoint["id"])
    pulumi.export("endpointConnectionName", single.private_endpoint_connection_name)
    ```


    :param str cloud_provider: Label that identifies the cloud provider of the private endpoint.
    :param str id: Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['cloudProvider'] = cloud_provider
    __args__['id'] = id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getEncryptionAtRestPrivateEndpoint:getEncryptionAtRestPrivateEndpoint', __args__, opts=opts, typ=GetEncryptionAtRestPrivateEndpointResult).value

    return AwaitableGetEncryptionAtRestPrivateEndpointResult(
        cloud_provider=pulumi.get(__ret__, 'cloud_provider'),
        error_message=pulumi.get(__ret__, 'error_message'),
        id=pulumi.get(__ret__, 'id'),
        private_endpoint_connection_name=pulumi.get(__ret__, 'private_endpoint_connection_name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        region_name=pulumi.get(__ret__, 'region_name'),
        status=pulumi.get(__ret__, 'status'))


@_utilities.lift_output_func(get_encryption_at_rest_private_endpoint)
def get_encryption_at_rest_private_endpoint_output(cloud_provider: Optional[pulumi.Input[str]] = None,
                                                   id: Optional[pulumi.Input[str]] = None,
                                                   project_id: Optional[pulumi.Input[str]] = None,
                                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEncryptionAtRestPrivateEndpointResult]:
    """
    ## # Data Source: EncryptionAtRestPrivateEndpoint

    `EncryptionAtRestPrivateEndpoint` describes a private endpoint used for encryption at rest using customer-managed keys.

    > **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager.
    To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).

    ## Example Usage

    ### S

    > **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    single = mongodbatlas.get_encryption_at_rest_private_endpoint(project_id=atlas_project_id,
        cloud_provider="AZURE",
        id=endpoint["id"])
    pulumi.export("endpointConnectionName", single.private_endpoint_connection_name)
    ```


    :param str cloud_provider: Label that identifies the cloud provider of the private endpoint.
    :param str id: Unique 24-hexadecimal digit string that identifies the Private Endpoint Service.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    ...
