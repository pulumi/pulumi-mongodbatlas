// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mongodbatlas

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## # Data Source: getStreamProcessors
//
// `getStreamProcessors` returns all stream processors in a stream instance.
//
// ## Example Usage
//
// ### S
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-mongodbatlas/sdk/v3/go/mongodbatlas"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := mongodbatlas.NewStreamInstance(ctx, "example", &mongodbatlas.StreamInstanceArgs{
//				ProjectId:    pulumi.Any(projectId),
//				InstanceName: pulumi.String("InstanceName"),
//				DataProcessRegion: &mongodbatlas.StreamInstanceDataProcessRegionArgs{
//					Region:        pulumi.String("VIRGINIA_USA"),
//					CloudProvider: pulumi.String("AWS"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewStreamConnection(ctx, "example-sample", &mongodbatlas.StreamConnectionArgs{
//				ProjectId:      pulumi.Any(projectId),
//				InstanceName:   example.InstanceName,
//				ConnectionName: pulumi.String("sample_stream_solar"),
//				Type:           pulumi.String("Sample"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewStreamConnection(ctx, "example-cluster", &mongodbatlas.StreamConnectionArgs{
//				ProjectId:      pulumi.Any(projectId),
//				InstanceName:   example.InstanceName,
//				ConnectionName: pulumi.String("ClusterConnection"),
//				Type:           pulumi.String("Cluster"),
//				ClusterName:    pulumi.Any(clusterName),
//				DbRoleToExecute: &mongodbatlas.StreamConnectionDbRoleToExecuteArgs{
//					Role: pulumi.String("atlasAdmin"),
//					Type: pulumi.String("BUILT_IN"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = mongodbatlas.NewStreamConnection(ctx, "example-kafka", &mongodbatlas.StreamConnectionArgs{
//				ProjectId:      pulumi.Any(projectId),
//				InstanceName:   example.InstanceName,
//				ConnectionName: pulumi.String("KafkaPlaintextConnection"),
//				Type:           pulumi.String("Kafka"),
//				Authentication: &mongodbatlas.StreamConnectionAuthenticationArgs{
//					Mechanism: pulumi.String("PLAIN"),
//					Username:  pulumi.Any(kafkaUsername),
//					Password:  pulumi.Any(kafkaPassword),
//				},
//				BootstrapServers: pulumi.String("localhost:9092,localhost:9092"),
//				Config: pulumi.StringMap{
//					"auto.offset.reset": pulumi.String("earliest"),
//				},
//				Security: &mongodbatlas.StreamConnectionSecurityArgs{
//					Protocol: pulumi.String("PLAINTEXT"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal([]interface{}{
//				map[string]interface{}{
//					"$source": map[string]interface{}{
//						"connectionName": mongodbatlasStreamConnection.ExampleSample.ConnectionName,
//					},
//				},
//				map[string]interface{}{
//					"$emit": map[string]interface{}{
//						"connectionName": mongodbatlasStreamConnection.ExampleCluster.ConnectionName,
//						"db":             "sample",
//						"coll":           "solar",
//						"timeseries": map[string]interface{}{
//							"timeField": "_ts",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			stream_processor_sample_example, err := mongodbatlas.NewStreamProcessor(ctx, "stream-processor-sample-example", &mongodbatlas.StreamProcessorArgs{
//				ProjectId:     pulumi.Any(projectId),
//				InstanceName:  example.InstanceName,
//				ProcessorName: pulumi.String("sampleProcessorName"),
//				Pipeline:      pulumi.String(json0),
//				State:         pulumi.String("STARTED"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON1, err := json.Marshal([]interface{}{
//				map[string]interface{}{
//					"$source": map[string]interface{}{
//						"connectionName": mongodbatlasStreamConnection.ExampleCluster.ConnectionName,
//					},
//				},
//				map[string]interface{}{
//					"$emit": map[string]interface{}{
//						"connectionName": mongodbatlasStreamConnection.ExampleKafka.ConnectionName,
//						"topic":          "topic_from_cluster",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			_, err = mongodbatlas.NewStreamProcessor(ctx, "stream-processor-cluster-to-kafka-example", &mongodbatlas.StreamProcessorArgs{
//				ProjectId:     pulumi.Any(projectId),
//				InstanceName:  example.InstanceName,
//				ProcessorName: pulumi.String("clusterProcessorName"),
//				Pipeline:      pulumi.String(json1),
//				State:         pulumi.String("CREATED"),
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON2, err := json.Marshal([]interface{}{
//				map[string]interface{}{
//					"$source": map[string]interface{}{
//						"connectionName": mongodbatlasStreamConnection.ExampleKafka.ConnectionName,
//						"topic":          "topic_source",
//					},
//				},
//				map[string]interface{}{
//					"$emit": map[string]interface{}{
//						"connectionName": mongodbatlasStreamConnection.ExampleCluster.ConnectionName,
//						"db":             "kafka",
//						"coll":           "topic_source",
//						"timeseries": map[string]interface{}{
//							"timeField": "ts",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json2 := string(tmpJSON2)
//			_, err = mongodbatlas.NewStreamProcessor(ctx, "stream-processor-kafka-to-cluster-example", &mongodbatlas.StreamProcessorArgs{
//				ProjectId:     pulumi.Any(projectId),
//				InstanceName:  example.InstanceName,
//				ProcessorName: pulumi.String("kafkaProcessorName"),
//				Pipeline:      pulumi.String(json2),
//				State:         pulumi.String("CREATED"),
//				Options: &mongodbatlas.StreamProcessorOptionsArgs{
//					Dlq: &mongodbatlas.StreamProcessorOptionsDlqArgs{
//						Coll:           pulumi.String("exampleColumn"),
//						ConnectionName: pulumi.Any(mongodbatlasStreamConnection.ExampleCluster.ConnectionName),
//						Db:             pulumi.String("exampleDb"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			example_stream_processors := example.InstanceName.ApplyT(func(instanceName string) (mongodbatlas.GetStreamProcessorsResult, error) {
//				return mongodbatlas.GetStreamProcessorsResult(interface{}(mongodbatlas.LookupStreamProcessorsOutput(ctx, mongodbatlas.GetStreamProcessorsOutputArgs{
//					ProjectId:    projectId,
//					InstanceName: instanceName,
//				}, nil))), nil
//			}).(mongodbatlas.GetStreamProcessorsResultOutput)
//			example_stream_processor := pulumi.All(example.InstanceName, stream_processor_sample_example.ProcessorName).ApplyT(func(_args []interface{}) (mongodbatlas.GetStreamProcessorResult, error) {
//				instanceName := _args[0].(string)
//				processorName := _args[1].(string)
//				return mongodbatlas.GetStreamProcessorResult(interface{}(mongodbatlas.LookupStreamProcessorOutput(ctx, mongodbatlas.GetStreamProcessorOutputArgs{
//					ProjectId:     projectId,
//					InstanceName:  instanceName,
//					ProcessorName: processorName,
//				}, nil))), nil
//			}).(mongodbatlas.GetStreamProcessorResultOutput)
//			ctx.Export("streamProcessorsState", example_stream_processor.ApplyT(func(example_stream_processor mongodbatlas.GetStreamProcessorResult) (*string, error) {
//				return &example_stream_processor.State, nil
//			}).(pulumi.StringPtrOutput))
//			ctx.Export("streamProcessorsResults", example_stream_processors.ApplyT(func(example_stream_processors mongodbatlas.GetStreamProcessorsResult) ([]mongodbatlas.GetStreamProcessorsResult, error) {
//				return []mongodbatlas.GetStreamProcessorsResult(example_stream_processors.Results), nil
//			}).([]mongodbatlas.GetStreamProcessorsResultOutput))
//			return nil
//		})
//	}
//
// ```
func LookupStreamProcessors(ctx *pulumi.Context, args *LookupStreamProcessorsArgs, opts ...pulumi.InvokeOption) (*LookupStreamProcessorsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupStreamProcessorsResult
	err := ctx.Invoke("mongodbatlas:index/getStreamProcessors:getStreamProcessors", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStreamProcessors.
type LookupStreamProcessorsArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
}

// A collection of values returned by getStreamProcessors.
type LookupStreamProcessorsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string                      `pulumi:"projectId"`
	Results   []GetStreamProcessorsResult `pulumi:"results"`
}

func LookupStreamProcessorsOutput(ctx *pulumi.Context, args LookupStreamProcessorsOutputArgs, opts ...pulumi.InvokeOption) LookupStreamProcessorsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupStreamProcessorsResultOutput, error) {
			args := v.(LookupStreamProcessorsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("mongodbatlas:index/getStreamProcessors:getStreamProcessors", args, LookupStreamProcessorsResultOutput{}, options).(LookupStreamProcessorsResultOutput), nil
		}).(LookupStreamProcessorsResultOutput)
}

// A collection of arguments for invoking getStreamProcessors.
type LookupStreamProcessorsOutputArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringInput `pulumi:"instanceName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringInput `pulumi:"projectId"`
}

func (LookupStreamProcessorsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamProcessorsArgs)(nil)).Elem()
}

// A collection of values returned by getStreamProcessors.
type LookupStreamProcessorsResultOutput struct{ *pulumi.OutputState }

func (LookupStreamProcessorsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupStreamProcessorsResult)(nil)).Elem()
}

func (o LookupStreamProcessorsResultOutput) ToLookupStreamProcessorsResultOutput() LookupStreamProcessorsResultOutput {
	return o
}

func (o LookupStreamProcessorsResultOutput) ToLookupStreamProcessorsResultOutputWithContext(ctx context.Context) LookupStreamProcessorsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupStreamProcessorsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Human-readable label that identifies the stream instance.
func (o LookupStreamProcessorsResultOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorsResult) string { return v.InstanceName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o LookupStreamProcessorsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupStreamProcessorsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupStreamProcessorsResultOutput) Results() GetStreamProcessorsResultArrayOutput {
	return o.ApplyT(func(v LookupStreamProcessorsResult) []GetStreamProcessorsResult { return v.Results }).(GetStreamProcessorsResultArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupStreamProcessorsResultOutput{})
}
