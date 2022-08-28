package imports.aws.servicecatalog;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.651Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicecatalog.ServicecatalogProvisionedProductProvisioningParameters")
@software.amazon.jsii.Jsii.Proxy(ServicecatalogProvisionedProductProvisioningParameters.Jsii$Proxy.class)
public interface ServicecatalogProvisionedProductProvisioningParameters extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#key ServicecatalogProvisionedProduct#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#use_previous_value ServicecatalogProvisionedProduct#use_previous_value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUsePreviousValue() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#value ServicecatalogProvisionedProduct#value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ServicecatalogProvisionedProductProvisioningParameters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ServicecatalogProvisionedProductProvisioningParameters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ServicecatalogProvisionedProductProvisioningParameters> {
        java.lang.String key;
        java.lang.Object usePreviousValue;
        java.lang.String value;

        /**
         * Sets the value of {@link ServicecatalogProvisionedProductProvisioningParameters#getKey}
         * @param key Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#key ServicecatalogProvisionedProduct#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogProvisionedProductProvisioningParameters#getUsePreviousValue}
         * @param usePreviousValue Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#use_previous_value ServicecatalogProvisionedProduct#use_previous_value}.
         * @return {@code this}
         */
        public Builder usePreviousValue(java.lang.Boolean usePreviousValue) {
            this.usePreviousValue = usePreviousValue;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogProvisionedProductProvisioningParameters#getUsePreviousValue}
         * @param usePreviousValue Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#use_previous_value ServicecatalogProvisionedProduct#use_previous_value}.
         * @return {@code this}
         */
        public Builder usePreviousValue(com.hashicorp.cdktf.IResolvable usePreviousValue) {
            this.usePreviousValue = usePreviousValue;
            return this;
        }

        /**
         * Sets the value of {@link ServicecatalogProvisionedProductProvisioningParameters#getValue}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicecatalog_provisioned_product#value ServicecatalogProvisionedProduct#value}.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ServicecatalogProvisionedProductProvisioningParameters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ServicecatalogProvisionedProductProvisioningParameters build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ServicecatalogProvisionedProductProvisioningParameters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ServicecatalogProvisionedProductProvisioningParameters {
        private final java.lang.String key;
        private final java.lang.Object usePreviousValue;
        private final java.lang.String value;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.usePreviousValue = software.amazon.jsii.Kernel.get(this, "usePreviousValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.usePreviousValue = builder.usePreviousValue;
            this.value = builder.value;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.Object getUsePreviousValue() {
            return this.usePreviousValue;
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

            data.set("key", om.valueToTree(this.getKey()));
            if (this.getUsePreviousValue() != null) {
                data.set("usePreviousValue", om.valueToTree(this.getUsePreviousValue()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.servicecatalog.ServicecatalogProvisionedProductProvisioningParameters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ServicecatalogProvisionedProductProvisioningParameters.Jsii$Proxy that = (ServicecatalogProvisionedProductProvisioningParameters.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (this.usePreviousValue != null ? !this.usePreviousValue.equals(that.usePreviousValue) : that.usePreviousValue != null) return false;
            return this.value != null ? this.value.equals(that.value) : that.value == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.usePreviousValue != null ? this.usePreviousValue.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            return result;
        }
    }
}
