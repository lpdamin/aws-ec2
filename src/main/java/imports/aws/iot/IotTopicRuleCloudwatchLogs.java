package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.452Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleCloudwatchLogs")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleCloudwatchLogs.Jsii$Proxy.class)
public interface IotTopicRuleCloudwatchLogs extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#log_group_name IotTopicRule#log_group_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLogGroupName();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#role_arn IotTopicRule#role_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * @return a {@link Builder} of {@link IotTopicRuleCloudwatchLogs}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleCloudwatchLogs}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleCloudwatchLogs> {
        java.lang.String logGroupName;
        java.lang.String roleArn;

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchLogs#getLogGroupName}
         * @param logGroupName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#log_group_name IotTopicRule#log_group_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder logGroupName(java.lang.String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleCloudwatchLogs#getRoleArn}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#role_arn IotTopicRule#role_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleCloudwatchLogs}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleCloudwatchLogs build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleCloudwatchLogs}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleCloudwatchLogs {
        private final java.lang.String logGroupName;
        private final java.lang.String roleArn;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.logGroupName = software.amazon.jsii.Kernel.get(this, "logGroupName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.logGroupName = java.util.Objects.requireNonNull(builder.logGroupName, "logGroupName is required");
            this.roleArn = java.util.Objects.requireNonNull(builder.roleArn, "roleArn is required");
        }

        @Override
        public final java.lang.String getLogGroupName() {
            return this.logGroupName;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("logGroupName", om.valueToTree(this.getLogGroupName()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iot.IotTopicRuleCloudwatchLogs"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleCloudwatchLogs.Jsii$Proxy that = (IotTopicRuleCloudwatchLogs.Jsii$Proxy) o;

            if (!logGroupName.equals(that.logGroupName)) return false;
            return this.roleArn.equals(that.roleArn);
        }

        @Override
        public final int hashCode() {
            int result = this.logGroupName.hashCode();
            result = 31 * result + (this.roleArn.hashCode());
            return result;
        }
    }
}
