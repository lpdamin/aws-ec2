package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.509Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerEndpointConfigurationProductionVariants")
@software.amazon.jsii.Jsii.Proxy(SagemakerEndpointConfigurationProductionVariants.Jsii$Proxy.class)
public interface SagemakerEndpointConfigurationProductionVariants extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#model_name SagemakerEndpointConfiguration#model_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getModelName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#accelerator_type SagemakerEndpointConfiguration#accelerator_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAcceleratorType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#initial_instance_count SagemakerEndpointConfiguration#initial_instance_count}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInitialInstanceCount() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#initial_variant_weight SagemakerEndpointConfiguration#initial_variant_weight}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInitialVariantWeight() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#instance_type SagemakerEndpointConfiguration#instance_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return null;
    }

    /**
     * serverless_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#serverless_config SagemakerEndpointConfiguration#serverless_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig getServerlessConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#variant_name SagemakerEndpointConfiguration#variant_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getVariantName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerEndpointConfigurationProductionVariants}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerEndpointConfigurationProductionVariants}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerEndpointConfigurationProductionVariants> {
        java.lang.String modelName;
        java.lang.String acceleratorType;
        java.lang.Number initialInstanceCount;
        java.lang.Number initialVariantWeight;
        java.lang.String instanceType;
        imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig serverlessConfig;
        java.lang.String variantName;

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getModelName}
         * @param modelName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#model_name SagemakerEndpointConfiguration#model_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder modelName(java.lang.String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getAcceleratorType}
         * @param acceleratorType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#accelerator_type SagemakerEndpointConfiguration#accelerator_type}.
         * @return {@code this}
         */
        public Builder acceleratorType(java.lang.String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getInitialInstanceCount}
         * @param initialInstanceCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#initial_instance_count SagemakerEndpointConfiguration#initial_instance_count}.
         * @return {@code this}
         */
        public Builder initialInstanceCount(java.lang.Number initialInstanceCount) {
            this.initialInstanceCount = initialInstanceCount;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getInitialVariantWeight}
         * @param initialVariantWeight Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#initial_variant_weight SagemakerEndpointConfiguration#initial_variant_weight}.
         * @return {@code this}
         */
        public Builder initialVariantWeight(java.lang.Number initialVariantWeight) {
            this.initialVariantWeight = initialVariantWeight;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getInstanceType}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#instance_type SagemakerEndpointConfiguration#instance_type}.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getServerlessConfig}
         * @param serverlessConfig serverless_config block.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#serverless_config SagemakerEndpointConfiguration#serverless_config}
         * @return {@code this}
         */
        public Builder serverlessConfig(imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig serverlessConfig) {
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerEndpointConfigurationProductionVariants#getVariantName}
         * @param variantName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_endpoint_configuration#variant_name SagemakerEndpointConfiguration#variant_name}.
         * @return {@code this}
         */
        public Builder variantName(java.lang.String variantName) {
            this.variantName = variantName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerEndpointConfigurationProductionVariants}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerEndpointConfigurationProductionVariants build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerEndpointConfigurationProductionVariants}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerEndpointConfigurationProductionVariants {
        private final java.lang.String modelName;
        private final java.lang.String acceleratorType;
        private final java.lang.Number initialInstanceCount;
        private final java.lang.Number initialVariantWeight;
        private final java.lang.String instanceType;
        private final imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig serverlessConfig;
        private final java.lang.String variantName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.modelName = software.amazon.jsii.Kernel.get(this, "modelName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.acceleratorType = software.amazon.jsii.Kernel.get(this, "acceleratorType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.initialInstanceCount = software.amazon.jsii.Kernel.get(this, "initialInstanceCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.initialVariantWeight = software.amazon.jsii.Kernel.get(this, "initialVariantWeight", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serverlessConfig = software.amazon.jsii.Kernel.get(this, "serverlessConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig.class));
            this.variantName = software.amazon.jsii.Kernel.get(this, "variantName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.modelName = java.util.Objects.requireNonNull(builder.modelName, "modelName is required");
            this.acceleratorType = builder.acceleratorType;
            this.initialInstanceCount = builder.initialInstanceCount;
            this.initialVariantWeight = builder.initialVariantWeight;
            this.instanceType = builder.instanceType;
            this.serverlessConfig = builder.serverlessConfig;
            this.variantName = builder.variantName;
        }

        @Override
        public final java.lang.String getModelName() {
            return this.modelName;
        }

        @Override
        public final java.lang.String getAcceleratorType() {
            return this.acceleratorType;
        }

        @Override
        public final java.lang.Number getInitialInstanceCount() {
            return this.initialInstanceCount;
        }

        @Override
        public final java.lang.Number getInitialVariantWeight() {
            return this.initialVariantWeight;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerEndpointConfigurationProductionVariantsServerlessConfig getServerlessConfig() {
            return this.serverlessConfig;
        }

        @Override
        public final java.lang.String getVariantName() {
            return this.variantName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("modelName", om.valueToTree(this.getModelName()));
            if (this.getAcceleratorType() != null) {
                data.set("acceleratorType", om.valueToTree(this.getAcceleratorType()));
            }
            if (this.getInitialInstanceCount() != null) {
                data.set("initialInstanceCount", om.valueToTree(this.getInitialInstanceCount()));
            }
            if (this.getInitialVariantWeight() != null) {
                data.set("initialVariantWeight", om.valueToTree(this.getInitialVariantWeight()));
            }
            if (this.getInstanceType() != null) {
                data.set("instanceType", om.valueToTree(this.getInstanceType()));
            }
            if (this.getServerlessConfig() != null) {
                data.set("serverlessConfig", om.valueToTree(this.getServerlessConfig()));
            }
            if (this.getVariantName() != null) {
                data.set("variantName", om.valueToTree(this.getVariantName()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerEndpointConfigurationProductionVariants"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerEndpointConfigurationProductionVariants.Jsii$Proxy that = (SagemakerEndpointConfigurationProductionVariants.Jsii$Proxy) o;

            if (!modelName.equals(that.modelName)) return false;
            if (this.acceleratorType != null ? !this.acceleratorType.equals(that.acceleratorType) : that.acceleratorType != null) return false;
            if (this.initialInstanceCount != null ? !this.initialInstanceCount.equals(that.initialInstanceCount) : that.initialInstanceCount != null) return false;
            if (this.initialVariantWeight != null ? !this.initialVariantWeight.equals(that.initialVariantWeight) : that.initialVariantWeight != null) return false;
            if (this.instanceType != null ? !this.instanceType.equals(that.instanceType) : that.instanceType != null) return false;
            if (this.serverlessConfig != null ? !this.serverlessConfig.equals(that.serverlessConfig) : that.serverlessConfig != null) return false;
            return this.variantName != null ? this.variantName.equals(that.variantName) : that.variantName == null;
        }

        @Override
        public final int hashCode() {
            int result = this.modelName.hashCode();
            result = 31 * result + (this.acceleratorType != null ? this.acceleratorType.hashCode() : 0);
            result = 31 * result + (this.initialInstanceCount != null ? this.initialInstanceCount.hashCode() : 0);
            result = 31 * result + (this.initialVariantWeight != null ? this.initialVariantWeight.hashCode() : 0);
            result = 31 * result + (this.instanceType != null ? this.instanceType.hashCode() : 0);
            result = 31 * result + (this.serverlessConfig != null ? this.serverlessConfig.hashCode() : 0);
            result = 31 * result + (this.variantName != null ? this.variantName.hashCode() : 0);
            return result;
        }
    }
}
