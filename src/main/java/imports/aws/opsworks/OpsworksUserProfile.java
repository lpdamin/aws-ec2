package imports.aws.opsworks;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile aws_opsworks_user_profile}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.132Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.opsworks.OpsworksUserProfile")
public class OpsworksUserProfile extends com.hashicorp.cdktf.TerraformResource {

    protected OpsworksUserProfile(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected OpsworksUserProfile(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.opsworks.OpsworksUserProfile.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile aws_opsworks_user_profile} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public OpsworksUserProfile(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.opsworks.OpsworksUserProfileConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAllowSelfManagement() {
        software.amazon.jsii.Kernel.call(this, "resetAllowSelfManagement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSshPublicKey() {
        software.amazon.jsii.Kernel.call(this, "resetSshPublicKey", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.Object getAllowSelfManagementInput() {
        return software.amazon.jsii.Kernel.get(this, "allowSelfManagementInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSshPublicKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "sshPublicKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSshUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "sshUsernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserArnInput() {
        return software.amazon.jsii.Kernel.get(this, "userArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAllowSelfManagement() {
        return software.amazon.jsii.Kernel.get(this, "allowSelfManagement", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAllowSelfManagement(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "allowSelfManagement", java.util.Objects.requireNonNull(value, "allowSelfManagement is required"));
    }

    public void setAllowSelfManagement(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "allowSelfManagement", java.util.Objects.requireNonNull(value, "allowSelfManagement is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshPublicKey() {
        return software.amazon.jsii.Kernel.get(this, "sshPublicKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshPublicKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshPublicKey", java.util.Objects.requireNonNull(value, "sshPublicKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSshUsername() {
        return software.amazon.jsii.Kernel.get(this, "sshUsername", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSshUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "sshUsername", java.util.Objects.requireNonNull(value, "sshUsername is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserArn() {
        return software.amazon.jsii.Kernel.get(this, "userArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userArn", java.util.Objects.requireNonNull(value, "userArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.opsworks.OpsworksUserProfile}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.opsworks.OpsworksUserProfile> {
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
        private final imports.aws.opsworks.OpsworksUserProfileConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.opsworks.OpsworksUserProfileConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#ssh_username OpsworksUserProfile#ssh_username}.
         * <p>
         * @return {@code this}
         * @param sshUsername Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#ssh_username OpsworksUserProfile#ssh_username}. This parameter is required.
         */
        public Builder sshUsername(final java.lang.String sshUsername) {
            this.config.sshUsername(sshUsername);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#user_arn OpsworksUserProfile#user_arn}.
         * <p>
         * @return {@code this}
         * @param userArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#user_arn OpsworksUserProfile#user_arn}. This parameter is required.
         */
        public Builder userArn(final java.lang.String userArn) {
            this.config.userArn(userArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#allow_self_management OpsworksUserProfile#allow_self_management}.
         * <p>
         * @return {@code this}
         * @param allowSelfManagement Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#allow_self_management OpsworksUserProfile#allow_self_management}. This parameter is required.
         */
        public Builder allowSelfManagement(final java.lang.Boolean allowSelfManagement) {
            this.config.allowSelfManagement(allowSelfManagement);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#allow_self_management OpsworksUserProfile#allow_self_management}.
         * <p>
         * @return {@code this}
         * @param allowSelfManagement Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#allow_self_management OpsworksUserProfile#allow_self_management}. This parameter is required.
         */
        public Builder allowSelfManagement(final com.hashicorp.cdktf.IResolvable allowSelfManagement) {
            this.config.allowSelfManagement(allowSelfManagement);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#id OpsworksUserProfile#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#id OpsworksUserProfile#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#ssh_public_key OpsworksUserProfile#ssh_public_key}.
         * <p>
         * @return {@code this}
         * @param sshPublicKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_user_profile#ssh_public_key OpsworksUserProfile#ssh_public_key}. This parameter is required.
         */
        public Builder sshPublicKey(final java.lang.String sshPublicKey) {
            this.config.sshPublicKey(sshPublicKey);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.opsworks.OpsworksUserProfile}.
         */
        @Override
        public imports.aws.opsworks.OpsworksUserProfile build() {
            return new imports.aws.opsworks.OpsworksUserProfile(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
