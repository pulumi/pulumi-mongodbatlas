# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ThirdPartyIntegrationArgs', 'ThirdPartyIntegration']

@pulumi.input_type
class ThirdPartyIntegrationArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 type: pulumi.Input[str],
                 api_key: Optional[pulumi.Input[str]] = None,
                 channel_name: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 microsoft_teams_webhook_url: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 routing_key: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 service_discovery: Optional[pulumi.Input[str]] = None,
                 service_key: Optional[pulumi.Input[str]] = None,
                 team_name: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ThirdPartyIntegration resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to get all Third-Party service integrations
        :param pulumi.Input[str] type: Third-Party Integration Settings type 
               * PAGER_DUTY
               * DATADOG
               * OPS_GENIE
               * VICTOR_OPS
               * WEBHOOK
               * MICROSOFT_TEAMS
               * PROMETHEUS
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "type", type)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if channel_name is not None:
            pulumi.set(__self__, "channel_name", channel_name)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if microsoft_teams_webhook_url is not None:
            pulumi.set(__self__, "microsoft_teams_webhook_url", microsoft_teams_webhook_url)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if routing_key is not None:
            pulumi.set(__self__, "routing_key", routing_key)
        if scheme is not None:
            pulumi.set(__self__, "scheme", scheme)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if service_discovery is not None:
            pulumi.set(__self__, "service_discovery", service_discovery)
        if service_key is not None:
            pulumi.set(__self__, "service_key", service_key)
        if team_name is not None:
            pulumi.set(__self__, "team_name", team_name)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        The unique ID for the project to get all Third-Party service integrations
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Third-Party Integration Settings type 
        * PAGER_DUTY
        * DATADOG
        * OPS_GENIE
        * VICTOR_OPS
        * WEBHOOK
        * MICROSOFT_TEAMS
        * PROMETHEUS
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "channel_name")

    @channel_name.setter
    def channel_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_name", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="microsoftTeamsWebhookUrl")
    def microsoft_teams_webhook_url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "microsoft_teams_webhook_url")

    @microsoft_teams_webhook_url.setter
    def microsoft_teams_webhook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "microsoft_teams_webhook_url", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="routingKey")
    def routing_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "routing_key")

    @routing_key.setter
    def routing_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "routing_key", value)

    @property
    @pulumi.getter
    def scheme(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "scheme")

    @scheme.setter
    def scheme(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scheme", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="serviceDiscovery")
    def service_discovery(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "service_discovery")

    @service_discovery.setter
    def service_discovery(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_discovery", value)

    @property
    @pulumi.getter(name="serviceKey")
    def service_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "service_key")

    @service_key.setter
    def service_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_key", value)

    @property
    @pulumi.getter(name="teamName")
    def team_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "team_name")

    @team_name.setter
    def team_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_name", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


@pulumi.input_type
class _ThirdPartyIntegrationState:
    def __init__(__self__, *,
                 api_key: Optional[pulumi.Input[str]] = None,
                 channel_name: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 microsoft_teams_webhook_url: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 routing_key: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 service_discovery: Optional[pulumi.Input[str]] = None,
                 service_key: Optional[pulumi.Input[str]] = None,
                 team_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ThirdPartyIntegration resources.
        :param pulumi.Input[str] project_id: The unique ID for the project to get all Third-Party service integrations
        :param pulumi.Input[str] type: Third-Party Integration Settings type 
               * PAGER_DUTY
               * DATADOG
               * OPS_GENIE
               * VICTOR_OPS
               * WEBHOOK
               * MICROSOFT_TEAMS
               * PROMETHEUS
        """
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if channel_name is not None:
            pulumi.set(__self__, "channel_name", channel_name)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if microsoft_teams_webhook_url is not None:
            pulumi.set(__self__, "microsoft_teams_webhook_url", microsoft_teams_webhook_url)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if routing_key is not None:
            pulumi.set(__self__, "routing_key", routing_key)
        if scheme is not None:
            pulumi.set(__self__, "scheme", scheme)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if service_discovery is not None:
            pulumi.set(__self__, "service_discovery", service_discovery)
        if service_key is not None:
            pulumi.set(__self__, "service_key", service_key)
        if team_name is not None:
            pulumi.set(__self__, "team_name", team_name)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if url is not None:
            pulumi.set(__self__, "url", url)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "channel_name")

    @channel_name.setter
    def channel_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "channel_name", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="microsoftTeamsWebhookUrl")
    def microsoft_teams_webhook_url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "microsoft_teams_webhook_url")

    @microsoft_teams_webhook_url.setter
    def microsoft_teams_webhook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "microsoft_teams_webhook_url", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The unique ID for the project to get all Third-Party service integrations
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="routingKey")
    def routing_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "routing_key")

    @routing_key.setter
    def routing_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "routing_key", value)

    @property
    @pulumi.getter
    def scheme(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "scheme")

    @scheme.setter
    def scheme(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "scheme", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter(name="serviceDiscovery")
    def service_discovery(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "service_discovery")

    @service_discovery.setter
    def service_discovery(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_discovery", value)

    @property
    @pulumi.getter(name="serviceKey")
    def service_key(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "service_key")

    @service_key.setter
    def service_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_key", value)

    @property
    @pulumi.getter(name="teamName")
    def team_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "team_name")

    @team_name.setter
    def team_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "team_name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Third-Party Integration Settings type 
        * PAGER_DUTY
        * DATADOG
        * OPS_GENIE
        * VICTOR_OPS
        * WEBHOOK
        * MICROSOFT_TEAMS
        * PROMETHEUS
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


class ThirdPartyIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 channel_name: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 microsoft_teams_webhook_url: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 routing_key: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 service_discovery: Optional[pulumi.Input[str]] = None,
                 service_key: Optional[pulumi.Input[str]] = None,
                 team_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `ThirdPartyIntegration` Provides a Third-Party Integration Settings for the given type.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        > **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)

        > **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.

        > **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test_datadog = mongodbatlas.ThirdPartyIntegration("test_datadog",
            project_id="<PROJECT-ID>",
            type="DATADOG",
            api_key="<API-KEY>",
            region="<REGION>")
        ```

        ## Import

        Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration test_datadog 1112222b3bf99403840e8934-DATADOG
        ```
        See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to get all Third-Party service integrations
        :param pulumi.Input[str] type: Third-Party Integration Settings type 
               * PAGER_DUTY
               * DATADOG
               * OPS_GENIE
               * VICTOR_OPS
               * WEBHOOK
               * MICROSOFT_TEAMS
               * PROMETHEUS
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ThirdPartyIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `ThirdPartyIntegration` Provides a Third-Party Integration Settings for the given type.

        > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.

        > **NOTE:** Slack integrations now use the OAuth2 verification method and must be initially configured, or updated from a legacy integration, through the Atlas third-party service integrations page. Legacy tokens will soon no longer be supported.[Read more about slack setup](https://docs.atlas.mongodb.com/tutorial/third-party-service-integrations/)

        > **IMPORTANT** Each project can only have one configuration per {INTEGRATION-TYPE}.

        > **IMPORTANT:** All arguments including the secrets will be stored in the raw state as plain-text. Read more about sensitive data in state.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_mongodbatlas as mongodbatlas

        test_datadog = mongodbatlas.ThirdPartyIntegration("test_datadog",
            project_id="<PROJECT-ID>",
            type="DATADOG",
            api_key="<API-KEY>",
            region="<REGION>")
        ```

        ## Import

        Third-Party Integration Settings can be imported using project ID and the integration type, in the format `project_id`-`type`, e.g.

        ```sh
        $ pulumi import mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration test_datadog 1112222b3bf99403840e8934-DATADOG
        ```
        See [MongoDB Atlas API](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Third-Party-Integrations/operation/createThirdPartyIntegration) Documentation for more information.

        :param str resource_name: The name of the resource.
        :param ThirdPartyIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ThirdPartyIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 channel_name: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 microsoft_teams_webhook_url: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 routing_key: Optional[pulumi.Input[str]] = None,
                 scheme: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 service_discovery: Optional[pulumi.Input[str]] = None,
                 service_key: Optional[pulumi.Input[str]] = None,
                 team_name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ThirdPartyIntegrationArgs.__new__(ThirdPartyIntegrationArgs)

            __props__.__dict__["api_key"] = None if api_key is None else pulumi.Output.secret(api_key)
            __props__.__dict__["channel_name"] = channel_name
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["microsoft_teams_webhook_url"] = None if microsoft_teams_webhook_url is None else pulumi.Output.secret(microsoft_teams_webhook_url)
            __props__.__dict__["password"] = None if password is None else pulumi.Output.secret(password)
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["region"] = region
            __props__.__dict__["routing_key"] = None if routing_key is None else pulumi.Output.secret(routing_key)
            __props__.__dict__["scheme"] = scheme
            __props__.__dict__["secret"] = None if secret is None else pulumi.Output.secret(secret)
            __props__.__dict__["service_discovery"] = None if service_discovery is None else pulumi.Output.secret(service_discovery)
            __props__.__dict__["service_key"] = None if service_key is None else pulumi.Output.secret(service_key)
            __props__.__dict__["team_name"] = team_name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["url"] = url
            __props__.__dict__["user_name"] = None if user_name is None else pulumi.Output.secret(user_name)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiKey", "microsoftTeamsWebhookUrl", "password", "routingKey", "secret", "serviceDiscovery", "serviceKey", "userName"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(ThirdPartyIntegration, __self__).__init__(
            'mongodbatlas:index/thirdPartyIntegration:ThirdPartyIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_key: Optional[pulumi.Input[str]] = None,
            channel_name: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            microsoft_teams_webhook_url: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            routing_key: Optional[pulumi.Input[str]] = None,
            scheme: Optional[pulumi.Input[str]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            service_discovery: Optional[pulumi.Input[str]] = None,
            service_key: Optional[pulumi.Input[str]] = None,
            team_name: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'ThirdPartyIntegration':
        """
        Get an existing ThirdPartyIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] project_id: The unique ID for the project to get all Third-Party service integrations
        :param pulumi.Input[str] type: Third-Party Integration Settings type 
               * PAGER_DUTY
               * DATADOG
               * OPS_GENIE
               * VICTOR_OPS
               * WEBHOOK
               * MICROSOFT_TEAMS
               * PROMETHEUS
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ThirdPartyIntegrationState.__new__(_ThirdPartyIntegrationState)

        __props__.__dict__["api_key"] = api_key
        __props__.__dict__["channel_name"] = channel_name
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["microsoft_teams_webhook_url"] = microsoft_teams_webhook_url
        __props__.__dict__["password"] = password
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region"] = region
        __props__.__dict__["routing_key"] = routing_key
        __props__.__dict__["scheme"] = scheme
        __props__.__dict__["secret"] = secret
        __props__.__dict__["service_discovery"] = service_discovery
        __props__.__dict__["service_key"] = service_key
        __props__.__dict__["team_name"] = team_name
        __props__.__dict__["type"] = type
        __props__.__dict__["url"] = url
        __props__.__dict__["user_name"] = user_name
        return ThirdPartyIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter(name="channelName")
    def channel_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "channel_name")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="microsoftTeamsWebhookUrl")
    def microsoft_teams_webhook_url(self) -> pulumi.Output[str]:
        return pulumi.get(self, "microsoft_teams_webhook_url")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        The unique ID for the project to get all Third-Party service integrations
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="routingKey")
    def routing_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "routing_key")

    @property
    @pulumi.getter
    def scheme(self) -> pulumi.Output[str]:
        return pulumi.get(self, "scheme")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter(name="serviceDiscovery")
    def service_discovery(self) -> pulumi.Output[str]:
        return pulumi.get(self, "service_discovery")

    @property
    @pulumi.getter(name="serviceKey")
    def service_key(self) -> pulumi.Output[str]:
        return pulumi.get(self, "service_key")

    @property
    @pulumi.getter(name="teamName")
    def team_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "team_name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Third-Party Integration Settings type 
        * PAGER_DUTY
        * DATADOG
        * OPS_GENIE
        * VICTOR_OPS
        * WEBHOOK
        * MICROSOFT_TEAMS
        * PROMETHEUS
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        return pulumi.get(self, "url")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "user_name")

