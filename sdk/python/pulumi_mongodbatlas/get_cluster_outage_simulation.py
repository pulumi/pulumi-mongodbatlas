# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetClusterOutageSimulationResult',
    'AwaitableGetClusterOutageSimulationResult',
    'get_cluster_outage_simulation',
    'get_cluster_outage_simulation_output',
]

@pulumi.output_type
class GetClusterOutageSimulationResult:
    """
    A collection of values returned by getClusterOutageSimulation.
    """
    def __init__(__self__, cluster_name=None, id=None, outage_filters=None, project_id=None, simulation_id=None, start_request_date=None, state=None):
        if cluster_name and not isinstance(cluster_name, str):
            raise TypeError("Expected argument 'cluster_name' to be a str")
        pulumi.set(__self__, "cluster_name", cluster_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if outage_filters and not isinstance(outage_filters, list):
            raise TypeError("Expected argument 'outage_filters' to be a list")
        pulumi.set(__self__, "outage_filters", outage_filters)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if simulation_id and not isinstance(simulation_id, str):
            raise TypeError("Expected argument 'simulation_id' to be a str")
        pulumi.set(__self__, "simulation_id", simulation_id)
        if start_request_date and not isinstance(start_request_date, str):
            raise TypeError("Expected argument 'start_request_date' to be a str")
        pulumi.set(__self__, "start_request_date", start_request_date)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)

    @property
    @pulumi.getter(name="clusterName")
    def cluster_name(self) -> str:
        return pulumi.get(self, "cluster_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="outageFilters")
    def outage_filters(self) -> Sequence['outputs.GetClusterOutageSimulationOutageFilterResult']:
        """
        List of settings that specify the type of cluster outage simulation.
        """
        return pulumi.get(self, "outage_filters")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="simulationId")
    def simulation_id(self) -> str:
        """
        Unique 24-hexadecimal character string that identifies the outage simulation.
        """
        return pulumi.get(self, "simulation_id")

    @property
    @pulumi.getter(name="startRequestDate")
    def start_request_date(self) -> str:
        """
        Date and time when MongoDB Cloud started the regional outage simulation.
        """
        return pulumi.get(self, "start_request_date")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        Current phase of the outage simulation:
        * `START_REQUESTED` - User has requested cluster outage simulation.
        * `STARTING` - MongoDB Cloud is starting cluster outage simulation.
        * `SIMULATING` - MongoDB Cloud is simulating cluster outage.
        * `RECOVERY_REQUESTED` - User has requested recovery from the simulated outage.
        * `RECOVERING` - MongoDB Cloud is recovering the cluster from the simulated outage.
        * `COMPLETE` - MongoDB Cloud has completed the cluster outage simulation.
        """
        return pulumi.get(self, "state")


class AwaitableGetClusterOutageSimulationResult(GetClusterOutageSimulationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterOutageSimulationResult(
            cluster_name=self.cluster_name,
            id=self.id,
            outage_filters=self.outage_filters,
            project_id=self.project_id,
            simulation_id=self.simulation_id,
            start_request_date=self.start_request_date,
            state=self.state)


def get_cluster_outage_simulation(cluster_name: Optional[str] = None,
                                  project_id: Optional[str] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterOutageSimulationResult:
    """
    ## Example Usage

    ### S

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    outage_simulation = mongodbatlas.get_cluster_outage_simulation(project_id="64707f06c519c20c3a2b1b03",
        cluster_name="Cluster0")
    ```


    :param str cluster_name: Name of the Atlas Cluster that is undergoing outage simulation.
    :param str project_id: The unique ID for the project that contains the cluster that is undergoing outage simulation.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getClusterOutageSimulation:getClusterOutageSimulation', __args__, opts=opts, typ=GetClusterOutageSimulationResult).value

    return AwaitableGetClusterOutageSimulationResult(
        cluster_name=pulumi.get(__ret__, 'cluster_name'),
        id=pulumi.get(__ret__, 'id'),
        outage_filters=pulumi.get(__ret__, 'outage_filters'),
        project_id=pulumi.get(__ret__, 'project_id'),
        simulation_id=pulumi.get(__ret__, 'simulation_id'),
        start_request_date=pulumi.get(__ret__, 'start_request_date'),
        state=pulumi.get(__ret__, 'state'))
def get_cluster_outage_simulation_output(cluster_name: Optional[pulumi.Input[str]] = None,
                                         project_id: Optional[pulumi.Input[str]] = None,
                                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetClusterOutageSimulationResult]:
    """
    ## Example Usage

    ### S

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    outage_simulation = mongodbatlas.get_cluster_outage_simulation(project_id="64707f06c519c20c3a2b1b03",
        cluster_name="Cluster0")
    ```


    :param str cluster_name: Name of the Atlas Cluster that is undergoing outage simulation.
    :param str project_id: The unique ID for the project that contains the cluster that is undergoing outage simulation.
    """
    __args__ = dict()
    __args__['clusterName'] = cluster_name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getClusterOutageSimulation:getClusterOutageSimulation', __args__, opts=opts, typ=GetClusterOutageSimulationResult)
    return __ret__.apply(lambda __response__: GetClusterOutageSimulationResult(
        cluster_name=pulumi.get(__response__, 'cluster_name'),
        id=pulumi.get(__response__, 'id'),
        outage_filters=pulumi.get(__response__, 'outage_filters'),
        project_id=pulumi.get(__response__, 'project_id'),
        simulation_id=pulumi.get(__response__, 'simulation_id'),
        start_request_date=pulumi.get(__response__, 'start_request_date'),
        state=pulumi.get(__response__, 'state')))
