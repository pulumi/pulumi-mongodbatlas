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
    'GetProjectIpAddressesResult',
    'AwaitableGetProjectIpAddressesResult',
    'get_project_ip_addresses',
    'get_project_ip_addresses_output',
]

@pulumi.output_type
class GetProjectIpAddressesResult:
    """
    A collection of values returned by getProjectIpAddresses.
    """
    def __init__(__self__, id=None, project_id=None, services=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if services and not isinstance(services, dict):
            raise TypeError("Expected argument 'services' to be a dict")
        pulumi.set(__self__, "services", services)

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
        Unique 24-hexadecimal digit string that identifies your project.
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def services(self) -> 'outputs.GetProjectIpAddressesServicesResult':
        """
        List of IP addresses in a project categorized by services.
        """
        return pulumi.get(self, "services")


class AwaitableGetProjectIpAddressesResult(GetProjectIpAddressesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProjectIpAddressesResult(
            id=self.id,
            project_id=self.project_id,
            services=self.services)


def get_project_ip_addresses(project_id: Optional[_builtins.str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProjectIpAddressesResult:
    """
    ## # Data Source: get_project_ip_addresses

    `get_project_ip_addresses` returns the IP addresses in a project categorized by services.

    ## Example Usage

    ### S
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_project_ip_addresses(project_id=project_id)
    pulumi.export("projectServices", test.services)
    ```


    :param _builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getProjectIpAddresses:getProjectIpAddresses', __args__, opts=opts, typ=GetProjectIpAddressesResult).value

    return AwaitableGetProjectIpAddressesResult(
        id=pulumi.get(__ret__, 'id'),
        project_id=pulumi.get(__ret__, 'project_id'),
        services=pulumi.get(__ret__, 'services'))
def get_project_ip_addresses_output(project_id: Optional[pulumi.Input[_builtins.str]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetProjectIpAddressesResult]:
    """
    ## # Data Source: get_project_ip_addresses

    `get_project_ip_addresses` returns the IP addresses in a project categorized by services.

    ## Example Usage

    ### S
    ```python
    import pulumi
    import pulumi_mongodbatlas as mongodbatlas

    test = mongodbatlas.get_project_ip_addresses(project_id=project_id)
    pulumi.export("projectServices", test.services)
    ```


    :param _builtins.str project_id: Unique 24-hexadecimal digit string that identifies your project.
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('mongodbatlas:index/getProjectIpAddresses:getProjectIpAddresses', __args__, opts=opts, typ=GetProjectIpAddressesResult)
    return __ret__.apply(lambda __response__: GetProjectIpAddressesResult(
        id=pulumi.get(__response__, 'id'),
        project_id=pulumi.get(__response__, 'project_id'),
        services=pulumi.get(__response__, 'services')))
