package imports.aws.vpc;

/**
 * AWS VPC.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.973Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.vpc.NetworkmanagerVpcAttachmentConfig")
@software.amazon.jsii.Jsii.Proxy(NetworkmanagerVpcAttachmentConfig.Jsii$Proxy.class)
public interface NetworkmanagerVpcAttachmentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#core_network_id NetworkmanagerVpcAttachment#core_network_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getCoreNetworkId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#subnet_arns NetworkmanagerVpcAttachment#subnet_arns}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSubnetArns();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#vpc_arn NetworkmanagerVpcAttachment#vpc_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVpcArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#id NetworkmanagerVpcAttachment#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#options NetworkmanagerVpcAttachment#options}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.vpc.NetworkmanagerVpcAttachmentOptions getOptions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#tags NetworkmanagerVpcAttachment#tags}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTags() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#tags_all NetworkmanagerVpcAttachment#tags_all}.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#timeouts NetworkmanagerVpcAttachment#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.vpc.NetworkmanagerVpcAttachmentTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkmanagerVpcAttachmentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkmanagerVpcAttachmentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkmanagerVpcAttachmentConfig> {
        java.lang.String coreNetworkId;
        java.util.List<java.lang.String> subnetArns;
        java.lang.String vpcArn;
        java.lang.String id;
        imports.aws.vpc.NetworkmanagerVpcAttachmentOptions options;
        java.util.Map<java.lang.String, java.lang.String> tags;
        java.util.Map<java.lang.String, java.lang.String> tagsAll;
        imports.aws.vpc.NetworkmanagerVpcAttachmentTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getCoreNetworkId}
         * @param coreNetworkId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#core_network_id NetworkmanagerVpcAttachment#core_network_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder coreNetworkId(java.lang.String coreNetworkId) {
            this.coreNetworkId = coreNetworkId;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getSubnetArns}
         * @param subnetArns Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#subnet_arns NetworkmanagerVpcAttachment#subnet_arns}. This parameter is required.
         * @return {@code this}
         */
        public Builder subnetArns(java.util.List<java.lang.String> subnetArns) {
            this.subnetArns = subnetArns;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getVpcArn}
         * @param vpcArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#vpc_arn NetworkmanagerVpcAttachment#vpc_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder vpcArn(java.lang.String vpcArn) {
            this.vpcArn = vpcArn;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#id NetworkmanagerVpcAttachment#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getOptions}
         * @param options options block.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#options NetworkmanagerVpcAttachment#options}
         * @return {@code this}
         */
        public Builder options(imports.aws.vpc.NetworkmanagerVpcAttachmentOptions options) {
            this.options = options;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getTags}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#tags NetworkmanagerVpcAttachment#tags}.
         * @return {@code this}
         */
        public Builder tags(java.util.Map<java.lang.String, java.lang.String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getTagsAll}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#tags_all NetworkmanagerVpcAttachment#tags_all}.
         * @return {@code this}
         */
        public Builder tagsAll(java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkmanager_vpc_attachment#timeouts NetworkmanagerVpcAttachment#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.vpc.NetworkmanagerVpcAttachmentTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getDependsOn}
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
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link NetworkmanagerVpcAttachmentConfig#getProvisioners}
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
         * @return a new instance of {@link NetworkmanagerVpcAttachmentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkmanagerVpcAttachmentConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkmanagerVpcAttachmentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkmanagerVpcAttachmentConfig {
        private final java.lang.String coreNetworkId;
        private final java.util.List<java.lang.String> subnetArns;
        private final java.lang.String vpcArn;
        private final java.lang.String id;
        private final imports.aws.vpc.NetworkmanagerVpcAttachmentOptions options;
        private final java.util.Map<java.lang.String, java.lang.String> tags;
        private final java.util.Map<java.lang.String, java.lang.String> tagsAll;
        private final imports.aws.vpc.NetworkmanagerVpcAttachmentTimeouts timeouts;
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
            this.coreNetworkId = software.amazon.jsii.Kernel.get(this, "coreNetworkId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subnetArns = software.amazon.jsii.Kernel.get(this, "subnetArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.vpcArn = software.amazon.jsii.Kernel.get(this, "vpcArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.options = software.amazon.jsii.Kernel.get(this, "options", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.NetworkmanagerVpcAttachmentOptions.class));
            this.tags = software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagsAll = software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.vpc.NetworkmanagerVpcAttachmentTimeouts.class));
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
            this.coreNetworkId = java.util.Objects.requireNonNull(builder.coreNetworkId, "coreNetworkId is required");
            this.subnetArns = java.util.Objects.requireNonNull(builder.subnetArns, "subnetArns is required");
            this.vpcArn = java.util.Objects.requireNonNull(builder.vpcArn, "vpcArn is required");
            this.id = builder.id;
            this.options = builder.options;
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
        public final java.lang.String getCoreNetworkId() {
            return this.coreNetworkId;
        }

        @Override
        public final java.util.List<java.lang.String> getSubnetArns() {
            return this.subnetArns;
        }

        @Override
        public final java.lang.String getVpcArn() {
            return this.vpcArn;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final imports.aws.vpc.NetworkmanagerVpcAttachmentOptions getOptions() {
            return this.options;
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
        public final imports.aws.vpc.NetworkmanagerVpcAttachmentTimeouts getTimeouts() {
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

            data.set("coreNetworkId", om.valueToTree(this.getCoreNetworkId()));
            data.set("subnetArns", om.valueToTree(this.getSubnetArns()));
            data.set("vpcArn", om.valueToTree(this.getVpcArn()));
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getOptions() != null) {
                data.set("options", om.valueToTree(this.getOptions()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.vpc.NetworkmanagerVpcAttachmentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkmanagerVpcAttachmentConfig.Jsii$Proxy that = (NetworkmanagerVpcAttachmentConfig.Jsii$Proxy) o;

            if (!coreNetworkId.equals(that.coreNetworkId)) return false;
            if (!subnetArns.equals(that.subnetArns)) return false;
            if (!vpcArn.equals(that.vpcArn)) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.options != null ? !this.options.equals(that.options) : that.options != null) return false;
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
            int result = this.coreNetworkId.hashCode();
            result = 31 * result + (this.subnetArns.hashCode());
            result = 31 * result + (this.vpcArn.hashCode());
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.options != null ? this.options.hashCode() : 0);
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
