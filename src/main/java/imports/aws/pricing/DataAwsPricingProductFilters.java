package imports.aws.pricing;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.174Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.pricing.DataAwsPricingProductFilters")
@software.amazon.jsii.Jsii.Proxy(DataAwsPricingProductFilters.Jsii$Proxy.class)
public interface DataAwsPricingProductFilters extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/pricing_product#field DataAwsPricingProduct#field}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getField();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/pricing_product#value DataAwsPricingProduct#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * @return a {@link Builder} of {@link DataAwsPricingProductFilters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsPricingProductFilters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsPricingProductFilters> {
        java.lang.String field;
        java.lang.String value;

        /**
         * Sets the value of {@link DataAwsPricingProductFilters#getField}
         * @param field Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/pricing_product#field DataAwsPricingProduct#field}. This parameter is required.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsPricingProductFilters#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/pricing_product#value DataAwsPricingProduct#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsPricingProductFilters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsPricingProductFilters build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsPricingProductFilters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsPricingProductFilters {
        private final java.lang.String field;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.field = java.util.Objects.requireNonNull(builder.field, "field is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("field", om.valueToTree(this.getField()));
            data.set("value", om.valueToTree(this.getValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.pricing.DataAwsPricingProductFilters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsPricingProductFilters.Jsii$Proxy that = (DataAwsPricingProductFilters.Jsii$Proxy) o;

            if (!field.equals(that.field)) return false;
            return this.value.equals(that.value);
        }

        @Override
        public final int hashCode() {
            int result = this.field.hashCode();
            result = 31 * result + (this.value.hashCode());
            return result;
        }
    }
}
