package imports.aws.config;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration aws_config_remediation_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.797Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigRemediationConfiguration")
public class ConfigRemediationConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected ConfigRemediationConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConfigRemediationConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.config.ConfigRemediationConfiguration.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration aws_config_remediation_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ConfigRemediationConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.config.ConfigRemediationConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putExecutionControls(final @org.jetbrains.annotations.NotNull imports.aws.config.ConfigRemediationConfigurationExecutionControls value) {
        software.amazon.jsii.Kernel.call(this, "putExecutionControls", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putParameter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putParameter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutomatic() {
        software.amazon.jsii.Kernel.call(this, "resetAutomatic", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExecutionControls() {
        software.amazon.jsii.Kernel.call(this, "resetExecutionControls", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumAutomaticAttempts() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumAutomaticAttempts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParameter() {
        software.amazon.jsii.Kernel.call(this, "resetParameter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceType() {
        software.amazon.jsii.Kernel.call(this, "resetResourceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetryAttemptSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetRetryAttemptSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetVersion() {
        software.amazon.jsii.Kernel.call(this, "resetTargetVersion", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.config.ConfigRemediationConfigurationExecutionControlsOutputReference getExecutionControls() {
        return software.amazon.jsii.Kernel.get(this, "executionControls", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationExecutionControlsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.config.ConfigRemediationConfigurationParameterList getParameter() {
        return software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationParameterList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutomaticInput() {
        return software.amazon.jsii.Kernel.get(this, "automaticInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getConfigRuleNameInput() {
        return software.amazon.jsii.Kernel.get(this, "configRuleNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.config.ConfigRemediationConfigurationExecutionControls getExecutionControlsInput() {
        return software.amazon.jsii.Kernel.get(this, "executionControlsInput", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigRemediationConfigurationExecutionControls.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumAutomaticAttemptsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumAutomaticAttemptsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getParameterInput() {
        return software.amazon.jsii.Kernel.get(this, "parameterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRetryAttemptSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "retryAttemptSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "targetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "targetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "targetVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutomatic() {
        return software.amazon.jsii.Kernel.get(this, "automatic", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutomatic(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "automatic", java.util.Objects.requireNonNull(value, "automatic is required"));
    }

    public void setAutomatic(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "automatic", java.util.Objects.requireNonNull(value, "automatic is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getConfigRuleName() {
        return software.amazon.jsii.Kernel.get(this, "configRuleName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setConfigRuleName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "configRuleName", java.util.Objects.requireNonNull(value, "configRuleName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumAutomaticAttempts() {
        return software.amazon.jsii.Kernel.get(this, "maximumAutomaticAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumAutomaticAttempts(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumAutomaticAttempts", java.util.Objects.requireNonNull(value, "maximumAutomaticAttempts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceType() {
        return software.amazon.jsii.Kernel.get(this, "resourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceType", java.util.Objects.requireNonNull(value, "resourceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRetryAttemptSeconds() {
        return software.amazon.jsii.Kernel.get(this, "retryAttemptSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRetryAttemptSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "retryAttemptSeconds", java.util.Objects.requireNonNull(value, "retryAttemptSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetId() {
        return software.amazon.jsii.Kernel.get(this, "targetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetId", java.util.Objects.requireNonNull(value, "targetId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetType() {
        return software.amazon.jsii.Kernel.get(this, "targetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetType", java.util.Objects.requireNonNull(value, "targetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetVersion() {
        return software.amazon.jsii.Kernel.get(this, "targetVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetVersion", java.util.Objects.requireNonNull(value, "targetVersion is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.config.ConfigRemediationConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.config.ConfigRemediationConfiguration> {
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
        private final imports.aws.config.ConfigRemediationConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.config.ConfigRemediationConfigurationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#config_rule_name ConfigRemediationConfiguration#config_rule_name}.
         * <p>
         * @return {@code this}
         * @param configRuleName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#config_rule_name ConfigRemediationConfiguration#config_rule_name}. This parameter is required.
         */
        public Builder configRuleName(final java.lang.String configRuleName) {
            this.config.configRuleName(configRuleName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#target_id ConfigRemediationConfiguration#target_id}.
         * <p>
         * @return {@code this}
         * @param targetId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#target_id ConfigRemediationConfiguration#target_id}. This parameter is required.
         */
        public Builder targetId(final java.lang.String targetId) {
            this.config.targetId(targetId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#target_type ConfigRemediationConfiguration#target_type}.
         * <p>
         * @return {@code this}
         * @param targetType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#target_type ConfigRemediationConfiguration#target_type}. This parameter is required.
         */
        public Builder targetType(final java.lang.String targetType) {
            this.config.targetType(targetType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#automatic ConfigRemediationConfiguration#automatic}.
         * <p>
         * @return {@code this}
         * @param automatic Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#automatic ConfigRemediationConfiguration#automatic}. This parameter is required.
         */
        public Builder automatic(final java.lang.Boolean automatic) {
            this.config.automatic(automatic);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#automatic ConfigRemediationConfiguration#automatic}.
         * <p>
         * @return {@code this}
         * @param automatic Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#automatic ConfigRemediationConfiguration#automatic}. This parameter is required.
         */
        public Builder automatic(final com.hashicorp.cdktf.IResolvable automatic) {
            this.config.automatic(automatic);
            return this;
        }

        /**
         * execution_controls block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#execution_controls ConfigRemediationConfiguration#execution_controls}
         * <p>
         * @return {@code this}
         * @param executionControls execution_controls block. This parameter is required.
         */
        public Builder executionControls(final imports.aws.config.ConfigRemediationConfigurationExecutionControls executionControls) {
            this.config.executionControls(executionControls);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#id ConfigRemediationConfiguration#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#id ConfigRemediationConfiguration#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#maximum_automatic_attempts ConfigRemediationConfiguration#maximum_automatic_attempts}.
         * <p>
         * @return {@code this}
         * @param maximumAutomaticAttempts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#maximum_automatic_attempts ConfigRemediationConfiguration#maximum_automatic_attempts}. This parameter is required.
         */
        public Builder maximumAutomaticAttempts(final java.lang.Number maximumAutomaticAttempts) {
            this.config.maximumAutomaticAttempts(maximumAutomaticAttempts);
            return this;
        }

        /**
         * parameter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#parameter ConfigRemediationConfiguration#parameter}
         * <p>
         * @return {@code this}
         * @param parameter parameter block. This parameter is required.
         */
        public Builder parameter(final com.hashicorp.cdktf.IResolvable parameter) {
            this.config.parameter(parameter);
            return this;
        }
        /**
         * parameter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#parameter ConfigRemediationConfiguration#parameter}
         * <p>
         * @return {@code this}
         * @param parameter parameter block. This parameter is required.
         */
        public Builder parameter(final java.util.List<? extends imports.aws.config.ConfigRemediationConfigurationParameter> parameter) {
            this.config.parameter(parameter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#resource_type ConfigRemediationConfiguration#resource_type}.
         * <p>
         * @return {@code this}
         * @param resourceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#resource_type ConfigRemediationConfiguration#resource_type}. This parameter is required.
         */
        public Builder resourceType(final java.lang.String resourceType) {
            this.config.resourceType(resourceType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#retry_attempt_seconds ConfigRemediationConfiguration#retry_attempt_seconds}.
         * <p>
         * @return {@code this}
         * @param retryAttemptSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#retry_attempt_seconds ConfigRemediationConfiguration#retry_attempt_seconds}. This parameter is required.
         */
        public Builder retryAttemptSeconds(final java.lang.Number retryAttemptSeconds) {
            this.config.retryAttemptSeconds(retryAttemptSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#target_version ConfigRemediationConfiguration#target_version}.
         * <p>
         * @return {@code this}
         * @param targetVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_remediation_configuration#target_version ConfigRemediationConfiguration#target_version}. This parameter is required.
         */
        public Builder targetVersion(final java.lang.String targetVersion) {
            this.config.targetVersion(targetVersion);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.config.ConfigRemediationConfiguration}.
         */
        @Override
        public imports.aws.config.ConfigRemediationConfiguration build() {
            return new imports.aws.config.ConfigRemediationConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
