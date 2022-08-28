package imports.aws.vpc;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.999Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.NetworkmanagerVpcAttachmentOptions")
@software.amazon.jsii.Jsii.Proxy(NetworkmanagerVpcAttachmentOptions.Jsii$Proxy.class)
public interface NetworkmanagerVpcAttachmentOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#ipv6_support NetworkmanagerVpcAttachment#ipv6_support}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getIpv6Support();

    /**
     * @return a {@link Builder} of {@link NetworkmanagerVpcAttachmentOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkmanagerVpcAttachmentOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkmanagerVpcAttachmentOptions> {
        java.lang.Object ipv6Support;

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentOptions#getIpv6Support}
         * @param ipv6Support Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#ipv6_support NetworkmanagerVpcAttachment#ipv6_support}. This parameter is required.
         * @return {@code this}
         */
        public Builder ipv6Support(java.lang.Boolean ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentOptions#getIpv6Support}
         * @param ipv6Support Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#ipv6_support NetworkmanagerVpcAttachment#ipv6_support}. This parameter is required.
         * @return {@code this}
         */
        public Builder ipv6Support(com.hashicorp.cdktf.IResolvable ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkmanagerVpcAttachmentOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkmanagerVpcAttachmentOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkmanagerVpcAttachmentOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkmanagerVpcAttachmentOptions {
        private final java.lang.Object ipv6Support;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ipv6Support = software.amazon.jsii.Kernel.get(this, "ipv6Support", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ipv6Support = java.util.Objects.requireNonNull(builder.ipv6Support, "ipv6Support is required");
        }

        @Override
        public final java.lang.Object getIpv6Support() {
            return this.ipv6Support;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("ipv6Support", om.valueToTree(this.getIpv6Support()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.NetworkmanagerVpcAttachmentOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkmanagerVpcAttachmentOptions.Jsii$Proxy that = (NetworkmanagerVpcAttachmentOptions.Jsii$Proxy) o;

            return this.ipv6Support.equals(that.ipv6Support);
        }

        @Override
        public final int hashCode() {
            int result = this.ipv6Support.hashCode();
            return result;
        }
    }
}
