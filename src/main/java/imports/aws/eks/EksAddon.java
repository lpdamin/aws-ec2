package imports.aws.eks;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/eks_addon aws_eks_addon}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.951Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eks.EksAddon")
public class EksAddon extends com.hashicorp.cdktf.TerraformResource {

    protected EksAddon(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EksAddon(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.eks.EksAddon.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/eks_addon aws_eks_addon} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EksAddon(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.eks.EksAddonConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetAddonVersion() {
        software.amazon.jsii.Kernel.call(this, "resetAddonVersion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPreserve() {
        software.amazon.jsii.Kernel.call(this, "resetPreserve", software.amazon.jsii.NativeType.VOID);
    }

    public void resetResolveConflicts() {
        software.amazon.jsii.Kernel.call(this, "resetResolveConflicts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceAccountRoleArn() {
        software.amazon.jsii.Kernel.call(this, "resetServiceAccountRoleArn", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedAt() {
        return software.amazon.jsii.Kernel.get(this, "createdAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getModifiedAt() {
        return software.amazon.jsii.Kernel.get(this, "modifiedAt", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAddonNameInput() {
        return software.amazon.jsii.Kernel.get(this, "addonNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAddonVersionInput() {
        return software.amazon.jsii.Kernel.get(this, "addonVersionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClusterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "clusterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPreserveInput() {
        return software.amazon.jsii.Kernel.get(this, "preserveInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getResolveConflictsInput() {
        return software.amazon.jsii.Kernel.get(this, "resolveConflictsInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceAccountRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAddonName() {
        return software.amazon.jsii.Kernel.get(this, "addonName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAddonName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "addonName", java.util.Objects.requireNonNull(value, "addonName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAddonVersion() {
        return software.amazon.jsii.Kernel.get(this, "addonVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAddonVersion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "addonVersion", java.util.Objects.requireNonNull(value, "addonVersion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterName() {
        return software.amazon.jsii.Kernel.get(this, "clusterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClusterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "clusterName", java.util.Objects.requireNonNull(value, "clusterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPreserve() {
        return software.amazon.jsii.Kernel.get(this, "preserve", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPreserve(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "preserve", java.util.Objects.requireNonNull(value, "preserve is required"));
    }

    public void setPreserve(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "preserve", java.util.Objects.requireNonNull(value, "preserve is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getResolveConflicts() {
        return software.amazon.jsii.Kernel.get(this, "resolveConflicts", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setResolveConflicts(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "resolveConflicts", java.util.Objects.requireNonNull(value, "resolveConflicts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceAccountRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "serviceAccountRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceAccountRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceAccountRoleArn", java.util.Objects.requireNonNull(value, "serviceAccountRoleArn is required"));
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
     * A fluent builder for {@link imports.aws.eks.EksAddon}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.eks.EksAddon> {
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
        private final imports.aws.eks.EksAddonConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.eks.EksAddonConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#addon_name EksAddon#addon_name}.
         * <p>
         * @return {@code this}
         * @param addonName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#addon_name EksAddon#addon_name}. This parameter is required.
         */
        public Builder addonName(final java.lang.String addonName) {
            this.config.addonName(addonName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#cluster_name EksAddon#cluster_name}.
         * <p>
         * @return {@code this}
         * @param clusterName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#cluster_name EksAddon#cluster_name}. This parameter is required.
         */
        public Builder clusterName(final java.lang.String clusterName) {
            this.config.clusterName(clusterName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#addon_version EksAddon#addon_version}.
         * <p>
         * @return {@code this}
         * @param addonVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#addon_version EksAddon#addon_version}. This parameter is required.
         */
        public Builder addonVersion(final java.lang.String addonVersion) {
            this.config.addonVersion(addonVersion);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#id EksAddon#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#id EksAddon#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#preserve EksAddon#preserve}.
         * <p>
         * @return {@code this}
         * @param preserve Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#preserve EksAddon#preserve}. This parameter is required.
         */
        public Builder preserve(final java.lang.Boolean preserve) {
            this.config.preserve(preserve);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#preserve EksAddon#preserve}.
         * <p>
         * @return {@code this}
         * @param preserve Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#preserve EksAddon#preserve}. This parameter is required.
         */
        public Builder preserve(final com.hashicorp.cdktf.IResolvable preserve) {
            this.config.preserve(preserve);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#resolve_conflicts EksAddon#resolve_conflicts}.
         * <p>
         * @return {@code this}
         * @param resolveConflicts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#resolve_conflicts EksAddon#resolve_conflicts}. This parameter is required.
         */
        public Builder resolveConflicts(final java.lang.String resolveConflicts) {
            this.config.resolveConflicts(resolveConflicts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#service_account_role_arn EksAddon#service_account_role_arn}.
         * <p>
         * @return {@code this}
         * @param serviceAccountRoleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#service_account_role_arn EksAddon#service_account_role_arn}. This parameter is required.
         */
        public Builder serviceAccountRoleArn(final java.lang.String serviceAccountRoleArn) {
            this.config.serviceAccountRoleArn(serviceAccountRoleArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#tags EksAddon#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#tags EksAddon#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#tags_all EksAddon#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/eks_addon#tags_all EksAddon#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.eks.EksAddon}.
         */
        @Override
        public imports.aws.eks.EksAddon build() {
            return new imports.aws.eks.EksAddon(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
