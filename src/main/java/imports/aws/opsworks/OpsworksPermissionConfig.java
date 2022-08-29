package imports.aws.opsworks;

/**
 * AWS OpsWorks.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.111Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.opsworks.OpsworksPermissionConfig")
@software.amazon.jsii.Jsii.Proxy(OpsworksPermissionConfig.Jsii$Proxy.class)
public interface OpsworksPermissionConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#user_arn OpsworksPermission#user_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUserArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#allow_ssh OpsworksPermission#allow_ssh}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowSsh() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#allow_sudo OpsworksPermission#allow_sudo}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowSudo() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#id OpsworksPermission#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#level OpsworksPermission#level}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLevel() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#stack_id OpsworksPermission#stack_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStackId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link OpsworksPermissionConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpsworksPermissionConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpsworksPermissionConfig> {
        java.lang.String userArn;
        java.lang.Object allowSsh;
        java.lang.Object allowSudo;
        java.lang.String id;
        java.lang.String level;
        java.lang.String stackId;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getUserArn}
         * @param userArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#user_arn OpsworksPermission#user_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder userArn(java.lang.String userArn) {
            this.userArn = userArn;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getAllowSsh}
         * @param allowSsh Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#allow_ssh OpsworksPermission#allow_ssh}.
         * @return {@code this}
         */
        public Builder allowSsh(java.lang.Boolean allowSsh) {
            this.allowSsh = allowSsh;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getAllowSsh}
         * @param allowSsh Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#allow_ssh OpsworksPermission#allow_ssh}.
         * @return {@code this}
         */
        public Builder allowSsh(com.hashicorp.cdktf.IResolvable allowSsh) {
            this.allowSsh = allowSsh;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getAllowSudo}
         * @param allowSudo Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#allow_sudo OpsworksPermission#allow_sudo}.
         * @return {@code this}
         */
        public Builder allowSudo(java.lang.Boolean allowSudo) {
            this.allowSudo = allowSudo;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getAllowSudo}
         * @param allowSudo Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#allow_sudo OpsworksPermission#allow_sudo}.
         * @return {@code this}
         */
        public Builder allowSudo(com.hashicorp.cdktf.IResolvable allowSudo) {
            this.allowSudo = allowSudo;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#id OpsworksPermission#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getLevel}
         * @param level Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#level OpsworksPermission#level}.
         * @return {@code this}
         */
        public Builder level(java.lang.String level) {
            this.level = level;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getStackId}
         * @param stackId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opsworks_permission#stack_id OpsworksPermission#stack_id}.
         * @return {@code this}
         */
        public Builder stackId(java.lang.String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getDependsOn}
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
         * Sets the value of {@link OpsworksPermissionConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link OpsworksPermissionConfig#getProvisioners}
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
         * @return a new instance of {@link OpsworksPermissionConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpsworksPermissionConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link OpsworksPermissionConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpsworksPermissionConfig {
        private final java.lang.String userArn;
        private final java.lang.Object allowSsh;
        private final java.lang.Object allowSudo;
        private final java.lang.String id;
        private final java.lang.String level;
        private final java.lang.String stackId;
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
            this.userArn = software.amazon.jsii.Kernel.get(this, "userArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowSsh = software.amazon.jsii.Kernel.get(this, "allowSsh", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.allowSudo = software.amazon.jsii.Kernel.get(this, "allowSudo", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.level = software.amazon.jsii.Kernel.get(this, "level", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.stackId = software.amazon.jsii.Kernel.get(this, "stackId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
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
            this.userArn = java.util.Objects.requireNonNull(builder.userArn, "userArn is required");
            this.allowSsh = builder.allowSsh;
            this.allowSudo = builder.allowSudo;
            this.id = builder.id;
            this.level = builder.level;
            this.stackId = builder.stackId;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getUserArn() {
            return this.userArn;
        }

        @Override
        public final java.lang.Object getAllowSsh() {
            return this.allowSsh;
        }

        @Override
        public final java.lang.Object getAllowSudo() {
            return this.allowSudo;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.String getLevel() {
            return this.level;
        }

        @Override
        public final java.lang.String getStackId() {
            return this.stackId;
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

            data.set("userArn", om.valueToTree(this.getUserArn()));
            if (this.getAllowSsh() != null) {
                data.set("allowSsh", om.valueToTree(this.getAllowSsh()));
            }
            if (this.getAllowSudo() != null) {
                data.set("allowSudo", om.valueToTree(this.getAllowSudo()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getLevel() != null) {
                data.set("level", om.valueToTree(this.getLevel()));
            }
            if (this.getStackId() != null) {
                data.set("stackId", om.valueToTree(this.getStackId()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.opsworks.OpsworksPermissionConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpsworksPermissionConfig.Jsii$Proxy that = (OpsworksPermissionConfig.Jsii$Proxy) o;

            if (!userArn.equals(that.userArn)) return false;
            if (this.allowSsh != null ? !this.allowSsh.equals(that.allowSsh) : that.allowSsh != null) return false;
            if (this.allowSudo != null ? !this.allowSudo.equals(that.allowSudo) : that.allowSudo != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.level != null ? !this.level.equals(that.level) : that.level != null) return false;
            if (this.stackId != null ? !this.stackId.equals(that.stackId) : that.stackId != null) return false;
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
            int result = this.userArn.hashCode();
            result = 31 * result + (this.allowSsh != null ? this.allowSsh.hashCode() : 0);
            result = 31 * result + (this.allowSudo != null ? this.allowSudo.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.level != null ? this.level.hashCode() : 0);
            result = 31 * result + (this.stackId != null ? this.stackId.hashCode() : 0);
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
