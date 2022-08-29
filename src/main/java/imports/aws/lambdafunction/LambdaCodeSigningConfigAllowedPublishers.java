package imports.aws.lambdafunction;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.765Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.lambdafunction.LambdaCodeSigningConfigAllowedPublishers")
@software.amazon.jsii.Jsii.Proxy(LambdaCodeSigningConfigAllowedPublishers.Jsii$Proxy.class)
public interface LambdaCodeSigningConfigAllowedPublishers extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_code_signing_config#signing_profile_version_arns LambdaCodeSigningConfig#signing_profile_version_arns}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getSigningProfileVersionArns();

    /**
     * @return a {@link Builder} of {@link LambdaCodeSigningConfigAllowedPublishers}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LambdaCodeSigningConfigAllowedPublishers}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LambdaCodeSigningConfigAllowedPublishers> {
        java.util.List<java.lang.String> signingProfileVersionArns;

        /**
         * Sets the value of {@link LambdaCodeSigningConfigAllowedPublishers#getSigningProfileVersionArns}
         * @param signingProfileVersionArns Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/lambda_code_signing_config#signing_profile_version_arns LambdaCodeSigningConfig#signing_profile_version_arns}. This parameter is required.
         * @return {@code this}
         */
        public Builder signingProfileVersionArns(java.util.List<java.lang.String> signingProfileVersionArns) {
            this.signingProfileVersionArns = signingProfileVersionArns;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LambdaCodeSigningConfigAllowedPublishers}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LambdaCodeSigningConfigAllowedPublishers build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LambdaCodeSigningConfigAllowedPublishers}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LambdaCodeSigningConfigAllowedPublishers {
        private final java.util.List<java.lang.String> signingProfileVersionArns;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.signingProfileVersionArns = software.amazon.jsii.Kernel.get(this, "signingProfileVersionArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.signingProfileVersionArns = java.util.Objects.requireNonNull(builder.signingProfileVersionArns, "signingProfileVersionArns is required");
        }

        @Override
        public final java.util.List<java.lang.String> getSigningProfileVersionArns() {
            return this.signingProfileVersionArns;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("signingProfileVersionArns", om.valueToTree(this.getSigningProfileVersionArns()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.lambdafunction.LambdaCodeSigningConfigAllowedPublishers"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LambdaCodeSigningConfigAllowedPublishers.Jsii$Proxy that = (LambdaCodeSigningConfigAllowedPublishers.Jsii$Proxy) o;

            return this.signingProfileVersionArns.equals(that.signingProfileVersionArns);
        }

        @Override
        public final int hashCode() {
            int result = this.signingProfileVersionArns.hashCode();
            return result;
        }
    }
}
