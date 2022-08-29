package imports.aws.redshift;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit aws_redshift_usage_limit}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.301Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.redshift.RedshiftUsageLimit")
public class RedshiftUsageLimit extends com.hashicorp.cdktf.TerraformResource {

    protected RedshiftUsageLimit(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected RedshiftUsageLimit(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.redshift.RedshiftUsageLimit.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit aws_redshift_usage_limit} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public RedshiftUsageLimit(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.redshift.RedshiftUsageLimitConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBreachAction() {
        software.amazon.jsii.Kernel.call(this, "resetBreachAction", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeriod() {
        software.amazon.jsii.Kernel.call(this, "resetPeriod", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getAmountInput() {
        return software.amazon.jsii.Kernel.get(this, "amountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBreachActionInput() {
        return software.amazon.jsii.Kernel.get(this, "breachActionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterIdentifierInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifierInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFeatureTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "featureTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLimitTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "limitTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeriodInput() {
        return software.amazon.jsii.Kernel.get(this, "periodInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAmount() {
        return software.amazon.jsii.Kernel.get(this, "amount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setAmount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "amount", java.util.Objects.requireNonNull(value, "amount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBreachAction() {
        return software.amazon.jsii.Kernel.get(this, "breachAction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBreachAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "breachAction", java.util.Objects.requireNonNull(value, "breachAction is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterIdentifier() {
        return software.amazon.jsii.Kernel.get(this, "clusterIdentifier", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterIdentifier(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterIdentifier", java.util.Objects.requireNonNull(value, "clusterIdentifier is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFeatureType() {
        return software.amazon.jsii.Kernel.get(this, "featureType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFeatureType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "featureType", java.util.Objects.requireNonNull(value, "featureType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLimitType() {
        return software.amazon.jsii.Kernel.get(this, "limitType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLimitType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "limitType", java.util.Objects.requireNonNull(value, "limitType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeriod() {
        return software.amazon.jsii.Kernel.get(this, "period", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeriod(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "period", java.util.Objects.requireNonNull(value, "period is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.redshift.RedshiftUsageLimit}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.redshift.RedshiftUsageLimit> {
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
        private final imports.aws.redshift.RedshiftUsageLimitConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.redshift.RedshiftUsageLimitConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#amount RedshiftUsageLimit#amount}.
         * <p>
         * @return {@code this}
         * @param amount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#amount RedshiftUsageLimit#amount}. This parameter is required.
         */
        public Builder amount(final java.lang.Number amount) {
            this.config.amount(amount);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#cluster_identifier RedshiftUsageLimit#cluster_identifier}.
         * <p>
         * @return {@code this}
         * @param clusterIdentifier Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#cluster_identifier RedshiftUsageLimit#cluster_identifier}. This parameter is required.
         */
        public Builder clusterIdentifier(final java.lang.String clusterIdentifier) {
            this.config.clusterIdentifier(clusterIdentifier);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#feature_type RedshiftUsageLimit#feature_type}.
         * <p>
         * @return {@code this}
         * @param featureType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#feature_type RedshiftUsageLimit#feature_type}. This parameter is required.
         */
        public Builder featureType(final java.lang.String featureType) {
            this.config.featureType(featureType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#limit_type RedshiftUsageLimit#limit_type}.
         * <p>
         * @return {@code this}
         * @param limitType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#limit_type RedshiftUsageLimit#limit_type}. This parameter is required.
         */
        public Builder limitType(final java.lang.String limitType) {
            this.config.limitType(limitType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#breach_action RedshiftUsageLimit#breach_action}.
         * <p>
         * @return {@code this}
         * @param breachAction Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#breach_action RedshiftUsageLimit#breach_action}. This parameter is required.
         */
        public Builder breachAction(final java.lang.String breachAction) {
            this.config.breachAction(breachAction);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#id RedshiftUsageLimit#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#id RedshiftUsageLimit#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#period RedshiftUsageLimit#period}.
         * <p>
         * @return {@code this}
         * @param period Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#period RedshiftUsageLimit#period}. This parameter is required.
         */
        public Builder period(final java.lang.String period) {
            this.config.period(period);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#tags RedshiftUsageLimit#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#tags RedshiftUsageLimit#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#tags_all RedshiftUsageLimit#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/redshift_usage_limit#tags_all RedshiftUsageLimit#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.redshift.RedshiftUsageLimit}.
         */
        @Override
        public imports.aws.redshift.RedshiftUsageLimit build() {
            return new imports.aws.redshift.RedshiftUsageLimit(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
