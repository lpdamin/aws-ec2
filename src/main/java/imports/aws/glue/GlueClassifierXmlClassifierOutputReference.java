package imports.aws.glue;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.254Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.glue.GlueClassifierXmlClassifierOutputReference")
public class GlueClassifierXmlClassifierOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected GlueClassifierXmlClassifierOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected GlueClassifierXmlClassifierOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public GlueClassifierXmlClassifierOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getClassificationInput() {
        return software.amazon.jsii.Kernel.get(this, "classificationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRowTagInput() {
        return software.amazon.jsii.Kernel.get(this, "rowTagInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getClassification() {
        return software.amazon.jsii.Kernel.get(this, "classification", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setClassification(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "classification", java.util.Objects.requireNonNull(value, "classification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRowTag() {
        return software.amazon.jsii.Kernel.get(this, "rowTag", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRowTag(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rowTag", java.util.Objects.requireNonNull(value, "rowTag is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierXmlClassifier getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.glue.GlueClassifierXmlClassifier.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.glue.GlueClassifierXmlClassifier value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
