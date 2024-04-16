// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getDatabaseUsers` describe all Database Users. This represents a database user which will be applied to all clusters within the project.
//
// Each user has a set of roles that provide access to the project’s databases. User's roles apply to all the clusters in the project: if two clusters have a `products` database and a user has a role granting `read` access on the products database, the user has that access on both clusters.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			testDatabaseUser, err := mongodbatlas.NewDatabaseUser(ctx, "test", &mongodbatlas.DatabaseUserArgs{
//				Username:         pulumi.String("test-acc-username"),
//				Password:         pulumi.String("test-acc-password"),
//				ProjectId:        pulumi.String("<PROJECT-ID>"),
//				AuthDatabaseName: pulumi.String("admin"),
//				Roles: mongodbatlas.DatabaseUserRoleArray{
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("readWrite"),
//						DatabaseName: pulumi.String("admin"),
//					},
//					&mongodbatlas.DatabaseUserRoleArgs{
//						RoleName:     pulumi.String("atlasAdmin"),
//						DatabaseName: pulumi.String("admin"),
//					},
//				},
//				Labels: mongodbatlas.DatabaseUserLabelArray{
//					&mongodbatlas.DatabaseUserLabelArgs{
//						Key:   pulumi.String("key 1"),
//						Value: pulumi.String("value 1"),
//					},
//					&mongodbatlas.DatabaseUserLabelArgs{
//						Key:   pulumi.String("key 2"),
//						Value: pulumi.String("value 2"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_ = mongodbatlas.LookupDatabaseUsersOutput(ctx, mongodbatlas.GetDatabaseUsersOutputArgs{
//				ProjectId: testDatabaseUser.ProjectId,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
// **Example of usage with a OIDC federated authentication user**
//
// <!--Start PulumiCodeChooser -->
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
//				Username:         pulumi.String("64d613677e1ad50839cce4db/testUserOrGroup"),
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
//			_, err = mongodbatlas.LookupDatabaseUsers(ctx, &mongodbatlas.LookupDatabaseUsersArgs{
//				ProjectId: "6414908c207f4d22f4d8f232",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
// Note: OIDC support is only avalible starting in [MongoDB 7.0](https://www.mongodb.com/evolved#mdbsevenzero) or later. To learn more, see the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/security-oidc/).
func LookupDatabaseUsers(ctx *pulumi.Context, args *LookupDatabaseUsersArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseUsersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseUsersResult
	err := ctx.Invoke("mongodbatlas:index/getDatabaseUsers:getDatabaseUsers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseUsers.
type LookupDatabaseUsersArgs struct {
	// The unique ID for the project to get all database users.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getDatabaseUsers.
type LookupDatabaseUsersResult struct {
	// Autogenerated Unique ID for this data source.
	Id string `pulumi:"id"`
	// ID of the Atlas project the user belongs to.
	ProjectId string `pulumi:"projectId"`
	// A list where each represents a Database user.
	Results []GetDatabaseUsersResult `pulumi:"results"`
}

func LookupDatabaseUsersOutput(ctx *pulumi.Context, args LookupDatabaseUsersOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseUsersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseUsersResult, error) {
			args := v.(LookupDatabaseUsersArgs)
			r, err := LookupDatabaseUsers(ctx, &args, opts...)
			var s LookupDatabaseUsersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseUsersResultOutput)
}

// A collection of arguments for invoking getDatabaseUsers.
type LookupDatabaseUsersOutputArgs struct {
	// The unique ID for the project to get all database users.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupDatabaseUsersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseUsersArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseUsers.
type LookupDatabaseUsersResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseUsersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseUsersResult)(nil)).Elem()
}

func (o LookupDatabaseUsersResultOutput) ToLookupDatabaseUsersResultOutput() LookupDatabaseUsersResultOutput {
	return o
}

func (o LookupDatabaseUsersResultOutput) ToLookupDatabaseUsersResultOutputWithContext(ctx context.Context) LookupDatabaseUsersResultOutput {
	return o
}

// Autogenerated Unique ID for this data source.
func (o LookupDatabaseUsersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseUsersResult) string { return v.Id }).(pulumi.StringOutput)
}

// ID of the Atlas project the user belongs to.
func (o LookupDatabaseUsersResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseUsersResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// A list where each represents a Database user.
func (o LookupDatabaseUsersResultOutput) Results() GetDatabaseUsersResultArrayOutput {
	return o.ApplyT(func(v LookupDatabaseUsersResult) []GetDatabaseUsersResult { return v.Results }).(GetDatabaseUsersResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseUsersResultOutput{})
}
