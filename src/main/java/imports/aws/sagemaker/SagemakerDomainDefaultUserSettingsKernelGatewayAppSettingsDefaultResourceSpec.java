package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.498Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec")
@software.amazon.jsii.Jsii.Proxy(SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec.Jsii$Proxy.class)
public interface SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#instance_type SagemakerDomain#instance_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#lifecycle_config_arn SagemakerDomain#lifecycle_config_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLifecycleConfigArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#sagemaker_image_arn SagemakerDomain#sagemaker_image_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSagemakerImageArn() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#sagemaker_image_version_arn SagemakerDomain#sagemaker_image_version_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSagemakerImageVersionArn() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec> {
        java.lang.String instanceType;
        java.lang.String lifecycleConfigArn;
        java.lang.String sagemakerImageArn;
        java.lang.String sagemakerImageVersionArn;

        /**
         * Sets the value of {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec#getInstanceType}
         * @param instanceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#instance_type SagemakerDomain#instance_type}.
         * @return {@code this}
         */
        public Builder instanceType(java.lang.String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec#getLifecycleConfigArn}
         * @param lifecycleConfigArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#lifecycle_config_arn SagemakerDomain#lifecycle_config_arn}.
         * @return {@code this}
         */
        public Builder lifecycleConfigArn(java.lang.String lifecycleConfigArn) {
            this.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec#getSagemakerImageArn}
         * @param sagemakerImageArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#sagemaker_image_arn SagemakerDomain#sagemaker_image_arn}.
         * @return {@code this}
         */
        public Builder sagemakerImageArn(java.lang.String sagemakerImageArn) {
            this.sagemakerImageArn = sagemakerImageArn;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec#getSagemakerImageVersionArn}
         * @param sagemakerImageVersionArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_domain#sagemaker_image_version_arn SagemakerDomain#sagemaker_image_version_arn}.
         * @return {@code this}
         */
        public Builder sagemakerImageVersionArn(java.lang.String sagemakerImageVersionArn) {
            this.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec {
        private final java.lang.String instanceType;
        private final java.lang.String lifecycleConfigArn;
        private final java.lang.String sagemakerImageArn;
        private final java.lang.String sagemakerImageVersionArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.instanceType = software.amazon.jsii.Kernel.get(this, "instanceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lifecycleConfigArn = software.amazon.jsii.Kernel.get(this, "lifecycleConfigArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sagemakerImageArn = software.amazon.jsii.Kernel.get(this, "sagemakerImageArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sagemakerImageVersionArn = software.amazon.jsii.Kernel.get(this, "sagemakerImageVersionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceType = builder.instanceType;
            this.lifecycleConfigArn = builder.lifecycleConfigArn;
            this.sagemakerImageArn = builder.sagemakerImageArn;
            this.sagemakerImageVersionArn = builder.sagemakerImageVersionArn;
        }

        @Override
        public final java.lang.String getInstanceType() {
            return this.instanceType;
        }

        @Override
        public final java.lang.String getLifecycleConfigArn() {
            return this.lifecycleConfigArn;
        }

        @Override
        public final java.lang.String getSagemakerImageArn() {
            return this.sagemakerImageArn;
        }

        @Override
        public final java.lang.String getSagemakerImageVersionArn() {
            return this.sagemakerImageVersionArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getInstanceType() != null) {
                data.set("instanceType", om.valueToTree(this.getInstanceType()));
            }
            if (this.getLifecycleConfigArn() != null) {
                data.set("lifecycleConfigArn", om.valueToTree(this.getLifecycleConfigArn()));
            }
            if (this.getSagemakerImageArn() != null) {
                data.set("sagemakerImageArn", om.valueToTree(this.getSagemakerImageArn()));
            }
            if (this.getSagemakerImageVersionArn() != null) {
                data.set("sagemakerImageVersionArn", om.valueToTree(this.getSagemakerImageVersionArn()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec.Jsii$Proxy that = (SagemakerDomainDefaultUserSettingsKernelGatewayAppSettingsDefaultResourceSpec.Jsii$Proxy) o;

            if (this.instanceType != null ? !this.instanceType.equals(that.instanceType) : that.instanceType != null) return false;
            if (this.lifecycleConfigArn != null ? !this.lifecycleConfigArn.equals(that.lifecycleConfigArn) : that.lifecycleConfigArn != null) return false;
            if (this.sagemakerImageArn != null ? !this.sagemakerImageArn.equals(that.sagemakerImageArn) : that.sagemakerImageArn != null) return false;
            return this.sagemakerImageVersionArn != null ? this.sagemakerImageVersionArn.equals(that.sagemakerImageVersionArn) : that.sagemakerImageVersionArn == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceType != null ? this.instanceType.hashCode() : 0;
            result = 31 * result + (this.lifecycleConfigArn != null ? this.lifecycleConfigArn.hashCode() : 0);
            result = 31 * result + (this.sagemakerImageArn != null ? this.sagemakerImageArn.hashCode() : 0);
            result = 31 * result + (this.sagemakerImageVersionArn != null ? this.sagemakerImageVersionArn.hashCode() : 0);
            return result;
        }
    }
}
