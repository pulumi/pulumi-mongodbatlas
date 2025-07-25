// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Outputs
{

    [OutputType]
    public sealed class GetMaintenanceWindowProtectedHourResult
    {
        /// <summary>
        /// Zero-based integer that represents the end hour of the day for the protected hours window.
        /// </summary>
        public readonly int EndHourOfDay;
        /// <summary>
        /// Zero-based integer that represents the beginning hour of the day for the protected hours window.
        /// </summary>
        public readonly int StartHourOfDay;

        [OutputConstructor]
        private GetMaintenanceWindowProtectedHourResult(
            int endHourOfDay,

            int startHourOfDay)
        {
            EndHourOfDay = endHourOfDay;
            StartHourOfDay = startHourOfDay;
        }
    }
}
