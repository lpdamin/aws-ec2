package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.590Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleErrorActionOutputReference")
public class IotTopicRuleErrorActionOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected IotTopicRuleErrorActionOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IotTopicRuleErrorActionOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public IotTopicRuleErrorActionOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCloudwatchAlarm(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionCloudwatchAlarm value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchAlarm", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCloudwatchLogs(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionCloudwatchLogs value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchLogs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCloudwatchMetric(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionCloudwatchMetric value) {
        software.amazon.jsii.Kernel.call(this, "putCloudwatchMetric", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDynamodb(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionDynamodb value) {
        software.amazon.jsii.Kernel.call(this, "putDynamodb", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putDynamodbv2(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionDynamodbv2 value) {
        software.amazon.jsii.Kernel.call(this, "putDynamodbv2", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putElasticsearch(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionElasticsearch value) {
        software.amazon.jsii.Kernel.call(this, "putElasticsearch", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putFirehose(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionFirehose value) {
        software.amazon.jsii.Kernel.call(this, "putFirehose", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHttp(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionHttp value) {
        software.amazon.jsii.Kernel.call(this, "putHttp", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIotAnalytics(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionIotAnalytics value) {
        software.amazon.jsii.Kernel.call(this, "putIotAnalytics", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putIotEvents(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionIotEvents value) {
        software.amazon.jsii.Kernel.call(this, "putIotEvents", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKafka(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionKafka value) {
        software.amazon.jsii.Kernel.call(this, "putKafka", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putKinesis(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionKinesis value) {
        software.amazon.jsii.Kernel.call(this, "putKinesis", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLambda(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionLambda value) {
        software.amazon.jsii.Kernel.call(this, "putLambda", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRepublish(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionRepublish value) {
        software.amazon.jsii.Kernel.call(this, "putRepublish", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionS3 value) {
        software.amazon.jsii.Kernel.call(this, "putS3", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSns(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionSns value) {
        software.amazon.jsii.Kernel.call(this, "putSns", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSqs(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionSqs value) {
        software.amazon.jsii.Kernel.call(this, "putSqs", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putStepFunctions(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionStepFunctions value) {
        software.amazon.jsii.Kernel.call(this, "putStepFunctions", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putTimestream(final @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionTimestream value) {
        software.amazon.jsii.Kernel.call(this, "putTimestream", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCloudwatchAlarm() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchAlarm", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchLogs() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchLogs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCloudwatchMetric() {
        software.amazon.jsii.Kernel.call(this, "resetCloudwatchMetric", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodb() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodb", software.amazon.jsii.NativeType.VOID);
    }

    public void resetDynamodbv2() {
        software.amazon.jsii.Kernel.call(this, "resetDynamodbv2", software.amazon.jsii.NativeType.VOID);
    }

    public void resetElasticsearch() {
        software.amazon.jsii.Kernel.call(this, "resetElasticsearch", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFirehose() {
        software.amazon.jsii.Kernel.call(this, "resetFirehose", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHttp() {
        software.amazon.jsii.Kernel.call(this, "resetHttp", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIotAnalytics() {
        software.amazon.jsii.Kernel.call(this, "resetIotAnalytics", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIotEvents() {
        software.amazon.jsii.Kernel.call(this, "resetIotEvents", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKafka() {
        software.amazon.jsii.Kernel.call(this, "resetKafka", software.amazon.jsii.NativeType.VOID);
    }

    public void resetKinesis() {
        software.amazon.jsii.Kernel.call(this, "resetKinesis", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLambda() {
        software.amazon.jsii.Kernel.call(this, "resetLambda", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRepublish() {
        software.amazon.jsii.Kernel.call(this, "resetRepublish", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3() {
        software.amazon.jsii.Kernel.call(this, "resetS3", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSns() {
        software.amazon.jsii.Kernel.call(this, "resetSns", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSqs() {
        software.amazon.jsii.Kernel.call(this, "resetSqs", software.amazon.jsii.NativeType.VOID);
    }

    public void resetStepFunctions() {
        software.amazon.jsii.Kernel.call(this, "resetStepFunctions", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTimestream() {
        software.amazon.jsii.Kernel.call(this, "resetTimestream", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionCloudwatchAlarmOutputReference getCloudwatchAlarm() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchAlarm", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionCloudwatchAlarmOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionCloudwatchLogsOutputReference getCloudwatchLogs() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogs", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionCloudwatchLogsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionCloudwatchMetricOutputReference getCloudwatchMetric() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchMetric", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionCloudwatchMetricOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionDynamodbOutputReference getDynamodb() {
        return software.amazon.jsii.Kernel.get(this, "dynamodb", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionDynamodbOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionDynamodbv2OutputReference getDynamodbv2() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbv2", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionDynamodbv2OutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionElasticsearchOutputReference getElasticsearch() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearch", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionElasticsearchOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionFirehoseOutputReference getFirehose() {
        return software.amazon.jsii.Kernel.get(this, "firehose", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionFirehoseOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionHttpOutputReference getHttp() {
        return software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionHttpOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionIotAnalyticsOutputReference getIotAnalytics() {
        return software.amazon.jsii.Kernel.get(this, "iotAnalytics", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionIotAnalyticsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionIotEventsOutputReference getIotEvents() {
        return software.amazon.jsii.Kernel.get(this, "iotEvents", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionIotEventsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionKafkaOutputReference getKafka() {
        return software.amazon.jsii.Kernel.get(this, "kafka", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionKafkaOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionKinesisOutputReference getKinesis() {
        return software.amazon.jsii.Kernel.get(this, "kinesis", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionKinesisOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionLambdaOutputReference getLambda() {
        return software.amazon.jsii.Kernel.get(this, "lambda", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionLambdaOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionRepublishOutputReference getRepublish() {
        return software.amazon.jsii.Kernel.get(this, "republish", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionRepublishOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionS3OutputReference getS3() {
        return software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionS3OutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionSnsOutputReference getSns() {
        return software.amazon.jsii.Kernel.get(this, "sns", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionSnsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionSqsOutputReference getSqs() {
        return software.amazon.jsii.Kernel.get(this, "sqs", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionSqsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionStepFunctionsOutputReference getStepFunctions() {
        return software.amazon.jsii.Kernel.get(this, "stepFunctions", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionStepFunctionsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.iot.IotTopicRuleErrorActionTimestreamOutputReference getTimestream() {
        return software.amazon.jsii.Kernel.get(this, "timestream", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionTimestreamOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionCloudwatchAlarm getCloudwatchAlarmInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchAlarmInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionCloudwatchAlarm.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionCloudwatchLogs getCloudwatchLogsInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchLogsInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionCloudwatchLogs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionCloudwatchMetric getCloudwatchMetricInput() {
        return software.amazon.jsii.Kernel.get(this, "cloudwatchMetricInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionCloudwatchMetric.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionDynamodb getDynamodbInput() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionDynamodb.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionDynamodbv2 getDynamodbv2Input() {
        return software.amazon.jsii.Kernel.get(this, "dynamodbv2Input", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionDynamodbv2.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionElasticsearch getElasticsearchInput() {
        return software.amazon.jsii.Kernel.get(this, "elasticsearchInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionElasticsearch.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionFirehose getFirehoseInput() {
        return software.amazon.jsii.Kernel.get(this, "firehoseInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionFirehose.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionHttp getHttpInput() {
        return software.amazon.jsii.Kernel.get(this, "httpInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionHttp.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionIotAnalytics getIotAnalyticsInput() {
        return software.amazon.jsii.Kernel.get(this, "iotAnalyticsInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionIotAnalytics.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionIotEvents getIotEventsInput() {
        return software.amazon.jsii.Kernel.get(this, "iotEventsInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionIotEvents.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionKafka getKafkaInput() {
        return software.amazon.jsii.Kernel.get(this, "kafkaInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionKafka.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionKinesis getKinesisInput() {
        return software.amazon.jsii.Kernel.get(this, "kinesisInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionKinesis.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionLambda getLambdaInput() {
        return software.amazon.jsii.Kernel.get(this, "lambdaInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionLambda.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionRepublish getRepublishInput() {
        return software.amazon.jsii.Kernel.get(this, "republishInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionRepublish.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionS3 getS3Input() {
        return software.amazon.jsii.Kernel.get(this, "s3Input", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionS3.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionSns getSnsInput() {
        return software.amazon.jsii.Kernel.get(this, "snsInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionSns.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionSqs getSqsInput() {
        return software.amazon.jsii.Kernel.get(this, "sqsInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionSqs.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionStepFunctions getStepFunctionsInput() {
        return software.amazon.jsii.Kernel.get(this, "stepFunctionsInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionStepFunctions.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorActionTimestream getTimestreamInput() {
        return software.amazon.jsii.Kernel.get(this, "timestreamInput", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorActionTimestream.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorAction getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleErrorAction.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleErrorAction value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
