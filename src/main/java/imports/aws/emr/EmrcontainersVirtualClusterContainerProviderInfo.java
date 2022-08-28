package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.019Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrcontainersVirtualClusterContainerProviderInfo")
@software.amazon.jsii.Jsii.Proxy(EmrcontainersVirtualClusterContainerProviderInfo.Jsii$Proxy.class)
public interface EmrcontainersVirtualClusterContainerProviderInfo extends software.amazon.jsii.JsiiSerializable {

    /**
     * eks_info block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrcontainers_virtual_cluster#eks_info EmrcontainersVirtualCluster#eks_info}
     */
    @org.jetbrains.annotations.NotNull imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo getEksInfo();

    /**
     * @return a {@link Builder} of {@link EmrcontainersVirtualClusterContainerProviderInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrcontainersVirtualClusterContainerProviderInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrcontainersVirtualClusterContainerProviderInfo> {
        imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo eksInfo;

        /**
         * Sets the value of {@link EmrcontainersVirtualClusterContainerProviderInfo#getEksInfo}
         * @param eksInfo eks_info block. This parameter is required.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrcontainers_virtual_cluster#eks_info EmrcontainersVirtualCluster#eks_info}
         * @return {@code this}
         */
        public Builder eksInfo(imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo eksInfo) {
            this.eksInfo = eksInfo;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrcontainersVirtualClusterContainerProviderInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrcontainersVirtualClusterContainerProviderInfo build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EmrcontainersVirtualClusterContainerProviderInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrcontainersVirtualClusterContainerProviderInfo {
        private final imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo eksInfo;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eksInfo = software.amazon.jsii.Kernel.get(this, "eksInfo", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eksInfo = java.util.Objects.requireNonNull(builder.eksInfo, "eksInfo is required");
        }

        @Override
        public final imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo getEksInfo() {
            return this.eksInfo;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("eksInfo", om.valueToTree(this.getEksInfo()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.emr.EmrcontainersVirtualClusterContainerProviderInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrcontainersVirtualClusterContainerProviderInfo.Jsii$Proxy that = (EmrcontainersVirtualClusterContainerProviderInfo.Jsii$Proxy) o;

            return this.eksInfo.equals(that.eksInfo);
        }

        @Override
        public final int hashCode() {
            int result = this.eksInfo.hashCode();
            return result;
        }
    }
}
