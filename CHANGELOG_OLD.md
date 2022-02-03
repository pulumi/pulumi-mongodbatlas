CHANGELOG
=========

## Notice (2022-01-06)

*As of this notice, using CHANGELOG.md is DEPRECATED. We will be using [GitHub Releases](https://github.com/pulumi/pulumi-mongodbatlas/releases) for this repository*

## HEAD (Unreleased)
_(none)_

---

## 3.1.2 (2021-12-30)
* Upgrade terraform-provider-mongodbatlas to v1.1.1

## 3.1.1 (2021-12-07)
* Ensure Go SDK mod file is v3 to match provider version

## 3.1.0 (2021-12-06)
* Upgrade to terraform-bridge 3.13.0
* Upgrade to pulumi 3.19.0

## 3.0.1 (2021-11-01)
* Upgrade to v1.0.2 of the MongoDbAtlas Terraform Provider

## 3.0.0 (2021-09-09)
* Upgrade to v1.0.1 of the MongoDbAtlas Terraform Provider
  **Please Note:** This includes a breaking change to remove the following resources:
  * `mongodbatlas.PrivateEndpoint`
  * `mongodbatlas.ProjectIpWhitelist`
  * `mongodbatlas.PrivateEndpointInterfaceLink`
  * `mongodbatlas.getPrivateEndpoint`
  * `mongodbatlas.getPrivateEndpointInterfaceLink`
  * `mongodbatlas.getProjectIpWhitelist`
  * You can read the full upstream provider upgrade guide in the [upstream provider changelog](https://github.com/mongodb/terraform-provider-mongodbatlas/blob/master/CHANGELOG.md#v100-2021-08-11)

## 2.1.1 (2021-05-21)
* Upgrade to v0.9.1 of the MongoDbAtlas Terraform Provider

## 2.1.0 (2021-04-30)
* Upgrade to v0.9.0 of the MongoDbAtlas Terraform Provider

## 2.0.1 (2021-04-26)
* Ensure SDK is being marked as v2 correctly

## 2.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 1.7.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 1.6.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 1.6.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 1.5.2 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 1.5.1 (2021-02-03)
* Upgrade to v0.8.2 of the MongoDbAtlas Terraform Provider

## 1.5.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 1.4.0 (2021-01-14)
* Upgrade to v0.8.0 of the MongoDbAtlas Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 1.3.1 (2021-01-05)
* Upgrade to pulumi-terraform-bridge v2.13.2
  * This adds support for import specific examples in documentation

## 1.3.0 (2020-10-26)
* Upgrade to v0.7.0 of the MongoDbAtlas Terraform Provider
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 1.2.2 (2020-09-21)
* Upgrade to v0.6.5 of the MongoDbAtlas Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 1.2.1 (2020-09-04)
* Upgrade to v0.6.4 of the MongoDbAtlas Terraform Provider

## 1.2.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 1.1.3 (2020-07-24)
* Upgrade to v0.6.3 of the MongoDbAtlas Terraform Provider

## 1.1.2 (2020-07-21)
* Upgrade to v0.6.2 of the MongoDbAtlas Terraform Provider

## 1.1.1 (2020-06-23)
* Upgrade to v0.6.1 of the MongoDbAtlas Terraform Provider

## 1.1.0 (2020-06-12)
* Upgrade to v0.6.0 of the MongoDbAtlas Terraform Provider

## 1.0.3 (2020-06-10)
* Switch to GitHub actions for build

## 1.0.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 1.0.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 1.0.0 (2020-04-27)
* Initial creation of the provider against v0.5.0 of the MongoDbAtlas Terraform Provider
