package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.099Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildProjectSecondarySourcesAuth")
@software.amazon.jsii.Jsii.Proxy(CodebuildProjectSecondarySourcesAuth.Jsii$Proxy.class)
public interface CodebuildProjectSecondarySourcesAuth extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#type CodebuildProject#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#resource CodebuildProject#resource}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildProjectSecondarySourcesAuth}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildProjectSecondarySourcesAuth}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildProjectSecondarySourcesAuth> {
        java.lang.String type;
        java.lang.String resource;

        /**
         * Sets the value of {@link CodebuildProjectSecondarySourcesAuth#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#type CodebuildProject#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildProjectSecondarySourcesAuth#getResource}
         * @param resource Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_project#resource CodebuildProject#resource}.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildProjectSecondarySourcesAuth}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildProjectSecondarySourcesAuth build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CodebuildProjectSecondarySourcesAuth}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildProjectSecondarySourcesAuth {
        private final java.lang.String type;
        private final java.lang.String resource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.resource = builder.resource;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.codebuild.CodebuildProjectSecondarySourcesAuth"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildProjectSecondarySourcesAuth.Jsii$Proxy that = (CodebuildProjectSecondarySourcesAuth.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.resource != null ? this.resource.equals(that.resource) : that.resource == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            return result;
        }
    }
}
