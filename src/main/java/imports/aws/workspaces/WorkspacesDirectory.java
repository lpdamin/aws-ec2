package imports.aws.workspaces;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory aws_workspaces_directory}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.716Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.workspaces.WorkspacesDirectory")
public class WorkspacesDirectory extends com.hashicorp.cdktf.TerraformResource {

    protected WorkspacesDirectory(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WorkspacesDirectory(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.workspaces.WorkspacesDirectory.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory aws_workspaces_directory} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public WorkspacesDirectory(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectoryConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putSelfServicePermissions(final @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectorySelfServicePermissions value) {
        software.amazon.jsii.Kernel.call(this, "putSelfServicePermissions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWorkspaceAccessProperties(final @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectoryWorkspaceAccessProperties value) {
        software.amazon.jsii.Kernel.call(this, "putWorkspaceAccessProperties", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putWorkspaceCreationProperties(final @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectoryWorkspaceCreationProperties value) {
        software.amazon.jsii.Kernel.call(this, "putWorkspaceCreationProperties", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpGroupIds() {
        software.amazon.jsii.Kernel.call(this, "resetIpGroupIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelfServicePermissions() {
        software.amazon.jsii.Kernel.call(this, "resetSelfServicePermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSubnetIds() {
        software.amazon.jsii.Kernel.call(this, "resetSubnetIds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkspaceAccessProperties() {
        software.amazon.jsii.Kernel.call(this, "resetWorkspaceAccessProperties", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWorkspaceCreationProperties() {
        software.amazon.jsii.Kernel.call(this, "resetWorkspaceCreationProperties", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getAlias() {
        return software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCustomerUserName() {
        return software.amazon.jsii.Kernel.get(this, "customerUserName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryName() {
        return software.amazon.jsii.Kernel.get(this, "directoryName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDirectoryType() {
        return software.amazon.jsii.Kernel.get(this, "directoryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getDnsIpAddresses() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "dnsIpAddresses", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIamRoleId() {
        return software.amazon.jsii.Kernel.get(this, "iamRoleId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRegistrationCode() {
        return software.amazon.jsii.Kernel.get(this, "registrationCode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectorySelfServicePermissionsOutputReference getSelfServicePermissions() {
        return software.amazon.jsii.Kernel.get(this, "selfServicePermissions", software.amazon.jsii.NativeType.forClass(imports.aws.workspaces.WorkspacesDirectorySelfServicePermissionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectoryWorkspaceAccessPropertiesOutputReference getWorkspaceAccessProperties() {
        return software.amazon.jsii.Kernel.get(this, "workspaceAccessProperties", software.amazon.jsii.NativeType.forClass(imports.aws.workspaces.WorkspacesDirectoryWorkspaceAccessPropertiesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.workspaces.WorkspacesDirectoryWorkspaceCreationPropertiesOutputReference getWorkspaceCreationProperties() {
        return software.amazon.jsii.Kernel.get(this, "workspaceCreationProperties", software.amazon.jsii.NativeType.forClass(imports.aws.workspaces.WorkspacesDirectoryWorkspaceCreationPropertiesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkspaceSecurityGroupId() {
        return software.amazon.jsii.Kernel.get(this, "workspaceSecurityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDirectoryIdInput() {
        return software.amazon.jsii.Kernel.get(this, "directoryIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getIpGroupIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "ipGroupIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.workspaces.WorkspacesDirectorySelfServicePermissions getSelfServicePermissionsInput() {
        return software.amazon.jsii.Kernel.get(this, "selfServicePermissionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.workspaces.WorkspacesDirectorySelfServicePermissions.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSubnetIdsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "subnetIdsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.workspaces.WorkspacesDirectoryWorkspaceAccessProperties getWorkspaceAccessPropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "workspaceAccessPropertiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.workspaces.WorkspacesDirectoryWorkspaceAccessProperties.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.workspaces.WorkspacesDirectoryWorkspaceCreationProperties getWorkspaceCreationPropertiesInput() {
        return software.amazon.jsii.Kernel.get(this, "workspaceCreationPropertiesInput", software.amazon.jsii.NativeType.forClass(imports.aws.workspaces.WorkspacesDirectoryWorkspaceCreationProperties.class));
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

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getIpGroupIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "ipGroupIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setIpGroupIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "ipGroupIds", java.util.Objects.requireNonNull(value, "ipGroupIds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetIds() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "subnetIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSubnetIds(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "subnetIds", java.util.Objects.requireNonNull(value, "subnetIds is required"));
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
     * A fluent builder for {@link imports.aws.workspaces.WorkspacesDirectory}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.workspaces.WorkspacesDirectory> {
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
        private final imports.aws.workspaces.WorkspacesDirectoryConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.workspaces.WorkspacesDirectoryConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#directory_id WorkspacesDirectory#directory_id}.
         * <p>
         * @return {@code this}
         * @param directoryId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#directory_id WorkspacesDirectory#directory_id}. This parameter is required.
         */
        public Builder directoryId(final java.lang.String directoryId) {
            this.config.directoryId(directoryId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#id WorkspacesDirectory#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#id WorkspacesDirectory#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#ip_group_ids WorkspacesDirectory#ip_group_ids}.
         * <p>
         * @return {@code this}
         * @param ipGroupIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#ip_group_ids WorkspacesDirectory#ip_group_ids}. This parameter is required.
         */
        public Builder ipGroupIds(final java.util.List<java.lang.String> ipGroupIds) {
            this.config.ipGroupIds(ipGroupIds);
            return this;
        }

        /**
         * self_service_permissions block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#self_service_permissions WorkspacesDirectory#self_service_permissions}
         * <p>
         * @return {@code this}
         * @param selfServicePermissions self_service_permissions block. This parameter is required.
         */
        public Builder selfServicePermissions(final imports.aws.workspaces.WorkspacesDirectorySelfServicePermissions selfServicePermissions) {
            this.config.selfServicePermissions(selfServicePermissions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#subnet_ids WorkspacesDirectory#subnet_ids}.
         * <p>
         * @return {@code this}
         * @param subnetIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#subnet_ids WorkspacesDirectory#subnet_ids}. This parameter is required.
         */
        public Builder subnetIds(final java.util.List<java.lang.String> subnetIds) {
            this.config.subnetIds(subnetIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#tags WorkspacesDirectory#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#tags WorkspacesDirectory#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#tags_all WorkspacesDirectory#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#tags_all WorkspacesDirectory#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * workspace_access_properties block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#workspace_access_properties WorkspacesDirectory#workspace_access_properties}
         * <p>
         * @return {@code this}
         * @param workspaceAccessProperties workspace_access_properties block. This parameter is required.
         */
        public Builder workspaceAccessProperties(final imports.aws.workspaces.WorkspacesDirectoryWorkspaceAccessProperties workspaceAccessProperties) {
            this.config.workspaceAccessProperties(workspaceAccessProperties);
            return this;
        }

        /**
         * workspace_creation_properties block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/workspaces_directory#workspace_creation_properties WorkspacesDirectory#workspace_creation_properties}
         * <p>
         * @return {@code this}
         * @param workspaceCreationProperties workspace_creation_properties block. This parameter is required.
         */
        public Builder workspaceCreationProperties(final imports.aws.workspaces.WorkspacesDirectoryWorkspaceCreationProperties workspaceCreationProperties) {
            this.config.workspaceCreationProperties(workspaceCreationProperties);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.workspaces.WorkspacesDirectory}.
         */
        @Override
        public imports.aws.workspaces.WorkspacesDirectory build() {
            return new imports.aws.workspaces.WorkspacesDirectory(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
