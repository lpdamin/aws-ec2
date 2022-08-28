package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.870Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster")
@software.amazon.jsii.Jsii.Proxy(MskconnectConnectorKafkaClusterApacheKafkaCluster.Jsii$Proxy.class)
public interface MskconnectConnectorKafkaClusterApacheKafkaCluster extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#bootstrap_servers MskconnectConnector#bootstrap_servers}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBootstrapServers();

    /**
     * vpc block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#vpc MskconnectConnector#vpc}
     */
    @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc getVpc();

    /**
     * @return a {@link Builder} of {@link MskconnectConnectorKafkaClusterApacheKafkaCluster}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectConnectorKafkaClusterApacheKafkaCluster}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectConnectorKafkaClusterApacheKafkaCluster> {
        java.lang.String bootstrapServers;
        imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc vpc;

        /**
         * Sets the value of {@link MskconnectConnectorKafkaClusterApacheKafkaCluster#getBootstrapServers}
         * @param bootstrapServers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#bootstrap_servers MskconnectConnector#bootstrap_servers}. This parameter is required.
         * @return {@code this}
         */
        public Builder bootstrapServers(java.lang.String bootstrapServers) {
            this.bootstrapServers = bootstrapServers;
            return this;
        }

        /**
         * Sets the value of {@link MskconnectConnectorKafkaClusterApacheKafkaCluster#getVpc}
         * @param vpc vpc block. This parameter is required.
         *            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_connector#vpc MskconnectConnector#vpc}
         * @return {@code this}
         */
        public Builder vpc(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc vpc) {
            this.vpc = vpc;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectConnectorKafkaClusterApacheKafkaCluster}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectConnectorKafkaClusterApacheKafkaCluster build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectConnectorKafkaClusterApacheKafkaCluster}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectConnectorKafkaClusterApacheKafkaCluster {
        private final java.lang.String bootstrapServers;
        private final imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc vpc;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.bootstrapServers = software.amazon.jsii.Kernel.get(this, "bootstrapServers", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpc = software.amazon.jsii.Kernel.get(this, "vpc", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.bootstrapServers = java.util.Objects.requireNonNull(builder.bootstrapServers, "bootstrapServers is required");
            this.vpc = java.util.Objects.requireNonNull(builder.vpc, "vpc is required");
        }

        @Override
        public final java.lang.String getBootstrapServers() {
            return this.bootstrapServers;
        }

        @Override
        public final imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterVpc getVpc() {
            return this.vpc;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("bootstrapServers", om.valueToTree(this.getBootstrapServers()));
            data.set("vpc", om.valueToTree(this.getVpc()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectConnectorKafkaClusterApacheKafkaCluster.Jsii$Proxy that = (MskconnectConnectorKafkaClusterApacheKafkaCluster.Jsii$Proxy) o;

            if (!bootstrapServers.equals(that.bootstrapServers)) return false;
            return this.vpc.equals(that.vpc);
        }

        @Override
        public final int hashCode() {
            int result = this.bootstrapServers.hashCode();
            result = 31 * result + (this.vpc.hashCode());
            return result;
        }
    }
}
