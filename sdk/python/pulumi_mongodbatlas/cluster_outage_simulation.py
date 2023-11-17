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

__all__ = ['ClusterOutageSimulationArgs', 'ClusterOutageSimulation']

@pulumi.input_type
class ClusterOutageSimulationArgs:
    def __init__(__self__, *,
                 cluster_name: pulumi.Input[str],
                 outage_filters: pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]],
                 project_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ClusterOutageSimulation resource.
        :param pulumi.Input[str] cluster_name: Name of the Atlas Cluster that is/will undergoing outage simulation.
        :param pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]] outage_filters: (Minimum one required) List of settings that specify the type of cluster outage simulation.
        :param pulumi.Input[str] project_id: The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        """
        pulumi.set(__self__, "cluster_name", cluster_name)
        pulumi.set(__self__, "outage_filters", outage_filters)
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Input[str]:
        """
        Name of the Atlas Cluster that is/will undergoing outage simulation.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="outageFilters")
    def outage_filters(self) -> pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]]:
        """
        (Minimum one required) List of settings that specify the type of cluster outage simulation.
        """
        return pulumi.get(self, "outage_filters")

    @outage_filters.setter
    def outage_filters(self, value: pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]]):
        pulumi.set(self, "outage_filters", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _ClusterOutageSimulationState:
    def __init__(__self__, *,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 outage_filters: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 simulation_id: Optional[pulumi.Input[str]] = None,
                 start_request_date: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClusterOutageSimulation resources.
        :param pulumi.Input[str] cluster_name: Name of the Atlas Cluster that is/will undergoing outage simulation.
        :param pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]] outage_filters: (Minimum one required) List of settings that specify the type of cluster outage simulation.
        :param pulumi.Input[str] project_id: The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        :param pulumi.Input[str] simulation_id: Unique 24-hexadecimal character string that identifies the outage simulation.
        :param pulumi.Input[str] start_request_date: Date and time when MongoDB Cloud started the regional outage simulation.
        :param pulumi.Input[str] state: Current phase of the outage simulation:
        """
        if cluster_name is not None:
            pulumi.set(__self__, "cluster_name", cluster_name)
        if outage_filters is not None:
            pulumi.set(__self__, "outage_filters", outage_filters)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if simulation_id is not None:
            pulumi.set(__self__, "simulation_id", simulation_id)
        if start_request_date is not None:
            pulumi.set(__self__, "start_request_date", start_request_date)
        if state is not None:
            pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Atlas Cluster that is/will undergoing outage simulation.
        """
        return pulumi.get(self, "cluster_name")

    @cluster_name.setter
    def cluster_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_name", value)

    @property
    @pulumi.getter(name="outageFilters")
    def outage_filters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]]]:
        """
        (Minimum one required) List of settings that specify the type of cluster outage simulation.
        """
        return pulumi.get(self, "outage_filters")

    @outage_filters.setter
    def outage_filters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ClusterOutageSimulationOutageFilterArgs']]]]):
        pulumi.set(self, "outage_filters", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="simulationId")
    def simulation_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique 24-hexadecimal character string that identifies the outage simulation.
        """
        return pulumi.get(self, "simulation_id")

    @simulation_id.setter
    def simulation_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "simulation_id", value)

    @property
    @pulumi.getter(name="startRequestDate")
    def start_request_date(self) -> Optional[pulumi.Input[str]]:
        """
        Date and time when MongoDB Cloud started the regional outage simulation.
        """
        return pulumi.get(self, "start_request_date")

    @start_request_date.setter
    def start_request_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_request_date", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        Current phase of the outage simulation:
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)


class ClusterOutageSimulation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 outage_filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterOutageSimulationOutageFilterArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `ClusterOutageSimulation` provides a Cluster Outage Simulation resource. For more details see https://www.mongodb.com/docs/atlas/tutorial/test-resilience/simulate-regional-outage/

        Test Outage on Minority of Electable Nodes - Select fewer than half of your electable nodes.

        Test Outage on Majority of Electable Nodes - Select at least one more than half of your electable nodes and keep at least one electable node remaining.

        **IMPORTANT:** Test Outage on Majority of Electable Nodes will leave the Atlas cluster without a majority quorum. There will be no primary so write operations will not succeed, and reads will succeed only when configured with a suitable [readPreference](https://www.mongodb.com/docs/manual/core/read-preference/). To recover the majority quorum, you will have the option to manually reconfigure your cluster by adding new nodes to existing regions or adding new regions at the risk of losing recent writes, or end the simulation.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **IMPORTANT:** This resource cannot be updated.
        **IMPORTANT:** An existing Cluster Outage Simulation cannot be imported as this resource does not support import operation.

        ## Example Usage
        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        outage_simulation = mongodbatlas.ClusterOutageSimulation("outageSimulation",
            cluster_name="Cluster0",
            outage_filters=[
                mongodbatlas.ClusterOutageSimulationOutageFilterArgs(
                    cloud_provider="AWS",
                    region_name="US_EAST_1",
                ),
                mongodbatlas.ClusterOutageSimulationOutageFilterArgs(
                    cloud_provider="AWS",
                    region_name="US_EAST_2",
                ),
            ],
            project_id="64707f06c519c20c3a2b1b03")
        ```

        ## Import

        The `mongodbatlas_cluster_outage_simulation` resource does not support import operation. See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cluster-Outage-Simulation) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: Name of the Atlas Cluster that is/will undergoing outage simulation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterOutageSimulationOutageFilterArgs']]]] outage_filters: (Minimum one required) List of settings that specify the type of cluster outage simulation.
        :param pulumi.Input[str] project_id: The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterOutageSimulationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `ClusterOutageSimulation` provides a Cluster Outage Simulation resource. For more details see https://www.mongodb.com/docs/atlas/tutorial/test-resilience/simulate-regional-outage/

        Test Outage on Minority of Electable Nodes - Select fewer than half of your electable nodes.

        Test Outage on Majority of Electable Nodes - Select at least one more than half of your electable nodes and keep at least one electable node remaining.

        **IMPORTANT:** Test Outage on Majority of Electable Nodes will leave the Atlas cluster without a majority quorum. There will be no primary so write operations will not succeed, and reads will succeed only when configured with a suitable [readPreference](https://www.mongodb.com/docs/manual/core/read-preference/). To recover the majority quorum, you will have the option to manually reconfigure your cluster by adding new nodes to existing regions or adding new regions at the risk of losing recent writes, or end the simulation.

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **IMPORTANT:** This resource cannot be updated.
        **IMPORTANT:** An existing Cluster Outage Simulation cannot be imported as this resource does not support import operation.

        ## Example Usage
        ### S

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        outage_simulation = mongodbatlas.ClusterOutageSimulation("outageSimulation",
            cluster_name="Cluster0",
            outage_filters=[
                mongodbatlas.ClusterOutageSimulationOutageFilterArgs(
                    cloud_provider="AWS",
                    region_name="US_EAST_1",
                ),
                mongodbatlas.ClusterOutageSimulationOutageFilterArgs(
                    cloud_provider="AWS",
                    region_name="US_EAST_2",
                ),
            ],
            project_id="64707f06c519c20c3a2b1b03")
        ```

        ## Import

        The `mongodbatlas_cluster_outage_simulation` resource does not support import operation. See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Cluster-Outage-Simulation) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param ClusterOutageSimulationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterOutageSimulationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_name: Optional[pulumi.Input[str]] = None,
                 outage_filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterOutageSimulationOutageFilterArgs']]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterOutageSimulationArgs.__new__(ClusterOutageSimulationArgs)

            if cluster_name is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_name'")
            __props__.__dict__["cluster_name"] = cluster_name
            if outage_filters is None and not opts.urn:
                raise TypeError("Missing required property 'outage_filters'")
            __props__.__dict__["outage_filters"] = outage_filters
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["simulation_id"] = None
            __props__.__dict__["start_request_date"] = None
            __props__.__dict__["state"] = None
        super(ClusterOutageSimulation, __self__).__init__(
            'mongodbatlas:index/clusterOutageSimulation:ClusterOutageSimulation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_name: Optional[pulumi.Input[str]] = None,
            outage_filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterOutageSimulationOutageFilterArgs']]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            simulation_id: Optional[pulumi.Input[str]] = None,
            start_request_date: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None) -> 'ClusterOutageSimulation':
        """
        Get an existing ClusterOutageSimulation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_name: Name of the Atlas Cluster that is/will undergoing outage simulation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ClusterOutageSimulationOutageFilterArgs']]]] outage_filters: (Minimum one required) List of settings that specify the type of cluster outage simulation.
        :param pulumi.Input[str] project_id: The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        :param pulumi.Input[str] simulation_id: Unique 24-hexadecimal character string that identifies the outage simulation.
        :param pulumi.Input[str] start_request_date: Date and time when MongoDB Cloud started the regional outage simulation.
        :param pulumi.Input[str] state: Current phase of the outage simulation:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterOutageSimulationState.__new__(_ClusterOutageSimulationState)

        __props__.__dict__["cluster_name"] = cluster_name
        __props__.__dict__["outage_filters"] = outage_filters
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["simulation_id"] = simulation_id
        __props__.__dict__["start_request_date"] = start_request_date
        __props__.__dict__["state"] = state
        return ClusterOutageSimulation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> pulumi.Output[str]:
        """
        Name of the Atlas Cluster that is/will undergoing outage simulation.
        """
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter(name="outageFilters")
    def outage_filters(self) -> pulumi.Output[Sequence['outputs.ClusterOutageSimulationOutageFilter']]:
        """
        (Minimum one required) List of settings that specify the type of cluster outage simulation.
        """
        return pulumi.get(self, "outage_filters")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project that contains the cluster that is/will undergoing outage simulation.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="simulationId")
    def simulation_id(self) -> pulumi.Output[str]:
        """
        Unique 24-hexadecimal character string that identifies the outage simulation.
        """
        return pulumi.get(self, "simulation_id")

    @property
    @pulumi.getter(name="startRequestDate")
    def start_request_date(self) -> pulumi.Output[str]:
        """
        Date and time when MongoDB Cloud started the regional outage simulation.
        """
        return pulumi.get(self, "start_request_date")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        Current phase of the outage simulation:
        """
        return pulumi.get(self, "state")

