package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.158Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ComprehendEntityRecognizerInputDataConfigEntityList")
@software.amazon.jsii.Jsii.Proxy(ComprehendEntityRecognizerInputDataConfigEntityList.Jsii$Proxy.class)
public interface ComprehendEntityRecognizerInputDataConfigEntityList extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/comprehend_entity_recognizer#s3_uri ComprehendEntityRecognizer#s3_uri}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getS3Uri();

    /**
     * @return a {@link Builder} of {@link ComprehendEntityRecognizerInputDataConfigEntityList}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ComprehendEntityRecognizerInputDataConfigEntityList}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ComprehendEntityRecognizerInputDataConfigEntityList> {
        java.lang.String s3Uri;

        /**
         * Sets the value of {@link ComprehendEntityRecognizerInputDataConfigEntityList#getS3Uri}
         * @param s3Uri Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/comprehend_entity_recognizer#s3_uri ComprehendEntityRecognizer#s3_uri}. This parameter is required.
         * @return {@code this}
         */
        public Builder s3Uri(java.lang.String s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ComprehendEntityRecognizerInputDataConfigEntityList}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ComprehendEntityRecognizerInputDataConfigEntityList build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ComprehendEntityRecognizerInputDataConfigEntityList}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ComprehendEntityRecognizerInputDataConfigEntityList {
        private final java.lang.String s3Uri;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3Uri = software.amazon.jsii.Kernel.get(this, "s3Uri", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3Uri = java.util.Objects.requireNonNull(builder.s3Uri, "s3Uri is required");
        }

        @Override
        public final java.lang.String getS3Uri() {
            return this.s3Uri;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3Uri", om.valueToTree(this.getS3Uri()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ComprehendEntityRecognizerInputDataConfigEntityList"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ComprehendEntityRecognizerInputDataConfigEntityList.Jsii$Proxy that = (ComprehendEntityRecognizerInputDataConfigEntityList.Jsii$Proxy) o;

            return this.s3Uri.equals(that.s3Uri);
        }

        @Override
        public final int hashCode() {
            int result = this.s3Uri.hashCode();
            return result;
        }
    }
}
