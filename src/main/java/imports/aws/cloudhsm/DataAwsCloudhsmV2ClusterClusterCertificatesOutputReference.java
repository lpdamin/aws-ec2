package imports.aws.cloudhsm;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.333Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudhsm.DataAwsCloudhsmV2ClusterClusterCertificatesOutputReference")
public class DataAwsCloudhsmV2ClusterClusterCertificatesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsCloudhsmV2ClusterClusterCertificatesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsCloudhsmV2ClusterClusterCertificatesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsCloudhsmV2ClusterClusterCertificatesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAwsHardwareCertificate() {
        return software.amazon.jsii.Kernel.get(this, "awsHardwareCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterCertificate() {
        return software.amazon.jsii.Kernel.get(this, "clusterCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClusterCsr() {
        return software.amazon.jsii.Kernel.get(this, "clusterCsr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHsmCertificate() {
        return software.amazon.jsii.Kernel.get(this, "hsmCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getManufacturerHardwareCertificate() {
        return software.amazon.jsii.Kernel.get(this, "manufacturerHardwareCertificate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudhsm.DataAwsCloudhsmV2ClusterClusterCertificates getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudhsm.DataAwsCloudhsmV2ClusterClusterCertificates.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudhsm.DataAwsCloudhsmV2ClusterClusterCertificates value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
