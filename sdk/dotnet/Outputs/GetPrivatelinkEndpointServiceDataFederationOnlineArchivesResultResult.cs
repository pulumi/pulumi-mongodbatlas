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
    public sealed class GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultResult
    {
        /// <summary>
        /// Human-readable string to associate with this private endpoint.
        /// </summary>
        public readonly string Comment;
        /// <summary>
        /// (Optional) Human-readable label to identify VPC endpoint DNS name.
        /// </summary>
        public readonly string CustomerEndpointDnsName;
        /// <summary>
        /// Unique 22-character alphanumeric string that identifies the private endpoint. See [Atlas Data Lake supports Amazon Web Services private endpoints using the AWS PrivateLink feature](https://www.mongodb.com/docs/atlas/reference/api-resources-spec/#tag/Data-Federation/operation/createDataFederationPrivateEndpoint:~:text=Atlas%!D(MISSING)ata%!L(MISSING)ake%!s(MISSING)upports%!A(MISSING)mazon%!W(MISSING)eb%!S(MISSING)ervices%!p(MISSING)rivate%!e(MISSING)ndpoints%!u(MISSING)sing%!t(MISSING)he%!A(MISSING)WS%!P(MISSING)rivateLink%!f(MISSING)eature).
        /// </summary>
        public readonly string EndpointId;
        /// <summary>
        /// Human-readable label that identifies the cloud service provider.
        /// </summary>
        public readonly string ProviderName;
        /// <summary>
        /// Human-readable label to identify the region of VPC endpoint.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Human-readable label that identifies the resource type associated with this private endpoint.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPrivatelinkEndpointServiceDataFederationOnlineArchivesResultResult(
            string comment,

            string customerEndpointDnsName,

            string endpointId,

            string providerName,

            string region,

            string type)
        {
            Comment = comment;
            CustomerEndpointDnsName = customerEndpointDnsName;
            EndpointId = endpointId;
            ProviderName = providerName;
            Region = region;
            Type = type;
        }
    }
}
