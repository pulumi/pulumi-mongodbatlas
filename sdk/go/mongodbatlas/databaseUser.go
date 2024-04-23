// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `DatabaseUser` provides a Database User resource. This represents a database user which will be applied to all clusters within the project.
//
// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find groupId in the official documentation.
//
// > **WARNING:** The password argument is required for creation but should be removed after creation if it will be managed externally. More details can be found in the password argument documentation.
//
// > **IMPORTANT:** All arguments including the password will be stored in the raw state as plain-text. Read more about sensitive data in state.
//
// ## Example Usage
//
// ### S
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewDatabaseUser(ctx, "test", &mongodbatlas.DatabaseUserArgs{
//				Username:         pulumi.String("test-acc-username"),
//				Password:         pulumi.String("test-acc-password"),
//				ProjectId:        pulumi.String("<PROJECT-ID>"),
//				AuthDatabaseName: pulumi.String("admin"),
//				Roles: mongodbatlas.DatabaseUserRoleArray{
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("readWrite"),
//						DatabaseName: pulumi.String("dbforApp"),
//					},
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("readAnyDatabase"),
//						DatabaseName: pulumi.String("admin"),
//					},
//				},
//				Labels: mongodbatlas.DatabaseUserLabelArray{
//					&mongodbatlas.DatabaseUserLabelArgs{
//						Key:   pulumi.String("My Key"),
//						Value: pulumi.String("My Value"),
//					},
//				},
//				Scopes: mongodbatlas.DatabaseUserScopeArray{
//					&mongodbatlas.DatabaseUserScopeArgs{
//						Name: pulumi.String("My cluster name"),
//						Type: pulumi.String("CLUSTER"),
//					},
//					&mongodbatlas.DatabaseUserScopeArgs{
//						Name: pulumi.String("My second cluster name"),
//						Type: pulumi.String("CLUSTER"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewDatabaseUser(ctx, "test", &mongodbatlas.DatabaseUserArgs{
//				Username:         pulumi.String("test-acc-username"),
//				X509Type:         pulumi.String("MANAGED"),
//				ProjectId:        pulumi.String("<PROJECT-ID>"),
//				AuthDatabaseName: pulumi.String("$external"),
//				Roles: mongodbatlas.DatabaseUserRoleArray{
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("readAnyDatabase"),
//						DatabaseName: pulumi.String("admin"),
//					},
//				},
//				Labels: mongodbatlas.DatabaseUserLabelArray{
//					&mongodbatlas.DatabaseUserLabelArgs{
//						Key:   pulumi.String("%s"),
//						Value: pulumi.String("%s"),
//					},
//				},
//				Scopes: mongodbatlas.DatabaseUserScopeArray{
//					&mongodbatlas.DatabaseUserScopeArgs{
//						Name: pulumi.String("My cluster name"),
//						Type: pulumi.String("CLUSTER"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewDatabaseUser(ctx, "test", &mongodbatlas.DatabaseUserArgs{
//				Username:         pulumi.Any(testAwsIamRole.Arn),
//				ProjectId:        pulumi.String("<PROJECT-ID>"),
//				AuthDatabaseName: pulumi.String("$external"),
//				AwsIamType:       pulumi.String("ROLE"),
//				Roles: mongodbatlas.DatabaseUserRoleArray{
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("readAnyDatabase"),
//						DatabaseName: pulumi.String("admin"),
//					},
//				},
//				Labels: mongodbatlas.DatabaseUserLabelArray{
//					&mongodbatlas.DatabaseUserLabelArgs{
//						Key:   pulumi.String("%s"),
//						Value: pulumi.String("%s"),
//					},
//				},
//				Scopes: mongodbatlas.DatabaseUserScopeArray{
//					&mongodbatlas.DatabaseUserScopeArgs{
//						Name: pulumi.String("My cluster name"),
//						Type: pulumi.String("CLUSTER"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Example of how to create a OIDC federated authentication user
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := mongodbatlas.NewDatabaseUser(ctx, "test", &mongodbatlas.DatabaseUserArgs{
//				Username:         pulumi.String("64d613677e1ad50839cce4db/testUserOr"),
//				ProjectId:        pulumi.String("6414908c207f4d22f4d8f232"),
//				AuthDatabaseName: pulumi.String("admin"),
//				OidcAuthType:     pulumi.String("IDP_GROUP"),
//				Roles: mongodbatlas.DatabaseUserRoleArray{
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("readWriteAnyDatabase"),
//						DatabaseName: pulumi.String("admin"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// `username` format: Atlas OIDC IdP ID (found in federation settings), followed by a '/', followed by the IdP group name
//
// Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
//
// ## Import
//
// Database users can be imported using project ID and username, in the format `project_id`-`username`-`auth_database_name`, e.g.
//
// ```sh
// $ pulumi import mongodbatlas:index/databaseUser:DatabaseUser my_user 1112222b3bf99403840e8934-my_user-admin
// ```
// ~> __NOTE:__ Terraform will want to change the password after importing the user if a `password` argument is specified.
type DatabaseUser struct {
	pulumi.CustomResourceState

	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName pulumi.StringOutput `pulumi:"authDatabaseName"`
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	AwsIamType pulumi.StringOutput          `pulumi:"awsIamType"`
	Labels     DatabaseUserLabelArrayOutput `pulumi:"labels"`
	// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
	LdapAuthType pulumi.StringOutput `pulumi:"ldapAuthType"`
	// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	OidcAuthType pulumi.StringOutput    `pulumi:"oidcAuthType"`
	Password     pulumi.StringPtrOutput `pulumi:"password"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  DatabaseUserRoleArrayOutput  `pulumi:"roles"`
	Scopes DatabaseUserScopeArrayOutput `pulumi:"scopes"`
	// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
	Username pulumi.StringOutput `pulumi:"username"`
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type pulumi.StringOutput `pulumi:"x509Type"`
}

// NewDatabaseUser registers a new resource with the given unique name, arguments, and options.
func NewDatabaseUser(ctx *pulumi.Context,
	name string, args *DatabaseUserArgs, opts ...pulumi.ResourceOption) (*DatabaseUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthDatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'AuthDatabaseName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseUser
	err := ctx.RegisterResource("mongodbatlas:index/databaseUser:DatabaseUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseUser gets an existing DatabaseUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseUserState, opts ...pulumi.ResourceOption) (*DatabaseUser, error) {
	var resource DatabaseUser
	err := ctx.ReadResource("mongodbatlas:index/databaseUser:DatabaseUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseUser resources.
type databaseUserState struct {
	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName *string `pulumi:"authDatabaseName"`
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	AwsIamType *string             `pulumi:"awsIamType"`
	Labels     []DatabaseUserLabel `pulumi:"labels"`
	// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
	LdapAuthType *string `pulumi:"ldapAuthType"`
	// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	OidcAuthType *string `pulumi:"oidcAuthType"`
	Password     *string `pulumi:"password"`
	// The unique ID for the project to create the database user.
	ProjectId *string `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  []DatabaseUserRole  `pulumi:"roles"`
	Scopes []DatabaseUserScope `pulumi:"scopes"`
	// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
	Username *string `pulumi:"username"`
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type *string `pulumi:"x509Type"`
}

type DatabaseUserState struct {
	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName pulumi.StringPtrInput
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	AwsIamType pulumi.StringPtrInput
	Labels     DatabaseUserLabelArrayInput
	// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
	LdapAuthType pulumi.StringPtrInput
	// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	OidcAuthType pulumi.StringPtrInput
	Password     pulumi.StringPtrInput
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringPtrInput
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  DatabaseUserRoleArrayInput
	Scopes DatabaseUserScopeArrayInput
	// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
	Username pulumi.StringPtrInput
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type pulumi.StringPtrInput
}

func (DatabaseUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseUserState)(nil)).Elem()
}

type databaseUserArgs struct {
	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName string `pulumi:"authDatabaseName"`
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	AwsIamType *string             `pulumi:"awsIamType"`
	Labels     []DatabaseUserLabel `pulumi:"labels"`
	// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
	LdapAuthType *string `pulumi:"ldapAuthType"`
	// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	OidcAuthType *string `pulumi:"oidcAuthType"`
	Password     *string `pulumi:"password"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  []DatabaseUserRole  `pulumi:"roles"`
	Scopes []DatabaseUserScope `pulumi:"scopes"`
	// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
	Username string `pulumi:"username"`
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type *string `pulumi:"x509Type"`
}

// The set of arguments for constructing a DatabaseUser resource.
type DatabaseUserArgs struct {
	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName pulumi.StringInput
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	AwsIamType pulumi.StringPtrInput
	Labels     DatabaseUserLabelArrayInput
	// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
	LdapAuthType pulumi.StringPtrInput
	// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
	OidcAuthType pulumi.StringPtrInput
	Password     pulumi.StringPtrInput
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  DatabaseUserRoleArrayInput
	Scopes DatabaseUserScopeArrayInput
	// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
	Username pulumi.StringInput
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type pulumi.StringPtrInput
}

func (DatabaseUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseUserArgs)(nil)).Elem()
}

type DatabaseUserInput interface {
	pulumi.Input

	ToDatabaseUserOutput() DatabaseUserOutput
	ToDatabaseUserOutputWithContext(ctx context.Context) DatabaseUserOutput
}

func (*DatabaseUser) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseUser)(nil)).Elem()
}

func (i *DatabaseUser) ToDatabaseUserOutput() DatabaseUserOutput {
	return i.ToDatabaseUserOutputWithContext(context.Background())
}

func (i *DatabaseUser) ToDatabaseUserOutputWithContext(ctx context.Context) DatabaseUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseUserOutput)
}

// DatabaseUserArrayInput is an input type that accepts DatabaseUserArray and DatabaseUserArrayOutput values.
// You can construct a concrete instance of `DatabaseUserArrayInput` via:
//
//	DatabaseUserArray{ DatabaseUserArgs{...} }
type DatabaseUserArrayInput interface {
	pulumi.Input

	ToDatabaseUserArrayOutput() DatabaseUserArrayOutput
	ToDatabaseUserArrayOutputWithContext(context.Context) DatabaseUserArrayOutput
}

type DatabaseUserArray []DatabaseUserInput

func (DatabaseUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseUser)(nil)).Elem()
}

func (i DatabaseUserArray) ToDatabaseUserArrayOutput() DatabaseUserArrayOutput {
	return i.ToDatabaseUserArrayOutputWithContext(context.Background())
}

func (i DatabaseUserArray) ToDatabaseUserArrayOutputWithContext(ctx context.Context) DatabaseUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseUserArrayOutput)
}

// DatabaseUserMapInput is an input type that accepts DatabaseUserMap and DatabaseUserMapOutput values.
// You can construct a concrete instance of `DatabaseUserMapInput` via:
//
//	DatabaseUserMap{ "key": DatabaseUserArgs{...} }
type DatabaseUserMapInput interface {
	pulumi.Input

	ToDatabaseUserMapOutput() DatabaseUserMapOutput
	ToDatabaseUserMapOutputWithContext(context.Context) DatabaseUserMapOutput
}

type DatabaseUserMap map[string]DatabaseUserInput

func (DatabaseUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseUser)(nil)).Elem()
}

func (i DatabaseUserMap) ToDatabaseUserMapOutput() DatabaseUserMapOutput {
	return i.ToDatabaseUserMapOutputWithContext(context.Background())
}

func (i DatabaseUserMap) ToDatabaseUserMapOutputWithContext(ctx context.Context) DatabaseUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseUserMapOutput)
}

type DatabaseUserOutput struct{ *pulumi.OutputState }

func (DatabaseUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseUser)(nil)).Elem()
}

func (o DatabaseUserOutput) ToDatabaseUserOutput() DatabaseUserOutput {
	return o
}

func (o DatabaseUserOutput) ToDatabaseUserOutputWithContext(ctx context.Context) DatabaseUserOutput {
	return o
}

// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
// Accepted values include:
func (o DatabaseUserOutput) AuthDatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.AuthDatabaseName }).(pulumi.StringOutput)
}

// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
func (o DatabaseUserOutput) AwsIamType() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.AwsIamType }).(pulumi.StringOutput)
}

func (o DatabaseUserOutput) Labels() DatabaseUserLabelArrayOutput {
	return o.ApplyT(func(v *DatabaseUser) DatabaseUserLabelArrayOutput { return v.Labels }).(DatabaseUserLabelArrayOutput)
}

// Method by which the provided `username` is authenticated. If no value is given, Atlas uses the default value of `NONE`.
func (o DatabaseUserOutput) LdapAuthType() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.LdapAuthType }).(pulumi.StringOutput)
}

// Human-readable label that indicates whether the new database user authenticates with OIDC (OpenID Connect) federated authentication. If no value is given, Atlas uses the default value of `NONE`. The accepted types are:
func (o DatabaseUserOutput) OidcAuthType() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.OidcAuthType }).(pulumi.StringOutput)
}

func (o DatabaseUserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The unique ID for the project to create the database user.
func (o DatabaseUserOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
func (o DatabaseUserOutput) Roles() DatabaseUserRoleArrayOutput {
	return o.ApplyT(func(v *DatabaseUser) DatabaseUserRoleArrayOutput { return v.Roles }).(DatabaseUserRoleArrayOutput)
}

func (o DatabaseUserOutput) Scopes() DatabaseUserScopeArrayOutput {
	return o.ApplyT(func(v *DatabaseUser) DatabaseUserScopeArrayOutput { return v.Scopes }).(DatabaseUserScopeArrayOutput)
}

// Username for authenticating to MongoDB. USER_ARN or ROLE_ARN if `awsIamType` is USER or ROLE.
func (o DatabaseUserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
func (o DatabaseUserOutput) X509Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseUser) pulumi.StringOutput { return v.X509Type }).(pulumi.StringOutput)
}

type DatabaseUserArrayOutput struct{ *pulumi.OutputState }

func (DatabaseUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseUser)(nil)).Elem()
}

func (o DatabaseUserArrayOutput) ToDatabaseUserArrayOutput() DatabaseUserArrayOutput {
	return o
}

func (o DatabaseUserArrayOutput) ToDatabaseUserArrayOutputWithContext(ctx context.Context) DatabaseUserArrayOutput {
	return o
}

func (o DatabaseUserArrayOutput) Index(i pulumi.IntInput) DatabaseUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseUser {
		return vs[0].([]*DatabaseUser)[vs[1].(int)]
	}).(DatabaseUserOutput)
}

type DatabaseUserMapOutput struct{ *pulumi.OutputState }

func (DatabaseUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseUser)(nil)).Elem()
}

func (o DatabaseUserMapOutput) ToDatabaseUserMapOutput() DatabaseUserMapOutput {
	return o
}

func (o DatabaseUserMapOutput) ToDatabaseUserMapOutputWithContext(ctx context.Context) DatabaseUserMapOutput {
	return o
}

func (o DatabaseUserMapOutput) MapIndex(k pulumi.StringInput) DatabaseUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseUser {
		return vs[0].(map[string]*DatabaseUser)[vs[1].(string)]
	}).(DatabaseUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseUserInput)(nil)).Elem(), &DatabaseUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseUserArrayInput)(nil)).Elem(), DatabaseUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseUserMapInput)(nil)).Elem(), DatabaseUserMap{})
	pulumi.RegisterOutputType(DatabaseUserOutput{})
	pulumi.RegisterOutputType(DatabaseUserArrayOutput{})
	pulumi.RegisterOutputType(DatabaseUserMapOutput{})
}
