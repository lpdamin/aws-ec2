package imports.aws.ec2;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source aws_ec2_transit_gateway_multicast_group_source}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.785Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2TransitGatewayMulticastGroupSource")
public class Ec2TransitGatewayMulticastGroupSource extends com.hashicorp.cdktf.TerraformResource {

    protected Ec2TransitGatewayMulticastGroupSource(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2TransitGatewayMulticastGroupSource(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ec2.Ec2TransitGatewayMulticastGroupSource.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source aws_ec2_transit_gateway_multicast_group_source} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Ec2TransitGatewayMulticastGroupSource(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2TransitGatewayMulticastGroupSourceConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getGroupIpAddressInput() {
        return software.amazon.jsii.Kernel.get(this, "groupIpAddressInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNetworkInterfaceIdInput() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfaceIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTransitGatewayMulticastDomainIdInput() {
        return software.amazon.jsii.Kernel.get(this, "transitGatewayMulticastDomainIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getGroupIpAddress() {
        return software.amazon.jsii.Kernel.get(this, "groupIpAddress", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setGroupIpAddress(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "groupIpAddress", java.util.Objects.requireNonNull(value, "groupIpAddress is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNetworkInterfaceId() {
        return software.amazon.jsii.Kernel.get(this, "networkInterfaceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNetworkInterfaceId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "networkInterfaceId", java.util.Objects.requireNonNull(value, "networkInterfaceId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransitGatewayMulticastDomainId() {
        return software.amazon.jsii.Kernel.get(this, "transitGatewayMulticastDomainId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTransitGatewayMulticastDomainId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "transitGatewayMulticastDomainId", java.util.Objects.requireNonNull(value, "transitGatewayMulticastDomainId is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ec2.Ec2TransitGatewayMulticastGroupSource}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ec2.Ec2TransitGatewayMulticastGroupSource> {
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
        private final imports.aws.ec2.Ec2TransitGatewayMulticastGroupSourceConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ec2.Ec2TransitGatewayMulticastGroupSourceConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#group_ip_address Ec2TransitGatewayMulticastGroupSource#group_ip_address}.
         * <p>
         * @return {@code this}
         * @param groupIpAddress Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#group_ip_address Ec2TransitGatewayMulticastGroupSource#group_ip_address}. This parameter is required.
         */
        public Builder groupIpAddress(final java.lang.String groupIpAddress) {
            this.config.groupIpAddress(groupIpAddress);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#network_interface_id Ec2TransitGatewayMulticastGroupSource#network_interface_id}.
         * <p>
         * @return {@code this}
         * @param networkInterfaceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#network_interface_id Ec2TransitGatewayMulticastGroupSource#network_interface_id}. This parameter is required.
         */
        public Builder networkInterfaceId(final java.lang.String networkInterfaceId) {
            this.config.networkInterfaceId(networkInterfaceId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#transit_gateway_multicast_domain_id Ec2TransitGatewayMulticastGroupSource#transit_gateway_multicast_domain_id}.
         * <p>
         * @return {@code this}
         * @param transitGatewayMulticastDomainId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#transit_gateway_multicast_domain_id Ec2TransitGatewayMulticastGroupSource#transit_gateway_multicast_domain_id}. This parameter is required.
         */
        public Builder transitGatewayMulticastDomainId(final java.lang.String transitGatewayMulticastDomainId) {
            this.config.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#id Ec2TransitGatewayMulticastGroupSource#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_transit_gateway_multicast_group_source#id Ec2TransitGatewayMulticastGroupSource#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ec2.Ec2TransitGatewayMulticastGroupSource}.
         */
        @Override
        public imports.aws.ec2.Ec2TransitGatewayMulticastGroupSource build() {
            return new imports.aws.ec2.Ec2TransitGatewayMulticastGroupSource(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
