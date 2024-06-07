// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.GetServerlessInstanceLinkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerlessInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerlessInstanceArgs Empty = new GetServerlessInstanceArgs();

    /**
     * Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
     * 
     */
    @Import(name="autoIndexing")
    private @Nullable Output<Boolean> autoIndexing;

    /**
     * @return Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
     * 
     */
    public Optional<Output<Boolean>> autoIndexing() {
        return Optional.ofNullable(this.autoIndexing);
    }

    /**
     * Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
     * 
     */
    @Import(name="continuousBackupEnabled")
    private @Nullable Output<Boolean> continuousBackupEnabled;

    /**
     * @return Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
     * 
     */
    public Optional<Output<Boolean>> continuousBackupEnabled() {
        return Optional.ofNullable(this.continuousBackupEnabled);
    }

    @Import(name="links")
    private @Nullable Output<List<GetServerlessInstanceLinkArgs>> links;

    public Optional<Output<List<GetServerlessInstanceLinkArgs>>> links() {
        return Optional.ofNullable(this.links);
    }

    /**
     * Human-readable label that identifies your serverless instance.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Human-readable label that identifies your serverless instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Stage of deployment of this serverless instance when the resource made its request.
     * 
     */
    @Import(name="stateName")
    private @Nullable Output<String> stateName;

    /**
     * @return Stage of deployment of this serverless instance when the resource made its request.
     * 
     */
    public Optional<Output<String>> stateName() {
        return Optional.ofNullable(this.stateName);
    }

    private GetServerlessInstanceArgs() {}

    private GetServerlessInstanceArgs(GetServerlessInstanceArgs $) {
        this.autoIndexing = $.autoIndexing;
        this.continuousBackupEnabled = $.continuousBackupEnabled;
        this.links = $.links;
        this.name = $.name;
        this.projectId = $.projectId;
        this.stateName = $.stateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerlessInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerlessInstanceArgs $;

        public Builder() {
            $ = new GetServerlessInstanceArgs();
        }

        public Builder(GetServerlessInstanceArgs defaults) {
            $ = new GetServerlessInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoIndexing Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
         * 
         * @return builder
         * 
         */
        public Builder autoIndexing(@Nullable Output<Boolean> autoIndexing) {
            $.autoIndexing = autoIndexing;
            return this;
        }

        /**
         * @param autoIndexing Flag that indicates whether the serverless instance uses [Serverless Auto Indexing](https://www.mongodb.com/docs/atlas/performance-advisor/auto-index-serverless/).
         * 
         * @return builder
         * 
         */
        public Builder autoIndexing(Boolean autoIndexing) {
            return autoIndexing(Output.of(autoIndexing));
        }

        /**
         * @param continuousBackupEnabled Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
         * 
         * @return builder
         * 
         */
        public Builder continuousBackupEnabled(@Nullable Output<Boolean> continuousBackupEnabled) {
            $.continuousBackupEnabled = continuousBackupEnabled;
            return this;
        }

        /**
         * @param continuousBackupEnabled Flag that indicates whether the serverless instance uses Serverless Continuous Backup.
         * 
         * @return builder
         * 
         */
        public Builder continuousBackupEnabled(Boolean continuousBackupEnabled) {
            return continuousBackupEnabled(Output.of(continuousBackupEnabled));
        }

        public Builder links(@Nullable Output<List<GetServerlessInstanceLinkArgs>> links) {
            $.links = links;
            return this;
        }

        public Builder links(List<GetServerlessInstanceLinkArgs> links) {
            return links(Output.of(links));
        }

        public Builder links(GetServerlessInstanceLinkArgs... links) {
            return links(List.of(links));
        }

        /**
         * @param name Human-readable label that identifies your serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human-readable label that identifies your serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies the project that contains your serverless instance.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param stateName Stage of deployment of this serverless instance when the resource made its request.
         * 
         * @return builder
         * 
         */
        public Builder stateName(@Nullable Output<String> stateName) {
            $.stateName = stateName;
            return this;
        }

        /**
         * @param stateName Stage of deployment of this serverless instance when the resource made its request.
         * 
         * @return builder
         * 
         */
        public Builder stateName(String stateName) {
            return stateName(Output.of(stateName));
        }

        public GetServerlessInstanceArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetServerlessInstanceArgs", "name");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetServerlessInstanceArgs", "projectId");
            }
            return $;
        }
    }

}
