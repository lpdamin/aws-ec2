package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:01.463Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation")
@software.amazon.jsii.Jsii.Proxy(S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation.Jsii$Proxy.class)
public interface S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation extends software.amazon.jsii.JsiiSerializable {

    /**
     * aws_lambda block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3control_object_lambda_access_point#aws_lambda S3ControlObjectLambdaAccessPoint#aws_lambda}
     */
    @org.jetbrains.annotations.NotNull imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda getAwsLambda();

    /**
     * @return a {@link Builder} of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation> {
        imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda;

        /**
         * Sets the value of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation#getAwsLambda}
         * @param awsLambda aws_lambda block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/s3control_object_lambda_access_point#aws_lambda S3ControlObjectLambdaAccessPoint#aws_lambda}
         * @return {@code this}
         */
        public Builder awsLambda(imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda) {
            this.awsLambda = awsLambda;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation {
        private final imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda awsLambda;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsLambda = software.amazon.jsii.Kernel.get(this, "awsLambda", software.amazon.jsii.NativeType.forClass(imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.awsLambda = java.util.Objects.requireNonNull(builder.awsLambda, "awsLambda is required");
        }

        @Override
        public final imports.aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda getAwsLambda() {
            return this.awsLambda;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("awsLambda", om.valueToTree(this.getAwsLambda()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation.Jsii$Proxy that = (S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformation.Jsii$Proxy) o;

            return this.awsLambda.equals(that.awsLambda);
        }

        @Override
        public final int hashCode() {
            int result = this.awsLambda.hashCode();
            return result;
        }
    }
}
