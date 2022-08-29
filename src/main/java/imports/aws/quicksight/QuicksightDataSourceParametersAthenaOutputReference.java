package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.192Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersAthenaOutputReference")
public class QuicksightDataSourceParametersAthenaOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected QuicksightDataSourceParametersAthenaOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected QuicksightDataSourceParametersAthenaOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public QuicksightDataSourceParametersAthenaOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetWorkGroup() {
        software.amazon.jsii.Kernel.call(this, "resetWorkGroup", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getWorkGroupInput() {
        return software.amazon.jsii.Kernel.get(this, "workGroupInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getWorkGroup() {
        return software.amazon.jsii.Kernel.get(this, "workGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setWorkGroup(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "workGroup", java.util.Objects.requireNonNull(value, "workGroup is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAthena getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.quicksight.QuicksightDataSourceParametersAthena.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.quicksight.QuicksightDataSourceParametersAthena value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
