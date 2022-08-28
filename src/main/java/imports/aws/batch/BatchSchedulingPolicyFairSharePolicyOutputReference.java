package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.048Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.BatchSchedulingPolicyFairSharePolicyOutputReference")
public class BatchSchedulingPolicyFairSharePolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected BatchSchedulingPolicyFairSharePolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected BatchSchedulingPolicyFairSharePolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public BatchSchedulingPolicyFairSharePolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putShareDistribution(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putShareDistribution", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetComputeReservation() {
        software.amazon.jsii.Kernel.call(this, "resetComputeReservation", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShareDecaySeconds() {
        software.amazon.jsii.Kernel.call(this, "resetShareDecaySeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetShareDistribution() {
        software.amazon.jsii.Kernel.call(this, "resetShareDistribution", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.batch.BatchSchedulingPolicyFairSharePolicyShareDistributionList getShareDistribution() {
        return software.amazon.jsii.Kernel.get(this, "shareDistribution", software.amazon.jsii.NativeType.forClass(imports.aws.batch.BatchSchedulingPolicyFairSharePolicyShareDistributionList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getComputeReservationInput() {
        return software.amazon.jsii.Kernel.get(this, "computeReservationInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getShareDecaySecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "shareDecaySecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getShareDistributionInput() {
        return software.amazon.jsii.Kernel.get(this, "shareDistributionInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getComputeReservation() {
        return software.amazon.jsii.Kernel.get(this, "computeReservation", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setComputeReservation(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "computeReservation", java.util.Objects.requireNonNull(value, "computeReservation is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getShareDecaySeconds() {
        return software.amazon.jsii.Kernel.get(this, "shareDecaySeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setShareDecaySeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "shareDecaySeconds", java.util.Objects.requireNonNull(value, "shareDecaySeconds is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.batch.BatchSchedulingPolicyFairSharePolicy getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.batch.BatchSchedulingPolicyFairSharePolicy.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.batch.BatchSchedulingPolicyFairSharePolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
