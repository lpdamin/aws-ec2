package imports.aws.codebuild;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential aws_codebuild_source_credential}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.103Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildSourceCredential")
public class CodebuildSourceCredential extends com.hashicorp.cdktf.TerraformResource {

    protected CodebuildSourceCredential(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodebuildSourceCredential(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.codebuild.CodebuildSourceCredential.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential aws_codebuild_source_credential} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CodebuildSourceCredential(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.codebuild.CodebuildSourceCredentialConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserName() {
        software.amazon.jsii.Kernel.call(this, "resetUserName", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServerTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "serverTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserNameInput() {
        return software.amazon.jsii.Kernel.get(this, "userNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthType() {
        return software.amazon.jsii.Kernel.get(this, "authType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authType", java.util.Objects.requireNonNull(value, "authType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServerType() {
        return software.amazon.jsii.Kernel.get(this, "serverType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServerType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serverType", java.util.Objects.requireNonNull(value, "serverType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getToken() {
        return software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setToken(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "token", java.util.Objects.requireNonNull(value, "token is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserName() {
        return software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userName", java.util.Objects.requireNonNull(value, "userName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.codebuild.CodebuildSourceCredential}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.codebuild.CodebuildSourceCredential> {
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
        private final imports.aws.codebuild.CodebuildSourceCredentialConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.codebuild.CodebuildSourceCredentialConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#auth_type CodebuildSourceCredential#auth_type}.
         * <p>
         * @return {@code this}
         * @param authType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#auth_type CodebuildSourceCredential#auth_type}. This parameter is required.
         */
        public Builder authType(final java.lang.String authType) {
            this.config.authType(authType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#server_type CodebuildSourceCredential#server_type}.
         * <p>
         * @return {@code this}
         * @param serverType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#server_type CodebuildSourceCredential#server_type}. This parameter is required.
         */
        public Builder serverType(final java.lang.String serverType) {
            this.config.serverType(serverType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#token CodebuildSourceCredential#token}.
         * <p>
         * @return {@code this}
         * @param token Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#token CodebuildSourceCredential#token}. This parameter is required.
         */
        public Builder token(final java.lang.String token) {
            this.config.token(token);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#id CodebuildSourceCredential#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#id CodebuildSourceCredential#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#user_name CodebuildSourceCredential#user_name}.
         * <p>
         * @return {@code this}
         * @param userName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_source_credential#user_name CodebuildSourceCredential#user_name}. This parameter is required.
         */
        public Builder userName(final java.lang.String userName) {
            this.config.userName(userName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.codebuild.CodebuildSourceCredential}.
         */
        @Override
        public imports.aws.codebuild.CodebuildSourceCredential build() {
            return new imports.aws.codebuild.CodebuildSourceCredential(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
