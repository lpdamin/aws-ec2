package imports.aws.sagemaker;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.516Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.sagemaker.SagemakerFlowDefinitionHumanLoopRequestSource")
@software.amazon.jsii.Jsii.Proxy(SagemakerFlowDefinitionHumanLoopRequestSource.Jsii$Proxy.class)
public interface SagemakerFlowDefinitionHumanLoopRequestSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_flow_definition#aws_managed_human_loop_request_source SagemakerFlowDefinition#aws_managed_human_loop_request_source}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAwsManagedHumanLoopRequestSource();

    /**
     * @return a {@link Builder} of {@link SagemakerFlowDefinitionHumanLoopRequestSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SagemakerFlowDefinitionHumanLoopRequestSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SagemakerFlowDefinitionHumanLoopRequestSource> {
        java.lang.String awsManagedHumanLoopRequestSource;

        /**
         * Sets the value of {@link SagemakerFlowDefinitionHumanLoopRequestSource#getAwsManagedHumanLoopRequestSource}
         * @param awsManagedHumanLoopRequestSource Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/sagemaker_flow_definition#aws_managed_human_loop_request_source SagemakerFlowDefinition#aws_managed_human_loop_request_source}. This parameter is required.
         * @return {@code this}
         */
        public Builder awsManagedHumanLoopRequestSource(java.lang.String awsManagedHumanLoopRequestSource) {
            this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SagemakerFlowDefinitionHumanLoopRequestSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SagemakerFlowDefinitionHumanLoopRequestSource build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SagemakerFlowDefinitionHumanLoopRequestSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SagemakerFlowDefinitionHumanLoopRequestSource {
        private final java.lang.String awsManagedHumanLoopRequestSource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.awsManagedHumanLoopRequestSource = software.amazon.jsii.Kernel.get(this, "awsManagedHumanLoopRequestSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.awsManagedHumanLoopRequestSource = java.util.Objects.requireNonNull(builder.awsManagedHumanLoopRequestSource, "awsManagedHumanLoopRequestSource is required");
        }

        @Override
        public final java.lang.String getAwsManagedHumanLoopRequestSource() {
            return this.awsManagedHumanLoopRequestSource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("awsManagedHumanLoopRequestSource", om.valueToTree(this.getAwsManagedHumanLoopRequestSource()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.sagemaker.SagemakerFlowDefinitionHumanLoopRequestSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SagemakerFlowDefinitionHumanLoopRequestSource.Jsii$Proxy that = (SagemakerFlowDefinitionHumanLoopRequestSource.Jsii$Proxy) o;

            return this.awsManagedHumanLoopRequestSource.equals(that.awsManagedHumanLoopRequestSource);
        }

        @Override
        public final int hashCode() {
            int result = this.awsManagedHumanLoopRequestSource.hashCode();
            return result;
        }
    }
}
