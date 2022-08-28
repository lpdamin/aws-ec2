package imports.aws.codeartifact;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.429Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codeartifact.CodeartifactRepositoryUpstream")
@software.amazon.jsii.Jsii.Proxy(CodeartifactRepositoryUpstream.Jsii$Proxy.class)
public interface CodeartifactRepositoryUpstream extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_repository#repository_name CodeartifactRepository#repository_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRepositoryName();

    /**
     * @return a {@link Builder} of {@link CodeartifactRepositoryUpstream}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodeartifactRepositoryUpstream}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodeartifactRepositoryUpstream> {
        java.lang.String repositoryName;

        /**
         * Sets the value of {@link CodeartifactRepositoryUpstream#getRepositoryName}
         * @param repositoryName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codeartifact_repository#repository_name CodeartifactRepository#repository_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder repositoryName(java.lang.String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodeartifactRepositoryUpstream}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodeartifactRepositoryUpstream build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CodeartifactRepositoryUpstream}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodeartifactRepositoryUpstream {
        private final java.lang.String repositoryName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.repositoryName = software.amazon.jsii.Kernel.get(this, "repositoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.repositoryName = java.util.Objects.requireNonNull(builder.repositoryName, "repositoryName is required");
        }

        @Override
        public final java.lang.String getRepositoryName() {
            return this.repositoryName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("repositoryName", om.valueToTree(this.getRepositoryName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.codeartifact.CodeartifactRepositoryUpstream"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeartifactRepositoryUpstream.Jsii$Proxy that = (CodeartifactRepositoryUpstream.Jsii$Proxy) o;

            return this.repositoryName.equals(that.repositoryName);
        }

        @Override
        public final int hashCode() {
            int result = this.repositoryName.hashCode();
            return result;
        }
    }
}
