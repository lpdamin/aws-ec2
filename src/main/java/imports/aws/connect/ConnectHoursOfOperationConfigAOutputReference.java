package imports.aws.connect;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.231Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.connect.ConnectHoursOfOperationConfigAOutputReference")
public class ConnectHoursOfOperationConfigAOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ConnectHoursOfOperationConfigAOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ConnectHoursOfOperationConfigAOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public ConnectHoursOfOperationConfigAOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putEndTime(final @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectHoursOfOperationConfigEndTime value) {
        software.amazon.jsii.Kernel.call(this, "putEndTime", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStartTime(final @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectHoursOfOperationConfigStartTime value) {
        software.amazon.jsii.Kernel.call(this, "putStartTime", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectHoursOfOperationConfigEndTimeOutputReference getEndTime() {
        return software.amazon.jsii.Kernel.get(this, "endTime", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectHoursOfOperationConfigEndTimeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.connect.ConnectHoursOfOperationConfigStartTimeOutputReference getStartTime() {
        return software.amazon.jsii.Kernel.get(this, "startTime", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectHoursOfOperationConfigStartTimeOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDayInput() {
        return software.amazon.jsii.Kernel.get(this, "dayInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectHoursOfOperationConfigEndTime getEndTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "endTimeInput", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectHoursOfOperationConfigEndTime.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectHoursOfOperationConfigStartTime getStartTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "startTimeInput", software.amazon.jsii.NativeType.forClass(imports.aws.connect.ConnectHoursOfOperationConfigStartTime.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDay() {
        return software.amazon.jsii.Kernel.get(this, "day", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDay(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "day", java.util.Objects.requireNonNull(value, "day is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.connect.ConnectHoursOfOperationConfigA value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
