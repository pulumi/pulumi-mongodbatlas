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

__all__ = ['DataLakePipelineArgs', 'DataLakePipeline']

@pulumi.input_type
class DataLakePipelineArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 sink: Optional[pulumi.Input['DataLakePipelineSinkArgs']] = None,
                 source: Optional[pulumi.Input['DataLakePipelineSourceArgs']] = None,
                 transformations: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]]] = None):
        """
        The set of arguments for constructing a DataLakePipeline resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake pipeline.
        :param pulumi.Input[str] name: Name of the Atlas Data Lake Pipeline.
        :param pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]] transformations: Fields to be excluded for this Data Lake Pipeline.
               * `transformations.#.field` - Key in the document.
               * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        pulumi.set(__self__, "project_id", project_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if sink is not None:
            pulumi.set(__self__, "sink", sink)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if transformations is not None:
            pulumi.set(__self__, "transformations", transformations)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique ID for the project to create a data lake pipeline.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Atlas Data Lake Pipeline.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def sink(self) -> Optional[pulumi.Input['DataLakePipelineSinkArgs']]:
        return pulumi.get(self, "sink")

    @sink.setter
    def sink(self, value: Optional[pulumi.Input['DataLakePipelineSinkArgs']]):
        pulumi.set(self, "sink", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['DataLakePipelineSourceArgs']]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['DataLakePipelineSourceArgs']]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def transformations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]]]:
        """
        Fields to be excluded for this Data Lake Pipeline.
        * `transformations.#.field` - Key in the document.
        * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        return pulumi.get(self, "transformations")

    @transformations.setter
    def transformations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]]]):
        pulumi.set(self, "transformations", value)


@pulumi.input_type
class _DataLakePipelineState:
    def __init__(__self__, *,
                 created_date: Optional[pulumi.Input[str]] = None,
                 ingestion_schedules: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineIngestionScheduleArgs']]]] = None,
                 last_updated_date: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 sink: Optional[pulumi.Input['DataLakePipelineSinkArgs']] = None,
                 snapshots: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineSnapshotArgs']]]] = None,
                 source: Optional[pulumi.Input['DataLakePipelineSourceArgs']] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 transformations: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]]] = None):
        """
        Input properties used for looking up and filtering DataLakePipeline resources.
        :param pulumi.Input[str] created_date: Timestamp that indicates when the Data Lake Pipeline was created.
        :param pulumi.Input[Sequence[pulumi.Input['DataLakePipelineIngestionScheduleArgs']]] ingestion_schedules: List of backup schedule policy items that you can use as a Data Lake Pipeline source.
               * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
               * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
               * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
               * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
               * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        :param pulumi.Input[str] last_updated_date: Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        :param pulumi.Input[str] name: Name of the Atlas Data Lake Pipeline.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake pipeline.
        :param pulumi.Input[Sequence[pulumi.Input['DataLakePipelineSnapshotArgs']]] snapshots: List of backup snapshots that you can use to trigger an on demand pipeline run.
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
        :param pulumi.Input[str] state: State of this Data Lake Pipeline.
        :param pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]] transformations: Fields to be excluded for this Data Lake Pipeline.
               * `transformations.#.field` - Key in the document.
               * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if ingestion_schedules is not None:
            pulumi.set(__self__, "ingestion_schedules", ingestion_schedules)
        if last_updated_date is not None:
            pulumi.set(__self__, "last_updated_date", last_updated_date)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if sink is not None:
            pulumi.set(__self__, "sink", sink)
        if snapshots is not None:
            pulumi.set(__self__, "snapshots", snapshots)
        if source is not None:
            pulumi.set(__self__, "source", source)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if transformations is not None:
            pulumi.set(__self__, "transformations", transformations)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp that indicates when the Data Lake Pipeline was created.
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter(name="ingestionSchedules")
    def ingestion_schedules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineIngestionScheduleArgs']]]]:
        """
        List of backup schedule policy items that you can use as a Data Lake Pipeline source.
        * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
        * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
        * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
        * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
        * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        """
        return pulumi.get(self, "ingestion_schedules")

    @ingestion_schedules.setter
    def ingestion_schedules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineIngestionScheduleArgs']]]]):
        pulumi.set(self, "ingestion_schedules", value)

    @property
    @pulumi.getter(name="lastUpdatedDate")
    def last_updated_date(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        """
        return pulumi.get(self, "last_updated_date")

    @last_updated_date.setter
    def last_updated_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_updated_date", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Atlas Data Lake Pipeline.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID for the project to create a data lake pipeline.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def sink(self) -> Optional[pulumi.Input['DataLakePipelineSinkArgs']]:
        return pulumi.get(self, "sink")

    @sink.setter
    def sink(self, value: Optional[pulumi.Input['DataLakePipelineSinkArgs']]):
        pulumi.set(self, "sink", value)

    @property
    @pulumi.getter
    def snapshots(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineSnapshotArgs']]]]:
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

    @snapshots.setter
    def snapshots(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineSnapshotArgs']]]]):
        pulumi.set(self, "snapshots", value)

    @property
    @pulumi.getter
    def source(self) -> Optional[pulumi.Input['DataLakePipelineSourceArgs']]:
        return pulumi.get(self, "source")

    @source.setter
    def source(self, value: Optional[pulumi.Input['DataLakePipelineSourceArgs']]):
        pulumi.set(self, "source", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of this Data Lake Pipeline.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def transformations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]]]:
        """
        Fields to be excluded for this Data Lake Pipeline.
        * `transformations.#.field` - Key in the document.
        * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        return pulumi.get(self, "transformations")

    @transformations.setter
    def transformations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DataLakePipelineTransformationArgs']]]]):
        pulumi.set(self, "transformations", value)


class DataLakePipeline(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 sink: Optional[pulumi.Input[pulumi.InputType['DataLakePipelineSinkArgs']]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['DataLakePipelineSourceArgs']]] = None,
                 transformations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineTransformationArgs']]]]] = None,
                 __props__=None):
        """
        `DataLakePipeline` provides a Data Lake Pipeline resource.

        > **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.

        ## Example Usage

        ## Import

        Data Lake Pipeline can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/dataLakePipeline:DataLakePipeline example 1112222b3bf99403840e8934--test-data-lake-pipeline-test
        ```
         See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Lake-Pipelines) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the Atlas Data Lake Pipeline.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake pipeline.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineTransformationArgs']]]] transformations: Fields to be excluded for this Data Lake Pipeline.
               * `transformations.#.field` - Key in the document.
               * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataLakePipelineArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `DataLakePipeline` provides a Data Lake Pipeline resource.

        > **NOTE:** Groups and projects are synonymous terms. You may find `group_id` in the official documentation.

        ## Example Usage

        ## Import

        Data Lake Pipeline can be imported using project ID, name of the data lake and name of the AWS s3 bucket, in the format `project_id`--`name`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/dataLakePipeline:DataLakePipeline example 1112222b3bf99403840e8934--test-data-lake-pipeline-test
        ```
         See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Lake-Pipelines) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param DataLakePipelineArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataLakePipelineArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 sink: Optional[pulumi.Input[pulumi.InputType['DataLakePipelineSinkArgs']]] = None,
                 source: Optional[pulumi.Input[pulumi.InputType['DataLakePipelineSourceArgs']]] = None,
                 transformations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineTransformationArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataLakePipelineArgs.__new__(DataLakePipelineArgs)

            __props__.__dict__["name"] = name
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["sink"] = sink
            __props__.__dict__["source"] = source
            __props__.__dict__["transformations"] = transformations
            __props__.__dict__["created_date"] = None
            __props__.__dict__["ingestion_schedules"] = None
            __props__.__dict__["last_updated_date"] = None
            __props__.__dict__["snapshots"] = None
            __props__.__dict__["state"] = None
        super(DataLakePipeline, __self__).__init__(
            'mongodbatlas:index/dataLakePipeline:DataLakePipeline',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            ingestion_schedules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineIngestionScheduleArgs']]]]] = None,
            last_updated_date: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            sink: Optional[pulumi.Input[pulumi.InputType['DataLakePipelineSinkArgs']]] = None,
            snapshots: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineSnapshotArgs']]]]] = None,
            source: Optional[pulumi.Input[pulumi.InputType['DataLakePipelineSourceArgs']]] = None,
            state: Optional[pulumi.Input[str]] = None,
            transformations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineTransformationArgs']]]]] = None) -> 'DataLakePipeline':
        """
        Get an existing DataLakePipeline resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_date: Timestamp that indicates when the Data Lake Pipeline was created.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineIngestionScheduleArgs']]]] ingestion_schedules: List of backup schedule policy items that you can use as a Data Lake Pipeline source.
               * `ingestion_schedules.#.id` - Unique 24-hexadecimal digit string that identifies this backup policy item.
               * `ingestion_schedules.#.frequency_type` - Human-readable label that identifies the frequency type associated with the backup policy.
               * `ingestion_schedules.#.frequency_interval` - Number that indicates the frequency interval for a set of snapshots.
               * `ingestion_schedules.#.retention_unit` - Unit of time in which MongoDB Atlas measures snapshot retention.
               * `ingestion_schedules.#.retention_value` - Duration in days, weeks, or months that MongoDB Atlas retains the snapshot.
        :param pulumi.Input[str] last_updated_date: Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        :param pulumi.Input[str] name: Name of the Atlas Data Lake Pipeline.
        :param pulumi.Input[str] project_id: The unique ID for the project to create a data lake pipeline.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineSnapshotArgs']]]] snapshots: List of backup snapshots that you can use to trigger an on demand pipeline run.
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
        :param pulumi.Input[str] state: State of this Data Lake Pipeline.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DataLakePipelineTransformationArgs']]]] transformations: Fields to be excluded for this Data Lake Pipeline.
               * `transformations.#.field` - Key in the document.
               * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataLakePipelineState.__new__(_DataLakePipelineState)

        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["ingestion_schedules"] = ingestion_schedules
        __props__.__dict__["last_updated_date"] = last_updated_date
        __props__.__dict__["name"] = name
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["sink"] = sink
        __props__.__dict__["snapshots"] = snapshots
        __props__.__dict__["source"] = source
        __props__.__dict__["state"] = state
        __props__.__dict__["transformations"] = transformations
        return DataLakePipeline(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        Timestamp that indicates when the Data Lake Pipeline was created.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="ingestionSchedules")
    def ingestion_schedules(self) -> pulumi.Output[Sequence['outputs.DataLakePipelineIngestionSchedule']]:
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
    def last_updated_date(self) -> pulumi.Output[str]:
        """
        Timestamp that indicates the last time that the Data Lake Pipeline was updated.
        """
        return pulumi.get(self, "last_updated_date")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Atlas Data Lake Pipeline.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project to create a data lake pipeline.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def sink(self) -> pulumi.Output[Optional['outputs.DataLakePipelineSink']]:
        return pulumi.get(self, "sink")

    @property
    @pulumi.getter
    def snapshots(self) -> pulumi.Output[Sequence['outputs.DataLakePipelineSnapshot']]:
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
    def source(self) -> pulumi.Output[Optional['outputs.DataLakePipelineSource']]:
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of this Data Lake Pipeline.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def transformations(self) -> pulumi.Output[Optional[Sequence['outputs.DataLakePipelineTransformation']]]:
        """
        Fields to be excluded for this Data Lake Pipeline.
        * `transformations.#.field` - Key in the document.
        * `transformations.#.type` - Type of transformation applied during the export of the namespace in a Data Lake Pipeline.
        """
        return pulumi.get(self, "transformations")

