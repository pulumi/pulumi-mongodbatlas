// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `DatabaseUser` describe a Database User. This represents a database user which will be applied to all clusters within the project.
//
// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
func LookupDatabaseUser(ctx *pulumi.Context, args *LookupDatabaseUserArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseUserResult, error) {
	var rv LookupDatabaseUserResult
	err := ctx.Invoke("mongodbatlas:index/getDatabaseUser:getDatabaseUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseUser.
type LookupDatabaseUserArgs struct {
	// The user’s authentication database. A user must provide both a username and authentication database to log into MongoDB. In Atlas deployments of MongoDB, the authentication database is almost always the admin database, for X509 it is $external.
	AuthDatabaseName *string `pulumi:"authDatabaseName"`
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName *string `pulumi:"databaseName"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
	// Username for authenticating to MongoDB.
	Username string `pulumi:"username"`
}

// A collection of values returned by getDatabaseUser.
type LookupDatabaseUserResult struct {
	AuthDatabaseName *string `pulumi:"authDatabaseName"`
	// The new database user authenticates with AWS IAM credentials. Default is `NONE`, `USER` means user has AWS IAM user credentials, `ROLE` - means user has credentials associated with an AWS IAM role.
	AwsIamType string `pulumi:"awsIamType"`
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName *string `pulumi:"databaseName"`
	// The provider-assigned unique ID for this managed resource.
	Id     string                 `pulumi:"id"`
	Labels []GetDatabaseUserLabel `pulumi:"labels"`
	// Method by which the provided username is authenticated. Default is `NONE`. Other valid values are: `USER`, `GROUP`.
	LdapAuthType string `pulumi:"ldapAuthType"`
	ProjectId    string `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles []GetDatabaseUserRole `pulumi:"roles"`
	// Array of clusters and Atlas Data Lakes that this user has access to.
	Scopes   []GetDatabaseUserScope `pulumi:"scopes"`
	Username string                 `pulumi:"username"`
	// X.509 method by which the provided username is authenticated.
	X509Type string `pulumi:"x509Type"`
}
