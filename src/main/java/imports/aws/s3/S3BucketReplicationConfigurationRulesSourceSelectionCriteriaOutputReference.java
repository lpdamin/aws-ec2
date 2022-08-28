package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.442Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaOutputReference")
public class S3BucketReplicationConfigurationRulesSourceSelectionCriteriaOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketReplicationConfigurationRulesSourceSelectionCriteriaOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketReplicationConfigurationRulesSourceSelectionCriteriaOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketReplicationConfigurationRulesSourceSelectionCriteriaOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putSseKmsEncryptedObjects(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects value) {
        software.amazon.jsii.Kernel.call(this, "putSseKmsEncryptedObjects", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetSseKmsEncryptedObjects() {
        software.amazon.jsii.Kernel.call(this, "resetSseKmsEncryptedObjects", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjectsOutputReference getSseKmsEncryptedObjects() {
        return software.amazon.jsii.Kernel.get(this, "sseKmsEncryptedObjects", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjectsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects getSseKmsEncryptedObjectsInput() {
        return software.amazon.jsii.Kernel.get(this, "sseKmsEncryptedObjectsInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteriaSseKmsEncryptedObjects.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteria getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteria.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRulesSourceSelectionCriteria value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
