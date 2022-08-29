package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.542Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerWorkteamMemberDefinition")
@software.amazon.jsii.Jsii.Proxy(SagemakerWorkteamMemberDefinition.Jsii$Proxy.class)
public interface SagemakerWorkteamMemberDefinition extends software.amazon.jsii.JsiiSerializable {

    /**
     * cognito_member_definition block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workteam#cognito_member_definition SagemakerWorkteam#cognito_member_definition}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition getCognitoMemberDefinition() {
        return null;
    }

    /**
     * oidc_member_definition block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workteam#oidc_member_definition SagemakerWorkteam#oidc_member_definition}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition getOidcMemberDefinition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SagemakerWorkteamMemberDefinition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerWorkteamMemberDefinition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerWorkteamMemberDefinition> {
        imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition;
        imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition;

        /**
         * Sets the value of {@link SagemakerWorkteamMemberDefinition#getCognitoMemberDefinition}
         * @param cognitoMemberDefinition cognito_member_definition block.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workteam#cognito_member_definition SagemakerWorkteam#cognito_member_definition}
         * @return {@code this}
         */
        public Builder cognitoMemberDefinition(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition) {
            this.cognitoMemberDefinition = cognitoMemberDefinition;
            return this;
        }

        /**
         * Sets the value of {@link SagemakerWorkteamMemberDefinition#getOidcMemberDefinition}
         * @param oidcMemberDefinition oidc_member_definition block.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/sagemaker_workteam#oidc_member_definition SagemakerWorkteam#oidc_member_definition}
         * @return {@code this}
         */
        public Builder oidcMemberDefinition(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition) {
            this.oidcMemberDefinition = oidcMemberDefinition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerWorkteamMemberDefinition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerWorkteamMemberDefinition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerWorkteamMemberDefinition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerWorkteamMemberDefinition {
        private final imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition;
        private final imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.cognitoMemberDefinition = software.amazon.jsii.Kernel.get(this, "cognitoMemberDefinition", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition.class));
            this.oidcMemberDefinition = software.amazon.jsii.Kernel.get(this, "oidcMemberDefinition", software.amazon.jsii.NativeType.forClass(imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.cognitoMemberDefinition = builder.cognitoMemberDefinition;
            this.oidcMemberDefinition = builder.oidcMemberDefinition;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionCognitoMemberDefinition getCognitoMemberDefinition() {
            return this.cognitoMemberDefinition;
        }

        @Override
        public final imports.aws.sagemaker.SagemakerWorkteamMemberDefinitionOidcMemberDefinition getOidcMemberDefinition() {
            return this.oidcMemberDefinition;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCognitoMemberDefinition() != null) {
                data.set("cognitoMemberDefinition", om.valueToTree(this.getCognitoMemberDefinition()));
            }
            if (this.getOidcMemberDefinition() != null) {
                data.set("oidcMemberDefinition", om.valueToTree(this.getOidcMemberDefinition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerWorkteamMemberDefinition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerWorkteamMemberDefinition.Jsii$Proxy that = (SagemakerWorkteamMemberDefinition.Jsii$Proxy) o;

            if (this.cognitoMemberDefinition != null ? !this.cognitoMemberDefinition.equals(that.cognitoMemberDefinition) : that.cognitoMemberDefinition != null) return false;
            return this.oidcMemberDefinition != null ? this.oidcMemberDefinition.equals(that.oidcMemberDefinition) : that.oidcMemberDefinition == null;
        }

        @Override
        public final int hashCode() {
            int result = this.cognitoMemberDefinition != null ? this.cognitoMemberDefinition.hashCode() : 0;
            result = 31 * result + (this.oidcMemberDefinition != null ? this.oidcMemberDefinition.hashCode() : 0);
            return result;
        }
    }
}
