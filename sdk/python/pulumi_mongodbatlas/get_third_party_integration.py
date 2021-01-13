# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = [
    'GetThirdPartyIntegrationResult',
    'AwaitableGetThirdPartyIntegrationResult',
    'get_third_party_integration',
]

@pulumi.output_type
class GetThirdPartyIntegrationResult:
    """
    A collection of values returned by getThirdPartyIntegration.
    """
    def __init__(__self__, account_id=None, api_key=None, api_token=None, channel_name=None, flow_name=None, id=None, license_key=None, org_name=None, project_id=None, read_token=None, region=None, routing_key=None, secret=None, service_key=None, team_name=None, type=None, url=None, write_token=None):
        if account_id and not isinstance(account_id, str):
            raise TypeError("Expected argument 'account_id' to be a str")
        pulumi.set(__self__, "account_id", account_id)
        if api_key and not isinstance(api_key, str):
            raise TypeError("Expected argument 'api_key' to be a str")
        pulumi.set(__self__, "api_key", api_key)
        if api_token and not isinstance(api_token, str):
            raise TypeError("Expected argument 'api_token' to be a str")
        pulumi.set(__self__, "api_token", api_token)
        if channel_name and not isinstance(channel_name, str):
            raise TypeError("Expected argument 'channel_name' to be a str")
        pulumi.set(__self__, "channel_name", channel_name)
        if flow_name and not isinstance(flow_name, str):
            raise TypeError("Expected argument 'flow_name' to be a str")
        pulumi.set(__self__, "flow_name", flow_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if license_key and not isinstance(license_key, str):
            raise TypeError("Expected argument 'license_key' to be a str")
        pulumi.set(__self__, "license_key", license_key)
        if org_name and not isinstance(org_name, str):
            raise TypeError("Expected argument 'org_name' to be a str")
        pulumi.set(__self__, "org_name", org_name)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if read_token and not isinstance(read_token, str):
            raise TypeError("Expected argument 'read_token' to be a str")
        pulumi.set(__self__, "read_token", read_token)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if routing_key and not isinstance(routing_key, str):
            raise TypeError("Expected argument 'routing_key' to be a str")
        pulumi.set(__self__, "routing_key", routing_key)
        if secret and not isinstance(secret, str):
            raise TypeError("Expected argument 'secret' to be a str")
        pulumi.set(__self__, "secret", secret)
        if service_key and not isinstance(service_key, str):
            raise TypeError("Expected argument 'service_key' to be a str")
        pulumi.set(__self__, "service_key", service_key)
        if team_name and not isinstance(team_name, str):
            raise TypeError("Expected argument 'team_name' to be a str")
        pulumi.set(__self__, "team_name", team_name)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)
        if write_token and not isinstance(write_token, str):
            raise TypeError("Expected argument 'write_token' to be a str")
        pulumi.set(__self__, "write_token", write_token)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> str:
        """
        Unique identifier of your New Relic account.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> str:
        """
        Your API Key.
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> str:
        """
        Your API Token.
        """
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> str:
        return pulumi.get(self, "channel_name")

    @property
    @pulumi.getter(name="flowName")
    def flow_name(self) -> str:
        """
        Your Flowdock Flow name.
        """
        return pulumi.get(self, "flow_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="licenseKey")
    def license_key(self) -> str:
        """
        Your License Key.
        """
        return pulumi.get(self, "license_key")

    @property
    @pulumi.getter(name="orgName")
    def org_name(self) -> str:
        """
        Your Flowdock organization name.
        * `WEBHOOK`
        """
        return pulumi.get(self, "org_name")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="readToken")
    def read_token(self) -> str:
        """
        Your Insights Query Key.
        * `OPS_GENIE`
        """
        return pulumi.get(self, "read_token")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        Indicates which API URL to use, either US or EU. Opsgenie will use US by default.
        * `VICTOR_OPS`
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="routingKey")
    def routing_key(self) -> str:
        """
        An optional field for your Routing Key.
        * `FLOWDOCK`
        """
        return pulumi.get(self, "routing_key")

    @property
    @pulumi.getter
    def secret(self) -> str:
        """
        An optional field for your webhook secret.
        """
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter(name="serviceKey")
    def service_key(self) -> str:
        """
        Your Service Key.
        * `DATADOG`
        """
        return pulumi.get(self, "service_key")

    @property
    @pulumi.getter(name="teamName")
    def team_name(self) -> str:
        return pulumi.get(self, "team_name")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        Property equal to its own integration type
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        Your webhook URL.
        """
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="writeToken")
    def write_token(self) -> str:
        """
        Your Insights Insert Key.
        """
        return pulumi.get(self, "write_token")


class AwaitableGetThirdPartyIntegrationResult(GetThirdPartyIntegrationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetThirdPartyIntegrationResult(
            account_id=self.account_id,
            api_key=self.api_key,
            api_token=self.api_token,
            channel_name=self.channel_name,
            flow_name=self.flow_name,
            id=self.id,
            license_key=self.license_key,
            org_name=self.org_name,
            project_id=self.project_id,
            read_token=self.read_token,
            region=self.region,
            routing_key=self.routing_key,
            secret=self.secret,
            service_key=self.service_key,
            team_name=self.team_name,
            type=self.type,
            url=self.url,
            write_token=self.write_token)


def get_third_party_integration(project_id: Optional[str] = None,
                                type: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetThirdPartyIntegrationResult:
    """
    `ThirdPartyIntegration` describe a Third-Party Integration Settings for the given type.

    > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.


    :param str project_id: The unique ID for the project to get all Third-Party service integrations
    :param str type: Third-Party service integration type
           * PAGER_DUTY
           * DATADOG
           * NEW_RELIC
           * OPS_GENIE
           * VICTOR_OPS
           * FLOWDOCK
           * WEBHOOK
    """
    __args__ = dict()
    __args__['projectId'] = project_id
    __args__['type'] = type
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('mongodbatlas:index/getThirdPartyIntegration:getThirdPartyIntegration', __args__, opts=opts, typ=GetThirdPartyIntegrationResult).value

    return AwaitableGetThirdPartyIntegrationResult(
        account_id=__ret__.account_id,
        api_key=__ret__.api_key,
        api_token=__ret__.api_token,
        channel_name=__ret__.channel_name,
        flow_name=__ret__.flow_name,
        id=__ret__.id,
        license_key=__ret__.license_key,
        org_name=__ret__.org_name,
        project_id=__ret__.project_id,
        read_token=__ret__.read_token,
        region=__ret__.region,
        routing_key=__ret__.routing_key,
        secret=__ret__.secret,
        service_key=__ret__.service_key,
        team_name=__ret__.team_name,
        type=__ret__.type,
        url=__ret__.url,
        write_token=__ret__.write_token)
