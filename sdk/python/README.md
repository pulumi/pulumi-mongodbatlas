[![Build Status](https://travis-ci.com/pulumi/pulumi-github.svg?token=eHg7Zp5zdDDJfTjY8ejq&branch=master)](https://travis-ci.com/pulumi/pulumi-github)

# MongoDB Atlas provider

The MongoDB Atlas resource provider for Pulumi lets you interact with MongoDB Atlas in your infrastructure 
programs. To use this package, please [install the Pulumi CLI first](https://pulumi.io/).

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/mongodbatlas

or `yarn`:

    $ yarn add @pulumi/mongodbatlas

### Python

To use from Python, install using `pip`:

    $ pip install pulumi-mongodbatlas

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-mongodbatlas/sdk/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Mongodbatlas

## Configuration

The following configuration points are available:

- `mongodbatlas:publicKey` - (Optional) This is the MongoDB Atlas API public_key. It must be provided, but it can also be
  sourced from the `MONGODB_ATLAS_PUBLIC_KEY` environment variable.
- `mongodbatlas:privateKey` - (Optional) This is the MongoDB Atlas private_key. It must be provided, but it can also be
  sourced from the `MONGODB_ATLAS_PRIVATE_KEY` environment variable.

## Reference

For further information, please visit [the GitHub provider docs](https://www.pulumi.com/docs/intro/cloud-providers/github) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/github).
