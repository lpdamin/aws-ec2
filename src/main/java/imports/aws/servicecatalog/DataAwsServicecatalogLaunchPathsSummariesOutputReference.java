package imports.aws.servicecatalog;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.628Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.servicecatalog.DataAwsServicecatalogLaunchPathsSummariesOutputReference")
public class DataAwsServicecatalogLaunchPathsSummariesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsServicecatalogLaunchPathsSummariesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsServicecatalogLaunchPathsSummariesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsServicecatalogLaunchPathsSummariesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.servicecatalog.DataAwsServicecatalogLaunchPathsSummariesConstraintSummariesList getConstraintSummaries() {
        return software.amazon.jsii.Kernel.get(this, "constraintSummaries", software.amazon.jsii.NativeType.forClass(imports.aws.servicecatalog.DataAwsServicecatalogLaunchPathsSummariesConstraintSummariesList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getPathId() {
        return software.amazon.jsii.Kernel.get(this, "pathId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.StringMap getTags() {
        return software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.StringMap.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.servicecatalog.DataAwsServicecatalogLaunchPathsSummaries getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.servicecatalog.DataAwsServicecatalogLaunchPathsSummaries.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.servicecatalog.DataAwsServicecatalogLaunchPathsSummaries value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
