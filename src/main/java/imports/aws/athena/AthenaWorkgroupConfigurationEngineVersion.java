package imports.aws.athena;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.780Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.athena.AthenaWorkgroupConfigurationEngineVersion")
@software.amazon.jsii.Jsii.Proxy(AthenaWorkgroupConfigurationEngineVersion.Jsii$Proxy.class)
public interface AthenaWorkgroupConfigurationEngineVersion extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/athena_workgroup#selected_engine_version AthenaWorkgroup#selected_engine_version}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSelectedEngineVersion() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AthenaWorkgroupConfigurationEngineVersion}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AthenaWorkgroupConfigurationEngineVersion}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AthenaWorkgroupConfigurationEngineVersion> {
        java.lang.String selectedEngineVersion;

        /**
         * Sets the value of {@link AthenaWorkgroupConfigurationEngineVersion#getSelectedEngineVersion}
         * @param selectedEngineVersion Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/athena_workgroup#selected_engine_version AthenaWorkgroup#selected_engine_version}.
         * @return {@code this}
         */
        public Builder selectedEngineVersion(java.lang.String selectedEngineVersion) {
            this.selectedEngineVersion = selectedEngineVersion;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AthenaWorkgroupConfigurationEngineVersion}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AthenaWorkgroupConfigurationEngineVersion build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AthenaWorkgroupConfigurationEngineVersion}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AthenaWorkgroupConfigurationEngineVersion {
        private final java.lang.String selectedEngineVersion;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.selectedEngineVersion = software.amazon.jsii.Kernel.get(this, "selectedEngineVersion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.selectedEngineVersion = builder.selectedEngineVersion;
        }

        @Override
        public final java.lang.String getSelectedEngineVersion() {
            return this.selectedEngineVersion;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getSelectedEngineVersion() != null) {
                data.set("selectedEngineVersion", om.valueToTree(this.getSelectedEngineVersion()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.athena.AthenaWorkgroupConfigurationEngineVersion"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AthenaWorkgroupConfigurationEngineVersion.Jsii$Proxy that = (AthenaWorkgroupConfigurationEngineVersion.Jsii$Proxy) o;

            return this.selectedEngineVersion != null ? this.selectedEngineVersion.equals(that.selectedEngineVersion) : that.selectedEngineVersion == null;
        }

        @Override
        public final int hashCode() {
            int result = this.selectedEngineVersion != null ? this.selectedEngineVersion.hashCode() : 0;
            return result;
        }
    }
}
