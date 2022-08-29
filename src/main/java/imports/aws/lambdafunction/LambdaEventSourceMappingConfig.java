package imports.aws.lambdafunction;

/**
 * AWS Lambda.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.778Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaEventSourceMappingConfig")
@software.amazon.jsii.Jsii.Proxy(LambdaEventSourceMappingConfig.Jsii$Proxy.class)
public interface LambdaEventSourceMappingConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_name LambdaEventSourceMapping#function_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFunctionName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#batch_size LambdaEventSourceMapping#batch_size}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBatchSize() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getBisectBatchOnFunctionError() {
        return null;
    }

    /**
     * destination_config block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#destination_config LambdaEventSourceMapping#destination_config}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig getDestinationConfig() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#event_source_arn LambdaEventSourceMapping#event_source_arn}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEventSourceArn() {
        return null;
    }

    /**
     * filter_criteria block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#filter_criteria LambdaEventSourceMapping#filter_criteria}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria getFilterCriteria() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_response_types LambdaEventSourceMapping#function_response_types}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFunctionResponseTypes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#id LambdaEventSourceMapping#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_batching_window_in_seconds LambdaEventSourceMapping#maximum_batching_window_in_seconds}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumBatchingWindowInSeconds() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_record_age_in_seconds LambdaEventSourceMapping#maximum_record_age_in_seconds}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRecordAgeInSeconds() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_retry_attempts LambdaEventSourceMapping#maximum_retry_attempts}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaximumRetryAttempts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#parallelization_factor LambdaEventSourceMapping#parallelization_factor}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getParallelizationFactor() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#queues LambdaEventSourceMapping#queues}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getQueues() {
        return null;
    }

    /**
     * self_managed_event_source block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#self_managed_event_source LambdaEventSourceMapping#self_managed_event_source}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource getSelfManagedEventSource() {
        return null;
    }

    /**
     * source_access_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#source_access_configuration LambdaEventSourceMapping#source_access_configuration}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSourceAccessConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position LambdaEventSourceMapping#starting_position}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStartingPosition() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position_timestamp LambdaEventSourceMapping#starting_position_timestamp}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStartingPositionTimestamp() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#topics LambdaEventSourceMapping#topics}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTopics() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#tumbling_window_in_seconds LambdaEventSourceMapping#tumbling_window_in_seconds}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTumblingWindowInSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LambdaEventSourceMappingConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaEventSourceMappingConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaEventSourceMappingConfig> {
        java.lang.String functionName;
        java.lang.Number batchSize;
        java.lang.Object bisectBatchOnFunctionError;
        imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig destinationConfig;
        java.lang.Object enabled;
        java.lang.String eventSourceArn;
        imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria filterCriteria;
        java.util.List<java.lang.String> functionResponseTypes;
        java.lang.String id;
        java.lang.Number maximumBatchingWindowInSeconds;
        java.lang.Number maximumRecordAgeInSeconds;
        java.lang.Number maximumRetryAttempts;
        java.lang.Number parallelizationFactor;
        java.util.List<java.lang.String> queues;
        imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource selfManagedEventSource;
        java.lang.Object sourceAccessConfiguration;
        java.lang.String startingPosition;
        java.lang.String startingPositionTimestamp;
        java.util.List<java.lang.String> topics;
        java.lang.Number tumblingWindowInSeconds;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getFunctionName}
         * @param functionName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_name LambdaEventSourceMapping#function_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder functionName(java.lang.String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getBatchSize}
         * @param batchSize Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#batch_size LambdaEventSourceMapping#batch_size}.
         * @return {@code this}
         */
        public Builder batchSize(java.lang.Number batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getBisectBatchOnFunctionError}
         * @param bisectBatchOnFunctionError Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}.
         * @return {@code this}
         */
        public Builder bisectBatchOnFunctionError(java.lang.Boolean bisectBatchOnFunctionError) {
            this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getBisectBatchOnFunctionError}
         * @param bisectBatchOnFunctionError Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#bisect_batch_on_function_error LambdaEventSourceMapping#bisect_batch_on_function_error}.
         * @return {@code this}
         */
        public Builder bisectBatchOnFunctionError(com.hashicorp.cdktf.IResolvable bisectBatchOnFunctionError) {
            this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getDestinationConfig}
         * @param destinationConfig destination_config block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#destination_config LambdaEventSourceMapping#destination_config}
         * @return {@code this}
         */
        public Builder destinationConfig(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig destinationConfig) {
            this.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#enabled LambdaEventSourceMapping#enabled}.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getEventSourceArn}
         * @param eventSourceArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#event_source_arn LambdaEventSourceMapping#event_source_arn}.
         * @return {@code this}
         */
        public Builder eventSourceArn(java.lang.String eventSourceArn) {
            this.eventSourceArn = eventSourceArn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getFilterCriteria}
         * @param filterCriteria filter_criteria block.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#filter_criteria LambdaEventSourceMapping#filter_criteria}
         * @return {@code this}
         */
        public Builder filterCriteria(imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria filterCriteria) {
            this.filterCriteria = filterCriteria;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getFunctionResponseTypes}
         * @param functionResponseTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#function_response_types LambdaEventSourceMapping#function_response_types}.
         * @return {@code this}
         */
        public Builder functionResponseTypes(java.util.List<java.lang.String> functionResponseTypes) {
            this.functionResponseTypes = functionResponseTypes;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#id LambdaEventSourceMapping#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getMaximumBatchingWindowInSeconds}
         * @param maximumBatchingWindowInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_batching_window_in_seconds LambdaEventSourceMapping#maximum_batching_window_in_seconds}.
         * @return {@code this}
         */
        public Builder maximumBatchingWindowInSeconds(java.lang.Number maximumBatchingWindowInSeconds) {
            this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getMaximumRecordAgeInSeconds}
         * @param maximumRecordAgeInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_record_age_in_seconds LambdaEventSourceMapping#maximum_record_age_in_seconds}.
         * @return {@code this}
         */
        public Builder maximumRecordAgeInSeconds(java.lang.Number maximumRecordAgeInSeconds) {
            this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getMaximumRetryAttempts}
         * @param maximumRetryAttempts Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#maximum_retry_attempts LambdaEventSourceMapping#maximum_retry_attempts}.
         * @return {@code this}
         */
        public Builder maximumRetryAttempts(java.lang.Number maximumRetryAttempts) {
            this.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getParallelizationFactor}
         * @param parallelizationFactor Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#parallelization_factor LambdaEventSourceMapping#parallelization_factor}.
         * @return {@code this}
         */
        public Builder parallelizationFactor(java.lang.Number parallelizationFactor) {
            this.parallelizationFactor = parallelizationFactor;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getQueues}
         * @param queues Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#queues LambdaEventSourceMapping#queues}.
         * @return {@code this}
         */
        public Builder queues(java.util.List<java.lang.String> queues) {
            this.queues = queues;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getSelfManagedEventSource}
         * @param selfManagedEventSource self_managed_event_source block.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#self_managed_event_source LambdaEventSourceMapping#self_managed_event_source}
         * @return {@code this}
         */
        public Builder selfManagedEventSource(imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource selfManagedEventSource) {
            this.selfManagedEventSource = selfManagedEventSource;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getSourceAccessConfiguration}
         * @param sourceAccessConfiguration source_access_configuration block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#source_access_configuration LambdaEventSourceMapping#source_access_configuration}
         * @return {@code this}
         */
        public Builder sourceAccessConfiguration(com.hashicorp.cdktf.IResolvable sourceAccessConfiguration) {
            this.sourceAccessConfiguration = sourceAccessConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getSourceAccessConfiguration}
         * @param sourceAccessConfiguration source_access_configuration block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#source_access_configuration LambdaEventSourceMapping#source_access_configuration}
         * @return {@code this}
         */
        public Builder sourceAccessConfiguration(java.util.List<? extends imports.aws.lambdafunction.LambdaEventSourceMappingSourceAccessConfiguration> sourceAccessConfiguration) {
            this.sourceAccessConfiguration = sourceAccessConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getStartingPosition}
         * @param startingPosition Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position LambdaEventSourceMapping#starting_position}.
         * @return {@code this}
         */
        public Builder startingPosition(java.lang.String startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getStartingPositionTimestamp}
         * @param startingPositionTimestamp Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#starting_position_timestamp LambdaEventSourceMapping#starting_position_timestamp}.
         * @return {@code this}
         */
        public Builder startingPositionTimestamp(java.lang.String startingPositionTimestamp) {
            this.startingPositionTimestamp = startingPositionTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getTopics}
         * @param topics Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#topics LambdaEventSourceMapping#topics}.
         * @return {@code this}
         */
        public Builder topics(java.util.List<java.lang.String> topics) {
            this.topics = topics;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getTumblingWindowInSeconds}
         * @param tumblingWindowInSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_event_source_mapping#tumbling_window_in_seconds LambdaEventSourceMapping#tumbling_window_in_seconds}.
         * @return {@code this}
         */
        public Builder tumblingWindowInSeconds(java.lang.Number tumblingWindowInSeconds) {
            this.tumblingWindowInSeconds = tumblingWindowInSeconds;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link LambdaEventSourceMappingConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaEventSourceMappingConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaEventSourceMappingConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaEventSourceMappingConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaEventSourceMappingConfig {
        private final java.lang.String functionName;
        private final java.lang.Number batchSize;
        private final java.lang.Object bisectBatchOnFunctionError;
        private final imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig destinationConfig;
        private final java.lang.Object enabled;
        private final java.lang.String eventSourceArn;
        private final imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria filterCriteria;
        private final java.util.List<java.lang.String> functionResponseTypes;
        private final java.lang.String id;
        private final java.lang.Number maximumBatchingWindowInSeconds;
        private final java.lang.Number maximumRecordAgeInSeconds;
        private final java.lang.Number maximumRetryAttempts;
        private final java.lang.Number parallelizationFactor;
        private final java.util.List<java.lang.String> queues;
        private final imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource selfManagedEventSource;
        private final java.lang.Object sourceAccessConfiguration;
        private final java.lang.String startingPosition;
        private final java.lang.String startingPositionTimestamp;
        private final java.util.List<java.lang.String> topics;
        private final java.lang.Number tumblingWindowInSeconds;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.functionName = software.amazon.jsii.Kernel.get(this, "functionName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.batchSize = software.amazon.jsii.Kernel.get(this, "batchSize", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.bisectBatchOnFunctionError = software.amazon.jsii.Kernel.get(this, "bisectBatchOnFunctionError", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.destinationConfig = software.amazon.jsii.Kernel.get(this, "destinationConfig", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig.class));
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.eventSourceArn = software.amazon.jsii.Kernel.get(this, "eventSourceArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filterCriteria = software.amazon.jsii.Kernel.get(this, "filterCriteria", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria.class));
            this.functionResponseTypes = software.amazon.jsii.Kernel.get(this, "functionResponseTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.maximumBatchingWindowInSeconds = software.amazon.jsii.Kernel.get(this, "maximumBatchingWindowInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maximumRecordAgeInSeconds = software.amazon.jsii.Kernel.get(this, "maximumRecordAgeInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.maximumRetryAttempts = software.amazon.jsii.Kernel.get(this, "maximumRetryAttempts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.parallelizationFactor = software.amazon.jsii.Kernel.get(this, "parallelizationFactor", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.queues = software.amazon.jsii.Kernel.get(this, "queues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.selfManagedEventSource = software.amazon.jsii.Kernel.get(this, "selfManagedEventSource", software.amazon.jsii.NativeType.forClass(imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource.class));
            this.sourceAccessConfiguration = software.amazon.jsii.Kernel.get(this, "sourceAccessConfiguration", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.startingPosition = software.amazon.jsii.Kernel.get(this, "startingPosition", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startingPositionTimestamp = software.amazon.jsii.Kernel.get(this, "startingPositionTimestamp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.topics = software.amazon.jsii.Kernel.get(this, "topics", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tumblingWindowInSeconds = software.amazon.jsii.Kernel.get(this, "tumblingWindowInSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.functionName = java.util.Objects.requireNonNull(builder.functionName, "functionName is required");
            this.batchSize = builder.batchSize;
            this.bisectBatchOnFunctionError = builder.bisectBatchOnFunctionError;
            this.destinationConfig = builder.destinationConfig;
            this.enabled = builder.enabled;
            this.eventSourceArn = builder.eventSourceArn;
            this.filterCriteria = builder.filterCriteria;
            this.functionResponseTypes = builder.functionResponseTypes;
            this.id = builder.id;
            this.maximumBatchingWindowInSeconds = builder.maximumBatchingWindowInSeconds;
            this.maximumRecordAgeInSeconds = builder.maximumRecordAgeInSeconds;
            this.maximumRetryAttempts = builder.maximumRetryAttempts;
            this.parallelizationFactor = builder.parallelizationFactor;
            this.queues = builder.queues;
            this.selfManagedEventSource = builder.selfManagedEventSource;
            this.sourceAccessConfiguration = builder.sourceAccessConfiguration;
            this.startingPosition = builder.startingPosition;
            this.startingPositionTimestamp = builder.startingPositionTimestamp;
            this.topics = builder.topics;
            this.tumblingWindowInSeconds = builder.tumblingWindowInSeconds;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getFunctionName() {
            return this.functionName;
        }

        @Override
        public final java.lang.Number getBatchSize() {
            return this.batchSize;
        }

        @Override
        public final java.lang.Object getBisectBatchOnFunctionError() {
            return this.bisectBatchOnFunctionError;
        }

        @Override
        public final imports.aws.lambdafunction.LambdaEventSourceMappingDestinationConfig getDestinationConfig() {
            return this.destinationConfig;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.String getEventSourceArn() {
            return this.eventSourceArn;
        }

        @Override
        public final imports.aws.lambdafunction.LambdaEventSourceMappingFilterCriteria getFilterCriteria() {
            return this.filterCriteria;
        }

        @Override
        public final java.util.List<java.lang.String> getFunctionResponseTypes() {
            return this.functionResponseTypes;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Number getMaximumBatchingWindowInSeconds() {
            return this.maximumBatchingWindowInSeconds;
        }

        @Override
        public final java.lang.Number getMaximumRecordAgeInSeconds() {
            return this.maximumRecordAgeInSeconds;
        }

        @Override
        public final java.lang.Number getMaximumRetryAttempts() {
            return this.maximumRetryAttempts;
        }

        @Override
        public final java.lang.Number getParallelizationFactor() {
            return this.parallelizationFactor;
        }

        @Override
        public final java.util.List<java.lang.String> getQueues() {
            return this.queues;
        }

        @Override
        public final imports.aws.lambdafunction.LambdaEventSourceMappingSelfManagedEventSource getSelfManagedEventSource() {
            return this.selfManagedEventSource;
        }

        @Override
        public final java.lang.Object getSourceAccessConfiguration() {
            return this.sourceAccessConfiguration;
        }

        @Override
        public final java.lang.String getStartingPosition() {
            return this.startingPosition;
        }

        @Override
        public final java.lang.String getStartingPositionTimestamp() {
            return this.startingPositionTimestamp;
        }

        @Override
        public final java.util.List<java.lang.String> getTopics() {
            return this.topics;
        }

        @Override
        public final java.lang.Number getTumblingWindowInSeconds() {
            return this.tumblingWindowInSeconds;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("functionName", om.valueToTree(this.getFunctionName()));
            if (this.getBatchSize() != null) {
                data.set("batchSize", om.valueToTree(this.getBatchSize()));
            }
            if (this.getBisectBatchOnFunctionError() != null) {
                data.set("bisectBatchOnFunctionError", om.valueToTree(this.getBisectBatchOnFunctionError()));
            }
            if (this.getDestinationConfig() != null) {
                data.set("destinationConfig", om.valueToTree(this.getDestinationConfig()));
            }
            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getEventSourceArn() != null) {
                data.set("eventSourceArn", om.valueToTree(this.getEventSourceArn()));
            }
            if (this.getFilterCriteria() != null) {
                data.set("filterCriteria", om.valueToTree(this.getFilterCriteria()));
            }
            if (this.getFunctionResponseTypes() != null) {
                data.set("functionResponseTypes", om.valueToTree(this.getFunctionResponseTypes()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getMaximumBatchingWindowInSeconds() != null) {
                data.set("maximumBatchingWindowInSeconds", om.valueToTree(this.getMaximumBatchingWindowInSeconds()));
            }
            if (this.getMaximumRecordAgeInSeconds() != null) {
                data.set("maximumRecordAgeInSeconds", om.valueToTree(this.getMaximumRecordAgeInSeconds()));
            }
            if (this.getMaximumRetryAttempts() != null) {
                data.set("maximumRetryAttempts", om.valueToTree(this.getMaximumRetryAttempts()));
            }
            if (this.getParallelizationFactor() != null) {
                data.set("parallelizationFactor", om.valueToTree(this.getParallelizationFactor()));
            }
            if (this.getQueues() != null) {
                data.set("queues", om.valueToTree(this.getQueues()));
            }
            if (this.getSelfManagedEventSource() != null) {
                data.set("selfManagedEventSource", om.valueToTree(this.getSelfManagedEventSource()));
            }
            if (this.getSourceAccessConfiguration() != null) {
                data.set("sourceAccessConfiguration", om.valueToTree(this.getSourceAccessConfiguration()));
            }
            if (this.getStartingPosition() != null) {
                data.set("startingPosition", om.valueToTree(this.getStartingPosition()));
            }
            if (this.getStartingPositionTimestamp() != null) {
                data.set("startingPositionTimestamp", om.valueToTree(this.getStartingPositionTimestamp()));
            }
            if (this.getTopics() != null) {
                data.set("topics", om.valueToTree(this.getTopics()));
            }
            if (this.getTumblingWindowInSeconds() != null) {
                data.set("tumblingWindowInSeconds", om.valueToTree(this.getTumblingWindowInSeconds()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lambdafunction.LambdaEventSourceMappingConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaEventSourceMappingConfig.Jsii$Proxy that = (LambdaEventSourceMappingConfig.Jsii$Proxy) o;

            if (!functionName.equals(that.functionName)) return false;
            if (this.batchSize != null ? !this.batchSize.equals(that.batchSize) : that.batchSize != null) return false;
            if (this.bisectBatchOnFunctionError != null ? !this.bisectBatchOnFunctionError.equals(that.bisectBatchOnFunctionError) : that.bisectBatchOnFunctionError != null) return false;
            if (this.destinationConfig != null ? !this.destinationConfig.equals(that.destinationConfig) : that.destinationConfig != null) return false;
            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            if (this.eventSourceArn != null ? !this.eventSourceArn.equals(that.eventSourceArn) : that.eventSourceArn != null) return false;
            if (this.filterCriteria != null ? !this.filterCriteria.equals(that.filterCriteria) : that.filterCriteria != null) return false;
            if (this.functionResponseTypes != null ? !this.functionResponseTypes.equals(that.functionResponseTypes) : that.functionResponseTypes != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.maximumBatchingWindowInSeconds != null ? !this.maximumBatchingWindowInSeconds.equals(that.maximumBatchingWindowInSeconds) : that.maximumBatchingWindowInSeconds != null) return false;
            if (this.maximumRecordAgeInSeconds != null ? !this.maximumRecordAgeInSeconds.equals(that.maximumRecordAgeInSeconds) : that.maximumRecordAgeInSeconds != null) return false;
            if (this.maximumRetryAttempts != null ? !this.maximumRetryAttempts.equals(that.maximumRetryAttempts) : that.maximumRetryAttempts != null) return false;
            if (this.parallelizationFactor != null ? !this.parallelizationFactor.equals(that.parallelizationFactor) : that.parallelizationFactor != null) return false;
            if (this.queues != null ? !this.queues.equals(that.queues) : that.queues != null) return false;
            if (this.selfManagedEventSource != null ? !this.selfManagedEventSource.equals(that.selfManagedEventSource) : that.selfManagedEventSource != null) return false;
            if (this.sourceAccessConfiguration != null ? !this.sourceAccessConfiguration.equals(that.sourceAccessConfiguration) : that.sourceAccessConfiguration != null) return false;
            if (this.startingPosition != null ? !this.startingPosition.equals(that.startingPosition) : that.startingPosition != null) return false;
            if (this.startingPositionTimestamp != null ? !this.startingPositionTimestamp.equals(that.startingPositionTimestamp) : that.startingPositionTimestamp != null) return false;
            if (this.topics != null ? !this.topics.equals(that.topics) : that.topics != null) return false;
            if (this.tumblingWindowInSeconds != null ? !this.tumblingWindowInSeconds.equals(that.tumblingWindowInSeconds) : that.tumblingWindowInSeconds != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.functionName.hashCode();
            result = 31 * result + (this.batchSize != null ? this.batchSize.hashCode() : 0);
            result = 31 * result + (this.bisectBatchOnFunctionError != null ? this.bisectBatchOnFunctionError.hashCode() : 0);
            result = 31 * result + (this.destinationConfig != null ? this.destinationConfig.hashCode() : 0);
            result = 31 * result + (this.enabled != null ? this.enabled.hashCode() : 0);
            result = 31 * result + (this.eventSourceArn != null ? this.eventSourceArn.hashCode() : 0);
            result = 31 * result + (this.filterCriteria != null ? this.filterCriteria.hashCode() : 0);
            result = 31 * result + (this.functionResponseTypes != null ? this.functionResponseTypes.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.maximumBatchingWindowInSeconds != null ? this.maximumBatchingWindowInSeconds.hashCode() : 0);
            result = 31 * result + (this.maximumRecordAgeInSeconds != null ? this.maximumRecordAgeInSeconds.hashCode() : 0);
            result = 31 * result + (this.maximumRetryAttempts != null ? this.maximumRetryAttempts.hashCode() : 0);
            result = 31 * result + (this.parallelizationFactor != null ? this.parallelizationFactor.hashCode() : 0);
            result = 31 * result + (this.queues != null ? this.queues.hashCode() : 0);
            result = 31 * result + (this.selfManagedEventSource != null ? this.selfManagedEventSource.hashCode() : 0);
            result = 31 * result + (this.sourceAccessConfiguration != null ? this.sourceAccessConfiguration.hashCode() : 0);
            result = 31 * result + (this.startingPosition != null ? this.startingPosition.hashCode() : 0);
            result = 31 * result + (this.startingPositionTimestamp != null ? this.startingPositionTimestamp.hashCode() : 0);
            result = 31 * result + (this.topics != null ? this.topics.hashCode() : 0);
            result = 31 * result + (this.tumblingWindowInSeconds != null ? this.tumblingWindowInSeconds.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
