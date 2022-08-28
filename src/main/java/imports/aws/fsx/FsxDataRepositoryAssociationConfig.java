package imports.aws.fsx;

/**
 * AWS File System FSx.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.146Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.fsx.FsxDataRepositoryAssociationConfig")
@software.amazon.jsii.Jsii.Proxy(FsxDataRepositoryAssociationConfig.Jsii$Proxy.class)
public interface FsxDataRepositoryAssociationConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#data_repository_path FsxDataRepositoryAssociation#data_repository_path}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDataRepositoryPath();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#file_system_id FsxDataRepositoryAssociation#file_system_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFileSystemId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#file_system_path FsxDataRepositoryAssociation#file_system_path}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFileSystemPath();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#batch_import_meta_data_on_create FsxDataRepositoryAssociation#batch_import_meta_data_on_create}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getBatchImportMetaDataOnCreate() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#delete_data_in_filesystem FsxDataRepositoryAssociation#delete_data_in_filesystem}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getDeleteDataInFilesystem() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#id FsxDataRepositoryAssociation#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#imported_file_chunk_size FsxDataRepositoryAssociation#imported_file_chunk_size}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getImportedFileChunkSize() {
        return null;
    }

    /**
     * s3 block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#s3 FsxDataRepositoryAssociation#s3}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxDataRepositoryAssociationS3 getS3() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#tags FsxDataRepositoryAssociation#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#tags_all FsxDataRepositoryAssociation#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#timeouts FsxDataRepositoryAssociation#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.fsx.FsxDataRepositoryAssociationTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link FsxDataRepositoryAssociationConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link FsxDataRepositoryAssociationConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<FsxDataRepositoryAssociationConfig> {
        java.lang.String dataRepositoryPath;
        java.lang.String fileSystemId;
        java.lang.String fileSystemPath;
        java.lang.Object batchImportMetaDataOnCreate;
        java.lang.Object deleteDataInFilesystem;
        java.lang.String id;
        java.lang.Number importedFileChunkSize;
        imports.aws.fsx.FsxDataRepositoryAssociationS3 s3;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        imports.aws.fsx.FsxDataRepositoryAssociationTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getDataRepositoryPath}
         * @param dataRepositoryPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#data_repository_path FsxDataRepositoryAssociation#data_repository_path}. This parameter is required.
         * @return {@code this}
         */
        public Builder dataRepositoryPath(java.lang.String dataRepositoryPath) {
            this.dataRepositoryPath = dataRepositoryPath;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getFileSystemId}
         * @param fileSystemId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#file_system_id FsxDataRepositoryAssociation#file_system_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder fileSystemId(java.lang.String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getFileSystemPath}
         * @param fileSystemPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#file_system_path FsxDataRepositoryAssociation#file_system_path}. This parameter is required.
         * @return {@code this}
         */
        public Builder fileSystemPath(java.lang.String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getBatchImportMetaDataOnCreate}
         * @param batchImportMetaDataOnCreate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#batch_import_meta_data_on_create FsxDataRepositoryAssociation#batch_import_meta_data_on_create}.
         * @return {@code this}
         */
        public Builder batchImportMetaDataOnCreate(java.lang.Boolean batchImportMetaDataOnCreate) {
            this.batchImportMetaDataOnCreate = batchImportMetaDataOnCreate;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getBatchImportMetaDataOnCreate}
         * @param batchImportMetaDataOnCreate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#batch_import_meta_data_on_create FsxDataRepositoryAssociation#batch_import_meta_data_on_create}.
         * @return {@code this}
         */
        public Builder batchImportMetaDataOnCreate(com.hashicorp.cdktf.IResolvable batchImportMetaDataOnCreate) {
            this.batchImportMetaDataOnCreate = batchImportMetaDataOnCreate;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getDeleteDataInFilesystem}
         * @param deleteDataInFilesystem Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#delete_data_in_filesystem FsxDataRepositoryAssociation#delete_data_in_filesystem}.
         * @return {@code this}
         */
        public Builder deleteDataInFilesystem(java.lang.Boolean deleteDataInFilesystem) {
            this.deleteDataInFilesystem = deleteDataInFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getDeleteDataInFilesystem}
         * @param deleteDataInFilesystem Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#delete_data_in_filesystem FsxDataRepositoryAssociation#delete_data_in_filesystem}.
         * @return {@code this}
         */
        public Builder deleteDataInFilesystem(com.hashicorp.cdktf.IResolvable deleteDataInFilesystem) {
            this.deleteDataInFilesystem = deleteDataInFilesystem;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#id FsxDataRepositoryAssociation#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getImportedFileChunkSize}
         * @param importedFileChunkSize Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#imported_file_chunk_size FsxDataRepositoryAssociation#imported_file_chunk_size}.
         * @return {@code this}
         */
        public Builder importedFileChunkSize(java.lang.Number importedFileChunkSize) {
            this.importedFileChunkSize = importedFileChunkSize;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getS3}
         * @param s3 s3 block.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#s3 FsxDataRepositoryAssociation#s3}
         * @return {@code this}
         */
        public Builder s3(imports.aws.fsx.FsxDataRepositoryAssociationS3 s3) {
            this.s3 = s3;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#tags FsxDataRepositoryAssociation#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#tags_all FsxDataRepositoryAssociation#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/fsx_data_repository_association#timeouts FsxDataRepositoryAssociation#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.fsx.FsxDataRepositoryAssociationTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link FsxDataRepositoryAssociationConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link FsxDataRepositoryAssociationConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public FsxDataRepositoryAssociationConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link FsxDataRepositoryAssociationConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements FsxDataRepositoryAssociationConfig {
        private final java.lang.String dataRepositoryPath;
        private final java.lang.String fileSystemId;
        private final java.lang.String fileSystemPath;
        private final java.lang.Object batchImportMetaDataOnCreate;
        private final java.lang.Object deleteDataInFilesystem;
        private final java.lang.String id;
        private final java.lang.Number importedFileChunkSize;
        private final imports.aws.fsx.FsxDataRepositoryAssociationS3 s3;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final imports.aws.fsx.FsxDataRepositoryAssociationTimeouts timeouts;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dataRepositoryPath = software.amazon.jsii.Kernel.get(this, "dataRepositoryPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileSystemId = software.amazon.jsii.Kernel.get(this, "fileSystemId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fileSystemPath = software.amazon.jsii.Kernel.get(this, "fileSystemPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.batchImportMetaDataOnCreate = software.amazon.jsii.Kernel.get(this, "batchImportMetaDataOnCreate", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.deleteDataInFilesystem = software.amazon.jsii.Kernel.get(this, "deleteDataInFilesystem", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.importedFileChunkSize = software.amazon.jsii.Kernel.get(this, "importedFileChunkSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxDataRepositoryAssociationS3.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.fsx.FsxDataRepositoryAssociationTimeouts.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dataRepositoryPath = java.util.Objects.requireNonNull(builder.dataRepositoryPath, "dataRepositoryPath is required");
            this.fileSystemId = java.util.Objects.requireNonNull(builder.fileSystemId, "fileSystemId is required");
            this.fileSystemPath = java.util.Objects.requireNonNull(builder.fileSystemPath, "fileSystemPath is required");
            this.batchImportMetaDataOnCreate = builder.batchImportMetaDataOnCreate;
            this.deleteDataInFilesystem = builder.deleteDataInFilesystem;
            this.id = builder.id;
            this.importedFileChunkSize = builder.importedFileChunkSize;
            this.s3 = builder.s3;
            this.tags = builder.tags;
            this.tagsAll = builder.tagsAll;
            this.timeouts = builder.timeouts;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getDataRepositoryPath() {
            return this.dataRepositoryPath;
        }

        @Override
        public final java.lang.String getFileSystemId() {
            return this.fileSystemId;
        }

        @Override
        public final java.lang.String getFileSystemPath() {
            return this.fileSystemPath;
        }

        @Override
        public final java.lang.Object getBatchImportMetaDataOnCreate() {
            return this.batchImportMetaDataOnCreate;
        }

        @Override
        public final java.lang.Object getDeleteDataInFilesystem() {
            return this.deleteDataInFilesystem;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getImportedFileChunkSize() {
            return this.importedFileChunkSize;
        }

        @Override
        public final imports.aws.fsx.FsxDataRepositoryAssociationS3 getS3() {
            return this.s3;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTags() {
            return this.tags;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
            return this.tagsAll;
        }

        @Override
        public final imports.aws.fsx.FsxDataRepositoryAssociationTimeouts getTimeouts() {
            return this.timeouts;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("dataRepositoryPath", om.valueToTree(this.getDataRepositoryPath()));
            data.set("fileSystemId", om.valueToTree(this.getFileSystemId()));
            data.set("fileSystemPath", om.valueToTree(this.getFileSystemPath()));
            if (this.getBatchImportMetaDataOnCreate() != null) {
                data.set("batchImportMetaDataOnCreate", om.valueToTree(this.getBatchImportMetaDataOnCreate()));
            }
            if (this.getDeleteDataInFilesystem() != null) {
                data.set("deleteDataInFilesystem", om.valueToTree(this.getDeleteDataInFilesystem()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getImportedFileChunkSize() != null) {
                data.set("importedFileChunkSize", om.valueToTree(this.getImportedFileChunkSize()));
            }
            if (this.getS3() != null) {
                data.set("s3", om.valueToTree(this.getS3()));
            }
            if (this.getTags() != null) {
                data.set("tags", om.valueToTree(this.getTags()));
            }
            if (this.getTagsAll() != null) {
                data.set("tagsAll", om.valueToTree(this.getTagsAll()));
            }
            if (this.getTimeouts() != null) {
                data.set("timeouts", om.valueToTree(this.getTimeouts()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.fsx.FsxDataRepositoryAssociationConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FsxDataRepositoryAssociationConfig.Jsii$Proxy that = (FsxDataRepositoryAssociationConfig.Jsii$Proxy) o;

            if (!dataRepositoryPath.equals(that.dataRepositoryPath)) return false;
            if (!fileSystemId.equals(that.fileSystemId)) return false;
            if (!fileSystemPath.equals(that.fileSystemPath)) return false;
            if (this.batchImportMetaDataOnCreate != null ? !this.batchImportMetaDataOnCreate.equals(that.batchImportMetaDataOnCreate) : that.batchImportMetaDataOnCreate != null) return false;
            if (this.deleteDataInFilesystem != null ? !this.deleteDataInFilesystem.equals(that.deleteDataInFilesystem) : that.deleteDataInFilesystem != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.importedFileChunkSize != null ? !this.importedFileChunkSize.equals(that.importedFileChunkSize) : that.importedFileChunkSize != null) return false;
            if (this.s3 != null ? !this.s3.equals(that.s3) : that.s3 != null) return false;
            if (this.tags != null ? !this.tags.equals(that.tags) : that.tags != null) return false;
            if (this.tagsAll != null ? !this.tagsAll.equals(that.tagsAll) : that.tagsAll != null) return false;
            if (this.timeouts != null ? !this.timeouts.equals(that.timeouts) : that.timeouts != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dataRepositoryPath.hashCode();
            result = 31 * result + (this.fileSystemId.hashCode());
            result = 31 * result + (this.fileSystemPath.hashCode());
            result = 31 * result + (this.batchImportMetaDataOnCreate != null ? this.batchImportMetaDataOnCreate.hashCode() : 0);
            result = 31 * result + (this.deleteDataInFilesystem != null ? this.deleteDataInFilesystem.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.importedFileChunkSize != null ? this.importedFileChunkSize.hashCode() : 0);
            result = 31 * result + (this.s3 != null ? this.s3.hashCode() : 0);
            result = 31 * result + (this.tags != null ? this.tags.hashCode() : 0);
            result = 31 * result + (this.tagsAll != null ? this.tagsAll.hashCode() : 0);
            result = 31 * result + (this.timeouts != null ? this.timeouts.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
