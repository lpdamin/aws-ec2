package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.428Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3BucketNotificationTopic")
@software.amazon.jsii.Jsii.Proxy(S3BucketNotificationTopic.Jsii$Proxy.class)
public interface S3BucketNotificationTopic extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#events S3BucketNotification#events}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getEvents();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#topic_arn S3BucketNotification#topic_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTopicArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#filter_prefix S3BucketNotification#filter_prefix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFilterPrefix() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#filter_suffix S3BucketNotification#filter_suffix}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFilterSuffix() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#id S3BucketNotification#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3BucketNotificationTopic}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3BucketNotificationTopic}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3BucketNotificationTopic> {
        java.util.List<java.lang.String> events;
        java.lang.String topicArn;
        java.lang.String filterPrefix;
        java.lang.String filterSuffix;
        java.lang.String id;

        /**
         * Sets the value of {@link S3BucketNotificationTopic#getEvents}
         * @param events Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#events S3BucketNotification#events}. This parameter is required.
         * @return {@code this}
         */
        public Builder events(java.util.List<java.lang.String> events) {
            this.events = events;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationTopic#getTopicArn}
         * @param topicArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#topic_arn S3BucketNotification#topic_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder topicArn(java.lang.String topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationTopic#getFilterPrefix}
         * @param filterPrefix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#filter_prefix S3BucketNotification#filter_prefix}.
         * @return {@code this}
         */
        public Builder filterPrefix(java.lang.String filterPrefix) {
            this.filterPrefix = filterPrefix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationTopic#getFilterSuffix}
         * @param filterSuffix Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#filter_suffix S3BucketNotification#filter_suffix}.
         * @return {@code this}
         */
        public Builder filterSuffix(java.lang.String filterSuffix) {
            this.filterSuffix = filterSuffix;
            return this;
        }

        /**
         * Sets the value of {@link S3BucketNotificationTopic#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3_bucket_notification#id S3BucketNotification#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3BucketNotificationTopic}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3BucketNotificationTopic build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3BucketNotificationTopic}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3BucketNotificationTopic {
        private final java.util.List<java.lang.String> events;
        private final java.lang.String topicArn;
        private final java.lang.String filterPrefix;
        private final java.lang.String filterSuffix;
        private final java.lang.String id;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.events = software.amazon.jsii.Kernel.get(this, "events", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.topicArn = software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filterPrefix = software.amazon.jsii.Kernel.get(this, "filterPrefix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.filterSuffix = software.amazon.jsii.Kernel.get(this, "filterSuffix", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.events = java.util.Objects.requireNonNull(builder.events, "events is required");
            this.topicArn = java.util.Objects.requireNonNull(builder.topicArn, "topicArn is required");
            this.filterPrefix = builder.filterPrefix;
            this.filterSuffix = builder.filterSuffix;
            this.id = builder.id;
        }

        @Override
        public final java.util.List<java.lang.String> getEvents() {
            return this.events;
        }

        @Override
        public final java.lang.String getTopicArn() {
            return this.topicArn;
        }

        @Override
        public final java.lang.String getFilterPrefix() {
            return this.filterPrefix;
        }

        @Override
        public final java.lang.String getFilterSuffix() {
            return this.filterSuffix;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("events", om.valueToTree(this.getEvents()));
            data.set("topicArn", om.valueToTree(this.getTopicArn()));
            if (this.getFilterPrefix() != null) {
                data.set("filterPrefix", om.valueToTree(this.getFilterPrefix()));
            }
            if (this.getFilterSuffix() != null) {
                data.set("filterSuffix", om.valueToTree(this.getFilterSuffix()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3BucketNotificationTopic"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3BucketNotificationTopic.Jsii$Proxy that = (S3BucketNotificationTopic.Jsii$Proxy) o;

            if (!events.equals(that.events)) return false;
            if (!topicArn.equals(that.topicArn)) return false;
            if (this.filterPrefix != null ? !this.filterPrefix.equals(that.filterPrefix) : that.filterPrefix != null) return false;
            if (this.filterSuffix != null ? !this.filterSuffix.equals(that.filterSuffix) : that.filterSuffix != null) return false;
            return this.id != null ? this.id.equals(that.id) : that.id == null;
        }

        @Override
        public final int hashCode() {
            int result = this.events.hashCode();
            result = 31 * result + (this.topicArn.hashCode());
            result = 31 * result + (this.filterPrefix != null ? this.filterPrefix.hashCode() : 0);
            result = 31 * result + (this.filterSuffix != null ? this.filterSuffix.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            return result;
        }
    }
}
