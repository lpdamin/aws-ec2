package imports.aws.ses;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic aws_ses_identity_notification_topic}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.699Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ses.SesIdentityNotificationTopic")
public class SesIdentityNotificationTopic extends com.hashicorp.cdktf.TerraformResource {

    protected SesIdentityNotificationTopic(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected SesIdentityNotificationTopic(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.ses.SesIdentityNotificationTopic.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic aws_ses_identity_notification_topic} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public SesIdentityNotificationTopic(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.ses.SesIdentityNotificationTopicConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetIncludeOriginalHeaders() {
        software.amazon.jsii.Kernel.call(this, "resetIncludeOriginalHeaders", software.amazon.jsii.NativeType.VOID);
    }

    public void resetTopicArn() {
        software.amazon.jsii.Kernel.call(this, "resetTopicArn", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.Nullable java.lang.String getIdentityInput() {
        return software.amazon.jsii.Kernel.get(this, "identityInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getIncludeOriginalHeadersInput() {
        return software.amazon.jsii.Kernel.get(this, "includeOriginalHeadersInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getNotificationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "notificationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getTopicArnInput() {
        return software.amazon.jsii.Kernel.get(this, "topicArnInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getIdentity() {
        return software.amazon.jsii.Kernel.get(this, "identity", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setIdentity(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "identity", java.util.Objects.requireNonNull(value, "identity is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getIncludeOriginalHeaders() {
        return software.amazon.jsii.Kernel.get(this, "includeOriginalHeaders", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setIncludeOriginalHeaders(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "includeOriginalHeaders", java.util.Objects.requireNonNull(value, "includeOriginalHeaders is required"));
    }

    public void setIncludeOriginalHeaders(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "includeOriginalHeaders", java.util.Objects.requireNonNull(value, "includeOriginalHeaders is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getNotificationType() {
        return software.amazon.jsii.Kernel.get(this, "notificationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setNotificationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "notificationType", java.util.Objects.requireNonNull(value, "notificationType is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getTopicArn() {
        return software.amazon.jsii.Kernel.get(this, "topicArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setTopicArn(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "topicArn", java.util.Objects.requireNonNull(value, "topicArn is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.ses.SesIdentityNotificationTopic}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.ses.SesIdentityNotificationTopic> {
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
        private final imports.aws.ses.SesIdentityNotificationTopicConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.ses.SesIdentityNotificationTopicConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#identity SesIdentityNotificationTopic#identity}.
         * <p>
         * @return {@code this}
         * @param identity Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#identity SesIdentityNotificationTopic#identity}. This parameter is required.
         */
        public Builder identity(final java.lang.String identity) {
            this.config.identity(identity);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#notification_type SesIdentityNotificationTopic#notification_type}.
         * <p>
         * @return {@code this}
         * @param notificationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#notification_type SesIdentityNotificationTopic#notification_type}. This parameter is required.
         */
        public Builder notificationType(final java.lang.String notificationType) {
            this.config.notificationType(notificationType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#id SesIdentityNotificationTopic#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#id SesIdentityNotificationTopic#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#include_original_headers SesIdentityNotificationTopic#include_original_headers}.
         * <p>
         * @return {@code this}
         * @param includeOriginalHeaders Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#include_original_headers SesIdentityNotificationTopic#include_original_headers}. This parameter is required.
         */
        public Builder includeOriginalHeaders(final java.lang.Boolean includeOriginalHeaders) {
            this.config.includeOriginalHeaders(includeOriginalHeaders);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#include_original_headers SesIdentityNotificationTopic#include_original_headers}.
         * <p>
         * @return {@code this}
         * @param includeOriginalHeaders Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#include_original_headers SesIdentityNotificationTopic#include_original_headers}. This parameter is required.
         */
        public Builder includeOriginalHeaders(final com.hashicorp.cdktf.IResolvable includeOriginalHeaders) {
            this.config.includeOriginalHeaders(includeOriginalHeaders);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#topic_arn SesIdentityNotificationTopic#topic_arn}.
         * <p>
         * @return {@code this}
         * @param topicArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ses_identity_notification_topic#topic_arn SesIdentityNotificationTopic#topic_arn}. This parameter is required.
         */
        public Builder topicArn(final java.lang.String topicArn) {
            this.config.topicArn(topicArn);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.ses.SesIdentityNotificationTopic}.
         */
        @Override
        public imports.aws.ses.SesIdentityNotificationTopic build() {
            return new imports.aws.ses.SesIdentityNotificationTopic(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
