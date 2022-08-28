package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.975Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrInstanceFleetInstanceTypeConfigsEbsConfig")
@software.amazon.jsii.Jsii.Proxy(EmrInstanceFleetInstanceTypeConfigsEbsConfig.Jsii$Proxy.class)
public interface EmrInstanceFleetInstanceTypeConfigsEbsConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#size EmrInstanceFleet#size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getSize();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#type EmrInstanceFleet#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#iops EmrInstanceFleet#iops}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getIops() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#volumes_per_instance EmrInstanceFleet#volumes_per_instance}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getVolumesPerInstance() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrInstanceFleetInstanceTypeConfigsEbsConfig> {
        java.lang.Number size;
        java.lang.String type;
        java.lang.Number iops;
        java.lang.Number volumesPerInstance;

        /**
         * Sets the value of {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig#getSize}
         * @param size Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#size EmrInstanceFleet#size}. This parameter is required.
         * @return {@code this}
         */
        public Builder size(java.lang.Number size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#type EmrInstanceFleet#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig#getIops}
         * @param iops Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#iops EmrInstanceFleet#iops}.
         * @return {@code this}
         */
        public Builder iops(java.lang.Number iops) {
            this.iops = iops;
            return this;
        }

        /**
         * Sets the value of {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig#getVolumesPerInstance}
         * @param volumesPerInstance Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emr_instance_fleet#volumes_per_instance EmrInstanceFleet#volumes_per_instance}.
         * @return {@code this}
         */
        public Builder volumesPerInstance(java.lang.Number volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrInstanceFleetInstanceTypeConfigsEbsConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EmrInstanceFleetInstanceTypeConfigsEbsConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrInstanceFleetInstanceTypeConfigsEbsConfig {
        private final java.lang.Number size;
        private final java.lang.String type;
        private final java.lang.Number iops;
        private final java.lang.Number volumesPerInstance;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.iops = software.amazon.jsii.Kernel.get(this, "iops", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.volumesPerInstance = software.amazon.jsii.Kernel.get(this, "volumesPerInstance", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.size = java.util.Objects.requireNonNull(builder.size, "size is required");
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.iops = builder.iops;
            this.volumesPerInstance = builder.volumesPerInstance;
        }

        @Override
        public final java.lang.Number getSize() {
            return this.size;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.Number getIops() {
            return this.iops;
        }

        @Override
        public final java.lang.Number getVolumesPerInstance() {
            return this.volumesPerInstance;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("size", om.valueToTree(this.getSize()));
            data.set("type", om.valueToTree(this.getType()));
            if (this.getIops() != null) {
                data.set("iops", om.valueToTree(this.getIops()));
            }
            if (this.getVolumesPerInstance() != null) {
                data.set("volumesPerInstance", om.valueToTree(this.getVolumesPerInstance()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.emr.EmrInstanceFleetInstanceTypeConfigsEbsConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrInstanceFleetInstanceTypeConfigsEbsConfig.Jsii$Proxy that = (EmrInstanceFleetInstanceTypeConfigsEbsConfig.Jsii$Proxy) o;

            if (!size.equals(that.size)) return false;
            if (!type.equals(that.type)) return false;
            if (this.iops != null ? !this.iops.equals(that.iops) : that.iops != null) return false;
            return this.volumesPerInstance != null ? this.volumesPerInstance.equals(that.volumesPerInstance) : that.volumesPerInstance == null;
        }

        @Override
        public final int hashCode() {
            int result = this.size.hashCode();
            result = 31 * result + (this.type.hashCode());
            result = 31 * result + (this.iops != null ? this.iops.hashCode() : 0);
            result = 31 * result + (this.volumesPerInstance != null ? this.volumesPerInstance.hashCode() : 0);
            return result;
        }
    }
}
