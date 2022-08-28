package imports.aws.waf;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:02.093Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.waf.WafWebAclLoggingConfigurationRedactedFieldsOutputReference")
public class WafWebAclLoggingConfigurationRedactedFieldsOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected WafWebAclLoggingConfigurationRedactedFieldsOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafWebAclLoggingConfigurationRedactedFieldsOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public WafWebAclLoggingConfigurationRedactedFieldsOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putFieldToMatch(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putFieldToMatch", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public @org.jetbrains.annotations.NotNull imports.aws.waf.WafWebAclLoggingConfigurationRedactedFieldsFieldToMatchList getFieldToMatch() {
        return software.amazon.jsii.Kernel.get(this, "fieldToMatch", software.amazon.jsii.NativeType.forClass(imports.aws.waf.WafWebAclLoggingConfigurationRedactedFieldsFieldToMatchList.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getFieldToMatchInput() {
        return software.amazon.jsii.Kernel.get(this, "fieldToMatchInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.waf.WafWebAclLoggingConfigurationRedactedFields getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.waf.WafWebAclLoggingConfigurationRedactedFields.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.waf.WafWebAclLoggingConfigurationRedactedFields value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
