package imports.aws.storagegateway;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume aws_storagegateway_stored_iscsi_volume}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.811Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.StoragegatewayStoredIscsiVolume")
public class StoragegatewayStoredIscsiVolume extends com.hashicorp.cdktf.TerraformResource {

    protected StoragegatewayStoredIscsiVolume(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected StoragegatewayStoredIscsiVolume(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.storagegateway.StoragegatewayStoredIscsiVolume.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume aws_storagegateway_stored_iscsi_volume} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public StoragegatewayStoredIscsiVolume(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.storagegateway.StoragegatewayStoredIscsiVolumeConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsEncrypted() {
        software.amazon.jsii.Kernel.call(this, "resetKmsEncrypted", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKmsKey() {
        software.amazon.jsii.Kernel.call(this, "resetKmsKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnapshotId() {
        software.amazon.jsii.Kernel.call(this, "resetSnapshotId", software.amazon.jsii.NativeType.VOID);
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

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable getChapEnabled() {
        return software.amazon.jsii.Kernel.get(this, "chapEnabled", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.IResolvable.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getLunNumber() {
        return software.amazon.jsii.Kernel.get(this, "lunNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getNetworkInterfacePort() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfacePort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetArn() {
        return software.amazon.jsii.Kernel.get(this, "targetArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeAttachmentStatus() {
        return software.amazon.jsii.Kernel.get(this, "volumeAttachmentStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeId() {
        return software.amazon.jsii.Kernel.get(this, "volumeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getVolumeSizeInBytes() {
        return software.amazon.jsii.Kernel.get(this, "volumeSizeInBytes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeStatus() {
        return software.amazon.jsii.Kernel.get(this, "volumeStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getVolumeType() {
        return software.amazon.jsii.Kernel.get(this, "volumeType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDiskIdInput() {
        return software.amazon.jsii.Kernel.get(this, "diskIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGatewayArnInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getKmsEncryptedInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsEncryptedInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getKmsKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "kmsKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNetworkInterfaceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfaceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getPreserveExistingDataInput() {
        return software.amazon.jsii.Kernel.get(this, "preserveExistingDataInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSnapshotIdInput() {
        return software.amazon.jsii.Kernel.get(this, "snapshotIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTargetNameInput() {
        return software.amazon.jsii.Kernel.get(this, "targetNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDiskId() {
        return software.amazon.jsii.Kernel.get(this, "diskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDiskId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "diskId", java.util.Objects.requireNonNull(value, "diskId is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.Object getKmsEncrypted() {
        return software.amazon.jsii.Kernel.get(this, "kmsEncrypted", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setKmsEncrypted(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "kmsEncrypted", java.util.Objects.requireNonNull(value, "kmsEncrypted is required"));
    }

    public void setKmsEncrypted(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "kmsEncrypted", java.util.Objects.requireNonNull(value, "kmsEncrypted is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getKmsKey() {
        return software.amazon.jsii.Kernel.get(this, "kmsKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setKmsKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "kmsKey", java.util.Objects.requireNonNull(value, "kmsKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkInterfaceId() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNetworkInterfaceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "networkInterfaceId", java.util.Objects.requireNonNull(value, "networkInterfaceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getPreserveExistingData() {
        return software.amazon.jsii.Kernel.get(this, "preserveExistingData", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setPreserveExistingData(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "preserveExistingData", java.util.Objects.requireNonNull(value, "preserveExistingData is required"));
    }

    public void setPreserveExistingData(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "preserveExistingData", java.util.Objects.requireNonNull(value, "preserveExistingData is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSnapshotId() {
        return software.amazon.jsii.Kernel.get(this, "snapshotId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSnapshotId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "snapshotId", java.util.Objects.requireNonNull(value, "snapshotId is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getTargetName() {
        return software.amazon.jsii.Kernel.get(this, "targetName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTargetName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "targetName", java.util.Objects.requireNonNull(value, "targetName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.storagegateway.StoragegatewayStoredIscsiVolume}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.storagegateway.StoragegatewayStoredIscsiVolume> {
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
        private final imports.aws.storagegateway.StoragegatewayStoredIscsiVolumeConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.storagegateway.StoragegatewayStoredIscsiVolumeConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#disk_id StoragegatewayStoredIscsiVolume#disk_id}.
         * <p>
         * @return {@code this}
         * @param diskId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#disk_id StoragegatewayStoredIscsiVolume#disk_id}. This parameter is required.
         */
        public Builder diskId(final java.lang.String diskId) {
            this.config.diskId(diskId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#gateway_arn StoragegatewayStoredIscsiVolume#gateway_arn}.
         * <p>
         * @return {@code this}
         * @param gatewayArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#gateway_arn StoragegatewayStoredIscsiVolume#gateway_arn}. This parameter is required.
         */
        public Builder gatewayArn(final java.lang.String gatewayArn) {
            this.config.gatewayArn(gatewayArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#network_interface_id StoragegatewayStoredIscsiVolume#network_interface_id}.
         * <p>
         * @return {@code this}
         * @param networkInterfaceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#network_interface_id StoragegatewayStoredIscsiVolume#network_interface_id}. This parameter is required.
         */
        public Builder networkInterfaceId(final java.lang.String networkInterfaceId) {
            this.config.networkInterfaceId(networkInterfaceId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#preserve_existing_data StoragegatewayStoredIscsiVolume#preserve_existing_data}.
         * <p>
         * @return {@code this}
         * @param preserveExistingData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#preserve_existing_data StoragegatewayStoredIscsiVolume#preserve_existing_data}. This parameter is required.
         */
        public Builder preserveExistingData(final java.lang.Boolean preserveExistingData) {
            this.config.preserveExistingData(preserveExistingData);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#preserve_existing_data StoragegatewayStoredIscsiVolume#preserve_existing_data}.
         * <p>
         * @return {@code this}
         * @param preserveExistingData Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#preserve_existing_data StoragegatewayStoredIscsiVolume#preserve_existing_data}. This parameter is required.
         */
        public Builder preserveExistingData(final com.hashicorp.cdktf.IResolvable preserveExistingData) {
            this.config.preserveExistingData(preserveExistingData);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#target_name StoragegatewayStoredIscsiVolume#target_name}.
         * <p>
         * @return {@code this}
         * @param targetName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#target_name StoragegatewayStoredIscsiVolume#target_name}. This parameter is required.
         */
        public Builder targetName(final java.lang.String targetName) {
            this.config.targetName(targetName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#id StoragegatewayStoredIscsiVolume#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#id StoragegatewayStoredIscsiVolume#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#kms_encrypted StoragegatewayStoredIscsiVolume#kms_encrypted}.
         * <p>
         * @return {@code this}
         * @param kmsEncrypted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#kms_encrypted StoragegatewayStoredIscsiVolume#kms_encrypted}. This parameter is required.
         */
        public Builder kmsEncrypted(final java.lang.Boolean kmsEncrypted) {
            this.config.kmsEncrypted(kmsEncrypted);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#kms_encrypted StoragegatewayStoredIscsiVolume#kms_encrypted}.
         * <p>
         * @return {@code this}
         * @param kmsEncrypted Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#kms_encrypted StoragegatewayStoredIscsiVolume#kms_encrypted}. This parameter is required.
         */
        public Builder kmsEncrypted(final com.hashicorp.cdktf.IResolvable kmsEncrypted) {
            this.config.kmsEncrypted(kmsEncrypted);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#kms_key StoragegatewayStoredIscsiVolume#kms_key}.
         * <p>
         * @return {@code this}
         * @param kmsKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#kms_key StoragegatewayStoredIscsiVolume#kms_key}. This parameter is required.
         */
        public Builder kmsKey(final java.lang.String kmsKey) {
            this.config.kmsKey(kmsKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#snapshot_id StoragegatewayStoredIscsiVolume#snapshot_id}.
         * <p>
         * @return {@code this}
         * @param snapshotId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#snapshot_id StoragegatewayStoredIscsiVolume#snapshot_id}. This parameter is required.
         */
        public Builder snapshotId(final java.lang.String snapshotId) {
            this.config.snapshotId(snapshotId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#tags StoragegatewayStoredIscsiVolume#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#tags StoragegatewayStoredIscsiVolume#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#tags_all StoragegatewayStoredIscsiVolume#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/storagegateway_stored_iscsi_volume#tags_all StoragegatewayStoredIscsiVolume#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.storagegateway.StoragegatewayStoredIscsiVolume}.
         */
        @Override
        public imports.aws.storagegateway.StoragegatewayStoredIscsiVolume build() {
            return new imports.aws.storagegateway.StoragegatewayStoredIscsiVolume(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
