package imports.aws.pinpoint;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel aws_pinpoint_apns_sandbox_channel}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.161Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.pinpoint.PinpointApnsSandboxChannel")
public class PinpointApnsSandboxChannel extends com.hashicorp.cdktf.TerraformResource {

    protected PinpointApnsSandboxChannel(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PinpointApnsSandboxChannel(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.pinpoint.PinpointApnsSandboxChannel.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel aws_pinpoint_apns_sandbox_channel} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public PinpointApnsSandboxChannel(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.pinpoint.PinpointApnsSandboxChannelConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBundleId() {
        software.amazon.jsii.Kernel.call(this, "resetBundleId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCertificate() {
        software.amazon.jsii.Kernel.call(this, "resetCertificate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDefaultAuthenticationMethod() {
        software.amazon.jsii.Kernel.call(this, "resetDefaultAuthenticationMethod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPrivateKey() {
        software.amazon.jsii.Kernel.call(this, "resetPrivateKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTeamId() {
        software.amazon.jsii.Kernel.call(this, "resetTeamId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTokenKey() {
        software.amazon.jsii.Kernel.call(this, "resetTokenKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTokenKeyId() {
        software.amazon.jsii.Kernel.call(this, "resetTokenKeyId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getApplicationIdInput() {
        return software.amazon.jsii.Kernel.get(this, "applicationIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBundleIdInput() {
        return software.amazon.jsii.Kernel.get(this, "bundleIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCertificateInput() {
        return software.amazon.jsii.Kernel.get(this, "certificateInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultAuthenticationMethodInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultAuthenticationMethodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrivateKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "privateKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTeamIdInput() {
        return software.amazon.jsii.Kernel.get(this, "teamIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenKeyIdInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenKeyIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApplicationId() {
        return software.amazon.jsii.Kernel.get(this, "applicationId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApplicationId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "applicationId", java.util.Objects.requireNonNull(value, "applicationId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBundleId() {
        return software.amazon.jsii.Kernel.get(this, "bundleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBundleId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "bundleId", java.util.Objects.requireNonNull(value, "bundleId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCertificate() {
        return software.amazon.jsii.Kernel.get(this, "certificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCertificate(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "certificate", java.util.Objects.requireNonNull(value, "certificate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultAuthenticationMethod() {
        return software.amazon.jsii.Kernel.get(this, "defaultAuthenticationMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultAuthenticationMethod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultAuthenticationMethod", java.util.Objects.requireNonNull(value, "defaultAuthenticationMethod is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrivateKey() {
        return software.amazon.jsii.Kernel.get(this, "privateKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrivateKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "privateKey", java.util.Objects.requireNonNull(value, "privateKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTeamId() {
        return software.amazon.jsii.Kernel.get(this, "teamId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTeamId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "teamId", java.util.Objects.requireNonNull(value, "teamId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTokenKey() {
        return software.amazon.jsii.Kernel.get(this, "tokenKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTokenKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tokenKey", java.util.Objects.requireNonNull(value, "tokenKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTokenKeyId() {
        return software.amazon.jsii.Kernel.get(this, "tokenKeyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTokenKeyId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tokenKeyId", java.util.Objects.requireNonNull(value, "tokenKeyId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.pinpoint.PinpointApnsSandboxChannel}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.pinpoint.PinpointApnsSandboxChannel> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.pinpoint.PinpointApnsSandboxChannelConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.pinpoint.PinpointApnsSandboxChannelConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#application_id PinpointApnsSandboxChannel#application_id}.
         * <p>
         * @return {@code this}
         * @param applicationId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#application_id PinpointApnsSandboxChannel#application_id}. This parameter is required.
         */
        public Builder applicationId(final java.lang.String applicationId) {
            this.config.applicationId(applicationId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#bundle_id PinpointApnsSandboxChannel#bundle_id}.
         * <p>
         * @return {@code this}
         * @param bundleId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#bundle_id PinpointApnsSandboxChannel#bundle_id}. This parameter is required.
         */
        public Builder bundleId(final java.lang.String bundleId) {
            this.config.bundleId(bundleId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#certificate PinpointApnsSandboxChannel#certificate}.
         * <p>
         * @return {@code this}
         * @param certificate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#certificate PinpointApnsSandboxChannel#certificate}. This parameter is required.
         */
        public Builder certificate(final java.lang.String certificate) {
            this.config.certificate(certificate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#default_authentication_method PinpointApnsSandboxChannel#default_authentication_method}.
         * <p>
         * @return {@code this}
         * @param defaultAuthenticationMethod Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#default_authentication_method PinpointApnsSandboxChannel#default_authentication_method}. This parameter is required.
         */
        public Builder defaultAuthenticationMethod(final java.lang.String defaultAuthenticationMethod) {
            this.config.defaultAuthenticationMethod(defaultAuthenticationMethod);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#enabled PinpointApnsSandboxChannel#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#enabled PinpointApnsSandboxChannel#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#enabled PinpointApnsSandboxChannel#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#enabled PinpointApnsSandboxChannel#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#id PinpointApnsSandboxChannel#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#id PinpointApnsSandboxChannel#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#private_key PinpointApnsSandboxChannel#private_key}.
         * <p>
         * @return {@code this}
         * @param privateKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#private_key PinpointApnsSandboxChannel#private_key}. This parameter is required.
         */
        public Builder privateKey(final java.lang.String privateKey) {
            this.config.privateKey(privateKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#team_id PinpointApnsSandboxChannel#team_id}.
         * <p>
         * @return {@code this}
         * @param teamId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#team_id PinpointApnsSandboxChannel#team_id}. This parameter is required.
         */
        public Builder teamId(final java.lang.String teamId) {
            this.config.teamId(teamId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#token_key PinpointApnsSandboxChannel#token_key}.
         * <p>
         * @return {@code this}
         * @param tokenKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#token_key PinpointApnsSandboxChannel#token_key}. This parameter is required.
         */
        public Builder tokenKey(final java.lang.String tokenKey) {
            this.config.tokenKey(tokenKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#token_key_id PinpointApnsSandboxChannel#token_key_id}.
         * <p>
         * @return {@code this}
         * @param tokenKeyId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/pinpoint_apns_sandbox_channel#token_key_id PinpointApnsSandboxChannel#token_key_id}. This parameter is required.
         */
        public Builder tokenKeyId(final java.lang.String tokenKeyId) {
            this.config.tokenKeyId(tokenKeyId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.pinpoint.PinpointApnsSandboxChannel}.
         */
        @Override
        public imports.aws.pinpoint.PinpointApnsSandboxChannel build() {
            return new imports.aws.pinpoint.PinpointApnsSandboxChannel(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
