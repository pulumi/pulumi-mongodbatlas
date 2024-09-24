// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MongodbEmployeeAccessGrantState extends com.pulumi.resources.ResourceArgs {

    public static final MongodbEmployeeAccessGrantState Empty = new MongodbEmployeeAccessGrantState();

    /**
     * Human-readable label that identifies this cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return Human-readable label that identifies this cluster.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * Expiration date for the employee access grant.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return Expiration date for the employee access grant.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * Level of access to grant to MongoDB Employees. Possible values are CLUSTER*DATABASE*LOGS, CLUSTER*INFRASTRUCTURE or CLUSTER*INFRASTRUCTURE*AND*APP*SERVICES*SYNC_DATA.
     * 
     */
    @Import(name="grantType")
    private @Nullable Output<String> grantType;

    /**
     * @return Level of access to grant to MongoDB Employees. Possible values are CLUSTER*DATABASE*LOGS, CLUSTER*INFRASTRUCTURE or CLUSTER*INFRASTRUCTURE*AND*APP*SERVICES*SYNC_DATA.
     * 
     */
    public Optional<Output<String>> grantType() {
        return Optional.ofNullable(this.grantType);
    }

    /**
     * Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private MongodbEmployeeAccessGrantState() {}

    private MongodbEmployeeAccessGrantState(MongodbEmployeeAccessGrantState $) {
        this.clusterName = $.clusterName;
        this.expirationTime = $.expirationTime;
        this.grantType = $.grantType;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MongodbEmployeeAccessGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MongodbEmployeeAccessGrantState $;

        public Builder() {
            $ = new MongodbEmployeeAccessGrantState();
        }

        public Builder(MongodbEmployeeAccessGrantState defaults) {
            $ = new MongodbEmployeeAccessGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Human-readable label that identifies this cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Human-readable label that identifies this cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param expirationTime Expiration date for the employee access grant.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime Expiration date for the employee access grant.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param grantType Level of access to grant to MongoDB Employees. Possible values are CLUSTER*DATABASE*LOGS, CLUSTER*INFRASTRUCTURE or CLUSTER*INFRASTRUCTURE*AND*APP*SERVICES*SYNC_DATA.
         * 
         * @return builder
         * 
         */
        public Builder grantType(@Nullable Output<String> grantType) {
            $.grantType = grantType;
            return this;
        }

        /**
         * @param grantType Level of access to grant to MongoDB Employees. Possible values are CLUSTER*DATABASE*LOGS, CLUSTER*INFRASTRUCTURE or CLUSTER*INFRASTRUCTURE*AND*APP*SERVICES*SYNC_DATA.
         * 
         * @return builder
         * 
         */
        public Builder grantType(String grantType) {
            return grantType(Output.of(grantType));
        }

        /**
         * @param projectId Unique 24-hexadecimal digit string that identifies your project. Use the /groups endpoint to retrieve all projects to which the authenticated user has access.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
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

        public MongodbEmployeeAccessGrantState build() {
            return $;
        }
    }

}
