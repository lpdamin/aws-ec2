package imports.aws.sagemaker;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce aws_sagemaker_workforce}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.539Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerWorkforce")
public class SagemakerWorkforce extends com.hashicorp.cdktf.TerraformResource {

    protected SagemakerWorkforce(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerWorkforce(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.sagemaker.SagemakerWorkforce.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce aws_sagemaker_workforce} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SagemakerWorkforce(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCognitoConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceCognitoConfig value) {
        software.amazon.jsii.Kernel.call(this, "putCognitoConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOidcConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceOidcConfig value) {
        software.amazon.jsii.Kernel.call(this, "putOidcConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourceIpConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceSourceIpConfig value) {
        software.amazon.jsii.Kernel.call(this, "putSourceIpConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCognitoConfig() {
        software.amazon.jsii.Kernel.call(this, "resetCognitoConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOidcConfig() {
        software.amazon.jsii.Kernel.call(this, "resetOidcConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceIpConfig() {
        software.amazon.jsii.Kernel.call(this, "resetSourceIpConfig", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceCognitoConfigOutputReference getCognitoConfig() {
        return software.amazon.jsii.Kernel.get(this, "cognitoConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkforceCognitoConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceOidcConfigOutputReference getOidcConfig() {
        return software.amazon.jsii.Kernel.get(this, "oidcConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkforceOidcConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerWorkforceSourceIpConfigOutputReference getSourceIpConfig() {
        return software.amazon.jsii.Kernel.get(this, "sourceIpConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkforceSourceIpConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubdomain() {
        return software.amazon.jsii.Kernel.get(this, "subdomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkforceCognitoConfig getCognitoConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "cognitoConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkforceCognitoConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkforceOidcConfig getOidcConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "oidcConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkforceOidcConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkforceSourceIpConfig getSourceIpConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceIpConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkforceSourceIpConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWorkforceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "workforceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkforceName() {
        return software.amazon.jsii.Kernel.get(this, "workforceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWorkforceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "workforceName", java.util.Objects.requireNonNull(value, "workforceName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.sagemaker.SagemakerWorkforce}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.sagemaker.SagemakerWorkforce> {
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
        private final imports.aws.sagemaker.SagemakerWorkforceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.sagemaker.SagemakerWorkforceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#workforce_name SagemakerWorkforce#workforce_name}.
         * <p>
         * @return {@code this}
         * @param workforceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#workforce_name SagemakerWorkforce#workforce_name}. This parameter is required.
         */
        public Builder workforceName(final java.lang.String workforceName) {
            this.config.workforceName(workforceName);
            return this;
        }

        /**
         * cognito_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#cognito_config SagemakerWorkforce#cognito_config}
         * <p>
         * @return {@code this}
         * @param cognitoConfig cognito_config block. This parameter is required.
         */
        public Builder cognitoConfig(final imports.aws.sagemaker.SagemakerWorkforceCognitoConfig cognitoConfig) {
            this.config.cognitoConfig(cognitoConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#id SagemakerWorkforce#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#id SagemakerWorkforce#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * oidc_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#oidc_config SagemakerWorkforce#oidc_config}
         * <p>
         * @return {@code this}
         * @param oidcConfig oidc_config block. This parameter is required.
         */
        public Builder oidcConfig(final imports.aws.sagemaker.SagemakerWorkforceOidcConfig oidcConfig) {
            this.config.oidcConfig(oidcConfig);
            return this;
        }

        /**
         * source_ip_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workforce#source_ip_config SagemakerWorkforce#source_ip_config}
         * <p>
         * @return {@code this}
         * @param sourceIpConfig source_ip_config block. This parameter is required.
         */
        public Builder sourceIpConfig(final imports.aws.sagemaker.SagemakerWorkforceSourceIpConfig sourceIpConfig) {
            this.config.sourceIpConfig(sourceIpConfig);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.sagemaker.SagemakerWorkforce}.
         */
        @Override
        public imports.aws.sagemaker.SagemakerWorkforce build() {
            return new imports.aws.sagemaker.SagemakerWorkforce(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
