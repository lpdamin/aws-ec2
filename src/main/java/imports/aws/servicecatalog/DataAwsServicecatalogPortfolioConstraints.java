package imports.aws.servicecatalog;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints aws_servicecatalog_portfolio_constraints}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.637Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints")
public class DataAwsServicecatalogPortfolioConstraints extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsServicecatalogPortfolioConstraints(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsServicecatalogPortfolioConstraints(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints aws_servicecatalog_portfolio_constraints} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsServicecatalogPortfolioConstraints(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAcceptLanguage() {
        software.amazon.jsii.Kernel.call(this, "resetAcceptLanguage", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProductId() {
        software.amazon.jsii.Kernel.call(this, "resetProductId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsDetailsList getDetails() {
        return software.amazon.jsii.Kernel.get(this, "details", software.amazon.jsii.NativeType.forClass(imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsDetailsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAcceptLanguageInput() {
        return software.amazon.jsii.Kernel.get(this, "acceptLanguageInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPortfolioIdInput() {
        return software.amazon.jsii.Kernel.get(this, "portfolioIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getProductIdInput() {
        return software.amazon.jsii.Kernel.get(this, "productIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcceptLanguage() {
        return software.amazon.jsii.Kernel.get(this, "acceptLanguage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAcceptLanguage(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "acceptLanguage", java.util.Objects.requireNonNull(value, "acceptLanguage is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPortfolioId() {
        return software.amazon.jsii.Kernel.get(this, "portfolioId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPortfolioId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "portfolioId", java.util.Objects.requireNonNull(value, "portfolioId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getProductId() {
        return software.amazon.jsii.Kernel.get(this, "productId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setProductId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "productId", java.util.Objects.requireNonNull(value, "productId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints> {
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
        private final imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#portfolio_id DataAwsServicecatalogPortfolioConstraints#portfolio_id}.
         * <p>
         * @return {@code this}
         * @param portfolioId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#portfolio_id DataAwsServicecatalogPortfolioConstraints#portfolio_id}. This parameter is required.
         */
        public Builder portfolioId(final java.lang.String portfolioId) {
            this.config.portfolioId(portfolioId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#accept_language DataAwsServicecatalogPortfolioConstraints#accept_language}.
         * <p>
         * @return {@code this}
         * @param acceptLanguage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#accept_language DataAwsServicecatalogPortfolioConstraints#accept_language}. This parameter is required.
         */
        public Builder acceptLanguage(final java.lang.String acceptLanguage) {
            this.config.acceptLanguage(acceptLanguage);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#id DataAwsServicecatalogPortfolioConstraints#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#id DataAwsServicecatalogPortfolioConstraints#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#product_id DataAwsServicecatalogPortfolioConstraints#product_id}.
         * <p>
         * @return {@code this}
         * @param productId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#product_id DataAwsServicecatalogPortfolioConstraints#product_id}. This parameter is required.
         */
        public Builder productId(final java.lang.String productId) {
            this.config.productId(productId);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/d/servicecatalog_portfolio_constraints#timeouts DataAwsServicecatalogPortfolioConstraints#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraintsTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints}.
         */
        @Override
        public imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints build() {
            return new imports.aws.servicecatalog.DataAwsServicecatalogPortfolioConstraints(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
