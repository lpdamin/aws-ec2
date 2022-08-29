package imports.aws.budgets;

/**
 * AWS Budgets.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.894Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.budgets.BudgetsBudgetConfig")
@software.amazon.jsii.Jsii.Proxy(BudgetsBudgetConfig.Jsii$Proxy.class)
public interface BudgetsBudgetConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#budget_type BudgetsBudget#budget_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getBudgetType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_amount BudgetsBudget#limit_amount}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLimitAmount();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_unit BudgetsBudget#limit_unit}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLimitUnit();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_unit BudgetsBudget#time_unit}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeUnit();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#account_id BudgetsBudget#account_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccountId() {
        return null;
    }

    /**
     * cost_filter block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filter BudgetsBudget#cost_filter}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCostFilter() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filters BudgetsBudget#cost_filters}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getCostFilters() {
        return null;
    }

    /**
     * cost_types block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_types BudgetsBudget#cost_types}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.budgets.BudgetsBudgetCostTypes getCostTypes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#id BudgetsBudget#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name BudgetsBudget#name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name_prefix BudgetsBudget#name_prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNamePrefix() {
        return null;
    }

    /**
     * notification block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#notification BudgetsBudget#notification}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getNotification() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_end BudgetsBudget#time_period_end}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimePeriodEnd() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_start BudgetsBudget#time_period_start}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimePeriodStart() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BudgetsBudgetConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BudgetsBudgetConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BudgetsBudgetConfig> {
        java.lang.String budgetType;
        java.lang.String limitAmount;
        java.lang.String limitUnit;
        java.lang.String timeUnit;
        java.lang.String accountId;
        java.lang.Object costFilter;
        java.util.Map<java.lang.String, java.lang.String> costFilters;
        imports.aws.budgets.BudgetsBudgetCostTypes costTypes;
        java.lang.String id;
        java.lang.String name;
        java.lang.String namePrefix;
        java.lang.Object notification;
        java.lang.String timePeriodEnd;
        java.lang.String timePeriodStart;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getBudgetType}
         * @param budgetType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#budget_type BudgetsBudget#budget_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder budgetType(java.lang.String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getLimitAmount}
         * @param limitAmount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_amount BudgetsBudget#limit_amount}. This parameter is required.
         * @return {@code this}
         */
        public Builder limitAmount(java.lang.String limitAmount) {
            this.limitAmount = limitAmount;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getLimitUnit}
         * @param limitUnit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#limit_unit BudgetsBudget#limit_unit}. This parameter is required.
         * @return {@code this}
         */
        public Builder limitUnit(java.lang.String limitUnit) {
            this.limitUnit = limitUnit;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getTimeUnit}
         * @param timeUnit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_unit BudgetsBudget#time_unit}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeUnit(java.lang.String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getAccountId}
         * @param accountId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#account_id BudgetsBudget#account_id}.
         * @return {@code this}
         */
        public Builder accountId(java.lang.String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCostFilter}
         * @param costFilter cost_filter block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filter BudgetsBudget#cost_filter}
         * @return {@code this}
         */
        public Builder costFilter(com.hashicorp.cdktf.IResolvable costFilter) {
            this.costFilter = costFilter;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCostFilter}
         * @param costFilter cost_filter block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filter BudgetsBudget#cost_filter}
         * @return {@code this}
         */
        public Builder costFilter(java.util.List<? extends imports.aws.budgets.BudgetsBudgetCostFilter> costFilter) {
            this.costFilter = costFilter;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCostFilters}
         * @param costFilters Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_filters BudgetsBudget#cost_filters}.
         * @return {@code this}
         */
        public Builder costFilters(java.util.Map<java.lang.String, java.lang.String> costFilters) {
            this.costFilters = costFilters;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCostTypes}
         * @param costTypes cost_types block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#cost_types BudgetsBudget#cost_types}
         * @return {@code this}
         */
        public Builder costTypes(imports.aws.budgets.BudgetsBudgetCostTypes costTypes) {
            this.costTypes = costTypes;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#id BudgetsBudget#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name BudgetsBudget#name}.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getNamePrefix}
         * @param namePrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#name_prefix BudgetsBudget#name_prefix}.
         * @return {@code this}
         */
        public Builder namePrefix(java.lang.String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getNotification}
         * @param notification notification block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#notification BudgetsBudget#notification}
         * @return {@code this}
         */
        public Builder notification(com.hashicorp.cdktf.IResolvable notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getNotification}
         * @param notification notification block.
         *                     Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/budgets_budget#notification BudgetsBudget#notification}
         * @return {@code this}
         */
        public Builder notification(java.util.List<? extends imports.aws.budgets.BudgetsBudgetNotification> notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getTimePeriodEnd}
         * @param timePeriodEnd Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_end BudgetsBudget#time_period_end}.
         * @return {@code this}
         */
        public Builder timePeriodEnd(java.lang.String timePeriodEnd) {
            this.timePeriodEnd = timePeriodEnd;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getTimePeriodStart}
         * @param timePeriodStart Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/budgets_budget#time_period_start BudgetsBudget#time_period_start}.
         * @return {@code this}
         */
        public Builder timePeriodStart(java.lang.String timePeriodStart) {
            this.timePeriodStart = timePeriodStart;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link BudgetsBudgetConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BudgetsBudgetConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BudgetsBudgetConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BudgetsBudgetConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BudgetsBudgetConfig {
        private final java.lang.String budgetType;
        private final java.lang.String limitAmount;
        private final java.lang.String limitUnit;
        private final java.lang.String timeUnit;
        private final java.lang.String accountId;
        private final java.lang.Object costFilter;
        private final java.util.Map<java.lang.String, java.lang.String> costFilters;
        private final imports.aws.budgets.BudgetsBudgetCostTypes costTypes;
        private final java.lang.String id;
        private final java.lang.String name;
        private final java.lang.String namePrefix;
        private final java.lang.Object notification;
        private final java.lang.String timePeriodEnd;
        private final java.lang.String timePeriodStart;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.budgetType = software.amazon.jsii.Kernel.get(this, "budgetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limitAmount = software.amazon.jsii.Kernel.get(this, "limitAmount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limitUnit = software.amazon.jsii.Kernel.get(this, "limitUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeUnit = software.amazon.jsii.Kernel.get(this, "timeUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accountId = software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.costFilter = software.amazon.jsii.Kernel.get(this, "costFilter", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.costFilters = software.amazon.jsii.Kernel.get(this, "costFilters", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.costTypes = software.amazon.jsii.Kernel.get(this, "costTypes", software.amazon.jsii.NativeType.forClass(imports.aws.budgets.BudgetsBudgetCostTypes.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.namePrefix = software.amazon.jsii.Kernel.get(this, "namePrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.notification = software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timePeriodEnd = software.amazon.jsii.Kernel.get(this, "timePeriodEnd", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timePeriodStart = software.amazon.jsii.Kernel.get(this, "timePeriodStart", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.budgetType = java.util.Objects.requireNonNull(builder.budgetType, "budgetType is required");
            this.limitAmount = java.util.Objects.requireNonNull(builder.limitAmount, "limitAmount is required");
            this.limitUnit = java.util.Objects.requireNonNull(builder.limitUnit, "limitUnit is required");
            this.timeUnit = java.util.Objects.requireNonNull(builder.timeUnit, "timeUnit is required");
            this.accountId = builder.accountId;
            this.costFilter = builder.costFilter;
            this.costFilters = builder.costFilters;
            this.costTypes = builder.costTypes;
            this.id = builder.id;
            this.name = builder.name;
            this.namePrefix = builder.namePrefix;
            this.notification = builder.notification;
            this.timePeriodEnd = builder.timePeriodEnd;
            this.timePeriodStart = builder.timePeriodStart;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getBudgetType() {
            return this.budgetType;
        }

        @Override
        public final java.lang.String getLimitAmount() {
            return this.limitAmount;
        }

        @Override
        public final java.lang.String getLimitUnit() {
            return this.limitUnit;
        }

        @Override
        public final java.lang.String getTimeUnit() {
            return this.timeUnit;
        }

        @Override
        public final java.lang.String getAccountId() {
            return this.accountId;
        }

        @Override
        public final java.lang.Object getCostFilter() {
            return this.costFilter;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getCostFilters() {
            return this.costFilters;
        }

        @Override
        public final imports.aws.budgets.BudgetsBudgetCostTypes getCostTypes() {
            return this.costTypes;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getNamePrefix() {
            return this.namePrefix;
        }

        @Override
        public final java.lang.Object getNotification() {
            return this.notification;
        }

        @Override
        public final java.lang.String getTimePeriodEnd() {
            return this.timePeriodEnd;
        }

        @Override
        public final java.lang.String getTimePeriodStart() {
            return this.timePeriodStart;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("budgetType", om.valueToTree(this.getBudgetType()));
            data.set("limitAmount", om.valueToTree(this.getLimitAmount()));
            data.set("limitUnit", om.valueToTree(this.getLimitUnit()));
            data.set("timeUnit", om.valueToTree(this.getTimeUnit()));
            if (this.getAccountId() != null) {
                data.set("accountId", om.valueToTree(this.getAccountId()));
            }
            if (this.getCostFilter() != null) {
                data.set("costFilter", om.valueToTree(this.getCostFilter()));
            }
            if (this.getCostFilters() != null) {
                data.set("costFilters", om.valueToTree(this.getCostFilters()));
            }
            if (this.getCostTypes() != null) {
                data.set("costTypes", om.valueToTree(this.getCostTypes()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getName() != null) {
                data.set("name", om.valueToTree(this.getName()));
            }
            if (this.getNamePrefix() != null) {
                data.set("namePrefix", om.valueToTree(this.getNamePrefix()));
            }
            if (this.getNotification() != null) {
                data.set("notification", om.valueToTree(this.getNotification()));
            }
            if (this.getTimePeriodEnd() != null) {
                data.set("timePeriodEnd", om.valueToTree(this.getTimePeriodEnd()));
            }
            if (this.getTimePeriodStart() != null) {
                data.set("timePeriodStart", om.valueToTree(this.getTimePeriodStart()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.budgets.BudgetsBudgetConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BudgetsBudgetConfig.Jsii$Proxy that = (BudgetsBudgetConfig.Jsii$Proxy) o;

            if (!budgetType.equals(that.budgetType)) return false;
            if (!limitAmount.equals(that.limitAmount)) return false;
            if (!limitUnit.equals(that.limitUnit)) return false;
            if (!timeUnit.equals(that.timeUnit)) return false;
            if (this.accountId != null ? !this.accountId.equals(that.accountId) : that.accountId != null) return false;
            if (this.costFilter != null ? !this.costFilter.equals(that.costFilter) : that.costFilter != null) return false;
            if (this.costFilters != null ? !this.costFilters.equals(that.costFilters) : that.costFilters != null) return false;
            if (this.costTypes != null ? !this.costTypes.equals(that.costTypes) : that.costTypes != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.name != null ? !this.name.equals(that.name) : that.name != null) return false;
            if (this.namePrefix != null ? !this.namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
            if (this.notification != null ? !this.notification.equals(that.notification) : that.notification != null) return false;
            if (this.timePeriodEnd != null ? !this.timePeriodEnd.equals(that.timePeriodEnd) : that.timePeriodEnd != null) return false;
            if (this.timePeriodStart != null ? !this.timePeriodStart.equals(that.timePeriodStart) : that.timePeriodStart != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.budgetType.hashCode();
            result = 31 * result + (this.limitAmount.hashCode());
            result = 31 * result + (this.limitUnit.hashCode());
            result = 31 * result + (this.timeUnit.hashCode());
            result = 31 * result + (this.accountId != null ? this.accountId.hashCode() : 0);
            result = 31 * result + (this.costFilter != null ? this.costFilter.hashCode() : 0);
            result = 31 * result + (this.costFilters != null ? this.costFilters.hashCode() : 0);
            result = 31 * result + (this.costTypes != null ? this.costTypes.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
            result = 31 * result + (this.namePrefix != null ? this.namePrefix.hashCode() : 0);
            result = 31 * result + (this.notification != null ? this.notification.hashCode() : 0);
            result = 31 * result + (this.timePeriodEnd != null ? this.timePeriodEnd.hashCode() : 0);
            result = 31 * result + (this.timePeriodStart != null ? this.timePeriodStart.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
