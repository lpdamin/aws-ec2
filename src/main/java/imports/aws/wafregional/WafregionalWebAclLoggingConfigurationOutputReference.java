package imports.aws.wafregional;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:02.125Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.wafregional.WafregionalWebAclLoggingConfigurationOutputReference")
public class WafregionalWebAclLoggingConfigurationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected WafregionalWebAclLoggingConfigurationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected WafregionalWebAclLoggingConfigurationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public WafregionalWebAclLoggingConfigurationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putRedactedFields(final @org.jetbrains.annotations.NotNull imports.aws.wafregional.WafregionalWebAclLoggingConfigurationRedactedFields value) {
        software.amazon.jsii.Kernel.call(this, "putRedactedFields", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetRedactedFields() {
        software.amazon.jsii.Kernel.call(this, "resetRedactedFields", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.wafregional.WafregionalWebAclLoggingConfigurationRedactedFieldsOutputReference getRedactedFields() {
        return software.amazon.jsii.Kernel.get(this, "redactedFields", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalWebAclLoggingConfigurationRedactedFieldsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLogDestinationInput() {
        return software.amazon.jsii.Kernel.get(this, "logDestinationInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalWebAclLoggingConfigurationRedactedFields getRedactedFieldsInput() {
        return software.amazon.jsii.Kernel.get(this, "redactedFieldsInput", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalWebAclLoggingConfigurationRedactedFields.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogDestination() {
        return software.amazon.jsii.Kernel.get(this, "logDestination", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogDestination(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logDestination", java.util.Objects.requireNonNull(value, "logDestination is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalWebAclLoggingConfiguration getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.wafregional.WafregionalWebAclLoggingConfiguration.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.wafregional.WafregionalWebAclLoggingConfiguration value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
