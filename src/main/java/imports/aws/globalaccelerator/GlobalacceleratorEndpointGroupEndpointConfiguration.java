package imports.aws.globalaccelerator;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.233Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.globalaccelerator.GlobalacceleratorEndpointGroupEndpointConfiguration")
@software.amazon.jsii.Jsii.Proxy(GlobalacceleratorEndpointGroupEndpointConfiguration.Jsii$Proxy.class)
public interface GlobalacceleratorEndpointGroupEndpointConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#client_ip_preservation_enabled GlobalacceleratorEndpointGroup#client_ip_preservation_enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getClientIpPreservationEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#endpoint_id GlobalacceleratorEndpointGroup#endpoint_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEndpointId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#weight GlobalacceleratorEndpointGroup#weight}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getWeight() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link GlobalacceleratorEndpointGroupEndpointConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GlobalacceleratorEndpointGroupEndpointConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GlobalacceleratorEndpointGroupEndpointConfiguration> {
        java.lang.Object clientIpPreservationEnabled;
        java.lang.String endpointId;
        java.lang.Number weight;

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupEndpointConfiguration#getClientIpPreservationEnabled}
         * @param clientIpPreservationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#client_ip_preservation_enabled GlobalacceleratorEndpointGroup#client_ip_preservation_enabled}.
         * @return {@code this}
         */
        public Builder clientIpPreservationEnabled(java.lang.Boolean clientIpPreservationEnabled) {
            this.clientIpPreservationEnabled = clientIpPreservationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupEndpointConfiguration#getClientIpPreservationEnabled}
         * @param clientIpPreservationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#client_ip_preservation_enabled GlobalacceleratorEndpointGroup#client_ip_preservation_enabled}.
         * @return {@code this}
         */
        public Builder clientIpPreservationEnabled(com.hashicorp.cdktf.IResolvable clientIpPreservationEnabled) {
            this.clientIpPreservationEnabled = clientIpPreservationEnabled;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupEndpointConfiguration#getEndpointId}
         * @param endpointId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#endpoint_id GlobalacceleratorEndpointGroup#endpoint_id}.
         * @return {@code this}
         */
        public Builder endpointId(java.lang.String endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        /**
         * Sets the value of {@link GlobalacceleratorEndpointGroupEndpointConfiguration#getWeight}
         * @param weight Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#weight GlobalacceleratorEndpointGroup#weight}.
         * @return {@code this}
         */
        public Builder weight(java.lang.Number weight) {
            this.weight = weight;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GlobalacceleratorEndpointGroupEndpointConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GlobalacceleratorEndpointGroupEndpointConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GlobalacceleratorEndpointGroupEndpointConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GlobalacceleratorEndpointGroupEndpointConfiguration {
        private final java.lang.Object clientIpPreservationEnabled;
        private final java.lang.String endpointId;
        private final java.lang.Number weight;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientIpPreservationEnabled = software.amazon.jsii.Kernel.get(this, "clientIpPreservationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.endpointId = software.amazon.jsii.Kernel.get(this, "endpointId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.weight = software.amazon.jsii.Kernel.get(this, "weight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientIpPreservationEnabled = builder.clientIpPreservationEnabled;
            this.endpointId = builder.endpointId;
            this.weight = builder.weight;
        }

        @Override
        public final java.lang.Object getClientIpPreservationEnabled() {
            return this.clientIpPreservationEnabled;
        }

        @Override
        public final java.lang.String getEndpointId() {
            return this.endpointId;
        }

        @Override
        public final java.lang.Number getWeight() {
            return this.weight;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getClientIpPreservationEnabled() != null) {
                data.set("clientIpPreservationEnabled", om.valueToTree(this.getClientIpPreservationEnabled()));
            }
            if (this.getEndpointId() != null) {
                data.set("endpointId", om.valueToTree(this.getEndpointId()));
            }
            if (this.getWeight() != null) {
                data.set("weight", om.valueToTree(this.getWeight()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.globalaccelerator.GlobalacceleratorEndpointGroupEndpointConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GlobalacceleratorEndpointGroupEndpointConfiguration.Jsii$Proxy that = (GlobalacceleratorEndpointGroupEndpointConfiguration.Jsii$Proxy) o;

            if (this.clientIpPreservationEnabled != null ? !this.clientIpPreservationEnabled.equals(that.clientIpPreservationEnabled) : that.clientIpPreservationEnabled != null) return false;
            if (this.endpointId != null ? !this.endpointId.equals(that.endpointId) : that.endpointId != null) return false;
            return this.weight != null ? this.weight.equals(that.weight) : that.weight == null;
        }

        @Override
        public final int hashCode() {
            int result = this.clientIpPreservationEnabled != null ? this.clientIpPreservationEnabled.hashCode() : 0;
            result = 31 * result + (this.endpointId != null ? this.endpointId.hashCode() : 0);
            result = 31 * result + (this.weight != null ? this.weight.hashCode() : 0);
            return result;
        }
    }
}
