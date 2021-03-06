// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `LdapConfiguration` describes a LDAP Configuration.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find **group_id** in the official documentation.
func LookupLdapConfiguration(ctx *pulumi.Context, args *LookupLdapConfigurationArgs, opts ...pulumi.InvokeOption) (*LookupLdapConfigurationResult, error) {
	var rv LookupLdapConfigurationResult
	err := ctx.Invoke("mongodbatlas:index/getLdapConfiguration:getLdapConfiguration", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLdapConfiguration.
type LookupLdapConfigurationArgs struct {
	// Identifier for the Atlas project associated with the LDAP over TLS/SSL configuration.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getLdapConfiguration.
type LookupLdapConfigurationResult struct {
	// Specifies whether user authentication with LDAP is enabled.
	AuthenticationEnabled bool `pulumi:"authenticationEnabled"`
	// Specifies whether user authorization with LDAP is enabled.
	AuthorizationEnabled bool `pulumi:"authorizationEnabled"`
	// An LDAP query template that Atlas executes to obtain the LDAP groups to which the authenticated user belongs.
	AuthzQueryTemplate string `pulumi:"authzQueryTemplate"`
	// The password used to authenticate the `bindUsername`.
	BindPassword string `pulumi:"bindPassword"`
	// The user DN that Atlas uses to connect to the LDAP server.
	BindUsername string `pulumi:"bindUsername"`
	// CA certificate used to verify the identify of the LDAP server.
	CaCertificate string `pulumi:"caCertificate"`
	// (Required) The hostname or IP address of the LDAP server.
	Hostname string `pulumi:"hostname"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The port to which the LDAP server listens for client connections.
	Port      int    `pulumi:"port"`
	ProjectId string `pulumi:"projectId"`
	// Maps an LDAP username for authentication to an LDAP Distinguished Name (DN).
	// * `user_to_dn_mapping.0.match` - A regular expression to match against a provided LDAP username.
	// * `user_to_dn_mapping.0.substitution` - An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name.
	// * `user_to_dn_mapping.0.ldap_query` - An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516.
	UserToDnMappings []GetLdapConfigurationUserToDnMapping `pulumi:"userToDnMappings"`
}
