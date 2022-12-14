package imports.aws.batch;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.884Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.batch.BatchJobDefinitionTimeout")
@software.amazon.jsii.Jsii.Proxy(BatchJobDefinitionTimeout.Jsii$Proxy.class)
public interface BatchJobDefinitionTimeout extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/batch_job_definition#attempt_duration_seconds BatchJobDefinition#attempt_duration_seconds}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getAttemptDurationSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BatchJobDefinitionTimeout}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BatchJobDefinitionTimeout}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BatchJobDefinitionTimeout> {
        java.lang.Number attemptDurationSeconds;

        /**
         * Sets the value of {@link BatchJobDefinitionTimeout#getAttemptDurationSeconds}
         * @param attemptDurationSeconds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/batch_job_definition#attempt_duration_seconds BatchJobDefinition#attempt_duration_seconds}.
         * @return {@code this}
         */
        public Builder attemptDurationSeconds(java.lang.Number attemptDurationSeconds) {
            this.attemptDurationSeconds = attemptDurationSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BatchJobDefinitionTimeout}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BatchJobDefinitionTimeout build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BatchJobDefinitionTimeout}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BatchJobDefinitionTimeout {
        private final java.lang.Number attemptDurationSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.attemptDurationSeconds = software.amazon.jsii.Kernel.get(this, "attemptDurationSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.attemptDurationSeconds = builder.attemptDurationSeconds;
        }

        @Override
        public final java.lang.Number getAttemptDurationSeconds() {
            return this.attemptDurationSeconds;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAttemptDurationSeconds() != null) {
                data.set("attemptDurationSeconds", om.valueToTree(this.getAttemptDurationSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.batch.BatchJobDefinitionTimeout"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BatchJobDefinitionTimeout.Jsii$Proxy that = (BatchJobDefinitionTimeout.Jsii$Proxy) o;

            return this.attemptDurationSeconds != null ? this.attemptDurationSeconds.equals(that.attemptDurationSeconds) : that.attemptDurationSeconds == null;
        }

        @Override
        public final int hashCode() {
            int result = this.attemptDurationSeconds != null ? this.attemptDurationSeconds.hashCode() : 0;
            return result;
        }
    }
}
