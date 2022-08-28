package imports.aws.lambdafunction;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping aws_lambda_event_source_mapping}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.719Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMapping")
public class LambdaEventSourceMapping extends com.hashicorp.cdktf.TerraformResource {

    protected LambdaEventSourceMapping(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected LambdaEventSourceMapping(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.lambdafunction.LambdaEventSourceMapping.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping aws_lambda_event_source_mapping} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public LambdaEventSourceMapping(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void putDestinationConfig(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig value) {
        software.amazon.jsii.Kernel.call(this, "putDestinationConfig", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFilterCriteria(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria value) {
        software.amazon.jsii.Kernel.call(this, "putFilterCriteria", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSelfManagedEventSource(final @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource value) {
        software.amazon.jsii.Kernel.call(this, "putSelfManagedEventSource", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSourceAccessConfiguration(final @org.jetbrains.annotations.NotNull java.lang.Object value) {
        software.amazon.jsii.Kernel.call(this, "putSourceAccessConfiguration", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetBatchSize() {
        software.amazon.jsii.Kernel.call(this, "resetBatchSize", software.amazon.jsii.NativeType.VOID);
    }

    public void resetBisectBatchOnFunctionError() {
        software.amazon.jsii.Kernel.call(this, "resetBisectBatchOnFunctionError", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDestinationConfig() {
        software.amazon.jsii.Kernel.call(this, "resetDestinationConfig", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventSourceArn() {
        software.amazon.jsii.Kernel.call(this, "resetEventSourceArn", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFilterCriteria() {
        software.amazon.jsii.Kernel.call(this, "resetFilterCriteria", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFunctionResponseTypes() {
        software.amazon.jsii.Kernel.call(this, "resetFunctionResponseTypes", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumBatchingWindowInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumBatchingWindowInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumRecordAgeInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumRecordAgeInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMaximumRetryAttempts() {
        software.amazon.jsii.Kernel.call(this, "resetMaximumRetryAttempts", software.amazon.jsii.NativeType.VOID);
    }

    public void resetParallelizationFactor() {
        software.amazon.jsii.Kernel.call(this, "resetParallelizationFactor", software.amazon.jsii.NativeType.VOID);
    }

    public void resetQueues() {
        software.amazon.jsii.Kernel.call(this, "resetQueues", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSelfManagedEventSource() {
        software.amazon.jsii.Kernel.call(this, "resetSelfManagedEventSource", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSourceAccessConfiguration() {
        software.amazon.jsii.Kernel.call(this, "resetSourceAccessConfiguration", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartingPosition() {
        software.amazon.jsii.Kernel.call(this, "resetStartingPosition", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStartingPositionTimestamp() {
        software.amazon.jsii.Kernel.call(this, "resetStartingPositionTimestamp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopics() {
        software.amazon.jsii.Kernel.call(this, "resetTopics", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTumblingWindowInSeconds() {
        software.amazon.jsii.Kernel.call(this, "resetTumblingWindowInSeconds", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOutputReference getDestinationConfig() {
        return software.amazon.jsii.Kernel.get(this, "destinationConfig", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfigOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaOutputReference getFilterCriteria() {
        return software.amazon.jsii.Kernel.get(this, "filterCriteria", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteriaOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionArn() {
        return software.amazon.jsii.Kernel.get(this, "functionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastModified() {
        return software.amazon.jsii.Kernel.get(this, "lastModified", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastProcessingResult() {
        return software.amazon.jsii.Kernel.get(this, "lastProcessingResult", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSourceOutputReference getSelfManagedEventSource() {
        return software.amazon.jsii.Kernel.get(this, "selfManagedEventSource", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSourceOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.lambdafunction.LambdaEventSourceMappingSourceAccessConfigurationList getSourceAccessConfiguration() {
        return software.amazon.jsii.Kernel.get(this, "sourceAccessConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingSourceAccessConfigurationList.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getState() {
        return software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStateTransitionReason() {
        return software.amazon.jsii.Kernel.get(this, "stateTransitionReason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUuid() {
        return software.amazon.jsii.Kernel.get(this, "uuid", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getBatchSizeInput() {
        return software.amazon.jsii.Kernel.get(this, "batchSizeInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getBisectBatchOnFunctionErrorInput() {
        return software.amazon.jsii.Kernel.get(this, "bisectBatchOnFunctionErrorInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig getDestinationConfigInput() {
        return software.amazon.jsii.Kernel.get(this, "destinationConfigInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getEventSourceArnInput() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria getFilterCriteriaInput() {
        return software.amazon.jsii.Kernel.get(this, "filterCriteriaInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFunctionNameInput() {
        return software.amazon.jsii.Kernel.get(this, "functionNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFunctionResponseTypesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "functionResponseTypesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumBatchingWindowInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumBatchingWindowInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRecordAgeInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumRecordAgeInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttemptsInput() {
        return software.amazon.jsii.Kernel.get(this, "maximumRetryAttemptsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getParallelizationFactorInput() {
        return software.amazon.jsii.Kernel.get(this, "parallelizationFactorInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getQueuesInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "queuesInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource getSelfManagedEventSourceInput() {
        return software.amazon.jsii.Kernel.get(this, "selfManagedEventSourceInput", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSourceAccessConfigurationInput() {
        return software.amazon.jsii.Kernel.get(this, "sourceAccessConfigurationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStartingPositionInput() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getStartingPositionTimestampInput() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionTimestampInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTopicsInput() {
        return java.util.Optional.ofNullable((java.util.List<java.lang.String>)(software.amazon.jsii.Kernel.get(this, "topicsInput", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))))).map(java.util.Collections::unmodifiableList).orElse(null);
    }

    public @org.jetbrains.annotations.Nullable java.lang.Number getTumblingWindowInSecondsInput() {
        return software.amazon.jsii.Kernel.get(this, "tumblingWindowInSecondsInput", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getBatchSize() {
        return software.amazon.jsii.Kernel.get(this, "batchSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setBatchSize(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "batchSize", java.util.Objects.requireNonNull(value, "batchSize is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getBisectBatchOnFunctionError() {
        return software.amazon.jsii.Kernel.get(this, "bisectBatchOnFunctionError", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setBisectBatchOnFunctionError(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "bisectBatchOnFunctionError", java.util.Objects.requireNonNull(value, "bisectBatchOnFunctionError is required"));
    }

    public void setBisectBatchOnFunctionError(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "bisectBatchOnFunctionError", java.util.Objects.requireNonNull(value, "bisectBatchOnFunctionError is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getEnabled() {
        return software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public void setEnabled(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "enabled", java.util.Objects.requireNonNull(value, "enabled is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getEventSourceArn() {
        return software.amazon.jsii.Kernel.get(this, "eventSourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setEventSourceArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "eventSourceArn", java.util.Objects.requireNonNull(value, "eventSourceArn is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getFunctionName() {
        return software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFunctionName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "functionName", java.util.Objects.requireNonNull(value, "functionName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getFunctionResponseTypes() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "functionResponseTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setFunctionResponseTypes(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "functionResponseTypes", java.util.Objects.requireNonNull(value, "functionResponseTypes is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumBatchingWindowInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumBatchingWindowInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumBatchingWindowInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumBatchingWindowInSeconds", java.util.Objects.requireNonNull(value, "maximumBatchingWindowInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumRecordAgeInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "maximumRecordAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumRecordAgeInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumRecordAgeInSeconds", java.util.Objects.requireNonNull(value, "maximumRecordAgeInSeconds is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getMaximumRetryAttempts() {
        return software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setMaximumRetryAttempts(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "maximumRetryAttempts", java.util.Objects.requireNonNull(value, "maximumRetryAttempts is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getParallelizationFactor() {
        return software.amazon.jsii.Kernel.get(this, "parallelizationFactor", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setParallelizationFactor(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "parallelizationFactor", java.util.Objects.requireNonNull(value, "parallelizationFactor is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getQueues() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "queues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setQueues(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "queues", java.util.Objects.requireNonNull(value, "queues is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStartingPosition() {
        return software.amazon.jsii.Kernel.get(this, "startingPosition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStartingPosition(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "startingPosition", java.util.Objects.requireNonNull(value, "startingPosition is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getStartingPositionTimestamp() {
        return software.amazon.jsii.Kernel.get(this, "startingPositionTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setStartingPositionTimestamp(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "startingPositionTimestamp", java.util.Objects.requireNonNull(value, "startingPositionTimestamp is required"));
    }

    public @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTopics() {
        return java.util.Collections.unmodifiableList(software.amazon.jsii.Kernel.get(this, "topics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class))));
    }

    public void setTopics(final @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> value) {
        software.amazon.jsii.Kernel.set(this, "topics", java.util.Objects.requireNonNull(value, "topics is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Number getTumblingWindowInSeconds() {
        return software.amazon.jsii.Kernel.get(this, "tumblingWindowInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
    }

    public void setTumblingWindowInSeconds(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        software.amazon.jsii.Kernel.set(this, "tumblingWindowInSeconds", java.util.Objects.requireNonNull(value, "tumblingWindowInSeconds is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.lambdafunction.LambdaEventSourceMapping}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.lambdafunction.LambdaEventSourceMapping> {
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
        private final imports.aws.lambdafunction.LambdaEventSourceMappingConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.lambdafunction.LambdaEventSourceMappingConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_name LambdaEventSourceMapping#function_name}.
         * <p>
         * @return {@code this}
         * @param functionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_name LambdaEventSourceMapping#function_name}. This parameter is required.
         */
        public Builder functionName(final java.lang.String functionName) {
            this.config.functionName(functionName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#batch_size LambdaEventSourceMapping#batch_size}.
         * <p>
         * @return {@code this}
         * @param batchSize Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#batch_size LambdaEventSourceMapping#batch_size}. This parameter is required.
         */
        public Builder batchSize(final java.lang.Number batchSize) {
            this.config.batchSize(batchSize);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}.
         * <p>
         * @return {@code this}
         * @param bisectBatchOnFunctionError Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}. This parameter is required.
         */
        public Builder bisectBatchOnFunctionError(final java.lang.Boolean bisectBatchOnFunctionError) {
            this.config.bisectBatchOnFunctionError(bisectBatchOnFunctionError);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}.
         * <p>
         * @return {@code this}
         * @param bisectBatchOnFunctionError Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}. This parameter is required.
         */
        public Builder bisectBatchOnFunctionError(final com.hashicorp.cdktf.IResolvable bisectBatchOnFunctionError) {
            this.config.bisectBatchOnFunctionError(bisectBatchOnFunctionError);
            return this;
        }

        /**
         * destination_config block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#destination_config LambdaEventSourceMapping#destination_config}
         * <p>
         * @return {@code this}
         * @param destinationConfig destination_config block. This parameter is required.
         */
        public Builder destinationConfig(final imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig destinationConfig) {
            this.config.destinationConfig(destinationConfig);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#event_source_arn LambdaEventSourceMapping#event_source_arn}.
         * <p>
         * @return {@code this}
         * @param eventSourceArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#event_source_arn LambdaEventSourceMapping#event_source_arn}. This parameter is required.
         */
        public Builder eventSourceArn(final java.lang.String eventSourceArn) {
            this.config.eventSourceArn(eventSourceArn);
            return this;
        }

        /**
         * filter_criteria block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#filter_criteria LambdaEventSourceMapping#filter_criteria}
         * <p>
         * @return {@code this}
         * @param filterCriteria filter_criteria block. This parameter is required.
         */
        public Builder filterCriteria(final imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria filterCriteria) {
            this.config.filterCriteria(filterCriteria);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_response_types LambdaEventSourceMapping#function_response_types}.
         * <p>
         * @return {@code this}
         * @param functionResponseTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_response_types LambdaEventSourceMapping#function_response_types}. This parameter is required.
         */
        public Builder functionResponseTypes(final java.util.List<java.lang.String> functionResponseTypes) {
            this.config.functionResponseTypes(functionResponseTypes);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#id LambdaEventSourceMapping#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#id LambdaEventSourceMapping#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_batching_window_in_seconds LambdaEventSourceMapping#maximum_batching_window_in_seconds}.
         * <p>
         * @return {@code this}
         * @param maximumBatchingWindowInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_batching_window_in_seconds LambdaEventSourceMapping#maximum_batching_window_in_seconds}. This parameter is required.
         */
        public Builder maximumBatchingWindowInSeconds(final java.lang.Number maximumBatchingWindowInSeconds) {
            this.config.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_record_age_in_seconds LambdaEventSourceMapping#maximum_record_age_in_seconds}.
         * <p>
         * @return {@code this}
         * @param maximumRecordAgeInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_record_age_in_seconds LambdaEventSourceMapping#maximum_record_age_in_seconds}. This parameter is required.
         */
        public Builder maximumRecordAgeInSeconds(final java.lang.Number maximumRecordAgeInSeconds) {
            this.config.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_retry_attempts LambdaEventSourceMapping#maximum_retry_attempts}.
         * <p>
         * @return {@code this}
         * @param maximumRetryAttempts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_retry_attempts LambdaEventSourceMapping#maximum_retry_attempts}. This parameter is required.
         */
        public Builder maximumRetryAttempts(final java.lang.Number maximumRetryAttempts) {
            this.config.maximumRetryAttempts(maximumRetryAttempts);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#parallelization_factor LambdaEventSourceMapping#parallelization_factor}.
         * <p>
         * @return {@code this}
         * @param parallelizationFactor Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#parallelization_factor LambdaEventSourceMapping#parallelization_factor}. This parameter is required.
         */
        public Builder parallelizationFactor(final java.lang.Number parallelizationFactor) {
            this.config.parallelizationFactor(parallelizationFactor);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#queues LambdaEventSourceMapping#queues}.
         * <p>
         * @return {@code this}
         * @param queues Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#queues LambdaEventSourceMapping#queues}. This parameter is required.
         */
        public Builder queues(final java.util.List<java.lang.String> queues) {
            this.config.queues(queues);
            return this;
        }

        /**
         * self_managed_event_source block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#self_managed_event_source LambdaEventSourceMapping#self_managed_event_source}
         * <p>
         * @return {@code this}
         * @param selfManagedEventSource self_managed_event_source block. This parameter is required.
         */
        public Builder selfManagedEventSource(final imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource selfManagedEventSource) {
            this.config.selfManagedEventSource(selfManagedEventSource);
            return this;
        }

        /**
         * source_access_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#source_access_configuration LambdaEventSourceMapping#source_access_configuration}
         * <p>
         * @return {@code this}
         * @param sourceAccessConfiguration source_access_configuration block. This parameter is required.
         */
        public Builder sourceAccessConfiguration(final com.hashicorp.cdktf.IResolvable sourceAccessConfiguration) {
            this.config.sourceAccessConfiguration(sourceAccessConfiguration);
            return this;
        }
        /**
         * source_access_configuration block.
         * <p>
         * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#source_access_configuration LambdaEventSourceMapping#source_access_configuration}
         * <p>
         * @return {@code this}
         * @param sourceAccessConfiguration source_access_configuration block. This parameter is required.
         */
        public Builder sourceAccessConfiguration(final java.util.List<? extends imports.aws.lambdafunction.LambdaEventSourceMappingSourceAccessConfiguration> sourceAccessConfiguration) {
            this.config.sourceAccessConfiguration(sourceAccessConfiguration);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position LambdaEventSourceMapping#starting_position}.
         * <p>
         * @return {@code this}
         * @param startingPosition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position LambdaEventSourceMapping#starting_position}. This parameter is required.
         */
        public Builder startingPosition(final java.lang.String startingPosition) {
            this.config.startingPosition(startingPosition);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position_timestamp LambdaEventSourceMapping#starting_position_timestamp}.
         * <p>
         * @return {@code this}
         * @param startingPositionTimestamp Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position_timestamp LambdaEventSourceMapping#starting_position_timestamp}. This parameter is required.
         */
        public Builder startingPositionTimestamp(final java.lang.String startingPositionTimestamp) {
            this.config.startingPositionTimestamp(startingPositionTimestamp);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#topics LambdaEventSourceMapping#topics}.
         * <p>
         * @return {@code this}
         * @param topics Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#topics LambdaEventSourceMapping#topics}. This parameter is required.
         */
        public Builder topics(final java.util.List<java.lang.String> topics) {
            this.config.topics(topics);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#tumbling_window_in_seconds LambdaEventSourceMapping#tumbling_window_in_seconds}.
         * <p>
         * @return {@code this}
         * @param tumblingWindowInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#tumbling_window_in_seconds LambdaEventSourceMapping#tumbling_window_in_seconds}. This parameter is required.
         */
        public Builder tumblingWindowInSeconds(final java.lang.Number tumblingWindowInSeconds) {
            this.config.tumblingWindowInSeconds(tumblingWindowInSeconds);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.lambdafunction.LambdaEventSourceMapping}.
         */
        @Override
        public imports.aws.lambdafunction.LambdaEventSourceMapping build() {
            return new imports.aws.lambdafunction.LambdaEventSourceMapping(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
