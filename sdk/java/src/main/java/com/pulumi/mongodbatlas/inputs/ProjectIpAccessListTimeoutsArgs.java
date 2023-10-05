// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectIpAccessListTimeoutsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectIpAccessListTimeoutsArgs Empty = new ProjectIpAccessListTimeoutsArgs();

    @Import(name="delete")
    private @Nullable Output<String> delete;

    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    @Import(name="read")
    private @Nullable Output<String> read;

    public Optional<Output<String>> read() {
        return Optional.ofNullable(this.read);
    }

    private ProjectIpAccessListTimeoutsArgs() {}

    private ProjectIpAccessListTimeoutsArgs(ProjectIpAccessListTimeoutsArgs $) {
        this.delete = $.delete;
        this.read = $.read;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectIpAccessListTimeoutsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectIpAccessListTimeoutsArgs $;

        public Builder() {
            $ = new ProjectIpAccessListTimeoutsArgs();
        }

        public Builder(ProjectIpAccessListTimeoutsArgs defaults) {
            $ = new ProjectIpAccessListTimeoutsArgs(Objects.requireNonNull(defaults));
        }

        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        public Builder read(@Nullable Output<String> read) {
            $.read = read;
            return this;
        }

        public Builder read(String read) {
            return read(Output.of(read));
        }

        public ProjectIpAccessListTimeoutsArgs build() {
            return $;
        }
    }

}
