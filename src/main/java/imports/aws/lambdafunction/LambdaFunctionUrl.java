package imports.aws.lambdafunction;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url aws_lambda_function_url}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.792Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaFunctionUrl")
public class LambdaFunctionUrl extends com.hashicorp.cdktf.TerraformResource {

    protected LambdaFunctionUrl(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaFunctionUrl(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lambdafunction.LambdaFunctionUrl.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url aws_lambda_function_url} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LambdaFunctionUrl(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionUrlConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCors(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionUrlCors value) {
        software.amazon.jsii.Kernel.call(this, "putCors", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionUrlTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCors() {
        software.amazon.jsii.Kernel.call(this, "resetCors", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQualifier() {
        software.amazon.jsii.Kernel.call(this, "resetQualifier", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionUrlCorsOutputReference getCors() {
        return software.amazon.jsii.Kernel.get(this, "cors", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionUrlCorsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionArn() {
        return software.amazon.jsii.Kernel.get(this, "functionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionUrl() {
        return software.amazon.jsii.Kernel.get(this, "functionUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaFunctionUrlTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionUrlTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrlId() {
        return software.amazon.jsii.Kernel.get(this, "urlId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthorizationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authorizationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaFunctionUrlCors getCorsInput() {
        return software.amazon.jsii.Kernel.get(this, "corsInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaFunctionUrlCors.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFunctionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "functionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQualifierInput() {
        return software.amazon.jsii.Kernel.get(this, "qualifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthorizationType() {
        return software.amazon.jsii.Kernel.get(this, "authorizationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthorizationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authorizationType", java.util.Objects.requireNonNull(value, "authorizationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionName() {
        return software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionName", java.util.Objects.requireNonNull(value, "functionName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQualifier() {
        return software.amazon.jsii.Kernel.get(this, "qualifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQualifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "qualifier", java.util.Objects.requireNonNull(value, "qualifier is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lambdafunction.LambdaFunctionUrl}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lambdafunction.LambdaFunctionUrl> {
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
        private final imports.aws.lambdafunction.LambdaFunctionUrlConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.lambdafunction.LambdaFunctionUrlConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#authorization_type LambdaFunctionUrl#authorization_type}.
         * <p>
         * @return {@code this}
         * @param authorizationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#authorization_type LambdaFunctionUrl#authorization_type}. This parameter is required.
         */
        public Builder authorizationType(final java.lang.String authorizationType) {
            this.config.authorizationType(authorizationType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#function_name LambdaFunctionUrl#function_name}.
         * <p>
         * @return {@code this}
         * @param functionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#function_name LambdaFunctionUrl#function_name}. This parameter is required.
         */
        public Builder functionName(final java.lang.String functionName) {
            this.config.functionName(functionName);
            return this;
        }

        /**
         * cors block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#cors LambdaFunctionUrl#cors}
         * <p>
         * @return {@code this}
         * @param cors cors block. This parameter is required.
         */
        public Builder cors(final imports.aws.lambdafunction.LambdaFunctionUrlCors cors) {
            this.config.cors(cors);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#id LambdaFunctionUrl#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#id LambdaFunctionUrl#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#qualifier LambdaFunctionUrl#qualifier}.
         * <p>
         * @return {@code this}
         * @param qualifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#qualifier LambdaFunctionUrl#qualifier}. This parameter is required.
         */
        public Builder qualifier(final java.lang.String qualifier) {
            this.config.qualifier(qualifier);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_function_url#timeouts LambdaFunctionUrl#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.lambdafunction.LambdaFunctionUrlTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lambdafunction.LambdaFunctionUrl}.
         */
        @Override
        public imports.aws.lambdafunction.LambdaFunctionUrl build() {
            return new imports.aws.lambdafunction.LambdaFunctionUrl(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
