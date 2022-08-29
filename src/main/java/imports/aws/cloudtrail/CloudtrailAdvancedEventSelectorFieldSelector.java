package imports.aws.cloudtrail;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.042Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudtrail.CloudtrailAdvancedEventSelectorFieldSelector")
@software.amazon.jsii.Jsii.Proxy(CloudtrailAdvancedEventSelectorFieldSelector.Jsii$Proxy.class)
public interface CloudtrailAdvancedEventSelectorFieldSelector extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#field Cloudtrail#field}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getField();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#ends_with Cloudtrail#ends_with}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEndsWith() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#equals Cloudtrail#equals}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getEqualTo() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#not_ends_with Cloudtrail#not_ends_with}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotEndsWith() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#not_equals Cloudtrail#not_equals}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotEquals() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#not_starts_with Cloudtrail#not_starts_with}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getNotStartsWith() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#starts_with Cloudtrail#starts_with}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getStartsWith() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CloudtrailAdvancedEventSelectorFieldSelector}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudtrailAdvancedEventSelectorFieldSelector}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudtrailAdvancedEventSelectorFieldSelector> {
        java.lang.String field;
        java.util.List<java.lang.String> endsWith;
        java.util.List<java.lang.String> equalTo;
        java.util.List<java.lang.String> notEndsWith;
        java.util.List<java.lang.String> notEquals;
        java.util.List<java.lang.String> notStartsWith;
        java.util.List<java.lang.String> startsWith;

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getField}
         * @param field Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#field Cloudtrail#field}. This parameter is required.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getEndsWith}
         * @param endsWith Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#ends_with Cloudtrail#ends_with}.
         * @return {@code this}
         */
        public Builder endsWith(java.util.List<java.lang.String> endsWith) {
            this.endsWith = endsWith;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getEqualTo}
         * @param equalTo Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#equals Cloudtrail#equals}.
         * @return {@code this}
         */
        public Builder equalTo(java.util.List<java.lang.String> equalTo) {
            this.equalTo = equalTo;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getNotEndsWith}
         * @param notEndsWith Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#not_ends_with Cloudtrail#not_ends_with}.
         * @return {@code this}
         */
        public Builder notEndsWith(java.util.List<java.lang.String> notEndsWith) {
            this.notEndsWith = notEndsWith;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getNotEquals}
         * @param notEquals Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#not_equals Cloudtrail#not_equals}.
         * @return {@code this}
         */
        public Builder notEquals(java.util.List<java.lang.String> notEquals) {
            this.notEquals = notEquals;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getNotStartsWith}
         * @param notStartsWith Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#not_starts_with Cloudtrail#not_starts_with}.
         * @return {@code this}
         */
        public Builder notStartsWith(java.util.List<java.lang.String> notStartsWith) {
            this.notStartsWith = notStartsWith;
            return this;
        }

        /**
         * Sets the value of {@link CloudtrailAdvancedEventSelectorFieldSelector#getStartsWith}
         * @param startsWith Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudtrail#starts_with Cloudtrail#starts_with}.
         * @return {@code this}
         */
        public Builder startsWith(java.util.List<java.lang.String> startsWith) {
            this.startsWith = startsWith;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudtrailAdvancedEventSelectorFieldSelector}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudtrailAdvancedEventSelectorFieldSelector build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudtrailAdvancedEventSelectorFieldSelector}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudtrailAdvancedEventSelectorFieldSelector {
        private final java.lang.String field;
        private final java.util.List<java.lang.String> endsWith;
        private final java.util.List<java.lang.String> equalTo;
        private final java.util.List<java.lang.String> notEndsWith;
        private final java.util.List<java.lang.String> notEquals;
        private final java.util.List<java.lang.String> notStartsWith;
        private final java.util.List<java.lang.String> startsWith;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endsWith = software.amazon.jsii.Kernel.get(this, "endsWith", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.equalTo = software.amazon.jsii.Kernel.get(this, "equalTo", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.notEndsWith = software.amazon.jsii.Kernel.get(this, "notEndsWith", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.notEquals = software.amazon.jsii.Kernel.get(this, "notEquals", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.notStartsWith = software.amazon.jsii.Kernel.get(this, "notStartsWith", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.startsWith = software.amazon.jsii.Kernel.get(this, "startsWith", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.field = java.util.Objects.requireNonNull(builder.field, "field is required");
            this.endsWith = builder.endsWith;
            this.equalTo = builder.equalTo;
            this.notEndsWith = builder.notEndsWith;
            this.notEquals = builder.notEquals;
            this.notStartsWith = builder.notStartsWith;
            this.startsWith = builder.startsWith;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.util.List<java.lang.String> getEndsWith() {
            return this.endsWith;
        }

        @Override
        public final java.util.List<java.lang.String> getEqualTo() {
            return this.equalTo;
        }

        @Override
        public final java.util.List<java.lang.String> getNotEndsWith() {
            return this.notEndsWith;
        }

        @Override
        public final java.util.List<java.lang.String> getNotEquals() {
            return this.notEquals;
        }

        @Override
        public final java.util.List<java.lang.String> getNotStartsWith() {
            return this.notStartsWith;
        }

        @Override
        public final java.util.List<java.lang.String> getStartsWith() {
            return this.startsWith;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("field", om.valueToTree(this.getField()));
            if (this.getEndsWith() != null) {
                data.set("endsWith", om.valueToTree(this.getEndsWith()));
            }
            if (this.getEqualTo() != null) {
                data.set("equalTo", om.valueToTree(this.getEqualTo()));
            }
            if (this.getNotEndsWith() != null) {
                data.set("notEndsWith", om.valueToTree(this.getNotEndsWith()));
            }
            if (this.getNotEquals() != null) {
                data.set("notEquals", om.valueToTree(this.getNotEquals()));
            }
            if (this.getNotStartsWith() != null) {
                data.set("notStartsWith", om.valueToTree(this.getNotStartsWith()));
            }
            if (this.getStartsWith() != null) {
                data.set("startsWith", om.valueToTree(this.getStartsWith()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.cloudtrail.CloudtrailAdvancedEventSelectorFieldSelector"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudtrailAdvancedEventSelectorFieldSelector.Jsii$Proxy that = (CloudtrailAdvancedEventSelectorFieldSelector.Jsii$Proxy) o;

            if (!field.equals(that.field)) return false;
            if (this.endsWith != null ? !this.endsWith.equals(that.endsWith) : that.endsWith != null) return false;
            if (this.equalTo != null ? !this.equalTo.equals(that.equalTo) : that.equalTo != null) return false;
            if (this.notEndsWith != null ? !this.notEndsWith.equals(that.notEndsWith) : that.notEndsWith != null) return false;
            if (this.notEquals != null ? !this.notEquals.equals(that.notEquals) : that.notEquals != null) return false;
            if (this.notStartsWith != null ? !this.notStartsWith.equals(that.notStartsWith) : that.notStartsWith != null) return false;
            return this.startsWith != null ? this.startsWith.equals(that.startsWith) : that.startsWith == null;
        }

        @Override
        public final int hashCode() {
            int result = this.field.hashCode();
            result = 31 * result + (this.endsWith != null ? this.endsWith.hashCode() : 0);
            result = 31 * result + (this.equalTo != null ? this.equalTo.hashCode() : 0);
            result = 31 * result + (this.notEndsWith != null ? this.notEndsWith.hashCode() : 0);
            result = 31 * result + (this.notEquals != null ? this.notEquals.hashCode() : 0);
            result = 31 * result + (this.notStartsWith != null ? this.notStartsWith.hashCode() : 0);
            result = 31 * result + (this.startsWith != null ? this.startsWith.hashCode() : 0);
            return result;
        }
    }
}
