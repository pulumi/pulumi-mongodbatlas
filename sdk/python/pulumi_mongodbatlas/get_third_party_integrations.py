# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
    'GetThirdPartyIntegrationsResult',
    'AwaitableGetThirdPartyIntegrationsResult',
    'get_third_party_integrations',
    'get_third_party_integrations_output',
]

@pulumi.output_type
class GetThirdPartyIntegrationsResult:
    """
    A collection of values returned by getThirdPartyIntegrations.
    """
    def __init__(__self__, id=None, project_id=None, results=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if results and not isinstance(results, list):
            raise TypeError("Expected argument 'results' to be a list")
        pulumi.set(__self__, "results", results)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> _builtins.str:
        """
        ID of the Atlas project the Third-Party Service Integration belongs to.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def results(self) -> Sequence['outputs.GetThirdPartyIntegrationsResultResult']:
        """
        A list where each represents a Third-Party service integration.
        """
        return pulumi.get(self, "results")


class AwaitableGetThirdPartyIntegrationsResult(GetThirdPartyIntegrationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetThirdPartyIntegrationsResult(
            id=self.id,
            project_id=self.project_id,
            results=self.results)


def get_third_party_integrations(project_id: Optional[_builtins.str] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetThirdPartyIntegrationsResult:
    """
    ## # Data Source: get_third_party_integrations

    `get_third_party_integrations` describes all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `DATADOG`
    applied across the project.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_pager_duty = mongodbatlas.ThirdPartyIntegration("test_pager_duty",
        project_id="<PROJECT-ID>",
        type="PAGER_DUTY",
        service_key="<PAGER-DUTY-SERVICE-KEY>")
    test_datadog = mongodbatlas.ThirdPartyIntegration("test_datadog",
        project_id="<PROJECT-ID>",
        type="DATADOG",
        api_key="<API-KEY>",
        region="<REGION>")
    test = mongodbatlas.get_third_party_integrations_output(project_id=test_pager_duty.project_id)
    ```


    :param _builtins.str project_id: The unique ID for the project to get all Third-Party service integrations
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getThirdPartyIntegrations:getThirdPartyIntegrations', __args__, opts=opts, typ=GetThirdPartyIntegrationsResult).value

    return AwaitableGetThirdPartyIntegrationsResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        results=pulumi.get(__ret__, 'results'))
def get_third_party_integrations_output(project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetThirdPartyIntegrationsResult]:
    """
    ## # Data Source: get_third_party_integrations

    `get_third_party_integrations` describes all Third-Party Integration Settings. This represents two Third-Party services `PAGER_DUTY` and `DATADOG`
    applied across the project.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test_pager_duty = mongodbatlas.ThirdPartyIntegration("test_pager_duty",
        project_id="<PROJECT-ID>",
        type="PAGER_DUTY",
        service_key="<PAGER-DUTY-SERVICE-KEY>")
    test_datadog = mongodbatlas.ThirdPartyIntegration("test_datadog",
        project_id="<PROJECT-ID>",
        type="DATADOG",
        api_key="<API-KEY>",
        region="<REGION>")
    test = mongodbatlas.get_third_party_integrations_output(project_id=test_pager_duty.project_id)
    ```


    :param _builtins.str project_id: The unique ID for the project to get all Third-Party service integrations
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getThirdPartyIntegrations:getThirdPartyIntegrations', __args__, opts=opts, typ=GetThirdPartyIntegrationsResult)
    return __ret__.apply(lambda __response__: GetThirdPartyIntegrationsResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        results=pulumi.get(__response__, 'results')))
