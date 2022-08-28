package imports.aws.sagemaker;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group aws_sagemaker_feature_group}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.500Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFeatureGroup")
public class SagemakerFeatureGroup extends com.hashicorp.cdktf.TerraformResource {

    protected SagemakerFeatureGroup(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SagemakerFeatureGroup(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.sagemaker.SagemakerFeatureGroup.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group aws_sagemaker_feature_group} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SagemakerFeatureGroup(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putFeatureDefinition(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFeatureDefinition", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOfflineStoreConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig value) {
        software.amazon.jsii.Kernel.call(this, "putOfflineStoreConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putOnlineStoreConfig(final @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig value) {
        software.amazon.jsii.Kernel.call(this, "putOnlineStoreConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOfflineStoreConfig() {
        software.amazon.jsii.Kernel.call(this, "resetOfflineStoreConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetOnlineStoreConfig() {
        software.amazon.jsii.Kernel.call(this, "resetOnlineStoreConfig", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupFeatureDefinitionList getFeatureDefinition() {
        return software.amazon.jsii.Kernel.get(this, "featureDefinition", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupFeatureDefinitionList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigOutputReference getOfflineStoreConfig() {
        return software.amazon.jsii.Kernel.get(this, "offlineStoreConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigOutputReference getOnlineStoreConfig() {
        return software.amazon.jsii.Kernel.get(this, "onlineStoreConfig", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventTimeFeatureNameInput() {
        return software.amazon.jsii.Kernel.get(this, "eventTimeFeatureNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFeatureDefinitionInput() {
        return software.amazon.jsii.Kernel.get(this, "featureDefinitionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFeatureGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "featureGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig getOfflineStoreConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "offlineStoreConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig getOnlineStoreConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "onlineStoreConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRecordIdentifierFeatureNameInput() {
        return software.amazon.jsii.Kernel.get(this, "recordIdentifierFeatureNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getEventTimeFeatureName() {
        return software.amazon.jsii.Kernel.get(this, "eventTimeFeatureName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventTimeFeatureName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventTimeFeatureName", java.util.Objects.requireNonNull(value, "eventTimeFeatureName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFeatureGroupName() {
        return software.amazon.jsii.Kernel.get(this, "featureGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFeatureGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "featureGroupName", java.util.Objects.requireNonNull(value, "featureGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRecordIdentifierFeatureName() {
        return software.amazon.jsii.Kernel.get(this, "recordIdentifierFeatureName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRecordIdentifierFeatureName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "recordIdentifierFeatureName", java.util.Objects.requireNonNull(value, "recordIdentifierFeatureName is required"));
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

    /**
     * A fluent builder for {@link imports.aws.sagemaker.SagemakerFeatureGroup}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.sagemaker.SagemakerFeatureGroup> {
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
        private final imports.aws.sagemaker.SagemakerFeatureGroupConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.sagemaker.SagemakerFeatureGroupConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#event_time_feature_name SagemakerFeatureGroup#event_time_feature_name}.
         * <p>
         * @return {@code this}
         * @param eventTimeFeatureName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#event_time_feature_name SagemakerFeatureGroup#event_time_feature_name}. This parameter is required.
         */
        public Builder eventTimeFeatureName(final java.lang.String eventTimeFeatureName) {
            this.config.eventTimeFeatureName(eventTimeFeatureName);
            return this;
        }

        /**
         * feature_definition block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#feature_definition SagemakerFeatureGroup#feature_definition}
         * <p>
         * @return {@code this}
         * @param featureDefinition feature_definition block. This parameter is required.
         */
        public Builder featureDefinition(final com.hashicorp.cdktf.IResolvable featureDefinition) {
            this.config.featureDefinition(featureDefinition);
            return this;
        }
        /**
         * feature_definition block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#feature_definition SagemakerFeatureGroup#feature_definition}
         * <p>
         * @return {@code this}
         * @param featureDefinition feature_definition block. This parameter is required.
         */
        public Builder featureDefinition(final java.util.List<? extends imports.aws.sagemaker.SagemakerFeatureGroupFeatureDefinition> featureDefinition) {
            this.config.featureDefinition(featureDefinition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#feature_group_name SagemakerFeatureGroup#feature_group_name}.
         * <p>
         * @return {@code this}
         * @param featureGroupName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#feature_group_name SagemakerFeatureGroup#feature_group_name}. This parameter is required.
         */
        public Builder featureGroupName(final java.lang.String featureGroupName) {
            this.config.featureGroupName(featureGroupName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#record_identifier_feature_name SagemakerFeatureGroup#record_identifier_feature_name}.
         * <p>
         * @return {@code this}
         * @param recordIdentifierFeatureName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#record_identifier_feature_name SagemakerFeatureGroup#record_identifier_feature_name}. This parameter is required.
         */
        public Builder recordIdentifierFeatureName(final java.lang.String recordIdentifierFeatureName) {
            this.config.recordIdentifierFeatureName(recordIdentifierFeatureName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#role_arn SagemakerFeatureGroup#role_arn}.
         * <p>
         * @return {@code this}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#role_arn SagemakerFeatureGroup#role_arn}. This parameter is required.
         */
        public Builder roleArn(final java.lang.String roleArn) {
            this.config.roleArn(roleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#description SagemakerFeatureGroup#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#description SagemakerFeatureGroup#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#id SagemakerFeatureGroup#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#id SagemakerFeatureGroup#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * offline_store_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#offline_store_config SagemakerFeatureGroup#offline_store_config}
         * <p>
         * @return {@code this}
         * @param offlineStoreConfig offline_store_config block. This parameter is required.
         */
        public Builder offlineStoreConfig(final imports.aws.sagemaker.SagemakerFeatureGroupOfflineStoreConfig offlineStoreConfig) {
            this.config.offlineStoreConfig(offlineStoreConfig);
            return this;
        }

        /**
         * online_store_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#online_store_config SagemakerFeatureGroup#online_store_config}
         * <p>
         * @return {@code this}
         * @param onlineStoreConfig online_store_config block. This parameter is required.
         */
        public Builder onlineStoreConfig(final imports.aws.sagemaker.SagemakerFeatureGroupOnlineStoreConfig onlineStoreConfig) {
            this.config.onlineStoreConfig(onlineStoreConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#tags SagemakerFeatureGroup#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#tags SagemakerFeatureGroup#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#tags_all SagemakerFeatureGroup#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_feature_group#tags_all SagemakerFeatureGroup#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.sagemaker.SagemakerFeatureGroup}.
         */
        @Override
        public imports.aws.sagemaker.SagemakerFeatureGroup build() {
            return new imports.aws.sagemaker.SagemakerFeatureGroup(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
