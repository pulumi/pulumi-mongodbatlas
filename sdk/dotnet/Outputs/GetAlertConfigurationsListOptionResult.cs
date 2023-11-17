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
    public sealed class GetAlertConfigurationsListOptionResult
    {
        /// <summary>
        /// Whether to include total count of results in the response (default false)
        /// </summary>
        public readonly bool? IncludeCount;
        /// <summary>
        /// How many alerts to retrieve per page (default 100)
        /// </summary>
        public readonly int? ItemsPerPage;
        /// <summary>
        /// Which page of results to retrieve (default to first page)
        /// </summary>
        public readonly int? PageNum;

        [OutputConstructor]
        private GetAlertConfigurationsListOptionResult(
            bool? includeCount,

            int? itemsPerPage,

            int? pageNum)
        {
            IncludeCount = includeCount;
            ItemsPerPage = itemsPerPage;
            PageNum = pageNum;
        }
    }
}
