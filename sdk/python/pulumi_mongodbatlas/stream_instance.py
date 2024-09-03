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

__all__ = ['StreamInstanceArgs', 'StreamInstance']

@pulumi.input_type
class StreamInstanceArgs:
    def __init__(__self__, *,
                 data_process_region: pulumi.Input['StreamInstanceDataProcessRegionArgs'],
                 instance_name: pulumi.Input[str],
                 project_id: pulumi.Input[str],
                 stream_config: Optional[pulumi.Input['StreamInstanceStreamConfigArgs']] = None):
        """
        The set of arguments for constructing a StreamInstance resource.
        :param pulumi.Input['StreamInstanceDataProcessRegionArgs'] data_process_region: Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the stream instance.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input['StreamInstanceStreamConfigArgs'] stream_config: Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        pulumi.set(__self__, "data_process_region", data_process_region)
        pulumi.set(__self__, "instance_name", instance_name)
        pulumi.set(__self__, "project_id", project_id)
        if stream_config is not None:
            pulumi.set(__self__, "stream_config", stream_config)

    @property
    @pulumi.getter(name="dataProcessRegion")
    def data_process_region(self) -> pulumi.Input['StreamInstanceDataProcessRegionArgs']:
        """
        Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        """
        return pulumi.get(self, "data_process_region")

    @data_process_region.setter
    def data_process_region(self, value: pulumi.Input['StreamInstanceDataProcessRegionArgs']):
        pulumi.set(self, "data_process_region", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Input[str]:
        """
        Human-readable label that identifies the stream instance.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "instance_name", value)

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
    @pulumi.getter(name="streamConfig")
    def stream_config(self) -> Optional[pulumi.Input['StreamInstanceStreamConfigArgs']]:
        """
        Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        return pulumi.get(self, "stream_config")

    @stream_config.setter
    def stream_config(self, value: Optional[pulumi.Input['StreamInstanceStreamConfigArgs']]):
        pulumi.set(self, "stream_config", value)


@pulumi.input_type
class _StreamInstanceState:
    def __init__(__self__, *,
                 data_process_region: Optional[pulumi.Input['StreamInstanceDataProcessRegionArgs']] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 stream_config: Optional[pulumi.Input['StreamInstanceStreamConfigArgs']] = None):
        """
        Input properties used for looking up and filtering StreamInstance resources.
        :param pulumi.Input['StreamInstanceDataProcessRegionArgs'] data_process_region: Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: List that contains the hostnames assigned to the stream instance.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the stream instance.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input['StreamInstanceStreamConfigArgs'] stream_config: Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        if data_process_region is not None:
            pulumi.set(__self__, "data_process_region", data_process_region)
        if hostnames is not None:
            pulumi.set(__self__, "hostnames", hostnames)
        if instance_name is not None:
            pulumi.set(__self__, "instance_name", instance_name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if stream_config is not None:
            pulumi.set(__self__, "stream_config", stream_config)

    @property
    @pulumi.getter(name="dataProcessRegion")
    def data_process_region(self) -> Optional[pulumi.Input['StreamInstanceDataProcessRegionArgs']]:
        """
        Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        """
        return pulumi.get(self, "data_process_region")

    @data_process_region.setter
    def data_process_region(self, value: Optional[pulumi.Input['StreamInstanceDataProcessRegionArgs']]):
        pulumi.set(self, "data_process_region", value)

    @property
    @pulumi.getter
    def hostnames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List that contains the hostnames assigned to the stream instance.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hostnames", value)

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> Optional[pulumi.Input[str]]:
        """
        Human-readable label that identifies the stream instance.
        """
        return pulumi.get(self, "instance_name")

    @instance_name.setter
    def instance_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_name", value)

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
    @pulumi.getter(name="streamConfig")
    def stream_config(self) -> Optional[pulumi.Input['StreamInstanceStreamConfigArgs']]:
        """
        Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        return pulumi.get(self, "stream_config")

    @stream_config.setter
    def stream_config(self, value: Optional[pulumi.Input['StreamInstanceStreamConfigArgs']]):
        pulumi.set(self, "stream_config", value)


class StreamInstance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_process_region: Optional[pulumi.Input[Union['StreamInstanceDataProcessRegionArgs', 'StreamInstanceDataProcessRegionArgsDict']]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 stream_config: Optional[pulumi.Input[Union['StreamInstanceStreamConfigArgs', 'StreamInstanceStreamConfigArgsDict']]] = None,
                 __props__=None):
        """
        # Resource: StreamInstance

        `StreamInstance` provides a Stream Instance resource. The resource lets you create, edit, and delete stream instances in a project.

        ## Import

        You can import stream instance resource using the project ID and instance name, in the format `PROJECT_ID-INSTANCE_NAME`. For example:

        ```sh
        $ pulumi import mongodbatlas:index/streamInstance:StreamInstance test 650972848269185c55f40ca1-InstanceName
        ```
        To learn more, see: [MongoDB Atlas API - Stream Instance](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) Documentation.
        The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['StreamInstanceDataProcessRegionArgs', 'StreamInstanceDataProcessRegionArgsDict']] data_process_region: Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the stream instance.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[Union['StreamInstanceStreamConfigArgs', 'StreamInstanceStreamConfigArgsDict']] stream_config: Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StreamInstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        # Resource: StreamInstance

        `StreamInstance` provides a Stream Instance resource. The resource lets you create, edit, and delete stream instances in a project.

        ## Import

        You can import stream instance resource using the project ID and instance name, in the format `PROJECT_ID-INSTANCE_NAME`. For example:

        ```sh
        $ pulumi import mongodbatlas:index/streamInstance:StreamInstance test 650972848269185c55f40ca1-InstanceName
        ```
        To learn more, see: [MongoDB Atlas API - Stream Instance](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Streams/operation/createStreamInstance) Documentation.
        The Terraform Provider Examples Section also contains details on the overall support for Atlas Streams Processing in Terraform.

        :param str resource_name: The name of the resource.
        :param StreamInstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StreamInstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 data_process_region: Optional[pulumi.Input[Union['StreamInstanceDataProcessRegionArgs', 'StreamInstanceDataProcessRegionArgsDict']]] = None,
                 instance_name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 stream_config: Optional[pulumi.Input[Union['StreamInstanceStreamConfigArgs', 'StreamInstanceStreamConfigArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StreamInstanceArgs.__new__(StreamInstanceArgs)

            if data_process_region is None and not opts.urn:
                raise TypeError("Missing required property 'data_process_region'")
            __props__.__dict__["data_process_region"] = data_process_region
            if instance_name is None and not opts.urn:
                raise TypeError("Missing required property 'instance_name'")
            __props__.__dict__["instance_name"] = instance_name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["stream_config"] = stream_config
            __props__.__dict__["hostnames"] = None
        super(StreamInstance, __self__).__init__(
            'mongodbatlas:index/streamInstance:StreamInstance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            data_process_region: Optional[pulumi.Input[Union['StreamInstanceDataProcessRegionArgs', 'StreamInstanceDataProcessRegionArgsDict']]] = None,
            hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            instance_name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            stream_config: Optional[pulumi.Input[Union['StreamInstanceStreamConfigArgs', 'StreamInstanceStreamConfigArgsDict']]] = None) -> 'StreamInstance':
        """
        Get an existing StreamInstance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['StreamInstanceDataProcessRegionArgs', 'StreamInstanceDataProcessRegionArgsDict']] data_process_region: Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: List that contains the hostnames assigned to the stream instance.
        :param pulumi.Input[str] instance_name: Human-readable label that identifies the stream instance.
        :param pulumi.Input[str] project_id: Unique 24-hexadecimal digit string that identifies your project.
        :param pulumi.Input[Union['StreamInstanceStreamConfigArgs', 'StreamInstanceStreamConfigArgsDict']] stream_config: Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StreamInstanceState.__new__(_StreamInstanceState)

        __props__.__dict__["data_process_region"] = data_process_region
        __props__.__dict__["hostnames"] = hostnames
        __props__.__dict__["instance_name"] = instance_name
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["stream_config"] = stream_config
        return StreamInstance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dataProcessRegion")
    def data_process_region(self) -> pulumi.Output['outputs.StreamInstanceDataProcessRegion']:
        """
        Cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
        """
        return pulumi.get(self, "data_process_region")

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Output[Sequence[str]]:
        """
        List that contains the hostnames assigned to the stream instance.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter(name="instanceName")
    def instance_name(self) -> pulumi.Output[str]:
        """
        Human-readable label that identifies the stream instance.
        """
        return pulumi.get(self, "instance_name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="streamConfig")
    def stream_config(self) -> pulumi.Output['outputs.StreamInstanceStreamConfig']:
        """
        Configuration options for an Atlas Stream Processing Instance. See stream config
        """
        return pulumi.get(self, "stream_config")

