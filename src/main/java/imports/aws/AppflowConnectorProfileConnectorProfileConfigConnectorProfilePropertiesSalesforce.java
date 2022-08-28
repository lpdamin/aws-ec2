package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.136Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce")
@software.amazon.jsii.Jsii.Proxy(AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce.Jsii$Proxy.class)
public interface AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#instance_url AppflowConnectorProfile#instance_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getInstanceUrl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#is_sandbox_environment AppflowConnectorProfile#is_sandbox_environment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIsSandboxEnvironment() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce> {
        java.lang.String instanceUrl;
        java.lang.Object isSandboxEnvironment;

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce#getInstanceUrl}
         * @param instanceUrl Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#instance_url AppflowConnectorProfile#instance_url}.
         * @return {@code this}
         */
        public Builder instanceUrl(java.lang.String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce#getIsSandboxEnvironment}
         * @param isSandboxEnvironment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#is_sandbox_environment AppflowConnectorProfile#is_sandbox_environment}.
         * @return {@code this}
         */
        public Builder isSandboxEnvironment(java.lang.Boolean isSandboxEnvironment) {
            this.isSandboxEnvironment = isSandboxEnvironment;
            return this;
        }

        /**
         * Sets the value of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce#getIsSandboxEnvironment}
         * @param isSandboxEnvironment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/appflow_connector_profile#is_sandbox_environment AppflowConnectorProfile#is_sandbox_environment}.
         * @return {@code this}
         */
        public Builder isSandboxEnvironment(com.hashicorp.cdktf.IResolvable isSandboxEnvironment) {
            this.isSandboxEnvironment = isSandboxEnvironment;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce {
        private final java.lang.String instanceUrl;
        private final java.lang.Object isSandboxEnvironment;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.instanceUrl = software.amazon.jsii.Kernel.get(this, "instanceUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.isSandboxEnvironment = software.amazon.jsii.Kernel.get(this, "isSandboxEnvironment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.instanceUrl = builder.instanceUrl;
            this.isSandboxEnvironment = builder.isSandboxEnvironment;
        }

        @Override
        public final java.lang.String getInstanceUrl() {
            return this.instanceUrl;
        }

        @Override
        public final java.lang.Object getIsSandboxEnvironment() {
            return this.isSandboxEnvironment;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getInstanceUrl() != null) {
                data.set("instanceUrl", om.valueToTree(this.getInstanceUrl()));
            }
            if (this.getIsSandboxEnvironment() != null) {
                data.set("isSandboxEnvironment", om.valueToTree(this.getIsSandboxEnvironment()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce.Jsii$Proxy that = (AppflowConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSalesforce.Jsii$Proxy) o;

            if (this.instanceUrl != null ? !this.instanceUrl.equals(that.instanceUrl) : that.instanceUrl != null) return false;
            return this.isSandboxEnvironment != null ? this.isSandboxEnvironment.equals(that.isSandboxEnvironment) : that.isSandboxEnvironment == null;
        }

        @Override
        public final int hashCode() {
            int result = this.instanceUrl != null ? this.instanceUrl.hashCode() : 0;
            result = 31 * result + (this.isSandboxEnvironment != null ? this.isSandboxEnvironment.hashCode() : 0);
            return result;
        }
    }
}
