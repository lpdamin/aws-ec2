package imports.aws.route53;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule aws_route53_resolver_firewall_rule}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.362Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.route53.Route53ResolverFirewallRule")
public class Route53ResolverFirewallRule extends com.hashicorp.cdktf.TerraformResource {

    protected Route53ResolverFirewallRule(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Route53ResolverFirewallRule(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.route53.Route53ResolverFirewallRule.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule aws_route53_resolver_firewall_rule} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public Route53ResolverFirewallRule(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.route53.Route53ResolverFirewallRuleConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetBlockOverrideDnsType() {
        software.amazon.jsii.Kernel.call(this, "resetBlockOverrideDnsType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlockOverrideDomain() {
        software.amazon.jsii.Kernel.call(this, "resetBlockOverrideDomain", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlockOverrideTtl() {
        software.amazon.jsii.Kernel.call(this, "resetBlockOverrideTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBlockResponse() {
        software.amazon.jsii.Kernel.call(this, "resetBlockResponse", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getActionInput() {
        return software.amazon.jsii.Kernel.get(this, "actionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBlockOverrideDnsTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "blockOverrideDnsTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBlockOverrideDomainInput() {
        return software.amazon.jsii.Kernel.get(this, "blockOverrideDomainInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBlockOverrideTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "blockOverrideTtlInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBlockResponseInput() {
        return software.amazon.jsii.Kernel.get(this, "blockResponseInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFirewallDomainListIdInput() {
        return software.amazon.jsii.Kernel.get(this, "firewallDomainListIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFirewallRuleGroupIdInput() {
        return software.amazon.jsii.Kernel.get(this, "firewallRuleGroupIdInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getPriorityInput() {
        return software.amazon.jsii.Kernel.get(this, "priorityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAction() {
        return software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAction(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "action", java.util.Objects.requireNonNull(value, "action is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBlockOverrideDnsType() {
        return software.amazon.jsii.Kernel.get(this, "blockOverrideDnsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBlockOverrideDnsType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "blockOverrideDnsType", java.util.Objects.requireNonNull(value, "blockOverrideDnsType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBlockOverrideDomain() {
        return software.amazon.jsii.Kernel.get(this, "blockOverrideDomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBlockOverrideDomain(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "blockOverrideDomain", java.util.Objects.requireNonNull(value, "blockOverrideDomain is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBlockOverrideTtl() {
        return software.amazon.jsii.Kernel.get(this, "blockOverrideTtl", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBlockOverrideTtl(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "blockOverrideTtl", java.util.Objects.requireNonNull(value, "blockOverrideTtl is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBlockResponse() {
        return software.amazon.jsii.Kernel.get(this, "blockResponse", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBlockResponse(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "blockResponse", java.util.Objects.requireNonNull(value, "blockResponse is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFirewallDomainListId() {
        return software.amazon.jsii.Kernel.get(this, "firewallDomainListId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFirewallDomainListId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "firewallDomainListId", java.util.Objects.requireNonNull(value, "firewallDomainListId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFirewallRuleGroupId() {
        return software.amazon.jsii.Kernel.get(this, "firewallRuleGroupId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFirewallRuleGroupId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "firewallRuleGroupId", java.util.Objects.requireNonNull(value, "firewallRuleGroupId is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getPriority() {
        return software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setPriority(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "priority", java.util.Objects.requireNonNull(value, "priority is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.route53.Route53ResolverFirewallRule}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.route53.Route53ResolverFirewallRule> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.route53.Route53ResolverFirewallRuleConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.route53.Route53ResolverFirewallRuleConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#action Route53ResolverFirewallRule#action}.
         * <p>
         * @return {@code this}
         * @param action Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#action Route53ResolverFirewallRule#action}. This parameter is required.
         */
        public Builder action(final java.lang.String action) {
            this.config.action(action);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_domain_list_id Route53ResolverFirewallRule#firewall_domain_list_id}.
         * <p>
         * @return {@code this}
         * @param firewallDomainListId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_domain_list_id Route53ResolverFirewallRule#firewall_domain_list_id}. This parameter is required.
         */
        public Builder firewallDomainListId(final java.lang.String firewallDomainListId) {
            this.config.firewallDomainListId(firewallDomainListId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_rule_group_id Route53ResolverFirewallRule#firewall_rule_group_id}.
         * <p>
         * @return {@code this}
         * @param firewallRuleGroupId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#firewall_rule_group_id Route53ResolverFirewallRule#firewall_rule_group_id}. This parameter is required.
         */
        public Builder firewallRuleGroupId(final java.lang.String firewallRuleGroupId) {
            this.config.firewallRuleGroupId(firewallRuleGroupId);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#name Route53ResolverFirewallRule#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#name Route53ResolverFirewallRule#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#priority Route53ResolverFirewallRule#priority}.
         * <p>
         * @return {@code this}
         * @param priority Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#priority Route53ResolverFirewallRule#priority}. This parameter is required.
         */
        public Builder priority(final java.lang.Number priority) {
            this.config.priority(priority);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_dns_type Route53ResolverFirewallRule#block_override_dns_type}.
         * <p>
         * @return {@code this}
         * @param blockOverrideDnsType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_dns_type Route53ResolverFirewallRule#block_override_dns_type}. This parameter is required.
         */
        public Builder blockOverrideDnsType(final java.lang.String blockOverrideDnsType) {
            this.config.blockOverrideDnsType(blockOverrideDnsType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_domain Route53ResolverFirewallRule#block_override_domain}.
         * <p>
         * @return {@code this}
         * @param blockOverrideDomain Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_domain Route53ResolverFirewallRule#block_override_domain}. This parameter is required.
         */
        public Builder blockOverrideDomain(final java.lang.String blockOverrideDomain) {
            this.config.blockOverrideDomain(blockOverrideDomain);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_ttl Route53ResolverFirewallRule#block_override_ttl}.
         * <p>
         * @return {@code this}
         * @param blockOverrideTtl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_override_ttl Route53ResolverFirewallRule#block_override_ttl}. This parameter is required.
         */
        public Builder blockOverrideTtl(final java.lang.Number blockOverrideTtl) {
            this.config.blockOverrideTtl(blockOverrideTtl);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_response Route53ResolverFirewallRule#block_response}.
         * <p>
         * @return {@code this}
         * @param blockResponse Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#block_response Route53ResolverFirewallRule#block_response}. This parameter is required.
         */
        public Builder blockResponse(final java.lang.String blockResponse) {
            this.config.blockResponse(blockResponse);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#id Route53ResolverFirewallRule#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/route53_resolver_firewall_rule#id Route53ResolverFirewallRule#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.route53.Route53ResolverFirewallRule}.
         */
        @Override
        public imports.aws.route53.Route53ResolverFirewallRule build() {
            return new imports.aws.route53.Route53ResolverFirewallRule(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
