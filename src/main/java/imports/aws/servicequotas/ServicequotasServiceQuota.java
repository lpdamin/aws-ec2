package imports.aws.servicequotas;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota aws_servicequotas_service_quota}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.681Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicequotas.ServicequotasServiceQuota")
public class ServicequotasServiceQuota extends com.hashicorp.cdktf.TerraformResource {

    protected ServicequotasServiceQuota(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ServicequotasServiceQuota(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.servicequotas.ServicequotasServiceQuota.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota aws_servicequotas_service_quota} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public ServicequotasServiceQuota(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.servicequotas.ServicequotasServiceQuotaConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getAdjustable() {
        return software.amazon.jsii.Kernel.get(this, "adjustable", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDefaultValue() {
        return software.amazon.jsii.Kernel.get(this, "defaultValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQuotaName() {
        return software.amazon.jsii.Kernel.get(this, "quotaName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestId() {
        return software.amazon.jsii.Kernel.get(this, "requestId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRequestStatus() {
        return software.amazon.jsii.Kernel.get(this, "requestStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceName() {
        return software.amazon.jsii.Kernel.get(this, "serviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getQuotaCodeInput() {
        return software.amazon.jsii.Kernel.get(this, "quotaCodeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceCodeInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceCodeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getValueInput() {
        return software.amazon.jsii.Kernel.get(this, "valueInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getQuotaCode() {
        return software.amazon.jsii.Kernel.get(this, "quotaCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setQuotaCode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "quotaCode", java.util.Objects.requireNonNull(value, "quotaCode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceCode() {
        return software.amazon.jsii.Kernel.get(this, "serviceCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceCode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceCode", java.util.Objects.requireNonNull(value, "serviceCode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getValue() {
        return software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setValue(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "value", java.util.Objects.requireNonNull(value, "value is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.servicequotas.ServicequotasServiceQuota}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.servicequotas.ServicequotasServiceQuota> {
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
        private final imports.aws.servicequotas.ServicequotasServiceQuotaConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.servicequotas.ServicequotasServiceQuotaConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#quota_code ServicequotasServiceQuota#quota_code}.
         * <p>
         * @return {@code this}
         * @param quotaCode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#quota_code ServicequotasServiceQuota#quota_code}. This parameter is required.
         */
        public Builder quotaCode(final java.lang.String quotaCode) {
            this.config.quotaCode(quotaCode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#service_code ServicequotasServiceQuota#service_code}.
         * <p>
         * @return {@code this}
         * @param serviceCode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#service_code ServicequotasServiceQuota#service_code}. This parameter is required.
         */
        public Builder serviceCode(final java.lang.String serviceCode) {
            this.config.serviceCode(serviceCode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#value ServicequotasServiceQuota#value}.
         * <p>
         * @return {@code this}
         * @param value Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#value ServicequotasServiceQuota#value}. This parameter is required.
         */
        public Builder value(final java.lang.Number value) {
            this.config.value(value);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#id ServicequotasServiceQuota#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/servicequotas_service_quota#id ServicequotasServiceQuota#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.servicequotas.ServicequotasServiceQuota}.
         */
        @Override
        public imports.aws.servicequotas.ServicequotasServiceQuota build() {
            return new imports.aws.servicequotas.ServicequotasServiceQuota(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
