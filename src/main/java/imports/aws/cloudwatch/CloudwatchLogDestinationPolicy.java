package imports.aws.cloudwatch;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy aws_cloudwatch_log_destination_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.349Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudwatch.CloudwatchLogDestinationPolicy")
public class CloudwatchLogDestinationPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected CloudwatchLogDestinationPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudwatchLogDestinationPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cloudwatch.CloudwatchLogDestinationPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy aws_cloudwatch_log_destination_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CloudwatchLogDestinationPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cloudwatch.CloudwatchLogDestinationPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetForceUpdate() {
        software.amazon.jsii.Kernel.call(this, "resetForceUpdate", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getAccessPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "accessPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDestinationNameInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getForceUpdateInput() {
        return software.amazon.jsii.Kernel.get(this, "forceUpdateInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAccessPolicy() {
        return software.amazon.jsii.Kernel.get(this, "accessPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAccessPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "accessPolicy", java.util.Objects.requireNonNull(value, "accessPolicy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDestinationName() {
        return software.amazon.jsii.Kernel.get(this, "destinationName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDestinationName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "destinationName", java.util.Objects.requireNonNull(value, "destinationName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getForceUpdate() {
        return software.amazon.jsii.Kernel.get(this, "forceUpdate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setForceUpdate(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "forceUpdate", java.util.Objects.requireNonNull(value, "forceUpdate is required"));
    }

    public void setForceUpdate(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "forceUpdate", java.util.Objects.requireNonNull(value, "forceUpdate is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cloudwatch.CloudwatchLogDestinationPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cloudwatch.CloudwatchLogDestinationPolicy> {
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
        private final imports.aws.cloudwatch.CloudwatchLogDestinationPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cloudwatch.CloudwatchLogDestinationPolicyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#access_policy CloudwatchLogDestinationPolicy#access_policy}.
         * <p>
         * @return {@code this}
         * @param accessPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#access_policy CloudwatchLogDestinationPolicy#access_policy}. This parameter is required.
         */
        public Builder accessPolicy(final java.lang.String accessPolicy) {
            this.config.accessPolicy(accessPolicy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#destination_name CloudwatchLogDestinationPolicy#destination_name}.
         * <p>
         * @return {@code this}
         * @param destinationName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#destination_name CloudwatchLogDestinationPolicy#destination_name}. This parameter is required.
         */
        public Builder destinationName(final java.lang.String destinationName) {
            this.config.destinationName(destinationName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#force_update CloudwatchLogDestinationPolicy#force_update}.
         * <p>
         * @return {@code this}
         * @param forceUpdate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#force_update CloudwatchLogDestinationPolicy#force_update}. This parameter is required.
         */
        public Builder forceUpdate(final java.lang.Boolean forceUpdate) {
            this.config.forceUpdate(forceUpdate);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#force_update CloudwatchLogDestinationPolicy#force_update}.
         * <p>
         * @return {@code this}
         * @param forceUpdate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#force_update CloudwatchLogDestinationPolicy#force_update}. This parameter is required.
         */
        public Builder forceUpdate(final com.hashicorp.cdktf.IResolvable forceUpdate) {
            this.config.forceUpdate(forceUpdate);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#id CloudwatchLogDestinationPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_destination_policy#id CloudwatchLogDestinationPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cloudwatch.CloudwatchLogDestinationPolicy}.
         */
        @Override
        public imports.aws.cloudwatch.CloudwatchLogDestinationPolicy build() {
            return new imports.aws.cloudwatch.CloudwatchLogDestinationPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
