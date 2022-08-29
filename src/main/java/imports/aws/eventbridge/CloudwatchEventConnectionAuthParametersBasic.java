package imports.aws.eventbridge;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.144Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.eventbridge.CloudwatchEventConnectionAuthParametersBasic")
@software.amazon.jsii.Jsii.Proxy(CloudwatchEventConnectionAuthParametersBasic.Jsii$Proxy.class)
public interface CloudwatchEventConnectionAuthParametersBasic extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_connection#password CloudwatchEventConnection#password}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPassword();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_connection#username CloudwatchEventConnection#username}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUsername();

    /**
     * @return a {@link Builder} of {@link CloudwatchEventConnectionAuthParametersBasic}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CloudwatchEventConnectionAuthParametersBasic}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CloudwatchEventConnectionAuthParametersBasic> {
        java.lang.String password;
        java.lang.String username;

        /**
         * Sets the value of {@link CloudwatchEventConnectionAuthParametersBasic#getPassword}
         * @param password Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_connection#password CloudwatchEventConnection#password}. This parameter is required.
         * @return {@code this}
         */
        public Builder password(java.lang.String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets the value of {@link CloudwatchEventConnectionAuthParametersBasic#getUsername}
         * @param username Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/cloudwatch_event_connection#username CloudwatchEventConnection#username}. This parameter is required.
         * @return {@code this}
         */
        public Builder username(java.lang.String username) {
            this.username = username;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CloudwatchEventConnectionAuthParametersBasic}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CloudwatchEventConnectionAuthParametersBasic build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CloudwatchEventConnectionAuthParametersBasic}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CloudwatchEventConnectionAuthParametersBasic {
        private final java.lang.String password;
        private final java.lang.String username;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.password = software.amazon.jsii.Kernel.get(this, "password", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.username = software.amazon.jsii.Kernel.get(this, "username", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.password = java.util.Objects.requireNonNull(builder.password, "password is required");
            this.username = java.util.Objects.requireNonNull(builder.username, "username is required");
        }

        @Override
        public final java.lang.String getPassword() {
            return this.password;
        }

        @Override
        public final java.lang.String getUsername() {
            return this.username;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("password", om.valueToTree(this.getPassword()));
            data.set("username", om.valueToTree(this.getUsername()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.eventbridge.CloudwatchEventConnectionAuthParametersBasic"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CloudwatchEventConnectionAuthParametersBasic.Jsii$Proxy that = (CloudwatchEventConnectionAuthParametersBasic.Jsii$Proxy) o;

            if (!password.equals(that.password)) return false;
            return this.username.equals(that.username);
        }

        @Override
        public final int hashCode() {
            int result = this.password.hashCode();
            result = 31 * result + (this.username.hashCode());
            return result;
        }
    }
}
