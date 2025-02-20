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

// ## Example Usage
//
// ### S
//
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
//
// ## Import
//
// Stream Processor resource can be imported using the Project ID, Stream Instance name and Stream Processor name, in the format `INSTANCE_NAME-PROJECT_ID-PROCESSOR_NAME`, e.g.
//
// For more information see: [MongoDB Atlas API - Stream Processor](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/v2/#tag/Streams/operation/createStreamProcessor) Documentation.
type StreamProcessor struct {
	pulumi.CustomResourceState

	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringOutput `pulumi:"instanceName"`
	// Optional configuration for the stream processor.
	Options StreamProcessorOptionsPtrOutput `pulumi:"options"`
	// Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
	Pipeline pulumi.StringOutput `pulumi:"pipeline"`
	// Human-readable label that identifies the stream processor.
	ProcessorName pulumi.StringOutput `pulumi:"processorName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The state of the stream processor. Commonly occurring states are 'CREATED', 'STARTED', 'STOPPED' and 'FAILED'. Used to
	// start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
	// created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
	// setting the state to STARTED can automatically start the stream processor.
	State pulumi.StringOutput `pulumi:"state"`
	// The stats associated with the stream processor. Refer to the [MongoDB Atlas
	// Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
	// for more information.
	Stats pulumi.StringOutput `pulumi:"stats"`
}

// NewStreamProcessor registers a new resource with the given unique name, arguments, and options.
func NewStreamProcessor(ctx *pulumi.Context,
	name string, args *StreamProcessorArgs, opts ...pulumi.ResourceOption) (*StreamProcessor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceName == nil {
		return nil, errors.New("invalid value for required argument 'InstanceName'")
	}
	if args.Pipeline == nil {
		return nil, errors.New("invalid value for required argument 'Pipeline'")
	}
	if args.ProcessorName == nil {
		return nil, errors.New("invalid value for required argument 'ProcessorName'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StreamProcessor
	err := ctx.RegisterResource("mongodbatlas:index/streamProcessor:StreamProcessor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStreamProcessor gets an existing StreamProcessor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStreamProcessor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StreamProcessorState, opts ...pulumi.ResourceOption) (*StreamProcessor, error) {
	var resource StreamProcessor
	err := ctx.ReadResource("mongodbatlas:index/streamProcessor:StreamProcessor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StreamProcessor resources.
type streamProcessorState struct {
	// Human-readable label that identifies the stream instance.
	InstanceName *string `pulumi:"instanceName"`
	// Optional configuration for the stream processor.
	Options *StreamProcessorOptions `pulumi:"options"`
	// Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
	Pipeline *string `pulumi:"pipeline"`
	// Human-readable label that identifies the stream processor.
	ProcessorName *string `pulumi:"processorName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId *string `pulumi:"projectId"`
	// The state of the stream processor. Commonly occurring states are 'CREATED', 'STARTED', 'STOPPED' and 'FAILED'. Used to
	// start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
	// created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
	// setting the state to STARTED can automatically start the stream processor.
	State *string `pulumi:"state"`
	// The stats associated with the stream processor. Refer to the [MongoDB Atlas
	// Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
	// for more information.
	Stats *string `pulumi:"stats"`
}

type StreamProcessorState struct {
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringPtrInput
	// Optional configuration for the stream processor.
	Options StreamProcessorOptionsPtrInput
	// Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
	Pipeline pulumi.StringPtrInput
	// Human-readable label that identifies the stream processor.
	ProcessorName pulumi.StringPtrInput
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringPtrInput
	// The state of the stream processor. Commonly occurring states are 'CREATED', 'STARTED', 'STOPPED' and 'FAILED'. Used to
	// start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
	// created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
	// setting the state to STARTED can automatically start the stream processor.
	State pulumi.StringPtrInput
	// The stats associated with the stream processor. Refer to the [MongoDB Atlas
	// Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
	// for more information.
	Stats pulumi.StringPtrInput
}

func (StreamProcessorState) ElementType() reflect.Type {
	return reflect.TypeOf((*streamProcessorState)(nil)).Elem()
}

type streamProcessorArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName string `pulumi:"instanceName"`
	// Optional configuration for the stream processor.
	Options *StreamProcessorOptions `pulumi:"options"`
	// Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
	Pipeline string `pulumi:"pipeline"`
	// Human-readable label that identifies the stream processor.
	ProcessorName string `pulumi:"processorName"`
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId string `pulumi:"projectId"`
	// The state of the stream processor. Commonly occurring states are 'CREATED', 'STARTED', 'STOPPED' and 'FAILED'. Used to
	// start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
	// created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
	// setting the state to STARTED can automatically start the stream processor.
	State *string `pulumi:"state"`
}

// The set of arguments for constructing a StreamProcessor resource.
type StreamProcessorArgs struct {
	// Human-readable label that identifies the stream instance.
	InstanceName pulumi.StringInput
	// Optional configuration for the stream processor.
	Options StreamProcessorOptionsPtrInput
	// Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
	Pipeline pulumi.StringInput
	// Human-readable label that identifies the stream processor.
	ProcessorName pulumi.StringInput
	// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
	ProjectId pulumi.StringInput
	// The state of the stream processor. Commonly occurring states are 'CREATED', 'STARTED', 'STOPPED' and 'FAILED'. Used to
	// start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
	// created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
	// setting the state to STARTED can automatically start the stream processor.
	State pulumi.StringPtrInput
}

func (StreamProcessorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*streamProcessorArgs)(nil)).Elem()
}

type StreamProcessorInput interface {
	pulumi.Input

	ToStreamProcessorOutput() StreamProcessorOutput
	ToStreamProcessorOutputWithContext(ctx context.Context) StreamProcessorOutput
}

func (*StreamProcessor) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamProcessor)(nil)).Elem()
}

func (i *StreamProcessor) ToStreamProcessorOutput() StreamProcessorOutput {
	return i.ToStreamProcessorOutputWithContext(context.Background())
}

func (i *StreamProcessor) ToStreamProcessorOutputWithContext(ctx context.Context) StreamProcessorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamProcessorOutput)
}

// StreamProcessorArrayInput is an input type that accepts StreamProcessorArray and StreamProcessorArrayOutput values.
// You can construct a concrete instance of `StreamProcessorArrayInput` via:
//
//	StreamProcessorArray{ StreamProcessorArgs{...} }
type StreamProcessorArrayInput interface {
	pulumi.Input

	ToStreamProcessorArrayOutput() StreamProcessorArrayOutput
	ToStreamProcessorArrayOutputWithContext(context.Context) StreamProcessorArrayOutput
}

type StreamProcessorArray []StreamProcessorInput

func (StreamProcessorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamProcessor)(nil)).Elem()
}

func (i StreamProcessorArray) ToStreamProcessorArrayOutput() StreamProcessorArrayOutput {
	return i.ToStreamProcessorArrayOutputWithContext(context.Background())
}

func (i StreamProcessorArray) ToStreamProcessorArrayOutputWithContext(ctx context.Context) StreamProcessorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamProcessorArrayOutput)
}

// StreamProcessorMapInput is an input type that accepts StreamProcessorMap and StreamProcessorMapOutput values.
// You can construct a concrete instance of `StreamProcessorMapInput` via:
//
//	StreamProcessorMap{ "key": StreamProcessorArgs{...} }
type StreamProcessorMapInput interface {
	pulumi.Input

	ToStreamProcessorMapOutput() StreamProcessorMapOutput
	ToStreamProcessorMapOutputWithContext(context.Context) StreamProcessorMapOutput
}

type StreamProcessorMap map[string]StreamProcessorInput

func (StreamProcessorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamProcessor)(nil)).Elem()
}

func (i StreamProcessorMap) ToStreamProcessorMapOutput() StreamProcessorMapOutput {
	return i.ToStreamProcessorMapOutputWithContext(context.Background())
}

func (i StreamProcessorMap) ToStreamProcessorMapOutputWithContext(ctx context.Context) StreamProcessorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StreamProcessorMapOutput)
}

type StreamProcessorOutput struct{ *pulumi.OutputState }

func (StreamProcessorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StreamProcessor)(nil)).Elem()
}

func (o StreamProcessorOutput) ToStreamProcessorOutput() StreamProcessorOutput {
	return o
}

func (o StreamProcessorOutput) ToStreamProcessorOutputWithContext(ctx context.Context) StreamProcessorOutput {
	return o
}

// Human-readable label that identifies the stream instance.
func (o StreamProcessorOutput) InstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamProcessor) pulumi.StringOutput { return v.InstanceName }).(pulumi.StringOutput)
}

// Optional configuration for the stream processor.
func (o StreamProcessorOutput) Options() StreamProcessorOptionsPtrOutput {
	return o.ApplyT(func(v *StreamProcessor) StreamProcessorOptionsPtrOutput { return v.Options }).(StreamProcessorOptionsPtrOutput)
}

// Stream aggregation pipeline you want to apply to your streaming data. [MongoDB Atlas Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/#std-label-stream-aggregation) contain more information. Using jsonencode is recommended when setting this attribute. For more details see the [Aggregation Pipelines Documentation](https://www.mongodb.com/docs/atlas/atlas-stream-processing/stream-aggregation/)
func (o StreamProcessorOutput) Pipeline() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamProcessor) pulumi.StringOutput { return v.Pipeline }).(pulumi.StringOutput)
}

// Human-readable label that identifies the stream processor.
func (o StreamProcessorOutput) ProcessorName() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamProcessor) pulumi.StringOutput { return v.ProcessorName }).(pulumi.StringOutput)
}

// Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
func (o StreamProcessorOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamProcessor) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The state of the stream processor. Commonly occurring states are 'CREATED', 'STARTED', 'STOPPED' and 'FAILED'. Used to
// start or stop the Stream Processor. Valid values are `CREATED`, `STARTED` or `STOPPED`. When a Stream Processor is
// created without specifying the state, it will default to `CREATED` state. **NOTE** When creating a stream processor,
// setting the state to STARTED can automatically start the stream processor.
func (o StreamProcessorOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamProcessor) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// The stats associated with the stream processor. Refer to the [MongoDB Atlas
// Docs](https://www.mongodb.com/docs/atlas/atlas-stream-processing/manage-stream-processor/#view-statistics-of-a-stream-processor)
// for more information.
func (o StreamProcessorOutput) Stats() pulumi.StringOutput {
	return o.ApplyT(func(v *StreamProcessor) pulumi.StringOutput { return v.Stats }).(pulumi.StringOutput)
}

type StreamProcessorArrayOutput struct{ *pulumi.OutputState }

func (StreamProcessorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StreamProcessor)(nil)).Elem()
}

func (o StreamProcessorArrayOutput) ToStreamProcessorArrayOutput() StreamProcessorArrayOutput {
	return o
}

func (o StreamProcessorArrayOutput) ToStreamProcessorArrayOutputWithContext(ctx context.Context) StreamProcessorArrayOutput {
	return o
}

func (o StreamProcessorArrayOutput) Index(i pulumi.IntInput) StreamProcessorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StreamProcessor {
		return vs[0].([]*StreamProcessor)[vs[1].(int)]
	}).(StreamProcessorOutput)
}

type StreamProcessorMapOutput struct{ *pulumi.OutputState }

func (StreamProcessorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StreamProcessor)(nil)).Elem()
}

func (o StreamProcessorMapOutput) ToStreamProcessorMapOutput() StreamProcessorMapOutput {
	return o
}

func (o StreamProcessorMapOutput) ToStreamProcessorMapOutputWithContext(ctx context.Context) StreamProcessorMapOutput {
	return o
}

func (o StreamProcessorMapOutput) MapIndex(k pulumi.StringInput) StreamProcessorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StreamProcessor {
		return vs[0].(map[string]*StreamProcessor)[vs[1].(string)]
	}).(StreamProcessorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StreamProcessorInput)(nil)).Elem(), &StreamProcessor{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamProcessorArrayInput)(nil)).Elem(), StreamProcessorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StreamProcessorMapInput)(nil)).Elem(), StreamProcessorMap{})
	pulumi.RegisterOutputType(StreamProcessorOutput{})
	pulumi.RegisterOutputType(StreamProcessorArrayOutput{})
	pulumi.RegisterOutputType(StreamProcessorMapOutput{})
}
