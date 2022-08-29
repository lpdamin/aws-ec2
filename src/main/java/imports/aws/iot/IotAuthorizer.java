package imports.aws.iot;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer aws_iot_authorizer}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.422Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotAuthorizer")
public class IotAuthorizer extends com.hashicorp.cdktf.TerraformResource {

    protected IotAuthorizer(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotAuthorizer(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.iot.IotAuthorizer.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer aws_iot_authorizer} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public IotAuthorizer(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.iot.IotAuthorizerConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetEnableCachingForHttp() {
        software.amazon.jsii.Kernel.call(this, "resetEnableCachingForHttp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSigningDisabled() {
        software.amazon.jsii.Kernel.call(this, "resetSigningDisabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStatus() {
        software.amazon.jsii.Kernel.call(this, "resetStatus", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTokenKeyName() {
        software.amazon.jsii.Kernel.call(this, "resetTokenKeyName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTokenSigningPublicKeys() {
        software.amazon.jsii.Kernel.call(this, "resetTokenSigningPublicKeys", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizerFunctionArnInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizerFunctionArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableCachingForHttpInput() {
        return software.amazon.jsii.Kernel.get(this, "enableCachingForHttpInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSigningDisabledInput() {
        return software.amazon.jsii.Kernel.get(this, "signingDisabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "statusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTokenKeyNameInput() {
        return software.amazon.jsii.Kernel.get(this, "tokenKeyNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTokenSigningPublicKeysInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tokenSigningPublicKeysInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizerFunctionArn() {
        return software.amazon.jsii.Kernel.get(this, "authorizerFunctionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizerFunctionArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizerFunctionArn", java.util.Objects.requireNonNull(value, "authorizerFunctionArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableCachingForHttp() {
        return software.amazon.jsii.Kernel.get(this, "enableCachingForHttp", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableCachingForHttp(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableCachingForHttp", java.util.Objects.requireNonNull(value, "enableCachingForHttp is required"));
    }

    public void setEnableCachingForHttp(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableCachingForHttp", java.util.Objects.requireNonNull(value, "enableCachingForHttp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSigningDisabled() {
        return software.amazon.jsii.Kernel.get(this, "signingDisabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSigningDisabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "signingDisabled", java.util.Objects.requireNonNull(value, "signingDisabled is required"));
    }

    public void setSigningDisabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "signingDisabled", java.util.Objects.requireNonNull(value, "signingDisabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "status", java.util.Objects.requireNonNull(value, "status is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTokenKeyName() {
        return software.amazon.jsii.Kernel.get(this, "tokenKeyName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTokenKeyName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tokenKeyName", java.util.Objects.requireNonNull(value, "tokenKeyName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTokenSigningPublicKeys() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tokenSigningPublicKeys", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTokenSigningPublicKeys(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tokenSigningPublicKeys", java.util.Objects.requireNonNull(value, "tokenSigningPublicKeys is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.iot.IotAuthorizer}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.iot.IotAuthorizer> {
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
        private final imports.aws.iot.IotAuthorizerConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.iot.IotAuthorizerConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#authorizer_function_arn IotAuthorizer#authorizer_function_arn}.
         * <p>
         * @return {@code this}
         * @param authorizerFunctionArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#authorizer_function_arn IotAuthorizer#authorizer_function_arn}. This parameter is required.
         */
        public Builder authorizerFunctionArn(final java.lang.String authorizerFunctionArn) {
            this.config.authorizerFunctionArn(authorizerFunctionArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#name IotAuthorizer#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#name IotAuthorizer#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#enable_caching_for_http IotAuthorizer#enable_caching_for_http}.
         * <p>
         * @return {@code this}
         * @param enableCachingForHttp Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#enable_caching_for_http IotAuthorizer#enable_caching_for_http}. This parameter is required.
         */
        public Builder enableCachingForHttp(final java.lang.Boolean enableCachingForHttp) {
            this.config.enableCachingForHttp(enableCachingForHttp);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#enable_caching_for_http IotAuthorizer#enable_caching_for_http}.
         * <p>
         * @return {@code this}
         * @param enableCachingForHttp Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#enable_caching_for_http IotAuthorizer#enable_caching_for_http}. This parameter is required.
         */
        public Builder enableCachingForHttp(final com.hashicorp.cdktf.IResolvable enableCachingForHttp) {
            this.config.enableCachingForHttp(enableCachingForHttp);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#id IotAuthorizer#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#id IotAuthorizer#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#signing_disabled IotAuthorizer#signing_disabled}.
         * <p>
         * @return {@code this}
         * @param signingDisabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#signing_disabled IotAuthorizer#signing_disabled}. This parameter is required.
         */
        public Builder signingDisabled(final java.lang.Boolean signingDisabled) {
            this.config.signingDisabled(signingDisabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#signing_disabled IotAuthorizer#signing_disabled}.
         * <p>
         * @return {@code this}
         * @param signingDisabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#signing_disabled IotAuthorizer#signing_disabled}. This parameter is required.
         */
        public Builder signingDisabled(final com.hashicorp.cdktf.IResolvable signingDisabled) {
            this.config.signingDisabled(signingDisabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#status IotAuthorizer#status}.
         * <p>
         * @return {@code this}
         * @param status Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#status IotAuthorizer#status}. This parameter is required.
         */
        public Builder status(final java.lang.String status) {
            this.config.status(status);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#token_key_name IotAuthorizer#token_key_name}.
         * <p>
         * @return {@code this}
         * @param tokenKeyName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#token_key_name IotAuthorizer#token_key_name}. This parameter is required.
         */
        public Builder tokenKeyName(final java.lang.String tokenKeyName) {
            this.config.tokenKeyName(tokenKeyName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#token_signing_public_keys IotAuthorizer#token_signing_public_keys}.
         * <p>
         * @return {@code this}
         * @param tokenSigningPublicKeys Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_authorizer#token_signing_public_keys IotAuthorizer#token_signing_public_keys}. This parameter is required.
         */
        public Builder tokenSigningPublicKeys(final java.util.Map<java.lang.String, java.lang.String> tokenSigningPublicKeys) {
            this.config.tokenSigningPublicKeys(tokenSigningPublicKeys);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.iot.IotAuthorizer}.
         */
        @Override
        public imports.aws.iot.IotAuthorizer build() {
            return new imports.aws.iot.IotAuthorizer(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
