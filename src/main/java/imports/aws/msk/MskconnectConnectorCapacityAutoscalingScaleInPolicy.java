package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.863Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorCapacityAutoscalingScaleInPolicy")
@software.amazon.jsii.Jsii.Proxy(MskconnectConnectorCapacityAutoscalingScaleInPolicy.Jsii$Proxy.class)
public interface MskconnectConnectorCapacityAutoscalingScaleInPolicy extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#cpu_utilization_percentage MskconnectConnector#cpu_utilization_percentage}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCpuUtilizationPercentage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskconnectConnectorCapacityAutoscalingScaleInPolicy}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectConnectorCapacityAutoscalingScaleInPolicy}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectConnectorCapacityAutoscalingScaleInPolicy> {
        java.lang.Number cpuUtilizationPercentage;

        /**
         * Sets the value of {@link MskconnectConnectorCapacityAutoscalingScaleInPolicy#getCpuUtilizationPercentage}
         * @param cpuUtilizationPercentage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#cpu_utilization_percentage MskconnectConnector#cpu_utilization_percentage}.
         * @return {@code this}
         */
        public Builder cpuUtilizationPercentage(java.lang.Number cpuUtilizationPercentage) {
            this.cpuUtilizationPercentage = cpuUtilizationPercentage;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectConnectorCapacityAutoscalingScaleInPolicy}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectConnectorCapacityAutoscalingScaleInPolicy build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectConnectorCapacityAutoscalingScaleInPolicy}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectConnectorCapacityAutoscalingScaleInPolicy {
        private final java.lang.Number cpuUtilizationPercentage;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cpuUtilizationPercentage = software.amazon.jsii.Kernel.get(this, "cpuUtilizationPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cpuUtilizationPercentage = builder.cpuUtilizationPercentage;
        }

        @Override
        public final java.lang.Number getCpuUtilizationPercentage() {
            return this.cpuUtilizationPercentage;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCpuUtilizationPercentage() != null) {
                data.set("cpuUtilizationPercentage", om.valueToTree(this.getCpuUtilizationPercentage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectConnectorCapacityAutoscalingScaleInPolicy"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectConnectorCapacityAutoscalingScaleInPolicy.Jsii$Proxy that = (MskconnectConnectorCapacityAutoscalingScaleInPolicy.Jsii$Proxy) o;

            return this.cpuUtilizationPercentage != null ? this.cpuUtilizationPercentage.equals(that.cpuUtilizationPercentage) : that.cpuUtilizationPercentage == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cpuUtilizationPercentage != null ? this.cpuUtilizationPercentage.hashCode() : 0;
            return result;
        }
    }
}
