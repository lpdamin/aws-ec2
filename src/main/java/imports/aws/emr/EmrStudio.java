package imports.aws.emr;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/emr_studio aws_emr_studio}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.134Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrStudio")
public class EmrStudio extends com.hashicorp.cdktf.TerraformResource {

    protected EmrStudio(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EmrStudio(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.emr.EmrStudio.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/emr_studio aws_emr_studio} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EmrStudio(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrStudioConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDescription() {
        software.amazon.jsii.Kernel.call(this, "resetDescription", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdpAuthUrl() {
        software.amazon.jsii.Kernel.call(this, "resetIdpAuthUrl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIdpRelayStateParameterName() {
        software.amazon.jsii.Kernel.call(this, "resetIdpRelayStateParameterName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUserRole() {
        software.amazon.jsii.Kernel.call(this, "resetUserRole", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUrl() {
        return software.amazon.jsii.Kernel.get(this, "url", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthModeInput() {
        return software.amazon.jsii.Kernel.get(this, "authModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDefaultS3LocationInput() {
        return software.amazon.jsii.Kernel.get(this, "defaultS3LocationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDescriptionInput() {
        return software.amazon.jsii.Kernel.get(this, "descriptionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEngineSecurityGroupIdInput() {
        return software.amazon.jsii.Kernel.get(this, "engineSecurityGroupIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdpAuthUrlInput() {
        return software.amazon.jsii.Kernel.get(this, "idpAuthUrlInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdpRelayStateParameterNameInput() {
        return software.amazon.jsii.Kernel.get(this, "idpRelayStateParameterNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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

    public @org.jetbrains.annotations.Nullable java.lang.String getUserRoleInput() {
        return software.amazon.jsii.Kernel.get(this, "userRoleInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWorkspaceSecurityGroupIdInput() {
        return software.amazon.jsii.Kernel.get(this, "workspaceSecurityGroupIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthMode() {
        return software.amazon.jsii.Kernel.get(this, "authMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authMode", java.util.Objects.requireNonNull(value, "authMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultS3Location() {
        return software.amazon.jsii.Kernel.get(this, "defaultS3Location", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDefaultS3Location(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "defaultS3Location", java.util.Objects.requireNonNull(value, "defaultS3Location is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDescription(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "description", java.util.Objects.requireNonNull(value, "description is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEngineSecurityGroupId() {
        return software.amazon.jsii.Kernel.get(this, "engineSecurityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEngineSecurityGroupId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "engineSecurityGroupId", java.util.Objects.requireNonNull(value, "engineSecurityGroupId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdpAuthUrl() {
        return software.amazon.jsii.Kernel.get(this, "idpAuthUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdpAuthUrl(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "idpAuthUrl", java.util.Objects.requireNonNull(value, "idpAuthUrl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdpRelayStateParameterName() {
        return software.amazon.jsii.Kernel.get(this, "idpRelayStateParameterName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdpRelayStateParameterName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "idpRelayStateParameterName", java.util.Objects.requireNonNull(value, "idpRelayStateParameterName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceRole() {
        return software.amazon.jsii.Kernel.get(this, "serviceRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceRole", java.util.Objects.requireNonNull(value, "serviceRole is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getUserRole() {
        return software.amazon.jsii.Kernel.get(this, "userRole", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserRole(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userRole", java.util.Objects.requireNonNull(value, "userRole is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkspaceSecurityGroupId() {
        return software.amazon.jsii.Kernel.get(this, "workspaceSecurityGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWorkspaceSecurityGroupId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "workspaceSecurityGroupId", java.util.Objects.requireNonNull(value, "workspaceSecurityGroupId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.emr.EmrStudio}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.emr.EmrStudio> {
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
        private final imports.aws.emr.EmrStudioConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.emr.EmrStudioConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#auth_mode EmrStudio#auth_mode}.
         * <p>
         * @return {@code this}
         * @param authMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#auth_mode EmrStudio#auth_mode}. This parameter is required.
         */
        public Builder authMode(final java.lang.String authMode) {
            this.config.authMode(authMode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#default_s3_location EmrStudio#default_s3_location}.
         * <p>
         * @return {@code this}
         * @param defaultS3Location Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#default_s3_location EmrStudio#default_s3_location}. This parameter is required.
         */
        public Builder defaultS3Location(final java.lang.String defaultS3Location) {
            this.config.defaultS3Location(defaultS3Location);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#engine_security_group_id EmrStudio#engine_security_group_id}.
         * <p>
         * @return {@code this}
         * @param engineSecurityGroupId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#engine_security_group_id EmrStudio#engine_security_group_id}. This parameter is required.
         */
        public Builder engineSecurityGroupId(final java.lang.String engineSecurityGroupId) {
            this.config.engineSecurityGroupId(engineSecurityGroupId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#name EmrStudio#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#name EmrStudio#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#service_role EmrStudio#service_role}.
         * <p>
         * @return {@code this}
         * @param serviceRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#service_role EmrStudio#service_role}. This parameter is required.
         */
        public Builder serviceRole(final java.lang.String serviceRole) {
            this.config.serviceRole(serviceRole);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#subnet_ids EmrStudio#subnet_ids}.
         * <p>
         * @return {@code this}
         * @param subnetIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#subnet_ids EmrStudio#subnet_ids}. This parameter is required.
         */
        public Builder subnetIds(final java.util.List<java.lang.String> subnetIds) {
            this.config.subnetIds(subnetIds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#vpc_id EmrStudio#vpc_id}.
         * <p>
         * @return {@code this}
         * @param vpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#vpc_id EmrStudio#vpc_id}. This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config.vpcId(vpcId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#workspace_security_group_id EmrStudio#workspace_security_group_id}.
         * <p>
         * @return {@code this}
         * @param workspaceSecurityGroupId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#workspace_security_group_id EmrStudio#workspace_security_group_id}. This parameter is required.
         */
        public Builder workspaceSecurityGroupId(final java.lang.String workspaceSecurityGroupId) {
            this.config.workspaceSecurityGroupId(workspaceSecurityGroupId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#description EmrStudio#description}.
         * <p>
         * @return {@code this}
         * @param description Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#description EmrStudio#description}. This parameter is required.
         */
        public Builder description(final java.lang.String description) {
            this.config.description(description);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#id EmrStudio#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#id EmrStudio#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#idp_auth_url EmrStudio#idp_auth_url}.
         * <p>
         * @return {@code this}
         * @param idpAuthUrl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#idp_auth_url EmrStudio#idp_auth_url}. This parameter is required.
         */
        public Builder idpAuthUrl(final java.lang.String idpAuthUrl) {
            this.config.idpAuthUrl(idpAuthUrl);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#idp_relay_state_parameter_name EmrStudio#idp_relay_state_parameter_name}.
         * <p>
         * @return {@code this}
         * @param idpRelayStateParameterName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#idp_relay_state_parameter_name EmrStudio#idp_relay_state_parameter_name}. This parameter is required.
         */
        public Builder idpRelayStateParameterName(final java.lang.String idpRelayStateParameterName) {
            this.config.idpRelayStateParameterName(idpRelayStateParameterName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#tags EmrStudio#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#tags EmrStudio#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#tags_all EmrStudio#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#tags_all EmrStudio#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#user_role EmrStudio#user_role}.
         * <p>
         * @return {@code this}
         * @param userRole Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_studio#user_role EmrStudio#user_role}. This parameter is required.
         */
        public Builder userRole(final java.lang.String userRole) {
            this.config.userRole(userRole);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.emr.EmrStudio}.
         */
        @Override
        public imports.aws.emr.EmrStudio build() {
            return new imports.aws.emr.EmrStudio(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
