package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.693Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogOutputReference")
public class AppmeshVirtualNodeSpecLoggingAccessLogOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecLoggingAccessLogOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecLoggingAccessLogOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecLoggingAccessLogOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFile(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFile value) {
        software.amazon.jsii.Kernel.call(this, "putFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFile() {
        software.amazon.jsii.Kernel.call(this, "resetFile", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference getFile() {
        return software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFile getFileInput() {
        return software.amazon.jsii.Kernel.get(this, "fileInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLog getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLog.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLog value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
