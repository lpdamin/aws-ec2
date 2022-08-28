package imports.aws.cognito;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration aws_cognito_risk_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.664Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoRiskConfiguration")
public class CognitoRiskConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoRiskConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoRiskConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cognito.CognitoRiskConfiguration.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration aws_cognito_risk_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CognitoRiskConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAccountTakeoverRiskConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putAccountTakeoverRiskConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCompromisedCredentialsRiskConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putCompromisedCredentialsRiskConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRiskExceptionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationRiskExceptionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putRiskExceptionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccountTakeoverRiskConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAccountTakeoverRiskConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetClientId() {
        software.amazon.jsii.Kernel.call(this, "resetClientId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCompromisedCredentialsRiskConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetCompromisedCredentialsRiskConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRiskExceptionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetRiskExceptionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationOutputReference getAccountTakeoverRiskConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "accountTakeoverRiskConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference getCompromisedCredentialsRiskConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "compromisedCredentialsRiskConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoRiskConfigurationRiskExceptionConfigurationOutputReference getRiskExceptionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "riskExceptionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationRiskExceptionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfiguration getAccountTakeoverRiskConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "accountTakeoverRiskConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClientIdInput() {
        return software.amazon.jsii.Kernel.get(this, "clientIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration getCompromisedCredentialsRiskConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "compromisedCredentialsRiskConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cognito.CognitoRiskConfigurationRiskExceptionConfiguration getRiskExceptionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "riskExceptionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoRiskConfigurationRiskExceptionConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserPoolIdInput() {
        return software.amazon.jsii.Kernel.get(this, "userPoolIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClientId() {
        return software.amazon.jsii.Kernel.get(this, "clientId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClientId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clientId", java.util.Objects.requireNonNull(value, "clientId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserPoolId() {
        return software.amazon.jsii.Kernel.get(this, "userPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserPoolId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userPoolId", java.util.Objects.requireNonNull(value, "userPoolId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cognito.CognitoRiskConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cognito.CognitoRiskConfiguration> {
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
        private final imports.aws.cognito.CognitoRiskConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cognito.CognitoRiskConfigurationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#user_pool_id CognitoRiskConfiguration#user_pool_id}.
         * <p>
         * @return {@code this}
         * @param userPoolId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#user_pool_id CognitoRiskConfiguration#user_pool_id}. This parameter is required.
         */
        public Builder userPoolId(final java.lang.String userPoolId) {
            this.config.userPoolId(userPoolId);
            return this;
        }

        /**
         * account_takeover_risk_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#account_takeover_risk_configuration CognitoRiskConfiguration#account_takeover_risk_configuration}
         * <p>
         * @return {@code this}
         * @param accountTakeoverRiskConfiguration account_takeover_risk_configuration block. This parameter is required.
         */
        public Builder accountTakeoverRiskConfiguration(final imports.aws.cognito.CognitoRiskConfigurationAccountTakeoverRiskConfiguration accountTakeoverRiskConfiguration) {
            this.config.accountTakeoverRiskConfiguration(accountTakeoverRiskConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#client_id CognitoRiskConfiguration#client_id}.
         * <p>
         * @return {@code this}
         * @param clientId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#client_id CognitoRiskConfiguration#client_id}. This parameter is required.
         */
        public Builder clientId(final java.lang.String clientId) {
            this.config.clientId(clientId);
            return this;
        }

        /**
         * compromised_credentials_risk_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#compromised_credentials_risk_configuration CognitoRiskConfiguration#compromised_credentials_risk_configuration}
         * <p>
         * @return {@code this}
         * @param compromisedCredentialsRiskConfiguration compromised_credentials_risk_configuration block. This parameter is required.
         */
        public Builder compromisedCredentialsRiskConfiguration(final imports.aws.cognito.CognitoRiskConfigurationCompromisedCredentialsRiskConfiguration compromisedCredentialsRiskConfiguration) {
            this.config.compromisedCredentialsRiskConfiguration(compromisedCredentialsRiskConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#id CognitoRiskConfiguration#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#id CognitoRiskConfiguration#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * risk_exception_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_risk_configuration#risk_exception_configuration CognitoRiskConfiguration#risk_exception_configuration}
         * <p>
         * @return {@code this}
         * @param riskExceptionConfiguration risk_exception_configuration block. This parameter is required.
         */
        public Builder riskExceptionConfiguration(final imports.aws.cognito.CognitoRiskConfigurationRiskExceptionConfiguration riskExceptionConfiguration) {
            this.config.riskExceptionConfiguration(riskExceptionConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cognito.CognitoRiskConfiguration}.
         */
        @Override
        public imports.aws.cognito.CognitoRiskConfiguration build() {
            return new imports.aws.cognito.CognitoRiskConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
