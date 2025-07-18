// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Mongodbatlas
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("mongodbatlas");

        private static readonly __Value<Pulumi.Mongodbatlas.Config.Types.AssumeRole?> _assumeRole = new __Value<Pulumi.Mongodbatlas.Config.Types.AssumeRole?>(() => __config.GetObject<Pulumi.Mongodbatlas.Config.Types.AssumeRole>("assumeRole"));
        public static Pulumi.Mongodbatlas.Config.Types.AssumeRole? AssumeRole
        {
            get => _assumeRole.Get();
            set => _assumeRole.Set(value);
        }

        private static readonly __Value<string?> _awsAccessKeyId = new __Value<string?>(() => __config.Get("awsAccessKeyId"));
        /// <summary>
        /// AWS API Access Key.
        /// </summary>
        public static string? AwsAccessKeyId
        {
            get => _awsAccessKeyId.Get();
            set => _awsAccessKeyId.Set(value);
        }

        private static readonly __Value<string?> _awsSecretAccessKey = new __Value<string?>(() => __config.Get("awsSecretAccessKey"));
        /// <summary>
        /// AWS API Access Secret Key.
        /// </summary>
        public static string? AwsSecretAccessKey
        {
            get => _awsSecretAccessKey.Get();
            set => _awsSecretAccessKey.Set(value);
        }

        private static readonly __Value<string?> _awsSessionToken = new __Value<string?>(() => __config.Get("awsSessionToken"));
        /// <summary>
        /// AWS Security Token Service provided session token.
        /// </summary>
        public static string? AwsSessionToken
        {
            get => _awsSessionToken.Get();
            set => _awsSessionToken.Set(value);
        }

        private static readonly __Value<string?> _baseUrl = new __Value<string?>(() => __config.Get("baseUrl"));
        /// <summary>
        /// MongoDB Atlas Base URL
        /// </summary>
        public static string? BaseUrl
        {
            get => _baseUrl.Get();
            set => _baseUrl.Set(value);
        }

        private static readonly __Value<bool?> _isMongodbgovCloud = new __Value<bool?>(() => __config.GetBoolean("isMongodbgovCloud"));
        /// <summary>
        /// MongoDB Atlas Base URL default to gov
        /// </summary>
        public static bool? IsMongodbgovCloud
        {
            get => _isMongodbgovCloud.Get();
            set => _isMongodbgovCloud.Set(value);
        }

        private static readonly __Value<string?> _privateKey = new __Value<string?>(() => __config.Get("privateKey"));
        /// <summary>
        /// MongoDB Atlas Programmatic Private Key
        /// </summary>
        public static string? PrivateKey
        {
            get => _privateKey.Get();
            set => _privateKey.Set(value);
        }

        private static readonly __Value<string?> _publicKey = new __Value<string?>(() => __config.Get("publicKey"));
        /// <summary>
        /// MongoDB Atlas Programmatic Public Key
        /// </summary>
        public static string? PublicKey
        {
            get => _publicKey.Get();
            set => _publicKey.Set(value);
        }

        private static readonly __Value<string?> _realmBaseUrl = new __Value<string?>(() => __config.Get("realmBaseUrl"));
        /// <summary>
        /// MongoDB Realm Base URL
        /// </summary>
        public static string? RealmBaseUrl
        {
            get => _realmBaseUrl.Get();
            set => _realmBaseUrl.Set(value);
        }

        private static readonly __Value<string?> _region = new __Value<string?>(() => __config.Get("region"));
        /// <summary>
        /// Region where secret is stored as part of AWS Secret Manager.
        /// </summary>
        public static string? Region
        {
            get => _region.Get();
            set => _region.Set(value);
        }

        private static readonly __Value<string?> _secretName = new __Value<string?>(() => __config.Get("secretName"));
        /// <summary>
        /// Name of secret stored in AWS Secret Manager.
        /// </summary>
        public static string? SecretName
        {
            get => _secretName.Get();
            set => _secretName.Set(value);
        }

        private static readonly __Value<string?> _stsEndpoint = new __Value<string?>(() => __config.Get("stsEndpoint"));
        /// <summary>
        /// AWS Security Token Service endpoint. Required for cross-AWS region or cross-AWS account secrets.
        /// </summary>
        public static string? StsEndpoint
        {
            get => _stsEndpoint.Get();
            set => _stsEndpoint.Set(value);
        }

        public static class Types
        {

             public class AssumeRole
             {
            /// <summary>
            /// The duration, between 15 minutes and 12 hours, of the role session. Valid time units are ns, us (or µs), ms, s, h, or m.
            /// </summary>
                public string? Duration { get; set; } = null!;
            /// <summary>
            /// A unique identifier that might be required when you assume a role in another account.
            /// </summary>
                public string? ExternalId { get; set; } = null!;
            /// <summary>
            /// IAM Policy JSON describing further restricting permissions for the IAM Role being assumed.
            /// </summary>
                public string? Policy { get; set; } = null!;
            /// <summary>
            /// Amazon Resource Names (ARNs) of IAM Policies describing further restricting permissions for the IAM Role being assumed.
            /// </summary>
                public ImmutableArray<string> PolicyArns { get; set; }
            /// <summary>
            /// Amazon Resource Name (ARN) of an IAM Role to assume prior to making API calls.
            /// </summary>
                public string? RoleArn { get; set; } = null!;
            /// <summary>
            /// An identifier for the assumed role session.
            /// </summary>
                public string? SessionName { get; set; } = null!;
            /// <summary>
            /// Source identity specified by the principal assuming the role.
            /// </summary>
                public string? SourceIdentity { get; set; } = null!;
            /// <summary>
            /// Assume role session tags.
            /// </summary>
                public ImmutableDictionary<string, string>? Tags { get; set; } = null!;
            /// <summary>
            /// Assume role session tag keys to pass to any subsequent sessions.
            /// </summary>
                public ImmutableArray<string> TransitiveTagKeys { get; set; }
            }
        }
    }
}
