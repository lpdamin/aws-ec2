package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.158Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ComprehendEntityRecognizerInputDataConfigOutputReference")
public class ComprehendEntityRecognizerInputDataConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected ComprehendEntityRecognizerInputDataConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ComprehendEntityRecognizerInputDataConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public ComprehendEntityRecognizerInputDataConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putAnnotations(final @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigAnnotations value) {
        software.amazon.jsii.Kernel.call(this, "putAnnotations", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putAugmentedManifests(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAugmentedManifests", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDocuments(final @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigDocuments value) {
        software.amazon.jsii.Kernel.call(this, "putDocuments", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEntityList(final @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigEntityList value) {
        software.amazon.jsii.Kernel.call(this, "putEntityList", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEntityTypes(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putEntityTypes", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAnnotations() {
        software.amazon.jsii.Kernel.call(this, "resetAnnotations", software.amazon.jsii.NativeType.VOID);
    }

    public void resetAugmentedManifests() {
        software.amazon.jsii.Kernel.call(this, "resetAugmentedManifests", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDataFormat() {
        software.amazon.jsii.Kernel.call(this, "resetDataFormat", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDocuments() {
        software.amazon.jsii.Kernel.call(this, "resetDocuments", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEntityList() {
        software.amazon.jsii.Kernel.call(this, "resetEntityList", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigAnnotationsOutputReference getAnnotations() {
        return software.amazon.jsii.Kernel.get(this, "annotations", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigAnnotationsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigAugmentedManifestsList getAugmentedManifests() {
        return software.amazon.jsii.Kernel.get(this, "augmentedManifests", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigAugmentedManifestsList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigDocumentsOutputReference getDocuments() {
        return software.amazon.jsii.Kernel.get(this, "documents", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigDocumentsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigEntityListOutputReference getEntityList() {
        return software.amazon.jsii.Kernel.get(this, "entityList", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigEntityListOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.ComprehendEntityRecognizerInputDataConfigEntityTypesList getEntityTypes() {
        return software.amazon.jsii.Kernel.get(this, "entityTypes", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigEntityTypesList.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ComprehendEntityRecognizerInputDataConfigAnnotations getAnnotationsInput() {
        return software.amazon.jsii.Kernel.get(this, "annotationsInput", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigAnnotations.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAugmentedManifestsInput() {
        return software.amazon.jsii.Kernel.get(this, "augmentedManifestsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getDataFormatInput() {
        return software.amazon.jsii.Kernel.get(this, "dataFormatInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ComprehendEntityRecognizerInputDataConfigDocuments getDocumentsInput() {
        return software.amazon.jsii.Kernel.get(this, "documentsInput", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigDocuments.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ComprehendEntityRecognizerInputDataConfigEntityList getEntityListInput() {
        return software.amazon.jsii.Kernel.get(this, "entityListInput", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfigEntityList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEntityTypesInput() {
        return software.amazon.jsii.Kernel.get(this, "entityTypesInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getDataFormat() {
        return software.amazon.jsii.Kernel.get(this, "dataFormat", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setDataFormat(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "dataFormat", java.util.Objects.requireNonNull(value, "dataFormat is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ComprehendEntityRecognizerInputDataConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ComprehendEntityRecognizerInputDataConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ComprehendEntityRecognizerInputDataConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
