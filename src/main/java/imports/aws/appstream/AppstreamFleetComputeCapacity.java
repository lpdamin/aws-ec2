package imports.aws.appstream;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.719Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamFleetComputeCapacity")
@software.amazon.jsii.Jsii.Proxy(AppstreamFleetComputeCapacity.Jsii$Proxy.class)
public interface AppstreamFleetComputeCapacity extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_fleet#desired_instances AppstreamFleet#desired_instances}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getDesiredInstances();

    /**
     * @return a {@link Builder} of {@link AppstreamFleetComputeCapacity}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppstreamFleetComputeCapacity}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppstreamFleetComputeCapacity> {
        java.lang.Number desiredInstances;

        /**
         * Sets the value of {@link AppstreamFleetComputeCapacity#getDesiredInstances}
         * @param desiredInstances Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_fleet#desired_instances AppstreamFleet#desired_instances}. This parameter is required.
         * @return {@code this}
         */
        public Builder desiredInstances(java.lang.Number desiredInstances) {
            this.desiredInstances = desiredInstances;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppstreamFleetComputeCapacity}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppstreamFleetComputeCapacity build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppstreamFleetComputeCapacity}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppstreamFleetComputeCapacity {
        private final java.lang.Number desiredInstances;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.desiredInstances = software.amazon.jsii.Kernel.get(this, "desiredInstances", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.desiredInstances = java.util.Objects.requireNonNull(builder.desiredInstances, "desiredInstances is required");
        }

        @Override
        public final java.lang.Number getDesiredInstances() {
            return this.desiredInstances;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("desiredInstances", om.valueToTree(this.getDesiredInstances()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appstream.AppstreamFleetComputeCapacity"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppstreamFleetComputeCapacity.Jsii$Proxy that = (AppstreamFleetComputeCapacity.Jsii$Proxy) o;

            return this.desiredInstances.equals(that.desiredInstances);
        }

        @Override
        public final int hashCode() {
            int result = this.desiredInstances.hashCode();
            return result;
        }
    }
}
