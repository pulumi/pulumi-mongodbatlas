// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// ## Import
//
// Database users can be imported using project ID and username, in the format `project_id`-`username`-`auth_database_name`, e.g.
//
// ```sh
//  $ pulumi import mongodbatlas:index/databaseUser:DatabaseUser my_user 1112222b3bf99403840e8934-my_user-admin
// ```
type DatabaseUser struct {
	pulumi.CustomResourceState

	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName pulumi.StringPtrOutput `pulumi:"authDatabaseName"`
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	AwsIamType pulumi.StringPtrOutput `pulumi:"awsIamType"`
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName pulumi.StringPtrOutput       `pulumi:"databaseName"`
	Labels       DatabaseUserLabelArrayOutput `pulumi:"labels"`
	Password     pulumi.StringPtrOutput       `pulumi:"password"`
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  DatabaseUserRoleArrayOutput  `pulumi:"roles"`
	Scopes DatabaseUserScopeArrayOutput `pulumi:"scopes"`
	// Username for authenticating to MongoDB.
	Username pulumi.StringOutput `pulumi:"username"`
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type pulumi.StringPtrOutput `pulumi:"x509Type"`
}

// NewDatabaseUser registers a new resource with the given unique name, arguments, and options.
func NewDatabaseUser(ctx *pulumi.Context,
	name string, args *DatabaseUserArgs, opts ...pulumi.ResourceOption) (*DatabaseUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
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
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	AwsIamType *string `pulumi:"awsIamType"`
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName *string             `pulumi:"databaseName"`
	Labels       []DatabaseUserLabel `pulumi:"labels"`
	Password     *string             `pulumi:"password"`
	// The unique ID for the project to create the database user.
	ProjectId *string `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  []DatabaseUserRole  `pulumi:"roles"`
	Scopes []DatabaseUserScope `pulumi:"scopes"`
	// Username for authenticating to MongoDB.
	Username *string `pulumi:"username"`
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type *string `pulumi:"x509Type"`
}

type DatabaseUserState struct {
	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName pulumi.StringPtrInput
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	AwsIamType pulumi.StringPtrInput
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName pulumi.StringPtrInput
	Labels       DatabaseUserLabelArrayInput
	Password     pulumi.StringPtrInput
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringPtrInput
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  DatabaseUserRoleArrayInput
	Scopes DatabaseUserScopeArrayInput
	// Username for authenticating to MongoDB.
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
	AuthDatabaseName *string `pulumi:"authDatabaseName"`
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	AwsIamType *string `pulumi:"awsIamType"`
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName *string             `pulumi:"databaseName"`
	Labels       []DatabaseUserLabel `pulumi:"labels"`
	Password     *string             `pulumi:"password"`
	// The unique ID for the project to create the database user.
	ProjectId string `pulumi:"projectId"`
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  []DatabaseUserRole  `pulumi:"roles"`
	Scopes []DatabaseUserScope `pulumi:"scopes"`
	// Username for authenticating to MongoDB.
	Username string `pulumi:"username"`
	// X.509 method by which the provided username is authenticated. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	X509Type *string `pulumi:"x509Type"`
}

// The set of arguments for constructing a DatabaseUser resource.
type DatabaseUserArgs struct {
	// Database against which Atlas authenticates the user. A user must provide both a username and authentication database to log into MongoDB.
	// Accepted values include:
	AuthDatabaseName pulumi.StringPtrInput
	// If this value is set, the new database user authenticates with AWS IAM credentials. If no value is given, Atlas uses the default value of NONE. The accepted types are:
	AwsIamType pulumi.StringPtrInput
	// Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
	//
	// Deprecated: use auth_database_name instead
	DatabaseName pulumi.StringPtrInput
	Labels       DatabaseUserLabelArrayInput
	Password     pulumi.StringPtrInput
	// The unique ID for the project to create the database user.
	ProjectId pulumi.StringInput
	// List of user’s roles and the databases / collections on which the roles apply. A role allows the user to perform particular actions on the specified database. A role on the admin database can include privileges that apply to the other databases as well. See Roles below for more details.
	Roles  DatabaseUserRoleArrayInput
	Scopes DatabaseUserScopeArrayInput
	// Username for authenticating to MongoDB.
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

func (DatabaseUser) ElementType() reflect.Type {
	return reflect.TypeOf((*DatabaseUser)(nil)).Elem()
}

func (i DatabaseUser) ToDatabaseUserOutput() DatabaseUserOutput {
	return i.ToDatabaseUserOutputWithContext(context.Background())
}

func (i DatabaseUser) ToDatabaseUserOutputWithContext(ctx context.Context) DatabaseUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseUserOutput)
}

type DatabaseUserOutput struct {
	*pulumi.OutputState
}

func (DatabaseUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*DatabaseUserOutput)(nil)).Elem()
}

func (o DatabaseUserOutput) ToDatabaseUserOutput() DatabaseUserOutput {
	return o
}

func (o DatabaseUserOutput) ToDatabaseUserOutputWithContext(ctx context.Context) DatabaseUserOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(DatabaseUserOutput{})
}
