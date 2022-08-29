package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.537Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings")
@software.amazon.jsii.Jsii.Proxy(SagemakerUserProfileUserSettingsJupyterServerAppSettings.Jsii$Proxy.class)
public interface SagemakerUserProfileUserSettingsJupyterServerAppSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * default_resource_spec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#default_resource_spec SagemakerUserProfile#default_resource_spec}
     */
    @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec getDefaultResourceSpec();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#lifecycle_config_arns SagemakerUserProfile#lifecycle_config_arns}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLifecycleConfigArns() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerUserProfileUserSettingsJupyterServerAppSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerUserProfileUserSettingsJupyterServerAppSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerUserProfileUserSettingsJupyterServerAppSettings> {
        imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec;
        java.util.List<java.lang.String> lifecycleConfigArns;

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettingsJupyterServerAppSettings#getDefaultResourceSpec}
         * @param defaultResourceSpec default_resource_spec block. This parameter is required.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#default_resource_spec SagemakerUserProfile#default_resource_spec}
         * @return {@code this}
         */
        public Builder defaultResourceSpec(imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettingsJupyterServerAppSettings#getLifecycleConfigArns}
         * @param lifecycleConfigArns Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#lifecycle_config_arns SagemakerUserProfile#lifecycle_config_arns}.
         * @return {@code this}
         */
        public Builder lifecycleConfigArns(java.util.List<java.lang.String> lifecycleConfigArns) {
            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerUserProfileUserSettingsJupyterServerAppSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerUserProfileUserSettingsJupyterServerAppSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerUserProfileUserSettingsJupyterServerAppSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerUserProfileUserSettingsJupyterServerAppSettings {
        private final imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec;
        private final java.util.List<java.lang.String> lifecycleConfigArns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultResourceSpec = software.amazon.jsii.Kernel.get(this, "defaultResourceSpec", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec.class));
            this.lifecycleConfigArns = software.amazon.jsii.Kernel.get(this, "lifecycleConfigArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultResourceSpec = java.util.Objects.requireNonNull(builder.defaultResourceSpec, "defaultResourceSpec is required");
            this.lifecycleConfigArns = builder.lifecycleConfigArns;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec getDefaultResourceSpec() {
            return this.defaultResourceSpec;
        }

        @Override
        public final java.util.List<java.lang.String> getLifecycleConfigArns() {
            return this.lifecycleConfigArns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultResourceSpec", om.valueToTree(this.getDefaultResourceSpec()));
            if (this.getLifecycleConfigArns() != null) {
                data.set("lifecycleConfigArns", om.valueToTree(this.getLifecycleConfigArns()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerUserProfileUserSettingsJupyterServerAppSettings.Jsii$Proxy that = (SagemakerUserProfileUserSettingsJupyterServerAppSettings.Jsii$Proxy) o;

            if (!defaultResourceSpec.equals(that.defaultResourceSpec)) return false;
            return this.lifecycleConfigArns != null ? this.lifecycleConfigArns.equals(that.lifecycleConfigArns) : that.lifecycleConfigArns == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultResourceSpec.hashCode();
            result = 31 * result + (this.lifecycleConfigArns != null ? this.lifecycleConfigArns.hashCode() : 0);
            return result;
        }
    }
}
