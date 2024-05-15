// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.PrivateLinkEndpointServiceEndpointArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkEndpointServiceState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkEndpointServiceState Empty = new PrivateLinkEndpointServiceState();

    /**
     * Status of the interface endpoint for AWS.
     * Returns one of the following values:
     * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
     * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
     * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
     * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
     * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
     * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
     * 
     */
    @Import(name="awsConnectionStatus")
    private @Nullable Output<String> awsConnectionStatus;

    /**
     * @return Status of the interface endpoint for AWS.
     * Returns one of the following values:
     * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
     * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
     * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
     * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
     * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
     * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
     * 
     */
    public Optional<Output<String>> awsConnectionStatus() {
        return Optional.ofNullable(this.awsConnectionStatus);
    }

    /**
     * Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    @Import(name="azureStatus")
    private @Nullable Output<String> azureStatus;

    /**
     * @return Status of the interface endpoint for AZURE.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    public Optional<Output<String>> azureStatus() {
        return Optional.ofNullable(this.azureStatus);
    }

    /**
     * Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     * 
     */
    @Import(name="deleteRequested")
    private @Nullable Output<Boolean> deleteRequested;

    /**
     * @return Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
     * 
     */
    public Optional<Output<Boolean>> deleteRequested() {
        return Optional.ofNullable(this.deleteRequested);
    }

    /**
     * (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
     * 
     */
    @Import(name="endpointGroupName")
    private @Nullable Output<String> endpointGroupName;

    /**
     * @return (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
     * 
     */
    public Optional<Output<String>> endpointGroupName() {
        return Optional.ofNullable(this.endpointGroupName);
    }

    /**
     * Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     * 
     */
    @Import(name="endpointServiceId")
    private @Nullable Output<String> endpointServiceId;

    /**
     * @return Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
     * 
     */
    public Optional<Output<String>> endpointServiceId() {
        return Optional.ofNullable(this.endpointServiceId);
    }

    /**
     * Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     * 
     */
    @Import(name="endpoints")
    private @Nullable Output<List<PrivateLinkEndpointServiceEndpointArgs>> endpoints;

    /**
     * @return Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
     * 
     */
    public Optional<Output<List<PrivateLinkEndpointServiceEndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    /**
     * Error message pertaining to the interface endpoint. Returns null if there are no errors.
     * 
     */
    @Import(name="errorMessage")
    private @Nullable Output<String> errorMessage;

    /**
     * @return Error message pertaining to the interface endpoint. Returns null if there are no errors.
     * 
     */
    public Optional<Output<String>> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    /**
     * Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     * 
     */
    @Import(name="gcpProjectId")
    private @Nullable Output<String> gcpProjectId;

    /**
     * @return Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
     * 
     */
    public Optional<Output<String>> gcpProjectId() {
        return Optional.ofNullable(this.gcpProjectId);
    }

    /**
     * Status of the interface endpoint for GCP.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    @Import(name="gcpStatus")
    private @Nullable Output<String> gcpStatus;

    /**
     * @return Status of the interface endpoint for GCP.
     * Returns one of the following values:
     * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
     * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
     * * `FAILED` - Atlas failed to accept the connection your private endpoint.
     * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
     * 
     */
    public Optional<Output<String>> gcpStatus() {
        return Optional.ofNullable(this.gcpStatus);
    }

    /**
     * Unique identifier of the interface endpoint.
     * 
     */
    @Import(name="interfaceEndpointId")
    private @Nullable Output<String> interfaceEndpointId;

    /**
     * @return Unique identifier of the interface endpoint.
     * 
     */
    public Optional<Output<String>> interfaceEndpointId() {
        return Optional.ofNullable(this.interfaceEndpointId);
    }

    /**
     * Name of the connection for this private endpoint that Atlas generates.
     * 
     */
    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    /**
     * @return Name of the connection for this private endpoint that Atlas generates.
     * 
     */
    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     * 
     */
    @Import(name="privateEndpointIpAddress")
    private @Nullable Output<String> privateEndpointIpAddress;

    /**
     * @return Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
     * 
     */
    public Optional<Output<String>> privateEndpointIpAddress() {
        return Optional.ofNullable(this.privateEndpointIpAddress);
    }

    /**
     * Unique identifier of the private endpoint.
     * 
     */
    @Import(name="privateEndpointResourceId")
    private @Nullable Output<String> privateEndpointResourceId;

    /**
     * @return Unique identifier of the private endpoint.
     * 
     */
    public Optional<Output<String>> privateEndpointResourceId() {
        return Optional.ofNullable(this.privateEndpointResourceId);
    }

    /**
     * Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     * 
     */
    @Import(name="privateLinkId")
    private @Nullable Output<String> privateLinkId;

    /**
     * @return Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
     * 
     */
    public Optional<Output<String>> privateLinkId() {
        return Optional.ofNullable(this.privateLinkId);
    }

    /**
     * Unique identifier for the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier for the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    private PrivateLinkEndpointServiceState() {}

    private PrivateLinkEndpointServiceState(PrivateLinkEndpointServiceState $) {
        this.awsConnectionStatus = $.awsConnectionStatus;
        this.azureStatus = $.azureStatus;
        this.deleteRequested = $.deleteRequested;
        this.endpointGroupName = $.endpointGroupName;
        this.endpointServiceId = $.endpointServiceId;
        this.endpoints = $.endpoints;
        this.errorMessage = $.errorMessage;
        this.gcpProjectId = $.gcpProjectId;
        this.gcpStatus = $.gcpStatus;
        this.interfaceEndpointId = $.interfaceEndpointId;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateEndpointIpAddress = $.privateEndpointIpAddress;
        this.privateEndpointResourceId = $.privateEndpointResourceId;
        this.privateLinkId = $.privateLinkId;
        this.projectId = $.projectId;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkEndpointServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkEndpointServiceState $;

        public Builder() {
            $ = new PrivateLinkEndpointServiceState();
        }

        public Builder(PrivateLinkEndpointServiceState defaults) {
            $ = new PrivateLinkEndpointServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsConnectionStatus Status of the interface endpoint for AWS.
         * Returns one of the following values:
         * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
         * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
         * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
         * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
         * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
         * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder awsConnectionStatus(@Nullable Output<String> awsConnectionStatus) {
            $.awsConnectionStatus = awsConnectionStatus;
            return this;
        }

        /**
         * @param awsConnectionStatus Status of the interface endpoint for AWS.
         * Returns one of the following values:
         * * `NONE` - Atlas created the network load balancer and VPC endpoint service, but AWS hasn’t yet created the VPC endpoint.
         * * `PENDING_ACCEPTANCE` - AWS has received the connection request from your VPC endpoint to the Atlas VPC endpoint service.
         * * `PENDING` - AWS is establishing the connection between your VPC endpoint and the Atlas VPC endpoint service.
         * * `AVAILABLE` - Atlas VPC resources are connected to the VPC endpoint in your VPC. You can connect to Atlas clusters in this region using AWS PrivateLink.
         * * `REJECTED` - AWS failed to establish a connection between Atlas VPC resources to the VPC endpoint in your VPC.
         * * `DELETING` - Atlas is removing the interface endpoint from the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder awsConnectionStatus(String awsConnectionStatus) {
            return awsConnectionStatus(Output.of(awsConnectionStatus));
        }

        /**
         * @param azureStatus Status of the interface endpoint for AZURE.
         * Returns one of the following values:
         * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
         * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
         * * `FAILED` - Atlas failed to accept the connection your private endpoint.
         * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder azureStatus(@Nullable Output<String> azureStatus) {
            $.azureStatus = azureStatus;
            return this;
        }

        /**
         * @param azureStatus Status of the interface endpoint for AZURE.
         * Returns one of the following values:
         * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
         * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
         * * `FAILED` - Atlas failed to accept the connection your private endpoint.
         * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder azureStatus(String azureStatus) {
            return azureStatus(Output.of(azureStatus));
        }

        /**
         * @param deleteRequested Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder deleteRequested(@Nullable Output<Boolean> deleteRequested) {
            $.deleteRequested = deleteRequested;
            return this;
        }

        /**
         * @param deleteRequested Indicates if Atlas received a request to remove the interface endpoint from the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder deleteRequested(Boolean deleteRequested) {
            return deleteRequested(Output.of(deleteRequested));
        }

        /**
         * @param endpointGroupName (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupName(@Nullable Output<String> endpointGroupName) {
            $.endpointGroupName = endpointGroupName;
            return this;
        }

        /**
         * @param endpointGroupName (Optional) Unique identifier of the endpoint group. The endpoint group encompasses all of the endpoints that you created in GCP.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupName(String endpointGroupName) {
            return endpointGroupName(Output.of(endpointGroupName));
        }

        /**
         * @param endpointServiceId Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
         * 
         * @return builder
         * 
         */
        public Builder endpointServiceId(@Nullable Output<String> endpointServiceId) {
            $.endpointServiceId = endpointServiceId;
            return this;
        }

        /**
         * @param endpointServiceId Unique identifier of the interface endpoint you created in your VPC with the `AWS`, `AZURE` or `GCP` resource.
         * 
         * @return builder
         * 
         */
        public Builder endpointServiceId(String endpointServiceId) {
            return endpointServiceId(Output.of(endpointServiceId));
        }

        /**
         * @param endpoints Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(@Nullable Output<List<PrivateLinkEndpointServiceEndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(List<PrivateLinkEndpointServiceEndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param endpoints Collection of individual private endpoints that comprise your endpoint group. Only for `GCP`. See below.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(PrivateLinkEndpointServiceEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        /**
         * @param errorMessage Error message pertaining to the interface endpoint. Returns null if there are no errors.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(@Nullable Output<String> errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param errorMessage Error message pertaining to the interface endpoint. Returns null if there are no errors.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(String errorMessage) {
            return errorMessage(Output.of(errorMessage));
        }

        /**
         * @param gcpProjectId Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(@Nullable Output<String> gcpProjectId) {
            $.gcpProjectId = gcpProjectId;
            return this;
        }

        /**
         * @param gcpProjectId Unique identifier of the GCP project in which you created your endpoints. Only for `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder gcpProjectId(String gcpProjectId) {
            return gcpProjectId(Output.of(gcpProjectId));
        }

        /**
         * @param gcpStatus Status of the interface endpoint for GCP.
         * Returns one of the following values:
         * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
         * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
         * * `FAILED` - Atlas failed to accept the connection your private endpoint.
         * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder gcpStatus(@Nullable Output<String> gcpStatus) {
            $.gcpStatus = gcpStatus;
            return this;
        }

        /**
         * @param gcpStatus Status of the interface endpoint for GCP.
         * Returns one of the following values:
         * * `INITIATING` - Atlas has not yet accepted the connection to your private endpoint.
         * * `AVAILABLE` - Atlas approved the connection to your private endpoint.
         * * `FAILED` - Atlas failed to accept the connection your private endpoint.
         * * `DELETING` - Atlas is removing the connection to your private endpoint from the Private Link service.
         * 
         * @return builder
         * 
         */
        public Builder gcpStatus(String gcpStatus) {
            return gcpStatus(Output.of(gcpStatus));
        }

        /**
         * @param interfaceEndpointId Unique identifier of the interface endpoint.
         * 
         * @return builder
         * 
         */
        public Builder interfaceEndpointId(@Nullable Output<String> interfaceEndpointId) {
            $.interfaceEndpointId = interfaceEndpointId;
            return this;
        }

        /**
         * @param interfaceEndpointId Unique identifier of the interface endpoint.
         * 
         * @return builder
         * 
         */
        public Builder interfaceEndpointId(String interfaceEndpointId) {
            return interfaceEndpointId(Output.of(interfaceEndpointId));
        }

        /**
         * @param privateEndpointConnectionName Name of the connection for this private endpoint that Atlas generates.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName Name of the connection for this private endpoint that Atlas generates.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param privateEndpointIpAddress Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointIpAddress(@Nullable Output<String> privateEndpointIpAddress) {
            $.privateEndpointIpAddress = privateEndpointIpAddress;
            return this;
        }

        /**
         * @param privateEndpointIpAddress Private IP address of the private endpoint network interface you created in your Azure VNet. Only for `AZURE`.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            return privateEndpointIpAddress(Output.of(privateEndpointIpAddress));
        }

        /**
         * @param privateEndpointResourceId Unique identifier of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointResourceId(@Nullable Output<String> privateEndpointResourceId) {
            $.privateEndpointResourceId = privateEndpointResourceId;
            return this;
        }

        /**
         * @param privateEndpointResourceId Unique identifier of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointResourceId(String privateEndpointResourceId) {
            return privateEndpointResourceId(Output.of(privateEndpointResourceId));
        }

        /**
         * @param privateLinkId Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkId(@Nullable Output<String> privateLinkId) {
            $.privateLinkId = privateLinkId;
            return this;
        }

        /**
         * @param privateLinkId Unique identifier of the `AWS` or `AZURE` PrivateLink connection which is created by `mongodbatlas.PrivateLinkEndpoint` resource.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkId(String privateLinkId) {
            return privateLinkId(Output.of(privateLinkId));
        }

        /**
         * @param projectId Unique identifier for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier for the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param providerName Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName Cloud provider for which you want to create a private endpoint. Atlas accepts `AWS`, `AZURE` or `GCP`.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        public PrivateLinkEndpointServiceState build() {
            return $;
        }
    }

}
