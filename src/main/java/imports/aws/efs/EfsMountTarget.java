package imports.aws.efs;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target aws_efs_mount_target}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.932Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.efs.EfsMountTarget")
public class EfsMountTarget extends com.hashicorp.cdktf.TerraformResource {

    protected EfsMountTarget(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EfsMountTarget(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.efs.EfsMountTarget.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target aws_efs_mount_target} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public EfsMountTarget(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.efs.EfsMountTargetConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIpAddress() {
        software.amazon.jsii.Kernel.call(this, "resetIpAddress", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSecurityGroups() {
        software.amazon.jsii.Kernel.call(this, "resetSecurityGroups", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZoneId() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAvailabilityZoneName() {
        return software.amazon.jsii.Kernel.get(this, "availabilityZoneName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDnsName() {
        return software.amazon.jsii.Kernel.get(this, "dnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileSystemArn() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getMountTargetDnsName() {
        return software.amazon.jsii.Kernel.get(this, "mountTargetDnsName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkInterfaceId() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "ownerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFileSystemIdInput() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpAddressInput() {
        return software.amazon.jsii.Kernel.get(this, "ipAddressInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSecurityGroupsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "securityGroupsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getSubnetIdInput() {
        return software.amazon.jsii.Kernel.get(this, "subnetIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFileSystemId() {
        return software.amazon.jsii.Kernel.get(this, "fileSystemId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFileSystemId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "fileSystemId", java.util.Objects.requireNonNull(value, "fileSystemId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "ipAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpAddress(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipAddress", java.util.Objects.requireNonNull(value, "ipAddress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSecurityGroups() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "securityGroups", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setSecurityGroups(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "securityGroups", java.util.Objects.requireNonNull(value, "securityGroups is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getSubnetId() {
        return software.amazon.jsii.Kernel.get(this, "subnetId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setSubnetId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "subnetId", java.util.Objects.requireNonNull(value, "subnetId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.efs.EfsMountTarget}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.efs.EfsMountTarget> {
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
        private final imports.aws.efs.EfsMountTargetConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.efs.EfsMountTargetConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#file_system_id EfsMountTarget#file_system_id}.
         * <p>
         * @return {@code this}
         * @param fileSystemId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#file_system_id EfsMountTarget#file_system_id}. This parameter is required.
         */
        public Builder fileSystemId(final java.lang.String fileSystemId) {
            this.config.fileSystemId(fileSystemId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#subnet_id EfsMountTarget#subnet_id}.
         * <p>
         * @return {@code this}
         * @param subnetId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#subnet_id EfsMountTarget#subnet_id}. This parameter is required.
         */
        public Builder subnetId(final java.lang.String subnetId) {
            this.config.subnetId(subnetId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#id EfsMountTarget#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#id EfsMountTarget#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#ip_address EfsMountTarget#ip_address}.
         * <p>
         * @return {@code this}
         * @param ipAddress Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#ip_address EfsMountTarget#ip_address}. This parameter is required.
         */
        public Builder ipAddress(final java.lang.String ipAddress) {
            this.config.ipAddress(ipAddress);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#security_groups EfsMountTarget#security_groups}.
         * <p>
         * @return {@code this}
         * @param securityGroups Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/efs_mount_target#security_groups EfsMountTarget#security_groups}. This parameter is required.
         */
        public Builder securityGroups(final java.util.List<java.lang.String> securityGroups) {
            this.config.securityGroups(securityGroups);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.efs.EfsMountTarget}.
         */
        @Override
        public imports.aws.efs.EfsMountTarget build() {
            return new imports.aws.efs.EfsMountTarget(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
