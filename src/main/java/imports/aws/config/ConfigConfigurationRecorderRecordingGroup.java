package imports.aws.config;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.207Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.config.ConfigConfigurationRecorderRecordingGroup")
@software.amazon.jsii.Jsii.Proxy(ConfigConfigurationRecorderRecordingGroup.Jsii$Proxy.class)
public interface ConfigConfigurationRecorderRecordingGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#all_supported ConfigConfigurationRecorder#all_supported}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllSupported() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#include_global_resource_types ConfigConfigurationRecorder#include_global_resource_types}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeGlobalResourceTypes() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#resource_types ConfigConfigurationRecorder#resource_types}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getResourceTypes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigConfigurationRecorderRecordingGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigConfigurationRecorderRecordingGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigConfigurationRecorderRecordingGroup> {
        java.lang.Object allSupported;
        java.lang.Object includeGlobalResourceTypes;
        java.util.List<java.lang.String> resourceTypes;

        /**
         * Sets the value of {@link ConfigConfigurationRecorderRecordingGroup#getAllSupported}
         * @param allSupported Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#all_supported ConfigConfigurationRecorder#all_supported}.
         * @return {@code this}
         */
        public Builder allSupported(java.lang.Boolean allSupported) {
            this.allSupported = allSupported;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigurationRecorderRecordingGroup#getAllSupported}
         * @param allSupported Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#all_supported ConfigConfigurationRecorder#all_supported}.
         * @return {@code this}
         */
        public Builder allSupported(com.hashicorp.cdktf.IResolvable allSupported) {
            this.allSupported = allSupported;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigurationRecorderRecordingGroup#getIncludeGlobalResourceTypes}
         * @param includeGlobalResourceTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#include_global_resource_types ConfigConfigurationRecorder#include_global_resource_types}.
         * @return {@code this}
         */
        public Builder includeGlobalResourceTypes(java.lang.Boolean includeGlobalResourceTypes) {
            this.includeGlobalResourceTypes = includeGlobalResourceTypes;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigurationRecorderRecordingGroup#getIncludeGlobalResourceTypes}
         * @param includeGlobalResourceTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#include_global_resource_types ConfigConfigurationRecorder#include_global_resource_types}.
         * @return {@code this}
         */
        public Builder includeGlobalResourceTypes(com.hashicorp.cdktf.IResolvable includeGlobalResourceTypes) {
            this.includeGlobalResourceTypes = includeGlobalResourceTypes;
            return this;
        }

        /**
         * Sets the value of {@link ConfigConfigurationRecorderRecordingGroup#getResourceTypes}
         * @param resourceTypes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/config_configuration_recorder#resource_types ConfigConfigurationRecorder#resource_types}.
         * @return {@code this}
         */
        public Builder resourceTypes(java.util.List<java.lang.String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigConfigurationRecorderRecordingGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigConfigurationRecorderRecordingGroup build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link ConfigConfigurationRecorderRecordingGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigConfigurationRecorderRecordingGroup {
        private final java.lang.Object allSupported;
        private final java.lang.Object includeGlobalResourceTypes;
        private final java.util.List<java.lang.String> resourceTypes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.allSupported = software.amazon.jsii.Kernel.get(this, "allSupported", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.includeGlobalResourceTypes = software.amazon.jsii.Kernel.get(this, "includeGlobalResourceTypes", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.resourceTypes = software.amazon.jsii.Kernel.get(this, "resourceTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.allSupported = builder.allSupported;
            this.includeGlobalResourceTypes = builder.includeGlobalResourceTypes;
            this.resourceTypes = builder.resourceTypes;
        }

        @Override
        public final java.lang.Object getAllSupported() {
            return this.allSupported;
        }

        @Override
        public final java.lang.Object getIncludeGlobalResourceTypes() {
            return this.includeGlobalResourceTypes;
        }

        @Override
        public final java.util.List<java.lang.String> getResourceTypes() {
            return this.resourceTypes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAllSupported() != null) {
                data.set("allSupported", om.valueToTree(this.getAllSupported()));
            }
            if (this.getIncludeGlobalResourceTypes() != null) {
                data.set("includeGlobalResourceTypes", om.valueToTree(this.getIncludeGlobalResourceTypes()));
            }
            if (this.getResourceTypes() != null) {
                data.set("resourceTypes", om.valueToTree(this.getResourceTypes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.config.ConfigConfigurationRecorderRecordingGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigConfigurationRecorderRecordingGroup.Jsii$Proxy that = (ConfigConfigurationRecorderRecordingGroup.Jsii$Proxy) o;

            if (this.allSupported != null ? !this.allSupported.equals(that.allSupported) : that.allSupported != null) return false;
            if (this.includeGlobalResourceTypes != null ? !this.includeGlobalResourceTypes.equals(that.includeGlobalResourceTypes) : that.includeGlobalResourceTypes != null) return false;
            return this.resourceTypes != null ? this.resourceTypes.equals(that.resourceTypes) : that.resourceTypes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.allSupported != null ? this.allSupported.hashCode() : 0;
            result = 31 * result + (this.includeGlobalResourceTypes != null ? this.includeGlobalResourceTypes.hashCode() : 0);
            result = 31 * result + (this.resourceTypes != null ? this.resourceTypes.hashCode() : 0);
            return result;
        }
    }
}
