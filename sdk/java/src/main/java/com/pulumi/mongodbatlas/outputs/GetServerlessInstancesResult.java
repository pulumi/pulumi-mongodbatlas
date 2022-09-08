// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.mongodbatlas.outputs.GetServerlessInstancesResultLink;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServerlessInstancesResult {
    /**
     * @return Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     * 
     */
    private String connectionStringsStandardSrv;
    private String createDate;
    /**
     * @return Unique 24-hexadecimal digit string that identifies the serverless instance.
     * 
     */
    private String id;
    private List<GetServerlessInstancesResultLink> links;
    /**
     * @return Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
     * 
     */
    private String mongoDbVersion;
    /**
     * @return (Required) Human-readable label that identifies your serverless instance.
     * 
     */
    private String name;
    /**
     * @return Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    private String projectId;
    /**
     * @return Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     * 
     */
    private String providerSettingsBackingProviderName;
    /**
     * @return Cloud service provider that applies to the provisioned the serverless instance.
     * 
     */
    private String providerSettingsProviderName;
    /**
     * @return Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     * 
     */
    private String providerSettingsRegionName;
    /**
     * @return Stage of deployment of this serverless instance when the resource made its request.
     * 
     */
    private String stateName;

    private GetServerlessInstancesResult() {}
    /**
     * @return Public `mongodb+srv://` connection string that you can use to connect to this serverless instance.
     * 
     */
    public String connectionStringsStandardSrv() {
        return this.connectionStringsStandardSrv;
    }
    public String createDate() {
        return this.createDate;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies the serverless instance.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetServerlessInstancesResultLink> links() {
        return this.links;
    }
    /**
     * @return Version of MongoDB that the serverless instance runs, in `&lt;major version&gt;`.`&lt;minor version&gt;` format.
     * 
     */
    public String mongoDbVersion() {
        return this.mongoDbVersion;
    }
    /**
     * @return (Required) Human-readable label that identifies your serverless instance.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Unique identifier for the [project](https://docs.atlas.mongodb.com/organizations-projects/#std-label-projects) that contains the specified cluster.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Cloud service provider on which MongoDB Cloud provisioned the serverless instance.
     * 
     */
    public String providerSettingsBackingProviderName() {
        return this.providerSettingsBackingProviderName;
    }
    /**
     * @return Cloud service provider that applies to the provisioned the serverless instance.
     * 
     */
    public String providerSettingsProviderName() {
        return this.providerSettingsProviderName;
    }
    /**
     * @return Human-readable label that identifies the physical location of your MongoDB serverless instance. The region you choose can affect network latency for clients accessing your databases.
     * 
     */
    public String providerSettingsRegionName() {
        return this.providerSettingsRegionName;
    }
    /**
     * @return Stage of deployment of this serverless instance when the resource made its request.
     * 
     */
    public String stateName() {
        return this.stateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerlessInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionStringsStandardSrv;
        private String createDate;
        private String id;
        private List<GetServerlessInstancesResultLink> links;
        private String mongoDbVersion;
        private String name;
        private String projectId;
        private String providerSettingsBackingProviderName;
        private String providerSettingsProviderName;
        private String providerSettingsRegionName;
        private String stateName;
        public Builder() {}
        public Builder(GetServerlessInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionStringsStandardSrv = defaults.connectionStringsStandardSrv;
    	      this.createDate = defaults.createDate;
    	      this.id = defaults.id;
    	      this.links = defaults.links;
    	      this.mongoDbVersion = defaults.mongoDbVersion;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.providerSettingsBackingProviderName = defaults.providerSettingsBackingProviderName;
    	      this.providerSettingsProviderName = defaults.providerSettingsProviderName;
    	      this.providerSettingsRegionName = defaults.providerSettingsRegionName;
    	      this.stateName = defaults.stateName;
        }

        @CustomType.Setter
        public Builder connectionStringsStandardSrv(String connectionStringsStandardSrv) {
            this.connectionStringsStandardSrv = Objects.requireNonNull(connectionStringsStandardSrv);
            return this;
        }
        @CustomType.Setter
        public Builder createDate(String createDate) {
            this.createDate = Objects.requireNonNull(createDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder links(List<GetServerlessInstancesResultLink> links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }
        public Builder links(GetServerlessInstancesResultLink... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder mongoDbVersion(String mongoDbVersion) {
            this.mongoDbVersion = Objects.requireNonNull(mongoDbVersion);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder providerSettingsBackingProviderName(String providerSettingsBackingProviderName) {
            this.providerSettingsBackingProviderName = Objects.requireNonNull(providerSettingsBackingProviderName);
            return this;
        }
        @CustomType.Setter
        public Builder providerSettingsProviderName(String providerSettingsProviderName) {
            this.providerSettingsProviderName = Objects.requireNonNull(providerSettingsProviderName);
            return this;
        }
        @CustomType.Setter
        public Builder providerSettingsRegionName(String providerSettingsRegionName) {
            this.providerSettingsRegionName = Objects.requireNonNull(providerSettingsRegionName);
            return this;
        }
        @CustomType.Setter
        public Builder stateName(String stateName) {
            this.stateName = Objects.requireNonNull(stateName);
            return this;
        }
        public GetServerlessInstancesResult build() {
            final var o = new GetServerlessInstancesResult();
            o.connectionStringsStandardSrv = connectionStringsStandardSrv;
            o.createDate = createDate;
            o.id = id;
            o.links = links;
            o.mongoDbVersion = mongoDbVersion;
            o.name = name;
            o.projectId = projectId;
            o.providerSettingsBackingProviderName = providerSettingsBackingProviderName;
            o.providerSettingsProviderName = providerSettingsProviderName;
            o.providerSettingsRegionName = providerSettingsRegionName;
            o.stateName = stateName;
            return o;
        }
    }
}
