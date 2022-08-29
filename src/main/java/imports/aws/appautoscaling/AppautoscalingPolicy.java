package imports.aws.appautoscaling;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy aws_appautoscaling_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.570Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appautoscaling.AppautoscalingPolicy")
public class AppautoscalingPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected AppautoscalingPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppautoscalingPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appautoscaling.AppautoscalingPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy aws_appautoscaling_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppautoscalingPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appautoscaling.AppautoscalingPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putStepScalingPolicyConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putStepScalingPolicyConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetTrackingScalingPolicyConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putTargetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicyType() {
        software.amazon.jsii.Kernel.call(this, "resetPolicyType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepScalingPolicyConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetStepScalingPolicyConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetTrackingScalingPolicyConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetTargetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfigurationOutputReference getStepScalingPolicyConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "stepScalingPolicyConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationOutputReference getTargetTrackingScalingPolicyConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "targetTrackingScalingPolicyConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "policyTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getScalableDimensionInput() {
        return software.amazon.jsii.Kernel.get(this, "scalableDimensionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceNamespaceInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceNamespaceInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration getStepScalingPolicyConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "stepScalingPolicyConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "targetTrackingScalingPolicyConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyType() {
        return software.amazon.jsii.Kernel.get(this, "policyType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicyType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policyType", java.util.Objects.requireNonNull(value, "policyType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceId() {
        return software.amazon.jsii.Kernel.get(this, "resourceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceId", java.util.Objects.requireNonNull(value, "resourceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getScalableDimension() {
        return software.amazon.jsii.Kernel.get(this, "scalableDimension", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setScalableDimension(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "scalableDimension", java.util.Objects.requireNonNull(value, "scalableDimension is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceNamespace() {
        return software.amazon.jsii.Kernel.get(this, "serviceNamespace", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceNamespace(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceNamespace", java.util.Objects.requireNonNull(value, "serviceNamespace is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.appautoscaling.AppautoscalingPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appautoscaling.AppautoscalingPolicy> {
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
        private final imports.aws.appautoscaling.AppautoscalingPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appautoscaling.AppautoscalingPolicyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#name AppautoscalingPolicy#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#name AppautoscalingPolicy#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#resource_id AppautoscalingPolicy#resource_id}.
         * <p>
         * @return {@code this}
         * @param resourceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#resource_id AppautoscalingPolicy#resource_id}. This parameter is required.
         */
        public Builder resourceId(final java.lang.String resourceId) {
            this.config.resourceId(resourceId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#scalable_dimension AppautoscalingPolicy#scalable_dimension}.
         * <p>
         * @return {@code this}
         * @param scalableDimension Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#scalable_dimension AppautoscalingPolicy#scalable_dimension}. This parameter is required.
         */
        public Builder scalableDimension(final java.lang.String scalableDimension) {
            this.config.scalableDimension(scalableDimension);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#service_namespace AppautoscalingPolicy#service_namespace}.
         * <p>
         * @return {@code this}
         * @param serviceNamespace Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#service_namespace AppautoscalingPolicy#service_namespace}. This parameter is required.
         */
        public Builder serviceNamespace(final java.lang.String serviceNamespace) {
            this.config.serviceNamespace(serviceNamespace);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#id AppautoscalingPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#id AppautoscalingPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#policy_type AppautoscalingPolicy#policy_type}.
         * <p>
         * @return {@code this}
         * @param policyType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#policy_type AppautoscalingPolicy#policy_type}. This parameter is required.
         */
        public Builder policyType(final java.lang.String policyType) {
            this.config.policyType(policyType);
            return this;
        }

        /**
         * step_scaling_policy_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#step_scaling_policy_configuration AppautoscalingPolicy#step_scaling_policy_configuration}
         * <p>
         * @return {@code this}
         * @param stepScalingPolicyConfiguration step_scaling_policy_configuration block. This parameter is required.
         */
        public Builder stepScalingPolicyConfiguration(final imports.aws.appautoscaling.AppautoscalingPolicyStepScalingPolicyConfiguration stepScalingPolicyConfiguration) {
            this.config.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration);
            return this;
        }

        /**
         * target_tracking_scaling_policy_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/appautoscaling_policy#target_tracking_scaling_policy_configuration AppautoscalingPolicy#target_tracking_scaling_policy_configuration}
         * <p>
         * @return {@code this}
         * @param targetTrackingScalingPolicyConfiguration target_tracking_scaling_policy_configuration block. This parameter is required.
         */
        public Builder targetTrackingScalingPolicyConfiguration(final imports.aws.appautoscaling.AppautoscalingPolicyTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
            this.config.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appautoscaling.AppautoscalingPolicy}.
         */
        @Override
        public imports.aws.appautoscaling.AppautoscalingPolicy build() {
            return new imports.aws.appautoscaling.AppautoscalingPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
