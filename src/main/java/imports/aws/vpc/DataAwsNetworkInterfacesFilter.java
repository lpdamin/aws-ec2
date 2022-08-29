package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.854Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.DataAwsNetworkInterfacesFilter")
@software.amazon.jsii.Jsii.Proxy(DataAwsNetworkInterfacesFilter.Jsii$Proxy.class)
public interface DataAwsNetworkInterfacesFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/network_interfaces#name DataAwsNetworkInterfaces#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/network_interfaces#values DataAwsNetworkInterfaces#values}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getValues();

    /**
     * @return a {@link Builder} of {@link DataAwsNetworkInterfacesFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsNetworkInterfacesFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsNetworkInterfacesFilter> {
        java.lang.String name;
        java.util.List<java.lang.String> values;

        /**
         * Sets the value of {@link DataAwsNetworkInterfacesFilter#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/network_interfaces#name DataAwsNetworkInterfaces#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsNetworkInterfacesFilter#getValues}
         * @param values Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/network_interfaces#values DataAwsNetworkInterfaces#values}. This parameter is required.
         * @return {@code this}
         */
        public Builder values(java.util.List<java.lang.String> values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsNetworkInterfacesFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsNetworkInterfacesFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsNetworkInterfacesFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsNetworkInterfacesFilter {
        private final java.lang.String name;
        private final java.util.List<java.lang.String> values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.values = java.util.Objects.requireNonNull(builder.values, "values is required");
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("values", om.valueToTree(this.getValues()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.DataAwsNetworkInterfacesFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsNetworkInterfacesFilter.Jsii$Proxy that = (DataAwsNetworkInterfacesFilter.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            return this.values.equals(that.values);
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.values.hashCode());
            return result;
        }
    }
}
