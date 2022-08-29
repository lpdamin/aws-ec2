package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.476Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleKinesisOutputReference")
public class IotTopicRuleKinesisOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotTopicRuleKinesisOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotTopicRuleKinesisOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public IotTopicRuleKinesisOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void resetPartitionKey() {
        software.amazon.jsii.Kernel.call(this, "resetPartitionKey", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getPartitionKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "partitionKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "roleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStreamNameInput() {
        return software.amazon.jsii.Kernel.get(this, "streamNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPartitionKey() {
        return software.amazon.jsii.Kernel.get(this, "partitionKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setPartitionKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "partitionKey", java.util.Objects.requireNonNull(value, "partitionKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "roleArn", java.util.Objects.requireNonNull(value, "roleArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamName() {
        return software.amazon.jsii.Kernel.get(this, "streamName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStreamName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "streamName", java.util.Objects.requireNonNull(value, "streamName is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleKinesis value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
