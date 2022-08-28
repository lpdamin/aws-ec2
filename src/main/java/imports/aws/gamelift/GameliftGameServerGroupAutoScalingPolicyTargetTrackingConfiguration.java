package imports.aws.gamelift;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.257Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration")
@software.amazon.jsii.Jsii.Proxy(GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration.Jsii$Proxy.class)
public interface GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_server_group#target_value GameliftGameServerGroup#target_value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getTargetValue();

    /**
     * @return a {@link Builder} of {@link GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration> {
        java.lang.Number targetValue;

        /**
         * Sets the value of {@link GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration#getTargetValue}
         * @param targetValue Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/gamelift_game_server_group#target_value GameliftGameServerGroup#target_value}. This parameter is required.
         * @return {@code this}
         */
        public Builder targetValue(java.lang.Number targetValue) {
            this.targetValue = targetValue;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration {
        private final java.lang.Number targetValue;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetValue = software.amazon.jsii.Kernel.get(this, "targetValue", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetValue = java.util.Objects.requireNonNull(builder.targetValue, "targetValue is required");
        }

        @Override
        public final java.lang.Number getTargetValue() {
            return this.targetValue;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("targetValue", om.valueToTree(this.getTargetValue()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.gamelift.GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration.Jsii$Proxy that = (GameliftGameServerGroupAutoScalingPolicyTargetTrackingConfiguration.Jsii$Proxy) o;

            return this.targetValue.equals(that.targetValue);
        }

        @Override
        public final int hashCode() {
            int result = this.targetValue.hashCode();
            return result;
        }
    }
}
