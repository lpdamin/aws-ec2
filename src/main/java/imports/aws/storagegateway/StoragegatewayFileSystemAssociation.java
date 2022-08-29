package imports.aws.storagegateway;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association aws_storagegateway_file_system_association}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.787Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.StoragegatewayFileSystemAssociation")
public class StoragegatewayFileSystemAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected StoragegatewayFileSystemAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewayFileSystemAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.storagegateway.StoragegatewayFileSystemAssociation.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association aws_storagegateway_file_system_association} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public StoragegatewayFileSystemAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.storagegateway.StoragegatewayFileSystemAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putCacheAttributes(final @org.jetbrains.annotations.NotNull imports.aws.storagegateway.StoragegatewayFileSystemAssociationCacheAttributes value) {
        software.amazon.jsii.Kernel.call(this, "putCacheAttributes", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAuditDestinationArn() {
        software.amazon.jsii.Kernel.call(this, "resetAuditDestinationArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCacheAttributes() {
        software.amazon.jsii.Kernel.call(this, "resetCacheAttributes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull imports.aws.storagegateway.StoragegatewayFileSystemAssociationCacheAttributesOutputReference getCacheAttributes() {
        return software.amazon.jsii.Kernel.get(this, "cacheAttributes", software.amazon.jsii.NativeType.forClass(imports.aws.storagegateway.StoragegatewayFileSystemAssociationCacheAttributesOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuditDestinationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "auditDestinationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.storagegateway.StoragegatewayFileSystemAssociationCacheAttributes getCacheAttributesInput() {
        return software.amazon.jsii.Kernel.get(this, "cacheAttributesInput", software.amazon.jsii.NativeType.forClass(imports.aws.storagegateway.StoragegatewayFileSystemAssociationCacheAttributes.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGatewayArnInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLocationArnInput() {
        return software.amazon.jsii.Kernel.get(this, "locationArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPasswordInput() {
        return software.amazon.jsii.Kernel.get(this, "passwordInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUsernameInput() {
        return software.amazon.jsii.Kernel.get(this, "usernameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuditDestinationArn() {
        return software.amazon.jsii.Kernel.get(this, "auditDestinationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuditDestinationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "auditDestinationArn", java.util.Objects.requireNonNull(value, "auditDestinationArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGatewayArn() {
        return software.amazon.jsii.Kernel.get(this, "gatewayArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGatewayArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "gatewayArn", java.util.Objects.requireNonNull(value, "gatewayArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLocationArn() {
        return software.amazon.jsii.Kernel.get(this, "locationArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLocationArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "locationArn", java.util.Objects.requireNonNull(value, "locationArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPassword() {
        return software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPassword(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "password", java.util.Objects.requireNonNull(value, "password is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getUsername() {
        return software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUsername(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "username", java.util.Objects.requireNonNull(value, "username is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.storagegateway.StoragegatewayFileSystemAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.storagegateway.StoragegatewayFileSystemAssociation> {
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
        private final imports.aws.storagegateway.StoragegatewayFileSystemAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.storagegateway.StoragegatewayFileSystemAssociationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#gateway_arn StoragegatewayFileSystemAssociation#gateway_arn}.
         * <p>
         * @return {@code this}
         * @param gatewayArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#gateway_arn StoragegatewayFileSystemAssociation#gateway_arn}. This parameter is required.
         */
        public Builder gatewayArn(final java.lang.String gatewayArn) {
            this.config.gatewayArn(gatewayArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#location_arn StoragegatewayFileSystemAssociation#location_arn}.
         * <p>
         * @return {@code this}
         * @param locationArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#location_arn StoragegatewayFileSystemAssociation#location_arn}. This parameter is required.
         */
        public Builder locationArn(final java.lang.String locationArn) {
            this.config.locationArn(locationArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#password StoragegatewayFileSystemAssociation#password}.
         * <p>
         * @return {@code this}
         * @param password Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#password StoragegatewayFileSystemAssociation#password}. This parameter is required.
         */
        public Builder password(final java.lang.String password) {
            this.config.password(password);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#username StoragegatewayFileSystemAssociation#username}.
         * <p>
         * @return {@code this}
         * @param username Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#username StoragegatewayFileSystemAssociation#username}. This parameter is required.
         */
        public Builder username(final java.lang.String username) {
            this.config.username(username);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#audit_destination_arn StoragegatewayFileSystemAssociation#audit_destination_arn}.
         * <p>
         * @return {@code this}
         * @param auditDestinationArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#audit_destination_arn StoragegatewayFileSystemAssociation#audit_destination_arn}. This parameter is required.
         */
        public Builder auditDestinationArn(final java.lang.String auditDestinationArn) {
            this.config.auditDestinationArn(auditDestinationArn);
            return this;
        }

        /**
         * cache_attributes block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#cache_attributes StoragegatewayFileSystemAssociation#cache_attributes}
         * <p>
         * @return {@code this}
         * @param cacheAttributes cache_attributes block. This parameter is required.
         */
        public Builder cacheAttributes(final imports.aws.storagegateway.StoragegatewayFileSystemAssociationCacheAttributes cacheAttributes) {
            this.config.cacheAttributes(cacheAttributes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#id StoragegatewayFileSystemAssociation#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#id StoragegatewayFileSystemAssociation#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#tags StoragegatewayFileSystemAssociation#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#tags StoragegatewayFileSystemAssociation#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#tags_all StoragegatewayFileSystemAssociation#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_file_system_association#tags_all StoragegatewayFileSystemAssociation#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.storagegateway.StoragegatewayFileSystemAssociation}.
         */
        @Override
        public imports.aws.storagegateway.StoragegatewayFileSystemAssociation build() {
            return new imports.aws.storagegateway.StoragegatewayFileSystemAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
