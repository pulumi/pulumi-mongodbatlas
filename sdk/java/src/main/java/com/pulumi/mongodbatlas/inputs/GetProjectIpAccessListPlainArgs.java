// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectIpAccessListPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectIpAccessListPlainArgs Empty = new GetProjectIpAccessListPlainArgs();

    /**
     * Unique identifier of the AWS security group to add to the access list.
     * 
     */
    @Import(name="awsSecurityGroup")
    private @Nullable String awsSecurityGroup;

    /**
     * @return Unique identifier of the AWS security group to add to the access list.
     * 
     */
    public Optional<String> awsSecurityGroup() {
        return Optional.ofNullable(this.awsSecurityGroup);
    }

    /**
     * Range of IP addresses in CIDR notation to be added to the access list.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable String cidrBlock;

    /**
     * @return Range of IP addresses in CIDR notation to be added to the access list.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Single IP address to be added to the access list.
     * 
     * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    /**
     * @return Single IP address to be added to the access list.
     * 
     * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique identifier for the project to which you want to add one or more access list entries.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetProjectIpAccessListPlainArgs() {}

    private GetProjectIpAccessListPlainArgs(GetProjectIpAccessListPlainArgs $) {
        this.awsSecurityGroup = $.awsSecurityGroup;
        this.cidrBlock = $.cidrBlock;
        this.ipAddress = $.ipAddress;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectIpAccessListPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectIpAccessListPlainArgs $;

        public Builder() {
            $ = new GetProjectIpAccessListPlainArgs();
        }

        public Builder(GetProjectIpAccessListPlainArgs defaults) {
            $ = new GetProjectIpAccessListPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsSecurityGroup Unique identifier of the AWS security group to add to the access list.
         * 
         * @return builder
         * 
         */
        public Builder awsSecurityGroup(@Nullable String awsSecurityGroup) {
            $.awsSecurityGroup = awsSecurityGroup;
            return this;
        }

        /**
         * @param cidrBlock Range of IP addresses in CIDR notation to be added to the access list.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable String cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param ipAddress Single IP address to be added to the access list.
         * 
         * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param projectId Unique identifier for the project to which you want to add one or more access list entries.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetProjectIpAccessListPlainArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
