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
    'GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult',
    'AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult',
    'get_privatelink_endpoint_service_data_federation_online_archive',
    'get_privatelink_endpoint_service_data_federation_online_archive_output',
]

@pulumi.output_type
class GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult:
    """
    A collection of values returned by getPrivatelinkEndpointServiceDataFederationOnlineArchive.
    """
    def __init__(__self__, comment=None, customer_endpoint_dns_name=None, endpoint_id=None, id=None, project_id=None, provider_name=None, region=None, type=None):
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if customer_endpoint_dns_name and not isinstance(customer_endpoint_dns_name, str):
            raise TypeError("Expected argument 'customer_endpoint_dns_name' to be a str")
        pulumi.set(__self__, "customer_endpoint_dns_name", customer_endpoint_dns_name)
        if endpoint_id and not isinstance(endpoint_id, str):
            raise TypeError("Expected argument 'endpoint_id' to be a str")
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if provider_name and not isinstance(provider_name, str):
            raise TypeError("Expected argument 'provider_name' to be a str")
        pulumi.set(__self__, "provider_name", provider_name)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="customerEndpointDnsName")
    def customer_endpoint_dns_name(self) -> str:
        """
        (Optional) Human-readable label to identify VPC endpoint DNS name.
        """
        return pulumi.get(self, "customer_endpoint_dns_name")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> str:
        return pulumi.get(self, "endpoint_id")

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
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> str:
        """
        Human-readable label that identifies the cloud service provider.
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Human-readable label that identifies the resource type associated with this private endpoint.
        """
        return pulumi.get(self, "type")


class AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult(GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult(
            comment=self.comment,
            customer_endpoint_dns_name=self.customer_endpoint_dns_name,
            endpoint_id=self.endpoint_id,
            id=self.id,
            project_id=self.project_id,
            provider_name=self.provider_name,
            region=self.region,
            type=self.type)


def get_privatelink_endpoint_service_data_federation_online_archive(endpoint_id: Optional[str] = None,
                                                                    project_id: Optional[str] = None,
                                                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult:
    """
    `PrivatelinkEndpointServiceDataFederationOnlineArchive` describes a Private Endpoint Service resource for Data Federation and Online Archive.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    atlas_project = mongodbatlas.Project("atlas-project", org_id=var["atlas_org_id"])
    test = mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test",
        project_id=atlas_project.id,
        endpoint_id="vpce-046cf43c79424d4c9",
        provider_name="AWS",
        comment="Test",
        region="US_EAST_1",
        customer_endpoint_dns_name="vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com")
    test_data_source = mongodbatlas.get_privatelink_endpoint_service_data_federation_online_archive_output(project_id=atlas_project.id,
        endpoint_id=test.endpoint_id)
    ```
    <!--End PulumiCodeChooser -->


    :param str endpoint_id: Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%!D(MISSING)ata%!L(MISSING)ake%!s(MISSING)upports%!A(MISSING)mazon%!W(MISSING)eb%!S(MISSING)ervices%!p(MISSING)rivate%!e(MISSING)ndpoints%!u(MISSING)sing%!t(MISSING)he%!A(MISSING)WS%!P(MISSING)rivateLink%!f(MISSING)eature).
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['endpointId'] = endpoint_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getPrivatelinkEndpointServiceDataFederationOnlineArchive:getPrivatelinkEndpointServiceDataFederationOnlineArchive', __args__, opts=opts, typ=GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult).value

    return AwaitableGetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult(
        comment=pulumi.get(__ret__, 'comment'),
        customer_endpoint_dns_name=pulumi.get(__ret__, 'customer_endpoint_dns_name'),
        endpoint_id=pulumi.get(__ret__, 'endpoint_id'),
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        provider_name=pulumi.get(__ret__, 'provider_name'),
        region=pulumi.get(__ret__, 'region'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_privatelink_endpoint_service_data_federation_online_archive)
def get_privatelink_endpoint_service_data_federation_online_archive_output(endpoint_id: Optional[pulumi.Input[str]] = None,
                                                                           project_id: Optional[pulumi.Input[str]] = None,
                                                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPrivatelinkEndpointServiceDataFederationOnlineArchiveResult]:
    """
    `PrivatelinkEndpointServiceDataFederationOnlineArchive` describes a Private Endpoint Service resource for Data Federation and Online Archive.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    atlas_project = mongodbatlas.Project("atlas-project", org_id=var["atlas_org_id"])
    test = mongodbatlas.PrivatelinkEndpointServiceDataFederationOnlineArchive("test",
        project_id=atlas_project.id,
        endpoint_id="vpce-046cf43c79424d4c9",
        provider_name="AWS",
        comment="Test",
        region="US_EAST_1",
        customer_endpoint_dns_name="vpce-046cf43c79424d4c9-nmls2y9k.vpce-svc-0824460b72e1a420e.us-east-1.vpce.amazonaws.com")
    test_data_source = mongodbatlas.get_privatelink_endpoint_service_data_federation_online_archive_output(project_id=atlas_project.id,
        endpoint_id=test.endpoint_id)
    ```
    <!--End PulumiCodeChooser -->


    :param str endpoint_id: Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%!D(MISSING)ata%!L(MISSING)ake%!s(MISSING)upports%!A(MISSING)mazon%!W(MISSING)eb%!S(MISSING)ervices%!p(MISSING)rivate%!e(MISSING)ndpoints%!u(MISSING)sing%!t(MISSING)he%!A(MISSING)WS%!P(MISSING)rivateLink%!f(MISSING)eature).
    :param str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    ...
