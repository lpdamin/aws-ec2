package imports.aws.ssm;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ssm_document aws_ssm_document}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.755Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ssm.SsmDocument")
public class SsmDocument extends com.hashicorp.cdktf.TerraformResource {

    protected SsmDocument(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SsmDocument(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ssm.SsmDocument.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ssm_document aws_ssm_document} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SsmDocument(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ssm.SsmDocumentConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAttachmentsSource(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAttachmentsSource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAttachmentsSource() {
        software.amazon.jsii.Kernel.call(this, "resetAttachmentsSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDocumentFormat() {
        software.amazon.jsii.Kernel.call(this, "resetDocumentFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPermissions() {
        software.amazon.jsii.Kernel.call(this, "resetPermissions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetType() {
        software.amazon.jsii.Kernel.call(this, "resetTargetType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetVersionName() {
        software.amazon.jsii.Kernel.call(this, "resetVersionName", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ssm.SsmDocumentAttachmentsSourceList getAttachmentsSource() {
        return software.amazon.jsii.Kernel.get(this, "attachmentsSource", software.amazon.jsii.NativeType.forClass(imports.aws.ssm.SsmDocumentAttachmentsSourceList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedDate() {
        return software.amazon.jsii.Kernel.get(this, "createdDate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDefaultVersion() {
        return software.amazon.jsii.Kernel.get(this, "defaultVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDescription() {
        return software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentVersion() {
        return software.amazon.jsii.Kernel.get(this, "documentVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHash() {
        return software.amazon.jsii.Kernel.get(this, "hash", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHashType() {
        return software.amazon.jsii.Kernel.get(this, "hashType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLatestVersion() {
        return software.amazon.jsii.Kernel.get(this, "latestVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwner() {
        return software.amazon.jsii.Kernel.get(this, "owner", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ssm.SsmDocumentParameterList getParameter() {
        return software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.forClass(imports.aws.ssm.SsmDocumentParameterList.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getPlatformTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "platformTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSchemaVersion() {
        return software.amazon.jsii.Kernel.get(this, "schemaVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStatus() {
        return software.amazon.jsii.Kernel.get(this, "status", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAttachmentsSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "attachmentsSourceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getContentInput() {
        return software.amazon.jsii.Kernel.get(this, "contentInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDocumentFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "documentFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDocumentTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "documentTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getPermissionsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "permissionsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "targetTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVersionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "versionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getContent() {
        return software.amazon.jsii.Kernel.get(this, "content", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setContent(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "content", java.util.Objects.requireNonNull(value, "content is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentFormat() {
        return software.amazon.jsii.Kernel.get(this, "documentFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDocumentFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "documentFormat", java.util.Objects.requireNonNull(value, "documentFormat is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDocumentType() {
        return software.amazon.jsii.Kernel.get(this, "documentType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDocumentType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "documentType", java.util.Objects.requireNonNull(value, "documentType is required"));
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

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getPermissions() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "permissions", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setPermissions(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "permissions", java.util.Objects.requireNonNull(value, "permissions is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetType() {
        return software.amazon.jsii.Kernel.get(this, "targetType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetType", java.util.Objects.requireNonNull(value, "targetType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVersionName() {
        return software.amazon.jsii.Kernel.get(this, "versionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVersionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "versionName", java.util.Objects.requireNonNull(value, "versionName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ssm.SsmDocument}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ssm.SsmDocument> {
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
        private final imports.aws.ssm.SsmDocumentConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ssm.SsmDocumentConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#content SsmDocument#content}.
         * <p>
         * @return {@code this}
         * @param content Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#content SsmDocument#content}. This parameter is required.
         */
        public Builder content(final java.lang.String content) {
            this.config.content(content);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#document_type SsmDocument#document_type}.
         * <p>
         * @return {@code this}
         * @param documentType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#document_type SsmDocument#document_type}. This parameter is required.
         */
        public Builder documentType(final java.lang.String documentType) {
            this.config.documentType(documentType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#name SsmDocument#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#name SsmDocument#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * attachments_source block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ssm_document#attachments_source SsmDocument#attachments_source}
         * <p>
         * @return {@code this}
         * @param attachmentsSource attachments_source block. This parameter is required.
         */
        public Builder attachmentsSource(final com.hashicorp.cdktf.IResolvable attachmentsSource) {
            this.config.attachmentsSource(attachmentsSource);
            return this;
        }
        /**
         * attachments_source block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ssm_document#attachments_source SsmDocument#attachments_source}
         * <p>
         * @return {@code this}
         * @param attachmentsSource attachments_source block. This parameter is required.
         */
        public Builder attachmentsSource(final java.util.List<? extends imports.aws.ssm.SsmDocumentAttachmentsSource> attachmentsSource) {
            this.config.attachmentsSource(attachmentsSource);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#document_format SsmDocument#document_format}.
         * <p>
         * @return {@code this}
         * @param documentFormat Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#document_format SsmDocument#document_format}. This parameter is required.
         */
        public Builder documentFormat(final java.lang.String documentFormat) {
            this.config.documentFormat(documentFormat);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#id SsmDocument#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#id SsmDocument#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#permissions SsmDocument#permissions}.
         * <p>
         * @return {@code this}
         * @param permissions Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#permissions SsmDocument#permissions}. This parameter is required.
         */
        public Builder permissions(final java.util.Map<java.lang.String, java.lang.String> permissions) {
            this.config.permissions(permissions);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#tags SsmDocument#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#tags SsmDocument#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#tags_all SsmDocument#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#tags_all SsmDocument#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#target_type SsmDocument#target_type}.
         * <p>
         * @return {@code this}
         * @param targetType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#target_type SsmDocument#target_type}. This parameter is required.
         */
        public Builder targetType(final java.lang.String targetType) {
            this.config.targetType(targetType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#version_name SsmDocument#version_name}.
         * <p>
         * @return {@code this}
         * @param versionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ssm_document#version_name SsmDocument#version_name}. This parameter is required.
         */
        public Builder versionName(final java.lang.String versionName) {
            this.config.versionName(versionName);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ssm.SsmDocument}.
         */
        @Override
        public imports.aws.ssm.SsmDocument build() {
            return new imports.aws.ssm.SsmDocument(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
