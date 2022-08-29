package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association aws_networkmanager_link_association}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.954Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.NetworkmanagerLinkAssociation")
public class NetworkmanagerLinkAssociation extends com.hashicorp.cdktf.TerraformResource {

    protected NetworkmanagerLinkAssociation(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkmanagerLinkAssociation(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.NetworkmanagerLinkAssociation.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association aws_networkmanager_link_association} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public NetworkmanagerLinkAssociation(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.vpc.NetworkmanagerLinkAssociationConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.vpc.NetworkmanagerLinkAssociationTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.NetworkmanagerLinkAssociationTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.NetworkmanagerLinkAssociationTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDeviceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "deviceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getGlobalNetworkIdInput() {
        return software.amazon.jsii.Kernel.get(this, "globalNetworkIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLinkIdInput() {
        return software.amazon.jsii.Kernel.get(this, "linkIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDeviceId() {
        return software.amazon.jsii.Kernel.get(this, "deviceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDeviceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "deviceId", java.util.Objects.requireNonNull(value, "deviceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGlobalNetworkId() {
        return software.amazon.jsii.Kernel.get(this, "globalNetworkId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGlobalNetworkId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "globalNetworkId", java.util.Objects.requireNonNull(value, "globalNetworkId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLinkId() {
        return software.amazon.jsii.Kernel.get(this, "linkId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLinkId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "linkId", java.util.Objects.requireNonNull(value, "linkId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.NetworkmanagerLinkAssociation}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.NetworkmanagerLinkAssociation> {
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
        private final imports.aws.vpc.NetworkmanagerLinkAssociationConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.vpc.NetworkmanagerLinkAssociationConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#device_id NetworkmanagerLinkAssociation#device_id}.
         * <p>
         * @return {@code this}
         * @param deviceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#device_id NetworkmanagerLinkAssociation#device_id}. This parameter is required.
         */
        public Builder deviceId(final java.lang.String deviceId) {
            this.config.deviceId(deviceId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#global_network_id NetworkmanagerLinkAssociation#global_network_id}.
         * <p>
         * @return {@code this}
         * @param globalNetworkId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#global_network_id NetworkmanagerLinkAssociation#global_network_id}. This parameter is required.
         */
        public Builder globalNetworkId(final java.lang.String globalNetworkId) {
            this.config.globalNetworkId(globalNetworkId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#link_id NetworkmanagerLinkAssociation#link_id}.
         * <p>
         * @return {@code this}
         * @param linkId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#link_id NetworkmanagerLinkAssociation#link_id}. This parameter is required.
         */
        public Builder linkId(final java.lang.String linkId) {
            this.config.linkId(linkId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#id NetworkmanagerLinkAssociation#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#id NetworkmanagerLinkAssociation#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkmanager_link_association#timeouts NetworkmanagerLinkAssociation#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.vpc.NetworkmanagerLinkAssociationTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.NetworkmanagerLinkAssociation}.
         */
        @Override
        public imports.aws.vpc.NetworkmanagerLinkAssociation build() {
            return new imports.aws.vpc.NetworkmanagerLinkAssociation(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
