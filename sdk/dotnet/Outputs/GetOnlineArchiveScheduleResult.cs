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
    public sealed class GetOnlineArchiveScheduleResult
    {
        public readonly int? DayOfMonth;
        public readonly int? DayOfWeek;
        public readonly int EndHour;
        public readonly int EndMinute;
        public readonly int StartHour;
        public readonly int StartMinute;
        public readonly string Type;

        [OutputConstructor]
        private GetOnlineArchiveScheduleResult(
            int? dayOfMonth,

            int? dayOfWeek,

            int endHour,

            int endMinute,

            int startHour,

            int startMinute,

            string type)
        {
            DayOfMonth = dayOfMonth;
            DayOfWeek = dayOfWeek;
            EndHour = endHour;
            EndMinute = endMinute;
            StartHour = startHour;
            StartMinute = startMinute;
            Type = type;
        }
    }
}