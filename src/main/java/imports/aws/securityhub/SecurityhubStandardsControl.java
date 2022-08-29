package imports.aws.securityhub;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control aws_securityhub_standards_control}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.624Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.securityhub.SecurityhubStandardsControl")
public class SecurityhubStandardsControl extends com.hashicorp.cdktf.TerraformResource {

    protected SecurityhubStandardsControl(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SecurityhubStandardsControl(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.securityhub.SecurityhubStandardsControl.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control aws_securityhub_standards_control} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SecurityhubStandardsControl(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.securityhub.SecurityhubStandardsControlConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDisabledReason() {
        software.amazon.jsii.Kernel.call(this, "resetDisabledReason", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getControlId() {
        return software.amazon.jsii.Kernel.get(this, "controlId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getControlStatusUpdatedAt() {
        return software.amazon.jsii.Kernel.get(this, "controlStatusUpdatedAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRelatedRequirements() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "relatedRequirements", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRemediationUrl() {
        return software.amazon.jsii.Kernel.get(this, "remediationUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSeverityRating() {
        return software.amazon.jsii.Kernel.get(this, "severityRating", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTitle() {
        return software.amazon.jsii.Kernel.get(this, "title", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getControlStatusInput() {
        return software.amazon.jsii.Kernel.get(this, "controlStatusInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDisabledReasonInput() {
        return software.amazon.jsii.Kernel.get(this, "disabledReasonInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStandardsControlArnInput() {
        return software.amazon.jsii.Kernel.get(this, "standardsControlArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getControlStatus() {
        return software.amazon.jsii.Kernel.get(this, "controlStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setControlStatus(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "controlStatus", java.util.Objects.requireNonNull(value, "controlStatus is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDisabledReason() {
        return software.amazon.jsii.Kernel.get(this, "disabledReason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDisabledReason(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "disabledReason", java.util.Objects.requireNonNull(value, "disabledReason is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStandardsControlArn() {
        return software.amazon.jsii.Kernel.get(this, "standardsControlArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStandardsControlArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "standardsControlArn", java.util.Objects.requireNonNull(value, "standardsControlArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.securityhub.SecurityhubStandardsControl}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.securityhub.SecurityhubStandardsControl> {
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
        private final imports.aws.securityhub.SecurityhubStandardsControlConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.securityhub.SecurityhubStandardsControlConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#control_status SecurityhubStandardsControl#control_status}.
         * <p>
         * @return {@code this}
         * @param controlStatus Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#control_status SecurityhubStandardsControl#control_status}. This parameter is required.
         */
        public Builder controlStatus(final java.lang.String controlStatus) {
            this.config.controlStatus(controlStatus);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#standards_control_arn SecurityhubStandardsControl#standards_control_arn}.
         * <p>
         * @return {@code this}
         * @param standardsControlArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#standards_control_arn SecurityhubStandardsControl#standards_control_arn}. This parameter is required.
         */
        public Builder standardsControlArn(final java.lang.String standardsControlArn) {
            this.config.standardsControlArn(standardsControlArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#disabled_reason SecurityhubStandardsControl#disabled_reason}.
         * <p>
         * @return {@code this}
         * @param disabledReason Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#disabled_reason SecurityhubStandardsControl#disabled_reason}. This parameter is required.
         */
        public Builder disabledReason(final java.lang.String disabledReason) {
            this.config.disabledReason(disabledReason);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#id SecurityhubStandardsControl#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/securityhub_standards_control#id SecurityhubStandardsControl#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.securityhub.SecurityhubStandardsControl}.
         */
        @Override
        public imports.aws.securityhub.SecurityhubStandardsControl build() {
            return new imports.aws.securityhub.SecurityhubStandardsControl(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
