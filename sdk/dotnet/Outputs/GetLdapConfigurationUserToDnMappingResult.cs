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
    public sealed class GetLdapConfigurationUserToDnMappingResult
    {
        /// <summary>
        /// An LDAP query formatting template that inserts the LDAP name matched by the `match` regular expression into an LDAP query URI as specified by RFC 4515 and RFC 4516.
        /// </summary>
        public readonly string LdapQuery;
        /// <summary>
        /// A regular expression to match against a provided LDAP username.
        /// </summary>
        public readonly string Match;
        /// <summary>
        /// An LDAP Distinguished Name (DN) formatting template that converts the LDAP name matched by the `match` regular expression into an LDAP Distinguished Name.
        /// </summary>
        public readonly string Substitution;

        [OutputConstructor]
        private GetLdapConfigurationUserToDnMappingResult(
            string ldapQuery,

            string match,

            string substitution)
        {
            LdapQuery = ldapQuery;
            Match = match;
            Substitution = substitution;
        }
    }
}
