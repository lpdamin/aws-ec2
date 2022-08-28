package imports.aws.efs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.442Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.efs.EfsFileSystemLifecyclePolicyOutputReference")
public class EfsFileSystemLifecyclePolicyOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected EfsFileSystemLifecyclePolicyOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected EfsFileSystemLifecyclePolicyOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public EfsFileSystemLifecyclePolicyOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void resetTransitionToIa() {
        software.amazon.jsii.Kernel.call(this, "resetTransitionToIa", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTransitionToPrimaryStorageClass() {
        software.amazon.jsii.Kernel.call(this, "resetTransitionToPrimaryStorageClass", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTransitionToIaInput() {
        return software.amazon.jsii.Kernel.get(this, "transitionToIaInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTransitionToPrimaryStorageClassInput() {
        return software.amazon.jsii.Kernel.get(this, "transitionToPrimaryStorageClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransitionToIa() {
        return software.amazon.jsii.Kernel.get(this, "transitionToIa", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTransitionToIa(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "transitionToIa", java.util.Objects.requireNonNull(value, "transitionToIa is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTransitionToPrimaryStorageClass() {
        return software.amazon.jsii.Kernel.get(this, "transitionToPrimaryStorageClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTransitionToPrimaryStorageClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "transitionToPrimaryStorageClass", java.util.Objects.requireNonNull(value, "transitionToPrimaryStorageClass is required"));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.efs.EfsFileSystemLifecyclePolicy value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
