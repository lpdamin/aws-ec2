package imports.aws.backup;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings aws_backup_region_settings}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.846Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.backup.BackupRegionSettings")
public class BackupRegionSettings extends com.hashicorp.cdktf.TerraformResource {

    protected BackupRegionSettings(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BackupRegionSettings(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.backup.BackupRegionSettings.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings aws_backup_region_settings} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public BackupRegionSettings(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.backup.BackupRegionSettingsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceTypeManagementPreference() {
        software.amazon.jsii.Kernel.call(this, "resetResourceTypeManagementPreference", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getResourceTypeManagementPreferenceInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "resourceTypeManagementPreferenceInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.Object> getResourceTypeOptInPreferenceInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.Object>)(software.amazon.jsii.Kernel.get(this, "resourceTypeOptInPreferenceInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> getResourceTypeManagementPreference() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "resourceTypeManagementPreference", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public void setResourceTypeManagementPreference(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "resourceTypeManagementPreference", java.util.Objects.requireNonNull(value, "resourceTypeManagementPreference is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> getResourceTypeOptInPreference() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "resourceTypeOptInPreference", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public void setResourceTypeOptInPreference(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> value) {
        software.amazon.jsii.Kernel.set(this, "resourceTypeOptInPreference", java.util.Objects.requireNonNull(value, "resourceTypeOptInPreference is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.backup.BackupRegionSettings}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.backup.BackupRegionSettings> {
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
        private final imports.aws.backup.BackupRegionSettingsConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.backup.BackupRegionSettingsConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings#resource_type_opt_in_preference BackupRegionSettings#resource_type_opt_in_preference}.
         * <p>
         * @return {@code this}
         * @param resourceTypeOptInPreference Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings#resource_type_opt_in_preference BackupRegionSettings#resource_type_opt_in_preference}. This parameter is required.
         */
        public Builder resourceTypeOptInPreference(final java.util.Map<java.lang.String, ? extends java.lang.Object> resourceTypeOptInPreference) {
            this.config.resourceTypeOptInPreference(resourceTypeOptInPreference);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings#id BackupRegionSettings#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings#id BackupRegionSettings#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings#resource_type_management_preference BackupRegionSettings#resource_type_management_preference}.
         * <p>
         * @return {@code this}
         * @param resourceTypeManagementPreference Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_region_settings#resource_type_management_preference BackupRegionSettings#resource_type_management_preference}. This parameter is required.
         */
        public Builder resourceTypeManagementPreference(final java.util.Map<java.lang.String, ? extends java.lang.Object> resourceTypeManagementPreference) {
            this.config.resourceTypeManagementPreference(resourceTypeManagementPreference);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.backup.BackupRegionSettings}.
         */
        @Override
        public imports.aws.backup.BackupRegionSettings build() {
            return new imports.aws.backup.BackupRegionSettings(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
