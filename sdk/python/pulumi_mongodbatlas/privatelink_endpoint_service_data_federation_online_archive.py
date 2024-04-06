# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs', 'PrivatelinkEndpointServiceDataFederationOnlineArchive']

@pulumi.input_type
class PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs:
    def __init__(__self__, *,
                 endpoint_id: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 provider_name: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 customer_endpoint_dns_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a PrivatelinkEndpointServiceDataFederationOnlineArchive resource.
        :param pulumi.Input[str] endpoint_id: Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[str] provider_name: Human-readable label that identifies the cloud service provider.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] customer_endpoint_dns_name: Human-readable label to identify VPC endpoint DNS name.
        :param pulumi.Input[str] region: Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        pulumi.set(__self__, "endpoint_id", endpoint_id)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "provider_name", provider_name)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if customer_endpoint_dns_name is not None:
            pulumi.set(__self__, "customer_endpoint_dns_name", customer_endpoint_dns_name)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Input[str]:
        """
        Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "endpoint_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Input[str]:
        """
        Human-readable label that identifies the cloud service provider.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="customerEndpointDnsName")
    def customer_endpoint_dns_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label to identify VPC endpoint DNS name.
        """
        return pulumi.get(self, "customer_endpoint_dns_name")

    @customer_endpoint_dns_name.setter
    def customer_endpoint_dns_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_endpoint_dns_name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _PrivatelinkEndpointServiceDataFederationOnlineArchiveState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 customer_endpoint_dns_name: Optional[pulumi.Input[str]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PrivatelinkEndpointServiceDataFederationOnlineArchive resources.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] customer_endpoint_dns_name: Human-readable label to identify VPC endpoint DNS name.
        :param pulumi.Input[str] endpoint_id: Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[str] provider_name: Human-readable label that identifies the cloud service provider.
        :param pulumi.Input[str] region: Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        :param pulumi.Input[str] type: Human-readable label that identifies the resource type associated with this private endpoint.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if customer_endpoint_dns_name is not None:
            pulumi.set(__self__, "customer_endpoint_dns_name", customer_endpoint_dns_name)
        if endpoint_id is not None:
            pulumi.set(__self__, "endpoint_id", endpoint_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if provider_name is not None:
            pulumi.set(__self__, "provider_name", provider_name)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="customerEndpointDnsName")
    def customer_endpoint_dns_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label to identify VPC endpoint DNS name.
        """
        return pulumi.get(self, "customer_endpoint_dns_name")

    @customer_endpoint_dns_name.setter
    def customer_endpoint_dns_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_endpoint_dns_name", value)

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        """
        return pulumi.get(self, "endpoint_id")

    @endpoint_id.setter
    def endpoint_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that identifies the cloud service provider.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that identifies the resource type associated with this private endpoint.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class PrivatelinkEndpointServiceDataFederationOnlineArchive(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 customer_endpoint_dns_name: Optional[pulumi.Input[str]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `PrivatelinkEndpointServiceDataFederationOnlineArchive` provides a Private Endpoint Service resource for Data Federation and Online Archive. The resource allows you to create and manage a private endpoint for Federated Database Instances and Online Archives to the specified project.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        > **NOTE:** Updates are limited to the `comment` argument.

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
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Private Endpoint Service resource for Data Federation and Online Archive can be imported using project ID, endpoint ID, in the format `project_id`--`endpoint_id`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive example 1112222b3bf99403840e8934--vpce-3bf78b0ddee411ba1
        ```
        See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] customer_endpoint_dns_name: Human-readable label to identify VPC endpoint DNS name.
        :param pulumi.Input[str] endpoint_id: Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[str] provider_name: Human-readable label that identifies the cloud service provider.
        :param pulumi.Input[str] region: Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `PrivatelinkEndpointServiceDataFederationOnlineArchive` provides a Private Endpoint Service resource for Data Federation and Online Archive. The resource allows you to create and manage a private endpoint for Federated Database Instances and Online Archives to the specified project.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        > **NOTE:** Updates are limited to the `comment` argument.

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
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Private Endpoint Service resource for Data Federation and Online Archive can be imported using project ID, endpoint ID, in the format `project_id`--`endpoint_id`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive example 1112222b3bf99403840e8934--vpce-3bf78b0ddee411ba1
        ```
        See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 customer_endpoint_dns_name: Optional[pulumi.Input[str]] = None,
                 endpoint_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs.__new__(PrivatelinkEndpointServiceDataFederationOnlineArchiveArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["customer_endpoint_dns_name"] = customer_endpoint_dns_name
            if endpoint_id is None and not opts.urn:
                raise TypeError("Missing required property 'endpoint_id'")
            __props__.__dict__["endpoint_id"] = endpoint_id
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["region"] = region
            __props__.__dict__["type"] = None
        super(PrivatelinkEndpointServiceDataFederationOnlineArchive, __self__).__init__(
            'mongodbatlas:index/privatelinkEndpointServiceDataFederationOnlineArchive:PrivatelinkEndpointServiceDataFederationOnlineArchive',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            customer_endpoint_dns_name: Optional[pulumi.Input[str]] = None,
            endpoint_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'PrivatelinkEndpointServiceDataFederationOnlineArchive':
        """
        Get an existing PrivatelinkEndpointServiceDataFederationOnlineArchive resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Human-readable string to associate with this private endpoint.
        :param pulumi.Input[str] customer_endpoint_dns_name: Human-readable label to identify VPC endpoint DNS name.
        :param pulumi.Input[str] endpoint_id: Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[str] provider_name: Human-readable label that identifies the cloud service provider.
        :param pulumi.Input[str] region: Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        :param pulumi.Input[str] type: Human-readable label that identifies the resource type associated with this private endpoint.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivatelinkEndpointServiceDataFederationOnlineArchiveState.__new__(_PrivatelinkEndpointServiceDataFederationOnlineArchiveState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["customer_endpoint_dns_name"] = customer_endpoint_dns_name
        __props__.__dict__["endpoint_id"] = endpoint_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["provider_name"] = provider_name
        __props__.__dict__["region"] = region
        __props__.__dict__["type"] = type
        return PrivatelinkEndpointServiceDataFederationOnlineArchive(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Human-readable string to associate with this private endpoint.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="customerEndpointDnsName")
    def customer_endpoint_dns_name(self) -> pulumi.Output[Optional[str]]:
        """
        Human-readable label to identify VPC endpoint DNS name.
        """
        return pulumi.get(self, "customer_endpoint_dns_name")

    @property
    @pulumi.getter(name="endpointId")
    def endpoint_id(self) -> pulumi.Output[str]:
        """
        Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%20Data%20Lake%20supports%20Amazon%20Web%20Services%20private%20endpoints%20using%20the%20AWS%20PrivateLink%20feature).
        """
        return pulumi.get(self, "endpoint_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        """
        Human-readable label that identifies the cloud service provider.
        """
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[Optional[str]]:
        """
        Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Human-readable label that identifies the resource type associated with this private endpoint.
        """
        return pulumi.get(self, "type")

