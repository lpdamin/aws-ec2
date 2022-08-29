package imports.aws.storagegateway;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk aws_storagegateway_local_disk}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.782Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.storagegateway.DataAwsStoragegatewayLocalDisk")
public class DataAwsStoragegatewayLocalDisk extends com.hashicorp.cdktf.TerraformDataSource {

    protected DataAwsStoragegatewayLocalDisk(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsStoragegatewayLocalDisk(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.storagegateway.DataAwsStoragegatewayLocalDisk.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk aws_storagegateway_local_disk} Data Source.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DataAwsStoragegatewayLocalDisk(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.storagegateway.DataAwsStoragegatewayLocalDiskConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetDiskNode() {
        software.amazon.jsii.Kernel.call(this, "resetDiskNode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDiskPath() {
        software.amazon.jsii.Kernel.call(this, "resetDiskPath", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getDiskId() {
        return software.amazon.jsii.Kernel.get(this, "diskId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDiskNodeInput() {
        return software.amazon.jsii.Kernel.get(this, "diskNodeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDiskPathInput() {
        return software.amazon.jsii.Kernel.get(this, "diskPathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGatewayArnInput() {
        return software.amazon.jsii.Kernel.get(this, "gatewayArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDiskNode() {
        return software.amazon.jsii.Kernel.get(this, "diskNode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDiskNode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "diskNode", java.util.Objects.requireNonNull(value, "diskNode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDiskPath() {
        return software.amazon.jsii.Kernel.get(this, "diskPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDiskPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "diskPath", java.util.Objects.requireNonNull(value, "diskPath is required"));
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

    /**
     * A fluent builder for {@link imports.aws.storagegateway.DataAwsStoragegatewayLocalDisk}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.storagegateway.DataAwsStoragegatewayLocalDisk> {
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
        private final imports.aws.storagegateway.DataAwsStoragegatewayLocalDiskConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.storagegateway.DataAwsStoragegatewayLocalDiskConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#gateway_arn DataAwsStoragegatewayLocalDisk#gateway_arn}.
         * <p>
         * @return {@code this}
         * @param gatewayArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#gateway_arn DataAwsStoragegatewayLocalDisk#gateway_arn}. This parameter is required.
         */
        public Builder gatewayArn(final java.lang.String gatewayArn) {
            this.config.gatewayArn(gatewayArn);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#disk_node DataAwsStoragegatewayLocalDisk#disk_node}.
         * <p>
         * @return {@code this}
         * @param diskNode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#disk_node DataAwsStoragegatewayLocalDisk#disk_node}. This parameter is required.
         */
        public Builder diskNode(final java.lang.String diskNode) {
            this.config.diskNode(diskNode);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#disk_path DataAwsStoragegatewayLocalDisk#disk_path}.
         * <p>
         * @return {@code this}
         * @param diskPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#disk_path DataAwsStoragegatewayLocalDisk#disk_path}. This parameter is required.
         */
        public Builder diskPath(final java.lang.String diskPath) {
            this.config.diskPath(diskPath);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#id DataAwsStoragegatewayLocalDisk#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/storagegateway_local_disk#id DataAwsStoragegatewayLocalDisk#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.storagegateway.DataAwsStoragegatewayLocalDisk}.
         */
        @Override
        public imports.aws.storagegateway.DataAwsStoragegatewayLocalDisk build() {
            return new imports.aws.storagegateway.DataAwsStoragegatewayLocalDisk(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
