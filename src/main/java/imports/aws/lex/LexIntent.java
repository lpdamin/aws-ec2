package imports.aws.lex;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lex_intent aws_lex_intent}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.839Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lex.LexIntent")
public class LexIntent extends com.hashicorp.cdktf.TerraformResource {

    protected LexIntent(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LexIntent(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lex.LexIntent.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lex_intent aws_lex_intent} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LexIntent(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putConclusionStatement(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentConclusionStatement value) {
        software.amazon.jsii.Kernel.call(this, "putConclusionStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putConfirmationPrompt(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentConfirmationPrompt value) {
        software.amazon.jsii.Kernel.call(this, "putConfirmationPrompt", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDialogCodeHook(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentDialogCodeHook value) {
        software.amazon.jsii.Kernel.call(this, "putDialogCodeHook", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFollowUpPrompt(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFollowUpPrompt value) {
        software.amazon.jsii.Kernel.call(this, "putFollowUpPrompt", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFulfillmentActivity(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFulfillmentActivity value) {
        software.amazon.jsii.Kernel.call(this, "putFulfillmentActivity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRejectionStatement(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentRejectionStatement value) {
        software.amazon.jsii.Kernel.call(this, "putRejectionStatement", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSlot(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSlot", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetConclusionStatement() {
        software.amazon.jsii.Kernel.call(this, "resetConclusionStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetConfirmationPrompt() {
        software.amazon.jsii.Kernel.call(this, "resetConfirmationPrompt", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreateVersion() {
        software.amazon.jsii.Kernel.call(this, "resetCreateVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDialogCodeHook() {
        software.amazon.jsii.Kernel.call(this, "resetDialogCodeHook", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFollowUpPrompt() {
        software.amazon.jsii.Kernel.call(this, "resetFollowUpPrompt", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParentIntentSignature() {
        software.amazon.jsii.Kernel.call(this, "resetParentIntentSignature", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRejectionStatement() {
        software.amazon.jsii.Kernel.call(this, "resetRejectionStatement", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSampleUtterances() {
        software.amazon.jsii.Kernel.call(this, "resetSampleUtterances", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSlot() {
        software.amazon.jsii.Kernel.call(this, "resetSlot", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getChecksum() {
        return software.amazon.jsii.Kernel.get(this, "checksum", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentConclusionStatementOutputReference getConclusionStatement() {
        return software.amazon.jsii.Kernel.get(this, "conclusionStatement", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentConclusionStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentConfirmationPromptOutputReference getConfirmationPrompt() {
        return software.amazon.jsii.Kernel.get(this, "confirmationPrompt", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentConfirmationPromptOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedDate() {
        return software.amazon.jsii.Kernel.get(this, "createdDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentDialogCodeHookOutputReference getDialogCodeHook() {
        return software.amazon.jsii.Kernel.get(this, "dialogCodeHook", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentDialogCodeHookOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFollowUpPromptOutputReference getFollowUpPrompt() {
        return software.amazon.jsii.Kernel.get(this, "followUpPrompt", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFollowUpPromptOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentFulfillmentActivityOutputReference getFulfillmentActivity() {
        return software.amazon.jsii.Kernel.get(this, "fulfillmentActivity", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFulfillmentActivityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastUpdatedDate() {
        return software.amazon.jsii.Kernel.get(this, "lastUpdatedDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentRejectionStatementOutputReference getRejectionStatement() {
        return software.amazon.jsii.Kernel.get(this, "rejectionStatement", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentRejectionStatementOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentSlotList getSlot() {
        return software.amazon.jsii.Kernel.get(this, "slot", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentSlotList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lex.LexIntentTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersion() {
        return software.amazon.jsii.Kernel.get(this, "version", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentConclusionStatement getConclusionStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "conclusionStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentConclusionStatement.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentConfirmationPrompt getConfirmationPromptInput() {
        return software.amazon.jsii.Kernel.get(this, "confirmationPromptInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentConfirmationPrompt.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCreateVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "createVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentDialogCodeHook getDialogCodeHookInput() {
        return software.amazon.jsii.Kernel.get(this, "dialogCodeHookInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentDialogCodeHook.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentFollowUpPrompt getFollowUpPromptInput() {
        return software.amazon.jsii.Kernel.get(this, "followUpPromptInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFollowUpPrompt.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentFulfillmentActivity getFulfillmentActivityInput() {
        return software.amazon.jsii.Kernel.get(this, "fulfillmentActivityInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentFulfillmentActivity.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getParentIntentSignatureInput() {
        return software.amazon.jsii.Kernel.get(this, "parentIntentSignatureInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lex.LexIntentRejectionStatement getRejectionStatementInput() {
        return software.amazon.jsii.Kernel.get(this, "rejectionStatementInput", software.amazon.jsii.NativeType.forClass(imports.aws.lex.LexIntentRejectionStatement.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSampleUtterancesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "sampleUtterancesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSlotInput() {
        return software.amazon.jsii.Kernel.get(this, "slotInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getParentIntentSignature() {
        return software.amazon.jsii.Kernel.get(this, "parentIntentSignature", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setParentIntentSignature(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "parentIntentSignature", java.util.Objects.requireNonNull(value, "parentIntentSignature is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSampleUtterances() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "sampleUtterances", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSampleUtterances(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "sampleUtterances", java.util.Objects.requireNonNull(value, "sampleUtterances is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lex.LexIntent}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lex.LexIntent> {
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
        private final imports.aws.lex.LexIntentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.lex.LexIntentConfig.Builder();
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
         * fulfillment_activity block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#fulfillment_activity LexIntent#fulfillment_activity}
         * <p>
         * @return {@code this}
         * @param fulfillmentActivity fulfillment_activity block. This parameter is required.
         */
        public Builder fulfillmentActivity(final imports.aws.lex.LexIntentFulfillmentActivity fulfillmentActivity) {
            this.config.fulfillmentActivity(fulfillmentActivity);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#name LexIntent#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#name LexIntent#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * conclusion_statement block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#conclusion_statement LexIntent#conclusion_statement}
         * <p>
         * @return {@code this}
         * @param conclusionStatement conclusion_statement block. This parameter is required.
         */
        public Builder conclusionStatement(final imports.aws.lex.LexIntentConclusionStatement conclusionStatement) {
            this.config.conclusionStatement(conclusionStatement);
            return this;
        }

        /**
         * confirmation_prompt block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#confirmation_prompt LexIntent#confirmation_prompt}
         * <p>
         * @return {@code this}
         * @param confirmationPrompt confirmation_prompt block. This parameter is required.
         */
        public Builder confirmationPrompt(final imports.aws.lex.LexIntentConfirmationPrompt confirmationPrompt) {
            this.config.confirmationPrompt(confirmationPrompt);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#create_version LexIntent#create_version}.
         * <p>
         * @return {@code this}
         * @param createVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#create_version LexIntent#create_version}. This parameter is required.
         */
        public Builder createVersion(final java.lang.Boolean createVersion) {
            this.config.createVersion(createVersion);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#create_version LexIntent#create_version}.
         * <p>
         * @return {@code this}
         * @param createVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#create_version LexIntent#create_version}. This parameter is required.
         */
        public Builder createVersion(final com.hashicorp.cdktf.IResolvable createVersion) {
            this.config.createVersion(createVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#description LexIntent#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#description LexIntent#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * dialog_code_hook block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#dialog_code_hook LexIntent#dialog_code_hook}
         * <p>
         * @return {@code this}
         * @param dialogCodeHook dialog_code_hook block. This parameter is required.
         */
        public Builder dialogCodeHook(final imports.aws.lex.LexIntentDialogCodeHook dialogCodeHook) {
            this.config.dialogCodeHook(dialogCodeHook);
            return this;
        }

        /**
         * follow_up_prompt block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#follow_up_prompt LexIntent#follow_up_prompt}
         * <p>
         * @return {@code this}
         * @param followUpPrompt follow_up_prompt block. This parameter is required.
         */
        public Builder followUpPrompt(final imports.aws.lex.LexIntentFollowUpPrompt followUpPrompt) {
            this.config.followUpPrompt(followUpPrompt);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#id LexIntent#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#id LexIntent#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#parent_intent_signature LexIntent#parent_intent_signature}.
         * <p>
         * @return {@code this}
         * @param parentIntentSignature Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#parent_intent_signature LexIntent#parent_intent_signature}. This parameter is required.
         */
        public Builder parentIntentSignature(final java.lang.String parentIntentSignature) {
            this.config.parentIntentSignature(parentIntentSignature);
            return this;
        }

        /**
         * rejection_statement block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#rejection_statement LexIntent#rejection_statement}
         * <p>
         * @return {@code this}
         * @param rejectionStatement rejection_statement block. This parameter is required.
         */
        public Builder rejectionStatement(final imports.aws.lex.LexIntentRejectionStatement rejectionStatement) {
            this.config.rejectionStatement(rejectionStatement);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#sample_utterances LexIntent#sample_utterances}.
         * <p>
         * @return {@code this}
         * @param sampleUtterances Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lex_intent#sample_utterances LexIntent#sample_utterances}. This parameter is required.
         */
        public Builder sampleUtterances(final java.util.List<java.lang.String> sampleUtterances) {
            this.config.sampleUtterances(sampleUtterances);
            return this;
        }

        /**
         * slot block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#slot LexIntent#slot}
         * <p>
         * @return {@code this}
         * @param slot slot block. This parameter is required.
         */
        public Builder slot(final com.hashicorp.cdktf.IResolvable slot) {
            this.config.slot(slot);
            return this;
        }
        /**
         * slot block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#slot LexIntent#slot}
         * <p>
         * @return {@code this}
         * @param slot slot block. This parameter is required.
         */
        public Builder slot(final java.util.List<? extends imports.aws.lex.LexIntentSlot> slot) {
            this.config.slot(slot);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lex_intent#timeouts LexIntent#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.lex.LexIntentTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lex.LexIntent}.
         */
        @Override
        public imports.aws.lex.LexIntent build() {
            return new imports.aws.lex.LexIntent(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
