// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.inputs.PushBasedLogExportTimeoutsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PushBasedLogExportArgs extends com.pulumi.resources.ResourceArgs {

    public static final PushBasedLogExportArgs Empty = new PushBasedLogExportArgs();

    /**
     * The name of the bucket to which the agent sends the logs to.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the bucket to which the agent sends the logs to.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * ID of the AWS IAM role that is used to write to the S3 bucket.
     * 
     */
    @Import(name="iamRoleId", required=true)
    private Output<String> iamRoleId;

    /**
     * @return ID of the AWS IAM role that is used to write to the S3 bucket.
     * 
     */
    public Output<String> iamRoleId() {
        return this.iamRoleId;
    }

    /**
     * S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
     * 
     */
    @Import(name="prefixPath")
    private @Nullable Output<String> prefixPath;

    /**
     * @return S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
     * 
     */
    public Optional<Output<String>> prefixPath() {
        return Optional.ofNullable(this.prefixPath);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    @Import(name="timeouts")
    private @Nullable Output<PushBasedLogExportTimeoutsArgs> timeouts;

    public Optional<Output<PushBasedLogExportTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private PushBasedLogExportArgs() {}

    private PushBasedLogExportArgs(PushBasedLogExportArgs $) {
        this.bucketName = $.bucketName;
        this.iamRoleId = $.iamRoleId;
        this.prefixPath = $.prefixPath;
        this.projectId = $.projectId;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PushBasedLogExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PushBasedLogExportArgs $;

        public Builder() {
            $ = new PushBasedLogExportArgs();
        }

        public Builder(PushBasedLogExportArgs defaults) {
            $ = new PushBasedLogExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the bucket to which the agent sends the logs to.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the bucket to which the agent sends the logs to.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param iamRoleId ID of the AWS IAM role that is used to write to the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleId(Output<String> iamRoleId) {
            $.iamRoleId = iamRoleId;
            return this;
        }

        /**
         * @param iamRoleId ID of the AWS IAM role that is used to write to the S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleId(String iamRoleId) {
            return iamRoleId(Output.of(iamRoleId));
        }

        /**
         * @param prefixPath S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
         * 
         * @return builder
         * 
         */
        public Builder prefixPath(@Nullable Output<String> prefixPath) {
            $.prefixPath = prefixPath;
            return this;
        }

        /**
         * @param prefixPath S3 directory in which vector writes in order to store the logs. An empty string denotes the root directory.
         * 
         * @return builder
         * 
         */
        public Builder prefixPath(String prefixPath) {
            return prefixPath(Output.of(prefixPath));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder timeouts(@Nullable Output<PushBasedLogExportTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(PushBasedLogExportTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public PushBasedLogExportArgs build() {
            if ($.bucketName == null) {
                throw new MissingRequiredPropertyException("PushBasedLogExportArgs", "bucketName");
            }
            if ($.iamRoleId == null) {
                throw new MissingRequiredPropertyException("PushBasedLogExportArgs", "iamRoleId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("PushBasedLogExportArgs", "projectId");
            }
            return $;
        }
    }

}
