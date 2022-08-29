package imports.aws.macie2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.899Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference")
public class Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putTagValues(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putTagValues", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetComparator() {
        software.amazon.jsii.Kernel.call(this, "resetComparator", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagValues() {
        software.amazon.jsii.Kernel.call(this, "resetTagValues", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValuesList getTagValues() {
        return software.amazon.jsii.Kernel.get(this, "tagValues", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionTagValuesList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getComparatorInput() {
        return software.amazon.jsii.Kernel.get(this, "comparatorInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTagValuesInput() {
        return software.amazon.jsii.Kernel.get(this, "tagValuesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getComparator() {
        return software.amazon.jsii.Kernel.get(this, "comparator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setComparator(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "comparator", java.util.Objects.requireNonNull(value, "comparator is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterion getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterion.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterion value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
