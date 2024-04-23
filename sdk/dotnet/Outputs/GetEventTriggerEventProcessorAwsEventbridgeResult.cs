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
    public sealed class GetEventTriggerEventProcessorAwsEventbridgeResult
    {
        /// <summary>
        /// AWS Account ID.
        /// </summary>
        public readonly string ConfigAccountId;
        /// <summary>
        /// Region of AWS Account.
        /// </summary>
        public readonly string ConfigRegion;

        [OutputConstructor]
        private GetEventTriggerEventProcessorAwsEventbridgeResult(
            string configAccountId,

            string configRegion)
        {
            ConfigAccountId = configAccountId;
            ConfigRegion = configRegion;
        }
    }
}
