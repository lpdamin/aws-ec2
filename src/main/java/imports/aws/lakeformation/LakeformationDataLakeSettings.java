package imports.aws.lakeformation;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings aws_lakeformation_data_lake_settings}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.691Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lakeformation.LakeformationDataLakeSettings")
public class LakeformationDataLakeSettings extends com.hashicorp.cdktf.TerraformResource {

    protected LakeformationDataLakeSettings(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LakeformationDataLakeSettings(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lakeformation.LakeformationDataLakeSettings.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings aws_lakeformation_data_lake_settings} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config
     */
    public LakeformationDataLakeSettings(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.Nullable imports.aws.lakeformation.LakeformationDataLakeSettingsConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), config });
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings aws_lakeformation_data_lake_settings} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     */
    public LakeformationDataLakeSettings(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required") });
    }

    public void putCreateDatabaseDefaultPermissions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCreateDatabaseDefaultPermissions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCreateTableDefaultPermissions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putCreateTableDefaultPermissions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAdmins() {
        software.amazon.jsii.Kernel.call(this, "resetAdmins", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCatalogId() {
        software.amazon.jsii.Kernel.call(this, "resetCatalogId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreateDatabaseDefaultPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetCreateDatabaseDefaultPermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCreateTableDefaultPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetCreateTableDefaultPermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTrustedResourceOwners() {
        software.amazon.jsii.Kernel.call(this, "resetTrustedResourceOwners", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.lakeformation.LakeformationDataLakeSettingsCreateDatabaseDefaultPermissionsList getCreateDatabaseDefaultPermissions() {
        return software.amazon.jsii.Kernel.get(this, "createDatabaseDefaultPermissions", software.amazon.jsii.NativeType.forClass(imports.aws.lakeformation.LakeformationDataLakeSettingsCreateDatabaseDefaultPermissionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lakeformation.LakeformationDataLakeSettingsCreateTableDefaultPermissionsList getCreateTableDefaultPermissions() {
        return software.amazon.jsii.Kernel.get(this, "createTableDefaultPermissions", software.amazon.jsii.NativeType.forClass(imports.aws.lakeformation.LakeformationDataLakeSettingsCreateTableDefaultPermissionsList.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdminsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "adminsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCatalogIdInput() {
        return software.amazon.jsii.Kernel.get(this, "catalogIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCreateDatabaseDefaultPermissionsInput() {
        return software.amazon.jsii.Kernel.get(this, "createDatabaseDefaultPermissionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getCreateTableDefaultPermissionsInput() {
        return software.amazon.jsii.Kernel.get(this, "createTableDefaultPermissionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTrustedResourceOwnersInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "trustedResourceOwnersInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getAdmins() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "admins", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setAdmins(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "admins", java.util.Objects.requireNonNull(value, "admins is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCatalogId() {
        return software.amazon.jsii.Kernel.get(this, "catalogId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCatalogId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "catalogId", java.util.Objects.requireNonNull(value, "catalogId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTrustedResourceOwners() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "trustedResourceOwners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTrustedResourceOwners(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "trustedResourceOwners", java.util.Objects.requireNonNull(value, "trustedResourceOwners is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lakeformation.LakeformationDataLakeSettings}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lakeformation.LakeformationDataLakeSettings> {
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
        private imports.aws.lakeformation.LakeformationDataLakeSettingsConfig.Builder config;

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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#admins LakeformationDataLakeSettings#admins}.
         * <p>
         * @return {@code this}
         * @param admins Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#admins LakeformationDataLakeSettings#admins}. This parameter is required.
         */
        public Builder admins(final java.util.List<java.lang.String> admins) {
            this.config().admins(admins);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#catalog_id LakeformationDataLakeSettings#catalog_id}.
         * <p>
         * @return {@code this}
         * @param catalogId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#catalog_id LakeformationDataLakeSettings#catalog_id}. This parameter is required.
         */
        public Builder catalogId(final java.lang.String catalogId) {
            this.config().catalogId(catalogId);
            return this;
        }

        /**
         * create_database_default_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#create_database_default_permissions LakeformationDataLakeSettings#create_database_default_permissions}
         * <p>
         * @return {@code this}
         * @param createDatabaseDefaultPermissions create_database_default_permissions block. This parameter is required.
         */
        public Builder createDatabaseDefaultPermissions(final com.hashicorp.cdktf.IResolvable createDatabaseDefaultPermissions) {
            this.config().createDatabaseDefaultPermissions(createDatabaseDefaultPermissions);
            return this;
        }
        /**
         * create_database_default_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#create_database_default_permissions LakeformationDataLakeSettings#create_database_default_permissions}
         * <p>
         * @return {@code this}
         * @param createDatabaseDefaultPermissions create_database_default_permissions block. This parameter is required.
         */
        public Builder createDatabaseDefaultPermissions(final java.util.List<? extends imports.aws.lakeformation.LakeformationDataLakeSettingsCreateDatabaseDefaultPermissions> createDatabaseDefaultPermissions) {
            this.config().createDatabaseDefaultPermissions(createDatabaseDefaultPermissions);
            return this;
        }

        /**
         * create_table_default_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#create_table_default_permissions LakeformationDataLakeSettings#create_table_default_permissions}
         * <p>
         * @return {@code this}
         * @param createTableDefaultPermissions create_table_default_permissions block. This parameter is required.
         */
        public Builder createTableDefaultPermissions(final com.hashicorp.cdktf.IResolvable createTableDefaultPermissions) {
            this.config().createTableDefaultPermissions(createTableDefaultPermissions);
            return this;
        }
        /**
         * create_table_default_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#create_table_default_permissions LakeformationDataLakeSettings#create_table_default_permissions}
         * <p>
         * @return {@code this}
         * @param createTableDefaultPermissions create_table_default_permissions block. This parameter is required.
         */
        public Builder createTableDefaultPermissions(final java.util.List<? extends imports.aws.lakeformation.LakeformationDataLakeSettingsCreateTableDefaultPermissions> createTableDefaultPermissions) {
            this.config().createTableDefaultPermissions(createTableDefaultPermissions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#id LakeformationDataLakeSettings#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#id LakeformationDataLakeSettings#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config().id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#trusted_resource_owners LakeformationDataLakeSettings#trusted_resource_owners}.
         * <p>
         * @return {@code this}
         * @param trustedResourceOwners Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lakeformation_data_lake_settings#trusted_resource_owners LakeformationDataLakeSettings#trusted_resource_owners}. This parameter is required.
         */
        public Builder trustedResourceOwners(final java.util.List<java.lang.String> trustedResourceOwners) {
            this.config().trustedResourceOwners(trustedResourceOwners);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lakeformation.LakeformationDataLakeSettings}.
         */
        @Override
        public imports.aws.lakeformation.LakeformationDataLakeSettings build() {
            return new imports.aws.lakeformation.LakeformationDataLakeSettings(
                this.scope,
                this.id,
                this.config != null ? this.config.build() : null
            );
        }

        private imports.aws.lakeformation.LakeformationDataLakeSettingsConfig.Builder config() {
            if (this.config == null) {
                this.config = new imports.aws.lakeformation.LakeformationDataLakeSettingsConfig.Builder();
            }
            return this.config;
        }
    }
}
