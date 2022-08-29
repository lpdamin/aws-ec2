package imports.aws.guardduty;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector aws_guardduty_detector}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.292Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.guardduty.GuarddutyDetector")
public class GuarddutyDetector extends com.hashicorp.cdktf.TerraformResource {

    protected GuarddutyDetector(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GuarddutyDetector(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.guardduty.GuarddutyDetector.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector aws_guardduty_detector} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public GuarddutyDetector(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyDetectorConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector aws_guardduty_detector} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public GuarddutyDetector(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putDatasources(final @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyDetectorDatasources value) {
        software.amazon.jsii.Kernel.call(this, "putDatasources", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDatasources() {
        software.amazon.jsii.Kernel.call(this, "resetDatasources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnable() {
        software.amazon.jsii.Kernel.call(this, "resetEnable", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFindingPublishingFrequency() {
        software.amazon.jsii.Kernel.call(this, "resetFindingPublishingFrequency", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getAccountId() {
        return software.amazon.jsii.Kernel.get(this, "accountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyDetectorDatasourcesOutputReference getDatasources() {
        return software.amazon.jsii.Kernel.get(this, "datasources", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyDetectorDatasourcesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.guardduty.GuarddutyDetectorDatasources getDatasourcesInput() {
        return software.amazon.jsii.Kernel.get(this, "datasourcesInput", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyDetectorDatasources.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnableInput() {
        return software.amazon.jsii.Kernel.get(this, "enableInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFindingPublishingFrequencyInput() {
        return software.amazon.jsii.Kernel.get(this, "findingPublishingFrequencyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnable() {
        return software.amazon.jsii.Kernel.get(this, "enable", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnable(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enable", java.util.Objects.requireNonNull(value, "enable is required"));
    }

    public void setEnable(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enable", java.util.Objects.requireNonNull(value, "enable is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFindingPublishingFrequency() {
        return software.amazon.jsii.Kernel.get(this, "findingPublishingFrequency", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFindingPublishingFrequency(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "findingPublishingFrequency", java.util.Objects.requireNonNull(value, "findingPublishingFrequency is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
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
     * A fluent builder for {@link imports.aws.guardduty.GuarddutyDetector}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.guardduty.GuarddutyDetector> {
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
        private imports.aws.guardduty.GuarddutyDetectorConfig.Builder config;

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
         * datasources block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#datasources GuarddutyDetector#datasources}
         * <p>
         * @return {@code this}
         * @param datasources datasources block. This parameter is required.
         */
        public Builder datasources(final imports.aws.guardduty.GuarddutyDetectorDatasources datasources) {
            this.config().datasources(datasources);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#enable GuarddutyDetector#enable}.
         * <p>
         * @return {@code this}
         * @param enable Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#enable GuarddutyDetector#enable}. This parameter is required.
         */
        public Builder enable(final java.lang.Boolean enable) {
            this.config().enable(enable);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#enable GuarddutyDetector#enable}.
         * <p>
         * @return {@code this}
         * @param enable Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#enable GuarddutyDetector#enable}. This parameter is required.
         */
        public Builder enable(final com.hashicorp.cdktf.IResolvable enable) {
            this.config().enable(enable);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#finding_publishing_frequency GuarddutyDetector#finding_publishing_frequency}.
         * <p>
         * @return {@code this}
         * @param findingPublishingFrequency Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#finding_publishing_frequency GuarddutyDetector#finding_publishing_frequency}. This parameter is required.
         */
        public Builder findingPublishingFrequency(final java.lang.String findingPublishingFrequency) {
            this.config().findingPublishingFrequency(findingPublishingFrequency);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#id GuarddutyDetector#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#id GuarddutyDetector#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#tags GuarddutyDetector#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#tags GuarddutyDetector#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config().tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#tags_all GuarddutyDetector#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/guardduty_detector#tags_all GuarddutyDetector#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config().tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.guardduty.GuarddutyDetector}.
         */
        @Override
        public imports.aws.guardduty.GuarddutyDetector build() {
            return new imports.aws.guardduty.GuarddutyDetector(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.guardduty.GuarddutyDetectorConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.guardduty.GuarddutyDetectorConfig.Builder();
            }
            return this.config;
        }
    }
}
