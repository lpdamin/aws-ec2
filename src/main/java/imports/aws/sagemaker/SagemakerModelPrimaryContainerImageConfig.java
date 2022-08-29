package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.522Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerImageConfig")
@software.amazon.jsii.Jsii.Proxy(SagemakerModelPrimaryContainerImageConfig.Jsii$Proxy.class)
public interface SagemakerModelPrimaryContainerImageConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#repository_access_mode SagemakerModel#repository_access_mode}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRepositoryAccessMode();

    /**
     * repository_auth_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#repository_auth_config SagemakerModel#repository_auth_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig getRepositoryAuthConfig() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerModelPrimaryContainerImageConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerModelPrimaryContainerImageConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerModelPrimaryContainerImageConfig> {
        java.lang.String repositoryAccessMode;
        imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig repositoryAuthConfig;

        /**
         * Sets the value of {@link SagemakerModelPrimaryContainerImageConfig#getRepositoryAccessMode}
         * @param repositoryAccessMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#repository_access_mode SagemakerModel#repository_access_mode}. This parameter is required.
         * @return {@code this}
         */
        public Builder repositoryAccessMode(java.lang.String repositoryAccessMode) {
            this.repositoryAccessMode = repositoryAccessMode;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelPrimaryContainerImageConfig#getRepositoryAuthConfig}
         * @param repositoryAuthConfig repository_auth_config block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#repository_auth_config SagemakerModel#repository_auth_config}
         * @return {@code this}
         */
        public Builder repositoryAuthConfig(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig repositoryAuthConfig) {
            this.repositoryAuthConfig = repositoryAuthConfig;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerModelPrimaryContainerImageConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerModelPrimaryContainerImageConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerModelPrimaryContainerImageConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerModelPrimaryContainerImageConfig {
        private final java.lang.String repositoryAccessMode;
        private final imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig repositoryAuthConfig;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.repositoryAccessMode = software.amazon.jsii.Kernel.get(this, "repositoryAccessMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.repositoryAuthConfig = software.amazon.jsii.Kernel.get(this, "repositoryAuthConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.repositoryAccessMode = java.util.Objects.requireNonNull(builder.repositoryAccessMode, "repositoryAccessMode is required");
            this.repositoryAuthConfig = builder.repositoryAuthConfig;
        }

        @Override
        public final java.lang.String getRepositoryAccessMode() {
            return this.repositoryAccessMode;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerModelPrimaryContainerImageConfigRepositoryAuthConfig getRepositoryAuthConfig() {
            return this.repositoryAuthConfig;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("repositoryAccessMode", om.valueToTree(this.getRepositoryAccessMode()));
            if (this.getRepositoryAuthConfig() != null) {
                data.set("repositoryAuthConfig", om.valueToTree(this.getRepositoryAuthConfig()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerModelPrimaryContainerImageConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerModelPrimaryContainerImageConfig.Jsii$Proxy that = (SagemakerModelPrimaryContainerImageConfig.Jsii$Proxy) o;

            if (!repositoryAccessMode.equals(that.repositoryAccessMode)) return false;
            return this.repositoryAuthConfig != null ? this.repositoryAuthConfig.equals(that.repositoryAuthConfig) : that.repositoryAuthConfig == null;
        }

        @Override
        public final int hashCode() {
            int result = this.repositoryAccessMode.hashCode();
            result = 31 * result + (this.repositoryAuthConfig != null ? this.repositoryAuthConfig.hashCode() : 0);
            return result;
        }
    }
}
