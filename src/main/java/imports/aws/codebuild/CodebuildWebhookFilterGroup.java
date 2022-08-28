package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.503Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildWebhookFilterGroup")
@software.amazon.jsii.Jsii.Proxy(CodebuildWebhookFilterGroup.Jsii$Proxy.class)
public interface CodebuildWebhookFilterGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * filter block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#filter CodebuildWebhook#filter}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getFilter() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildWebhookFilterGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildWebhookFilterGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildWebhookFilterGroup> {
        java.lang.Object filter;

        /**
         * Sets the value of {@link CodebuildWebhookFilterGroup#getFilter}
         * @param filter filter block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#filter CodebuildWebhook#filter}
         * @return {@code this}
         */
        public Builder filter(com.hashicorp.cdktf.IResolvable filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildWebhookFilterGroup#getFilter}
         * @param filter filter block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_webhook#filter CodebuildWebhook#filter}
         * @return {@code this}
         */
        public Builder filter(java.util.List<? extends imports.aws.codebuild.CodebuildWebhookFilterGroupFilter> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildWebhookFilterGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildWebhookFilterGroup build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CodebuildWebhookFilterGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildWebhookFilterGroup {
        private final java.lang.Object filter;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = builder.filter;
        }

        @Override
        public final java.lang.Object getFilter() {
            return this.filter;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getFilter() != null) {
                data.set("filter", om.valueToTree(this.getFilter()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.codebuild.CodebuildWebhookFilterGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildWebhookFilterGroup.Jsii$Proxy that = (CodebuildWebhookFilterGroup.Jsii$Proxy) o;

            return this.filter != null ? this.filter.equals(that.filter) : that.filter == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filter != null ? this.filter.hashCode() : 0;
            return result;
        }
    }
}
