package imports.aws.dynamodb;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table aws_dynamodb_table}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:58.509Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.dynamodb.DynamodbTable")
public class DynamodbTable extends com.hashicorp.cdktf.TerraformResource {

    protected DynamodbTable(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected DynamodbTable(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.dynamodb.DynamodbTable.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table aws_dynamodb_table} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public DynamodbTable(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putAttribute(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putAttribute", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putGlobalSecondaryIndex(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putGlobalSecondaryIndex", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLocalSecondaryIndex(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putLocalSecondaryIndex", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putPointInTimeRecovery(final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTablePointInTimeRecovery value) {
        software.amazon.jsii.Kernel.call(this, "putPointInTimeRecovery", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putReplica(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putReplica", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putServerSideEncryption(final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableServerSideEncryption value) {
        software.amazon.jsii.Kernel.call(this, "putServerSideEncryption", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimeouts(final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableTimeouts value) {
        software.amazon.jsii.Kernel.call(this, "putTimeouts", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTtl(final @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableTtl value) {
        software.amazon.jsii.Kernel.call(this, "putTtl", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetAttribute() {
        software.amazon.jsii.Kernel.call(this, "resetAttribute", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBillingMode() {
        software.amazon.jsii.Kernel.call(this, "resetBillingMode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetGlobalSecondaryIndex() {
        software.amazon.jsii.Kernel.call(this, "resetGlobalSecondaryIndex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHashKey() {
        software.amazon.jsii.Kernel.call(this, "resetHashKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLocalSecondaryIndex() {
        software.amazon.jsii.Kernel.call(this, "resetLocalSecondaryIndex", software.amazon.jsii.NativeType.VOID);
    }

    public void resetPointInTimeRecovery() {
        software.amazon.jsii.Kernel.call(this, "resetPointInTimeRecovery", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRangeKey() {
        software.amazon.jsii.Kernel.call(this, "resetRangeKey", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReadCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetReadCapacity", software.amazon.jsii.NativeType.VOID);
    }

    public void resetReplica() {
        software.amazon.jsii.Kernel.call(this, "resetReplica", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestoreDateTime() {
        software.amazon.jsii.Kernel.call(this, "resetRestoreDateTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestoreSourceName() {
        software.amazon.jsii.Kernel.call(this, "resetRestoreSourceName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRestoreToLatestTime() {
        software.amazon.jsii.Kernel.call(this, "resetRestoreToLatestTime", software.amazon.jsii.NativeType.VOID);
    }

    public void resetServerSideEncryption() {
        software.amazon.jsii.Kernel.call(this, "resetServerSideEncryption", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStreamEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetStreamEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStreamViewType() {
        software.amazon.jsii.Kernel.call(this, "resetStreamViewType", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTableClass() {
        software.amazon.jsii.Kernel.call(this, "resetTableClass", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTags() {
        software.amazon.jsii.Kernel.call(this, "resetTags", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTagsAll() {
        software.amazon.jsii.Kernel.call(this, "resetTagsAll", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimeouts() {
        software.amazon.jsii.Kernel.call(this, "resetTimeouts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTtl() {
        software.amazon.jsii.Kernel.call(this, "resetTtl", software.amazon.jsii.NativeType.VOID);
    }

    public void resetWriteCapacity() {
        software.amazon.jsii.Kernel.call(this, "resetWriteCapacity", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableAttributeList getAttribute() {
        return software.amazon.jsii.Kernel.get(this, "attribute", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableAttributeList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableGlobalSecondaryIndexList getGlobalSecondaryIndex() {
        return software.amazon.jsii.Kernel.get(this, "globalSecondaryIndex", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableGlobalSecondaryIndexList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableLocalSecondaryIndexList getLocalSecondaryIndex() {
        return software.amazon.jsii.Kernel.get(this, "localSecondaryIndex", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableLocalSecondaryIndexList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTablePointInTimeRecoveryOutputReference getPointInTimeRecovery() {
        return software.amazon.jsii.Kernel.get(this, "pointInTimeRecovery", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTablePointInTimeRecoveryOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableReplicaList getReplica() {
        return software.amazon.jsii.Kernel.get(this, "replica", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableReplicaList.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableServerSideEncryptionOutputReference getServerSideEncryption() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryption", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableServerSideEncryptionOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamArn() {
        return software.amazon.jsii.Kernel.get(this, "streamArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamLabel() {
        return software.amazon.jsii.Kernel.get(this, "streamLabel", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableTimeoutsOutputReference getTimeouts() {
        return software.amazon.jsii.Kernel.get(this, "timeouts", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableTimeoutsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.dynamodb.DynamodbTableTtlOutputReference getTtl() {
        return software.amazon.jsii.Kernel.get(this, "ttl", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableTtlOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getAttributeInput() {
        return software.amazon.jsii.Kernel.get(this, "attributeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getBillingModeInput() {
        return software.amazon.jsii.Kernel.get(this, "billingModeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getGlobalSecondaryIndexInput() {
        return software.amazon.jsii.Kernel.get(this, "globalSecondaryIndexInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getHashKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "hashKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getLocalSecondaryIndexInput() {
        return software.amazon.jsii.Kernel.get(this, "localSecondaryIndexInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNameInput() {
        return software.amazon.jsii.Kernel.get(this, "nameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dynamodb.DynamodbTablePointInTimeRecovery getPointInTimeRecoveryInput() {
        return software.amazon.jsii.Kernel.get(this, "pointInTimeRecoveryInput", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTablePointInTimeRecovery.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRangeKeyInput() {
        return software.amazon.jsii.Kernel.get(this, "rangeKeyInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getReadCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "readCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getReplicaInput() {
        return software.amazon.jsii.Kernel.get(this, "replicaInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestoreDateTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "restoreDateTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getRestoreSourceNameInput() {
        return software.amazon.jsii.Kernel.get(this, "restoreSourceNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getRestoreToLatestTimeInput() {
        return software.amazon.jsii.Kernel.get(this, "restoreToLatestTimeInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dynamodb.DynamodbTableServerSideEncryption getServerSideEncryptionInput() {
        return software.amazon.jsii.Kernel.get(this, "serverSideEncryptionInput", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableServerSideEncryption.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getStreamEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "streamEnabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStreamViewTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "streamViewTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTableClassInput() {
        return software.amazon.jsii.Kernel.get(this, "tableClassInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsAllInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsAllInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getTagsInput() {
        return java.util.Optional.ofNullable((java.util.Map<java.lang.String, java.lang.String>)(software.amazon.jsii.Kernel.get(this, "tagsInput", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableMap).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getTimeoutsInput() {
        return software.amazon.jsii.Kernel.get(this, "timeoutsInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.dynamodb.DynamodbTableTtl getTtlInput() {
        return software.amazon.jsii.Kernel.get(this, "ttlInput", software.amazon.jsii.NativeType.forClass(imports.aws.dynamodb.DynamodbTableTtl.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getWriteCapacityInput() {
        return software.amazon.jsii.Kernel.get(this, "writeCapacityInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getBillingMode() {
        return software.amazon.jsii.Kernel.get(this, "billingMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setBillingMode(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "billingMode", java.util.Objects.requireNonNull(value, "billingMode is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getHashKey() {
        return software.amazon.jsii.Kernel.get(this, "hashKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setHashKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "hashKey", java.util.Objects.requireNonNull(value, "hashKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getName() {
        return software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "name", java.util.Objects.requireNonNull(value, "name is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRangeKey() {
        return software.amazon.jsii.Kernel.get(this, "rangeKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRangeKey(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "rangeKey", java.util.Objects.requireNonNull(value, "rangeKey is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getReadCapacity() {
        return software.amazon.jsii.Kernel.get(this, "readCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setReadCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "readCapacity", java.util.Objects.requireNonNull(value, "readCapacity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestoreDateTime() {
        return software.amazon.jsii.Kernel.get(this, "restoreDateTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestoreDateTime(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restoreDateTime", java.util.Objects.requireNonNull(value, "restoreDateTime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getRestoreSourceName() {
        return software.amazon.jsii.Kernel.get(this, "restoreSourceName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setRestoreSourceName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "restoreSourceName", java.util.Objects.requireNonNull(value, "restoreSourceName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getRestoreToLatestTime() {
        return software.amazon.jsii.Kernel.get(this, "restoreToLatestTime", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setRestoreToLatestTime(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "restoreToLatestTime", java.util.Objects.requireNonNull(value, "restoreToLatestTime is required"));
    }

    public void setRestoreToLatestTime(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "restoreToLatestTime", java.util.Objects.requireNonNull(value, "restoreToLatestTime is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getStreamEnabled() {
        return software.amazon.jsii.Kernel.get(this, "streamEnabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setStreamEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "streamEnabled", java.util.Objects.requireNonNull(value, "streamEnabled is required"));
    }

    public void setStreamEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "streamEnabled", java.util.Objects.requireNonNull(value, "streamEnabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStreamViewType() {
        return software.amazon.jsii.Kernel.get(this, "streamViewType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStreamViewType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "streamViewType", java.util.Objects.requireNonNull(value, "streamViewType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTableClass() {
        return software.amazon.jsii.Kernel.get(this, "tableClass", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTableClass(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "tableClass", java.util.Objects.requireNonNull(value, "tableClass is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTags() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tags", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTags(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tags", java.util.Objects.requireNonNull(value, "tags is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> getTagsAll() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.get(this, "tagsAll", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTagsAll(final @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "tagsAll", java.util.Objects.requireNonNull(value, "tagsAll is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getWriteCapacity() {
        return software.amazon.jsii.Kernel.get(this, "writeCapacity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setWriteCapacity(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "writeCapacity", java.util.Objects.requireNonNull(value, "writeCapacity is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.dynamodb.DynamodbTable}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.dynamodb.DynamodbTable> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope The scope in which to define this construct. This parameter is required.
         * @param id The scoped construct ID. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.aws.dynamodb.DynamodbTableConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.dynamodb.DynamodbTableConfig.Builder();
        }

        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }
        /**
         * @return {@code this}
         * @param connection This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(final com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.config.connection(connection);
            return this;
        }

        /**
         * @return {@code this}
         * @param count This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(final java.lang.Number count) {
            this.config.count(count);
            return this;
        }

        /**
         * @return {@code this}
         * @param dependsOn This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder dependsOn(final java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.config.dependsOn(dependsOn);
            return this;
        }

        /**
         * @return {@code this}
         * @param forEach This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(final com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.config.forEach(forEach);
            return this;
        }

        /**
         * @return {@code this}
         * @param lifecycle This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.config.lifecycle(lifecycle);
            return this;
        }

        /**
         * @return {@code this}
         * @param provider This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(final com.hashicorp.cdktf.TerraformProvider provider) {
            this.config.provider(provider);
            return this;
        }

        /**
         * @return {@code this}
         * @param provisioners This parameter is required.
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provisioners(final java.util.List<? extends java.lang.Object> provisioners) {
            this.config.provisioners(provisioners);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#name DynamodbTable#name}.
         * <p>
         * @return {@code this}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#name DynamodbTable#name}. This parameter is required.
         */
        public Builder name(final java.lang.String name) {
            this.config.name(name);
            return this;
        }

        /**
         * attribute block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#attribute DynamodbTable#attribute}
         * <p>
         * @return {@code this}
         * @param attribute attribute block. This parameter is required.
         */
        public Builder attribute(final com.hashicorp.cdktf.IResolvable attribute) {
            this.config.attribute(attribute);
            return this;
        }
        /**
         * attribute block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#attribute DynamodbTable#attribute}
         * <p>
         * @return {@code this}
         * @param attribute attribute block. This parameter is required.
         */
        public Builder attribute(final java.util.List<? extends imports.aws.dynamodb.DynamodbTableAttribute> attribute) {
            this.config.attribute(attribute);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#billing_mode DynamodbTable#billing_mode}.
         * <p>
         * @return {@code this}
         * @param billingMode Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#billing_mode DynamodbTable#billing_mode}. This parameter is required.
         */
        public Builder billingMode(final java.lang.String billingMode) {
            this.config.billingMode(billingMode);
            return this;
        }

        /**
         * global_secondary_index block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#global_secondary_index DynamodbTable#global_secondary_index}
         * <p>
         * @return {@code this}
         * @param globalSecondaryIndex global_secondary_index block. This parameter is required.
         */
        public Builder globalSecondaryIndex(final com.hashicorp.cdktf.IResolvable globalSecondaryIndex) {
            this.config.globalSecondaryIndex(globalSecondaryIndex);
            return this;
        }
        /**
         * global_secondary_index block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#global_secondary_index DynamodbTable#global_secondary_index}
         * <p>
         * @return {@code this}
         * @param globalSecondaryIndex global_secondary_index block. This parameter is required.
         */
        public Builder globalSecondaryIndex(final java.util.List<? extends imports.aws.dynamodb.DynamodbTableGlobalSecondaryIndex> globalSecondaryIndex) {
            this.config.globalSecondaryIndex(globalSecondaryIndex);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#hash_key DynamodbTable#hash_key}.
         * <p>
         * @return {@code this}
         * @param hashKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#hash_key DynamodbTable#hash_key}. This parameter is required.
         */
        public Builder hashKey(final java.lang.String hashKey) {
            this.config.hashKey(hashKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#id DynamodbTable#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#id DynamodbTable#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * local_secondary_index block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#local_secondary_index DynamodbTable#local_secondary_index}
         * <p>
         * @return {@code this}
         * @param localSecondaryIndex local_secondary_index block. This parameter is required.
         */
        public Builder localSecondaryIndex(final com.hashicorp.cdktf.IResolvable localSecondaryIndex) {
            this.config.localSecondaryIndex(localSecondaryIndex);
            return this;
        }
        /**
         * local_secondary_index block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#local_secondary_index DynamodbTable#local_secondary_index}
         * <p>
         * @return {@code this}
         * @param localSecondaryIndex local_secondary_index block. This parameter is required.
         */
        public Builder localSecondaryIndex(final java.util.List<? extends imports.aws.dynamodb.DynamodbTableLocalSecondaryIndex> localSecondaryIndex) {
            this.config.localSecondaryIndex(localSecondaryIndex);
            return this;
        }

        /**
         * point_in_time_recovery block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#point_in_time_recovery DynamodbTable#point_in_time_recovery}
         * <p>
         * @return {@code this}
         * @param pointInTimeRecovery point_in_time_recovery block. This parameter is required.
         */
        public Builder pointInTimeRecovery(final imports.aws.dynamodb.DynamodbTablePointInTimeRecovery pointInTimeRecovery) {
            this.config.pointInTimeRecovery(pointInTimeRecovery);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#range_key DynamodbTable#range_key}.
         * <p>
         * @return {@code this}
         * @param rangeKey Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#range_key DynamodbTable#range_key}. This parameter is required.
         */
        public Builder rangeKey(final java.lang.String rangeKey) {
            this.config.rangeKey(rangeKey);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#read_capacity DynamodbTable#read_capacity}.
         * <p>
         * @return {@code this}
         * @param readCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#read_capacity DynamodbTable#read_capacity}. This parameter is required.
         */
        public Builder readCapacity(final java.lang.Number readCapacity) {
            this.config.readCapacity(readCapacity);
            return this;
        }

        /**
         * replica block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#replica DynamodbTable#replica}
         * <p>
         * @return {@code this}
         * @param replica replica block. This parameter is required.
         */
        public Builder replica(final com.hashicorp.cdktf.IResolvable replica) {
            this.config.replica(replica);
            return this;
        }
        /**
         * replica block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#replica DynamodbTable#replica}
         * <p>
         * @return {@code this}
         * @param replica replica block. This parameter is required.
         */
        public Builder replica(final java.util.List<? extends imports.aws.dynamodb.DynamodbTableReplica> replica) {
            this.config.replica(replica);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_date_time DynamodbTable#restore_date_time}.
         * <p>
         * @return {@code this}
         * @param restoreDateTime Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_date_time DynamodbTable#restore_date_time}. This parameter is required.
         */
        public Builder restoreDateTime(final java.lang.String restoreDateTime) {
            this.config.restoreDateTime(restoreDateTime);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_source_name DynamodbTable#restore_source_name}.
         * <p>
         * @return {@code this}
         * @param restoreSourceName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_source_name DynamodbTable#restore_source_name}. This parameter is required.
         */
        public Builder restoreSourceName(final java.lang.String restoreSourceName) {
            this.config.restoreSourceName(restoreSourceName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_to_latest_time DynamodbTable#restore_to_latest_time}.
         * <p>
         * @return {@code this}
         * @param restoreToLatestTime Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_to_latest_time DynamodbTable#restore_to_latest_time}. This parameter is required.
         */
        public Builder restoreToLatestTime(final java.lang.Boolean restoreToLatestTime) {
            this.config.restoreToLatestTime(restoreToLatestTime);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_to_latest_time DynamodbTable#restore_to_latest_time}.
         * <p>
         * @return {@code this}
         * @param restoreToLatestTime Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#restore_to_latest_time DynamodbTable#restore_to_latest_time}. This parameter is required.
         */
        public Builder restoreToLatestTime(final com.hashicorp.cdktf.IResolvable restoreToLatestTime) {
            this.config.restoreToLatestTime(restoreToLatestTime);
            return this;
        }

        /**
         * server_side_encryption block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#server_side_encryption DynamodbTable#server_side_encryption}
         * <p>
         * @return {@code this}
         * @param serverSideEncryption server_side_encryption block. This parameter is required.
         */
        public Builder serverSideEncryption(final imports.aws.dynamodb.DynamodbTableServerSideEncryption serverSideEncryption) {
            this.config.serverSideEncryption(serverSideEncryption);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#stream_enabled DynamodbTable#stream_enabled}.
         * <p>
         * @return {@code this}
         * @param streamEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#stream_enabled DynamodbTable#stream_enabled}. This parameter is required.
         */
        public Builder streamEnabled(final java.lang.Boolean streamEnabled) {
            this.config.streamEnabled(streamEnabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#stream_enabled DynamodbTable#stream_enabled}.
         * <p>
         * @return {@code this}
         * @param streamEnabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#stream_enabled DynamodbTable#stream_enabled}. This parameter is required.
         */
        public Builder streamEnabled(final com.hashicorp.cdktf.IResolvable streamEnabled) {
            this.config.streamEnabled(streamEnabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#stream_view_type DynamodbTable#stream_view_type}.
         * <p>
         * @return {@code this}
         * @param streamViewType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#stream_view_type DynamodbTable#stream_view_type}. This parameter is required.
         */
        public Builder streamViewType(final java.lang.String streamViewType) {
            this.config.streamViewType(streamViewType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#table_class DynamodbTable#table_class}.
         * <p>
         * @return {@code this}
         * @param tableClass Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#table_class DynamodbTable#table_class}. This parameter is required.
         */
        public Builder tableClass(final java.lang.String tableClass) {
            this.config.tableClass(tableClass);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#tags DynamodbTable#tags}.
         * <p>
         * @return {@code this}
         * @param tags Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#tags DynamodbTable#tags}. This parameter is required.
         */
        public Builder tags(final java.util.Map<java.lang.String, java.lang.String> tags) {
            this.config.tags(tags);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#tags_all DynamodbTable#tags_all}.
         * <p>
         * @return {@code this}
         * @param tagsAll Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#tags_all DynamodbTable#tags_all}. This parameter is required.
         */
        public Builder tagsAll(final java.util.Map<java.lang.String, java.lang.String> tagsAll) {
            this.config.tagsAll(tagsAll);
            return this;
        }

        /**
         * timeouts block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#timeouts DynamodbTable#timeouts}
         * <p>
         * @return {@code this}
         * @param timeouts timeouts block. This parameter is required.
         */
        public Builder timeouts(final imports.aws.dynamodb.DynamodbTableTimeouts timeouts) {
            this.config.timeouts(timeouts);
            return this;
        }

        /**
         * ttl block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#ttl DynamodbTable#ttl}
         * <p>
         * @return {@code this}
         * @param ttl ttl block. This parameter is required.
         */
        public Builder ttl(final imports.aws.dynamodb.DynamodbTableTtl ttl) {
            this.config.ttl(ttl);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#write_capacity DynamodbTable#write_capacity}.
         * <p>
         * @return {@code this}
         * @param writeCapacity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/dynamodb_table#write_capacity DynamodbTable#write_capacity}. This parameter is required.
         */
        public Builder writeCapacity(final java.lang.Number writeCapacity) {
            this.config.writeCapacity(writeCapacity);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.dynamodb.DynamodbTable}.
         */
        @Override
        public imports.aws.dynamodb.DynamodbTable build() {
            return new imports.aws.dynamodb.DynamodbTable(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
