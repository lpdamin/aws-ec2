package imports.aws.macie2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.793Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.macie2.Macie2ClassificationJobS3JobDefinitionOutputReference")
public class Macie2ClassificationJobS3JobDefinitionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected Macie2ClassificationJobS3JobDefinitionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Macie2ClassificationJobS3JobDefinitionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public Macie2ClassificationJobS3JobDefinitionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putBucketCriteria(final @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteria value) {
        software.amazon.jsii.Kernel.call(this, "putBucketCriteria", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putBucketDefinitions(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putBucketDefinitions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putScoping(final @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionScoping value) {
        software.amazon.jsii.Kernel.call(this, "putScoping", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBucketCriteria() {
        software.amazon.jsii.Kernel.call(this, "resetBucketCriteria", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBucketDefinitions() {
        software.amazon.jsii.Kernel.call(this, "resetBucketDefinitions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetScoping() {
        software.amazon.jsii.Kernel.call(this, "resetScoping", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaOutputReference getBucketCriteria() {
        return software.amazon.jsii.Kernel.get(this, "bucketCriteria", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteriaOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketDefinitionsList getBucketDefinitions() {
        return software.amazon.jsii.Kernel.get(this, "bucketDefinitions", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketDefinitionsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionScopingOutputReference getScoping() {
        return software.amazon.jsii.Kernel.get(this, "scoping", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionScopingOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteria getBucketCriteriaInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketCriteriaInput", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionBucketCriteria.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBucketDefinitionsInput() {
        return software.amazon.jsii.Kernel.get(this, "bucketDefinitionsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionScoping getScopingInput() {
        return software.amazon.jsii.Kernel.get(this, "scopingInput", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinitionScoping.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinition getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.macie2.Macie2ClassificationJobS3JobDefinition.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.macie2.Macie2ClassificationJobS3JobDefinition value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
