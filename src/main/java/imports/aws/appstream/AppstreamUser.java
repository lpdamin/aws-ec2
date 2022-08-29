package imports.aws.appstream;

/**
 * Represents a {@link https://www.terraform.io/docs/providers/aws/r/appstream_user aws_appstream_user}.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.736Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.appstream.AppstreamUser")
public class AppstreamUser extends com.hashicorp.cdktf.TerraformResource {

    protected AppstreamUser(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected AppstreamUser(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        TF_RESOURCE_TYPE = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.aws.appstream.AppstreamUser.class, "tfResourceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    /**
     * Create a new {@link https://www.terraform.io/docs/providers/aws/r/appstream_user aws_appstream_user} Resource.
     * <p>
     * @param scope The scope in which to define this construct. This parameter is required.
     * @param id The scoped construct ID. This parameter is required.
     * @param config This parameter is required.
     */
    public AppstreamUser(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.aws.appstream.AppstreamUserConfig config) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(config, "config is required") });
    }

    public void resetEnabled() {
        software.amazon.jsii.Kernel.call(this, "resetEnabled", software.amazon.jsii.NativeType.VOID);
    }

    public void resetFirstName() {
        software.amazon.jsii.Kernel.call(this, "resetFirstName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetId() {
        software.amazon.jsii.Kernel.call(this, "resetId", software.amazon.jsii.NativeType.VOID);
    }

    public void resetLastName() {
        software.amazon.jsii.Kernel.call(this, "resetLastName", software.amazon.jsii.NativeType.VOID);
    }

    public void resetSendEmailNotification() {
        software.amazon.jsii.Kernel.call(this, "resetSendEmailNotification", software.amazon.jsii.NativeType.VOID);
    }

    @Override
    protected @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.Object> synthesizeAttributes() {
        return java.util.Collections.unmodifiableMap(software.amazon.jsii.Kernel.call(this, "synthesizeAttributes", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class))));
    }

    public final static java.lang.String TF_RESOURCE_TYPE;

    public @org.jetbrains.annotations.NotNull java.lang.String getArn() {
        return software.amazon.jsii.Kernel.get(this, "arn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getCreatedTime() {
        return software.amazon.jsii.Kernel.get(this, "createdTime", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getAuthenticationTypeInput() {
        return software.amazon.jsii.Kernel.get(this, "authenticationTypeInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getEnabledInput() {
        return software.amazon.jsii.Kernel.get(this, "enabledInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getFirstNameInput() {
        return software.amazon.jsii.Kernel.get(this, "firstNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getIdInput() {
        return software.amazon.jsii.Kernel.get(this, "idInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getLastNameInput() {
        return software.amazon.jsii.Kernel.get(this, "lastNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.Object getSendEmailNotificationInput() {
        return software.amazon.jsii.Kernel.get(this, "sendEmailNotificationInput", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public @org.jetbrains.annotations.Nullable java.lang.String getUserNameInput() {
        return software.amazon.jsii.Kernel.get(this, "userNameInput", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getAuthenticationType() {
        return software.amazon.jsii.Kernel.get(this, "authenticationType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setAuthenticationType(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "authenticationType", java.util.Objects.requireNonNull(value, "authenticationType is required"));
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

    public @org.jetbrains.annotations.NotNull java.lang.String getFirstName() {
        return software.amazon.jsii.Kernel.get(this, "firstName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setFirstName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "firstName", java.util.Objects.requireNonNull(value, "firstName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getId() {
        return software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setId(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "id", java.util.Objects.requireNonNull(value, "id is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getLastName() {
        return software.amazon.jsii.Kernel.get(this, "lastName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setLastName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "lastName", java.util.Objects.requireNonNull(value, "lastName is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.Object getSendEmailNotification() {
        return software.amazon.jsii.Kernel.get(this, "sendEmailNotification", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
    }

    public void setSendEmailNotification(final @org.jetbrains.annotations.NotNull java.lang.Boolean value) {
        software.amazon.jsii.Kernel.set(this, "sendEmailNotification", java.util.Objects.requireNonNull(value, "sendEmailNotification is required"));
    }

    public void setSendEmailNotification(final @org.jetbrains.annotations.NotNull com.hashicorp.cdktf.IResolvable value) {
        software.amazon.jsii.Kernel.set(this, "sendEmailNotification", java.util.Objects.requireNonNull(value, "sendEmailNotification is required"));
    }

    public @org.jetbrains.annotations.NotNull java.lang.String getUserName() {
        return software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
    }

    public void setUserName(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        software.amazon.jsii.Kernel.set(this, "userName", java.util.Objects.requireNonNull(value, "userName is required"));
    }

    /**
     * A fluent builder for {@link imports.aws.appstream.AppstreamUser}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.aws.appstream.AppstreamUser> {
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
        private final imports.aws.appstream.AppstreamUserConfig.Builder config;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.config = new imports.aws.appstream.AppstreamUserConfig.Builder();
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
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#authentication_type AppstreamUser#authentication_type}.
         * <p>
         * @return {@code this}
         * @param authenticationType Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#authentication_type AppstreamUser#authentication_type}. This parameter is required.
         */
        public Builder authenticationType(final java.lang.String authenticationType) {
            this.config.authenticationType(authenticationType);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#user_name AppstreamUser#user_name}.
         * <p>
         * @return {@code this}
         * @param userName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#user_name AppstreamUser#user_name}. This parameter is required.
         */
        public Builder userName(final java.lang.String userName) {
            this.config.userName(userName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#enabled AppstreamUser#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#enabled AppstreamUser#enabled}. This parameter is required.
         */
        public Builder enabled(final java.lang.Boolean enabled) {
            this.config.enabled(enabled);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#enabled AppstreamUser#enabled}.
         * <p>
         * @return {@code this}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#enabled AppstreamUser#enabled}. This parameter is required.
         */
        public Builder enabled(final com.hashicorp.cdktf.IResolvable enabled) {
            this.config.enabled(enabled);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#first_name AppstreamUser#first_name}.
         * <p>
         * @return {@code this}
         * @param firstName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#first_name AppstreamUser#first_name}. This parameter is required.
         */
        public Builder firstName(final java.lang.String firstName) {
            this.config.firstName(firstName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#id AppstreamUser#id}.
         * <p>
         * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * <p>
         * @return {@code this}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#id AppstreamUser#id}. This parameter is required.
         */
        public Builder id(final java.lang.String id) {
            this.config.id(id);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#last_name AppstreamUser#last_name}.
         * <p>
         * @return {@code this}
         * @param lastName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#last_name AppstreamUser#last_name}. This parameter is required.
         */
        public Builder lastName(final java.lang.String lastName) {
            this.config.lastName(lastName);
            return this;
        }

        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#send_email_notification AppstreamUser#send_email_notification}.
         * <p>
         * @return {@code this}
         * @param sendEmailNotification Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#send_email_notification AppstreamUser#send_email_notification}. This parameter is required.
         */
        public Builder sendEmailNotification(final java.lang.Boolean sendEmailNotification) {
            this.config.sendEmailNotification(sendEmailNotification);
            return this;
        }
        /**
         * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#send_email_notification AppstreamUser#send_email_notification}.
         * <p>
         * @return {@code this}
         * @param sendEmailNotification Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appstream_user#send_email_notification AppstreamUser#send_email_notification}. This parameter is required.
         */
        public Builder sendEmailNotification(final com.hashicorp.cdktf.IResolvable sendEmailNotification) {
            this.config.sendEmailNotification(sendEmailNotification);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.aws.appstream.AppstreamUser}.
         */
        @Override
        public imports.aws.appstream.AppstreamUser build() {
            return new imports.aws.appstream.AppstreamUser(
                this.scope,
                this.id,
                this.config.build()
            );
        }
    }
}
