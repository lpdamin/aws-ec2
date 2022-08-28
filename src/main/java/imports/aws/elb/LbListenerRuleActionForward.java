package imports.aws.elb;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.854Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elb.LbListenerRuleActionForward")
@software.amazon.jsii.Jsii.Proxy(LbListenerRuleActionForward.Jsii$Proxy.class)
public interface LbListenerRuleActionForward extends software.amazon.jsii.JsiiSerializable {

    /**
     * target_group block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#target_group LbListenerRule#target_group}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getTargetGroup();

    /**
     * stickiness block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#stickiness LbListenerRule#stickiness}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.elb.LbListenerRuleActionForwardStickiness getStickiness() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LbListenerRuleActionForward}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LbListenerRuleActionForward}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LbListenerRuleActionForward> {
        java.lang.Object targetGroup;
        imports.aws.elb.LbListenerRuleActionForwardStickiness stickiness;

        /**
         * Sets the value of {@link LbListenerRuleActionForward#getTargetGroup}
         * @param targetGroup target_group block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#target_group LbListenerRule#target_group}
         * @return {@code this}
         */
        public Builder targetGroup(com.hashicorp.cdktf.IResolvable targetGroup) {
            this.targetGroup = targetGroup;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleActionForward#getTargetGroup}
         * @param targetGroup target_group block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#target_group LbListenerRule#target_group}
         * @return {@code this}
         */
        public Builder targetGroup(java.util.List<? extends imports.aws.elb.LbListenerRuleActionForwardTargetGroup> targetGroup) {
            this.targetGroup = targetGroup;
            return this;
        }

        /**
         * Sets the value of {@link LbListenerRuleActionForward#getStickiness}
         * @param stickiness stickiness block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lb_listener_rule#stickiness LbListenerRule#stickiness}
         * @return {@code this}
         */
        public Builder stickiness(imports.aws.elb.LbListenerRuleActionForwardStickiness stickiness) {
            this.stickiness = stickiness;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LbListenerRuleActionForward}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LbListenerRuleActionForward build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LbListenerRuleActionForward}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LbListenerRuleActionForward {
        private final java.lang.Object targetGroup;
        private final imports.aws.elb.LbListenerRuleActionForwardStickiness stickiness;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.targetGroup = software.amazon.jsii.Kernel.get(this, "targetGroup", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.stickiness = software.amazon.jsii.Kernel.get(this, "stickiness", software.amazon.jsii.NativeType.forClass(imports.aws.elb.LbListenerRuleActionForwardStickiness.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.targetGroup = java.util.Objects.requireNonNull(builder.targetGroup, "targetGroup is required");
            this.stickiness = builder.stickiness;
        }

        @Override
        public final java.lang.Object getTargetGroup() {
            return this.targetGroup;
        }

        @Override
        public final imports.aws.elb.LbListenerRuleActionForwardStickiness getStickiness() {
            return this.stickiness;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("targetGroup", om.valueToTree(this.getTargetGroup()));
            if (this.getStickiness() != null) {
                data.set("stickiness", om.valueToTree(this.getStickiness()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elb.LbListenerRuleActionForward"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LbListenerRuleActionForward.Jsii$Proxy that = (LbListenerRuleActionForward.Jsii$Proxy) o;

            if (!targetGroup.equals(that.targetGroup)) return false;
            return this.stickiness != null ? this.stickiness.equals(that.stickiness) : that.stickiness == null;
        }

        @Override
        public final int hashCode() {
            int result = this.targetGroup.hashCode();
            result = 31 * result + (this.stickiness != null ? this.stickiness.hashCode() : 0);
            return result;
        }
    }
}
