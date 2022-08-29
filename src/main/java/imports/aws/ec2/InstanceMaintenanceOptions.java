package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.814Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.InstanceMaintenanceOptions")
@software.amazon.jsii.Jsii.Proxy(InstanceMaintenanceOptions.Jsii$Proxy.class)
public interface InstanceMaintenanceOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/instance#auto_recovery Instance#auto_recovery}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAutoRecovery() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link InstanceMaintenanceOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link InstanceMaintenanceOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<InstanceMaintenanceOptions> {
        java.lang.String autoRecovery;

        /**
         * Sets the value of {@link InstanceMaintenanceOptions#getAutoRecovery}
         * @param autoRecovery Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/instance#auto_recovery Instance#auto_recovery}.
         * @return {@code this}
         */
        public Builder autoRecovery(java.lang.String autoRecovery) {
            this.autoRecovery = autoRecovery;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link InstanceMaintenanceOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public InstanceMaintenanceOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link InstanceMaintenanceOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements InstanceMaintenanceOptions {
        private final java.lang.String autoRecovery;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.autoRecovery = software.amazon.jsii.Kernel.get(this, "autoRecovery", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.autoRecovery = builder.autoRecovery;
        }

        @Override
        public final java.lang.String getAutoRecovery() {
            return this.autoRecovery;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAutoRecovery() != null) {
                data.set("autoRecovery", om.valueToTree(this.getAutoRecovery()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.InstanceMaintenanceOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            InstanceMaintenanceOptions.Jsii$Proxy that = (InstanceMaintenanceOptions.Jsii$Proxy) o;

            return this.autoRecovery != null ? this.autoRecovery.equals(that.autoRecovery) : that.autoRecovery == null;
        }

        @Override
        public final int hashCode() {
            int result = this.autoRecovery != null ? this.autoRecovery.hashCode() : 0;
            return result;
        }
    }
}
