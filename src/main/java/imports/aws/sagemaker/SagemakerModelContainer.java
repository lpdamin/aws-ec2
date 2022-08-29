package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.520Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerModelContainer")
@software.amazon.jsii.Jsii.Proxy(SagemakerModelContainer.Jsii$Proxy.class)
public interface SagemakerModelContainer extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#image SagemakerModel#image}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getImage();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#container_hostname SagemakerModel#container_hostname}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getContainerHostname() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#environment SagemakerModel#environment}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getEnvironment() {
        return null;
    }

    /**
     * image_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#image_config SagemakerModel#image_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerModelContainerImageConfig getImageConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#mode SagemakerModel#mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMode() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#model_data_url SagemakerModel#model_data_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getModelDataUrl() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerModelContainer}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerModelContainer}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerModelContainer> {
        java.lang.String image;
        java.lang.String containerHostname;
        java.util.Map<java.lang.String, java.lang.String> environment;
        imports.aws.sagemaker.SagemakerModelContainerImageConfig imageConfig;
        java.lang.String mode;
        java.lang.String modelDataUrl;

        /**
         * Sets the value of {@link SagemakerModelContainer#getImage}
         * @param image Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#image SagemakerModel#image}. This parameter is required.
         * @return {@code this}
         */
        public Builder image(java.lang.String image) {
            this.image = image;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelContainer#getContainerHostname}
         * @param containerHostname Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#container_hostname SagemakerModel#container_hostname}.
         * @return {@code this}
         */
        public Builder containerHostname(java.lang.String containerHostname) {
            this.containerHostname = containerHostname;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelContainer#getEnvironment}
         * @param environment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#environment SagemakerModel#environment}.
         * @return {@code this}
         */
        public Builder environment(java.util.Map<java.lang.String, java.lang.String> environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelContainer#getImageConfig}
         * @param imageConfig image_config block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#image_config SagemakerModel#image_config}
         * @return {@code this}
         */
        public Builder imageConfig(imports.aws.sagemaker.SagemakerModelContainerImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelContainer#getMode}
         * @param mode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#mode SagemakerModel#mode}.
         * @return {@code this}
         */
        public Builder mode(java.lang.String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerModelContainer#getModelDataUrl}
         * @param modelDataUrl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_model#model_data_url SagemakerModel#model_data_url}.
         * @return {@code this}
         */
        public Builder modelDataUrl(java.lang.String modelDataUrl) {
            this.modelDataUrl = modelDataUrl;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerModelContainer}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerModelContainer build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerModelContainer}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerModelContainer {
        private final java.lang.String image;
        private final java.lang.String containerHostname;
        private final java.util.Map<java.lang.String, java.lang.String> environment;
        private final imports.aws.sagemaker.SagemakerModelContainerImageConfig imageConfig;
        private final java.lang.String mode;
        private final java.lang.String modelDataUrl;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.image = software.amazon.jsii.Kernel.get(this, "image", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.containerHostname = software.amazon.jsii.Kernel.get(this, "containerHostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environment = software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.imageConfig = software.amazon.jsii.Kernel.get(this, "imageConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerModelContainerImageConfig.class));
            this.mode = software.amazon.jsii.Kernel.get(this, "mode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.modelDataUrl = software.amazon.jsii.Kernel.get(this, "modelDataUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.image = java.util.Objects.requireNonNull(builder.image, "image is required");
            this.containerHostname = builder.containerHostname;
            this.environment = builder.environment;
            this.imageConfig = builder.imageConfig;
            this.mode = builder.mode;
            this.modelDataUrl = builder.modelDataUrl;
        }

        @Override
        public final java.lang.String getImage() {
            return this.image;
        }

        @Override
        public final java.lang.String getContainerHostname() {
            return this.containerHostname;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getEnvironment() {
            return this.environment;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerModelContainerImageConfig getImageConfig() {
            return this.imageConfig;
        }

        @Override
        public final java.lang.String getMode() {
            return this.mode;
        }

        @Override
        public final java.lang.String getModelDataUrl() {
            return this.modelDataUrl;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("image", om.valueToTree(this.getImage()));
            if (this.getContainerHostname() != null) {
                data.set("containerHostname", om.valueToTree(this.getContainerHostname()));
            }
            if (this.getEnvironment() != null) {
                data.set("environment", om.valueToTree(this.getEnvironment()));
            }
            if (this.getImageConfig() != null) {
                data.set("imageConfig", om.valueToTree(this.getImageConfig()));
            }
            if (this.getMode() != null) {
                data.set("mode", om.valueToTree(this.getMode()));
            }
            if (this.getModelDataUrl() != null) {
                data.set("modelDataUrl", om.valueToTree(this.getModelDataUrl()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerModelContainer"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerModelContainer.Jsii$Proxy that = (SagemakerModelContainer.Jsii$Proxy) o;

            if (!image.equals(that.image)) return false;
            if (this.containerHostname != null ? !this.containerHostname.equals(that.containerHostname) : that.containerHostname != null) return false;
            if (this.environment != null ? !this.environment.equals(that.environment) : that.environment != null) return false;
            if (this.imageConfig != null ? !this.imageConfig.equals(that.imageConfig) : that.imageConfig != null) return false;
            if (this.mode != null ? !this.mode.equals(that.mode) : that.mode != null) return false;
            return this.modelDataUrl != null ? this.modelDataUrl.equals(that.modelDataUrl) : that.modelDataUrl == null;
        }

        @Override
        public final int hashCode() {
            int result = this.image.hashCode();
            result = 31 * result + (this.containerHostname != null ? this.containerHostname.hashCode() : 0);
            result = 31 * result + (this.environment != null ? this.environment.hashCode() : 0);
            result = 31 * result + (this.imageConfig != null ? this.imageConfig.hashCode() : 0);
            result = 31 * result + (this.mode != null ? this.mode.hashCode() : 0);
            result = 31 * result + (this.modelDataUrl != null ? this.modelDataUrl.hashCode() : 0);
            return result;
        }
    }
}
