package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.758Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsOutputReference")
public class Ec2NetworkInsightsAnalysisForwardPathComponentsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Ec2NetworkInsightsAnalysisForwardPathComponentsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Ec2NetworkInsightsAnalysisForwardPathComponentsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public Ec2NetworkInsightsAnalysisForwardPathComponentsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsAclRuleList getAclRule() {
        return software.amazon.jsii.Kernel.get(this, "aclRule", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsAclRuleList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsAdditionalDetailsList getAdditionalDetails() {
        return software.amazon.jsii.Kernel.get(this, "additionalDetails", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsAdditionalDetailsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsAttachedToList getAttachedTo() {
        return software.amazon.jsii.Kernel.get(this, "attachedTo", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsAttachedToList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsComponentList getComponent() {
        return software.amazon.jsii.Kernel.get(this, "component", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsComponentList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsDestinationVpcList getDestinationVpc() {
        return software.amazon.jsii.Kernel.get(this, "destinationVpc", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsDestinationVpcList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsInboundHeaderList getInboundHeader() {
        return software.amazon.jsii.Kernel.get(this, "inboundHeader", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsInboundHeaderList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsOutboundHeaderList getOutboundHeader() {
        return software.amazon.jsii.Kernel.get(this, "outboundHeader", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsOutboundHeaderList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsRouteTableRouteList getRouteTableRoute() {
        return software.amazon.jsii.Kernel.get(this, "routeTableRoute", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsRouteTableRouteList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleList getSecurityGroupRule() {
        return software.amazon.jsii.Kernel.get(this, "securityGroupRule", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsSecurityGroupRuleList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getSequenceNumber() {
        return software.amazon.jsii.Kernel.get(this, "sequenceNumber", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsSourceVpcList getSourceVpc() {
        return software.amazon.jsii.Kernel.get(this, "sourceVpc", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsSourceVpcList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsSubnetList getSubnet() {
        return software.amazon.jsii.Kernel.get(this, "subnet", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsSubnetList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsTransitGatewayList getTransitGateway() {
        return software.amazon.jsii.Kernel.get(this, "transitGateway", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsTransitGatewayList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsTransitGatewayRouteTableRouteList getTransitGatewayRouteTableRoute() {
        return software.amazon.jsii.Kernel.get(this, "transitGatewayRouteTableRoute", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsTransitGatewayRouteTableRouteList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsVpcList getVpc() {
        return software.amazon.jsii.Kernel.get(this, "vpc", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponentsVpcList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponents getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponents.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ec2.Ec2NetworkInsightsAnalysisForwardPathComponents value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
