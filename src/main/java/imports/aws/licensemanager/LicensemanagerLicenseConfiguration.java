package imports.aws.licensemanager;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration aws_licensemanager_license_configuration}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.852Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.licensemanager.LicensemanagerLicenseConfiguration")
public class LicensemanagerLicenseConfiguration extends com.hashicorp.cdktf.TerraformResource {

    protected LicensemanagerLicenseConfiguration(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LicensemanagerLicenseConfiguration(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.licensemanager.LicensemanagerLicenseConfiguration.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration aws_licensemanager_license_configuration} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LicensemanagerLicenseConfiguration(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.licensemanager.LicensemanagerLicenseConfigurationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseCount() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseCount", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseCountHardLimit() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseCountHardLimit", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLicenseRules() {
        software.amazon.jsii.Kernel.call(this, "resetLicenseRules", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerAccountId() {
        return software.amazon.jsii.Kernel.get(this, "ownerAccountId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLicenseCountHardLimitInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountHardLimitInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLicenseCountingTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountingTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getLicenseCountInput() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLicenseRulesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "licenseRulesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLicenseCount() {
        return software.amazon.jsii.Kernel.get(this, "licenseCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setLicenseCount(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "licenseCount", java.util.Objects.requireNonNull(value, "licenseCount is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getLicenseCountHardLimit() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountHardLimit", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setLicenseCountHardLimit(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "licenseCountHardLimit", java.util.Objects.requireNonNull(value, "licenseCountHardLimit is required"));
    }

    public void setLicenseCountHardLimit(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "licenseCountHardLimit", java.util.Objects.requireNonNull(value, "licenseCountHardLimit is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLicenseCountingType() {
        return software.amazon.jsii.Kernel.get(this, "licenseCountingType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLicenseCountingType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "licenseCountingType", java.util.Objects.requireNonNull(value, "licenseCountingType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getLicenseRules() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "licenseRules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setLicenseRules(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "licenseRules", java.util.Objects.requireNonNull(value, "licenseRules is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
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
     * A fluent builder for {@link imports.aws.licensemanager.LicensemanagerLicenseConfiguration}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.licensemanager.LicensemanagerLicenseConfiguration> {
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
        private final imports.aws.licensemanager.LicensemanagerLicenseConfigurationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.licensemanager.LicensemanagerLicenseConfigurationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_counting_type LicensemanagerLicenseConfiguration#license_counting_type}.
         * <p>
         * @return {@code this}
         * @param licenseCountingType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_counting_type LicensemanagerLicenseConfiguration#license_counting_type}. This parameter is required.
         */
        public Builder licenseCountingType(final java.lang.String licenseCountingType) {
            this.config.licenseCountingType(licenseCountingType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#name LicensemanagerLicenseConfiguration#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#name LicensemanagerLicenseConfiguration#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#description LicensemanagerLicenseConfiguration#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#description LicensemanagerLicenseConfiguration#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#id LicensemanagerLicenseConfiguration#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#id LicensemanagerLicenseConfiguration#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_count LicensemanagerLicenseConfiguration#license_count}.
         * <p>
         * @return {@code this}
         * @param licenseCount Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_count LicensemanagerLicenseConfiguration#license_count}. This parameter is required.
         */
        public Builder licenseCount(final java.lang.Number licenseCount) {
            this.config.licenseCount(licenseCount);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_count_hard_limit LicensemanagerLicenseConfiguration#license_count_hard_limit}.
         * <p>
         * @return {@code this}
         * @param licenseCountHardLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_count_hard_limit LicensemanagerLicenseConfiguration#license_count_hard_limit}. This parameter is required.
         */
        public Builder licenseCountHardLimit(final java.lang.Boolean licenseCountHardLimit) {
            this.config.licenseCountHardLimit(licenseCountHardLimit);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_count_hard_limit LicensemanagerLicenseConfiguration#license_count_hard_limit}.
         * <p>
         * @return {@code this}
         * @param licenseCountHardLimit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_count_hard_limit LicensemanagerLicenseConfiguration#license_count_hard_limit}. This parameter is required.
         */
        public Builder licenseCountHardLimit(final com.hashicorp.cdktf.IResolvable licenseCountHardLimit) {
            this.config.licenseCountHardLimit(licenseCountHardLimit);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_rules LicensemanagerLicenseConfiguration#license_rules}.
         * <p>
         * @return {@code this}
         * @param licenseRules Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#license_rules LicensemanagerLicenseConfiguration#license_rules}. This parameter is required.
         */
        public Builder licenseRules(final java.util.List<java.lang.String> licenseRules) {
            this.config.licenseRules(licenseRules);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#tags LicensemanagerLicenseConfiguration#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#tags LicensemanagerLicenseConfiguration#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#tags_all LicensemanagerLicenseConfiguration#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/licensemanager_license_configuration#tags_all LicensemanagerLicenseConfiguration#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.licensemanager.LicensemanagerLicenseConfiguration}.
         */
        @Override
        public imports.aws.licensemanager.LicensemanagerLicenseConfiguration build() {
            return new imports.aws.licensemanager.LicensemanagerLicenseConfiguration(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
