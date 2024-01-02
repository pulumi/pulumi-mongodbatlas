// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mongodbatlas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOnlineArchiveSchedule {
    private @Nullable Integer dayOfMonth;
    private @Nullable Integer dayOfWeek;
    private Integer endHour;
    private Integer endMinute;
    private Integer startHour;
    private Integer startMinute;
    private String type;

    private GetOnlineArchiveSchedule() {}
    public Optional<Integer> dayOfMonth() {
        return Optional.ofNullable(this.dayOfMonth);
    }
    public Optional<Integer> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    public Integer endHour() {
        return this.endHour;
    }
    public Integer endMinute() {
        return this.endMinute;
    }
    public Integer startHour() {
        return this.startHour;
    }
    public Integer startMinute() {
        return this.startMinute;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOnlineArchiveSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer dayOfMonth;
        private @Nullable Integer dayOfWeek;
        private Integer endHour;
        private Integer endMinute;
        private Integer startHour;
        private Integer startMinute;
        private String type;
        public Builder() {}
        public Builder(GetOnlineArchiveSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfMonth = defaults.dayOfMonth;
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.endHour = defaults.endHour;
    	      this.endMinute = defaults.endMinute;
    	      this.startHour = defaults.startHour;
    	      this.startMinute = defaults.startMinute;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder dayOfMonth(@Nullable Integer dayOfMonth) {

            this.dayOfMonth = dayOfMonth;
            return this;
        }
        @CustomType.Setter
        public Builder dayOfWeek(@Nullable Integer dayOfWeek) {

            this.dayOfWeek = dayOfWeek;
            return this;
        }
        @CustomType.Setter
        public Builder endHour(Integer endHour) {
            if (endHour == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchiveSchedule", "endHour");
            }
            this.endHour = endHour;
            return this;
        }
        @CustomType.Setter
        public Builder endMinute(Integer endMinute) {
            if (endMinute == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchiveSchedule", "endMinute");
            }
            this.endMinute = endMinute;
            return this;
        }
        @CustomType.Setter
        public Builder startHour(Integer startHour) {
            if (startHour == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchiveSchedule", "startHour");
            }
            this.startHour = startHour;
            return this;
        }
        @CustomType.Setter
        public Builder startMinute(Integer startMinute) {
            if (startMinute == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchiveSchedule", "startMinute");
            }
            this.startMinute = startMinute;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetOnlineArchiveSchedule", "type");
            }
            this.type = type;
            return this;
        }
        public GetOnlineArchiveSchedule build() {
            final var _resultValue = new GetOnlineArchiveSchedule();
            _resultValue.dayOfMonth = dayOfMonth;
            _resultValue.dayOfWeek = dayOfWeek;
            _resultValue.endHour = endHour;
            _resultValue.endMinute = endMinute;
            _resultValue.startHour = startHour;
            _resultValue.startMinute = startMinute;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
