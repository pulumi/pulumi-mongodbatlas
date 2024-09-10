// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigCustomZoneMappingArgs;
import com.pulumi.mongodbatlas.inputs.GlobalClusterConfigManagedNamespaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalClusterConfigState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalClusterConfigState Empty = new GlobalClusterConfigState();

    /**
     * The name of the Global Cluster.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The name of the Global Cluster.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     * 
     */
    @Import(name="customZoneMapping")
    private @Nullable Output<Map<String,String>> customZoneMapping;

    /**
     * @return A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
     * 
     */
    public Optional<Output<Map<String,String>>> customZoneMapping() {
        return Optional.ofNullable(this.customZoneMapping);
    }

    /**
     * Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     * 
     */
    @Import(name="customZoneMappings")
    private @Nullable Output<List<GlobalClusterConfigCustomZoneMappingArgs>> customZoneMappings;

    /**
     * @return Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
     * 
     */
    public Optional<Output<List<GlobalClusterConfigCustomZoneMappingArgs>>> customZoneMappings() {
        return Optional.ofNullable(this.customZoneMappings);
    }

    /**
     * Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     * 
     */
    @Import(name="managedNamespaces")
    private @Nullable Output<List<GlobalClusterConfigManagedNamespaceArgs>> managedNamespaces;

    /**
     * @return Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
     * 
     */
    public Optional<Output<List<GlobalClusterConfigManagedNamespaceArgs>>> managedNamespaces() {
        return Optional.ofNullable(this.managedNamespaces);
    }

    /**
     * The unique ID for the project to create the database user.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The unique ID for the project to create the database user.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GlobalClusterConfigState() {}

    private GlobalClusterConfigState(GlobalClusterConfigState $) {
        this.clusterName = $.clusterName;
        this.customZoneMapping = $.customZoneMapping;
        this.customZoneMappings = $.customZoneMappings;
        this.managedNamespaces = $.managedNamespaces;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalClusterConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalClusterConfigState $;

        public Builder() {
            $ = new GlobalClusterConfigState();
        }

        public Builder(GlobalClusterConfigState defaults) {
            $ = new GlobalClusterConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Global Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Global Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param customZoneMapping A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
         * 
         * @return builder
         * 
         */
        public Builder customZoneMapping(@Nullable Output<Map<String,String>> customZoneMapping) {
            $.customZoneMapping = customZoneMapping;
            return this;
        }

        /**
         * @param customZoneMapping A map of all custom zone mappings defined for the Global Cluster. Atlas automatically maps each location code to the closest geographical zone. Custom zone mappings allow administrators to override these automatic mappings. If your Global Cluster does not have any custom zone mappings, this document is empty.
         * 
         * @return builder
         * 
         */
        public Builder customZoneMapping(Map<String,String> customZoneMapping) {
            return customZoneMapping(Output.of(customZoneMapping));
        }

        /**
         * @param customZoneMappings Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
         * 
         * @return builder
         * 
         */
        public Builder customZoneMappings(@Nullable Output<List<GlobalClusterConfigCustomZoneMappingArgs>> customZoneMappings) {
            $.customZoneMappings = customZoneMappings;
            return this;
        }

        /**
         * @param customZoneMappings Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
         * 
         * @return builder
         * 
         */
        public Builder customZoneMappings(List<GlobalClusterConfigCustomZoneMappingArgs> customZoneMappings) {
            return customZoneMappings(Output.of(customZoneMappings));
        }

        /**
         * @param customZoneMappings Each element in the list maps one ISO location code to a zone in your Global Cluster. See Custom Zone Mapping below for more details.
         * 
         * @return builder
         * 
         */
        public Builder customZoneMappings(GlobalClusterConfigCustomZoneMappingArgs... customZoneMappings) {
            return customZoneMappings(List.of(customZoneMappings));
        }

        /**
         * @param managedNamespaces Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaces(@Nullable Output<List<GlobalClusterConfigManagedNamespaceArgs>> managedNamespaces) {
            $.managedNamespaces = managedNamespaces;
            return this;
        }

        /**
         * @param managedNamespaces Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaces(List<GlobalClusterConfigManagedNamespaceArgs> managedNamespaces) {
            return managedNamespaces(Output.of(managedNamespaces));
        }

        /**
         * @param managedNamespaces Add a managed namespaces to a Global Cluster. For more information about managed namespaces, see [Global Clusters](https://docs.atlas.mongodb.com/reference/api/global-clusters/). See Managed Namespace below for more details.
         * 
         * @return builder
         * 
         */
        public Builder managedNamespaces(GlobalClusterConfigManagedNamespaceArgs... managedNamespaces) {
            return managedNamespaces(List.of(managedNamespaces));
        }

        /**
         * @param projectId The unique ID for the project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The unique ID for the project to create the database user.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GlobalClusterConfigState build() {
            return $;
        }
    }

}