// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class GetAlertConfigurationsListOptionArgs : global::Pulumi.InvokeArgs
    {
        [Input("includeCount")]
        public bool? IncludeCount { get; set; }

        [Input("itemsPerPage")]
        public int? ItemsPerPage { get; set; }

        [Input("pageNum")]
        public int? PageNum { get; set; }

        public GetAlertConfigurationsListOptionArgs()
        {
        }
        public static new GetAlertConfigurationsListOptionArgs Empty => new GetAlertConfigurationsListOptionArgs();
    }
}
