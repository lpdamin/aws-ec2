package imports.aws.kms;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key aws_kms_replica_external_key}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.702Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.kms.KmsReplicaExternalKey")
public class KmsReplicaExternalKey extends com.hashicorp.cdktf.TerraformResource {

    protected KmsReplicaExternalKey(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KmsReplicaExternalKey(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.kms.KmsReplicaExternalKey.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key aws_kms_replica_external_key} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public KmsReplicaExternalKey(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.kms.KmsReplicaExternalKeyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBypassPolicyLockoutSafetyCheck() {
        software.amazon.jsii.Kernel.call(this, "resetBypassPolicyLockoutSafetyCheck", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeletionWindowInDays() {
        software.amazon.jsii.Kernel.call(this, "resetDeletionWindowInDays", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKeyMaterialBase64() {
        software.amazon.jsii.Kernel.call(this, "resetKeyMaterialBase64", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPolicy() {
        software.amazon.jsii.Kernel.call(this, "resetPolicy", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetValidTo() {
        software.amazon.jsii.Kernel.call(this, "resetValidTo", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getExpirationModel() {
        return software.amazon.jsii.Kernel.get(this, "expirationModel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyId() {
        return software.amazon.jsii.Kernel.get(this, "keyId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyState() {
        return software.amazon.jsii.Kernel.get(this, "keyState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyUsage() {
        return software.amazon.jsii.Kernel.get(this, "keyUsage", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBypassPolicyLockoutSafetyCheckInput() {
        return software.amazon.jsii.Kernel.get(this, "bypassPolicyLockoutSafetyCheckInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getDeletionWindowInDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "deletionWindowInDaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKeyMaterialBase64Input() {
        return software.amazon.jsii.Kernel.get(this, "keyMaterialBase64Input", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPolicyInput() {
        return software.amazon.jsii.Kernel.get(this, "policyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPrimaryKeyArnInput() {
        return software.amazon.jsii.Kernel.get(this, "primaryKeyArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getValidToInput() {
        return software.amazon.jsii.Kernel.get(this, "validToInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getBypassPolicyLockoutSafetyCheck() {
        return software.amazon.jsii.Kernel.get(this, "bypassPolicyLockoutSafetyCheck", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setBypassPolicyLockoutSafetyCheck(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "bypassPolicyLockoutSafetyCheck", java.util.Objects.requireNonNull(value, "bypassPolicyLockoutSafetyCheck is required"));
    }

    public void setBypassPolicyLockoutSafetyCheck(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "bypassPolicyLockoutSafetyCheck", java.util.Objects.requireNonNull(value, "bypassPolicyLockoutSafetyCheck is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getDeletionWindowInDays() {
        return software.amazon.jsii.Kernel.get(this, "deletionWindowInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setDeletionWindowInDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "deletionWindowInDays", java.util.Objects.requireNonNull(value, "deletionWindowInDays is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKeyMaterialBase64() {
        return software.amazon.jsii.Kernel.get(this, "keyMaterialBase64", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKeyMaterialBase64(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "keyMaterialBase64", java.util.Objects.requireNonNull(value, "keyMaterialBase64 is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicy() {
        return software.amazon.jsii.Kernel.get(this, "policy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPolicy(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "policy", java.util.Objects.requireNonNull(value, "policy is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPrimaryKeyArn() {
        return software.amazon.jsii.Kernel.get(this, "primaryKeyArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPrimaryKeyArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "primaryKeyArn", java.util.Objects.requireNonNull(value, "primaryKeyArn is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getValidTo() {
        return software.amazon.jsii.Kernel.get(this, "validTo", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setValidTo(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "validTo", java.util.Objects.requireNonNull(value, "validTo is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.kms.KmsReplicaExternalKey}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.kms.KmsReplicaExternalKey> {
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
        private final imports.aws.kms.KmsReplicaExternalKeyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.kms.KmsReplicaExternalKeyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#primary_key_arn KmsReplicaExternalKey#primary_key_arn}.
         * <p>
         * @return {@code this}
         * @param primaryKeyArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#primary_key_arn KmsReplicaExternalKey#primary_key_arn}. This parameter is required.
         */
        public Builder primaryKeyArn(final java.lang.String primaryKeyArn) {
            this.config.primaryKeyArn(primaryKeyArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#bypass_policy_lockout_safety_check KmsReplicaExternalKey#bypass_policy_lockout_safety_check}.
         * <p>
         * @return {@code this}
         * @param bypassPolicyLockoutSafetyCheck Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#bypass_policy_lockout_safety_check KmsReplicaExternalKey#bypass_policy_lockout_safety_check}. This parameter is required.
         */
        public Builder bypassPolicyLockoutSafetyCheck(final java.lang.Boolean bypassPolicyLockoutSafetyCheck) {
            this.config.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#bypass_policy_lockout_safety_check KmsReplicaExternalKey#bypass_policy_lockout_safety_check}.
         * <p>
         * @return {@code this}
         * @param bypassPolicyLockoutSafetyCheck Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#bypass_policy_lockout_safety_check KmsReplicaExternalKey#bypass_policy_lockout_safety_check}. This parameter is required.
         */
        public Builder bypassPolicyLockoutSafetyCheck(final com.hashicorp.cdktf.IResolvable bypassPolicyLockoutSafetyCheck) {
            this.config.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#deletion_window_in_days KmsReplicaExternalKey#deletion_window_in_days}.
         * <p>
         * @return {@code this}
         * @param deletionWindowInDays Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#deletion_window_in_days KmsReplicaExternalKey#deletion_window_in_days}. This parameter is required.
         */
        public Builder deletionWindowInDays(final java.lang.Number deletionWindowInDays) {
            this.config.deletionWindowInDays(deletionWindowInDays);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#description KmsReplicaExternalKey#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#description KmsReplicaExternalKey#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#enabled KmsReplicaExternalKey#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#enabled KmsReplicaExternalKey#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#enabled KmsReplicaExternalKey#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#enabled KmsReplicaExternalKey#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#id KmsReplicaExternalKey#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#id KmsReplicaExternalKey#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#key_material_base64 KmsReplicaExternalKey#key_material_base64}.
         * <p>
         * @return {@code this}
         * @param keyMaterialBase64 Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#key_material_base64 KmsReplicaExternalKey#key_material_base64}. This parameter is required.
         */
        public Builder keyMaterialBase64(final java.lang.String keyMaterialBase64) {
            this.config.keyMaterialBase64(keyMaterialBase64);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#policy KmsReplicaExternalKey#policy}.
         * <p>
         * @return {@code this}
         * @param policy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#policy KmsReplicaExternalKey#policy}. This parameter is required.
         */
        public Builder policy(final java.lang.String policy) {
            this.config.policy(policy);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#tags KmsReplicaExternalKey#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#tags KmsReplicaExternalKey#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#tags_all KmsReplicaExternalKey#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#tags_all KmsReplicaExternalKey#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#valid_to KmsReplicaExternalKey#valid_to}.
         * <p>
         * @return {@code this}
         * @param validTo Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/kms_replica_external_key#valid_to KmsReplicaExternalKey#valid_to}. This parameter is required.
         */
        public Builder validTo(final java.lang.String validTo) {
            this.config.validTo(validTo);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.kms.KmsReplicaExternalKey}.
         */
        @Override
        public imports.aws.kms.KmsReplicaExternalKey build() {
            return new imports.aws.kms.KmsReplicaExternalKey(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
