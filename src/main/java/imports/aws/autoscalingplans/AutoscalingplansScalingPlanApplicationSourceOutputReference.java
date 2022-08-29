package imports.aws.autoscalingplans;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.827Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.autoscalingplans.AutoscalingplansScalingPlanApplicationSourceOutputReference")
public class AutoscalingplansScalingPlanApplicationSourceOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AutoscalingplansScalingPlanApplicationSourceOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AutoscalingplansScalingPlanApplicationSourceOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AutoscalingplansScalingPlanApplicationSourceOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTagFilter(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTagFilter", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCloudformationStackArn() {
        software.amazon.jsii.Kernel.call(this, "resetCloudformationStackArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagFilter() {
        software.amazon.jsii.Kernel.call(this, "resetTagFilter", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.autoscalingplans.AutoscalingplansScalingPlanApplicationSourceTagFilterList getTagFilter() {
        return software.amazon.jsii.Kernel.get(this, "tagFilter", software.amazon.jsii.NativeType.forClass(imports.aws.autoscalingplans.AutoscalingplansScalingPlanApplicationSourceTagFilterList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getCloudformationStackArnInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudformationStackArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTagFilterInput() {
        return software.amazon.jsii.Kernel.get(this, "tagFilterInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCloudformationStackArn() {
        return software.amazon.jsii.Kernel.get(this, "cloudformationStackArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setCloudformationStackArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "cloudformationStackArn", java.util.Objects.requireNonNull(value, "cloudformationStackArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.autoscalingplans.AutoscalingplansScalingPlanApplicationSource getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.autoscalingplans.AutoscalingplansScalingPlanApplicationSource.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.autoscalingplans.AutoscalingplansScalingPlanApplicationSource value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
