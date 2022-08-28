package imports.aws.emr;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application aws_emrserverless_application}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.021Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrserverlessApplication")
public class EmrserverlessApplication extends com.hashicorp.cdktf.TerraformResource {

    protected EmrserverlessApplication(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EmrserverlessApplication(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.emr.EmrserverlessApplication.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application aws_emrserverless_application} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EmrserverlessApplication(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAutoStartConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationAutoStartConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putAutoStartConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAutoStopConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationAutoStopConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putAutoStopConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putInitialCapacity(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putInitialCapacity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMaximumCapacity(final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationMaximumCapacity value) {
        software.amazon.jsii.Kernel.call(this, "putMaximumCapacity", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putNetworkConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationNetworkConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putNetworkConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAutoStartConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAutoStartConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoStopConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetAutoStopConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetInitialCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetInitialCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetNetworkConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetNetworkConfiguration", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationAutoStartConfigurationOutputReference getAutoStartConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "autoStartConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationAutoStartConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationAutoStopConfigurationOutputReference getAutoStopConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "autoStopConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationAutoStopConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationInitialCapacityList getInitialCapacity() {
        return software.amazon.jsii.Kernel.get(this, "initialCapacity", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationInitialCapacityList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationMaximumCapacityOutputReference getMaximumCapacity() {
        return software.amazon.jsii.Kernel.get(this, "maximumCapacity", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationMaximumCapacityOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrserverlessApplicationNetworkConfigurationOutputReference getNetworkConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "networkConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationNetworkConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrserverlessApplicationAutoStartConfiguration getAutoStartConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "autoStartConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationAutoStartConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrserverlessApplicationAutoStopConfiguration getAutoStopConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "autoStopConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationAutoStopConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInitialCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "initialCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrserverlessApplicationMaximumCapacity getMaximumCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumCapacityInput", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationMaximumCapacity.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrserverlessApplicationNetworkConfiguration getNetworkConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "networkConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrserverlessApplicationNetworkConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getReleaseLabelInput() {
        return software.amazon.jsii.Kernel.get(this, "releaseLabelInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "typeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getReleaseLabel() {
        return software.amazon.jsii.Kernel.get(this, "releaseLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setReleaseLabel(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "releaseLabel", java.util.Objects.requireNonNull(value, "releaseLabel is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getType() {
        return software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "type", java.util.Objects.requireNonNull(value, "type is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.emr.EmrserverlessApplication}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.emr.EmrserverlessApplication> {
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
        private final imports.aws.emr.EmrserverlessApplicationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.emr.EmrserverlessApplicationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#name EmrserverlessApplication#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#name EmrserverlessApplication#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#release_label EmrserverlessApplication#release_label}.
         * <p>
         * @return {@code this}
         * @param releaseLabel Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#release_label EmrserverlessApplication#release_label}. This parameter is required.
         */
        public Builder releaseLabel(final java.lang.String releaseLabel) {
            this.config.releaseLabel(releaseLabel);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#type EmrserverlessApplication#type}.
         * <p>
         * @return {@code this}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#type EmrserverlessApplication#type}. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.config.type(type);
            return this;
        }

        /**
         * auto_start_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#auto_start_configuration EmrserverlessApplication#auto_start_configuration}
         * <p>
         * @return {@code this}
         * @param autoStartConfiguration auto_start_configuration block. This parameter is required.
         */
        public Builder autoStartConfiguration(final imports.aws.emr.EmrserverlessApplicationAutoStartConfiguration autoStartConfiguration) {
            this.config.autoStartConfiguration(autoStartConfiguration);
            return this;
        }

        /**
         * auto_stop_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#auto_stop_configuration EmrserverlessApplication#auto_stop_configuration}
         * <p>
         * @return {@code this}
         * @param autoStopConfiguration auto_stop_configuration block. This parameter is required.
         */
        public Builder autoStopConfiguration(final imports.aws.emr.EmrserverlessApplicationAutoStopConfiguration autoStopConfiguration) {
            this.config.autoStopConfiguration(autoStopConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#id EmrserverlessApplication#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#id EmrserverlessApplication#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * initial_capacity block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#initial_capacity EmrserverlessApplication#initial_capacity}
         * <p>
         * @return {@code this}
         * @param initialCapacity initial_capacity block. This parameter is required.
         */
        public Builder initialCapacity(final com.hashicorp.cdktf.IResolvable initialCapacity) {
            this.config.initialCapacity(initialCapacity);
            return this;
        }
        /**
         * initial_capacity block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#initial_capacity EmrserverlessApplication#initial_capacity}
         * <p>
         * @return {@code this}
         * @param initialCapacity initial_capacity block. This parameter is required.
         */
        public Builder initialCapacity(final java.util.List<? extends imports.aws.emr.EmrserverlessApplicationInitialCapacity> initialCapacity) {
            this.config.initialCapacity(initialCapacity);
            return this;
        }

        /**
         * maximum_capacity block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#maximum_capacity EmrserverlessApplication#maximum_capacity}
         * <p>
         * @return {@code this}
         * @param maximumCapacity maximum_capacity block. This parameter is required.
         */
        public Builder maximumCapacity(final imports.aws.emr.EmrserverlessApplicationMaximumCapacity maximumCapacity) {
            this.config.maximumCapacity(maximumCapacity);
            return this;
        }

        /**
         * network_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#network_configuration EmrserverlessApplication#network_configuration}
         * <p>
         * @return {@code this}
         * @param networkConfiguration network_configuration block. This parameter is required.
         */
        public Builder networkConfiguration(final imports.aws.emr.EmrserverlessApplicationNetworkConfiguration networkConfiguration) {
            this.config.networkConfiguration(networkConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#tags EmrserverlessApplication#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#tags EmrserverlessApplication#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#tags_all EmrserverlessApplication#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#tags_all EmrserverlessApplication#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.emr.EmrserverlessApplication}.
         */
        @Override
        public imports.aws.emr.EmrserverlessApplication build() {
            return new imports.aws.emr.EmrserverlessApplication(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
