package imports.aws.cognito;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment aws_cognito_identity_pool_roles_attachment}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.151Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cognito.CognitoIdentityPoolRolesAttachment")
public class CognitoIdentityPoolRolesAttachment extends com.hashicorp.cdktf.TerraformResource {

    protected CognitoIdentityPoolRolesAttachment(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CognitoIdentityPoolRolesAttachment(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.cognito.CognitoIdentityPoolRolesAttachment.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment aws_cognito_identity_pool_roles_attachment} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public CognitoIdentityPoolRolesAttachment(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoIdentityPoolRolesAttachmentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putRoleMapping(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putRoleMapping", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRoleMapping() {
        software.amazon.jsii.Kernel.call(this, "resetRoleMapping", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.cognito.CognitoIdentityPoolRolesAttachmentRoleMappingList getRoleMapping() {
        return software.amazon.jsii.Kernel.get(this, "roleMapping", software.amazon.jsii.NativeType.forClass(imports.aws.cognito.CognitoIdentityPoolRolesAttachmentRoleMappingList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdentityPoolIdInput() {
        return software.amazon.jsii.Kernel.get(this, "identityPoolIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRoleMappingInput() {
        return software.amazon.jsii.Kernel.get(this, "roleMappingInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getRolesInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "rolesInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentityPoolId() {
        return software.amazon.jsii.Kernel.get(this, "identityPoolId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentityPoolId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identityPoolId", java.util.Objects.requireNonNull(value, "identityPoolId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getRoles() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "roles", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setRoles(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "roles", java.util.Objects.requireNonNull(value, "roles is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.cognito.CognitoIdentityPoolRolesAttachment}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.cognito.CognitoIdentityPoolRolesAttachment> {
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
        private final imports.aws.cognito.CognitoIdentityPoolRolesAttachmentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.cognito.CognitoIdentityPoolRolesAttachmentConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#identity_pool_id CognitoIdentityPoolRolesAttachment#identity_pool_id}.
         * <p>
         * @return {@code this}
         * @param identityPoolId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#identity_pool_id CognitoIdentityPoolRolesAttachment#identity_pool_id}. This parameter is required.
         */
        public Builder identityPoolId(final java.lang.String identityPoolId) {
            this.config.identityPoolId(identityPoolId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#roles CognitoIdentityPoolRolesAttachment#roles}.
         * <p>
         * @return {@code this}
         * @param roles Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#roles CognitoIdentityPoolRolesAttachment#roles}. This parameter is required.
         */
        public Builder roles(final java.util.Map<java.lang.String, java.lang.String> roles) {
            this.config.roles(roles);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#id CognitoIdentityPoolRolesAttachment#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#id CognitoIdentityPoolRolesAttachment#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * role_mapping block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#role_mapping CognitoIdentityPoolRolesAttachment#role_mapping}
         * <p>
         * @return {@code this}
         * @param roleMapping role_mapping block. This parameter is required.
         */
        public Builder roleMapping(final com.hashicorp.cdktf.IResolvable roleMapping) {
            this.config.roleMapping(roleMapping);
            return this;
        }
        /**
         * role_mapping block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/cognito_identity_pool_roles_attachment#role_mapping CognitoIdentityPoolRolesAttachment#role_mapping}
         * <p>
         * @return {@code this}
         * @param roleMapping role_mapping block. This parameter is required.
         */
        public Builder roleMapping(final java.util.List<? extends imports.aws.cognito.CognitoIdentityPoolRolesAttachmentRoleMapping> roleMapping) {
            this.config.roleMapping(roleMapping);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.cognito.CognitoIdentityPoolRolesAttachment}.
         */
        @Override
        public imports.aws.cognito.CognitoIdentityPoolRolesAttachment build() {
            return new imports.aws.cognito.CognitoIdentityPoolRolesAttachment(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
