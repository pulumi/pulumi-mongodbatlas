// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.mongodbatlas.outputs.GetAtlasUsersResultLink;
import com.pulumi.mongodbatlas.outputs.GetAtlasUsersResultRole;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAtlasUsersResult {
    /**
     * @return Two alphabet characters that identifies MongoDB Cloud user&#39;s geographic location. This parameter uses the ISO 3166-1a2 code format.
     * 
     */
    private String country;
    /**
     * @return Date and time when the current account is created. This value is in the ISO 8601 timestamp format in UTC.
     * 
     */
    private String createdAt;
    /**
     * @return Email address that belongs to the MongoDB Atlas user.
     * 
     */
    private String emailAddress;
    /**
     * @return First or given name that belongs to the MongoDB Atlas user.
     * 
     */
    private String firstName;
    private String id;
    /**
     * @return Date and time when the current account last authenticated. This value is in the ISO 8601 timestamp format in UTC.
     * 
     */
    private String lastAuth;
    /**
     * @return Last name, family name, or surname that belongs to the MongoDB Atlas user.
     * 
     */
    private String lastName;
    private List<GetAtlasUsersResultLink> links;
    /**
     * @return Mobile phone number that belongs to the MongoDB Atlas user.
     * 
     */
    private String mobileNumber;
    private List<GetAtlasUsersResultRole> roles;
    /**
     * @return List of unique 24-hexadecimal digit strings that identifies the teams to which this MongoDB Atlas user belongs.
     * * `links.#.href` - Uniform Resource Locator (URL) that points another API resource to which this response has some relationship. This URL often begins with https://cloud.mongodb.com/api/atlas.
     * * `links.#.rel` - Uniform Resource Locator (URL) that defines the semantic relationship between this resource and another API resource. This URL often begins with https://cloud.mongodb.com/api/atlas.
     * * `roles.#.group_id` - Unique 24-hexadecimal digit string that identifies the project to which this role belongs. You can set a value for this parameter or orgId but not both in the same request.
     * * `roles.#.org_id` - Unique 24-hexadecimal digit string that identifies the organization to which this role belongs. You can set a value for this parameter or groupId but not both in the same request.
     * * `roles.#.role_name` - Human-readable label that identifies the collection of privileges that MongoDB Atlas grants a specific API key, user, or team. These roles include organization- and project-level roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#service-user-roles) describes the valid roles that can be assigned.
     * 
     */
    private List<String> teamIds;
    /**
     * @return Unique 24-hexadecimal digit string that identifies this user.
     * 
     */
    private String userId;
    /**
     * @return Email address that belongs to the MongoDB Atlas user account. You cannot modify this address after creating the user.
     * 
     */
    private String username;

    private GetAtlasUsersResult() {}
    /**
     * @return Two alphabet characters that identifies MongoDB Cloud user&#39;s geographic location. This parameter uses the ISO 3166-1a2 code format.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return Date and time when the current account is created. This value is in the ISO 8601 timestamp format in UTC.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Email address that belongs to the MongoDB Atlas user.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return First or given name that belongs to the MongoDB Atlas user.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Date and time when the current account last authenticated. This value is in the ISO 8601 timestamp format in UTC.
     * 
     */
    public String lastAuth() {
        return this.lastAuth;
    }
    /**
     * @return Last name, family name, or surname that belongs to the MongoDB Atlas user.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    public List<GetAtlasUsersResultLink> links() {
        return this.links;
    }
    /**
     * @return Mobile phone number that belongs to the MongoDB Atlas user.
     * 
     */
    public String mobileNumber() {
        return this.mobileNumber;
    }
    public List<GetAtlasUsersResultRole> roles() {
        return this.roles;
    }
    /**
     * @return List of unique 24-hexadecimal digit strings that identifies the teams to which this MongoDB Atlas user belongs.
     * * `links.#.href` - Uniform Resource Locator (URL) that points another API resource to which this response has some relationship. This URL often begins with https://cloud.mongodb.com/api/atlas.
     * * `links.#.rel` - Uniform Resource Locator (URL) that defines the semantic relationship between this resource and another API resource. This URL often begins with https://cloud.mongodb.com/api/atlas.
     * * `roles.#.group_id` - Unique 24-hexadecimal digit string that identifies the project to which this role belongs. You can set a value for this parameter or orgId but not both in the same request.
     * * `roles.#.org_id` - Unique 24-hexadecimal digit string that identifies the organization to which this role belongs. You can set a value for this parameter or groupId but not both in the same request.
     * * `roles.#.role_name` - Human-readable label that identifies the collection of privileges that MongoDB Atlas grants a specific API key, user, or team. These roles include organization- and project-level roles. The [MongoDB Documentation](https://www.mongodb.com/docs/atlas/reference/user-roles/#service-user-roles) describes the valid roles that can be assigned.
     * 
     */
    public List<String> teamIds() {
        return this.teamIds;
    }
    /**
     * @return Unique 24-hexadecimal digit string that identifies this user.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return Email address that belongs to the MongoDB Atlas user account. You cannot modify this address after creating the user.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAtlasUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String country;
        private String createdAt;
        private String emailAddress;
        private String firstName;
        private String id;
        private String lastAuth;
        private String lastName;
        private List<GetAtlasUsersResultLink> links;
        private String mobileNumber;
        private List<GetAtlasUsersResultRole> roles;
        private List<String> teamIds;
        private String userId;
        private String username;
        public Builder() {}
        public Builder(GetAtlasUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.country = defaults.country;
    	      this.createdAt = defaults.createdAt;
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastAuth = defaults.lastAuth;
    	      this.lastName = defaults.lastName;
    	      this.links = defaults.links;
    	      this.mobileNumber = defaults.mobileNumber;
    	      this.roles = defaults.roles;
    	      this.teamIds = defaults.teamIds;
    	      this.userId = defaults.userId;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder country(String country) {
            if (country == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "country");
            }
            this.country = country;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder emailAddress(String emailAddress) {
            if (emailAddress == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "emailAddress");
            }
            this.emailAddress = emailAddress;
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            if (firstName == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "firstName");
            }
            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastAuth(String lastAuth) {
            if (lastAuth == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "lastAuth");
            }
            this.lastAuth = lastAuth;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            if (lastName == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "lastName");
            }
            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder links(List<GetAtlasUsersResultLink> links) {
            if (links == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "links");
            }
            this.links = links;
            return this;
        }
        public Builder links(GetAtlasUsersResultLink... links) {
            return links(List.of(links));
        }
        @CustomType.Setter
        public Builder mobileNumber(String mobileNumber) {
            if (mobileNumber == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "mobileNumber");
            }
            this.mobileNumber = mobileNumber;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<GetAtlasUsersResultRole> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(GetAtlasUsersResultRole... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder teamIds(List<String> teamIds) {
            if (teamIds == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "teamIds");
            }
            this.teamIds = teamIds;
            return this;
        }
        public Builder teamIds(String... teamIds) {
            return teamIds(List.of(teamIds));
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "userId");
            }
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetAtlasUsersResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetAtlasUsersResult build() {
            final var _resultValue = new GetAtlasUsersResult();
            _resultValue.country = country;
            _resultValue.createdAt = createdAt;
            _resultValue.emailAddress = emailAddress;
            _resultValue.firstName = firstName;
            _resultValue.id = id;
            _resultValue.lastAuth = lastAuth;
            _resultValue.lastName = lastName;
            _resultValue.links = links;
            _resultValue.mobileNumber = mobileNumber;
            _resultValue.roles = roles;
            _resultValue.teamIds = teamIds;
            _resultValue.userId = userId;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
