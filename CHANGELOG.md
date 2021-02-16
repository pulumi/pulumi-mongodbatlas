CHANGELOG
=========

## HEAD (Unreleased)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

---

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
