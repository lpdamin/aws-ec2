package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.693Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference")
public class AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualNodeSpecLoggingAccessLogFileOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPathInput() {
        return software.amazon.jsii.Kernel.get(this, "pathInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPath() {
        return software.amazon.jsii.Kernel.get(this, "path", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPath(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "path", java.util.Objects.requireNonNull(value, "path is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFile getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFile.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualNodeSpecLoggingAccessLogFile value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
