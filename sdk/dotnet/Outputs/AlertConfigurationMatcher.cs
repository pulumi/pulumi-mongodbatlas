// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class AlertConfigurationMatcher
    {
        /// <summary>
        /// Name of the field in the target object to match on.
        /// 
        /// | Host alerts         | Replica set alerts  |  Sharded cluster alerts |
        /// |:----------           |:-------------       |:------                 |
        /// | `TYPE_NAME`         | `REPLICA_SET_NAME`  | `CLUSTER_NAME`          |
        /// | `HOSTNAME`          | `SHARD_NAME`        | `SHARD_NAME`            |
        /// | `PORT`              | `CLUSTER_NAME`      |                         |
        /// | `HOSTNAME_AND_PORT` |                     |                         |
        /// | `REPLICA_SET_NAME`  |                     |                         |
        /// 
        /// 
        /// 
        /// All other types of alerts do not support matchers.
        /// </summary>
        public readonly string? FieldName;
        /// <summary>
        /// The operator to test the field’s value.
        /// Accepted values are:
        /// </summary>
        public readonly string? Operator;
        /// <summary>
        /// Value to test with the specified operator. If `field_name` is set to TYPE_NAME, you can match on the following values:
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private AlertConfigurationMatcher(
            string? fieldName,

            string? @operator,

            string? value)
        {
            FieldName = fieldName;
            Operator = @operator;
            Value = value;
        }
    }
}
