// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectIpAccessListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectIpAccessListArgs Empty = new ProjectIpAccessListArgs();

    /**
     * Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    @Import(name="awsSecurityGroup")
    private @Nullable Output<String> awsSecurityGroup;

    /**
     * @return Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    public Optional<Output<String>> awsSecurityGroup() {
        return Optional.ofNullable(this.awsSecurityGroup);
    }

    /**
     * Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Comment to add to the access list entry.
     * 
     * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Comment to add to the access list entry.
     * 
     * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * Unique identifier for the project to which you want to add one or more access list entries.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique identifier for the project to which you want to add one or more access list entries.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private ProjectIpAccessListArgs() {}

    private ProjectIpAccessListArgs(ProjectIpAccessListArgs $) {
        this.awsSecurityGroup = $.awsSecurityGroup;
        this.cidrBlock = $.cidrBlock;
        this.comment = $.comment;
        this.ipAddress = $.ipAddress;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectIpAccessListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectIpAccessListArgs $;

        public Builder() {
            $ = new ProjectIpAccessListArgs();
        }

        public Builder(ProjectIpAccessListArgs defaults) {
            $ = new ProjectIpAccessListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsSecurityGroup Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
         * 
         * @return builder
         * 
         */
        public Builder awsSecurityGroup(@Nullable Output<String> awsSecurityGroup) {
            $.awsSecurityGroup = awsSecurityGroup;
            return this;
        }

        /**
         * @param awsSecurityGroup Unique identifier of the AWS security group to add to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
         * 
         * @return builder
         * 
         */
        public Builder awsSecurityGroup(String awsSecurityGroup) {
            return awsSecurityGroup(Output.of(awsSecurityGroup));
        }

        /**
         * @param cidrBlock Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock Range of IP addresses in CIDR notation to be added to the access list. Your access list entry can include only one `awsSecurityGroup`, one `cidrBlock`, or one `ipAddress`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param comment Comment to add to the access list entry.
         * 
         * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Comment to add to the access list entry.
         * 
         * &gt; **NOTE:** One of the following attributes must set:  `aws_security_group`, `cidr_block`  or `ip_address`.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param ipAddress Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress Single IP address to be added to the access list. Mutually exclusive with `awsSecurityGroup` and `cidrBlock`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param projectId Unique identifier for the project to which you want to add one or more access list entries.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier for the project to which you want to add one or more access list entries.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public ProjectIpAccessListArgs build() {
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
