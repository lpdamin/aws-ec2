package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:56.532Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecLogging")
@software.amazon.jsii.Jsii.Proxy(AppmeshVirtualGatewaySpecLogging.Jsii$Proxy.class)
public interface AppmeshVirtualGatewaySpecLogging extends software.amazon.jsii.JsiiSerializable {

    /**
     * access_log block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#access_log AppmeshVirtualGateway#access_log}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog getAccessLog() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshVirtualGatewaySpecLogging}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshVirtualGatewaySpecLogging}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshVirtualGatewaySpecLogging> {
        imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog accessLog;

        /**
         * Sets the value of {@link AppmeshVirtualGatewaySpecLogging#getAccessLog}
         * @param accessLog access_log block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_virtual_gateway#access_log AppmeshVirtualGateway#access_log}
         * @return {@code this}
         */
        public Builder accessLog(imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog accessLog) {
            this.accessLog = accessLog;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshVirtualGatewaySpecLogging}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshVirtualGatewaySpecLogging build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshVirtualGatewaySpecLogging}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshVirtualGatewaySpecLogging {
        private final imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog accessLog;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessLog = software.amazon.jsii.Kernel.get(this, "accessLog", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessLog = builder.accessLog;
        }

        @Override
        public final imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog getAccessLog() {
            return this.accessLog;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessLog() != null) {
                data.set("accessLog", om.valueToTree(this.getAccessLog()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecLogging"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshVirtualGatewaySpecLogging.Jsii$Proxy that = (AppmeshVirtualGatewaySpecLogging.Jsii$Proxy) o;

            return this.accessLog != null ? this.accessLog.equals(that.accessLog) : that.accessLog == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessLog != null ? this.accessLog.hashCode() : 0;
            return result;
        }
    }
}
