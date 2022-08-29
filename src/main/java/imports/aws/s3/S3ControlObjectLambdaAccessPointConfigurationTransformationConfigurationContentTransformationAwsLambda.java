package imports.aws.s3;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.473Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda")
@software.amazon.jsii.Jsii.Proxy(S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.Jsii$Proxy.class)
public interface S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_object_lambda_access_point#function_arn S3ControlObjectLambdaAccessPoint#function_arn}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFunctionArn();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_object_lambda_access_point#function_payload S3ControlObjectLambdaAccessPoint#function_payload}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFunctionPayload() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda}
     */
    public static final class Builder implements software.amazon.jsii.Builder<S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda> {
        java.lang.String functionArn;
        java.lang.String functionPayload;

        /**
         * Sets the value of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda#getFunctionArn}
         * @param functionArn Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_object_lambda_access_point#function_arn S3ControlObjectLambdaAccessPoint#function_arn}. This parameter is required.
         * @return {@code this}
         */
        public Builder functionArn(java.lang.String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * Sets the value of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda#getFunctionPayload}
         * @param functionPayload Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/s3control_object_lambda_access_point#function_payload S3ControlObjectLambdaAccessPoint#function_payload}.
         * @return {@code this}
         */
        public Builder functionPayload(java.lang.String functionPayload) {
            this.functionPayload = functionPayload;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda {
        private final java.lang.String functionArn;
        private final java.lang.String functionPayload;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.functionArn = software.amazon.jsii.Kernel.get(this, "functionArn", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.functionPayload = software.amazon.jsii.Kernel.get(this, "functionPayload", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.functionArn = java.util.Objects.requireNonNull(builder.functionArn, "functionArn is required");
            this.functionPayload = builder.functionPayload;
        }

        @Override
        public final java.lang.String getFunctionArn() {
            return this.functionArn;
        }

        @Override
        public final java.lang.String getFunctionPayload() {
            return this.functionPayload;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("functionArn", om.valueToTree(this.getFunctionArn()));
            if (this.getFunctionPayload() != null) {
                data.set("functionPayload", om.valueToTree(this.getFunctionPayload()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.s3.S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.Jsii$Proxy that = (S3ControlObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda.Jsii$Proxy) o;

            if (!functionArn.equals(that.functionArn)) return false;
            return this.functionPayload != null ? this.functionPayload.equals(that.functionPayload) : that.functionPayload == null;
        }

        @Override
        public final int hashCode() {
            int result = this.functionArn.hashCode();
            result = 31 * result + (this.functionPayload != null ? this.functionPayload.hashCode() : 0);
            return result;
        }
    }
}
