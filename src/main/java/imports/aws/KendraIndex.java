package imports.aws;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/kendra_index aws_kendra_index}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.294Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.KendraIndex")
public class KendraIndex extends com.hashicorp.cdktf.TerraformResource {

    protected KendraIndex(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KendraIndex(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.KendraIndex.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/kendra_index aws_kendra_index} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public KendraIndex(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.KendraIndexConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCapacityUnits(final @org.jetbrains.annotations.NotNull imports.aws.KendraIndexCapacityUnits value) {
        software.amazon.jsii.Kernel.call(this, "putCapacityUnits", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDocumentMetadataConfigurationUpdates(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDocumentMetadataConfigurationUpdates", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServerSideEncryptionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraIndexServerSideEncryptionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putServerSideEncryptionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.KendraIndexTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserGroupResolutionConfiguration(final @org.jetbrains.annotations.NotNull imports.aws.KendraIndexUserGroupResolutionConfiguration value) {
        software.amazon.jsii.Kernel.call(this, "putUserGroupResolutionConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUserTokenConfigurations(final @org.jetbrains.annotations.NotNull imports.aws.KendraIndexUserTokenConfigurations value) {
        software.amazon.jsii.Kernel.call(this, "putUserTokenConfigurations", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCapacityUnits() {
        software.amazon.jsii.Kernel.call(this, "resetCapacityUnits", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDocumentMetadataConfigurationUpdates() {
        software.amazon.jsii.Kernel.call(this, "resetDocumentMetadataConfigurationUpdates", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEdition() {
        software.amazon.jsii.Kernel.call(this, "resetEdition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryptionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryptionConfiguration", software.amazon.jsii.NativeType.VOID);
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

    public void resetUserContextPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetUserContextPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserGroupResolutionConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetUserGroupResolutionConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserTokenConfigurations() {
        software.amazon.jsii.Kernel.call(this, "resetUserTokenConfigurations", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexCapacityUnitsOutputReference getCapacityUnits() {
        return software.amazon.jsii.Kernel.get(this, "capacityUnits", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexCapacityUnitsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedAt() {
        return software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexDocumentMetadataConfigurationUpdatesList getDocumentMetadataConfigurationUpdates() {
        return software.amazon.jsii.Kernel.get(this, "documentMetadataConfigurationUpdates", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexDocumentMetadataConfigurationUpdatesList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getErrorMessage() {
        return software.amazon.jsii.Kernel.get(this, "errorMessage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexIndexStatisticsList getIndexStatistics() {
        return software.amazon.jsii.Kernel.get(this, "indexStatistics", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexIndexStatisticsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexServerSideEncryptionConfigurationOutputReference getServerSideEncryptionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexServerSideEncryptionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUpdatedAt() {
        return software.amazon.jsii.Kernel.get(this, "updatedAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexUserGroupResolutionConfigurationOutputReference getUserGroupResolutionConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "userGroupResolutionConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserGroupResolutionConfigurationOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.KendraIndexUserTokenConfigurationsOutputReference getUserTokenConfigurations() {
        return software.amazon.jsii.Kernel.get(this, "userTokenConfigurations", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserTokenConfigurationsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraIndexCapacityUnits getCapacityUnitsInput() {
        return software.amazon.jsii.Kernel.get(this, "capacityUnitsInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexCapacityUnits.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDocumentMetadataConfigurationUpdatesInput() {
        return software.amazon.jsii.Kernel.get(this, "documentMetadataConfigurationUpdatesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEditionInput() {
        return software.amazon.jsii.Kernel.get(this, "editionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraIndexServerSideEncryptionConfiguration getServerSideEncryptionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexServerSideEncryptionConfiguration.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getUserContextPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "userContextPolicyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserGroupResolutionConfiguration getUserGroupResolutionConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "userGroupResolutionConfigurationInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserGroupResolutionConfiguration.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.KendraIndexUserTokenConfigurations getUserTokenConfigurationsInput() {
        return software.amazon.jsii.Kernel.get(this, "userTokenConfigurationsInput", software.amazon.jsii.NativeType.forClass(imports.aws.KendraIndexUserTokenConfigurations.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEdition() {
        return software.amazon.jsii.Kernel.get(this, "edition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEdition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "edition", java.util.Objects.requireNonNull(value, "edition is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getUserContextPolicy() {
        return software.amazon.jsii.Kernel.get(this, "userContextPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserContextPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userContextPolicy", java.util.Objects.requireNonNull(value, "userContextPolicy is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.KendraIndex}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.KendraIndex> {
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
        private final imports.aws.KendraIndexConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.KendraIndexConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#name KendraIndex#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#name KendraIndex#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#role_arn KendraIndex#role_arn}.
         * <p>
         * @return {@code this}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#role_arn KendraIndex#role_arn}. This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config.roleArn(roleArn);
            return this;
        }

        /**
         * capacity_units block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#capacity_units KendraIndex#capacity_units}
         * <p>
         * @return {@code this}
         * @param capacityUnits capacity_units block. This parameter is required.
         */
        public Builder capacityUnits(final imports.aws.KendraIndexCapacityUnits capacityUnits) {
            this.config.capacityUnits(capacityUnits);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#description KendraIndex#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#description KendraIndex#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * document_metadata_configuration_updates block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#document_metadata_configuration_updates KendraIndex#document_metadata_configuration_updates}
         * <p>
         * @return {@code this}
         * @param documentMetadataConfigurationUpdates document_metadata_configuration_updates block. This parameter is required.
         */
        public Builder documentMetadataConfigurationUpdates(final com.hashicorp.cdktf.IResolvable documentMetadataConfigurationUpdates) {
            this.config.documentMetadataConfigurationUpdates(documentMetadataConfigurationUpdates);
            return this;
        }
        /**
         * document_metadata_configuration_updates block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#document_metadata_configuration_updates KendraIndex#document_metadata_configuration_updates}
         * <p>
         * @return {@code this}
         * @param documentMetadataConfigurationUpdates document_metadata_configuration_updates block. This parameter is required.
         */
        public Builder documentMetadataConfigurationUpdates(final java.util.List<? extends imports.aws.KendraIndexDocumentMetadataConfigurationUpdates> documentMetadataConfigurationUpdates) {
            this.config.documentMetadataConfigurationUpdates(documentMetadataConfigurationUpdates);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#edition KendraIndex#edition}.
         * <p>
         * @return {@code this}
         * @param edition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#edition KendraIndex#edition}. This parameter is required.
         */
        public Builder edition(final java.lang.String edition) {
            this.config.edition(edition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#id KendraIndex#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#id KendraIndex#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * server_side_encryption_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#server_side_encryption_configuration KendraIndex#server_side_encryption_configuration}
         * <p>
         * @return {@code this}
         * @param serverSideEncryptionConfiguration server_side_encryption_configuration block. This parameter is required.
         */
        public Builder serverSideEncryptionConfiguration(final imports.aws.KendraIndexServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
            this.config.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#tags KendraIndex#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#tags KendraIndex#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#tags_all KendraIndex#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#tags_all KendraIndex#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#timeouts KendraIndex#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.KendraIndexTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#user_context_policy KendraIndex#user_context_policy}.
         * <p>
         * @return {@code this}
         * @param userContextPolicy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kendra_index#user_context_policy KendraIndex#user_context_policy}. This parameter is required.
         */
        public Builder userContextPolicy(final java.lang.String userContextPolicy) {
            this.config.userContextPolicy(userContextPolicy);
            return this;
        }

        /**
         * user_group_resolution_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#user_group_resolution_configuration KendraIndex#user_group_resolution_configuration}
         * <p>
         * @return {@code this}
         * @param userGroupResolutionConfiguration user_group_resolution_configuration block. This parameter is required.
         */
        public Builder userGroupResolutionConfiguration(final imports.aws.KendraIndexUserGroupResolutionConfiguration userGroupResolutionConfiguration) {
            this.config.userGroupResolutionConfiguration(userGroupResolutionConfiguration);
            return this;
        }

        /**
         * user_token_configurations block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/kendra_index#user_token_configurations KendraIndex#user_token_configurations}
         * <p>
         * @return {@code this}
         * @param userTokenConfigurations user_token_configurations block. This parameter is required.
         */
        public Builder userTokenConfigurations(final imports.aws.KendraIndexUserTokenConfigurations userTokenConfigurations) {
            this.config.userTokenConfigurations(userTokenConfigurations);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.KendraIndex}.
         */
        @Override
        public imports.aws.KendraIndex build() {
            return new imports.aws.KendraIndex(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
