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

// `SearchIndex` provides a Search Index resource. This allows indexes to be created.
//
// ## Example Usage
//
// ### Basic search index
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
//			_, err := mongodbatlas.NewSearchIndex(ctx, "test-basic-search-index", &mongodbatlas.SearchIndexArgs{
//				Name:            pulumi.String("test-basic-search-index"),
//				ProjectId:       pulumi.String("<PROJECT_ID>"),
//				ClusterName:     pulumi.String("<CLUSTER_NAME>"),
//				Analyzer:        pulumi.String("lucene.standard"),
//				CollectionName:  pulumi.String("collection_test"),
//				Database:        pulumi.String("database_test"),
//				MappingsDynamic: pulumi.Bool(true),
//				SearchAnalyzer:  pulumi.String("lucene.standard"),
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
// ### Basic vector index
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
//			_, err := mongodbatlas.NewSearchIndex(ctx, "test-basic-search-vector", &mongodbatlas.SearchIndexArgs{
//				ProjectId:      pulumi.String("<PROJECT_ID>"),
//				ClusterName:    pulumi.String("<CLUSTER_NAME>"),
//				CollectionName: pulumi.String("collection_test"),
//				Database:       pulumi.String("database_test"),
//				Type:           pulumi.String("vectorSearch"),
//				Fields: pulumi.String(`[{
//	      "type": "vector",
//	      "path": "plot_embedding",
//	      "numDimensions": 1536,
//	      "similarity": "euclidean"
//	}]
//
// `),
//
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
// ### Advanced search index (with custom analyzers)
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
//			_, err := mongodbatlas.NewSearchIndex(ctx, "test-advanced-search-index", &mongodbatlas.SearchIndexArgs{
//				ProjectId:       pulumi.String("<PROJECT_ID>"),
//				ClusterName:     pulumi.String("<CLUSTER_NAME>"),
//				Analyzer:        pulumi.String("lucene.standard"),
//				CollectionName:  pulumi.String("collection_test"),
//				Database:        pulumi.String("database_test"),
//				MappingsDynamic: pulumi.Bool(false),
//				MappingsFields: pulumi.String(`{
//	      "address": {
//	        "type": "document",
//	        "fields": {
//	          "city": {
//	            "type": "string",
//	            "analyzer": "lucene.simple",
//	            "ignoreAbove": 255
//	          },
//	          "state": {
//	            "type": "string",
//	            "analyzer": "lucene.english"
//	          }
//	        }
//	      },
//	      "company": {
//	        "type": "string",
//	        "analyzer": "lucene.whitespace",
//	        "multi": {
//	          "mySecondaryAnalyzer": {
//	            "type": "string",
//	            "analyzer": "lucene.french"
//	          }
//	        }
//	      },
//	      "employees": {
//	        "type": "string",
//	        "analyzer": "lucene.standard"
//	      }
//	}
//
// `),
//
//				Name:           pulumi.String("test-advanced-search-index"),
//				SearchAnalyzer: pulumi.String("lucene.standard"),
//				Analyzers: pulumi.String(` [{
//	 "name": "index_analyzer_test_name",
//	 "charFilters": [{
//
// "type": "mapping",
// "mappings": {"\\" : "/"}
//
//	   	}],
//	 "tokenizer": {
//	 "type": "nGram",
//	 "minGram": 2,
//	 "maxGram": 5
//		},
//	 "tokenFilters": [{
//
// "type": "length",
// "min": 20,
// "max": 33
//
//	  	}]
//	}]
//
// `),
//
//				Synonyms: mongodbatlas.SearchIndexSynonymArray{
//					&mongodbatlas.SearchIndexSynonymArgs{
//						Analyzer:         pulumi.String("lucene.simple"),
//						Name:             pulumi.String("synonym_test"),
//						SourceCollection: pulumi.String("collection_test"),
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
type SearchIndex struct {
	pulumi.CustomResourceState

	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	Analyzer pulumi.StringPtrOutput `pulumi:"analyzer"`
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
	Analyzers pulumi.StringPtrOutput `pulumi:"analyzers"`
	// The name of the cluster where you want to create the search index within.
	ClusterName pulumi.StringOutput `pulumi:"clusterName"`
	// Name of the collection the index is on.
	CollectionName pulumi.StringOutput `pulumi:"collectionName"`
	// Name of the database the collection is in.
	Database pulumi.StringOutput `pulumi:"database"`
	// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
	Fields  pulumi.StringPtrOutput `pulumi:"fields"`
	IndexId pulumi.StringOutput    `pulumi:"indexId"`
	// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
	MappingsDynamic pulumi.BoolPtrOutput `pulumi:"mappingsDynamic"`
	// attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
	MappingsFields pulumi.StringPtrOutput `pulumi:"mappingsFields"`
	// The name of the search index you want to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the organization or project you want to create the search index within.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	SearchAnalyzer pulumi.StringPtrOutput `pulumi:"searchAnalyzer"`
	// Current status of the index.
	Status pulumi.StringOutput `pulumi:"status"`
	// Synonyms mapping definition to use in this index.
	Synonyms SearchIndexSynonymArrayOutput `pulumi:"synonyms"`
	// Type of index: `search` or `vectorSearch`. Default type is `search`.
	Type                        pulumi.StringPtrOutput `pulumi:"type"`
	WaitForIndexBuildCompletion pulumi.BoolPtrOutput   `pulumi:"waitForIndexBuildCompletion"`
}

// NewSearchIndex registers a new resource with the given unique name, arguments, and options.
func NewSearchIndex(ctx *pulumi.Context,
	name string, args *SearchIndexArgs, opts ...pulumi.ResourceOption) (*SearchIndex, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterName == nil {
		return nil, errors.New("invalid value for required argument 'ClusterName'")
	}
	if args.CollectionName == nil {
		return nil, errors.New("invalid value for required argument 'CollectionName'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SearchIndex
	err := ctx.RegisterResource("mongodbatlas:index/searchIndex:SearchIndex", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSearchIndex gets an existing SearchIndex resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSearchIndex(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SearchIndexState, opts ...pulumi.ResourceOption) (*SearchIndex, error) {
	var resource SearchIndex
	err := ctx.ReadResource("mongodbatlas:index/searchIndex:SearchIndex", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SearchIndex resources.
type searchIndexState struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	Analyzer *string `pulumi:"analyzer"`
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
	Analyzers *string `pulumi:"analyzers"`
	// The name of the cluster where you want to create the search index within.
	ClusterName *string `pulumi:"clusterName"`
	// Name of the collection the index is on.
	CollectionName *string `pulumi:"collectionName"`
	// Name of the database the collection is in.
	Database *string `pulumi:"database"`
	// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
	Fields  *string `pulumi:"fields"`
	IndexId *string `pulumi:"indexId"`
	// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
	MappingsDynamic *bool `pulumi:"mappingsDynamic"`
	// attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
	MappingsFields *string `pulumi:"mappingsFields"`
	// The name of the search index you want to create.
	Name *string `pulumi:"name"`
	// The ID of the organization or project you want to create the search index within.
	ProjectId *string `pulumi:"projectId"`
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	SearchAnalyzer *string `pulumi:"searchAnalyzer"`
	// Current status of the index.
	Status *string `pulumi:"status"`
	// Synonyms mapping definition to use in this index.
	Synonyms []SearchIndexSynonym `pulumi:"synonyms"`
	// Type of index: `search` or `vectorSearch`. Default type is `search`.
	Type                        *string `pulumi:"type"`
	WaitForIndexBuildCompletion *bool   `pulumi:"waitForIndexBuildCompletion"`
}

type SearchIndexState struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	Analyzer pulumi.StringPtrInput
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
	Analyzers pulumi.StringPtrInput
	// The name of the cluster where you want to create the search index within.
	ClusterName pulumi.StringPtrInput
	// Name of the collection the index is on.
	CollectionName pulumi.StringPtrInput
	// Name of the database the collection is in.
	Database pulumi.StringPtrInput
	// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
	Fields  pulumi.StringPtrInput
	IndexId pulumi.StringPtrInput
	// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
	MappingsDynamic pulumi.BoolPtrInput
	// attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
	MappingsFields pulumi.StringPtrInput
	// The name of the search index you want to create.
	Name pulumi.StringPtrInput
	// The ID of the organization or project you want to create the search index within.
	ProjectId pulumi.StringPtrInput
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	SearchAnalyzer pulumi.StringPtrInput
	// Current status of the index.
	Status pulumi.StringPtrInput
	// Synonyms mapping definition to use in this index.
	Synonyms SearchIndexSynonymArrayInput
	// Type of index: `search` or `vectorSearch`. Default type is `search`.
	Type                        pulumi.StringPtrInput
	WaitForIndexBuildCompletion pulumi.BoolPtrInput
}

func (SearchIndexState) ElementType() reflect.Type {
	return reflect.TypeOf((*searchIndexState)(nil)).Elem()
}

type searchIndexArgs struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	Analyzer *string `pulumi:"analyzer"`
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
	Analyzers *string `pulumi:"analyzers"`
	// The name of the cluster where you want to create the search index within.
	ClusterName string `pulumi:"clusterName"`
	// Name of the collection the index is on.
	CollectionName string `pulumi:"collectionName"`
	// Name of the database the collection is in.
	Database string `pulumi:"database"`
	// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
	Fields *string `pulumi:"fields"`
	// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
	MappingsDynamic *bool `pulumi:"mappingsDynamic"`
	// attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
	MappingsFields *string `pulumi:"mappingsFields"`
	// The name of the search index you want to create.
	Name *string `pulumi:"name"`
	// The ID of the organization or project you want to create the search index within.
	ProjectId string `pulumi:"projectId"`
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	SearchAnalyzer *string `pulumi:"searchAnalyzer"`
	// Synonyms mapping definition to use in this index.
	Synonyms []SearchIndexSynonym `pulumi:"synonyms"`
	// Type of index: `search` or `vectorSearch`. Default type is `search`.
	Type                        *string `pulumi:"type"`
	WaitForIndexBuildCompletion *bool   `pulumi:"waitForIndexBuildCompletion"`
}

// The set of arguments for constructing a SearchIndex resource.
type SearchIndexArgs struct {
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	Analyzer pulumi.StringPtrInput
	// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
	Analyzers pulumi.StringPtrInput
	// The name of the cluster where you want to create the search index within.
	ClusterName pulumi.StringInput
	// Name of the collection the index is on.
	CollectionName pulumi.StringInput
	// Name of the database the collection is in.
	Database pulumi.StringInput
	// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
	Fields pulumi.StringPtrInput
	// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
	MappingsDynamic pulumi.BoolPtrInput
	// attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
	MappingsFields pulumi.StringPtrInput
	// The name of the search index you want to create.
	Name pulumi.StringPtrInput
	// The ID of the organization or project you want to create the search index within.
	ProjectId pulumi.StringInput
	// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
	SearchAnalyzer pulumi.StringPtrInput
	// Synonyms mapping definition to use in this index.
	Synonyms SearchIndexSynonymArrayInput
	// Type of index: `search` or `vectorSearch`. Default type is `search`.
	Type                        pulumi.StringPtrInput
	WaitForIndexBuildCompletion pulumi.BoolPtrInput
}

func (SearchIndexArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*searchIndexArgs)(nil)).Elem()
}

type SearchIndexInput interface {
	pulumi.Input

	ToSearchIndexOutput() SearchIndexOutput
	ToSearchIndexOutputWithContext(ctx context.Context) SearchIndexOutput
}

func (*SearchIndex) ElementType() reflect.Type {
	return reflect.TypeOf((**SearchIndex)(nil)).Elem()
}

func (i *SearchIndex) ToSearchIndexOutput() SearchIndexOutput {
	return i.ToSearchIndexOutputWithContext(context.Background())
}

func (i *SearchIndex) ToSearchIndexOutputWithContext(ctx context.Context) SearchIndexOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SearchIndexOutput)
}

// SearchIndexArrayInput is an input type that accepts SearchIndexArray and SearchIndexArrayOutput values.
// You can construct a concrete instance of `SearchIndexArrayInput` via:
//
//	SearchIndexArray{ SearchIndexArgs{...} }
type SearchIndexArrayInput interface {
	pulumi.Input

	ToSearchIndexArrayOutput() SearchIndexArrayOutput
	ToSearchIndexArrayOutputWithContext(context.Context) SearchIndexArrayOutput
}

type SearchIndexArray []SearchIndexInput

func (SearchIndexArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SearchIndex)(nil)).Elem()
}

func (i SearchIndexArray) ToSearchIndexArrayOutput() SearchIndexArrayOutput {
	return i.ToSearchIndexArrayOutputWithContext(context.Background())
}

func (i SearchIndexArray) ToSearchIndexArrayOutputWithContext(ctx context.Context) SearchIndexArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SearchIndexArrayOutput)
}

// SearchIndexMapInput is an input type that accepts SearchIndexMap and SearchIndexMapOutput values.
// You can construct a concrete instance of `SearchIndexMapInput` via:
//
//	SearchIndexMap{ "key": SearchIndexArgs{...} }
type SearchIndexMapInput interface {
	pulumi.Input

	ToSearchIndexMapOutput() SearchIndexMapOutput
	ToSearchIndexMapOutputWithContext(context.Context) SearchIndexMapOutput
}

type SearchIndexMap map[string]SearchIndexInput

func (SearchIndexMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SearchIndex)(nil)).Elem()
}

func (i SearchIndexMap) ToSearchIndexMapOutput() SearchIndexMapOutput {
	return i.ToSearchIndexMapOutputWithContext(context.Background())
}

func (i SearchIndexMap) ToSearchIndexMapOutputWithContext(ctx context.Context) SearchIndexMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SearchIndexMapOutput)
}

type SearchIndexOutput struct{ *pulumi.OutputState }

func (SearchIndexOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SearchIndex)(nil)).Elem()
}

func (o SearchIndexOutput) ToSearchIndexOutput() SearchIndexOutput {
	return o
}

func (o SearchIndexOutput) ToSearchIndexOutputWithContext(ctx context.Context) SearchIndexOutput {
	return o
}

// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when creating the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
func (o SearchIndexOutput) Analyzer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringPtrOutput { return v.Analyzer }).(pulumi.StringPtrOutput)
}

// [Custom analyzers](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) to use in this index. This is an array of JSON objects.
func (o SearchIndexOutput) Analyzers() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringPtrOutput { return v.Analyzers }).(pulumi.StringPtrOutput)
}

// The name of the cluster where you want to create the search index within.
func (o SearchIndexOutput) ClusterName() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.ClusterName }).(pulumi.StringOutput)
}

// Name of the collection the index is on.
func (o SearchIndexOutput) CollectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.CollectionName }).(pulumi.StringOutput)
}

// Name of the database the collection is in.
func (o SearchIndexOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Array of [Fields](https://www.mongodb.com/docs/atlas/atlas-search/field-types/knn-vector/#std-label-fts-data-types-knn-vector) to configure this `vectorSearch` index. It is mandatory for vector searches and it must contain at least one `vector` type field. This field needs to be a JSON string in order to be decoded correctly.
func (o SearchIndexOutput) Fields() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringPtrOutput { return v.Fields }).(pulumi.StringPtrOutput)
}

func (o SearchIndexOutput) IndexId() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.IndexId }).(pulumi.StringOutput)
}

// Indicates whether the search index uses dynamic or static mapping. For dynamic mapping, set the value to `true`. For static mapping, specify the fields to index using `mappingsFields`
func (o SearchIndexOutput) MappingsDynamic() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.BoolPtrOutput { return v.MappingsDynamic }).(pulumi.BoolPtrOutput)
}

// attribute is required in search indexes when `mappingsDynamic` is false. This field needs to be a JSON string in order to be decoded correctly.
func (o SearchIndexOutput) MappingsFields() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringPtrOutput { return v.MappingsFields }).(pulumi.StringPtrOutput)
}

// The name of the search index you want to create.
func (o SearchIndexOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the organization or project you want to create the search index within.
func (o SearchIndexOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// [Analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use when searching the index. Defaults to [lucene.standard](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/standard/#std-label-ref-standard-analyzer)
func (o SearchIndexOutput) SearchAnalyzer() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringPtrOutput { return v.SearchAnalyzer }).(pulumi.StringPtrOutput)
}

// Current status of the index.
func (o SearchIndexOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Synonyms mapping definition to use in this index.
func (o SearchIndexOutput) Synonyms() SearchIndexSynonymArrayOutput {
	return o.ApplyT(func(v *SearchIndex) SearchIndexSynonymArrayOutput { return v.Synonyms }).(SearchIndexSynonymArrayOutput)
}

// Type of index: `search` or `vectorSearch`. Default type is `search`.
func (o SearchIndexOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

func (o SearchIndexOutput) WaitForIndexBuildCompletion() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SearchIndex) pulumi.BoolPtrOutput { return v.WaitForIndexBuildCompletion }).(pulumi.BoolPtrOutput)
}

type SearchIndexArrayOutput struct{ *pulumi.OutputState }

func (SearchIndexArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SearchIndex)(nil)).Elem()
}

func (o SearchIndexArrayOutput) ToSearchIndexArrayOutput() SearchIndexArrayOutput {
	return o
}

func (o SearchIndexArrayOutput) ToSearchIndexArrayOutputWithContext(ctx context.Context) SearchIndexArrayOutput {
	return o
}

func (o SearchIndexArrayOutput) Index(i pulumi.IntInput) SearchIndexOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SearchIndex {
		return vs[0].([]*SearchIndex)[vs[1].(int)]
	}).(SearchIndexOutput)
}

type SearchIndexMapOutput struct{ *pulumi.OutputState }

func (SearchIndexMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SearchIndex)(nil)).Elem()
}

func (o SearchIndexMapOutput) ToSearchIndexMapOutput() SearchIndexMapOutput {
	return o
}

func (o SearchIndexMapOutput) ToSearchIndexMapOutputWithContext(ctx context.Context) SearchIndexMapOutput {
	return o
}

func (o SearchIndexMapOutput) MapIndex(k pulumi.StringInput) SearchIndexOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SearchIndex {
		return vs[0].(map[string]*SearchIndex)[vs[1].(string)]
	}).(SearchIndexOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SearchIndexInput)(nil)).Elem(), &SearchIndex{})
	pulumi.RegisterInputType(reflect.TypeOf((*SearchIndexArrayInput)(nil)).Elem(), SearchIndexArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SearchIndexMapInput)(nil)).Elem(), SearchIndexMap{})
	pulumi.RegisterOutputType(SearchIndexOutput{})
	pulumi.RegisterOutputType(SearchIndexArrayOutput{})
	pulumi.RegisterOutputType(SearchIndexMapOutput{})
}
