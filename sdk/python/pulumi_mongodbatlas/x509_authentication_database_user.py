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

__all__ = ['X509AuthenticationDatabaseUserArgs', 'X509AuthenticationDatabaseUser']

@pulumi.input_type
class X509AuthenticationDatabaseUserArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[str],
                 customer_x509_cas: Optional[pulumi.Input[str]] = None,
                 months_until_expiration: Optional[pulumi.Input[int]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a X509AuthenticationDatabaseUser resource.
        :param pulumi.Input[str] project_id: Identifier for the Atlas project associated with the X.509 configuration.
        :param pulumi.Input[str] customer_x509_cas: PEM string containing one or more customer CAs for database user authentication.
        :param pulumi.Input[int] months_until_expiration: A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        :param pulumi.Input[str] username: Username of the database user to create a certificate for.
        """
        pulumi.set(__self__, "project_id", project_id)
        if customer_x509_cas is not None:
            pulumi.set(__self__, "customer_x509_cas", customer_x509_cas)
        if months_until_expiration is not None:
            pulumi.set(__self__, "months_until_expiration", months_until_expiration)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Identifier for the Atlas project associated with the X.509 configuration.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="customerX509Cas")
    def customer_x509_cas(self) -> Optional[pulumi.Input[str]]:
        """
        PEM string containing one or more customer CAs for database user authentication.
        """
        return pulumi.get(self, "customer_x509_cas")

    @customer_x509_cas.setter
    def customer_x509_cas(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_x509_cas", value)

    @property
    @pulumi.getter(name="monthsUntilExpiration")
    def months_until_expiration(self) -> Optional[pulumi.Input[int]]:
        """
        A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        """
        return pulumi.get(self, "months_until_expiration")

    @months_until_expiration.setter
    def months_until_expiration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "months_until_expiration", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Username of the database user to create a certificate for.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class _X509AuthenticationDatabaseUserState:
    def __init__(__self__, *,
                 certificates: Optional[pulumi.Input[Sequence[pulumi.Input['X509AuthenticationDatabaseUserCertificateArgs']]]] = None,
                 current_certificate: Optional[pulumi.Input[str]] = None,
                 customer_x509_cas: Optional[pulumi.Input[str]] = None,
                 months_until_expiration: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering X509AuthenticationDatabaseUser resources.
        :param pulumi.Input[Sequence[pulumi.Input['X509AuthenticationDatabaseUserCertificateArgs']]] certificates: Array of objects where each details one unexpired database user certificate.
        :param pulumi.Input[str] current_certificate: Contains the last X.509 certificate and private key created for a database user.
        :param pulumi.Input[str] customer_x509_cas: PEM string containing one or more customer CAs for database user authentication.
        :param pulumi.Input[int] months_until_expiration: A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        :param pulumi.Input[str] project_id: Identifier for the Atlas project associated with the X.509 configuration.
        :param pulumi.Input[str] username: Username of the database user to create a certificate for.
        """
        if certificates is not None:
            pulumi.set(__self__, "certificates", certificates)
        if current_certificate is not None:
            pulumi.set(__self__, "current_certificate", current_certificate)
        if customer_x509_cas is not None:
            pulumi.set(__self__, "customer_x509_cas", customer_x509_cas)
        if months_until_expiration is not None:
            pulumi.set(__self__, "months_until_expiration", months_until_expiration)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter
    def certificates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['X509AuthenticationDatabaseUserCertificateArgs']]]]:
        """
        Array of objects where each details one unexpired database user certificate.
        """
        return pulumi.get(self, "certificates")

    @certificates.setter
    def certificates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['X509AuthenticationDatabaseUserCertificateArgs']]]]):
        pulumi.set(self, "certificates", value)

    @property
    @pulumi.getter(name="currentCertificate")
    def current_certificate(self) -> Optional[pulumi.Input[str]]:
        """
        Contains the last X.509 certificate and private key created for a database user.
        """
        return pulumi.get(self, "current_certificate")

    @current_certificate.setter
    def current_certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "current_certificate", value)

    @property
    @pulumi.getter(name="customerX509Cas")
    def customer_x509_cas(self) -> Optional[pulumi.Input[str]]:
        """
        PEM string containing one or more customer CAs for database user authentication.
        """
        return pulumi.get(self, "customer_x509_cas")

    @customer_x509_cas.setter
    def customer_x509_cas(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "customer_x509_cas", value)

    @property
    @pulumi.getter(name="monthsUntilExpiration")
    def months_until_expiration(self) -> Optional[pulumi.Input[int]]:
        """
        A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        """
        return pulumi.get(self, "months_until_expiration")

    @months_until_expiration.setter
    def months_until_expiration(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "months_until_expiration", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the Atlas project associated with the X.509 configuration.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        Username of the database user to create a certificate for.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class X509AuthenticationDatabaseUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_x509_cas: Optional[pulumi.Input[str]] = None,
                 months_until_expiration: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        `X509AuthenticationDatabaseUser` provides a X509 Authentication Database User resource. The X509AuthenticationDatabaseUser resource lets you manage MongoDB users who authenticate using X.509 certificates. You can manage these X.509 certificates or let Atlas do it for you.

        | Management  | Description  |
        |---|---|
        | Atlas  | Atlas manages your Certificate Authority and can generate certificates for your MongoDB users. No additional X.509 configuration is required.  |
        | Customer  |  You must provide a Certificate Authority and generate certificates for your MongoDB users. |

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **NOTE:** Before provider version 1.14.0, Self-managed X.509 Authentication was disabled for the project when this resource was deleted. Starting from that version onward, it will not be disabled, allowing other users to continue using X.509 within the same project.

        ## Example Usage

        ### S

        ## Import

        X.509 Certificates for a User can be imported using project ID and username, in the format `project_id-username`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934-myUsername
        ```
         For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)

        Current X.509 Configuration can be imported using project ID, in the format `project_id`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934
        ```
         For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] customer_x509_cas: PEM string containing one or more customer CAs for database user authentication.
        :param pulumi.Input[int] months_until_expiration: A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        :param pulumi.Input[str] project_id: Identifier for the Atlas project associated with the X.509 configuration.
        :param pulumi.Input[str] username: Username of the database user to create a certificate for.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: X509AuthenticationDatabaseUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        `X509AuthenticationDatabaseUser` provides a X509 Authentication Database User resource. The X509AuthenticationDatabaseUser resource lets you manage MongoDB users who authenticate using X.509 certificates. You can manage these X.509 certificates or let Atlas do it for you.

        | Management  | Description  |
        |---|---|
        | Atlas  | Atlas manages your Certificate Authority and can generate certificates for your MongoDB users. No additional X.509 configuration is required.  |
        | Customer  |  You must provide a Certificate Authority and generate certificates for your MongoDB users. |

        > **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.

        > **NOTE:** Before provider version 1.14.0, Self-managed X.509 Authentication was disabled for the project when this resource was deleted. Starting from that version onward, it will not be disabled, allowing other users to continue using X.509 within the same project.

        ## Example Usage

        ### S

        ## Import

        X.509 Certificates for a User can be imported using project ID and username, in the format `project_id-username`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934-myUsername
        ```
         For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)

        Current X.509 Configuration can be imported using project ID, in the format `project_id`, e.g.

        ```sh
         $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934
        ```
         For more information see: [MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)

        :param str resource_name: The name of the resource.
        :param X509AuthenticationDatabaseUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(X509AuthenticationDatabaseUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_x509_cas: Optional[pulumi.Input[str]] = None,
                 months_until_expiration: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = X509AuthenticationDatabaseUserArgs.__new__(X509AuthenticationDatabaseUserArgs)

            __props__.__dict__["customer_x509_cas"] = None if customer_x509_cas is None else pulumi.Output.secret(customer_x509_cas)
            __props__.__dict__["months_until_expiration"] = months_until_expiration
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["username"] = username
            __props__.__dict__["certificates"] = None
            __props__.__dict__["current_certificate"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["currentCertificate", "customerX509Cas"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(X509AuthenticationDatabaseUser, __self__).__init__(
            'mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['X509AuthenticationDatabaseUserCertificateArgs']]]]] = None,
            current_certificate: Optional[pulumi.Input[str]] = None,
            customer_x509_cas: Optional[pulumi.Input[str]] = None,
            months_until_expiration: Optional[pulumi.Input[int]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'X509AuthenticationDatabaseUser':
        """
        Get an existing X509AuthenticationDatabaseUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['X509AuthenticationDatabaseUserCertificateArgs']]]] certificates: Array of objects where each details one unexpired database user certificate.
        :param pulumi.Input[str] current_certificate: Contains the last X.509 certificate and private key created for a database user.
        :param pulumi.Input[str] customer_x509_cas: PEM string containing one or more customer CAs for database user authentication.
        :param pulumi.Input[int] months_until_expiration: A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        :param pulumi.Input[str] project_id: Identifier for the Atlas project associated with the X.509 configuration.
        :param pulumi.Input[str] username: Username of the database user to create a certificate for.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _X509AuthenticationDatabaseUserState.__new__(_X509AuthenticationDatabaseUserState)

        __props__.__dict__["certificates"] = certificates
        __props__.__dict__["current_certificate"] = current_certificate
        __props__.__dict__["customer_x509_cas"] = customer_x509_cas
        __props__.__dict__["months_until_expiration"] = months_until_expiration
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["username"] = username
        return X509AuthenticationDatabaseUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificates(self) -> pulumi.Output[Sequence['outputs.X509AuthenticationDatabaseUserCertificate']]:
        """
        Array of objects where each details one unexpired database user certificate.
        """
        return pulumi.get(self, "certificates")

    @property
    @pulumi.getter(name="currentCertificate")
    def current_certificate(self) -> pulumi.Output[str]:
        """
        Contains the last X.509 certificate and private key created for a database user.
        """
        return pulumi.get(self, "current_certificate")

    @property
    @pulumi.getter(name="customerX509Cas")
    def customer_x509_cas(self) -> pulumi.Output[Optional[str]]:
        """
        PEM string containing one or more customer CAs for database user authentication.
        """
        return pulumi.get(self, "customer_x509_cas")

    @property
    @pulumi.getter(name="monthsUntilExpiration")
    def months_until_expiration(self) -> pulumi.Output[Optional[int]]:
        """
        A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        """
        return pulumi.get(self, "months_until_expiration")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Identifier for the Atlas project associated with the X.509 configuration.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[Optional[str]]:
        """
        Username of the database user to create a certificate for.
        """
        return pulumi.get(self, "username")

