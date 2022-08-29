package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.638Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshRouteSpecHttpRouteMatch")
@software.amazon.jsii.Jsii.Proxy(AppmeshRouteSpecHttpRouteMatch.Jsii$Proxy.class)
public interface AppmeshRouteSpecHttpRouteMatch extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#prefix AppmeshRoute#prefix}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPrefix();

    /**
     * header block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#header AppmeshRoute#header}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHeader() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#method AppmeshRoute#method}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMethod() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#scheme AppmeshRoute#scheme}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getScheme() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppmeshRouteSpecHttpRouteMatch}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppmeshRouteSpecHttpRouteMatch}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppmeshRouteSpecHttpRouteMatch> {
        java.lang.String prefix;
        java.lang.Object header;
        java.lang.String method;
        java.lang.String scheme;

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getPrefix}
         * @param prefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#prefix AppmeshRoute#prefix}. This parameter is required.
         * @return {@code this}
         */
        public Builder prefix(java.lang.String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getHeader}
         * @param header header block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#header AppmeshRoute#header}
         * @return {@code this}
         */
        public Builder header(com.hashicorp.cdktf.IResolvable header) {
            this.header = header;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getHeader}
         * @param header header block.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appmesh_route#header AppmeshRoute#header}
         * @return {@code this}
         */
        public Builder header(java.util.List<? extends imports.aws.appmesh.AppmeshRouteSpecHttpRouteMatchHeader> header) {
            this.header = header;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getMethod}
         * @param method Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#method AppmeshRoute#method}.
         * @return {@code this}
         */
        public Builder method(java.lang.String method) {
            this.method = method;
            return this;
        }

        /**
         * Sets the value of {@link AppmeshRouteSpecHttpRouteMatch#getScheme}
         * @param scheme Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appmesh_route#scheme AppmeshRoute#scheme}.
         * @return {@code this}
         */
        public Builder scheme(java.lang.String scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppmeshRouteSpecHttpRouteMatch}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppmeshRouteSpecHttpRouteMatch build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppmeshRouteSpecHttpRouteMatch}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppmeshRouteSpecHttpRouteMatch {
        private final java.lang.String prefix;
        private final java.lang.Object header;
        private final java.lang.String method;
        private final java.lang.String scheme;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.prefix = software.amazon.jsii.Kernel.get(this, "prefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.header = software.amazon.jsii.Kernel.get(this, "header", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.method = software.amazon.jsii.Kernel.get(this, "method", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.scheme = software.amazon.jsii.Kernel.get(this, "scheme", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.prefix = java.util.Objects.requireNonNull(builder.prefix, "prefix is required");
            this.header = builder.header;
            this.method = builder.method;
            this.scheme = builder.scheme;
        }

        @Override
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        @Override
        public final java.lang.Object getHeader() {
            return this.header;
        }

        @Override
        public final java.lang.String getMethod() {
            return this.method;
        }

        @Override
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("prefix", om.valueToTree(this.getPrefix()));
            if (this.getHeader() != null) {
                data.set("header", om.valueToTree(this.getHeader()));
            }
            if (this.getMethod() != null) {
                data.set("method", om.valueToTree(this.getMethod()));
            }
            if (this.getScheme() != null) {
                data.set("scheme", om.valueToTree(this.getScheme()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.appmesh.AppmeshRouteSpecHttpRouteMatch"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppmeshRouteSpecHttpRouteMatch.Jsii$Proxy that = (AppmeshRouteSpecHttpRouteMatch.Jsii$Proxy) o;

            if (!prefix.equals(that.prefix)) return false;
            if (this.header != null ? !this.header.equals(that.header) : that.header != null) return false;
            if (this.method != null ? !this.method.equals(that.method) : that.method != null) return false;
            return this.scheme != null ? this.scheme.equals(that.scheme) : that.scheme == null;
        }

        @Override
        public final int hashCode() {
            int result = this.prefix.hashCode();
            result = 31 * result + (this.header != null ? this.header.hashCode() : 0);
            result = 31 * result + (this.method != null ? this.method.hashCode() : 0);
            result = 31 * result + (this.scheme != null ? this.scheme.hashCode() : 0);
            return result;
        }
    }
}
