// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `SearchIndex` describe a single search indexes. This represents a single search index that have been created.
//
// > **NOTE:** Groups and projects are synonymous terms. You may find `groupId` in the official documentation.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := mongodbatlas.LookupSearchIndex(ctx, &GetSearchIndexArgs{
// 			ClusterName: "<CLUSTER_NAME>",
// 			IndexId:     "<INDEX_ID",
// 			ProjectId:   "<PROJECT_ID>",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupSearchIndex(ctx *pulumi.Context, args *LookupSearchIndexArgs, opts ...pulumi.InvokeOption) (*LookupSearchIndexResult, error) {
	var rv LookupSearchIndexResult
	err := ctx.Invoke("mongodbatlas:index/getSearchIndex:getSearchIndex", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSearchIndex.
type LookupSearchIndexArgs struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
	Analyzer *string `pulumi:"analyzer"`
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
	Analyzers *string `pulumi:"analyzers"`
	// The name of the cluster containing the collection with one or more Atlas Search indexes.
	ClusterName string `pulumi:"clusterName"`
	// Name of the collection the index is on.
	CollectionName *string `pulumi:"collectionName"`
	// Name of the database the collection is in.
	Database *string `pulumi:"database"`
	// The unique identifier of the Atlas Search index. Use the `getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
	IndexId string `pulumi:"indexId"`
	// Flag indicating whether the index uses dynamic or static mappings.
	MappingsDynamic *bool `pulumi:"mappingsDynamic"`
	// Object containing one or more field specifications.
	MappingsFields *string `pulumi:"mappingsFields"`
	// Name of the index.
	Name *string `pulumi:"name"`
	// The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
	ProjectId string `pulumi:"projectId"`
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
	SearchAnalyzer *string `pulumi:"searchAnalyzer"`
	Status         *string `pulumi:"status"`
}

// A collection of values returned by getSearchIndex.
type LookupSearchIndexResult struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
	Analyzer *string `pulumi:"analyzer"`
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
	Analyzers   *string `pulumi:"analyzers"`
	ClusterName string  `pulumi:"clusterName"`
	// Name of the collection the index is on.
	CollectionName *string `pulumi:"collectionName"`
	// Name of the database the collection is in.
	Database *string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id      string `pulumi:"id"`
	IndexId string `pulumi:"indexId"`
	// Flag indicating whether the index uses dynamic or static mappings.
	MappingsDynamic *bool `pulumi:"mappingsDynamic"`
	// Object containing one or more field specifications.
	MappingsFields *string `pulumi:"mappingsFields"`
	// Name of the index.
	Name      *string `pulumi:"name"`
	ProjectId string  `pulumi:"projectId"`
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
	SearchAnalyzer *string `pulumi:"searchAnalyzer"`
	Status         string  `pulumi:"status"`
	// Synonyms mapping definition to use in this index.
	// * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
	// * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
	// * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
	Synonyms []GetSearchIndexSynonym `pulumi:"synonyms"`
}

func LookupSearchIndexOutput(ctx *pulumi.Context, args LookupSearchIndexOutputArgs, opts ...pulumi.InvokeOption) LookupSearchIndexResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSearchIndexResult, error) {
			args := v.(LookupSearchIndexArgs)
			r, err := LookupSearchIndex(ctx, &args, opts...)
			return *r, err
		}).(LookupSearchIndexResultOutput)
}

// A collection of arguments for invoking getSearchIndex.
type LookupSearchIndexOutputArgs struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
	Analyzer pulumi.StringPtrInput `pulumi:"analyzer"`
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
	Analyzers pulumi.StringPtrInput `pulumi:"analyzers"`
	// The name of the cluster containing the collection with one or more Atlas Search indexes.
	ClusterName pulumi.StringInput `pulumi:"clusterName"`
	// Name of the collection the index is on.
	CollectionName pulumi.StringPtrInput `pulumi:"collectionName"`
	// Name of the database the collection is in.
	Database pulumi.StringPtrInput `pulumi:"database"`
	// The unique identifier of the Atlas Search index. Use the `getSearchIndexes`datasource to find the IDs of all Atlas Search indexes.
	IndexId pulumi.StringInput `pulumi:"indexId"`
	// Flag indicating whether the index uses dynamic or static mappings.
	MappingsDynamic pulumi.BoolPtrInput `pulumi:"mappingsDynamic"`
	// Object containing one or more field specifications.
	MappingsFields pulumi.StringPtrInput `pulumi:"mappingsFields"`
	// Name of the index.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
	SearchAnalyzer pulumi.StringPtrInput `pulumi:"searchAnalyzer"`
	Status         pulumi.StringPtrInput `pulumi:"status"`
}

func (LookupSearchIndexOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSearchIndexArgs)(nil)).Elem()
}

// A collection of values returned by getSearchIndex.
type LookupSearchIndexResultOutput struct{ *pulumi.OutputState }

func (LookupSearchIndexResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSearchIndexResult)(nil)).Elem()
}

func (o LookupSearchIndexResultOutput) ToLookupSearchIndexResultOutput() LookupSearchIndexResultOutput {
	return o
}

func (o LookupSearchIndexResultOutput) ToLookupSearchIndexResultOutputWithContext(ctx context.Context) LookupSearchIndexResultOutput {
	return o
}

// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index.
func (o LookupSearchIndexResultOutput) Analyzer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.Analyzer }).(pulumi.StringPtrOutput)
}

// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index (this is an array of objects).
func (o LookupSearchIndexResultOutput) Analyzers() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.Analyzers }).(pulumi.StringPtrOutput)
}

func (o LookupSearchIndexResultOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) string { return v.ClusterName }).(pulumi.StringOutput)
}

// Name of the collection the index is on.
func (o LookupSearchIndexResultOutput) CollectionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.CollectionName }).(pulumi.StringPtrOutput)
}

// Name of the database the collection is in.
func (o LookupSearchIndexResultOutput) Database() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.Database }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSearchIndexResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupSearchIndexResultOutput) IndexId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) string { return v.IndexId }).(pulumi.StringOutput)
}

// Flag indicating whether the index uses dynamic or static mappings.
func (o LookupSearchIndexResultOutput) MappingsDynamic() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *bool { return v.MappingsDynamic }).(pulumi.BoolPtrOutput)
}

// Object containing one or more field specifications.
func (o LookupSearchIndexResultOutput) MappingsFields() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.MappingsFields }).(pulumi.StringPtrOutput)
}

// Name of the index.
func (o LookupSearchIndexResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupSearchIndexResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index.
func (o LookupSearchIndexResultOutput) SearchAnalyzer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) *string { return v.SearchAnalyzer }).(pulumi.StringPtrOutput)
}

func (o LookupSearchIndexResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) string { return v.Status }).(pulumi.StringOutput)
}

// Synonyms mapping definition to use in this index.
// * `synonyms.#.name` - Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref).
// * `synonyms.#.source_collection` - Name of the source MongoDB collection for the synonyms.
// * `synonyms.#.analyzer` - Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping.
func (o LookupSearchIndexResultOutput) Synonyms() GetSearchIndexSynonymArrayOutput {
	return o.ApplyT(func(v LookupSearchIndexResult) []GetSearchIndexSynonym { return v.Synonyms }).(GetSearchIndexSynonymArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSearchIndexResultOutput{})
}