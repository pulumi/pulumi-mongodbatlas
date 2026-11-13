---
# *** WARNING: This file was auto-generated. Do not edit by hand unless you're certain you know what you are doing! ***
title: Mongodbatlas Provider
meta_desc: Provides an overview on how to configure the Pulumi Mongodbatlas provider.
layout: package
---

## Installation

The Mongodbatlas provider is available as a package in all Pulumi languages:

* JavaScript/TypeScript: [`@pulumi/mongodbatlas`](https://www.npmjs.com/package/@pulumi/mongodbatlas)
* Python: [`pulumi-mongodbatlas`](https://pypi.org/project/pulumi-mongodbatlas/)
* Go: [`github.com/pulumi/pulumi-mongodbatlas/sdk/v4/go/mongodbatlas`](https://github.com/pulumi/pulumi-mongodbatlas)
* .NET: [`Pulumi.Mongodbatlas`](https://www.nuget.org/packages/Pulumi.Mongodbatlas)
* Java: [`com.pulumi/mongodbatlas`](https://central.sonatype.com/artifact/com.pulumi/mongodbatlas)

## Overview

The MongoDB Atlas provider is used to interact with the resources supported by [MongoDB Atlas](https://www.mongodb.com/cloud/atlas). The provider needs to be configured with proper credentials before it can be used.
## Example Usage

This example shows how to set up the MongoDB Atlas provider and create a cluster:

{{< chooser language "typescript,python,go,csharp,java,yaml,hcl" >}}
{{% choosable language typescript %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: nodejs
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as mongodbatlas from "@pulumi/mongodbatlas";

// Create a project
const _this = new mongodbatlas.Project("this", {
    name: "my-project",
    orgId: orgId,
});
// Create a cluster
const thisAdvancedCluster = new mongodbatlas.AdvancedCluster("this", {
    projectId: _this.id,
    name: "my-cluster",
    clusterType: "REPLICASET",
    replicationSpecs: [{
        regionConfigs: [{
            regionName: "US_EAST_1",
            priority: 7,
            providerName: "AWS",
            electableSpecs: {
                instanceSize: "M10",
                nodeCount: 3,
            },
        }],
    }],
});
```

{{% /choosable %}}
{{% choosable language python %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: python
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

```python
import pulumi
import pulumi_mongodbatlas as mongodbatlas

# Create a project
this = mongodbatlas.Project("this",
    name="my-project",
    org_id=org_id)
# Create a cluster
this_advanced_cluster = mongodbatlas.AdvancedCluster("this",
    project_id=this.id,
    name="my-cluster",
    cluster_type="REPLICASET",
    replication_specs=[{
        "region_configs": [{
            "region_name": "US_EAST_1",
            "priority": 7,
            "provider_name": "AWS",
            "electable_specs": {
                "instance_size": "M10",
                "node_count": 3,
            },
        }],
    }])
```

{{% /choosable %}}
{{% choosable language csharp %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: dotnet
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Mongodbatlas = Pulumi.Mongodbatlas;

return await Deployment.RunAsync(() =>
{
    // Create a project
    var @this = new Mongodbatlas.Project("this", new()
    {
        Name = "my-project",
        OrgId = orgId,
    });

    // Create a cluster
    var thisAdvancedCluster = new Mongodbatlas.AdvancedCluster("this", new()
    {
        ProjectId = @this.Id,
        Name = "my-cluster",
        ClusterType = "REPLICASET",
        ReplicationSpecs = new[]
        {
            new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecArgs
            {
                RegionConfigs = new[]
                {
                    new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigArgs
                    {
                        RegionName = "US_EAST_1",
                        Priority = 7,
                        ProviderName = "AWS",
                        ElectableSpecs = new Mongodbatlas.Inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs
                        {
                            InstanceSize = "M10",
                            NodeCount = 3,
                        },
                    },
                },
            },
        },
    });

});

```

{{% /choosable %}}
{{% choosable language go %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: go
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

```go
package main

import (
	"github.com/pulumi/pulumi-mongodbatlas/sdk/v4/go/mongodbatlas"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		// Create a project
		this, err := mongodbatlas.NewProject(ctx, "this", &mongodbatlas.ProjectArgs{
			Name:  pulumi.String("my-project"),
			OrgId: pulumi.Any(orgId),
		})
		if err != nil {
			return err
		}
		// Create a cluster
		_, err = mongodbatlas.NewAdvancedCluster(ctx, "this", &mongodbatlas.AdvancedClusterArgs{
			ProjectId:   this.ID(),
			Name:        pulumi.String("my-cluster"),
			ClusterType: pulumi.String("REPLICASET"),
			ReplicationSpecs: mongodbatlas.AdvancedClusterReplicationSpecArray{
				&mongodbatlas.AdvancedClusterReplicationSpecArgs{
					RegionConfigs: mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArray{
						&mongodbatlas.AdvancedClusterReplicationSpecRegionConfigArgs{
							RegionName:   pulumi.String("US_EAST_1"),
							Priority:     pulumi.Int(7),
							ProviderName: pulumi.String("AWS"),
							ElectableSpecs: &mongodbatlas.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs{
								InstanceSize: pulumi.String("M10"),
								NodeCount:    pulumi.Int(3),
							},
						},
					},
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
```

{{% /choosable %}}
{{% choosable language yaml %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: yaml
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

```yaml
resources:
  # Create a project
  this:
    type: mongodbatlas:Project
    properties:
      name: my-project
      orgId: ${orgId}
  # Create a cluster
  thisAdvancedCluster:
    type: mongodbatlas:AdvancedCluster
    name: this
    properties:
      projectId: ${this.id}
      name: my-cluster
      clusterType: REPLICASET
      replicationSpecs:
        - regionConfigs:
            - regionName: US_EAST_1
              priority: 7
              providerName: AWS
              electableSpecs:
                instanceSize: M10
                nodeCount: 3
```

{{% /choosable %}}
{{% choosable language java %}}
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime: java
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.mongodbatlas.Project;
import com.pulumi.mongodbatlas.ProjectArgs;
import com.pulumi.mongodbatlas.AdvancedCluster;
import com.pulumi.mongodbatlas.AdvancedClusterArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigArgs;
import com.pulumi.mongodbatlas.inputs.AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        // Create a project
        var this_ = new Project("this", ProjectArgs.builder()
            .name("my-project")
            .orgId(orgId)
            .build());

        // Create a cluster
        var thisAdvancedCluster = new AdvancedCluster("thisAdvancedCluster", AdvancedClusterArgs.builder()
            .projectId(this_.id())
            .name("my-cluster")
            .clusterType("REPLICASET")
            .replicationSpecs(AdvancedClusterReplicationSpecArgs.builder()
                .regionConfigs(AdvancedClusterReplicationSpecRegionConfigArgs.builder()
                    .regionName("US_EAST_1")
                    .priority(7)
                    .providerName("AWS")
                    .electableSpecs(AdvancedClusterReplicationSpecRegionConfigElectableSpecsArgs.builder()
                        .instanceSize("M10")
                        .nodeCount(3)
                        .build())
                    .build())
                .build())
            .build());

    }
}
```

{{% /choosable %}}
{{% choosable language hcl %}}
```hcl
terraform {
  required_providers {
    mongodbatlas = {
      source = "pulumi/mongodbatlas"
    }
  }
}

# Create a project
resource "mongodbatlas_project" "this" {
  lifecycle {
    create_before_destroy = true
  }
  name   = "my-project"
  org_id = orgId
}
# Create a cluster
resource "mongodbatlas_advanced_cluster" "this" {
  lifecycle {
    create_before_destroy = true
  }
  project_id   = mongodbatlas_project.this.id
  name         = "my-cluster"
  cluster_type = "REPLICASET"
  replication_specs = [{
    region_configs = [{
      region_name   = "US_EAST_1"
      priority      = 7
      provider_name = "AWS"
      electable_specs = {
        instance_size = "M10"
        node_count    = 3
      }
    }]
  }]
}
```

{{% /choosable %}}
{{< /chooser >}}
## Authentication Methods

The MongoDB Atlas provider supports the following authentication methods:

1. [**Service Account (SA)** - Recommended](https://www.pulumi.com/registry/packages/mongodbatlas/#service-account-recommended)
2. [**Programmatic Access Key (PAK)**](https://www.pulumi.com/registry/packages/mongodbatlas/#programmatic-access-key)

Credentials can be provided through one of the following sources (in priority order):

1. AWS Secrets Manager (configured through provider attributes or environment variables)
2. Provider attributes
3. Environment variables

The provider selects the first source that has credentials and uses it as the single source of configuration. Sources are not merged; values set in a lower-priority source are ignored once a higher-priority source is selected.
### Service Account (Recommended)

SAs simplify authentication by eliminating the need to create new Atlas-specific user identities and permission credentials. See [Service Accounts Overview](https://www.mongodb.com/docs/atlas/api/service-accounts-overview/) for more information.

To use SA authentication, create an SA in your [MongoDB Atlas organization](https://www.mongodb.com/docs/atlas/configure-api-access/#grant-programmatic-access-to-an-organization) and set the credentials, for example:

> **NOTE:** When creating a new organization with the `mongodbatlas.Organization` resource, you can define a `serviceAccount` block to create a Service Account instead of a Programmatic API Key. The resulting `clientId` and `clientSecret` attributes can be used directly to configure the provider for the new organization.

```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime:
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'

```

**Note:** SAs can't be used with `mongodbatlas.EventTrigger` resources because its API doesn't support it yet.

**Troubleshooting Service Accounts**

If you encounter a rate limit error when using Service Accounts, you might see:

```
│ Error: error initializing provider: oauth2: cannot fetch token: 429 Too Many Requests
│ Response: {"detail":"Resource /api/oauth/token is limited to 50 requests every 1 minutes.","error":429,"errorCode":"RATE_LIMITED","parameters":["/api/oauth/token",50,1],"reason":"Too Many Requests"}
```

Atlas enforces rate limiting for each combination of IP address and SA client. See [MongoDB Atlas Service Account Limits](https://www.mongodb.com/docs/manual/reference/limits/#mongodb-atlas-service-account-limits) for more information. Each Pulumi operation generates a new token that is used for the duration of that operation. These limits work well for individual development environments. For CI pipelines or enterprise environments with shared infrastructure, consider optimizing your configuration using one of these approaches:

- Create separate Service Accounts for different environments or CI/CD pipelines, as each SA client has its own rate limit quota.
- Distribute Pulumi executions across different IP addresses, since rate limits apply per IP and SA client combination.
- Add retry logic to your automation workflows to handle temporary rate limit errors gracefully.
### Programmatic Access Key

Generate a PAK with the appropriate [role](https://www.mongodb.com/docs/atlas/reference/user-roles/). See the [MongoDB Atlas documentation](https://www.mongodb.com/docs/atlas/configure-api-access-org/) for detailed instructions.

**Role recommendation:** If unsure which role to grant, use an organization API key with the Organization Owner role to ensure sufficient access as in the following example:

```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime:
config:
    mongodbatlas:privateKey:
        value: 'TODO: var.mongodbatlas_private_key'
    mongodbatlas:publicKey:
        value: 'TODO: var.mongodbatlas_public_key'

```

> **Migrating from PAK to SA:** Update your provider attributes or environment variables to use SA credentials instead of PAK credentials, then run `pulumi preview` to verify everything works correctly.
## AWS Secrets Manager

The provider supports retrieving credentials from AWS Secrets Manager. See [AWS Secrets Manager documentation](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) for more details.
### Setup Instructions

1. **Create secrets in AWS Secrets Manager**

   For SA, create a secret with the following key-value pairs:
   - `clientId`: your-client-id
   - `clientSecret`: your-client-secret

   For PAK, create a secret with the following key-value pairs:
   - `publicKey`: your-public-key
   - `privateKey`: your-private-key

   Optionally, you can also set `baseUrl`, `realmBaseUrl`, and `isMongodbgovCloud` as keys in the secret (see note below).

2. **Create an IAM Role** with:
   - Permission for `sts:AssumeRole`
   - Attached AWS managed policy `SecretsManagerReadWrite`

3. **Configure AWS credentials** (using AWS CLI or environment variables)

4. **Assume the role** to obtain STS credentials

   ```shell
   aws sts assume-role --role-arn <ROLE_ARN> --role-session-name newSession
   ```

5. **Configure provider with AWS Secrets Manager**

   Using provider attributes:

```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime:
config:
    mongodbatlas:awsAccessKeyId:
        value: 'TODO: var.aws_access_key_id'
    mongodbatlas:awsSecretAccessKey:
        value: 'TODO: var.aws_secret_access_key'
    mongodbatlas:awsSessionToken:
        value: 'TODO: var.aws_session_token'
    mongodbatlas:region:
        value: us-east-2
    mongodbatlas:secretName:
        value: mongodbsecret

```

Alternatively, you can use environment variables (`AWS_ACCESS_KEY_ID`, `AWS_SECRET_ACCESS_KEY`, `AWS_SESSION_TOKEN`, `ASSUME_ROLE_ARN`, `SECRET_NAME`, `AWS_REGION`).

> **NOTE:** When using AWS Secrets Manager, the provider takes its entire configuration from the secret payload. In addition to credentials, you can set `baseUrl`, `realmBaseUrl`, and `isMongodbgovCloud` as keys inside the secret JSON.
### Cross-Account and Cross-Region Access

For cross-account secrets, use the fully qualified ARN for `secretName`. For cross-region or cross-account access, the `stsEndpoint` parameter is required, for example:

```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime:
config:
    mongodbatlas:awsAccessKeyId:
        value: 'TODO: var.aws_access_key_id'
    mongodbatlas:awsSecretAccessKey:
        value: 'TODO: var.aws_secret_access_key'
    mongodbatlas:awsSessionToken:
        value: 'TODO: var.aws_session_token'
    mongodbatlas:region:
        value: us-east-2
    mongodbatlas:secretName:
        value: arn:aws:secretsmanager:us-east-1:<AWS_ACCOUNT_ID>:secret:test789-TO06Hy
    mongodbatlas:stsEndpoint:
        value: https://sts.us-east-2.amazonaws.com/

```
## Provider Configuration Reference
### Provider Arguments

* `clientId` - (Optional) SA Client ID (env: `MONGODB_ATLAS_CLIENT_ID`).
* `clientSecret` - (Optional) SA Client Secret (env: `MONGODB_ATLAS_CLIENT_SECRET`).
* `accessToken` - (Optional) SA Access Token (env: `MONGODB_ATLAS_ACCESS_TOKEN`). Instead of using Client ID and Client Secret, you can generate and use an SA token directly. See [Generate Service Account Token](https://www.mongodb.com/docs/atlas/api/service-accounts/generate-oauth2-token/#std-label-generate-oauth2-token-atlas) for details. Note: tokens have expiration times.
* `publicKey` - (Optional) PAK Public Key (env: `MONGODB_ATLAS_PUBLIC_API_KEY`).
* `privateKey` - (Optional) PAK Private Key (env: `MONGODB_ATLAS_PRIVATE_API_KEY`).
* `baseUrl` - (Optional) MongoDB Atlas Base URL (env: `MONGODB_ATLAS_BASE_URL`). For advanced use cases, you can configure custom API endpoints.
* `realmBaseUrl` - (Optional) MongoDB Realm Base URL (env: `MONGODB_REALM_BASE_URL`).
* `isMongodbgovCloud` - (Optional) Set to `true` to use MongoDB Atlas for Government, a dedicated deployment option for government agencies and contractors requiring FedRAMP compliance. When enabled, the provider uses government-specific API endpoints. Ensure credentials are created in the government environment. See [Atlas for Government Considerations](https://www.mongodb.com/docs/atlas/government/api/#atlas-for-government-considerations) for feature limitations and requirements.
```yaml
# Pulumi.yaml provider configuration file
name: configuration-example
runtime:
config:
    mongodbatlas:clientId:
        value: 'TODO: var.mongodbatlas_client_id'
    mongodbatlas:clientSecret:
        value: 'TODO: var.mongodbatlas_client_secret'
    mongodbatlas:isMongodbgovCloud:
        value: true

```

* `assume_role.role_arn` - (Optional) AWS IAM role configuration for accessing secrets in AWS Secrets Manager. Role ARN env: `ASSUME_ROLE_ARN`. See [AWS Secrets Manager](https://www.pulumi.com/registry/packages/mongodbatlas/#aws-secrets-manager) section for details.
* `secretName` - (Optional) Name of the secret in AWS Secrets Manager (env: `SECRET_NAME`).
* `region` - (Optional) AWS region where the secret is stored (env: `AWS_REGION`).
* `awsAccessKeyId` - (Optional) AWS Access Key ID (env: `AWS_ACCESS_KEY_ID`).
* `awsSecretAccessKey` - (Optional) AWS Secret Access Key (env: `AWS_SECRET_ACCESS_KEY`).
* `awsSessionToken` - (Optional) AWS Session Token (env: `AWS_SESSION_TOKEN`).
* `stsEndpoint` - (Optional) AWS STS endpoint (env: `STS_ENDPOINT`).
## Credential Priority

When multiple credentials are provided in the same source, the provider uses this priority order:

1. Access Token
2. Service Account (SA)
3. Programmatic Access Key (PAK)

The provider displays a warning when multiple credentials are detected.
## MongoDB Atlas for Government

MongoDB Atlas for Government is a dedicated deployment option for government agencies and contractors requiring FedRAMP compliance.
For more details on configuration, see the [Provider Configuration Guide](https://www.pulumi.com/registry/packages/mongodbatlas/#provider-arguments).