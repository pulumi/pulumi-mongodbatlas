// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.CustomDbRoleActionResource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CustomDbRoleAction {
    /**
     * @return Name of the privilege action. For a complete list of actions available in the Atlas API, see [Custom Role Actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions)
     * &gt; **Note**: The privilege actions available to the Custom Roles API resource represent a subset of the privilege actions available in the Atlas Custom Roles UI.
     * 
     */
    private String action;
    /**
     * @return Contains information on where the action is granted. Each object in the array either indicates a database and collection on which the action is granted, or indicates that the action is granted on the cluster resource.
     * 
     * * `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     * * `resources.#.database_name`	Database on which the action is granted.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     * * `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
     * 
     */
    private List<CustomDbRoleActionResource> resources;

    private CustomDbRoleAction() {}
    /**
     * @return Name of the privilege action. For a complete list of actions available in the Atlas API, see [Custom Role Actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions)
     * &gt; **Note**: The privilege actions available to the Custom Roles API resource represent a subset of the privilege actions available in the Atlas Custom Roles UI.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Contains information on where the action is granted. Each object in the array either indicates a database and collection on which the action is granted, or indicates that the action is granted on the cluster resource.
     * 
     * * `resources.#.collection_name` - (Optional) Collection on which the action is granted. If this value is an empty string, the action is granted on all collections within the database specified in the actions.resources.db field.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     * * `resources.#.database_name`	Database on which the action is granted.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.cluster` field.
     * 
     * * `resources.#.cluster`	(Optional) Set to true to indicate that the action is granted on the cluster resource.
     * 
     * &gt; **NOTE** This field is mutually exclusive with the `actions.resources.collection` and `actions.resources.db fields`.
     * 
     */
    public List<CustomDbRoleActionResource> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDbRoleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<CustomDbRoleActionResource> resources;
        public Builder() {}
        public Builder(CustomDbRoleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("CustomDbRoleAction", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<CustomDbRoleActionResource> resources) {
            if (resources == null) {
              throw new MissingRequiredPropertyException("CustomDbRoleAction", "resources");
            }
            this.resources = resources;
            return this;
        }
        public Builder resources(CustomDbRoleActionResource... resources) {
            return resources(List.of(resources));
        }
        public CustomDbRoleAction build() {
            final var _resultValue = new CustomDbRoleAction();
            _resultValue.action = action;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}