// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    public static class Get509AuthenticationDatabaseUser
    {
        /// <summary>
        /// `mongodbatlas.X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// 
        /// ### S
        /// {{% example %}}
        /// ### Example Usage: Generate an Atlas-managed X.509 certificate for a MongoDB user
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var user = new Mongodbatlas.DatabaseUser("user", new Mongodbatlas.DatabaseUserArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             Username = "myUsername",
        ///             X509Type = "MANAGED",
        ///             DatabaseName = "$external",
        ///             Roles = 
        ///             {
        ///                 new Mongodbatlas.Inputs.DatabaseUserRoleArgs
        ///                 {
        ///                     RoleName = "atlasAdmin",
        ///                     DatabaseName = "admin",
        ///                 },
        ///             },
        ///             Labels = 
        ///             {
        ///                 new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///                 {
        ///                     Key = "My Key",
        ///                     Value = "My Value",
        ///                 },
        ///             },
        ///         });
        ///         var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("testX509AuthenticationDatabaseUser", new Mongodbatlas.X509AuthenticationDatabaseUserArgs
        ///         {
        ///             ProjectId = user.ProjectId,
        ///             Username = user.Username,
        ///             MonthsUntilExpiration = 2,
        ///         });
        ///         var test509AuthenticationDatabaseUser = Output.Tuple(testX509AuthenticationDatabaseUser.ProjectId, testX509AuthenticationDatabaseUser.Username).Apply(values =&gt;
        ///         {
        ///             var projectId = values.Item1;
        ///             var username = values.Item2;
        ///             return Mongodbatlas.Get509AuthenticationDatabaseUser.Invoke(new Mongodbatlas.Get509AuthenticationDatabaseUserInvokeArgs
        ///             {
        ///                 ProjectId = projectId,
        ///                 Username = username,
        ///             });
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("testX509AuthenticationDatabaseUser", new Mongodbatlas.X509AuthenticationDatabaseUserArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             CustomerX509Cas = @"-----BEGIN CERTIFICATE-----
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
        ///         });
        ///         var test509AuthenticationDatabaseUser = Mongodbatlas.Get509AuthenticationDatabaseUser.Invoke(new Mongodbatlas.Get509AuthenticationDatabaseUserInvokeArgs
        ///         {
        ///             ProjectId = testX509AuthenticationDatabaseUser.ProjectId,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<Get509AuthenticationDatabaseUserResult> InvokeAsync(Get509AuthenticationDatabaseUserArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<Get509AuthenticationDatabaseUserResult>("mongodbatlas:index/get509AuthenticationDatabaseUser:get509AuthenticationDatabaseUser", args ?? new Get509AuthenticationDatabaseUserArgs(), options.WithDefaults());

        /// <summary>
        /// `mongodbatlas.X509AuthenticationDatabaseUser` describe a X509 Authentication Database User. This represents a X509 Authentication Database User.
        /// 
        /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// 
        /// ### S
        /// {{% example %}}
        /// ### Example Usage: Generate an Atlas-managed X.509 certificate for a MongoDB user
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var user = new Mongodbatlas.DatabaseUser("user", new Mongodbatlas.DatabaseUserArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             Username = "myUsername",
        ///             X509Type = "MANAGED",
        ///             DatabaseName = "$external",
        ///             Roles = 
        ///             {
        ///                 new Mongodbatlas.Inputs.DatabaseUserRoleArgs
        ///                 {
        ///                     RoleName = "atlasAdmin",
        ///                     DatabaseName = "admin",
        ///                 },
        ///             },
        ///             Labels = 
        ///             {
        ///                 new Mongodbatlas.Inputs.DatabaseUserLabelArgs
        ///                 {
        ///                     Key = "My Key",
        ///                     Value = "My Value",
        ///                 },
        ///             },
        ///         });
        ///         var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("testX509AuthenticationDatabaseUser", new Mongodbatlas.X509AuthenticationDatabaseUserArgs
        ///         {
        ///             ProjectId = user.ProjectId,
        ///             Username = user.Username,
        ///             MonthsUntilExpiration = 2,
        ///         });
        ///         var test509AuthenticationDatabaseUser = Output.Tuple(testX509AuthenticationDatabaseUser.ProjectId, testX509AuthenticationDatabaseUser.Username).Apply(values =&gt;
        ///         {
        ///             var projectId = values.Item1;
        ///             var username = values.Item2;
        ///             return Mongodbatlas.Get509AuthenticationDatabaseUser.Invoke(new Mongodbatlas.Get509AuthenticationDatabaseUserInvokeArgs
        ///             {
        ///                 ProjectId = projectId,
        ///                 Username = username,
        ///             });
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% example %}}
        /// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
        /// ```csharp
        /// using Pulumi;
        /// using Mongodbatlas = Pulumi.Mongodbatlas;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var testX509AuthenticationDatabaseUser = new Mongodbatlas.X509AuthenticationDatabaseUser("testX509AuthenticationDatabaseUser", new Mongodbatlas.X509AuthenticationDatabaseUserArgs
        ///         {
        ///             ProjectId = "&lt;PROJECT-ID&gt;",
        ///             CustomerX509Cas = @"-----BEGIN CERTIFICATE-----
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
        ///         });
        ///         var test509AuthenticationDatabaseUser = Mongodbatlas.Get509AuthenticationDatabaseUser.Invoke(new Mongodbatlas.Get509AuthenticationDatabaseUserInvokeArgs
        ///         {
        ///             ProjectId = testX509AuthenticationDatabaseUser.ProjectId,
        ///         });
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<Get509AuthenticationDatabaseUserResult> Invoke(Get509AuthenticationDatabaseUserInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<Get509AuthenticationDatabaseUserResult>("mongodbatlas:index/get509AuthenticationDatabaseUser:get509AuthenticationDatabaseUser", args ?? new Get509AuthenticationDatabaseUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class Get509AuthenticationDatabaseUserArgs : Pulumi.InvokeArgs
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

        public Get509AuthenticationDatabaseUserArgs()
        {
        }
    }

    public sealed class Get509AuthenticationDatabaseUserInvokeArgs : Pulumi.InvokeArgs
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

        public Get509AuthenticationDatabaseUserInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class Get509AuthenticationDatabaseUserResult
    {
        /// <summary>
        /// Array of objects where each details one unexpired database user certificate.
        /// </summary>
        public readonly ImmutableArray<Outputs.Get509AuthenticationDatabaseUserCertificateResult> Certificates;
        public readonly string CustomerX509Cas;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string ProjectId;
        public readonly string? Username;

        [OutputConstructor]
        private Get509AuthenticationDatabaseUserResult(
            ImmutableArray<Outputs.Get509AuthenticationDatabaseUserCertificateResult> certificates,

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
