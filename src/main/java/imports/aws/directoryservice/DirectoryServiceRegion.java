package imports.aws.directoryservice;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region aws_directory_service_region}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.440Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.directoryservice.DirectoryServiceRegion")
public class DirectoryServiceRegion extends com.hashicorp.cdktf.TerraformResource {

    protected DirectoryServiceRegion(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DirectoryServiceRegion(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.directoryservice.DirectoryServiceRegion.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region aws_directory_service_region} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DirectoryServiceRegion(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.directoryservice.DirectoryServiceRegionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.directoryservice.DirectoryServiceRegionTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putVpcSettings(final @org.jetbrains.annotations.NotNull imports.aws.directoryservice.DirectoryServiceRegionVpcSettings value) {
        software.amazon.jsii.Kernel.call(this, "putVpcSettings", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDesiredNumberOfDomainControllers() {
        software.amazon.jsii.Kernel.call(this, "resetDesiredNumberOfDomainControllers", software.amazon.jsii.NativeType.VOID);
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

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.directoryservice.DirectoryServiceRegionTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.directoryservice.DirectoryServiceRegionTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.directoryservice.DirectoryServiceRegionVpcSettingsOutputReference getVpcSettings() {
        return software.amazon.jsii.Kernel.get(this, "vpcSettings", software.amazon.jsii.NativeType.forClass(imports.aws.directoryservice.DirectoryServiceRegionVpcSettingsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDesiredNumberOfDomainControllersInput() {
        return software.amazon.jsii.Kernel.get(this, "desiredNumberOfDomainControllersInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDirectoryIdInput() {
        return software.amazon.jsii.Kernel.get(this, "directoryIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRegionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "regionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.directoryservice.DirectoryServiceRegionVpcSettings getVpcSettingsInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcSettingsInput", software.amazon.jsii.NativeType.forClass(imports.aws.directoryservice.DirectoryServiceRegionVpcSettings.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDesiredNumberOfDomainControllers() {
        return software.amazon.jsii.Kernel.get(this, "desiredNumberOfDomainControllers", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDesiredNumberOfDomainControllers(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "desiredNumberOfDomainControllers", java.util.Objects.requireNonNull(value, "desiredNumberOfDomainControllers is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryId() {
        return software.amazon.jsii.Kernel.get(this, "directoryId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDirectoryId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "directoryId", java.util.Objects.requireNonNull(value, "directoryId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegionName() {
        return software.amazon.jsii.Kernel.get(this, "regionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRegionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "regionName", java.util.Objects.requireNonNull(value, "regionName is required"));
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
     * A fluent builder for {@link imports.aws.directoryservice.DirectoryServiceRegion}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.directoryservice.DirectoryServiceRegion> {
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
        private final imports.aws.directoryservice.DirectoryServiceRegionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.directoryservice.DirectoryServiceRegionConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#directory_id DirectoryServiceRegion#directory_id}.
         * <p>
         * @return {@code this}
         * @param directoryId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#directory_id DirectoryServiceRegion#directory_id}. This parameter is required.
         */
        public Builder directoryId(final java.lang.String directoryId) {
            this.config.directoryId(directoryId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#region_name DirectoryServiceRegion#region_name}.
         * <p>
         * @return {@code this}
         * @param regionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#region_name DirectoryServiceRegion#region_name}. This parameter is required.
         */
        public Builder regionName(final java.lang.String regionName) {
            this.config.regionName(regionName);
            return this;
        }

        /**
         * vpc_settings block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/directory_service_region#vpc_settings DirectoryServiceRegion#vpc_settings}
         * <p>
         * @return {@code this}
         * @param vpcSettings vpc_settings block. This parameter is required.
         */
        public Builder vpcSettings(final imports.aws.directoryservice.DirectoryServiceRegionVpcSettings vpcSettings) {
            this.config.vpcSettings(vpcSettings);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#desired_number_of_domain_controllers DirectoryServiceRegion#desired_number_of_domain_controllers}.
         * <p>
         * @return {@code this}
         * @param desiredNumberOfDomainControllers Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#desired_number_of_domain_controllers DirectoryServiceRegion#desired_number_of_domain_controllers}. This parameter is required.
         */
        public Builder desiredNumberOfDomainControllers(final java.lang.Number desiredNumberOfDomainControllers) {
            this.config.desiredNumberOfDomainControllers(desiredNumberOfDomainControllers);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#id DirectoryServiceRegion#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#id DirectoryServiceRegion#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#tags DirectoryServiceRegion#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#tags DirectoryServiceRegion#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#tags_all DirectoryServiceRegion#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/directory_service_region#tags_all DirectoryServiceRegion#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/directory_service_region#timeouts DirectoryServiceRegion#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.directoryservice.DirectoryServiceRegionTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.directoryservice.DirectoryServiceRegion}.
         */
        @Override
        public imports.aws.directoryservice.DirectoryServiceRegion build() {
            return new imports.aws.directoryservice.DirectoryServiceRegion(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
