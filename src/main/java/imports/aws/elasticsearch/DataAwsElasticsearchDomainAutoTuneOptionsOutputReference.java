package imports.aws.elasticsearch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.624Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticsearch.DataAwsElasticsearchDomainAutoTuneOptionsOutputReference")
public class DataAwsElasticsearchDomainAutoTuneOptionsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected DataAwsElasticsearchDomainAutoTuneOptionsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DataAwsElasticsearchDomainAutoTuneOptionsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public DataAwsElasticsearchDomainAutoTuneOptionsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDesiredState() {
        return software.amazon.jsii.Kernel.get(this, "desiredState", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.elasticsearch.DataAwsElasticsearchDomainAutoTuneOptionsMaintenanceScheduleList getMaintenanceSchedule() {
        return software.amazon.jsii.Kernel.get(this, "maintenanceSchedule", software.amazon.jsii.NativeType.forClass(imports.aws.elasticsearch.DataAwsElasticsearchDomainAutoTuneOptionsMaintenanceScheduleList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRollbackOnDisable() {
        return software.amazon.jsii.Kernel.get(this, "rollbackOnDisable", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.elasticsearch.DataAwsElasticsearchDomainAutoTuneOptions getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.elasticsearch.DataAwsElasticsearchDomainAutoTuneOptions.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.elasticsearch.DataAwsElasticsearchDomainAutoTuneOptions value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
