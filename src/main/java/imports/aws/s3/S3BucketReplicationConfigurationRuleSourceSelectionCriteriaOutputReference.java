package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.439Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaOutputReference")
public class S3BucketReplicationConfigurationRuleSourceSelectionCriteriaOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected S3BucketReplicationConfigurationRuleSourceSelectionCriteriaOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected S3BucketReplicationConfigurationRuleSourceSelectionCriteriaOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public S3BucketReplicationConfigurationRuleSourceSelectionCriteriaOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putReplicaModifications(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaReplicaModifications value) {
        software.amazon.jsii.Kernel.call(this, "putReplicaModifications", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSseKmsEncryptedObjects(final @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects value) {
        software.amazon.jsii.Kernel.call(this, "putSseKmsEncryptedObjects", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetReplicaModifications() {
        software.amazon.jsii.Kernel.call(this, "resetReplicaModifications", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSseKmsEncryptedObjects() {
        software.amazon.jsii.Kernel.call(this, "resetSseKmsEncryptedObjects", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaReplicaModificationsOutputReference getReplicaModifications() {
        return software.amazon.jsii.Kernel.get(this, "replicaModifications", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaReplicaModificationsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsOutputReference getSseKmsEncryptedObjects() {
        return software.amazon.jsii.Kernel.get(this, "sseKmsEncryptedObjects", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjectsOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaReplicaModifications getReplicaModificationsInput() {
        return software.amazon.jsii.Kernel.get(this, "replicaModificationsInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaReplicaModifications.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects getSseKmsEncryptedObjectsInput() {
        return software.amazon.jsii.Kernel.get(this, "sseKmsEncryptedObjectsInput", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteria getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteria.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.s3.S3BucketReplicationConfigurationRuleSourceSelectionCriteria value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
