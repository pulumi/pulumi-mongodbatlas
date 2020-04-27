import * as pulumi from "@pulumi/pulumi";
import * as mongodb from "@pulumi/mongodbatlas";

const config = new pulumi.Config();
const orgId = config.requireSecret("orgId");

const project = new mongodb.Project("my-demo-project", {
    orgId: orgId,
});

export const projectName = project.name;
