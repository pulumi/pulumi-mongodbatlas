// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.CloudProviderAccessAuthorizationAwsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudProviderAccessAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudProviderAccessAuthorizationArgs Empty = new CloudProviderAccessAuthorizationArgs();

    @Import(name="aws")
    private @Nullable Output<CloudProviderAccessAuthorizationAwsArgs> aws;

    public Optional<Output<CloudProviderAccessAuthorizationAwsArgs>> aws() {
        return Optional.ofNullable(this.aws);
    }

    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    @Import(name="roleId", required=true)
    private Output<String> roleId;

    public Output<String> roleId() {
        return this.roleId;
    }

    private CloudProviderAccessAuthorizationArgs() {}

    private CloudProviderAccessAuthorizationArgs(CloudProviderAccessAuthorizationArgs $) {
        this.aws = $.aws;
        this.projectId = $.projectId;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudProviderAccessAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudProviderAccessAuthorizationArgs $;

        public Builder() {
            $ = new CloudProviderAccessAuthorizationArgs();
        }

        public Builder(CloudProviderAccessAuthorizationArgs defaults) {
            $ = new CloudProviderAccessAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder aws(@Nullable Output<CloudProviderAccessAuthorizationAwsArgs> aws) {
            $.aws = aws;
            return this;
        }

        public Builder aws(CloudProviderAccessAuthorizationAwsArgs aws) {
            return aws(Output.of(aws));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public CloudProviderAccessAuthorizationArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.roleId = Objects.requireNonNull($.roleId, "expected parameter 'roleId' to be non-null");
            return $;
        }
    }

}
