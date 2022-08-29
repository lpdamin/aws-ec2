package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.766Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaCodeSigningConfigPolicies")
@software.amazon.jsii.Jsii.Proxy(LambdaCodeSigningConfigPolicies.Jsii$Proxy.class)
public interface LambdaCodeSigningConfigPolicies extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_code_signing_config#untrusted_artifact_on_deployment LambdaCodeSigningConfig#untrusted_artifact_on_deployment}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUntrustedArtifactOnDeployment();

    /**
     * @return a {@link Builder} of {@link LambdaCodeSigningConfigPolicies}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaCodeSigningConfigPolicies}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaCodeSigningConfigPolicies> {
        java.lang.String untrustedArtifactOnDeployment;

        /**
         * Sets the value of {@link LambdaCodeSigningConfigPolicies#getUntrustedArtifactOnDeployment}
         * @param untrustedArtifactOnDeployment Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_code_signing_config#untrusted_artifact_on_deployment LambdaCodeSigningConfig#untrusted_artifact_on_deployment}. This parameter is required.
         * @return {@code this}
         */
        public Builder untrustedArtifactOnDeployment(java.lang.String untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = untrustedArtifactOnDeployment;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaCodeSigningConfigPolicies}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaCodeSigningConfigPolicies build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaCodeSigningConfigPolicies}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaCodeSigningConfigPolicies {
        private final java.lang.String untrustedArtifactOnDeployment;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.untrustedArtifactOnDeployment = software.amazon.jsii.Kernel.get(this, "untrustedArtifactOnDeployment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.untrustedArtifactOnDeployment = java.util.Objects.requireNonNull(builder.untrustedArtifactOnDeployment, "untrustedArtifactOnDeployment is required");
        }

        @Override
        public final java.lang.String getUntrustedArtifactOnDeployment() {
            return this.untrustedArtifactOnDeployment;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("untrustedArtifactOnDeployment", om.valueToTree(this.getUntrustedArtifactOnDeployment()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lambdafunction.LambdaCodeSigningConfigPolicies"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaCodeSigningConfigPolicies.Jsii$Proxy that = (LambdaCodeSigningConfigPolicies.Jsii$Proxy) o;

            return this.untrustedArtifactOnDeployment.equals(that.untrustedArtifactOnDeployment);
        }

        @Override
        public final int hashCode() {
            int result = this.untrustedArtifactOnDeployment.hashCode();
            return result;
        }
    }
}
