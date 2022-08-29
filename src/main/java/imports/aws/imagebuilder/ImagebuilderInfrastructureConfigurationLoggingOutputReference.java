package imports.aws.imagebuilder;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.417Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.imagebuilder.ImagebuilderInfrastructureConfigurationLoggingOutputReference")
public class ImagebuilderInfrastructureConfigurationLoggingOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ImagebuilderInfrastructureConfigurationLoggingOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ImagebuilderInfrastructureConfigurationLoggingOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ImagebuilderInfrastructureConfigurationLoggingOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putS3Logs(final @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLoggingS3Logs value) {
        software.amazon.jsii.Kernel.call(this, "putS3Logs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLoggingS3LogsOutputReference getS3Logs() {
        return software.amazon.jsii.Kernel.get(this, "s3Logs", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLoggingS3LogsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLoggingS3Logs getS3LogsInput() {
        return software.amazon.jsii.Kernel.get(this, "s3LogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLoggingS3Logs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLogging getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLogging.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.imagebuilder.ImagebuilderInfrastructureConfigurationLogging value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
