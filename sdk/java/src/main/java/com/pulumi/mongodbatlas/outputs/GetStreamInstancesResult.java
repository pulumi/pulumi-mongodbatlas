// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetStreamInstancesResultDataProcessRegion;
import com.pulumi.mongodbatlas.outputs.GetStreamInstancesResultStreamConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetStreamInstancesResult {
    /**
     * @return Defines the cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
     * 
     */
    private GetStreamInstancesResultDataProcessRegion dataProcessRegion;
    /**
     * @return List that contains the hostnames assigned to the stream instance.
     * 
     */
    private List<String> hostnames;
    private String id;
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    private String instanceName;
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    private String projectId;
    /**
     * @return Defines the configuration options for an Atlas Stream Processing Instance. See stream config
     * 
     */
    private GetStreamInstancesResultStreamConfig streamConfig;

    private GetStreamInstancesResult() {}
    /**
     * @return Defines the cloud service provider and region where MongoDB Cloud performs stream processing. See data process region.
     * 
     */
    public GetStreamInstancesResultDataProcessRegion dataProcessRegion() {
        return this.dataProcessRegion;
    }
    /**
     * @return List that contains the hostnames assigned to the stream instance.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Human-readable label that identifies the stream instance.
     * 
     */
    public String instanceName() {
        return this.instanceName;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies your project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Defines the configuration options for an Atlas Stream Processing Instance. See stream config
     * 
     */
    public GetStreamInstancesResultStreamConfig streamConfig() {
        return this.streamConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamInstancesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetStreamInstancesResultDataProcessRegion dataProcessRegion;
        private List<String> hostnames;
        private String id;
        private String instanceName;
        private String projectId;
        private GetStreamInstancesResultStreamConfig streamConfig;
        public Builder() {}
        public Builder(GetStreamInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataProcessRegion = defaults.dataProcessRegion;
    	      this.hostnames = defaults.hostnames;
    	      this.id = defaults.id;
    	      this.instanceName = defaults.instanceName;
    	      this.projectId = defaults.projectId;
    	      this.streamConfig = defaults.streamConfig;
        }

        @CustomType.Setter
        public Builder dataProcessRegion(GetStreamInstancesResultDataProcessRegion dataProcessRegion) {
            if (dataProcessRegion == null) {
              throw new MissingRequiredPropertyException("GetStreamInstancesResult", "dataProcessRegion");
            }
            this.dataProcessRegion = dataProcessRegion;
            return this;
        }
        @CustomType.Setter
        public Builder hostnames(List<String> hostnames) {
            if (hostnames == null) {
              throw new MissingRequiredPropertyException("GetStreamInstancesResult", "hostnames");
            }
            this.hostnames = hostnames;
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetStreamInstancesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceName(String instanceName) {
            if (instanceName == null) {
              throw new MissingRequiredPropertyException("GetStreamInstancesResult", "instanceName");
            }
            this.instanceName = instanceName;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetStreamInstancesResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder streamConfig(GetStreamInstancesResultStreamConfig streamConfig) {
            if (streamConfig == null) {
              throw new MissingRequiredPropertyException("GetStreamInstancesResult", "streamConfig");
            }
            this.streamConfig = streamConfig;
            return this;
        }
        public GetStreamInstancesResult build() {
            final var _resultValue = new GetStreamInstancesResult();
            _resultValue.dataProcessRegion = dataProcessRegion;
            _resultValue.hostnames = hostnames;
            _resultValue.id = id;
            _resultValue.instanceName = instanceName;
            _resultValue.projectId = projectId;
            _resultValue.streamConfig = streamConfig;
            return _resultValue;
        }
    }
}
