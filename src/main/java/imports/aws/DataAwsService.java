package imports.aws;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/service aws_service}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.227Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsService")
public class DataAwsService extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsService(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsService(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.DataAwsService.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/service aws_service} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public DataAwsService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.DataAwsServiceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/service aws_service} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public DataAwsService(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void resetDnsName() {
        software.amazon.jsii.Kernel.call(this, "resetDnsName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRegion() {
        software.amazon.jsii.Kernel.call(this, "resetRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReverseDnsName() {
        software.amazon.jsii.Kernel.call(this, "resetReverseDnsName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReverseDnsPrefix() {
        software.amazon.jsii.Kernel.call(this, "resetReverseDnsPrefix", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceId() {
        software.amazon.jsii.Kernel.call(this, "resetServiceId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getPartition() {
        return software.amazon.jsii.Kernel.get(this, "partition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getSupported() {
        return software.amazon.jsii.Kernel.get(this, "supported", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDnsNameInput() {
        return software.amazon.jsii.Kernel.get(this, "dnsNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "regionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReverseDnsNameInput() {
        return software.amazon.jsii.Kernel.get(this, "reverseDnsNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReverseDnsPrefixInput() {
        return software.amazon.jsii.Kernel.get(this, "reverseDnsPrefixInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDnsName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dnsName", java.util.Objects.requireNonNull(value, "dnsName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegion() {
        return software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "region", java.util.Objects.requireNonNull(value, "region is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReverseDnsName() {
        return software.amazon.jsii.Kernel.get(this, "reverseDnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReverseDnsName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reverseDnsName", java.util.Objects.requireNonNull(value, "reverseDnsName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getReverseDnsPrefix() {
        return software.amazon.jsii.Kernel.get(this, "reverseDnsPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReverseDnsPrefix(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "reverseDnsPrefix", java.util.Objects.requireNonNull(value, "reverseDnsPrefix is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceId() {
        return software.amazon.jsii.Kernel.get(this, "serviceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceId", java.util.Objects.requireNonNull(value, "serviceId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.DataAwsService}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.DataAwsService> {
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
        private imports.aws.DataAwsServiceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config().connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config().count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config().dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config().forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config().lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config().provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config().provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#dns_name DataAwsService#dns_name}.
         * <p>
         * @return {@code this}
         * @param dnsName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#dns_name DataAwsService#dns_name}. This parameter is required.
         */
        public Builder dnsName(final java.lang.String dnsName) {
            this.config().dnsName(dnsName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#id DataAwsService#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#id DataAwsService#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#region DataAwsService#region}.
         * <p>
         * @return {@code this}
         * @param region Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#region DataAwsService#region}. This parameter is required.
         */
        public Builder region(final java.lang.String region) {
            this.config().region(region);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#reverse_dns_name DataAwsService#reverse_dns_name}.
         * <p>
         * @return {@code this}
         * @param reverseDnsName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#reverse_dns_name DataAwsService#reverse_dns_name}. This parameter is required.
         */
        public Builder reverseDnsName(final java.lang.String reverseDnsName) {
            this.config().reverseDnsName(reverseDnsName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#reverse_dns_prefix DataAwsService#reverse_dns_prefix}.
         * <p>
         * @return {@code this}
         * @param reverseDnsPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#reverse_dns_prefix DataAwsService#reverse_dns_prefix}. This parameter is required.
         */
        public Builder reverseDnsPrefix(final java.lang.String reverseDnsPrefix) {
            this.config().reverseDnsPrefix(reverseDnsPrefix);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#service_id DataAwsService#service_id}.
         * <p>
         * @return {@code this}
         * @param serviceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/service#service_id DataAwsService#service_id}. This parameter is required.
         */
        public Builder serviceId(final java.lang.String serviceId) {
            this.config().serviceId(serviceId);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.DataAwsService}.
         */
        @Override
        public imports.aws.DataAwsService build() {
            return new imports.aws.DataAwsService(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.DataAwsServiceConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.DataAwsServiceConfig.Builder();
            }
            return this.config;
        }
    }
}
