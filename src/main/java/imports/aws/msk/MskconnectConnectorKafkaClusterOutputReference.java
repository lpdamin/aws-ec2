package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.872Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectConnectorKafkaClusterOutputReference")
public class MskconnectConnectorKafkaClusterOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected MskconnectConnectorKafkaClusterOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MskconnectConnectorKafkaClusterOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public MskconnectConnectorKafkaClusterOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putApacheKafkaCluster(final @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster value) {
        software.amazon.jsii.Kernel.call(this, "putApacheKafkaCluster", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference getApacheKafkaCluster() {
        return software.amazon.jsii.Kernel.get(this, "apacheKafkaCluster", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaClusterOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster getApacheKafkaClusterInput() {
        return software.amazon.jsii.Kernel.get(this, "apacheKafkaClusterInput", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaClusterApacheKafkaCluster.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorKafkaCluster getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectConnectorKafkaCluster.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.msk.MskconnectConnectorKafkaCluster value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
