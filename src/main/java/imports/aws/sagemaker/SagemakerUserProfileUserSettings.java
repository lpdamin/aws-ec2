package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.537Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerUserProfileUserSettings")
@software.amazon.jsii.Jsii.Proxy(SagemakerUserProfileUserSettings.Jsii$Proxy.class)
public interface SagemakerUserProfileUserSettings extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#execution_role SagemakerUserProfile#execution_role}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExecutionRole();

    /**
     * jupyter_server_app_settings block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#jupyter_server_app_settings SagemakerUserProfile#jupyter_server_app_settings}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings getJupyterServerAppSettings() {
        return null;
    }

    /**
     * kernel_gateway_app_settings block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#kernel_gateway_app_settings SagemakerUserProfile#kernel_gateway_app_settings}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings getKernelGatewayAppSettings() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#security_groups SagemakerUserProfile#security_groups}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroups() {
        return null;
    }

    /**
     * sharing_settings block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#sharing_settings SagemakerUserProfile#sharing_settings}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings getSharingSettings() {
        return null;
    }

    /**
     * tensor_board_app_settings block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#tensor_board_app_settings SagemakerUserProfile#tensor_board_app_settings}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings getTensorBoardAppSettings() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerUserProfileUserSettings}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerUserProfileUserSettings}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerUserProfileUserSettings> {
        java.lang.String executionRole;
        imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings jupyterServerAppSettings;
        imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings kernelGatewayAppSettings;
        java.util.List<java.lang.String> securityGroups;
        imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings sharingSettings;
        imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings tensorBoardAppSettings;

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettings#getExecutionRole}
         * @param executionRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#execution_role SagemakerUserProfile#execution_role}. This parameter is required.
         * @return {@code this}
         */
        public Builder executionRole(java.lang.String executionRole) {
            this.executionRole = executionRole;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettings#getJupyterServerAppSettings}
         * @param jupyterServerAppSettings jupyter_server_app_settings block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#jupyter_server_app_settings SagemakerUserProfile#jupyter_server_app_settings}
         * @return {@code this}
         */
        public Builder jupyterServerAppSettings(imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettings#getKernelGatewayAppSettings}
         * @param kernelGatewayAppSettings kernel_gateway_app_settings block.
         *                                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#kernel_gateway_app_settings SagemakerUserProfile#kernel_gateway_app_settings}
         * @return {@code this}
         */
        public Builder kernelGatewayAppSettings(imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettings#getSecurityGroups}
         * @param securityGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#security_groups SagemakerUserProfile#security_groups}.
         * @return {@code this}
         */
        public Builder securityGroups(java.util.List<java.lang.String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettings#getSharingSettings}
         * @param sharingSettings sharing_settings block.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#sharing_settings SagemakerUserProfile#sharing_settings}
         * @return {@code this}
         */
        public Builder sharingSettings(imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerUserProfileUserSettings#getTensorBoardAppSettings}
         * @param tensorBoardAppSettings tensor_board_app_settings block.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_user_profile#tensor_board_app_settings SagemakerUserProfile#tensor_board_app_settings}
         * @return {@code this}
         */
        public Builder tensorBoardAppSettings(imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings tensorBoardAppSettings) {
            this.tensorBoardAppSettings = tensorBoardAppSettings;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerUserProfileUserSettings}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerUserProfileUserSettings build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerUserProfileUserSettings}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerUserProfileUserSettings {
        private final java.lang.String executionRole;
        private final imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings jupyterServerAppSettings;
        private final imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings kernelGatewayAppSettings;
        private final java.util.List<java.lang.String> securityGroups;
        private final imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings sharingSettings;
        private final imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings tensorBoardAppSettings;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.executionRole = software.amazon.jsii.Kernel.get(this, "executionRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.jupyterServerAppSettings = software.amazon.jsii.Kernel.get(this, "jupyterServerAppSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings.class));
            this.kernelGatewayAppSettings = software.amazon.jsii.Kernel.get(this, "kernelGatewayAppSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings.class));
            this.securityGroups = software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sharingSettings = software.amazon.jsii.Kernel.get(this, "sharingSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings.class));
            this.tensorBoardAppSettings = software.amazon.jsii.Kernel.get(this, "tensorBoardAppSettings", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.executionRole = java.util.Objects.requireNonNull(builder.executionRole, "executionRole is required");
            this.jupyterServerAppSettings = builder.jupyterServerAppSettings;
            this.kernelGatewayAppSettings = builder.kernelGatewayAppSettings;
            this.securityGroups = builder.securityGroups;
            this.sharingSettings = builder.sharingSettings;
            this.tensorBoardAppSettings = builder.tensorBoardAppSettings;
        }

        @Override
        public final java.lang.String getExecutionRole() {
            return this.executionRole;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerUserProfileUserSettingsJupyterServerAppSettings getJupyterServerAppSettings() {
            return this.jupyterServerAppSettings;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerUserProfileUserSettingsKernelGatewayAppSettings getKernelGatewayAppSettings() {
            return this.kernelGatewayAppSettings;
        }

        @Override
        public final java.util.List<java.lang.String> getSecurityGroups() {
            return this.securityGroups;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerUserProfileUserSettingsSharingSettings getSharingSettings() {
            return this.sharingSettings;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerUserProfileUserSettingsTensorBoardAppSettings getTensorBoardAppSettings() {
            return this.tensorBoardAppSettings;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("executionRole", om.valueToTree(this.getExecutionRole()));
            if (this.getJupyterServerAppSettings() != null) {
                data.set("jupyterServerAppSettings", om.valueToTree(this.getJupyterServerAppSettings()));
            }
            if (this.getKernelGatewayAppSettings() != null) {
                data.set("kernelGatewayAppSettings", om.valueToTree(this.getKernelGatewayAppSettings()));
            }
            if (this.getSecurityGroups() != null) {
                data.set("securityGroups", om.valueToTree(this.getSecurityGroups()));
            }
            if (this.getSharingSettings() != null) {
                data.set("sharingSettings", om.valueToTree(this.getSharingSettings()));
            }
            if (this.getTensorBoardAppSettings() != null) {
                data.set("tensorBoardAppSettings", om.valueToTree(this.getTensorBoardAppSettings()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerUserProfileUserSettings"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerUserProfileUserSettings.Jsii$Proxy that = (SagemakerUserProfileUserSettings.Jsii$Proxy) o;

            if (!executionRole.equals(that.executionRole)) return false;
            if (this.jupyterServerAppSettings != null ? !this.jupyterServerAppSettings.equals(that.jupyterServerAppSettings) : that.jupyterServerAppSettings != null) return false;
            if (this.kernelGatewayAppSettings != null ? !this.kernelGatewayAppSettings.equals(that.kernelGatewayAppSettings) : that.kernelGatewayAppSettings != null) return false;
            if (this.securityGroups != null ? !this.securityGroups.equals(that.securityGroups) : that.securityGroups != null) return false;
            if (this.sharingSettings != null ? !this.sharingSettings.equals(that.sharingSettings) : that.sharingSettings != null) return false;
            return this.tensorBoardAppSettings != null ? this.tensorBoardAppSettings.equals(that.tensorBoardAppSettings) : that.tensorBoardAppSettings == null;
        }

        @Override
        public final int hashCode() {
            int result = this.executionRole.hashCode();
            result = 31 * result + (this.jupyterServerAppSettings != null ? this.jupyterServerAppSettings.hashCode() : 0);
            result = 31 * result + (this.kernelGatewayAppSettings != null ? this.kernelGatewayAppSettings.hashCode() : 0);
            result = 31 * result + (this.securityGroups != null ? this.securityGroups.hashCode() : 0);
            result = 31 * result + (this.sharingSettings != null ? this.sharingSettings.hashCode() : 0);
            result = 31 * result + (this.tensorBoardAppSettings != null ? this.tensorBoardAppSettings.hashCode() : 0);
            return result;
        }
    }
}
