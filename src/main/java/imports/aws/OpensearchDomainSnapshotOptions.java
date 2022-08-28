package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:55.938Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.OpensearchDomainSnapshotOptions")
@software.amazon.jsii.Jsii.Proxy(OpensearchDomainSnapshotOptions.Jsii$Proxy.class)
public interface OpensearchDomainSnapshotOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#automated_snapshot_start_hour OpensearchDomain#automated_snapshot_start_hour}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getAutomatedSnapshotStartHour();

    /**
     * @return a {@link Builder} of {@link OpensearchDomainSnapshotOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link OpensearchDomainSnapshotOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<OpensearchDomainSnapshotOptions> {
        java.lang.Number automatedSnapshotStartHour;

        /**
         * Sets the value of {@link OpensearchDomainSnapshotOptions#getAutomatedSnapshotStartHour}
         * @param automatedSnapshotStartHour Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/opensearch_domain#automated_snapshot_start_hour OpensearchDomain#automated_snapshot_start_hour}. This parameter is required.
         * @return {@code this}
         */
        public Builder automatedSnapshotStartHour(java.lang.Number automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = automatedSnapshotStartHour;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link OpensearchDomainSnapshotOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public OpensearchDomainSnapshotOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link OpensearchDomainSnapshotOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements OpensearchDomainSnapshotOptions {
        private final java.lang.Number automatedSnapshotStartHour;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.automatedSnapshotStartHour = software.amazon.jsii.Kernel.get(this, "automatedSnapshotStartHour", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.automatedSnapshotStartHour = java.util.Objects.requireNonNull(builder.automatedSnapshotStartHour, "automatedSnapshotStartHour is required");
        }

        @Override
        public final java.lang.Number getAutomatedSnapshotStartHour() {
            return this.automatedSnapshotStartHour;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("automatedSnapshotStartHour", om.valueToTree(this.getAutomatedSnapshotStartHour()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.OpensearchDomainSnapshotOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            OpensearchDomainSnapshotOptions.Jsii$Proxy that = (OpensearchDomainSnapshotOptions.Jsii$Proxy) o;

            return this.automatedSnapshotStartHour.equals(that.automatedSnapshotStartHour);
        }

        @Override
        public final int hashCode() {
            int result = this.automatedSnapshotStartHour.hashCode();
            return result;
        }
    }
}
