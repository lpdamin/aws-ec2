package imports.aws.ses;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.699Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ses.SesEventDestinationSnsDestinationOutputReference")
public class SesEventDestinationSnsDestinationOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected SesEventDestinationSnsDestinationOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesEventDestinationSnsDestinationOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public SesEventDestinationSnsDestinationOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "topicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "topicArn", java.util.Objects.requireNonNull(value, "topicArn is required"));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.ses.SesEventDestinationSnsDestination getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.ses.SesEventDestinationSnsDestination.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.ses.SesEventDestinationSnsDestination value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
