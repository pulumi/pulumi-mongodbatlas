# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'GetFlexRestoreJobsResult',
    'AwaitableGetFlexRestoreJobsResult',
    'get_flex_restore_jobs',
    'get_flex_restore_jobs_output',
]

@pulumi.output_type
class GetFlexRestoreJobsResult:
    """
    A collection of values returned by getFlexRestoreJobs.
    """
    def __init__(__self__, id=None, name=None, project_id=None, results=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Human-readable label that identifies the flex cluster whose snapshot you want to restore.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> builtins.str:
        """
        Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetFlexRestoreJobsResultResult']:
        return pulumi.get(self, "results")


class AwaitableGetFlexRestoreJobsResult(GetFlexRestoreJobsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFlexRestoreJobsResult(
            id=self.id,
            name=self.name,
            project_id=self.project_id,
            results=self.results)


def get_flex_restore_jobs(name: Optional[builtins.str] = None,
                          project_id: Optional[builtins.str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFlexRestoreJobsResult:
    """
    ## # Data Source: get_flex_restore_jobs

    `get_flex_restore_jobs` returns all flex restore job of a flex cluster.

    ## Example Usage

    ### S
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    restore_job = mongodbatlas.get_flex_restore_job(project_id=project_id,
        name=example_cluster["name"],
        restore_job_id=restore_job_id)
    restore_jobs = mongodbatlas.get_flex_restore_jobs(project_id=project_id,
        name=example_cluster["name"])
    pulumi.export("mongodbatlasFlexRestoreJob", restore_job.name)
    pulumi.export("mongodbatlasFlexRestoreJobs", [restore_job.restore_job_id for restoreJob in restore_jobs.results])
    ```


    :param builtins.str name: Human-readable label that identifies the flex cluster whose snapshot you want to restore.
    :param builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getFlexRestoreJobs:getFlexRestoreJobs', __args__, opts=opts, typ=GetFlexRestoreJobsResult).value

    return AwaitableGetFlexRestoreJobsResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))
def get_flex_restore_jobs_output(name: Optional[pulumi.Input[builtins.str]] = None,
                                 project_id: Optional[pulumi.Input[builtins.str]] = None,
                                 opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetFlexRestoreJobsResult]:
    """
    ## # Data Source: get_flex_restore_jobs

    `get_flex_restore_jobs` returns all flex restore job of a flex cluster.

    ## Example Usage

    ### S
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    restore_job = mongodbatlas.get_flex_restore_job(project_id=project_id,
        name=example_cluster["name"],
        restore_job_id=restore_job_id)
    restore_jobs = mongodbatlas.get_flex_restore_jobs(project_id=project_id,
        name=example_cluster["name"])
    pulumi.export("mongodbatlasFlexRestoreJob", restore_job.name)
    pulumi.export("mongodbatlasFlexRestoreJobs", [restore_job.restore_job_id for restoreJob in restore_jobs.results])
    ```


    :param builtins.str name: Human-readable label that identifies the flex cluster whose snapshot you want to restore.
    :param builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getFlexRestoreJobs:getFlexRestoreJobs', __args__, opts=opts, typ=GetFlexRestoreJobsResult)
    return __ret__.apply(lambda __response__: GetFlexRestoreJobsResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results')))
