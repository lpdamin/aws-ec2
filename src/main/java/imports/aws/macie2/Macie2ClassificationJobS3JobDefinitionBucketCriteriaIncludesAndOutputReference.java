package imports.aws.macie2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.898Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndOutputReference")
public class Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     * @param complexObjectIndex the index of this item in the list. This parameter is required.
     * @param complexObjectIsFromSet whether the list is wrapping a set (will add tolist() to be able to access an item via an index). This parameter is required.
     */
    public Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute, final @org.jetbrains.annotations.NotNull java.lang.Number complexObjectIndex, final @org.jetbrains.annotations.NotNull java.lang.Boolean complexObjectIsFromSet) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required"), java.util.Objects.requireNonNull(complexObjectIndex, "complexObjectIndex is required"), java.util.Objects.requireNonNull(complexObjectIsFromSet, "complexObjectIsFromSet is required") });
    }

    public void putSimpleCriterion(final @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterion value) {
        software.amazon.jsii.Kernel.call(this, "putSimpleCriterion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTagCriterion(final @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterion value) {
        software.amazon.jsii.Kernel.call(this, "putTagCriterion", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSimpleCriterion() {
        software.amazon.jsii.Kernel.call(this, "resetSimpleCriterion", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagCriterion() {
        software.amazon.jsii.Kernel.call(this, "resetTagCriterion", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionOutputReference getSimpleCriterion() {
        return software.amazon.jsii.Kernel.get(this, "simpleCriterion", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference getTagCriterion() {
        return software.amazon.jsii.Kernel.get(this, "tagCriterion", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterionOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterion getSimpleCriterionInput() {
        return software.amazon.jsii.Kernel.get(this, "simpleCriterionInput", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndSimpleCriterion.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterion getTagCriterionInput() {
        return software.amazon.jsii.Kernel.get(this, "tagCriterionInput", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAndTagCriterion.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
