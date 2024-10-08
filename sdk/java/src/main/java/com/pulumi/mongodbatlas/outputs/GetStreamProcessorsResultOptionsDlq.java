// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetStreamProcessorsResultOptionsDlq {
    /**
     * @return Name of the collection to use for the DLQ.
     * 
     */
    private String coll;
    /**
     * @return Name of the connection to write DLQ messages to. Must be an Atlas connection.
     * 
     */
    private String connectionName;
    /**
     * @return Name of the database to use for the DLQ.
     * 
     */
    private String db;

    private GetStreamProcessorsResultOptionsDlq() {}
    /**
     * @return Name of the collection to use for the DLQ.
     * 
     */
    public String coll() {
        return this.coll;
    }
    /**
     * @return Name of the connection to write DLQ messages to. Must be an Atlas connection.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }
    /**
     * @return Name of the database to use for the DLQ.
     * 
     */
    public String db() {
        return this.db;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamProcessorsResultOptionsDlq defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String coll;
        private String connectionName;
        private String db;
        public Builder() {}
        public Builder(GetStreamProcessorsResultOptionsDlq defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coll = defaults.coll;
    	      this.connectionName = defaults.connectionName;
    	      this.db = defaults.db;
        }

        @CustomType.Setter
        public Builder coll(String coll) {
            if (coll == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResultOptionsDlq", "coll");
            }
            this.coll = coll;
            return this;
        }
        @CustomType.Setter
        public Builder connectionName(String connectionName) {
            if (connectionName == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResultOptionsDlq", "connectionName");
            }
            this.connectionName = connectionName;
            return this;
        }
        @CustomType.Setter
        public Builder db(String db) {
            if (db == null) {
              throw new MissingRequiredPropertyException("GetStreamProcessorsResultOptionsDlq", "db");
            }
            this.db = db;
            return this;
        }
        public GetStreamProcessorsResultOptionsDlq build() {
            final var _resultValue = new GetStreamProcessorsResultOptionsDlq();
            _resultValue.coll = coll;
            _resultValue.connectionName = connectionName;
            _resultValue.db = db;
            return _resultValue;
        }
    }
}
