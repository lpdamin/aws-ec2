package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:58.973Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2FleetTargetCapacitySpecification")
@software.amazon.jsii.Jsii.Proxy(Ec2FleetTargetCapacitySpecification.Jsii$Proxy.class)
public interface Ec2FleetTargetCapacitySpecification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#default_target_capacity_type Ec2Fleet#default_target_capacity_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDefaultTargetCapacityType();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#total_target_capacity Ec2Fleet#total_target_capacity}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getTotalTargetCapacity();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#on_demand_target_capacity Ec2Fleet#on_demand_target_capacity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getOnDemandTargetCapacity() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#spot_target_capacity Ec2Fleet#spot_target_capacity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSpotTargetCapacity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Ec2FleetTargetCapacitySpecification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Ec2FleetTargetCapacitySpecification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Ec2FleetTargetCapacitySpecification> {
        java.lang.String defaultTargetCapacityType;
        java.lang.Number totalTargetCapacity;
        java.lang.Number onDemandTargetCapacity;
        java.lang.Number spotTargetCapacity;

        /**
         * Sets the value of {@link Ec2FleetTargetCapacitySpecification#getDefaultTargetCapacityType}
         * @param defaultTargetCapacityType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#default_target_capacity_type Ec2Fleet#default_target_capacity_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder defaultTargetCapacityType(java.lang.String defaultTargetCapacityType) {
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetTargetCapacitySpecification#getTotalTargetCapacity}
         * @param totalTargetCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#total_target_capacity Ec2Fleet#total_target_capacity}. This parameter is required.
         * @return {@code this}
         */
        public Builder totalTargetCapacity(java.lang.Number totalTargetCapacity) {
            this.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetTargetCapacitySpecification#getOnDemandTargetCapacity}
         * @param onDemandTargetCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#on_demand_target_capacity Ec2Fleet#on_demand_target_capacity}.
         * @return {@code this}
         */
        public Builder onDemandTargetCapacity(java.lang.Number onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        /**
         * Sets the value of {@link Ec2FleetTargetCapacitySpecification#getSpotTargetCapacity}
         * @param spotTargetCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ec2_fleet#spot_target_capacity Ec2Fleet#spot_target_capacity}.
         * @return {@code this}
         */
        public Builder spotTargetCapacity(java.lang.Number spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Ec2FleetTargetCapacitySpecification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Ec2FleetTargetCapacitySpecification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link Ec2FleetTargetCapacitySpecification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Ec2FleetTargetCapacitySpecification {
        private final java.lang.String defaultTargetCapacityType;
        private final java.lang.Number totalTargetCapacity;
        private final java.lang.Number onDemandTargetCapacity;
        private final java.lang.Number spotTargetCapacity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultTargetCapacityType = software.amazon.jsii.Kernel.get(this, "defaultTargetCapacityType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.totalTargetCapacity = software.amazon.jsii.Kernel.get(this, "totalTargetCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.onDemandTargetCapacity = software.amazon.jsii.Kernel.get(this, "onDemandTargetCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.spotTargetCapacity = software.amazon.jsii.Kernel.get(this, "spotTargetCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultTargetCapacityType = java.util.Objects.requireNonNull(builder.defaultTargetCapacityType, "defaultTargetCapacityType is required");
            this.totalTargetCapacity = java.util.Objects.requireNonNull(builder.totalTargetCapacity, "totalTargetCapacity is required");
            this.onDemandTargetCapacity = builder.onDemandTargetCapacity;
            this.spotTargetCapacity = builder.spotTargetCapacity;
        }

        @Override
        public final java.lang.String getDefaultTargetCapacityType() {
            return this.defaultTargetCapacityType;
        }

        @Override
        public final java.lang.Number getTotalTargetCapacity() {
            return this.totalTargetCapacity;
        }

        @Override
        public final java.lang.Number getOnDemandTargetCapacity() {
            return this.onDemandTargetCapacity;
        }

        @Override
        public final java.lang.Number getSpotTargetCapacity() {
            return this.spotTargetCapacity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("defaultTargetCapacityType", om.valueToTree(this.getDefaultTargetCapacityType()));
            data.set("totalTargetCapacity", om.valueToTree(this.getTotalTargetCapacity()));
            if (this.getOnDemandTargetCapacity() != null) {
                data.set("onDemandTargetCapacity", om.valueToTree(this.getOnDemandTargetCapacity()));
            }
            if (this.getSpotTargetCapacity() != null) {
                data.set("spotTargetCapacity", om.valueToTree(this.getSpotTargetCapacity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.Ec2FleetTargetCapacitySpecification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ec2FleetTargetCapacitySpecification.Jsii$Proxy that = (Ec2FleetTargetCapacitySpecification.Jsii$Proxy) o;

            if (!defaultTargetCapacityType.equals(that.defaultTargetCapacityType)) return false;
            if (!totalTargetCapacity.equals(that.totalTargetCapacity)) return false;
            if (this.onDemandTargetCapacity != null ? !this.onDemandTargetCapacity.equals(that.onDemandTargetCapacity) : that.onDemandTargetCapacity != null) return false;
            return this.spotTargetCapacity != null ? this.spotTargetCapacity.equals(that.spotTargetCapacity) : that.spotTargetCapacity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultTargetCapacityType.hashCode();
            result = 31 * result + (this.totalTargetCapacity.hashCode());
            result = 31 * result + (this.onDemandTargetCapacity != null ? this.onDemandTargetCapacity.hashCode() : 0);
            result = 31 * result + (this.spotTargetCapacity != null ? this.spotTargetCapacity.hashCode() : 0);
            return result;
        }
    }
}
