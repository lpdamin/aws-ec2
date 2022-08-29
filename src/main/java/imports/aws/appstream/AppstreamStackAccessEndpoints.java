package imports.aws.appstream;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.734Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamStackAccessEndpoints")
@software.amazon.jsii.Jsii.Proxy(AppstreamStackAccessEndpoints.Jsii$Proxy.class)
public interface AppstreamStackAccessEndpoints extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_stack#endpoint_type AppstreamStack#endpoint_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getEndpointType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_stack#vpce_id AppstreamStack#vpce_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVpceId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppstreamStackAccessEndpoints}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppstreamStackAccessEndpoints}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppstreamStackAccessEndpoints> {
        java.lang.String endpointType;
        java.lang.String vpceId;

        /**
         * Sets the value of {@link AppstreamStackAccessEndpoints#getEndpointType}
         * @param endpointType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_stack#endpoint_type AppstreamStack#endpoint_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder endpointType(java.lang.String endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Sets the value of {@link AppstreamStackAccessEndpoints#getVpceId}
         * @param vpceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_stack#vpce_id AppstreamStack#vpce_id}.
         * @return {@code this}
         */
        public Builder vpceId(java.lang.String vpceId) {
            this.vpceId = vpceId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppstreamStackAccessEndpoints}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppstreamStackAccessEndpoints build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppstreamStackAccessEndpoints}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppstreamStackAccessEndpoints {
        private final java.lang.String endpointType;
        private final java.lang.String vpceId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.endpointType = software.amazon.jsii.Kernel.get(this, "endpointType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.vpceId = software.amazon.jsii.Kernel.get(this, "vpceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.endpointType = java.util.Objects.requireNonNull(builder.endpointType, "endpointType is required");
            this.vpceId = builder.vpceId;
        }

        @Override
        public final java.lang.String getEndpointType() {
            return this.endpointType;
        }

        @Override
        public final java.lang.String getVpceId() {
            return this.vpceId;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("endpointType", om.valueToTree(this.getEndpointType()));
            if (this.getVpceId() != null) {
                data.set("vpceId", om.valueToTree(this.getVpceId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appstream.AppstreamStackAccessEndpoints"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppstreamStackAccessEndpoints.Jsii$Proxy that = (AppstreamStackAccessEndpoints.Jsii$Proxy) o;

            if (!endpointType.equals(that.endpointType)) return false;
            return this.vpceId != null ? this.vpceId.equals(that.vpceId) : that.vpceId == null;
        }

        @Override
        public final int hashCode() {
            int result = this.endpointType.hashCode();
            result = 31 * result + (this.vpceId != null ? this.vpceId.hashCode() : 0);
            return result;
        }
    }
}
