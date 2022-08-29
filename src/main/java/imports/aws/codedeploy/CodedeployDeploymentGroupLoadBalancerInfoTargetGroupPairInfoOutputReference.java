package imports.aws.codedeploy;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.129Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference")
public class CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putProdTrafficRoute(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute value) {
        software.amazon.jsii.Kernel.call(this, "putProdTrafficRoute", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetGroup(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTargetGroup", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTestTrafficRoute(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute value) {
        software.amazon.jsii.Kernel.call(this, "putTestTrafficRoute", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetTestTrafficRoute() {
        software.amazon.jsii.Kernel.call(this, "resetTestTrafficRoute", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteOutputReference getProdTrafficRoute() {
        return software.amazon.jsii.Kernel.get(this, "prodTrafficRoute", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupList getTargetGroup() {
        return software.amazon.jsii.Kernel.get(this, "targetGroup", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteOutputReference getTestTrafficRoute() {
        return software.amazon.jsii.Kernel.get(this, "testTrafficRoute", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute getProdTrafficRouteInput() {
        return software.amazon.jsii.Kernel.get(this, "prodTrafficRouteInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRoute.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTargetGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute getTestTrafficRouteInput() {
        return software.amazon.jsii.Kernel.get(this, "testTrafficRouteInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRoute.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
