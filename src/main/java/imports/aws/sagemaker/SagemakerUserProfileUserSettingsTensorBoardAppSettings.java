package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.539Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings")
@software.amazon.jsii.Jsii.Proxy(SagemakerUserProfileUserSettingsTensorBoardAppSettings.Jsii$Proxy.class)
public interface SagemakerUserProfileUserSettingsTensorBoardAppSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * default_resource_spec block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#default_resource_spec SagemakerUserProfile#default_resource_spec}
     */
    @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec getDefaultResourceSpec();

    /**
     * @return a {@link Builder} of {@link SagemakerUserProfileUserSettingsTensorBoardAppSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerUserProfileUserSettingsTensorBoardAppSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerUserProfileUserSettingsTensorBoardAppSettings> {
        imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec;

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettingsTensorBoardAppSettings#getDefaultResourceSpec}
         * @param defaultResourceSpec default_resource_spec block. This parameter is required.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#default_resource_spec SagemakerUserProfile#default_resource_spec}
         * @return {@code this}
         */
        public Builder defaultResourceSpec(imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerUserProfileUserSettingsTensorBoardAppSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerUserProfileUserSettingsTensorBoardAppSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerUserProfileUserSettingsTensorBoardAppSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerUserProfileUserSettingsTensorBoardAppSettings {
        private final imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec defaultResourceSpec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultResourceSpec = software.amazon.jsii.Kernel.get(this, "defaultResourceSpec", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultResourceSpec = java.util.Objects.requireNonNull(builder.defaultResourceSpec, "defaultResourceSpec is required");
        }

        @Override
        public final imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpec getDefaultResourceSpec() {
            return this.defaultResourceSpec;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultResourceSpec", om.valueToTree(this.getDefaultResourceSpec()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerUserProfileUserSettingsTensorBoardAppSettings.Jsii$Proxy that = (SagemakerUserProfileUserSettingsTensorBoardAppSettings.Jsii$Proxy) o;

            return this.defaultResourceSpec.equals(that.defaultResourceSpec);
        }

        @Override
        public final int hashCode() {
            int result = this.defaultResourceSpec.hashCode();
            return result;
        }
    }
}
