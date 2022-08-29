package imports.aws.ec2;

/**
 * AWS EC2.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.863Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.VolumeAttachmentConfig")
@software.amazon.jsii.Jsii.Proxy(VolumeAttachmentConfig.Jsii$Proxy.class)
public interface VolumeAttachmentConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#device_name VolumeAttachment#device_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDeviceName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#instance_id VolumeAttachment#instance_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getInstanceId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#volume_id VolumeAttachment#volume_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#force_detach VolumeAttachment#force_detach}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getForceDetach() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#id VolumeAttachment#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#skip_destroy VolumeAttachment#skip_destroy}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipDestroy() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#stop_instance_before_detaching VolumeAttachment#stop_instance_before_detaching}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getStopInstanceBeforeDetaching() {
        return null;
    }

    /**
     * timeouts block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/volume_attachment#timeouts VolumeAttachment#timeouts}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ec2.VolumeAttachmentTimeouts getTimeouts() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeAttachmentConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeAttachmentConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeAttachmentConfig> {
        java.lang.String deviceName;
        java.lang.String instanceId;
        java.lang.String volumeId;
        java.lang.Object forceDetach;
        java.lang.String id;
        java.lang.Object skipDestroy;
        java.lang.Object stopInstanceBeforeDetaching;
        imports.aws.ec2.VolumeAttachmentTimeouts timeouts;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getDeviceName}
         * @param deviceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#device_name VolumeAttachment#device_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder deviceName(java.lang.String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getInstanceId}
         * @param instanceId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#instance_id VolumeAttachment#instance_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder instanceId(java.lang.String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getVolumeId}
         * @param volumeId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#volume_id VolumeAttachment#volume_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder volumeId(java.lang.String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getForceDetach}
         * @param forceDetach Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#force_detach VolumeAttachment#force_detach}.
         * @return {@code this}
         */
        public Builder forceDetach(java.lang.Boolean forceDetach) {
            this.forceDetach = forceDetach;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getForceDetach}
         * @param forceDetach Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#force_detach VolumeAttachment#force_detach}.
         * @return {@code this}
         */
        public Builder forceDetach(com.hashicorp.cdktf.IResolvable forceDetach) {
            this.forceDetach = forceDetach;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#id VolumeAttachment#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getSkipDestroy}
         * @param skipDestroy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#skip_destroy VolumeAttachment#skip_destroy}.
         * @return {@code this}
         */
        public Builder skipDestroy(java.lang.Boolean skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getSkipDestroy}
         * @param skipDestroy Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#skip_destroy VolumeAttachment#skip_destroy}.
         * @return {@code this}
         */
        public Builder skipDestroy(com.hashicorp.cdktf.IResolvable skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getStopInstanceBeforeDetaching}
         * @param stopInstanceBeforeDetaching Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#stop_instance_before_detaching VolumeAttachment#stop_instance_before_detaching}.
         * @return {@code this}
         */
        public Builder stopInstanceBeforeDetaching(java.lang.Boolean stopInstanceBeforeDetaching) {
            this.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getStopInstanceBeforeDetaching}
         * @param stopInstanceBeforeDetaching Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/volume_attachment#stop_instance_before_detaching VolumeAttachment#stop_instance_before_detaching}.
         * @return {@code this}
         */
        public Builder stopInstanceBeforeDetaching(com.hashicorp.cdktf.IResolvable stopInstanceBeforeDetaching) {
            this.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getTimeouts}
         * @param timeouts timeouts block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/volume_attachment#timeouts VolumeAttachment#timeouts}
         * @return {@code this}
         */
        public Builder timeouts(imports.aws.ec2.VolumeAttachmentTimeouts timeouts) {
            this.timeouts = timeouts;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getDependsOn}
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
         * Sets the value of {@link VolumeAttachmentConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentConfig#getProvisioners}
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
         * @return a new instance of {@link VolumeAttachmentConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeAttachmentConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link VolumeAttachmentConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeAttachmentConfig {
        private final java.lang.String deviceName;
        private final java.lang.String instanceId;
        private final java.lang.String volumeId;
        private final java.lang.Object forceDetach;
        private final java.lang.String id;
        private final java.lang.Object skipDestroy;
        private final java.lang.Object stopInstanceBeforeDetaching;
        private final imports.aws.ec2.VolumeAttachmentTimeouts timeouts;
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
            this.deviceName = software.amazon.jsii.Kernel.get(this, "deviceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.instanceId = software.amazon.jsii.Kernel.get(this, "instanceId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.volumeId = software.amazon.jsii.Kernel.get(this, "volumeId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.forceDetach = software.amazon.jsii.Kernel.get(this, "forceDetach", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.skipDestroy = software.amazon.jsii.Kernel.get(this, "skipDestroy", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.stopInstanceBeforeDetaching = software.amazon.jsii.Kernel.get(this, "stopInstanceBeforeDetaching", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.timeouts = software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.VolumeAttachmentTimeouts.class));
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
            this.deviceName = java.util.Objects.requireNonNull(builder.deviceName, "deviceName is required");
            this.instanceId = java.util.Objects.requireNonNull(builder.instanceId, "instanceId is required");
            this.volumeId = java.util.Objects.requireNonNull(builder.volumeId, "volumeId is required");
            this.forceDetach = builder.forceDetach;
            this.id = builder.id;
            this.skipDestroy = builder.skipDestroy;
            this.stopInstanceBeforeDetaching = builder.stopInstanceBeforeDetaching;
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
        public final java.lang.String getDeviceName() {
            return this.deviceName;
        }

        @Override
        public final java.lang.String getInstanceId() {
            return this.instanceId;
        }

        @Override
        public final java.lang.String getVolumeId() {
            return this.volumeId;
        }

        @Override
        public final java.lang.Object getForceDetach() {
            return this.forceDetach;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getSkipDestroy() {
            return this.skipDestroy;
        }

        @Override
        public final java.lang.Object getStopInstanceBeforeDetaching() {
            return this.stopInstanceBeforeDetaching;
        }

        @Override
        public final imports.aws.ec2.VolumeAttachmentTimeouts getTimeouts() {
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

            data.set("deviceName", om.valueToTree(this.getDeviceName()));
            data.set("instanceId", om.valueToTree(this.getInstanceId()));
            data.set("volumeId", om.valueToTree(this.getVolumeId()));
            if (this.getForceDetach() != null) {
                data.set("forceDetach", om.valueToTree(this.getForceDetach()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getSkipDestroy() != null) {
                data.set("skipDestroy", om.valueToTree(this.getSkipDestroy()));
            }
            if (this.getStopInstanceBeforeDetaching() != null) {
                data.set("stopInstanceBeforeDetaching", om.valueToTree(this.getStopInstanceBeforeDetaching()));
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
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.VolumeAttachmentConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeAttachmentConfig.Jsii$Proxy that = (VolumeAttachmentConfig.Jsii$Proxy) o;

            if (!deviceName.equals(that.deviceName)) return false;
            if (!instanceId.equals(that.instanceId)) return false;
            if (!volumeId.equals(that.volumeId)) return false;
            if (this.forceDetach != null ? !this.forceDetach.equals(that.forceDetach) : that.forceDetach != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.skipDestroy != null ? !this.skipDestroy.equals(that.skipDestroy) : that.skipDestroy != null) return false;
            if (this.stopInstanceBeforeDetaching != null ? !this.stopInstanceBeforeDetaching.equals(that.stopInstanceBeforeDetaching) : that.stopInstanceBeforeDetaching != null) return false;
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
            int result = this.deviceName.hashCode();
            result = 31 * result + (this.instanceId.hashCode());
            result = 31 * result + (this.volumeId.hashCode());
            result = 31 * result + (this.forceDetach != null ? this.forceDetach.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.skipDestroy != null ? this.skipDestroy.hashCode() : 0);
            result = 31 * result + (this.stopInstanceBeforeDetaching != null ? this.stopInstanceBeforeDetaching.hashCode() : 0);
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
