package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.637Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.DataAwsOpensearchDomainSnapshotOptionsOutputReference")
public class DataAwsOpensearchDomainSnapshotOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsOpensearchDomainSnapshotOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsOpensearchDomainSnapshotOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsOpensearchDomainSnapshotOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getAutomatedSnapshotStartHour() {
        return software.amazon.jsii.Kernel.get(this, "automatedSnapshotStartHour", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.DataAwsOpensearchDomainSnapshotOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.DataAwsOpensearchDomainSnapshotOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.DataAwsOpensearchDomainSnapshotOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
