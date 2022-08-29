package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.037Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallRuleGroupRuleGroup")
@software.amazon.jsii.Jsii.Proxy(NetworkfirewallRuleGroupRuleGroup.Jsii$Proxy.class)
public interface NetworkfirewallRuleGroupRuleGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * rules_source block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_rule_group#rules_source NetworkfirewallRuleGroup#rules_source}
     */
    @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource getRulesSource();

    /**
     * rule_variables block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_rule_group#rule_variables NetworkfirewallRuleGroup#rule_variables}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariables getRuleVariables() {
        return null;
    }

    /**
     * stateful_rule_options block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_rule_group#stateful_rule_options NetworkfirewallRuleGroup#stateful_rule_options}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupStatefulRuleOptions getStatefulRuleOptions() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkfirewallRuleGroupRuleGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkfirewallRuleGroupRuleGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkfirewallRuleGroupRuleGroup> {
        imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource rulesSource;
        imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariables ruleVariables;
        imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupStatefulRuleOptions statefulRuleOptions;

        /**
         * Sets the value of {@link NetworkfirewallRuleGroupRuleGroup#getRulesSource}
         * @param rulesSource rules_source block. This parameter is required.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_rule_group#rules_source NetworkfirewallRuleGroup#rules_source}
         * @return {@code this}
         */
        public Builder rulesSource(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource rulesSource) {
            this.rulesSource = rulesSource;
            return this;
        }

        /**
         * Sets the value of {@link NetworkfirewallRuleGroupRuleGroup#getRuleVariables}
         * @param ruleVariables rule_variables block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_rule_group#rule_variables NetworkfirewallRuleGroup#rule_variables}
         * @return {@code this}
         */
        public Builder ruleVariables(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariables ruleVariables) {
            this.ruleVariables = ruleVariables;
            return this;
        }

        /**
         * Sets the value of {@link NetworkfirewallRuleGroupRuleGroup#getStatefulRuleOptions}
         * @param statefulRuleOptions stateful_rule_options block.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/networkfirewall_rule_group#stateful_rule_options NetworkfirewallRuleGroup#stateful_rule_options}
         * @return {@code this}
         */
        public Builder statefulRuleOptions(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupStatefulRuleOptions statefulRuleOptions) {
            this.statefulRuleOptions = statefulRuleOptions;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkfirewallRuleGroupRuleGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkfirewallRuleGroupRuleGroup build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link NetworkfirewallRuleGroupRuleGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkfirewallRuleGroupRuleGroup {
        private final imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource rulesSource;
        private final imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariables ruleVariables;
        private final imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupStatefulRuleOptions statefulRuleOptions;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.rulesSource = software.amazon.jsii.Kernel.get(this, "rulesSource", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource.class));
            this.ruleVariables = software.amazon.jsii.Kernel.get(this, "ruleVariables", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariables.class));
            this.statefulRuleOptions = software.amazon.jsii.Kernel.get(this, "statefulRuleOptions", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupStatefulRuleOptions.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.rulesSource = java.util.Objects.requireNonNull(builder.rulesSource, "rulesSource is required");
            this.ruleVariables = builder.ruleVariables;
            this.statefulRuleOptions = builder.statefulRuleOptions;
        }

        @Override
        public final imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSource getRulesSource() {
            return this.rulesSource;
        }

        @Override
        public final imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRuleVariables getRuleVariables() {
            return this.ruleVariables;
        }

        @Override
        public final imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupStatefulRuleOptions getStatefulRuleOptions() {
            return this.statefulRuleOptions;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("rulesSource", om.valueToTree(this.getRulesSource()));
            if (this.getRuleVariables() != null) {
                data.set("ruleVariables", om.valueToTree(this.getRuleVariables()));
            }
            if (this.getStatefulRuleOptions() != null) {
                data.set("statefulRuleOptions", om.valueToTree(this.getStatefulRuleOptions()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.networkfirewall.NetworkfirewallRuleGroupRuleGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkfirewallRuleGroupRuleGroup.Jsii$Proxy that = (NetworkfirewallRuleGroupRuleGroup.Jsii$Proxy) o;

            if (!rulesSource.equals(that.rulesSource)) return false;
            if (this.ruleVariables != null ? !this.ruleVariables.equals(that.ruleVariables) : that.ruleVariables != null) return false;
            return this.statefulRuleOptions != null ? this.statefulRuleOptions.equals(that.statefulRuleOptions) : that.statefulRuleOptions == null;
        }

        @Override
        public final int hashCode() {
            int result = this.rulesSource.hashCode();
            result = 31 * result + (this.ruleVariables != null ? this.ruleVariables.hashCode() : 0);
            result = 31 * result + (this.statefulRuleOptions != null ? this.statefulRuleOptions.hashCode() : 0);
            return result;
        }
    }
}
