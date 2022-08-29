package imports.aws.vpc;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection aws_vpc_peering_connection}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:51.026Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.VpcPeeringConnection")
public class VpcPeeringConnection extends com.hashicorp.cdktf.TerraformResource {

    protected VpcPeeringConnection(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected VpcPeeringConnection(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.vpc.VpcPeeringConnection.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection aws_vpc_peering_connection} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public VpcPeeringConnection(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAccepter(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionAccepter value) {
        software.amazon.jsii.Kernel.call(this, "putAccepter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRequester(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionRequester value) {
        software.amazon.jsii.Kernel.call(this, "putRequester", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAccepter() {
        software.amazon.jsii.Kernel.call(this, "resetAccepter", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAutoAccept() {
        software.amazon.jsii.Kernel.call(this, "resetAutoAccept", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerOwnerId() {
        software.amazon.jsii.Kernel.call(this, "resetPeerOwnerId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPeerRegion() {
        software.amazon.jsii.Kernel.call(this, "resetPeerRegion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRequester() {
        software.amazon.jsii.Kernel.call(this, "resetRequester", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionAccepterOutputReference getAccepter() {
        return software.amazon.jsii.Kernel.get(this, "accepter", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionAccepterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAcceptStatus() {
        return software.amazon.jsii.Kernel.get(this, "acceptStatus", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionRequesterOutputReference getRequester() {
        return software.amazon.jsii.Kernel.get(this, "requester", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionRequesterOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.vpc.VpcPeeringConnectionTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcPeeringConnectionAccepter getAccepterInput() {
        return software.amazon.jsii.Kernel.get(this, "accepterInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionAccepter.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAutoAcceptInput() {
        return software.amazon.jsii.Kernel.get(this, "autoAcceptInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerOwnerIdInput() {
        return software.amazon.jsii.Kernel.get(this, "peerOwnerIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerRegionInput() {
        return software.amazon.jsii.Kernel.get(this, "peerRegionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPeerVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "peerVpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.vpc.VpcPeeringConnectionRequester getRequesterInput() {
        return software.amazon.jsii.Kernel.get(this, "requesterInput", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.VpcPeeringConnectionRequester.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getVpcIdInput() {
        return software.amazon.jsii.Kernel.get(this, "vpcIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getAutoAccept() {
        return software.amazon.jsii.Kernel.get(this, "autoAccept", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setAutoAccept(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "autoAccept", java.util.Objects.requireNonNull(value, "autoAccept is required"));
    }

    public void setAutoAccept(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "autoAccept", java.util.Objects.requireNonNull(value, "autoAccept is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerOwnerId() {
        return software.amazon.jsii.Kernel.get(this, "peerOwnerId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerOwnerId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerOwnerId", java.util.Objects.requireNonNull(value, "peerOwnerId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerRegion() {
        return software.amazon.jsii.Kernel.get(this, "peerRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerRegion(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerRegion", java.util.Objects.requireNonNull(value, "peerRegion is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPeerVpcId() {
        return software.amazon.jsii.Kernel.get(this, "peerVpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPeerVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "peerVpcId", java.util.Objects.requireNonNull(value, "peerVpcId is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getVpcId() {
        return software.amazon.jsii.Kernel.get(this, "vpcId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setVpcId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "vpcId", java.util.Objects.requireNonNull(value, "vpcId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.vpc.VpcPeeringConnection}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.vpc.VpcPeeringConnection> {
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
        private final imports.aws.vpc.VpcPeeringConnectionConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.vpc.VpcPeeringConnectionConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#peer_vpc_id VpcPeeringConnection#peer_vpc_id}.
         * <p>
         * @return {@code this}
         * @param peerVpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#peer_vpc_id VpcPeeringConnection#peer_vpc_id}. This parameter is required.
         */
        public Builder peerVpcId(final java.lang.String peerVpcId) {
            this.config.peerVpcId(peerVpcId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#vpc_id VpcPeeringConnection#vpc_id}.
         * <p>
         * @return {@code this}
         * @param vpcId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#vpc_id VpcPeeringConnection#vpc_id}. This parameter is required.
         */
        public Builder vpcId(final java.lang.String vpcId) {
            this.config.vpcId(vpcId);
            return this;
        }

        /**
         * accepter block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#accepter VpcPeeringConnection#accepter}
         * <p>
         * @return {@code this}
         * @param accepter accepter block. This parameter is required.
         */
        public Builder accepter(final imports.aws.vpc.VpcPeeringConnectionAccepter accepter) {
            this.config.accepter(accepter);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#auto_accept VpcPeeringConnection#auto_accept}.
         * <p>
         * @return {@code this}
         * @param autoAccept Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#auto_accept VpcPeeringConnection#auto_accept}. This parameter is required.
         */
        public Builder autoAccept(final java.lang.Boolean autoAccept) {
            this.config.autoAccept(autoAccept);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#auto_accept VpcPeeringConnection#auto_accept}.
         * <p>
         * @return {@code this}
         * @param autoAccept Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#auto_accept VpcPeeringConnection#auto_accept}. This parameter is required.
         */
        public Builder autoAccept(final com.hashicorp.cdktf.IResolvable autoAccept) {
            this.config.autoAccept(autoAccept);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#id VpcPeeringConnection#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#id VpcPeeringConnection#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#peer_owner_id VpcPeeringConnection#peer_owner_id}.
         * <p>
         * @return {@code this}
         * @param peerOwnerId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#peer_owner_id VpcPeeringConnection#peer_owner_id}. This parameter is required.
         */
        public Builder peerOwnerId(final java.lang.String peerOwnerId) {
            this.config.peerOwnerId(peerOwnerId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#peer_region VpcPeeringConnection#peer_region}.
         * <p>
         * @return {@code this}
         * @param peerRegion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#peer_region VpcPeeringConnection#peer_region}. This parameter is required.
         */
        public Builder peerRegion(final java.lang.String peerRegion) {
            this.config.peerRegion(peerRegion);
            return this;
        }

        /**
         * requester block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#requester VpcPeeringConnection#requester}
         * <p>
         * @return {@code this}
         * @param requester requester block. This parameter is required.
         */
        public Builder requester(final imports.aws.vpc.VpcPeeringConnectionRequester requester) {
            this.config.requester(requester);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#tags VpcPeeringConnection#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#tags VpcPeeringConnection#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#tags_all VpcPeeringConnection#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#tags_all VpcPeeringConnection#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/vpc_peering_connection#timeouts VpcPeeringConnection#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.vpc.VpcPeeringConnectionTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.vpc.VpcPeeringConnection}.
         */
        @Override
        public imports.aws.vpc.VpcPeeringConnection build() {
            return new imports.aws.vpc.VpcPeeringConnection(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
