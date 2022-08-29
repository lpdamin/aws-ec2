package imports.aws.globalaccelerator;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group aws_globalaccelerator_endpoint_group}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.232Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.globalaccelerator.GlobalacceleratorEndpointGroup")
public class GlobalacceleratorEndpointGroup extends com.hashicorp.cdktf.TerraformResource {

    protected GlobalacceleratorEndpointGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlobalacceleratorEndpointGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.globalaccelerator.GlobalacceleratorEndpointGroup.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group aws_globalaccelerator_endpoint_group} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public GlobalacceleratorEndpointGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putEndpointConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEndpointConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPortOverride(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putPortOverride", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetEndpointConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEndpointGroupRegion() {
        software.amazon.jsii.Kernel.call(this, "resetEndpointGroupRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckIntervalSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckIntervalSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckPath() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckPort() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHealthCheckProtocol() {
        software.amazon.jsii.Kernel.call(this, "resetHealthCheckProtocol", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPortOverride() {
        software.amazon.jsii.Kernel.call(this, "resetPortOverride", software.amazon.jsii.NativeType.VOID);
    }

    public void resetThresholdCount() {
        software.amazon.jsii.Kernel.call(this, "resetThresholdCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrafficDialPercentage() {
        software.amazon.jsii.Kernel.call(this, "resetTrafficDialPercentage", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupEndpointConfigurationList getEndpointConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "endpointConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupEndpointConfigurationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupPortOverrideList getPortOverride() {
        return software.amazon.jsii.Kernel.get(this, "portOverride", software.amazon.jsii.NativeType.forClass(imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupPortOverrideList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEndpointConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEndpointGroupRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "endpointGroupRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckIntervalSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckIntervalSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckPathInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getHealthCheckPortInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHealthCheckProtocolInput() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckProtocolInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getListenerArnInput() {
        return software.amazon.jsii.Kernel.get(this, "listenerArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPortOverrideInput() {
        return software.amazon.jsii.Kernel.get(this, "portOverrideInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getThresholdCountInput() {
        return software.amazon.jsii.Kernel.get(this, "thresholdCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTrafficDialPercentageInput() {
        return software.amazon.jsii.Kernel.get(this, "trafficDialPercentageInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEndpointGroupRegion() {
        return software.amazon.jsii.Kernel.get(this, "endpointGroupRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEndpointGroupRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "endpointGroupRegion", java.util.Objects.requireNonNull(value, "endpointGroupRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckIntervalSeconds() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckIntervalSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckIntervalSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckIntervalSeconds", java.util.Objects.requireNonNull(value, "healthCheckIntervalSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthCheckPath() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthCheckPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckPath", java.util.Objects.requireNonNull(value, "healthCheckPath is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getHealthCheckPort() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setHealthCheckPort(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckPort", java.util.Objects.requireNonNull(value, "healthCheckPort is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHealthCheckProtocol() {
        return software.amazon.jsii.Kernel.get(this, "healthCheckProtocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHealthCheckProtocol(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "healthCheckProtocol", java.util.Objects.requireNonNull(value, "healthCheckProtocol is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getListenerArn() {
        return software.amazon.jsii.Kernel.get(this, "listenerArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setListenerArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "listenerArn", java.util.Objects.requireNonNull(value, "listenerArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getThresholdCount() {
        return software.amazon.jsii.Kernel.get(this, "thresholdCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setThresholdCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "thresholdCount", java.util.Objects.requireNonNull(value, "thresholdCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTrafficDialPercentage() {
        return software.amazon.jsii.Kernel.get(this, "trafficDialPercentage", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTrafficDialPercentage(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "trafficDialPercentage", java.util.Objects.requireNonNull(value, "trafficDialPercentage is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.globalaccelerator.GlobalacceleratorEndpointGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.globalaccelerator.GlobalacceleratorEndpointGroup> {
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
        private final imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#listener_arn GlobalacceleratorEndpointGroup#listener_arn}.
         * <p>
         * @return {@code this}
         * @param listenerArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#listener_arn GlobalacceleratorEndpointGroup#listener_arn}. This parameter is required.
         */
        public Builder listenerArn(final java.lang.String listenerArn) {
            this.config.listenerArn(listenerArn);
            return this;
        }

        /**
         * endpoint_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#endpoint_configuration GlobalacceleratorEndpointGroup#endpoint_configuration}
         * <p>
         * @return {@code this}
         * @param endpointConfiguration endpoint_configuration block. This parameter is required.
         */
        public Builder endpointConfiguration(final com.hashicorp.cdktf.IResolvable endpointConfiguration) {
            this.config.endpointConfiguration(endpointConfiguration);
            return this;
        }
        /**
         * endpoint_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#endpoint_configuration GlobalacceleratorEndpointGroup#endpoint_configuration}
         * <p>
         * @return {@code this}
         * @param endpointConfiguration endpoint_configuration block. This parameter is required.
         */
        public Builder endpointConfiguration(final java.util.List<? extends imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupEndpointConfiguration> endpointConfiguration) {
            this.config.endpointConfiguration(endpointConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#endpoint_group_region GlobalacceleratorEndpointGroup#endpoint_group_region}.
         * <p>
         * @return {@code this}
         * @param endpointGroupRegion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#endpoint_group_region GlobalacceleratorEndpointGroup#endpoint_group_region}. This parameter is required.
         */
        public Builder endpointGroupRegion(final java.lang.String endpointGroupRegion) {
            this.config.endpointGroupRegion(endpointGroupRegion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_interval_seconds GlobalacceleratorEndpointGroup#health_check_interval_seconds}.
         * <p>
         * @return {@code this}
         * @param healthCheckIntervalSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_interval_seconds GlobalacceleratorEndpointGroup#health_check_interval_seconds}. This parameter is required.
         */
        public Builder healthCheckIntervalSeconds(final java.lang.Number healthCheckIntervalSeconds) {
            this.config.healthCheckIntervalSeconds(healthCheckIntervalSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_path GlobalacceleratorEndpointGroup#health_check_path}.
         * <p>
         * @return {@code this}
         * @param healthCheckPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_path GlobalacceleratorEndpointGroup#health_check_path}. This parameter is required.
         */
        public Builder healthCheckPath(final java.lang.String healthCheckPath) {
            this.config.healthCheckPath(healthCheckPath);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_port GlobalacceleratorEndpointGroup#health_check_port}.
         * <p>
         * @return {@code this}
         * @param healthCheckPort Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_port GlobalacceleratorEndpointGroup#health_check_port}. This parameter is required.
         */
        public Builder healthCheckPort(final java.lang.Number healthCheckPort) {
            this.config.healthCheckPort(healthCheckPort);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_protocol GlobalacceleratorEndpointGroup#health_check_protocol}.
         * <p>
         * @return {@code this}
         * @param healthCheckProtocol Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#health_check_protocol GlobalacceleratorEndpointGroup#health_check_protocol}. This parameter is required.
         */
        public Builder healthCheckProtocol(final java.lang.String healthCheckProtocol) {
            this.config.healthCheckProtocol(healthCheckProtocol);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#id GlobalacceleratorEndpointGroup#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#id GlobalacceleratorEndpointGroup#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * port_override block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#port_override GlobalacceleratorEndpointGroup#port_override}
         * <p>
         * @return {@code this}
         * @param portOverride port_override block. This parameter is required.
         */
        public Builder portOverride(final com.hashicorp.cdktf.IResolvable portOverride) {
            this.config.portOverride(portOverride);
            return this;
        }
        /**
         * port_override block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#port_override GlobalacceleratorEndpointGroup#port_override}
         * <p>
         * @return {@code this}
         * @param portOverride port_override block. This parameter is required.
         */
        public Builder portOverride(final java.util.List<? extends imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupPortOverride> portOverride) {
            this.config.portOverride(portOverride);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#threshold_count GlobalacceleratorEndpointGroup#threshold_count}.
         * <p>
         * @return {@code this}
         * @param thresholdCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#threshold_count GlobalacceleratorEndpointGroup#threshold_count}. This parameter is required.
         */
        public Builder thresholdCount(final java.lang.Number thresholdCount) {
            this.config.thresholdCount(thresholdCount);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#timeouts GlobalacceleratorEndpointGroup#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.globalaccelerator.GlobalacceleratorEndpointGroupTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#traffic_dial_percentage GlobalacceleratorEndpointGroup#traffic_dial_percentage}.
         * <p>
         * @return {@code this}
         * @param trafficDialPercentage Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/globalaccelerator_endpoint_group#traffic_dial_percentage GlobalacceleratorEndpointGroup#traffic_dial_percentage}. This parameter is required.
         */
        public Builder trafficDialPercentage(final java.lang.Number trafficDialPercentage) {
            this.config.trafficDialPercentage(trafficDialPercentage);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.globalaccelerator.GlobalacceleratorEndpointGroup}.
         */
        @Override
        public imports.aws.globalaccelerator.GlobalacceleratorEndpointGroup build() {
            return new imports.aws.globalaccelerator.GlobalacceleratorEndpointGroup(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
