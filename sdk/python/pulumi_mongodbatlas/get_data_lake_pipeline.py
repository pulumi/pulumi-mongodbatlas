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
    'GetDataLakePipelineResult',
    'AwaitableGetDataLakePipelineResult',
    'get_data_lake_pipeline',
    'get_data_lake_pipeline_output',
]

@pulumi.output_type
class GetDataLakePipelineResult:
    """
    A collection of values returned by getDataLakePipeline.
    """
    def __init__(__self__, created_date=None, id=None, ingestion_schedules=None, last_updated_date=None, name=None, project_id=None, sinks=None, snapshots=None, sources=None, state=None, transformations=None):
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ingestion_schedules and not isinstance(ingestion_schedules, list):
            raise TypeError("Expected argument 'ingestion_schedules' to be a list")
        pulumi.set(__self__, "ingestion_schedules", ingestion_schedules)
        if last_updated_date and not isinstance(last_updated_date, str):
            raise TypeError("Expected argument 'last_updated_date' to be a str")
        pulumi.set(__self__, "last_updated_date", last_updated_date)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if sinks and not isinstance(sinks, list):
            raise TypeError("Expected argument 'sinks' to be a list")
        pulumi.set(__self__, "sinks", sinks)
        if snapshots and not isinstance(snapshots, list):
            raise TypeError("Expected argument 'snapshots' to be a list")
        pulumi.set(__self__, "snapshots", snapshots)
        if sources and not isinstance(sources, list):
            raise TypeError("Expected argument 'sources' to be a list")
        pulumi.set(__self__, "sources", sources)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if transformations and not isinstance(transformations, list):
            raise TypeError("Expected argument 'transformations' to be a list")
        pulumi.set(__self__, "transformations", transformations)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> str:
        """
        Timestamp that indicates when the Data Lake Pipeline was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        Unique 24-hexadecimal digit string that identifies the Data Lake Pipeline.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ingestionSchedules")
    def ingestion_schedules(self) -> Sequence['outputs.GetDataLakePipelineIngestionScheduleResult']:
        """
        List of backup schedule policy items that you can use as a Data Lake Pipeline source.
        * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
        * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
        * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
        * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
        * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        """
        return pulumi.get(self, "ingestion_schedules")

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> str:
        """
        Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Unique 24-hexadecimal character string that identifies the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def sinks(self) -> Sequence['outputs.GetDataLakePipelineSinkResult']:
        return pulumi.get(self, "sinks")

    @property
    @pulumi.getter
    def snapshots(self) -> Sequence['outputs.GetDataLakePipelineSnapshotResult']:
        """
        List of backup snapshots that you can use to trigger an on demand pipeline run.
        * `snapshots.#.id` - Unique 24-hexadecimal digit string that identifies the snapshot.
        * `snapshots.#.provider` - Human-readable label that identifies the cloud provider that stores this snapshot.
        * `snapshots.#.created_at` - Date and time when MongoDB Atlas took the snapshot.
        * `snapshots.#.expires_at` - Date and time when MongoDB Atlas deletes the snapshot.
        * `snapshots.#.frequency_type` - Human-readable label that identifies how often this snapshot triggers.
        * `snapshots.#.master_key` - Unique string that identifies the Amazon Web Services (AWS) Key Management Service (KMS) Customer Master Key (CMK) used to encrypt the snapshot.
        * `snapshots.#.mongod_version` - Version of the MongoDB host that this snapshot backs up.
        * `snapshots.#.replica_set_name` - Human-readable label that identifies the replica set from which MongoDB Atlas took this snapshot.
        * `snapshots.#.type` - Human-readable label that categorizes the cluster as a replica set or sharded cluster.
        * `snapshots.#.snapshot_type` - Human-readable label that identifies when this snapshot triggers.
        * `snapshots.#.status` - Human-readable label that indicates the stage of the backup process for this snapshot.
        * `snapshots.#.size` - List of backup snapshots that you can use to trigger an on demand pipeline run.
        * `snapshots.#.copy_region` - List that identifies the regions to which MongoDB Atlas copies the snapshot.
        * `snapshots.#.policies` - List that contains unique identifiers for the policy items.
        """
        return pulumi.get(self, "snapshots")

    @property
    @pulumi.getter
    def sources(self) -> Sequence['outputs.GetDataLakePipelineSourceResult']:
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        State of this Data Lake Pipeline.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def transformations(self) -> Sequence['outputs.GetDataLakePipelineTransformationResult']:
        """
        Fields to be excluded for this Data Lake Pipeline.
        * `transformations.#.field` - Key in the document.
        * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        return pulumi.get(self, "transformations")


class AwaitableGetDataLakePipelineResult(GetDataLakePipelineResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDataLakePipelineResult(
            created_date=self.created_date,
            id=self.id,
            ingestion_schedules=self.ingestion_schedules,
            last_updated_date=self.last_updated_date,
            name=self.name,
            project_id=self.project_id,
            sinks=self.sinks,
            snapshots=self.snapshots,
            sources=self.sources,
            state=self.state,
            transformations=self.transformations)


def get_data_lake_pipeline(name: Optional[str] = None,
                           project_id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDataLakePipelineResult:
    """
    `DataLakePipeline` describes a Data Lake Pipeline.

    > **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.

    ## Example Usage


    :param str name: Name of the Atlas Data Lake Pipeline.
    :param str project_id: The unique ID for the project to create a Data Lake Pipeline.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getDataLakePipeline:getDataLakePipeline', __args__, opts=opts, typ=GetDataLakePipelineResult).value

    return AwaitableGetDataLakePipelineResult(
        created_date=pulumi.get(__ret__, 'created_date'),
        id=pulumi.get(__ret__, 'id'),
        ingestion_schedules=pulumi.get(__ret__, 'ingestion_schedules'),
        last_updated_date=pulumi.get(__ret__, 'last_updated_date'),
        name=pulumi.get(__ret__, 'name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        sinks=pulumi.get(__ret__, 'sinks'),
        snapshots=pulumi.get(__ret__, 'snapshots'),
        sources=pulumi.get(__ret__, 'sources'),
        state=pulumi.get(__ret__, 'state'),
        transformations=pulumi.get(__ret__, 'transformations'))


@_utilities.lift_output_func(get_data_lake_pipeline)
def get_data_lake_pipeline_output(name: Optional[pulumi.Input[str]] = None,
                                  project_id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDataLakePipelineResult]:
    """
    `DataLakePipeline` describes a Data Lake Pipeline.

    > **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.

    ## Example Usage


    :param str name: Name of the Atlas Data Lake Pipeline.
    :param str project_id: The unique ID for the project to create a Data Lake Pipeline.
    """
    ...