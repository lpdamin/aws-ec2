package imports.aws.lex;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lex_bot aws_lex_bot}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.741Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexBot")
public class LexBot extends com.hashicorp.cdktf.TerraformResource {

    protected LexBot(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LexBot(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lex.LexBot.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lex_bot aws_lex_bot} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LexBot(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAbortStatement(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotAbortStatement value) {
        software.amazon.jsii.Kernel.call(this, "putAbortStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putClarificationPrompt(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotClarificationPrompt value) {
        software.amazon.jsii.Kernel.call(this, "putClarificationPrompt", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIntent(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putIntent", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetClarificationPrompt() {
        software.amazon.jsii.Kernel.call(this, "resetClarificationPrompt", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreateVersion() {
        software.amazon.jsii.Kernel.call(this, "resetCreateVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDetectSentiment() {
        software.amazon.jsii.Kernel.call(this, "resetDetectSentiment", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnableModelImprovements() {
        software.amazon.jsii.Kernel.call(this, "resetEnableModelImprovements", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdleSessionTtlInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetIdleSessionTtlInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocale() {
        software.amazon.jsii.Kernel.call(this, "resetLocale", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNluIntentConfidenceThreshold() {
        software.amazon.jsii.Kernel.call(this, "resetNluIntentConfidenceThreshold", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProcessBehavior() {
        software.amazon.jsii.Kernel.call(this, "resetProcessBehavior", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVoiceId() {
        software.amazon.jsii.Kernel.call(this, "resetVoiceId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotAbortStatementOutputReference getAbortStatement() {
        return software.amazon.jsii.Kernel.get(this, "abortStatement", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotAbortStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getChecksum() {
        return software.amazon.jsii.Kernel.get(this, "checksum", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotClarificationPromptOutputReference getClarificationPrompt() {
        return software.amazon.jsii.Kernel.get(this, "clarificationPrompt", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotClarificationPromptOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedDate() {
        return software.amazon.jsii.Kernel.get(this, "createdDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFailureReason() {
        return software.amazon.jsii.Kernel.get(this, "failureReason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotIntentList getIntent() {
        return software.amazon.jsii.Kernel.get(this, "intent", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotIntentList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastUpdatedDate() {
        return software.amazon.jsii.Kernel.get(this, "lastUpdatedDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexBotTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexBotAbortStatement getAbortStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "abortStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotAbortStatement.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getChildDirectedInput() {
        return software.amazon.jsii.Kernel.get(this, "childDirectedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexBotClarificationPrompt getClarificationPromptInput() {
        return software.amazon.jsii.Kernel.get(this, "clarificationPromptInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexBotClarificationPrompt.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCreateVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "createVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDetectSentimentInput() {
        return software.amazon.jsii.Kernel.get(this, "detectSentimentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableModelImprovementsInput() {
        return software.amazon.jsii.Kernel.get(this, "enableModelImprovementsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getIdleSessionTtlInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "idleSessionTtlInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIntentInput() {
        return software.amazon.jsii.Kernel.get(this, "intentInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocaleInput() {
        return software.amazon.jsii.Kernel.get(this, "localeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getNluIntentConfidenceThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "nluIntentConfidenceThresholdInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProcessBehaviorInput() {
        return software.amazon.jsii.Kernel.get(this, "processBehaviorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVoiceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "voiceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getChildDirected() {
        return software.amazon.jsii.Kernel.get(this, "childDirected", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setChildDirected(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "childDirected", java.util.Objects.requireNonNull(value, "childDirected is required"));
    }

    public void setChildDirected(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "childDirected", java.util.Objects.requireNonNull(value, "childDirected is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getCreateVersion() {
        return software.amazon.jsii.Kernel.get(this, "createVersion", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setCreateVersion(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "createVersion", java.util.Objects.requireNonNull(value, "createVersion is required"));
    }

    public void setCreateVersion(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "createVersion", java.util.Objects.requireNonNull(value, "createVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDetectSentiment() {
        return software.amazon.jsii.Kernel.get(this, "detectSentiment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDetectSentiment(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "detectSentiment", java.util.Objects.requireNonNull(value, "detectSentiment is required"));
    }

    public void setDetectSentiment(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "detectSentiment", java.util.Objects.requireNonNull(value, "detectSentiment is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnableModelImprovements() {
        return software.amazon.jsii.Kernel.get(this, "enableModelImprovements", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnableModelImprovements(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enableModelImprovements", java.util.Objects.requireNonNull(value, "enableModelImprovements is required"));
    }

    public void setEnableModelImprovements(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enableModelImprovements", java.util.Objects.requireNonNull(value, "enableModelImprovements is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getIdleSessionTtlInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "idleSessionTtlInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setIdleSessionTtlInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "idleSessionTtlInSeconds", java.util.Objects.requireNonNull(value, "idleSessionTtlInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocale() {
        return software.amazon.jsii.Kernel.get(this, "locale", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocale(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "locale", java.util.Objects.requireNonNull(value, "locale is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNluIntentConfidenceThreshold() {
        return software.amazon.jsii.Kernel.get(this, "nluIntentConfidenceThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setNluIntentConfidenceThreshold(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "nluIntentConfidenceThreshold", java.util.Objects.requireNonNull(value, "nluIntentConfidenceThreshold is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProcessBehavior() {
        return software.amazon.jsii.Kernel.get(this, "processBehavior", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProcessBehavior(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "processBehavior", java.util.Objects.requireNonNull(value, "processBehavior is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVoiceId() {
        return software.amazon.jsii.Kernel.get(this, "voiceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVoiceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "voiceId", java.util.Objects.requireNonNull(value, "voiceId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lex.LexBot}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lex.LexBot> {
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
        private final imports.aws.lex.LexBotConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.lex.LexBotConfig.Builder();
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
         * abort_statement block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#abort_statement LexBot#abort_statement}
         * <p>
         * @return {@code this}
         * @param abortStatement abort_statement block. This parameter is required.
         */
        public Builder abortStatement(final imports.aws.lex.LexBotAbortStatement abortStatement) {
            this.config.abortStatement(abortStatement);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#child_directed LexBot#child_directed}.
         * <p>
         * @return {@code this}
         * @param childDirected Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#child_directed LexBot#child_directed}. This parameter is required.
         */
        public Builder childDirected(final java.lang.Boolean childDirected) {
            this.config.childDirected(childDirected);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#child_directed LexBot#child_directed}.
         * <p>
         * @return {@code this}
         * @param childDirected Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#child_directed LexBot#child_directed}. This parameter is required.
         */
        public Builder childDirected(final com.hashicorp.cdktf.IResolvable childDirected) {
            this.config.childDirected(childDirected);
            return this;
        }

        /**
         * intent block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#intent LexBot#intent}
         * <p>
         * @return {@code this}
         * @param intent intent block. This parameter is required.
         */
        public Builder intent(final com.hashicorp.cdktf.IResolvable intent) {
            this.config.intent(intent);
            return this;
        }
        /**
         * intent block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#intent LexBot#intent}
         * <p>
         * @return {@code this}
         * @param intent intent block. This parameter is required.
         */
        public Builder intent(final java.util.List<? extends imports.aws.lex.LexBotIntent> intent) {
            this.config.intent(intent);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#name LexBot#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#name LexBot#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * clarification_prompt block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#clarification_prompt LexBot#clarification_prompt}
         * <p>
         * @return {@code this}
         * @param clarificationPrompt clarification_prompt block. This parameter is required.
         */
        public Builder clarificationPrompt(final imports.aws.lex.LexBotClarificationPrompt clarificationPrompt) {
            this.config.clarificationPrompt(clarificationPrompt);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#create_version LexBot#create_version}.
         * <p>
         * @return {@code this}
         * @param createVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#create_version LexBot#create_version}. This parameter is required.
         */
        public Builder createVersion(final java.lang.Boolean createVersion) {
            this.config.createVersion(createVersion);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#create_version LexBot#create_version}.
         * <p>
         * @return {@code this}
         * @param createVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#create_version LexBot#create_version}. This parameter is required.
         */
        public Builder createVersion(final com.hashicorp.cdktf.IResolvable createVersion) {
            this.config.createVersion(createVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#description LexBot#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#description LexBot#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#detect_sentiment LexBot#detect_sentiment}.
         * <p>
         * @return {@code this}
         * @param detectSentiment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#detect_sentiment LexBot#detect_sentiment}. This parameter is required.
         */
        public Builder detectSentiment(final java.lang.Boolean detectSentiment) {
            this.config.detectSentiment(detectSentiment);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#detect_sentiment LexBot#detect_sentiment}.
         * <p>
         * @return {@code this}
         * @param detectSentiment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#detect_sentiment LexBot#detect_sentiment}. This parameter is required.
         */
        public Builder detectSentiment(final com.hashicorp.cdktf.IResolvable detectSentiment) {
            this.config.detectSentiment(detectSentiment);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#enable_model_improvements LexBot#enable_model_improvements}.
         * <p>
         * @return {@code this}
         * @param enableModelImprovements Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#enable_model_improvements LexBot#enable_model_improvements}. This parameter is required.
         */
        public Builder enableModelImprovements(final java.lang.Boolean enableModelImprovements) {
            this.config.enableModelImprovements(enableModelImprovements);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#enable_model_improvements LexBot#enable_model_improvements}.
         * <p>
         * @return {@code this}
         * @param enableModelImprovements Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#enable_model_improvements LexBot#enable_model_improvements}. This parameter is required.
         */
        public Builder enableModelImprovements(final com.hashicorp.cdktf.IResolvable enableModelImprovements) {
            this.config.enableModelImprovements(enableModelImprovements);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#id LexBot#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#id LexBot#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#idle_session_ttl_in_seconds LexBot#idle_session_ttl_in_seconds}.
         * <p>
         * @return {@code this}
         * @param idleSessionTtlInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#idle_session_ttl_in_seconds LexBot#idle_session_ttl_in_seconds}. This parameter is required.
         */
        public Builder idleSessionTtlInSeconds(final java.lang.Number idleSessionTtlInSeconds) {
            this.config.idleSessionTtlInSeconds(idleSessionTtlInSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#locale LexBot#locale}.
         * <p>
         * @return {@code this}
         * @param locale Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#locale LexBot#locale}. This parameter is required.
         */
        public Builder locale(final java.lang.String locale) {
            this.config.locale(locale);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#nlu_intent_confidence_threshold LexBot#nlu_intent_confidence_threshold}.
         * <p>
         * @return {@code this}
         * @param nluIntentConfidenceThreshold Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#nlu_intent_confidence_threshold LexBot#nlu_intent_confidence_threshold}. This parameter is required.
         */
        public Builder nluIntentConfidenceThreshold(final java.lang.Number nluIntentConfidenceThreshold) {
            this.config.nluIntentConfidenceThreshold(nluIntentConfidenceThreshold);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#process_behavior LexBot#process_behavior}.
         * <p>
         * @return {@code this}
         * @param processBehavior Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#process_behavior LexBot#process_behavior}. This parameter is required.
         */
        public Builder processBehavior(final java.lang.String processBehavior) {
            this.config.processBehavior(processBehavior);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_bot#timeouts LexBot#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.lex.LexBotTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#voice_id LexBot#voice_id}.
         * <p>
         * @return {@code this}
         * @param voiceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_bot#voice_id LexBot#voice_id}. This parameter is required.
         */
        public Builder voiceId(final java.lang.String voiceId) {
            this.config.voiceId(voiceId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lex.LexBot}.
         */
        @Override
        public imports.aws.lex.LexBot build() {
            return new imports.aws.lex.LexBot(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
