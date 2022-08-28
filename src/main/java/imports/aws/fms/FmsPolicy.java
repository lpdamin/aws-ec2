package imports.aws.fms;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/fms_policy aws_fms_policy}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.120Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fms.FmsPolicy")
public class FmsPolicy extends com.hashicorp.cdktf.TerraformResource {

    protected FmsPolicy(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected FmsPolicy(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.fms.FmsPolicy.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/fms_policy aws_fms_policy} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public FmsPolicy(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicyConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putExcludeMap(final @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicyExcludeMap value) {
        software.amazon.jsii.Kernel.call(this, "putExcludeMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIncludeMap(final @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicyIncludeMap value) {
        software.amazon.jsii.Kernel.call(this, "putIncludeMap", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSecurityServicePolicyData(final @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicySecurityServicePolicyData value) {
        software.amazon.jsii.Kernel.call(this, "putSecurityServicePolicyData", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDeleteAllPolicyResources() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteAllPolicyResources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDeleteUnusedFmManagedResources() {
        software.amazon.jsii.Kernel.call(this, "resetDeleteUnusedFmManagedResources", software.amazon.jsii.NativeType.VOID);
    }

    public void resetExcludeMap() {
        software.amazon.jsii.Kernel.call(this, "resetExcludeMap", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeMap() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeMap", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRemediationEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetRemediationEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceTags() {
        software.amazon.jsii.Kernel.call(this, "resetResourceTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceType() {
        software.amazon.jsii.Kernel.call(this, "resetResourceType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResourceTypeList() {
        software.amazon.jsii.Kernel.call(this, "resetResourceTypeList", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicyExcludeMapOutputReference getExcludeMap() {
        return software.amazon.jsii.Kernel.get(this, "excludeMap", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicyExcludeMapOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicyIncludeMapOutputReference getIncludeMap() {
        return software.amazon.jsii.Kernel.get(this, "includeMap", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicyIncludeMapOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPolicyUpdateToken() {
        return software.amazon.jsii.Kernel.get(this, "policyUpdateToken", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.fms.FmsPolicySecurityServicePolicyDataOutputReference getSecurityServicePolicyData() {
        return software.amazon.jsii.Kernel.get(this, "securityServicePolicyData", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicySecurityServicePolicyDataOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDeleteAllPolicyResourcesInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteAllPolicyResourcesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDeleteUnusedFmManagedResourcesInput() {
        return software.amazon.jsii.Kernel.get(this, "deleteUnusedFmManagedResourcesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fms.FmsPolicyExcludeMap getExcludeMapInput() {
        return software.amazon.jsii.Kernel.get(this, "excludeMapInput", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicyExcludeMap.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getExcludeResourceTagsInput() {
        return software.amazon.jsii.Kernel.get(this, "excludeResourceTagsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fms.FmsPolicyIncludeMap getIncludeMapInput() {
        return software.amazon.jsii.Kernel.get(this, "includeMapInput", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicyIncludeMap.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRemediationEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "remediationEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getResourceTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "resourceTagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResourceTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "resourceTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceTypeListInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "resourceTypeListInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.fms.FmsPolicySecurityServicePolicyData getSecurityServicePolicyDataInput() {
        return software.amazon.jsii.Kernel.get(this, "securityServicePolicyDataInput", software.amazon.jsii.NativeType.forClass(imports.aws.fms.FmsPolicySecurityServicePolicyData.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDeleteAllPolicyResources() {
        return software.amazon.jsii.Kernel.get(this, "deleteAllPolicyResources", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDeleteAllPolicyResources(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deleteAllPolicyResources", java.util.Objects.requireNonNull(value, "deleteAllPolicyResources is required"));
    }

    public void setDeleteAllPolicyResources(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "deleteAllPolicyResources", java.util.Objects.requireNonNull(value, "deleteAllPolicyResources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getDeleteUnusedFmManagedResources() {
        return software.amazon.jsii.Kernel.get(this, "deleteUnusedFmManagedResources", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setDeleteUnusedFmManagedResources(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "deleteUnusedFmManagedResources", java.util.Objects.requireNonNull(value, "deleteUnusedFmManagedResources is required"));
    }

    public void setDeleteUnusedFmManagedResources(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "deleteUnusedFmManagedResources", java.util.Objects.requireNonNull(value, "deleteUnusedFmManagedResources is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getExcludeResourceTags() {
        return software.amazon.jsii.Kernel.get(this, "excludeResourceTags", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setExcludeResourceTags(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "excludeResourceTags", java.util.Objects.requireNonNull(value, "excludeResourceTags is required"));
    }

    public void setExcludeResourceTags(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "excludeResourceTags", java.util.Objects.requireNonNull(value, "excludeResourceTags is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getRemediationEnabled() {
        return software.amazon.jsii.Kernel.get(this, "remediationEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRemediationEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "remediationEnabled", java.util.Objects.requireNonNull(value, "remediationEnabled is required"));
    }

    public void setRemediationEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "remediationEnabled", java.util.Objects.requireNonNull(value, "remediationEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getResourceTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "resourceTags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResourceTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "resourceTags", java.util.Objects.requireNonNull(value, "resourceTags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResourceType() {
        return software.amazon.jsii.Kernel.get(this, "resourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResourceType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resourceType", java.util.Objects.requireNonNull(value, "resourceType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getResourceTypeList() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "resourceTypeList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setResourceTypeList(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "resourceTypeList", java.util.Objects.requireNonNull(value, "resourceTypeList is required"));
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
     * A fluent builder for {@link imports.aws.fms.FmsPolicy}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.fms.FmsPolicy> {
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
        private final imports.aws.fms.FmsPolicyConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.fms.FmsPolicyConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#exclude_resource_tags FmsPolicy#exclude_resource_tags}.
         * <p>
         * @return {@code this}
         * @param excludeResourceTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#exclude_resource_tags FmsPolicy#exclude_resource_tags}. This parameter is required.
         */
        public Builder excludeResourceTags(final java.lang.Boolean excludeResourceTags) {
            this.config.excludeResourceTags(excludeResourceTags);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#exclude_resource_tags FmsPolicy#exclude_resource_tags}.
         * <p>
         * @return {@code this}
         * @param excludeResourceTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#exclude_resource_tags FmsPolicy#exclude_resource_tags}. This parameter is required.
         */
        public Builder excludeResourceTags(final com.hashicorp.cdktf.IResolvable excludeResourceTags) {
            this.config.excludeResourceTags(excludeResourceTags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#name FmsPolicy#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#name FmsPolicy#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * security_service_policy_data block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fms_policy#security_service_policy_data FmsPolicy#security_service_policy_data}
         * <p>
         * @return {@code this}
         * @param securityServicePolicyData security_service_policy_data block. This parameter is required.
         */
        public Builder securityServicePolicyData(final imports.aws.fms.FmsPolicySecurityServicePolicyData securityServicePolicyData) {
            this.config.securityServicePolicyData(securityServicePolicyData);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_all_policy_resources FmsPolicy#delete_all_policy_resources}.
         * <p>
         * @return {@code this}
         * @param deleteAllPolicyResources Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_all_policy_resources FmsPolicy#delete_all_policy_resources}. This parameter is required.
         */
        public Builder deleteAllPolicyResources(final java.lang.Boolean deleteAllPolicyResources) {
            this.config.deleteAllPolicyResources(deleteAllPolicyResources);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_all_policy_resources FmsPolicy#delete_all_policy_resources}.
         * <p>
         * @return {@code this}
         * @param deleteAllPolicyResources Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_all_policy_resources FmsPolicy#delete_all_policy_resources}. This parameter is required.
         */
        public Builder deleteAllPolicyResources(final com.hashicorp.cdktf.IResolvable deleteAllPolicyResources) {
            this.config.deleteAllPolicyResources(deleteAllPolicyResources);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_unused_fm_managed_resources FmsPolicy#delete_unused_fm_managed_resources}.
         * <p>
         * @return {@code this}
         * @param deleteUnusedFmManagedResources Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_unused_fm_managed_resources FmsPolicy#delete_unused_fm_managed_resources}. This parameter is required.
         */
        public Builder deleteUnusedFmManagedResources(final java.lang.Boolean deleteUnusedFmManagedResources) {
            this.config.deleteUnusedFmManagedResources(deleteUnusedFmManagedResources);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_unused_fm_managed_resources FmsPolicy#delete_unused_fm_managed_resources}.
         * <p>
         * @return {@code this}
         * @param deleteUnusedFmManagedResources Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#delete_unused_fm_managed_resources FmsPolicy#delete_unused_fm_managed_resources}. This parameter is required.
         */
        public Builder deleteUnusedFmManagedResources(final com.hashicorp.cdktf.IResolvable deleteUnusedFmManagedResources) {
            this.config.deleteUnusedFmManagedResources(deleteUnusedFmManagedResources);
            return this;
        }

        /**
         * exclude_map block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fms_policy#exclude_map FmsPolicy#exclude_map}
         * <p>
         * @return {@code this}
         * @param excludeMap exclude_map block. This parameter is required.
         */
        public Builder excludeMap(final imports.aws.fms.FmsPolicyExcludeMap excludeMap) {
            this.config.excludeMap(excludeMap);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#id FmsPolicy#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#id FmsPolicy#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * include_map block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fms_policy#include_map FmsPolicy#include_map}
         * <p>
         * @return {@code this}
         * @param includeMap include_map block. This parameter is required.
         */
        public Builder includeMap(final imports.aws.fms.FmsPolicyIncludeMap includeMap) {
            this.config.includeMap(includeMap);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#remediation_enabled FmsPolicy#remediation_enabled}.
         * <p>
         * @return {@code this}
         * @param remediationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#remediation_enabled FmsPolicy#remediation_enabled}. This parameter is required.
         */
        public Builder remediationEnabled(final java.lang.Boolean remediationEnabled) {
            this.config.remediationEnabled(remediationEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#remediation_enabled FmsPolicy#remediation_enabled}.
         * <p>
         * @return {@code this}
         * @param remediationEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#remediation_enabled FmsPolicy#remediation_enabled}. This parameter is required.
         */
        public Builder remediationEnabled(final com.hashicorp.cdktf.IResolvable remediationEnabled) {
            this.config.remediationEnabled(remediationEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#resource_tags FmsPolicy#resource_tags}.
         * <p>
         * @return {@code this}
         * @param resourceTags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#resource_tags FmsPolicy#resource_tags}. This parameter is required.
         */
        public Builder resourceTags(final java.util.Map<java.lang.String, java.lang.String> resourceTags) {
            this.config.resourceTags(resourceTags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#resource_type FmsPolicy#resource_type}.
         * <p>
         * @return {@code this}
         * @param resourceType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#resource_type FmsPolicy#resource_type}. This parameter is required.
         */
        public Builder resourceType(final java.lang.String resourceType) {
            this.config.resourceType(resourceType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#resource_type_list FmsPolicy#resource_type_list}.
         * <p>
         * @return {@code this}
         * @param resourceTypeList Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#resource_type_list FmsPolicy#resource_type_list}. This parameter is required.
         */
        public Builder resourceTypeList(final java.util.List<java.lang.String> resourceTypeList) {
            this.config.resourceTypeList(resourceTypeList);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#tags FmsPolicy#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#tags FmsPolicy#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#tags_all FmsPolicy#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fms_policy#tags_all FmsPolicy#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.fms.FmsPolicy}.
         */
        @Override
        public imports.aws.fms.FmsPolicy build() {
            return new imports.aws.fms.FmsPolicy(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
