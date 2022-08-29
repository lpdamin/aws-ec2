package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.315Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KeyspacesTablePointInTimeRecovery")
@software.amazon.jsii.Jsii.Proxy(KeyspacesTablePointInTimeRecovery.Jsii$Proxy.class)
public interface KeyspacesTablePointInTimeRecovery extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#status KeyspacesTable#status}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStatus() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KeyspacesTablePointInTimeRecovery}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KeyspacesTablePointInTimeRecovery}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KeyspacesTablePointInTimeRecovery> {
        java.lang.String status;

        /**
         * Sets the value of {@link KeyspacesTablePointInTimeRecovery#getStatus}
         * @param status Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/keyspaces_table#status KeyspacesTable#status}.
         * @return {@code this}
         */
        public Builder status(java.lang.String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KeyspacesTablePointInTimeRecovery}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KeyspacesTablePointInTimeRecovery build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link KeyspacesTablePointInTimeRecovery}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KeyspacesTablePointInTimeRecovery {
        private final java.lang.String status;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.status = software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.status = builder.status;
        }

        @Override
        public final java.lang.String getStatus() {
            return this.status;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getStatus() != null) {
                data.set("status", om.valueToTree(this.getStatus()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.KeyspacesTablePointInTimeRecovery"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KeyspacesTablePointInTimeRecovery.Jsii$Proxy that = (KeyspacesTablePointInTimeRecovery.Jsii$Proxy) o;

            return this.status != null ? this.status.equals(that.status) : that.status == null;
        }

        @Override
        public final int hashCode() {
            int result = this.status != null ? this.status.hashCode() : 0;
            return result;
        }
    }
}
