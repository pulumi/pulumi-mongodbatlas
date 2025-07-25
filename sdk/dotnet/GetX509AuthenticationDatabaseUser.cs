// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class GetX509AuthenticationDatabaseUser
    {
        /// <summary>
        /// ## # Data Source: mongodbatlas.X509AuthenticationDatabaseUser
        /// 
        /// `mongodbatlas.X509AuthenticationDatabaseUser` describes a X509 Authentication Database User. This represents a X509 Authentication Database User.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         CustomerX509Cas = @"-----BEGIN CERTIFICATE-----
        /// MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
        /// VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
        /// c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
        /// SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
        /// MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
        /// VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
        /// BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
        /// c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
        /// iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
        /// cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
        /// Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
        /// SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
        /// 7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
        /// iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
        /// -----END CERTIFICATE-----""
        /// ",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetX509AuthenticationDatabaseUser.Invoke(new()
        ///     {
        ///         ProjectId = testX509AuthenticationDatabaseUser.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetX509AuthenticationDatabaseUserResult> InvokeAsync(GetX509AuthenticationDatabaseUserArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetX509AuthenticationDatabaseUserResult>("mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser", args ?? new GetX509AuthenticationDatabaseUserArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.X509AuthenticationDatabaseUser
        /// 
        /// `mongodbatlas.X509AuthenticationDatabaseUser` describes a X509 Authentication Database User. This represents a X509 Authentication Database User.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         CustomerX509Cas = @"-----BEGIN CERTIFICATE-----
        /// MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
        /// VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
        /// c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
        /// SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
        /// MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
        /// VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
        /// BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
        /// c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
        /// iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
        /// cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
        /// Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
        /// SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
        /// 7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
        /// iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
        /// -----END CERTIFICATE-----""
        /// ",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetX509AuthenticationDatabaseUser.Invoke(new()
        ///     {
        ///         ProjectId = testX509AuthenticationDatabaseUser.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetX509AuthenticationDatabaseUserResult> Invoke(GetX509AuthenticationDatabaseUserInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetX509AuthenticationDatabaseUserResult>("mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser", args ?? new GetX509AuthenticationDatabaseUserInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// ## # Data Source: mongodbatlas.X509AuthenticationDatabaseUser
        /// 
        /// `mongodbatlas.X509AuthenticationDatabaseUser` describes a X509 Authentication Database User. This represents a X509 Authentication Database User.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// ## Example Usage
        /// 
        /// ### S
        /// 
        /// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("test", new()
        ///     {
        ///         ProjectId = "&lt;PROJECT-ID&gt;",
        ///         CustomerX509Cas = @"-----BEGIN CERTIFICATE-----
        /// MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
        /// VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
        /// c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
        /// SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
        /// MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
        /// VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
        /// BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
        /// c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
        /// iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
        /// cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
        /// Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
        /// SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
        /// 7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
        /// iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
        /// -----END CERTIFICATE-----""
        /// ",
        ///     });
        /// 
        ///     var test = Mongodbatlas.GetX509AuthenticationDatabaseUser.Invoke(new()
        ///     {
        ///         ProjectId = testX509AuthenticationDatabaseUser.ProjectId,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetX509AuthenticationDatabaseUserResult> Invoke(GetX509AuthenticationDatabaseUserInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetX509AuthenticationDatabaseUserResult>("mongodbatlas:index/getX509AuthenticationDatabaseUser:getX509AuthenticationDatabaseUser", args ?? new GetX509AuthenticationDatabaseUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetX509AuthenticationDatabaseUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the Atlas project associated with the X.509 configuration.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Username of the database user to create a certificate for.
        /// </summary>
        [Input("username")]
        public string? Username { get; set; }

        public GetX509AuthenticationDatabaseUserArgs()
        {
        }
        public static new GetX509AuthenticationDatabaseUserArgs Empty => new GetX509AuthenticationDatabaseUserArgs();
    }

    public sealed class GetX509AuthenticationDatabaseUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier for the Atlas project associated with the X.509 configuration.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Username of the database user to create a certificate for.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public GetX509AuthenticationDatabaseUserInvokeArgs()
        {
        }
        public static new GetX509AuthenticationDatabaseUserInvokeArgs Empty => new GetX509AuthenticationDatabaseUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetX509AuthenticationDatabaseUserResult
    {
        /// <summary>
        /// Array of objects where each details one unexpired database user certificate.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetX509AuthenticationDatabaseUserCertificateResult> Certificates;
        public readonly string CustomerX509Cas;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        public readonly string? Username;

        [OutputConstructor]
        private GetX509AuthenticationDatabaseUserResult(
            ImmutableArray<Outputs.GetX509AuthenticationDatabaseUserCertificateResult> certificates,

            string customerX509Cas,

            string id,

            string projectId,

            string? username)
        {
            Certificates = certificates;
            CustomerX509Cas = customerX509Cas;
            Id = id;
            ProjectId = projectId;
            Username = username;
        }
    }
}
