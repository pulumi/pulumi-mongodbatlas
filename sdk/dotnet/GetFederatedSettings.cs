// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetFederatedSettings
    {
        /// <summary>
        /// `mongodbatlas.getFederatedSettings` provides a federated settings data source. Atlas Cloud federated settings provides federated settings outputs.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var settings = Mongodbatlas.GetFederatedSettings.Invoke(new()
        ///     {
        ///         OrgId = "627a9683e7f7f7ff7fe306f14",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetFederatedSettingsResult> InvokeAsync(GetFederatedSettingsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFederatedSettingsResult>("mongodbatlas:index/getFederatedSettings:getFederatedSettings", args ?? new GetFederatedSettingsArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.getFederatedSettings` provides a federated settings data source. Atlas Cloud federated settings provides federated settings outputs.
        /// 
        /// 
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var settings = Mongodbatlas.GetFederatedSettings.Invoke(new()
        ///     {
        ///         OrgId = "627a9683e7f7f7ff7fe306f14",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetFederatedSettingsResult> Invoke(GetFederatedSettingsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFederatedSettingsResult>("mongodbatlas:index/getFederatedSettings:getFederatedSettings", args ?? new GetFederatedSettingsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFederatedSettingsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        public GetFederatedSettingsArgs()
        {
        }
        public static new GetFederatedSettingsArgs Empty => new GetFederatedSettingsArgs();
    }

    public sealed class GetFederatedSettingsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies the organization that contains your projects.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        public GetFederatedSettingsInvokeArgs()
        {
        }
        public static new GetFederatedSettingsInvokeArgs Empty => new GetFederatedSettingsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFederatedSettingsResult
    {
        /// <summary>
        /// List that contains the domains associated with the organization's identity provider.
        /// </summary>
        public readonly ImmutableArray<string> FederatedDomains;
        /// <summary>
        /// Flag that indicates whether this organization has role mappings configured.
        /// </summary>
        public readonly bool HasRoleMappings;
        /// <summary>
        /// Unique 24-hexadecimal digit string that identifies this federation.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique 20-hexadecimal digit string that identifies the identity provider connected to this organization.
        /// </summary>
        public readonly string IdentityProviderId;
        /// <summary>
        /// Value that indicates whether the identity provider is active. Atlas returns ACTIVE if the identity provider is active and INACTIVE if the identity provider is inactive.
        /// </summary>
        public readonly string IdentityProviderStatus;
        public readonly string OrgId;

        [OutputConstructor]
        private GetFederatedSettingsResult(
            ImmutableArray<string> federatedDomains,

            bool hasRoleMappings,

            string id,

            string identityProviderId,

            string identityProviderStatus,

            string orgId)
        {
            FederatedDomains = federatedDomains;
            HasRoleMappings = hasRoleMappings;
            Id = id;
            IdentityProviderId = identityProviderId;
            IdentityProviderStatus = identityProviderStatus;
            OrgId = orgId;
        }
    }
}
