package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.193Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesOutputReference")
public class AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesOutputReference extends com.hashicorp.cdktf.ComplexObject {

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesOutputReference(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesOutputReference(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * @param terraformResource The parent resource. This parameter is required.
     * @param terraformAttribute The attribute on the parent resource this class is referencing. This parameter is required.
     */
    public AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesOutputReference(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IInterpolatingParent terraformResource, final @org.jetbrains.annotations.NotNull java.lang.String terraformAttribute) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(terraformResource, "terraformResource is required"), java.util.Objects.requireNonNull(terraformAttribute, "terraformAttribute is required") });
    }

    public void putCustomConnector(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector value) {
        software.amazon.jsii.Kernel.call(this, "putCustomConnector", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putCustomerProfiles(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles value) {
        software.amazon.jsii.Kernel.call(this, "putCustomerProfiles", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putEventBridge(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge value) {
        software.amazon.jsii.Kernel.call(this, "putEventBridge", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putHoneycode(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode value) {
        software.amazon.jsii.Kernel.call(this, "putHoneycode", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putLookoutMetrics(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics value) {
        software.amazon.jsii.Kernel.call(this, "putLookoutMetrics", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putMarketo(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo value) {
        software.amazon.jsii.Kernel.call(this, "putMarketo", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putRedshift(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift value) {
        software.amazon.jsii.Kernel.call(this, "putRedshift", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putS3(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 value) {
        software.amazon.jsii.Kernel.call(this, "putS3", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSalesforce(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce value) {
        software.amazon.jsii.Kernel.call(this, "putSalesforce", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSapoData(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData value) {
        software.amazon.jsii.Kernel.call(this, "putSapoData", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putSnowflake(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake value) {
        software.amazon.jsii.Kernel.call(this, "putSnowflake", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putUpsolver(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver value) {
        software.amazon.jsii.Kernel.call(this, "putUpsolver", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void putZendesk(final @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk value) {
        software.amazon.jsii.Kernel.call(this, "putZendesk", software.amazon.jsii.NativeType.VOID, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public void resetCustomConnector() {
        software.amazon.jsii.Kernel.call(this, "resetCustomConnector", software.amazon.jsii.NativeType.VOID);
    }

    public void resetCustomerProfiles() {
        software.amazon.jsii.Kernel.call(this, "resetCustomerProfiles", software.amazon.jsii.NativeType.VOID);
    }

    public void resetEventBridge() {
        software.amazon.jsii.Kernel.call(this, "resetEventBridge", software.amazon.jsii.NativeType.VOID);
    }

    public void resetHoneycode() {
        software.amazon.jsii.Kernel.call(this, "resetHoneycode", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLookoutMetrics() {
        software.amazon.jsii.Kernel.call(this, "resetLookoutMetrics", software.amazon.jsii.NativeType.VOID);
    }

    public void resetMarketo() {
        software.amazon.jsii.Kernel.call(this, "resetMarketo", software.amazon.jsii.NativeType.VOID);
    }

    public void resetRedshift() {
        software.amazon.jsii.Kernel.call(this, "resetRedshift", software.amazon.jsii.NativeType.VOID);
    }

    public void resetS3() {
        software.amazon.jsii.Kernel.call(this, "resetS3", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSalesforce() {
        software.amazon.jsii.Kernel.call(this, "resetSalesforce", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSapoData() {
        software.amazon.jsii.Kernel.call(this, "resetSapoData", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSnowflake() {
        software.amazon.jsii.Kernel.call(this, "resetSnowflake", software.amazon.jsii.NativeType.VOID);
    }

    public void resetUpsolver() {
        software.amazon.jsii.Kernel.call(this, "resetUpsolver", software.amazon.jsii.NativeType.VOID);
    }

    public void resetZendesk() {
        software.amazon.jsii.Kernel.call(this, "resetZendesk", software.amazon.jsii.NativeType.VOID);
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorOutputReference getCustomConnector() {
        return software.amazon.jsii.Kernel.get(this, "customConnector", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnectorOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfilesOutputReference getCustomerProfiles() {
        return software.amazon.jsii.Kernel.get(this, "customerProfiles", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfilesOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeOutputReference getEventBridge() {
        return software.amazon.jsii.Kernel.get(this, "eventBridge", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridgeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeOutputReference getHoneycode() {
        return software.amazon.jsii.Kernel.get(this, "honeycode", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycodeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetricsOutputReference getLookoutMetrics() {
        return software.amazon.jsii.Kernel.get(this, "lookoutMetrics", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetricsOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference getMarketo() {
        return software.amazon.jsii.Kernel.get(this, "marketo", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketoOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftOutputReference getRedshift() {
        return software.amazon.jsii.Kernel.get(this, "redshift", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshiftOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3OutputReference getS3() {
        return software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3OutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceOutputReference getSalesforce() {
        return software.amazon.jsii.Kernel.get(this, "salesforce", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforceOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference getSapoData() {
        return software.amazon.jsii.Kernel.get(this, "sapoData", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeOutputReference getSnowflake() {
        return software.amazon.jsii.Kernel.get(this, "snowflake", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflakeOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverOutputReference getUpsolver() {
        return software.amazon.jsii.Kernel.get(this, "upsolver", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverOutputReference.class));
    }

    public @org.jetbrains.annotations.NotNull imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendeskOutputReference getZendesk() {
        return software.amazon.jsii.Kernel.get(this, "zendesk", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendeskOutputReference.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector getCustomConnectorInput() {
        return software.amazon.jsii.Kernel.get(this, "customConnectorInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomConnector.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles getCustomerProfilesInput() {
        return software.amazon.jsii.Kernel.get(this, "customerProfilesInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesCustomerProfiles.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge getEventBridgeInput() {
        return software.amazon.jsii.Kernel.get(this, "eventBridgeInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesEventBridge.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode getHoneycodeInput() {
        return software.amazon.jsii.Kernel.get(this, "honeycodeInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesHoneycode.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics getLookoutMetricsInput() {
        return software.amazon.jsii.Kernel.get(this, "lookoutMetricsInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesLookoutMetrics.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo getMarketoInput() {
        return software.amazon.jsii.Kernel.get(this, "marketoInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesMarketo.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift getRedshiftInput() {
        return software.amazon.jsii.Kernel.get(this, "redshiftInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesRedshift.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3 getS3Input() {
        return software.amazon.jsii.Kernel.get(this, "s3Input", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesS3.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce getSalesforceInput() {
        return software.amazon.jsii.Kernel.get(this, "salesforceInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSalesforce.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData getSapoDataInput() {
        return software.amazon.jsii.Kernel.get(this, "sapoDataInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSapoData.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake getSnowflakeInput() {
        return software.amazon.jsii.Kernel.get(this, "snowflakeInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesSnowflake.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver getUpsolverInput() {
        return software.amazon.jsii.Kernel.get(this, "upsolverInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesUpsolver.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk getZendeskInput() {
        return software.amazon.jsii.Kernel.get(this, "zendeskInput", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorPropertiesZendesk.class));
    }

    public @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorProperties getInternalValue() {
        return software.amazon.jsii.Kernel.get(this, "internalValue", software.amazon.jsii.NativeType.forClass(imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorProperties.class));
    }

    public void setInternalValue(final @org.jetbrains.annotations.Nullable imports.aws.AppflowFlowDestinationFlowConfigDestinationConnectorProperties value) {
        software.amazon.jsii.Kernel.set(this, "internalValue", value);
    }
}
