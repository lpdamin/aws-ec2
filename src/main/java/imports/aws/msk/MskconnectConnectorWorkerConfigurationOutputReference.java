package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.989Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorWorkerConfigurationOutputReference")
public class MskconnectConnectorWorkerConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskconnectConnectorWorkerConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskconnectConnectorWorkerConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskconnectConnectorWorkerConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getArnInput() {
        return software.amazon.jsii.Kernel.get(this, "arnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getRevisionInput() {
        return software.amazon.jsii.Kernel.get(this, "revisionInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "arn", java.util.Objects.requireNonNull(value, "arn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getRevision() {
        return software.amazon.jsii.Kernel.get(this, "revision", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setRevision(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "revision", java.util.Objects.requireNonNull(value, "revision is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorWorkerConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorWorkerConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorWorkerConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
