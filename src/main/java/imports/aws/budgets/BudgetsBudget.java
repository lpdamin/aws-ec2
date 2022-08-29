package imports.aws.budgets;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget aws_budgets_budget}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.889Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.budgets.BudgetsBudget")
public class BudgetsBudget extends com.hashicorp.cdktf.TerraformResource {

    protected BudgetsBudget(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BudgetsBudget(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.budgets.BudgetsBudget.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget aws_budgets_budget} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public BudgetsBudget(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCostFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCostFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCostTypes(final @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetCostTypes value) {
        software.amazon.jsii.Kernel.call(this, "putCostTypes", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNotification(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putNotification", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccountId() {
        software.amazon.jsii.Kernel.call(this, "resetAccountId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCostFilter() {
        software.amazon.jsii.Kernel.call(this, "resetCostFilter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCostFilters() {
        software.amazon.jsii.Kernel.call(this, "resetCostFilters", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCostTypes() {
        software.amazon.jsii.Kernel.call(this, "resetCostTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetName() {
        software.amazon.jsii.Kernel.call(this, "resetName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNamePrefix() {
        software.amazon.jsii.Kernel.call(this, "resetNamePrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNotification() {
        software.amazon.jsii.Kernel.call(this, "resetNotification", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimePeriodEnd() {
        software.amazon.jsii.Kernel.call(this, "resetTimePeriodEnd", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimePeriodStart() {
        software.amazon.jsii.Kernel.call(this, "resetTimePeriodStart", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetCostFilterList getCostFilter() {
        return software.amazon.jsii.Kernel.get(this, "costFilter", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetCostFilterList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetCostTypesOutputReference getCostTypes() {
        return software.amazon.jsii.Kernel.get(this, "costTypes", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetCostTypesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.budgets.BudgetsBudgetNotificationList getNotification() {
        return software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetNotificationList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAccountIdInput() {
        return software.amazon.jsii.Kernel.get(this, "accountIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBudgetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "budgetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCostFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "costFilterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCostFiltersInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "costFiltersInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.budgets.BudgetsBudgetCostTypes getCostTypesInput() {
        return software.amazon.jsii.Kernel.get(this, "costTypesInput", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetCostTypes.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLimitAmountInput() {
        return software.amazon.jsii.Kernel.get(this, "limitAmountInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLimitUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "limitUnitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNamePrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "namePrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimePeriodEndInput() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodEndInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimePeriodStartInput() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodStartInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTimeUnitInput() {
        return software.amazon.jsii.Kernel.get(this, "timeUnitInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountId() {
        return software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccountId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accountId", java.util.Objects.requireNonNull(value, "accountId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBudgetType() {
        return software.amazon.jsii.Kernel.get(this, "budgetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBudgetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "budgetType", java.util.Objects.requireNonNull(value, "budgetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getCostFilters() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "costFilters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setCostFilters(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "costFilters", java.util.Objects.requireNonNull(value, "costFilters is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitAmount() {
        return software.amazon.jsii.Kernel.get(this, "limitAmount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLimitAmount(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "limitAmount", java.util.Objects.requireNonNull(value, "limitAmount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitUnit() {
        return software.amazon.jsii.Kernel.get(this, "limitUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLimitUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "limitUnit", java.util.Objects.requireNonNull(value, "limitUnit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNamePrefix() {
        return software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNamePrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "namePrefix", java.util.Objects.requireNonNull(value, "namePrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimePeriodEnd() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodEnd", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimePeriodEnd(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timePeriodEnd", java.util.Objects.requireNonNull(value, "timePeriodEnd is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimePeriodStart() {
        return software.amazon.jsii.Kernel.get(this, "timePeriodStart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimePeriodStart(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timePeriodStart", java.util.Objects.requireNonNull(value, "timePeriodStart is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTimeUnit() {
        return software.amazon.jsii.Kernel.get(this, "timeUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTimeUnit(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "timeUnit", java.util.Objects.requireNonNull(value, "timeUnit is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.budgets.BudgetsBudget}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.budgets.BudgetsBudget> {
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
        private final imports.aws.budgets.BudgetsBudgetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.budgets.BudgetsBudgetConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#budget_type BudgetsBudget#budget_type}.
         * <p>
         * @return {@code this}
         * @param budgetType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#budget_type BudgetsBudget#budget_type}. This parameter is required.
         */
        public Builder budgetType(final java.lang.String budgetType) {
            this.config.budgetType(budgetType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_amount BudgetsBudget#limit_amount}.
         * <p>
         * @return {@code this}
         * @param limitAmount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_amount BudgetsBudget#limit_amount}. This parameter is required.
         */
        public Builder limitAmount(final java.lang.String limitAmount) {
            this.config.limitAmount(limitAmount);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_unit BudgetsBudget#limit_unit}.
         * <p>
         * @return {@code this}
         * @param limitUnit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_unit BudgetsBudget#limit_unit}. This parameter is required.
         */
        public Builder limitUnit(final java.lang.String limitUnit) {
            this.config.limitUnit(limitUnit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_unit BudgetsBudget#time_unit}.
         * <p>
         * @return {@code this}
         * @param timeUnit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_unit BudgetsBudget#time_unit}. This parameter is required.
         */
        public Builder timeUnit(final java.lang.String timeUnit) {
            this.config.timeUnit(timeUnit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#account_id BudgetsBudget#account_id}.
         * <p>
         * @return {@code this}
         * @param accountId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#account_id BudgetsBudget#account_id}. This parameter is required.
         */
        public Builder accountId(final java.lang.String accountId) {
            this.config.accountId(accountId);
            return this;
        }

        /**
         * cost_filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filter BudgetsBudget#cost_filter}
         * <p>
         * @return {@code this}
         * @param costFilter cost_filter block. This parameter is required.
         */
        public Builder costFilter(final com.hashicorp.cdktf.IResolvable costFilter) {
            this.config.costFilter(costFilter);
            return this;
        }
        /**
         * cost_filter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filter BudgetsBudget#cost_filter}
         * <p>
         * @return {@code this}
         * @param costFilter cost_filter block. This parameter is required.
         */
        public Builder costFilter(final java.util.List<? extends imports.aws.budgets.BudgetsBudgetCostFilter> costFilter) {
            this.config.costFilter(costFilter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filters BudgetsBudget#cost_filters}.
         * <p>
         * @return {@code this}
         * @param costFilters Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filters BudgetsBudget#cost_filters}. This parameter is required.
         */
        public Builder costFilters(final java.util.Map<java.lang.String, java.lang.String> costFilters) {
            this.config.costFilters(costFilters);
            return this;
        }

        /**
         * cost_types block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_types BudgetsBudget#cost_types}
         * <p>
         * @return {@code this}
         * @param costTypes cost_types block. This parameter is required.
         */
        public Builder costTypes(final imports.aws.budgets.BudgetsBudgetCostTypes costTypes) {
            this.config.costTypes(costTypes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#id BudgetsBudget#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#id BudgetsBudget#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name BudgetsBudget#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name BudgetsBudget#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name_prefix BudgetsBudget#name_prefix}.
         * <p>
         * @return {@code this}
         * @param namePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name_prefix BudgetsBudget#name_prefix}. This parameter is required.
         */
        public Builder namePrefix(final java.lang.String namePrefix) {
            this.config.namePrefix(namePrefix);
            return this;
        }

        /**
         * notification block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#notification BudgetsBudget#notification}
         * <p>
         * @return {@code this}
         * @param notification notification block. This parameter is required.
         */
        public Builder notification(final com.hashicorp.cdktf.IResolvable notification) {
            this.config.notification(notification);
            return this;
        }
        /**
         * notification block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#notification BudgetsBudget#notification}
         * <p>
         * @return {@code this}
         * @param notification notification block. This parameter is required.
         */
        public Builder notification(final java.util.List<? extends imports.aws.budgets.BudgetsBudgetNotification> notification) {
            this.config.notification(notification);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_end BudgetsBudget#time_period_end}.
         * <p>
         * @return {@code this}
         * @param timePeriodEnd Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_end BudgetsBudget#time_period_end}. This parameter is required.
         */
        public Builder timePeriodEnd(final java.lang.String timePeriodEnd) {
            this.config.timePeriodEnd(timePeriodEnd);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_start BudgetsBudget#time_period_start}.
         * <p>
         * @return {@code this}
         * @param timePeriodStart Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_start BudgetsBudget#time_period_start}. This parameter is required.
         */
        public Builder timePeriodStart(final java.lang.String timePeriodStart) {
            this.config.timePeriodStart(timePeriodStart);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.budgets.BudgetsBudget}.
         */
        @Override
        public imports.aws.budgets.BudgetsBudget build() {
            return new imports.aws.budgets.BudgetsBudget(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
