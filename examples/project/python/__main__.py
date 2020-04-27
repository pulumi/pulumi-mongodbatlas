import pulumi
import pulumi_mongodbatlas as mongodb

config = pulumi.Config()
org_id = config.require("orgId")

project = mongodb.Project("demo-project",
    org_id=org_id
)

pulumi.export('project_name', project.name)
