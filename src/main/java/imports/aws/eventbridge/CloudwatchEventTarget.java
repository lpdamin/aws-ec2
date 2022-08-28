package imports.aws.eventbridge;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target aws_cloudwatch_event_target}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.089Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventTarget")
public class CloudwatchEventTarget extends com.hashicorp.cdktf.TerraformResource {

    protected CloudwatchEventTarget(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchEventTarget(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.eventbridge.CloudwatchEventTarget.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target aws_cloudwatch_event_target} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CloudwatchEventTarget(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putBatchTarget(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetBatchTarget value) {
        software.amazon.jsii.Kernel.call(this, "putBatchTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDeadLetterConfig(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetDeadLetterConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDeadLetterConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEcsTarget(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetEcsTarget value) {
        software.amazon.jsii.Kernel.call(this, "putEcsTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttpTarget(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetHttpTarget value) {
        software.amazon.jsii.Kernel.call(this, "putHttpTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInputTransformer(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetInputTransformer value) {
        software.amazon.jsii.Kernel.call(this, "putInputTransformer", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKinesisTarget(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetKinesisTarget value) {
        software.amazon.jsii.Kernel.call(this, "putKinesisTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedshiftTarget(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetRedshiftTarget value) {
        software.amazon.jsii.Kernel.call(this, "putRedshiftTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRetryPolicy(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetRetryPolicy value) {
        software.amazon.jsii.Kernel.call(this, "putRetryPolicy", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRunCommandTargets(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRunCommandTargets", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSqsTarget(final @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetSqsTarget value) {
        software.amazon.jsii.Kernel.call(this, "putSqsTarget", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBatchTarget() {
        software.amazon.jsii.Kernel.call(this, "resetBatchTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeadLetterConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDeadLetterConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEcsTarget() {
        software.amazon.jsii.Kernel.call(this, "resetEcsTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventBusName() {
        software.amazon.jsii.Kernel.call(this, "resetEventBusName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttpTarget() {
        software.amazon.jsii.Kernel.call(this, "resetHttpTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInput() {
        software.amazon.jsii.Kernel.call(this, "resetInput", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputPath() {
        software.amazon.jsii.Kernel.call(this, "resetInputPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputTransformer() {
        software.amazon.jsii.Kernel.call(this, "resetInputTransformer", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesisTarget() {
        software.amazon.jsii.Kernel.call(this, "resetKinesisTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedshiftTarget() {
        software.amazon.jsii.Kernel.call(this, "resetRedshiftTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRetryPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetRetryPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetRoleArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRunCommandTargets() {
        software.amazon.jsii.Kernel.call(this, "resetRunCommandTargets", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqsTarget() {
        software.amazon.jsii.Kernel.call(this, "resetSqsTarget", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetId() {
        software.amazon.jsii.Kernel.call(this, "resetTargetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetBatchTargetOutputReference getBatchTarget() {
        return software.amazon.jsii.Kernel.get(this, "batchTarget", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetBatchTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetDeadLetterConfigOutputReference getDeadLetterConfig() {
        return software.amazon.jsii.Kernel.get(this, "deadLetterConfig", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetDeadLetterConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetEcsTargetOutputReference getEcsTarget() {
        return software.amazon.jsii.Kernel.get(this, "ecsTarget", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetEcsTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetHttpTargetOutputReference getHttpTarget() {
        return software.amazon.jsii.Kernel.get(this, "httpTarget", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetHttpTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetInputTransformerOutputReference getInputTransformer() {
        return software.amazon.jsii.Kernel.get(this, "inputTransformer", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetInputTransformerOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetKinesisTargetOutputReference getKinesisTarget() {
        return software.amazon.jsii.Kernel.get(this, "kinesisTarget", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetKinesisTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetRedshiftTargetOutputReference getRedshiftTarget() {
        return software.amazon.jsii.Kernel.get(this, "redshiftTarget", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetRedshiftTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetRetryPolicyOutputReference getRetryPolicy() {
        return software.amazon.jsii.Kernel.get(this, "retryPolicy", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetRetryPolicyOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetRunCommandTargetsList getRunCommandTargets() {
        return software.amazon.jsii.Kernel.get(this, "runCommandTargets", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetRunCommandTargetsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.eventbridge.CloudwatchEventTargetSqsTargetOutputReference getSqsTarget() {
        return software.amazon.jsii.Kernel.get(this, "sqsTarget", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetSqsTargetOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArnInput() {
        return software.amazon.jsii.Kernel.get(this, "arnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetBatchTarget getBatchTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "batchTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetBatchTarget.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetDeadLetterConfig getDeadLetterConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "deadLetterConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetDeadLetterConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetEcsTarget getEcsTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "ecsTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetEcsTarget.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventBusNameInput() {
        return software.amazon.jsii.Kernel.get(this, "eventBusNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetHttpTarget getHttpTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "httpTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetHttpTarget.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputInput() {
        return software.amazon.jsii.Kernel.get(this, "inputInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getInputPathInput() {
        return software.amazon.jsii.Kernel.get(this, "inputPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetInputTransformer getInputTransformerInput() {
        return software.amazon.jsii.Kernel.get(this, "inputTransformerInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetInputTransformer.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetKinesisTarget getKinesisTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetKinesisTarget.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetRedshiftTarget getRedshiftTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "redshiftTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetRedshiftTarget.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetRetryPolicy getRetryPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "retryPolicyInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetRetryPolicy.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRuleInput() {
        return software.amazon.jsii.Kernel.get(this, "ruleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRunCommandTargetsInput() {
        return software.amazon.jsii.Kernel.get(this, "runCommandTargetsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eventbridge.CloudwatchEventTargetSqsTarget getSqsTargetInput() {
        return software.amazon.jsii.Kernel.get(this, "sqsTargetInput", software.amazon.jsii.NativeType.forClass(imports.aws.eventbridge.CloudwatchEventTargetSqsTarget.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "targetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "arn", java.util.Objects.requireNonNull(value, "arn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventBusName() {
        return software.amazon.jsii.Kernel.get(this, "eventBusName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventBusName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventBusName", java.util.Objects.requireNonNull(value, "eventBusName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInput() {
        return software.amazon.jsii.Kernel.get(this, "input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInput(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "input", java.util.Objects.requireNonNull(value, "input is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getInputPath() {
        return software.amazon.jsii.Kernel.get(this, "inputPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setInputPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "inputPath", java.util.Objects.requireNonNull(value, "inputPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRule() {
        return software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRule(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rule", java.util.Objects.requireNonNull(value, "rule is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetId() {
        return software.amazon.jsii.Kernel.get(this, "targetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetId", java.util.Objects.requireNonNull(value, "targetId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.eventbridge.CloudwatchEventTarget}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.eventbridge.CloudwatchEventTarget> {
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
        private final imports.aws.eventbridge.CloudwatchEventTargetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.eventbridge.CloudwatchEventTargetConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#arn CloudwatchEventTarget#arn}.
         * <p>
         * @return {@code this}
         * @param arn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#arn CloudwatchEventTarget#arn}. This parameter is required.
         */
        public Builder arn(final java.lang.String arn) {
            this.config.arn(arn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#rule CloudwatchEventTarget#rule}.
         * <p>
         * @return {@code this}
         * @param rule Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#rule CloudwatchEventTarget#rule}. This parameter is required.
         */
        public Builder rule(final java.lang.String rule) {
            this.config.rule(rule);
            return this;
        }

        /**
         * batch_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#batch_target CloudwatchEventTarget#batch_target}
         * <p>
         * @return {@code this}
         * @param batchTarget batch_target block. This parameter is required.
         */
        public Builder batchTarget(final imports.aws.eventbridge.CloudwatchEventTargetBatchTarget batchTarget) {
            this.config.batchTarget(batchTarget);
            return this;
        }

        /**
         * dead_letter_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#dead_letter_config CloudwatchEventTarget#dead_letter_config}
         * <p>
         * @return {@code this}
         * @param deadLetterConfig dead_letter_config block. This parameter is required.
         */
        public Builder deadLetterConfig(final imports.aws.eventbridge.CloudwatchEventTargetDeadLetterConfig deadLetterConfig) {
            this.config.deadLetterConfig(deadLetterConfig);
            return this;
        }

        /**
         * ecs_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#ecs_target CloudwatchEventTarget#ecs_target}
         * <p>
         * @return {@code this}
         * @param ecsTarget ecs_target block. This parameter is required.
         */
        public Builder ecsTarget(final imports.aws.eventbridge.CloudwatchEventTargetEcsTarget ecsTarget) {
            this.config.ecsTarget(ecsTarget);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#event_bus_name CloudwatchEventTarget#event_bus_name}.
         * <p>
         * @return {@code this}
         * @param eventBusName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#event_bus_name CloudwatchEventTarget#event_bus_name}. This parameter is required.
         */
        public Builder eventBusName(final java.lang.String eventBusName) {
            this.config.eventBusName(eventBusName);
            return this;
        }

        /**
         * http_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#http_target CloudwatchEventTarget#http_target}
         * <p>
         * @return {@code this}
         * @param httpTarget http_target block. This parameter is required.
         */
        public Builder httpTarget(final imports.aws.eventbridge.CloudwatchEventTargetHttpTarget httpTarget) {
            this.config.httpTarget(httpTarget);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#id CloudwatchEventTarget#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#id CloudwatchEventTarget#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#input CloudwatchEventTarget#input}.
         * <p>
         * @return {@code this}
         * @param input Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#input CloudwatchEventTarget#input}. This parameter is required.
         */
        public Builder input(final java.lang.String input) {
            this.config.input(input);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#input_path CloudwatchEventTarget#input_path}.
         * <p>
         * @return {@code this}
         * @param inputPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#input_path CloudwatchEventTarget#input_path}. This parameter is required.
         */
        public Builder inputPath(final java.lang.String inputPath) {
            this.config.inputPath(inputPath);
            return this;
        }

        /**
         * input_transformer block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#input_transformer CloudwatchEventTarget#input_transformer}
         * <p>
         * @return {@code this}
         * @param inputTransformer input_transformer block. This parameter is required.
         */
        public Builder inputTransformer(final imports.aws.eventbridge.CloudwatchEventTargetInputTransformer inputTransformer) {
            this.config.inputTransformer(inputTransformer);
            return this;
        }

        /**
         * kinesis_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#kinesis_target CloudwatchEventTarget#kinesis_target}
         * <p>
         * @return {@code this}
         * @param kinesisTarget kinesis_target block. This parameter is required.
         */
        public Builder kinesisTarget(final imports.aws.eventbridge.CloudwatchEventTargetKinesisTarget kinesisTarget) {
            this.config.kinesisTarget(kinesisTarget);
            return this;
        }

        /**
         * redshift_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#redshift_target CloudwatchEventTarget#redshift_target}
         * <p>
         * @return {@code this}
         * @param redshiftTarget redshift_target block. This parameter is required.
         */
        public Builder redshiftTarget(final imports.aws.eventbridge.CloudwatchEventTargetRedshiftTarget redshiftTarget) {
            this.config.redshiftTarget(redshiftTarget);
            return this;
        }

        /**
         * retry_policy block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#retry_policy CloudwatchEventTarget#retry_policy}
         * <p>
         * @return {@code this}
         * @param retryPolicy retry_policy block. This parameter is required.
         */
        public Builder retryPolicy(final imports.aws.eventbridge.CloudwatchEventTargetRetryPolicy retryPolicy) {
            this.config.retryPolicy(retryPolicy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#role_arn CloudwatchEventTarget#role_arn}.
         * <p>
         * @return {@code this}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#role_arn CloudwatchEventTarget#role_arn}. This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config.roleArn(roleArn);
            return this;
        }

        /**
         * run_command_targets block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#run_command_targets CloudwatchEventTarget#run_command_targets}
         * <p>
         * @return {@code this}
         * @param runCommandTargets run_command_targets block. This parameter is required.
         */
        public Builder runCommandTargets(final com.hashicorp.cdktf.IResolvable runCommandTargets) {
            this.config.runCommandTargets(runCommandTargets);
            return this;
        }
        /**
         * run_command_targets block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#run_command_targets CloudwatchEventTarget#run_command_targets}
         * <p>
         * @return {@code this}
         * @param runCommandTargets run_command_targets block. This parameter is required.
         */
        public Builder runCommandTargets(final java.util.List<? extends imports.aws.eventbridge.CloudwatchEventTargetRunCommandTargets> runCommandTargets) {
            this.config.runCommandTargets(runCommandTargets);
            return this;
        }

        /**
         * sqs_target block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#sqs_target CloudwatchEventTarget#sqs_target}
         * <p>
         * @return {@code this}
         * @param sqsTarget sqs_target block. This parameter is required.
         */
        public Builder sqsTarget(final imports.aws.eventbridge.CloudwatchEventTargetSqsTarget sqsTarget) {
            this.config.sqsTarget(sqsTarget);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#target_id CloudwatchEventTarget#target_id}.
         * <p>
         * @return {@code this}
         * @param targetId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_target#target_id CloudwatchEventTarget#target_id}. This parameter is required.
         */
        public Builder targetId(final java.lang.String targetId) {
            this.config.targetId(targetId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.eventbridge.CloudwatchEventTarget}.
         */
        @Override
        public imports.aws.eventbridge.CloudwatchEventTarget build() {
            return new imports.aws.eventbridge.CloudwatchEventTarget(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
