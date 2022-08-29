package imports.aws.quicksight;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:50.192Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.quicksight.QuicksightDataSourceParametersAthena")
@software.amazon.jsii.Jsii.Proxy(QuicksightDataSourceParametersAthena.Jsii$Proxy.class)
public interface QuicksightDataSourceParametersAthena extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#work_group QuicksightDataSource#work_group}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getWorkGroup() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link QuicksightDataSourceParametersAthena}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link QuicksightDataSourceParametersAthena}
     */
    public static final class Builder implements software.amazon.jsii.Builder<QuicksightDataSourceParametersAthena> {
        java.lang.String workGroup;

        /**
         * Sets the value of {@link QuicksightDataSourceParametersAthena#getWorkGroup}
         * @param workGroup Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/quicksight_data_source#work_group QuicksightDataSource#work_group}.
         * @return {@code this}
         */
        public Builder workGroup(java.lang.String workGroup) {
            this.workGroup = workGroup;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link QuicksightDataSourceParametersAthena}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public QuicksightDataSourceParametersAthena build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link QuicksightDataSourceParametersAthena}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements QuicksightDataSourceParametersAthena {
        private final java.lang.String workGroup;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.workGroup = software.amazon.jsii.Kernel.get(this, "workGroup", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.workGroup = builder.workGroup;
        }

        @Override
        public final java.lang.String getWorkGroup() {
            return this.workGroup;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getWorkGroup() != null) {
                data.set("workGroup", om.valueToTree(this.getWorkGroup()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.quicksight.QuicksightDataSourceParametersAthena"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            QuicksightDataSourceParametersAthena.Jsii$Proxy that = (QuicksightDataSourceParametersAthena.Jsii$Proxy) o;

            return this.workGroup != null ? this.workGroup.equals(that.workGroup) : that.workGroup == null;
        }

        @Override
        public final int hashCode() {
            int result = this.workGroup != null ? this.workGroup.hashCode() : 0;
            return result;
        }
    }
}
