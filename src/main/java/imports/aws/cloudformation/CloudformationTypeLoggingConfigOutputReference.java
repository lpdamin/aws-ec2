package imports.aws.cloudformation;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.925Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.cloudformation.CloudformationTypeLoggingConfigOutputReference")
public class CloudformationTypeLoggingConfigOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected CloudformationTypeLoggingConfigOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected CloudformationTypeLoggingConfigOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public CloudformationTypeLoggingConfigOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLogGroupNameInput() {
        return software.amazon.jsii.Kernel.get(this, "logGroupNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLogRoleArnInput() {
        return software.amazon.jsii.Kernel.get(this, "logRoleArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogGroupName() {
        return software.amazon.jsii.Kernel.get(this, "logGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogGroupName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logGroupName", java.util.Objects.requireNonNull(value, "logGroupName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLogRoleArn() {
        return software.amazon.jsii.Kernel.get(this, "logRoleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLogRoleArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "logRoleArn", java.util.Objects.requireNonNull(value, "logRoleArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.cloudformation.CloudformationTypeLoggingConfig getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.cloudformation.CloudformationTypeLoggingConfig.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.cloudformation.CloudformationTypeLoggingConfig value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
