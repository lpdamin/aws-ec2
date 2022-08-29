package imports.aws.config;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack aws_config_organization_conformance_pack}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.213Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigOrganizationConformancePack")
public class ConfigOrganizationConformancePack extends com.hashicorp.cdktf.TerraformResource {

    protected ConfigOrganizationConformancePack(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConfigOrganizationConformancePack(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.config.ConfigOrganizationConformancePack.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack aws_config_organization_conformance_pack} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ConfigOrganizationConformancePack(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.config.ConfigOrganizationConformancePackConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putInputParameter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInputParameter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.config.ConfigOrganizationConformancePackTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDeliveryS3Bucket() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryS3Bucket", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeliveryS3KeyPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetDeliveryS3KeyPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExcludedAccounts() {
        software.amazon.jsii.Kernel.call(this, "resetExcludedAccounts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInputParameter() {
        software.amazon.jsii.Kernel.call(this, "resetInputParameter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTemplateBody() {
        software.amazon.jsii.Kernel.call(this, "resetTemplateBody", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTemplateS3Uri() {
        software.amazon.jsii.Kernel.call(this, "resetTemplateS3Uri", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.config.ConfigOrganizationConformancePackInputParameterList getInputParameter() {
        return software.amazon.jsii.Kernel.get(this, "inputParameter", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigOrganizationConformancePackInputParameterList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.config.ConfigOrganizationConformancePackTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.config.ConfigOrganizationConformancePackTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryS3BucketInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryS3BucketInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeliveryS3KeyPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "deliveryS3KeyPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getExcludedAccountsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "excludedAccountsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInputParameterInput() {
        return software.amazon.jsii.Kernel.get(this, "inputParameterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTemplateBodyInput() {
        return software.amazon.jsii.Kernel.get(this, "templateBodyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTemplateS3UriInput() {
        return software.amazon.jsii.Kernel.get(this, "templateS3UriInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryS3Bucket() {
        return software.amazon.jsii.Kernel.get(this, "deliveryS3Bucket", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryS3Bucket(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryS3Bucket", java.util.Objects.requireNonNull(value, "deliveryS3Bucket is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeliveryS3KeyPrefix() {
        return software.amazon.jsii.Kernel.get(this, "deliveryS3KeyPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeliveryS3KeyPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deliveryS3KeyPrefix", java.util.Objects.requireNonNull(value, "deliveryS3KeyPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getExcludedAccounts() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "excludedAccounts", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setExcludedAccounts(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "excludedAccounts", java.util.Objects.requireNonNull(value, "excludedAccounts is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTemplateBody() {
        return software.amazon.jsii.Kernel.get(this, "templateBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTemplateBody(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "templateBody", java.util.Objects.requireNonNull(value, "templateBody is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTemplateS3Uri() {
        return software.amazon.jsii.Kernel.get(this, "templateS3Uri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTemplateS3Uri(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "templateS3Uri", java.util.Objects.requireNonNull(value, "templateS3Uri is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.config.ConfigOrganizationConformancePack}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.config.ConfigOrganizationConformancePack> {
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
        private final imports.aws.config.ConfigOrganizationConformancePackConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.config.ConfigOrganizationConformancePackConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#name ConfigOrganizationConformancePack#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#name ConfigOrganizationConformancePack#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#delivery_s3_bucket ConfigOrganizationConformancePack#delivery_s3_bucket}.
         * <p>
         * @return {@code this}
         * @param deliveryS3Bucket Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#delivery_s3_bucket ConfigOrganizationConformancePack#delivery_s3_bucket}. This parameter is required.
         */
        public Builder deliveryS3Bucket(final java.lang.String deliveryS3Bucket) {
            this.config.deliveryS3Bucket(deliveryS3Bucket);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#delivery_s3_key_prefix ConfigOrganizationConformancePack#delivery_s3_key_prefix}.
         * <p>
         * @return {@code this}
         * @param deliveryS3KeyPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#delivery_s3_key_prefix ConfigOrganizationConformancePack#delivery_s3_key_prefix}. This parameter is required.
         */
        public Builder deliveryS3KeyPrefix(final java.lang.String deliveryS3KeyPrefix) {
            this.config.deliveryS3KeyPrefix(deliveryS3KeyPrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#excluded_accounts ConfigOrganizationConformancePack#excluded_accounts}.
         * <p>
         * @return {@code this}
         * @param excludedAccounts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#excluded_accounts ConfigOrganizationConformancePack#excluded_accounts}. This parameter is required.
         */
        public Builder excludedAccounts(final java.util.List<java.lang.String> excludedAccounts) {
            this.config.excludedAccounts(excludedAccounts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#id ConfigOrganizationConformancePack#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#id ConfigOrganizationConformancePack#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * input_parameter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#input_parameter ConfigOrganizationConformancePack#input_parameter}
         * <p>
         * @return {@code this}
         * @param inputParameter input_parameter block. This parameter is required.
         */
        public Builder inputParameter(final com.hashicorp.cdktf.IResolvable inputParameter) {
            this.config.inputParameter(inputParameter);
            return this;
        }
        /**
         * input_parameter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#input_parameter ConfigOrganizationConformancePack#input_parameter}
         * <p>
         * @return {@code this}
         * @param inputParameter input_parameter block. This parameter is required.
         */
        public Builder inputParameter(final java.util.List<? extends imports.aws.config.ConfigOrganizationConformancePackInputParameter> inputParameter) {
            this.config.inputParameter(inputParameter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#template_body ConfigOrganizationConformancePack#template_body}.
         * <p>
         * @return {@code this}
         * @param templateBody Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#template_body ConfigOrganizationConformancePack#template_body}. This parameter is required.
         */
        public Builder templateBody(final java.lang.String templateBody) {
            this.config.templateBody(templateBody);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#template_s3_uri ConfigOrganizationConformancePack#template_s3_uri}.
         * <p>
         * @return {@code this}
         * @param templateS3Uri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#template_s3_uri ConfigOrganizationConformancePack#template_s3_uri}. This parameter is required.
         */
        public Builder templateS3Uri(final java.lang.String templateS3Uri) {
            this.config.templateS3Uri(templateS3Uri);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/config_organization_conformance_pack#timeouts ConfigOrganizationConformancePack#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.config.ConfigOrganizationConformancePackTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.config.ConfigOrganizationConformancePack}.
         */
        @Override
        public imports.aws.config.ConfigOrganizationConformancePack build() {
            return new imports.aws.config.ConfigOrganizationConformancePack(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
