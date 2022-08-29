package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.988Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryOutputReference")
public class MskconnectConnectorLogDeliveryWorkerLogDeliveryOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskconnectConnectorLogDeliveryWorkerLogDeliveryOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskconnectConnectorLogDeliveryWorkerLogDeliveryOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskconnectConnectorLogDeliveryWorkerLogDeliveryOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCloudwatchLogs(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFirehose(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryFirehose value) {
        software.amazon.jsii.Kernel.call(this, "putFirehose", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryS3 value) {
        software.amazon.jsii.Kernel.call(this, "putS3", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCloudwatchLogs() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFirehose() {
        software.amazon.jsii.Kernel.call(this, "resetFirehose", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3() {
        software.amazon.jsii.Kernel.call(this, "resetS3", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogsOutputReference getCloudwatchLogs() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogs", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryFirehoseOutputReference getFirehose() {
        return software.amazon.jsii.Kernel.get(this, "firehose", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryFirehoseOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryS3OutputReference getS3() {
        return software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryS3OutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs getCloudwatchLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryCloudwatchLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryFirehose getFirehoseInput() {
        return software.amazon.jsii.Kernel.get(this, "firehoseInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryFirehose.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryS3 getS3Input() {
        return software.amazon.jsii.Kernel.get(this, "s3Input", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDeliveryS3.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorLogDeliveryWorkerLogDelivery value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
