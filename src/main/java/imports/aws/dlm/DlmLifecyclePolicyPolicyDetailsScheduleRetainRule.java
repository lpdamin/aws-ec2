package imports.aws.dlm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:58.347Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule")
@software.amazon.jsii.Jsii.Proxy(DlmLifecyclePolicyPolicyDetailsScheduleRetainRule.Jsii$Proxy.class)
public interface DlmLifecyclePolicyPolicyDetailsScheduleRetainRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#count DlmLifecyclePolicy#count}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getCount() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#interval DlmLifecyclePolicy#interval}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getInterval() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#interval_unit DlmLifecyclePolicy#interval_unit}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getIntervalUnit() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DlmLifecyclePolicyPolicyDetailsScheduleRetainRule> {
        java.lang.Number count;
        java.lang.Number interval;
        java.lang.String intervalUnit;

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule#getCount}
         * @param count Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#count DlmLifecyclePolicy#count}.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule#getInterval}
         * @param interval Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#interval DlmLifecyclePolicy#interval}.
         * @return {@code this}
         */
        public Builder interval(java.lang.Number interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Sets the value of {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule#getIntervalUnit}
         * @param intervalUnit Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dlm_lifecycle_policy#interval_unit DlmLifecyclePolicy#interval_unit}.
         * @return {@code this}
         */
        public Builder intervalUnit(java.lang.String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DlmLifecyclePolicyPolicyDetailsScheduleRetainRule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DlmLifecyclePolicyPolicyDetailsScheduleRetainRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DlmLifecyclePolicyPolicyDetailsScheduleRetainRule {
        private final java.lang.Number count;
        private final java.lang.Number interval;
        private final java.lang.String intervalUnit;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.interval = software.amazon.jsii.Kernel.get(this, "interval", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.intervalUnit = software.amazon.jsii.Kernel.get(this, "intervalUnit", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = builder.count;
            this.interval = builder.interval;
            this.intervalUnit = builder.intervalUnit;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.lang.Number getInterval() {
            return this.interval;
        }

        @Override
        public final java.lang.String getIntervalUnit() {
            return this.intervalUnit;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getInterval() != null) {
                data.set("interval", om.valueToTree(this.getInterval()));
            }
            if (this.getIntervalUnit() != null) {
                data.set("intervalUnit", om.valueToTree(this.getIntervalUnit()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.dlm.DlmLifecyclePolicyPolicyDetailsScheduleRetainRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DlmLifecyclePolicyPolicyDetailsScheduleRetainRule.Jsii$Proxy that = (DlmLifecyclePolicyPolicyDetailsScheduleRetainRule.Jsii$Proxy) o;

            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.interval != null ? !this.interval.equals(that.interval) : that.interval != null) return false;
            return this.intervalUnit != null ? this.intervalUnit.equals(that.intervalUnit) : that.intervalUnit == null;
        }

        @Override
        public final int hashCode() {
            int result = this.count != null ? this.count.hashCode() : 0;
            result = 31 * result + (this.interval != null ? this.interval.hashCode() : 0);
            result = 31 * result + (this.intervalUnit != null ? this.intervalUnit.hashCode() : 0);
            return result;
        }
    }
}
