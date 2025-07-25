// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas.Inputs
{

    public sealed class OnlineArchiveDataExpirationRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of days used in the date criteria for nominating documents for deletion. Value must be between 7 and 9215.
        /// </summary>
        [Input("expireAfterDays", required: true)]
        public Input<int> ExpireAfterDays { get; set; } = null!;

        public OnlineArchiveDataExpirationRuleGetArgs()
        {
        }
        public static new OnlineArchiveDataExpirationRuleGetArgs Empty => new OnlineArchiveDataExpirationRuleGetArgs();
    }
}
