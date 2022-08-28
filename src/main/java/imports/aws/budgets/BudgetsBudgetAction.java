package imports.aws.budgets;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action aws_budgets_budget_action}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.064Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.budgets.BudgetsBudgetAction")
public class BudgetsBudgetAction extends com.hashicorp.cdktf.TerraformResource {

    protected BudgetsBudgetAction(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BudgetsBudgetAction(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.budgets.BudgetsBudgetAction.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action aws_budgets_budget_action} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public BudgetsBudgetAction(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetActionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putActionThreshold(final @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetActionActionThreshold value) {
        software.amazon.jsii.Kernel.call(this, "putActionThreshold", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDefinition(final @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetActionDefinition value) {
        software.amazon.jsii.Kernel.call(this, "putDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSubscriber(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSubscriber", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getActionId() {
        return software.amazon.jsii.Kernel.get(this, "actionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetActionActionThresholdOutputReference getActionThreshold() {
        return software.amazon.jsii.Kernel.get(this, "actionThreshold", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetActionActionThresholdOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetActionDefinitionOutputReference getDefinition() {
        return software.amazon.jsii.Kernel.get(this, "definition", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetActionDefinitionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetActionSubscriberList getSubscriber() {
        return software.amazon.jsii.Kernel.get(this, "subscriber", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetActionSubscriberList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "accountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.budgets.BudgetsBudgetActionActionThreshold getActionThresholdInput() {
        return software.amazon.jsii.Kernel.get(this, "actionThresholdInput", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetActionActionThreshold.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getActionTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "actionTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getApprovalModelInput() {
        return software.amazon.jsii.Kernel.get(this, "approvalModelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBudgetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "budgetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.budgets.BudgetsBudgetActionDefinition getDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "definitionInput", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetActionDefinition.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getExecutionRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSubscriberInput() {
        return software.amazon.jsii.Kernel.get(this, "subscriberInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountId() {
        return software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accountId", java.util.Objects.requireNonNull(value, "accountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getActionType() {
        return software.amazon.jsii.Kernel.get(this, "actionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setActionType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "actionType", java.util.Objects.requireNonNull(value, "actionType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getApprovalModel() {
        return software.amazon.jsii.Kernel.get(this, "approvalModel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setApprovalModel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "approvalModel", java.util.Objects.requireNonNull(value, "approvalModel is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBudgetName() {
        return software.amazon.jsii.Kernel.get(this, "budgetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBudgetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "budgetName", java.util.Objects.requireNonNull(value, "budgetName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExecutionRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "executionRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setExecutionRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "executionRoleArn", java.util.Objects.requireNonNull(value, "executionRoleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationType() {
        return software.amazon.jsii.Kernel.get(this, "notificationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationType", java.util.Objects.requireNonNull(value, "notificationType is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.budgets.BudgetsBudgetAction}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.budgets.BudgetsBudgetAction> {
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
        private final imports.aws.budgets.BudgetsBudgetActionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.budgets.BudgetsBudgetActionConfig.Builder();
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
         * action_threshold block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#action_threshold BudgetsBudgetAction#action_threshold}
         * <p>
         * @return {@code this}
         * @param actionThreshold action_threshold block. This parameter is required.
         */
        public Builder actionThreshold(final imports.aws.budgets.BudgetsBudgetActionActionThreshold actionThreshold) {
            this.config.actionThreshold(actionThreshold);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#action_type BudgetsBudgetAction#action_type}.
         * <p>
         * @return {@code this}
         * @param actionType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#action_type BudgetsBudgetAction#action_type}. This parameter is required.
         */
        public Builder actionType(final java.lang.String actionType) {
            this.config.actionType(actionType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#approval_model BudgetsBudgetAction#approval_model}.
         * <p>
         * @return {@code this}
         * @param approvalModel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#approval_model BudgetsBudgetAction#approval_model}. This parameter is required.
         */
        public Builder approvalModel(final java.lang.String approvalModel) {
            this.config.approvalModel(approvalModel);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#budget_name BudgetsBudgetAction#budget_name}.
         * <p>
         * @return {@code this}
         * @param budgetName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#budget_name BudgetsBudgetAction#budget_name}. This parameter is required.
         */
        public Builder budgetName(final java.lang.String budgetName) {
            this.config.budgetName(budgetName);
            return this;
        }

        /**
         * definition block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#definition BudgetsBudgetAction#definition}
         * <p>
         * @return {@code this}
         * @param definition definition block. This parameter is required.
         */
        public Builder definition(final imports.aws.budgets.BudgetsBudgetActionDefinition definition) {
            this.config.definition(definition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#execution_role_arn BudgetsBudgetAction#execution_role_arn}.
         * <p>
         * @return {@code this}
         * @param executionRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#execution_role_arn BudgetsBudgetAction#execution_role_arn}. This parameter is required.
         */
        public Builder executionRoleArn(final java.lang.String executionRoleArn) {
            this.config.executionRoleArn(executionRoleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#notification_type BudgetsBudgetAction#notification_type}.
         * <p>
         * @return {@code this}
         * @param notificationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#notification_type BudgetsBudgetAction#notification_type}. This parameter is required.
         */
        public Builder notificationType(final java.lang.String notificationType) {
            this.config.notificationType(notificationType);
            return this;
        }

        /**
         * subscriber block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#subscriber BudgetsBudgetAction#subscriber}
         * <p>
         * @return {@code this}
         * @param subscriber subscriber block. This parameter is required.
         */
        public Builder subscriber(final com.hashicorp.cdktf.IResolvable subscriber) {
            this.config.subscriber(subscriber);
            return this;
        }
        /**
         * subscriber block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#subscriber BudgetsBudgetAction#subscriber}
         * <p>
         * @return {@code this}
         * @param subscriber subscriber block. This parameter is required.
         */
        public Builder subscriber(final java.util.List<? extends imports.aws.budgets.BudgetsBudgetActionSubscriber> subscriber) {
            this.config.subscriber(subscriber);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#account_id BudgetsBudgetAction#account_id}.
         * <p>
         * @return {@code this}
         * @param accountId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#account_id BudgetsBudgetAction#account_id}. This parameter is required.
         */
        public Builder accountId(final java.lang.String accountId) {
            this.config.accountId(accountId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#id BudgetsBudgetAction#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget_action#id BudgetsBudgetAction#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.budgets.BudgetsBudgetAction}.
         */
        @Override
        public imports.aws.budgets.BudgetsBudgetAction build() {
            return new imports.aws.budgets.BudgetsBudgetAction(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
