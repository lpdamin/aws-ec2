package imports.aws.eks;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.954Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eks.EksClusterKubernetesNetworkConfigOutputReference")
public class EksClusterKubernetesNetworkConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EksClusterKubernetesNetworkConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EksClusterKubernetesNetworkConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public EksClusterKubernetesNetworkConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void resetIpFamily() {
        software.amazon.jsii.Kernel.call(this, "resetIpFamily", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServiceIpv4Cidr() {
        software.amazon.jsii.Kernel.call(this, "resetServiceIpv4Cidr", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIpFamilyInput() {
        return software.amazon.jsii.Kernel.get(this, "ipFamilyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getServiceIpv4CidrInput() {
        return software.amazon.jsii.Kernel.get(this, "serviceIpv4CidrInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIpFamily() {
        return software.amazon.jsii.Kernel.get(this, "ipFamily", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIpFamily(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "ipFamily", java.util.Objects.requireNonNull(value, "ipFamily is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getServiceIpv4Cidr() {
        return software.amazon.jsii.Kernel.get(this, "serviceIpv4Cidr", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setServiceIpv4Cidr(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "serviceIpv4Cidr", java.util.Objects.requireNonNull(value, "serviceIpv4Cidr is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.eks.EksClusterKubernetesNetworkConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.eks.EksClusterKubernetesNetworkConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.eks.EksClusterKubernetesNetworkConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
