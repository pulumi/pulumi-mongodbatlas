// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mongodbatlas
{
    /// <summary>
    /// `mongodbatlas.X509AuthenticationDatabaseUser` provides a X509 Authentication Database User resource. The mongodbatlas.X509AuthenticationDatabaseUser resource lets you manage MongoDB users who authenticate using X.509 certificates. You can manage these X.509 certificates or let Atlas do it for you.
    /// 
    /// | Management  | Description  |
    /// |---|---|
    /// | Atlas  | Atlas manages your Certificate Authority and can generate certificates for your MongoDB users. No additional X.509 configuration is required.  |
    /// | Customer  |  You must provide a Certificate Authority and generate certificates for your MongoDB users. |
    /// 
    /// &gt; **NOTE:** Groups and projects are synonymous terms. You may find group_id in the official documentation.
    /// 
    /// ## Example Usage
    /// 
    /// ### S
    /// ### Example Usage: Generate an Atlas-managed X.509 certificate for a MongoDB user
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var user = new Mongodbatlas.DatabaseUser("user", new()
    ///     {
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///         Username = "myUsername",
    ///         X509Type = "MANAGED",
    ///         DatabaseName = "$external",
    ///         Roles = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserRoleArgs
    ///             {
    ///                 RoleName = "atlasAdmin",
    ///                 DatabaseName = "admin",
    ///             },
    ///         },
    ///         Labels = new[]
    ///         {
    ///             new Mongodbatlas.Inputs.DatabaseUserLabelArgs
    ///             {
    ///                 Key = "My Key",
    ///                 Value = "My Value",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var test = new Mongodbatlas.X509AuthenticationDatabaseUser("test", new()
    ///     {
    ///         ProjectId = user.ProjectId,
    ///         Username = user.Username,
    ///         MonthsUntilExpiration = 2,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Example Usage: Save a customer-managed X.509 configuration for an Atlas project
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Mongodbatlas = Pulumi.Mongodbatlas;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Mongodbatlas.X509AuthenticationDatabaseUser("test", new()
    ///     {
    ///         CustomerX509Cas = @"  -----BEGIN CERTIFICATE-----
    ///   MIICmTCCAgICCQDZnHzklxsT9TANBgkqhkiG9w0BAQsFADCBkDELMAkGA1UEBhMC
    ///   VVMxDjAMBgNVBAgMBVRleGFzMQ8wDQYDVQQHDAZBdXN0aW4xETAPBgNVBAoMCHRl
    ///   c3QuY29tMQ0wCwYDVQQLDARUZXN0MREwDwYDVQQDDAh0ZXN0LmNvbTErMCkGCSqG
    ///   SIb3DQEJARYcbWVsaXNzYS5wbHVua2V0dEBtb25nb2RiLmNvbTAeFw0yMDAyMDQy
    ///   MDQ2MDFaFw0yMTAyMDMyMDQ2MDFaMIGQMQswCQYDVQQGEwJVUzEOMAwGA1UECAwF
    ///   VGV4YXMxDzANBgNVBAcMBkF1c3RpbjERMA8GA1UECgwIdGVzdC5jb20xDTALBgNV
    ///   BAsMBFRlc3QxETAPBgNVBAMMCHRlc3QuY29tMSswKQYJKoZIhvcNAQkBFhxtZWxp
    ///   c3NhLnBsdW5rZXR0QG1vbmdvZGIuY29tMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCB
    ///   iQKBgQCf1LRqr1zftzdYx2Aj9G76tb0noMPtj6faGLlPji1+m6Rn7RWD9L0ntWAr
    ///   cURxvypa9jZ9MXFzDtLevvd3tHEmfrUT3ukNDX6+Jtc4kWm+Dh2A70Pd+deKZ2/O
    ///   Fh8audEKAESGXnTbeJCeQa1XKlIkjqQHBNwES5h1b9vJtFoLJwIDAQABMA0GCSqG
    ///   SIb3DQEBCwUAA4GBADMUncjEPV/MiZUcVNGmktP6BPmEqMXQWUDpdGW2+Tg2JtUA
    ///   7MMILtepBkFzLO+GlpZxeAlXO0wxiNgEmCRONgh4+t2w3e7a8GFijYQ99FHrAC5A
    ///   iul59bdl18gVqXia1Yeq/iK7Ohfy/Jwd7Hsm530elwkM/ZEkYDjBlZSXYdyz
    ///   -----END CERTIFICATE-----""
    /// 
    /// ",
    ///         ProjectId = "&lt;PROJECT-ID&gt;",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// X.509 Certificates for a User can be imported using project ID and username, in the format `project_id-username`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934-myUsername
    /// ```
    /// 
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/) Current X.509 Configuration can be imported using project ID, in the format `project_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser test 1112222b3bf99403840e8934
    /// ```
    /// 
    ///  For more information see[MongoDB Atlas API Reference.](https://docs.atlas.mongodb.com/reference/api/x509-configuration-get-certificates/)
    /// </summary>
    [MongodbatlasResourceType("mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser")]
    public partial class X509AuthenticationDatabaseUser : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Array of objects where each details one unexpired database user certificate.
        /// </summary>
        [Output("certificates")]
        public Output<ImmutableArray<Outputs.X509AuthenticationDatabaseUserCertificate>> Certificates { get; private set; } = null!;

        /// <summary>
        /// Contains the last X.509 certificate and private key created for a database user.
        /// </summary>
        [Output("currentCertificate")]
        public Output<string> CurrentCertificate { get; private set; } = null!;

        /// <summary>
        /// PEM string containing one or more customer CAs for database user authentication.
        /// </summary>
        [Output("customerX509Cas")]
        public Output<string?> CustomerX509Cas { get; private set; } = null!;

        /// <summary>
        /// A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        /// </summary>
        [Output("monthsUntilExpiration")]
        public Output<int?> MonthsUntilExpiration { get; private set; } = null!;

        /// <summary>
        /// Identifier for the Atlas project associated with the X.509 configuration.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Username of the database user to create a certificate for.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;


        /// <summary>
        /// Create a X509AuthenticationDatabaseUser resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public X509AuthenticationDatabaseUser(string name, X509AuthenticationDatabaseUserArgs args, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser", name, args ?? new X509AuthenticationDatabaseUserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private X509AuthenticationDatabaseUser(string name, Input<string> id, X509AuthenticationDatabaseUserState? state = null, CustomResourceOptions? options = null)
            : base("mongodbatlas:index/x509AuthenticationDatabaseUser:X509AuthenticationDatabaseUser", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "currentCertificate",
                    "customerX509Cas",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing X509AuthenticationDatabaseUser resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static X509AuthenticationDatabaseUser Get(string name, Input<string> id, X509AuthenticationDatabaseUserState? state = null, CustomResourceOptions? options = null)
        {
            return new X509AuthenticationDatabaseUser(name, id, state, options);
        }
    }

    public sealed class X509AuthenticationDatabaseUserArgs : global::Pulumi.ResourceArgs
    {
        [Input("customerX509Cas")]
        private Input<string>? _customerX509Cas;

        /// <summary>
        /// PEM string containing one or more customer CAs for database user authentication.
        /// </summary>
        public Input<string>? CustomerX509Cas
        {
            get => _customerX509Cas;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _customerX509Cas = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        /// </summary>
        [Input("monthsUntilExpiration")]
        public Input<int>? MonthsUntilExpiration { get; set; }

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

        public X509AuthenticationDatabaseUserArgs()
        {
        }
        public static new X509AuthenticationDatabaseUserArgs Empty => new X509AuthenticationDatabaseUserArgs();
    }

    public sealed class X509AuthenticationDatabaseUserState : global::Pulumi.ResourceArgs
    {
        [Input("certificates")]
        private InputList<Inputs.X509AuthenticationDatabaseUserCertificateGetArgs>? _certificates;

        /// <summary>
        /// Array of objects where each details one unexpired database user certificate.
        /// </summary>
        public InputList<Inputs.X509AuthenticationDatabaseUserCertificateGetArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.X509AuthenticationDatabaseUserCertificateGetArgs>());
            set => _certificates = value;
        }

        [Input("currentCertificate")]
        private Input<string>? _currentCertificate;

        /// <summary>
        /// Contains the last X.509 certificate and private key created for a database user.
        /// </summary>
        public Input<string>? CurrentCertificate
        {
            get => _currentCertificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _currentCertificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("customerX509Cas")]
        private Input<string>? _customerX509Cas;

        /// <summary>
        /// PEM string containing one or more customer CAs for database user authentication.
        /// </summary>
        public Input<string>? CustomerX509Cas
        {
            get => _customerX509Cas;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _customerX509Cas = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// A number of months that the created certificate is valid for before expiry, up to 24 months. By default is 3.
        /// </summary>
        [Input("monthsUntilExpiration")]
        public Input<int>? MonthsUntilExpiration { get; set; }

        /// <summary>
        /// Identifier for the Atlas project associated with the X.509 configuration.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Username of the database user to create a certificate for.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public X509AuthenticationDatabaseUserState()
        {
        }
        public static new X509AuthenticationDatabaseUserState Empty => new X509AuthenticationDatabaseUserState();
    }
}
