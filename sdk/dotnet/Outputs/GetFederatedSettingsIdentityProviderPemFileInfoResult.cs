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
    public sealed class GetFederatedSettingsIdentityProviderPemFileInfoResult
    {
        public readonly ImmutableArray<Outputs.GetFederatedSettingsIdentityProviderPemFileInfoCertificateResult> Certificates;
        /// <summary>
        /// Filename of certificate
        /// </summary>
        public readonly string FileName;

        [OutputConstructor]
        private GetFederatedSettingsIdentityProviderPemFileInfoResult(
            ImmutableArray<Outputs.GetFederatedSettingsIdentityProviderPemFileInfoCertificateResult> certificates,

            string fileName)
        {
            Certificates = certificates;
            FileName = fileName;
        }
    }
}
