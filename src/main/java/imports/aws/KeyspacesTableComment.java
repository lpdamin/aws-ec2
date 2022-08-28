package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.808Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KeyspacesTableComment")
@software.amazon.jsii.Jsii.Proxy(KeyspacesTableComment.Jsii$Proxy.class)
public interface KeyspacesTableComment extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#message KeyspacesTable#message}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessage() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KeyspacesTableComment}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KeyspacesTableComment}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KeyspacesTableComment> {
        java.lang.String message;

        /**
         * Sets the value of {@link KeyspacesTableComment#getMessage}
         * @param message Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#message KeyspacesTable#message}.
         * @return {@code this}
         */
        public Builder message(java.lang.String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KeyspacesTableComment}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KeyspacesTableComment build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KeyspacesTableComment}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KeyspacesTableComment {
        private final java.lang.String message;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.message = software.amazon.jsii.Kernel.get(this, "message", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.message = builder.message;
        }

        @Override
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMessage() != null) {
                data.set("message", om.valueToTree(this.getMessage()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.KeyspacesTableComment"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KeyspacesTableComment.Jsii$Proxy that = (KeyspacesTableComment.Jsii$Proxy) o;

            return this.message != null ? this.message.equals(that.message) : that.message == null;
        }

        @Override
        public final int hashCode() {
            int result = this.message != null ? this.message.hashCode() : 0;
            return result;
        }
    }
}
