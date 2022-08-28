package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.828Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput")
@software.amazon.jsii.Jsii.Proxy(MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput.Jsii$Proxy.class)
public interface MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enabled MskCluster#enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#volume_throughput MskCluster#volume_throughput}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getVolumeThroughput() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput> {
        java.lang.Object enabled;
        java.lang.Number volumeThroughput;

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enabled MskCluster#enabled}.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#enabled MskCluster#enabled}.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput#getVolumeThroughput}
         * @param volumeThroughput Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/msk_cluster#volume_throughput MskCluster#volume_throughput}.
         * @return {@code this}
         */
        public Builder volumeThroughput(java.lang.Number volumeThroughput) {
            this.volumeThroughput = volumeThroughput;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput {
        private final java.lang.Object enabled;
        private final java.lang.Number volumeThroughput;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.volumeThroughput = software.amazon.jsii.Kernel.get(this, "volumeThroughput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = builder.enabled;
            this.volumeThroughput = builder.volumeThroughput;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Number getVolumeThroughput() {
            return this.volumeThroughput;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getVolumeThroughput() != null) {
                data.set("volumeThroughput", om.valueToTree(this.getVolumeThroughput()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput.Jsii$Proxy that = (MskClusterBrokerNodeGroupInfoStorageInfoEbsStorageInfoProvisionedThroughput.Jsii$Proxy) o;

            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            return this.volumeThroughput != null ? this.volumeThroughput.equals(that.volumeThroughput) : that.volumeThroughput == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled != null ? this.enabled.hashCode() : 0;
            result = 31 * result + (this.volumeThroughput != null ? this.volumeThroughput.hashCode() : 0);
            return result;
        }
    }
}
