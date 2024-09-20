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
    'GetEncryptionAtRestPrivateEndpointsResult',
    'AwaitableGetEncryptionAtRestPrivateEndpointsResult',
    'get_encryption_at_rest_private_endpoints',
    'get_encryption_at_rest_private_endpoints_output',
]

@pulumi.output_type
class GetEncryptionAtRestPrivateEndpointsResult:
    """
    A collection of values returned by getEncryptionAtRestPrivateEndpoints.
    """
    def __init__(__self__, cloud_provider=None, id=None, project_id=None, results=None):
        if cloud_provider and not isinstance(cloud_provider, str):
            raise TypeError("Expected argument 'cloud_provider' to be a str")
        pulumi.set(__self__, "cloud_provider", cloud_provider)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @property
    @pulumi.getter(name="cloudProvider")
    def cloud_provider(self) -> str:
        """
        Human-readable label that identifies the cloud provider for the private endpoints to return.
        """
        return pulumi.get(self, "cloud_provider")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetEncryptionAtRestPrivateEndpointsResultResult']:
        """
        List of returned documents that MongoDB Cloud providers when completing this request.
        """
        return pulumi.get(self, "results")


class AwaitableGetEncryptionAtRestPrivateEndpointsResult(GetEncryptionAtRestPrivateEndpointsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEncryptionAtRestPrivateEndpointsResult(
            cloud_provider=self.cloud_provider,
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_encryption_at_rest_private_endpoints(cloud_provider: Optional[str] = None,
                                             project_id: Optional[str] = None,
                                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEncryptionAtRestPrivateEndpointsResult:
    """
    ## # Data Source: get_encryption_at_rest_private_endpoints

    `get_encryption_at_rest_private_endpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.

    > **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager.
    To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).

    ## Example Usage

    ### S

    > **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    plural = mongodbatlas.get_encryption_at_rest_private_endpoints(project_id=atlas_project_id,
        cloud_provider="AZURE")
    pulumi.export("numberOfEndpoints", len(plural.results))
    ```


    :param str cloud_provider: Human-readable label that identifies the cloud provider for the private endpoints to return.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['cloudProvider'] = cloud_provider
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getEncryptionAtRestPrivateEndpoints:getEncryptionAtRestPrivateEndpoints', __args__, opts=opts, typ=GetEncryptionAtRestPrivateEndpointsResult).value

    return AwaitableGetEncryptionAtRestPrivateEndpointsResult(
        cloud_provider=pulumi.get(__ret__, 'cloud_provider'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))


@_utilities.lift_output_func(get_encryption_at_rest_private_endpoints)
def get_encryption_at_rest_private_endpoints_output(cloud_provider: Optional[pulumi.Input[str]] = None,
                                                    project_id: Optional[pulumi.Input[str]] = None,
                                                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEncryptionAtRestPrivateEndpointsResult]:
    """
    ## # Data Source: get_encryption_at_rest_private_endpoints

    `get_encryption_at_rest_private_endpoints` describes private endpoints of a particular cloud provider used for encryption at rest using customer-managed keys.

    > **IMPORTANT** The Encryption at Rest using Azure Key Vault over Private Endpoints feature is available by request. To request this functionality for your Atlas deployments, contact your Account Manager.
    To learn more about existing limitations, see [Manage Customer Keys with Azure Key Vault Over Private Endpoints](https://www.mongodb.com/docs/atlas/security/azure-kms-over-private-endpoint/#manage-customer-keys-with-azure-key-vault-over-private-endpoints).

    ## Example Usage

    ### S

    > **NOTE:** Only Azure Key Vault with Azure Private Link is supported at this time.

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    plural = mongodbatlas.get_encryption_at_rest_private_endpoints(project_id=atlas_project_id,
        cloud_provider="AZURE")
    pulumi.export("numberOfEndpoints", len(plural.results))
    ```


    :param str cloud_provider: Human-readable label that identifies the cloud provider for the private endpoints to return.
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    ...