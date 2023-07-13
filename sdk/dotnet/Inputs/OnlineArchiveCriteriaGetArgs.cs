// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class OnlineArchiveCriteriaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indexed database parameter that stores the date that determines when data moves to the online archive. MongoDB Cloud archives the data when the current date exceeds the date in this database parameter plus the number of days specified through the expireAfterDays parameter.
        /// </summary>
        [Input("dateField")]
        public Input<string>? DateField { get; set; }

        /// <summary>
        /// Syntax used to write the date after which data moves to the online archive. Date can be expressed as ISO 8601 or Epoch timestamps. The Epoch timestamp can be expressed as nanoseconds, milliseconds, or seconds. You must set `type` to `DATE` if `collectionType` is `TIMESERIES`. Valid values:  ISODATE (default), EPOCH_SECONDS, EPOCH_MILLIS, EPOCH_NANOSECONDS.
        /// </summary>
        [Input("dateFormat")]
        public Input<string>? DateFormat { get; set; }

        /// <summary>
        /// Number of days after the value in the criteria.dateField when MongoDB Cloud archives data in the specified cluster.
        /// 
        /// The only field required for criteria type `CUSTOM`
        /// </summary>
        [Input("expireAfterDays")]
        public Input<int>? ExpireAfterDays { get; set; }

        /// <summary>
        /// JSON query to use to select documents for archiving. Atlas uses the specified query with the db.collection.find(query) command. The empty document {} to return all documents is not supported.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// Type of criteria (DATE, CUSTOM)
        /// 
        /// The following fields are required for criteria type `DATE`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public OnlineArchiveCriteriaGetArgs()
        {
        }
        public static new OnlineArchiveCriteriaGetArgs Empty => new OnlineArchiveCriteriaGetArgs();
    }
}
