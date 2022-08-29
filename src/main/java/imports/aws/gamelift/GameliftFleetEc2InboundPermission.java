package imports.aws.gamelift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.214Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftFleetEc2InboundPermission")
@software.amazon.jsii.Jsii.Proxy(GameliftFleetEc2InboundPermission.Jsii$Proxy.class)
public interface GameliftFleetEc2InboundPermission extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#from_port GameliftFleet#from_port}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getFromPort();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#ip_range GameliftFleet#ip_range}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getIpRange();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#protocol GameliftFleet#protocol}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getProtocol();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#to_port GameliftFleet#to_port}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getToPort();

    /**
     * @return a {@link Builder} of {@link GameliftFleetEc2InboundPermission}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GameliftFleetEc2InboundPermission}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GameliftFleetEc2InboundPermission> {
        java.lang.Number fromPort;
        java.lang.String ipRange;
        java.lang.String protocol;
        java.lang.Number toPort;

        /**
         * Sets the value of {@link GameliftFleetEc2InboundPermission#getFromPort}
         * @param fromPort Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#from_port GameliftFleet#from_port}. This parameter is required.
         * @return {@code this}
         */
        public Builder fromPort(java.lang.Number fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetEc2InboundPermission#getIpRange}
         * @param ipRange Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#ip_range GameliftFleet#ip_range}. This parameter is required.
         * @return {@code this}
         */
        public Builder ipRange(java.lang.String ipRange) {
            this.ipRange = ipRange;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetEc2InboundPermission#getProtocol}
         * @param protocol Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#protocol GameliftFleet#protocol}. This parameter is required.
         * @return {@code this}
         */
        public Builder protocol(java.lang.String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Sets the value of {@link GameliftFleetEc2InboundPermission#getToPort}
         * @param toPort Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_fleet#to_port GameliftFleet#to_port}. This parameter is required.
         * @return {@code this}
         */
        public Builder toPort(java.lang.Number toPort) {
            this.toPort = toPort;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GameliftFleetEc2InboundPermission}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GameliftFleetEc2InboundPermission build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GameliftFleetEc2InboundPermission}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GameliftFleetEc2InboundPermission {
        private final java.lang.Number fromPort;
        private final java.lang.String ipRange;
        private final java.lang.String protocol;
        private final java.lang.Number toPort;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.fromPort = software.amazon.jsii.Kernel.get(this, "fromPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.ipRange = software.amazon.jsii.Kernel.get(this, "ipRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.protocol = software.amazon.jsii.Kernel.get(this, "protocol", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.toPort = software.amazon.jsii.Kernel.get(this, "toPort", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.fromPort = java.util.Objects.requireNonNull(builder.fromPort, "fromPort is required");
            this.ipRange = java.util.Objects.requireNonNull(builder.ipRange, "ipRange is required");
            this.protocol = java.util.Objects.requireNonNull(builder.protocol, "protocol is required");
            this.toPort = java.util.Objects.requireNonNull(builder.toPort, "toPort is required");
        }

        @Override
        public final java.lang.Number getFromPort() {
            return this.fromPort;
        }

        @Override
        public final java.lang.String getIpRange() {
            return this.ipRange;
        }

        @Override
        public final java.lang.String getProtocol() {
            return this.protocol;
        }

        @Override
        public final java.lang.Number getToPort() {
            return this.toPort;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("fromPort", om.valueToTree(this.getFromPort()));
            data.set("ipRange", om.valueToTree(this.getIpRange()));
            data.set("protocol", om.valueToTree(this.getProtocol()));
            data.set("toPort", om.valueToTree(this.getToPort()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.gamelift.GameliftFleetEc2InboundPermission"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GameliftFleetEc2InboundPermission.Jsii$Proxy that = (GameliftFleetEc2InboundPermission.Jsii$Proxy) o;

            if (!fromPort.equals(that.fromPort)) return false;
            if (!ipRange.equals(that.ipRange)) return false;
            if (!protocol.equals(that.protocol)) return false;
            return this.toPort.equals(that.toPort);
        }

        @Override
        public final int hashCode() {
            int result = this.fromPort.hashCode();
            result = 31 * result + (this.ipRange.hashCode());
            result = 31 * result + (this.protocol.hashCode());
            result = 31 * result + (this.toPort.hashCode());
            return result;
        }
    }
}
