package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.827Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo")
@software.amazon.jsii.Jsii.Proxy(MskClusterBrokerNodeGroupInfoConnectivityInfo.Jsii$Proxy.class)
public interface MskClusterBrokerNodeGroupInfoConnectivityInfo extends software.amazon.jsii.JsiiSerializable {

    /**
     * public_access block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#public_access MskCluster#public_access}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess getPublicAccess() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MskClusterBrokerNodeGroupInfoConnectivityInfo}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskClusterBrokerNodeGroupInfoConnectivityInfo}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskClusterBrokerNodeGroupInfoConnectivityInfo> {
        imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess publicAccess;

        /**
         * Sets the value of {@link MskClusterBrokerNodeGroupInfoConnectivityInfo#getPublicAccess}
         * @param publicAccess public_access block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/msk_cluster#public_access MskCluster#public_access}
         * @return {@code this}
         */
        public Builder publicAccess(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskClusterBrokerNodeGroupInfoConnectivityInfo}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskClusterBrokerNodeGroupInfoConnectivityInfo build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskClusterBrokerNodeGroupInfoConnectivityInfo}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskClusterBrokerNodeGroupInfoConnectivityInfo {
        private final imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess publicAccess;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.publicAccess = software.amazon.jsii.Kernel.get(this, "publicAccess", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.publicAccess = builder.publicAccess;
        }

        @Override
        public final imports.aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfoPublicAccess getPublicAccess() {
            return this.publicAccess;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getPublicAccess() != null) {
                data.set("publicAccess", om.valueToTree(this.getPublicAccess()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskClusterBrokerNodeGroupInfoConnectivityInfo"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskClusterBrokerNodeGroupInfoConnectivityInfo.Jsii$Proxy that = (MskClusterBrokerNodeGroupInfoConnectivityInfo.Jsii$Proxy) o;

            return this.publicAccess != null ? this.publicAccess.equals(that.publicAccess) : that.publicAccess == null;
        }

        @Override
        public final int hashCode() {
            int result = this.publicAccess != null ? this.publicAccess.hashCode() : 0;
            return result;
        }
    }
}
