package imports.aws.timestreamwrite;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.817Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.timestreamwrite.TimestreamwriteTableRetentionPropertiesOutputReference")
public class TimestreamwriteTableRetentionPropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected TimestreamwriteTableRetentionPropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected TimestreamwriteTableRetentionPropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public TimestreamwriteTableRetentionPropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMagneticStoreRetentionPeriodInDaysInput() {
        return software.amazon.jsii.Kernel.get(this, "magneticStoreRetentionPeriodInDaysInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMemoryStoreRetentionPeriodInHoursInput() {
        return software.amazon.jsii.Kernel.get(this, "memoryStoreRetentionPeriodInHoursInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMagneticStoreRetentionPeriodInDays() {
        return software.amazon.jsii.Kernel.get(this, "magneticStoreRetentionPeriodInDays", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMagneticStoreRetentionPeriodInDays(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "magneticStoreRetentionPeriodInDays", java.util.Objects.requireNonNull(value, "magneticStoreRetentionPeriodInDays is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMemoryStoreRetentionPeriodInHours() {
        return software.amazon.jsii.Kernel.get(this, "memoryStoreRetentionPeriodInHours", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMemoryStoreRetentionPeriodInHours(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "memoryStoreRetentionPeriodInHours", java.util.Objects.requireNonNull(value, "memoryStoreRetentionPeriodInHours is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableRetentionProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.timestreamwrite.TimestreamwriteTableRetentionProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.timestreamwrite.TimestreamwriteTableRetentionProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
