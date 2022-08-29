package imports.aws.appmesh;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.670Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLogOutputReference")
public class AppmeshVirtualGatewaySpecLoggingAccessLogOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppmeshVirtualGatewaySpecLoggingAccessLogOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppmeshVirtualGatewaySpecLoggingAccessLogOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppmeshVirtualGatewaySpecLoggingAccessLogOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFile(final @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLogFile value) {
        software.amazon.jsii.Kernel.call(this, "putFile", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetFile() {
        software.amazon.jsii.Kernel.call(this, "resetFile", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLogFileOutputReference getFile() {
        return software.amazon.jsii.Kernel.get(this, "file", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLogFileOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLogFile getFileInput() {
        return software.amazon.jsii.Kernel.get(this, "fileInput", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLogFile.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.appmesh.AppmeshVirtualGatewaySpecLoggingAccessLog value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
