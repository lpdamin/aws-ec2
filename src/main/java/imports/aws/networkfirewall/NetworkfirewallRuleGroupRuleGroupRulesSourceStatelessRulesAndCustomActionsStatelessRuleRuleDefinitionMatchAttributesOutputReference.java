package imports.aws.networkfirewall;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.053Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesOutputReference")
public class NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putDestination(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDestination", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDestinationPort(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putDestinationPort", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSource(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourcePort(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSourcePort", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTcpFlag(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTcpFlag", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetDestination() {
        software.amazon.jsii.Kernel.call(this, "resetDestination", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDestinationPort() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationPort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetProtocols() {
        software.amazon.jsii.Kernel.call(this, "resetProtocols", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSource() {
        software.amazon.jsii.Kernel.call(this, "resetSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourcePort() {
        software.amazon.jsii.Kernel.call(this, "resetSourcePort", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTcpFlag() {
        software.amazon.jsii.Kernel.call(this, "resetTcpFlag", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationList getDestination() {
        return software.amazon.jsii.Kernel.get(this, "destination", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortList getDestinationPort() {
        return software.amazon.jsii.Kernel.get(this, "destinationPort", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceList getSource() {
        return software.amazon.jsii.Kernel.get(this, "source", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortList getSourcePort() {
        return software.amazon.jsii.Kernel.get(this, "sourcePort", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagList getTcpFlag() {
        return software.amazon.jsii.Kernel.get(this, "tcpFlag", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getDestinationPortInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationPortInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.Number> getProtocolsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.Number>)(software.amazon.jsii.Kernel.get(this, "protocolsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSourcePortInput() {
        return software.amazon.jsii.Kernel.get(this, "sourcePortInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTcpFlagInput() {
        return software.amazon.jsii.Kernel.get(this, "tcpFlagInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> getProtocols() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "protocols", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Number.class))));
    }

    public void setProtocols(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.Number> value) {
        software.amazon.jsii.Kernel.set(this, "protocols", java.util.Objects.requireNonNull(value, "protocols is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.networkfirewall.NetworkfirewallRuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
