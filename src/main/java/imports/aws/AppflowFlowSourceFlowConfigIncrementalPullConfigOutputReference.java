package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.023Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference")
public class AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowSourceFlowConfigIncrementalPullConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetDatetimeTypeFieldName() {
        software.amazon.jsii.Kernel.call(this, "resetDatetimeTypeFieldName", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDatetimeTypeFieldNameInput() {
        return software.amazon.jsii.Kernel.get(this, "datetimeTypeFieldNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDatetimeTypeFieldName() {
        return software.amazon.jsii.Kernel.get(this, "datetimeTypeFieldName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDatetimeTypeFieldName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "datetimeTypeFieldName", java.util.Objects.requireNonNull(value, "datetimeTypeFieldName is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowSourceFlowConfigIncrementalPullConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
