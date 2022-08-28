package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.020Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrcontainersVirtualClusterContainerProviderInfoOutputReference")
public class EmrcontainersVirtualClusterContainerProviderInfoOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EmrcontainersVirtualClusterContainerProviderInfoOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EmrcontainersVirtualClusterContainerProviderInfoOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EmrcontainersVirtualClusterContainerProviderInfoOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putEksInfo(final @org.jetbrains.annotations.NotNull imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo value) {
        software.amazon.jsii.Kernel.call(this, "putEksInfo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfoOutputReference getEksInfo() {
        return software.amazon.jsii.Kernel.get(this, "eksInfo", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfoOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo getEksInfoInput() {
        return software.amazon.jsii.Kernel.get(this, "eksInfoInput", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfoEksInfo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfo getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfo.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.emr.EmrcontainersVirtualClusterContainerProviderInfo value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
