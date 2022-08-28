package imports.aws.iot;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.596Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.iot.IotTopicRuleTimestream")
@software.amazon.jsii.Jsii.Proxy(IotTopicRuleTimestream.Jsii$Proxy.class)
public interface IotTopicRuleTimestream extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#database_name IotTopicRule#database_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDatabaseName();

    /**
     * dimension block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#dimension IotTopicRule#dimension}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getDimension();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#role_arn IotTopicRule#role_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRoleArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#table_name IotTopicRule#table_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTableName();

    /**
     * timestamp block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#timestamp IotTopicRule#timestamp}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.iot.IotTopicRuleTimestreamTimestamp getTimestamp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IotTopicRuleTimestream}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IotTopicRuleTimestream}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IotTopicRuleTimestream> {
        java.lang.String databaseName;
        java.lang.Object dimension;
        java.lang.String roleArn;
        java.lang.String tableName;
        imports.aws.iot.IotTopicRuleTimestreamTimestamp timestamp;

        /**
         * Sets the value of {@link IotTopicRuleTimestream#getDatabaseName}
         * @param databaseName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#database_name IotTopicRule#database_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder databaseName(java.lang.String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleTimestream#getDimension}
         * @param dimension dimension block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#dimension IotTopicRule#dimension}
         * @return {@code this}
         */
        public Builder dimension(com.hashicorp.cdktf.IResolvable dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleTimestream#getDimension}
         * @param dimension dimension block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#dimension IotTopicRule#dimension}
         * @return {@code this}
         */
        public Builder dimension(java.util.List<? extends imports.aws.iot.IotTopicRuleTimestreamDimension> dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleTimestream#getRoleArn}
         * @param roleArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#role_arn IotTopicRule#role_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder roleArn(java.lang.String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleTimestream#getTableName}
         * @param tableName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#table_name IotTopicRule#table_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder tableName(java.lang.String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Sets the value of {@link IotTopicRuleTimestream#getTimestamp}
         * @param timestamp timestamp block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/iot_topic_rule#timestamp IotTopicRule#timestamp}
         * @return {@code this}
         */
        public Builder timestamp(imports.aws.iot.IotTopicRuleTimestreamTimestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IotTopicRuleTimestream}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IotTopicRuleTimestream build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link IotTopicRuleTimestream}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IotTopicRuleTimestream {
        private final java.lang.String databaseName;
        private final java.lang.Object dimension;
        private final java.lang.String roleArn;
        private final java.lang.String tableName;
        private final imports.aws.iot.IotTopicRuleTimestreamTimestamp timestamp;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.databaseName = software.amazon.jsii.Kernel.get(this, "databaseName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dimension = software.amazon.jsii.Kernel.get(this, "dimension", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.roleArn = software.amazon.jsii.Kernel.get(this, "roleArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tableName = software.amazon.jsii.Kernel.get(this, "tableName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timestamp = software.amazon.jsii.Kernel.get(this, "timestamp", software.amazon.jsii.NativeType.forClass(imports.aws.iot.IotTopicRuleTimestreamTimestamp.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.databaseName = java.util.Objects.requireNonNull(builder.databaseName, "databaseName is required");
            this.dimension = java.util.Objects.requireNonNull(builder.dimension, "dimension is required");
            this.roleArn = java.util.Objects.requireNonNull(builder.roleArn, "roleArn is required");
            this.tableName = java.util.Objects.requireNonNull(builder.tableName, "tableName is required");
            this.timestamp = builder.timestamp;
        }

        @Override
        public final java.lang.String getDatabaseName() {
            return this.databaseName;
        }

        @Override
        public final java.lang.Object getDimension() {
            return this.dimension;
        }

        @Override
        public final java.lang.String getRoleArn() {
            return this.roleArn;
        }

        @Override
        public final java.lang.String getTableName() {
            return this.tableName;
        }

        @Override
        public final imports.aws.iot.IotTopicRuleTimestreamTimestamp getTimestamp() {
            return this.timestamp;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("databaseName", om.valueToTree(this.getDatabaseName()));
            data.set("dimension", om.valueToTree(this.getDimension()));
            data.set("roleArn", om.valueToTree(this.getRoleArn()));
            data.set("tableName", om.valueToTree(this.getTableName()));
            if (this.getTimestamp() != null) {
                data.set("timestamp", om.valueToTree(this.getTimestamp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.iot.IotTopicRuleTimestream"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IotTopicRuleTimestream.Jsii$Proxy that = (IotTopicRuleTimestream.Jsii$Proxy) o;

            if (!databaseName.equals(that.databaseName)) return false;
            if (!dimension.equals(that.dimension)) return false;
            if (!roleArn.equals(that.roleArn)) return false;
            if (!tableName.equals(that.tableName)) return false;
            return this.timestamp != null ? this.timestamp.equals(that.timestamp) : that.timestamp == null;
        }

        @Override
        public final int hashCode() {
            int result = this.databaseName.hashCode();
            result = 31 * result + (this.dimension.hashCode());
            result = 31 * result + (this.roleArn.hashCode());
            result = 31 * result + (this.tableName.hashCode());
            result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
            return result;
        }
    }
}
