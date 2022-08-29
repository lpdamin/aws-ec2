package imports.aws.codedeploy;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.128Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoOutputReference")
public class CodedeployDeploymentGroupLoadBalancerInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CodedeployDeploymentGroupLoadBalancerInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CodedeployDeploymentGroupLoadBalancerInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CodedeployDeploymentGroupLoadBalancerInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putElbInfo(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putElbInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetGroupInfo(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTargetGroupInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTargetGroupPairInfo(final @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo value) {
        software.amazon.jsii.Kernel.call(this, "putTargetGroupPairInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetElbInfo() {
        software.amazon.jsii.Kernel.call(this, "resetElbInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGroupInfo() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGroupInfo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTargetGroupPairInfo() {
        software.amazon.jsii.Kernel.call(this, "resetTargetGroupPairInfo", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoElbInfoList getElbInfo() {
        return software.amazon.jsii.Kernel.get(this, "elbInfo", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoElbInfoList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfoList getTargetGroupInfo() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupInfo", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupInfoList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference getTargetGroupPairInfo() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupPairInfo", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getElbInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "elbInfoInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTargetGroupInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupInfoInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo getTargetGroupPairInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "targetGroupPairInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfoTargetGroupPairInfo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.codedeploy.CodedeployDeploymentGroupLoadBalancerInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
