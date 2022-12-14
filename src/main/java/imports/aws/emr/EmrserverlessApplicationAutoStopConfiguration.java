package imports.aws.emr;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.138Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.emr.EmrserverlessApplicationAutoStopConfiguration")
@software.amazon.jsii.Jsii.Proxy(EmrserverlessApplicationAutoStopConfiguration.Jsii$Proxy.class)
public interface EmrserverlessApplicationAutoStopConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#enabled EmrserverlessApplication#enabled}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEnabled() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#idle_timeout_minutes EmrserverlessApplication#idle_timeout_minutes}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getIdleTimeoutMinutes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EmrserverlessApplicationAutoStopConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EmrserverlessApplicationAutoStopConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EmrserverlessApplicationAutoStopConfiguration> {
        java.lang.Object enabled;
        java.lang.Number idleTimeoutMinutes;

        /**
         * Sets the value of {@link EmrserverlessApplicationAutoStopConfiguration#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#enabled EmrserverlessApplication#enabled}.
         * @return {@code this}
         */
        public Builder enabled(java.lang.Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link EmrserverlessApplicationAutoStopConfiguration#getEnabled}
         * @param enabled Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#enabled EmrserverlessApplication#enabled}.
         * @return {@code this}
         */
        public Builder enabled(com.hashicorp.cdktf.IResolvable enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the value of {@link EmrserverlessApplicationAutoStopConfiguration#getIdleTimeoutMinutes}
         * @param idleTimeoutMinutes Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/emrserverless_application#idle_timeout_minutes EmrserverlessApplication#idle_timeout_minutes}.
         * @return {@code this}
         */
        public Builder idleTimeoutMinutes(java.lang.Number idleTimeoutMinutes) {
            this.idleTimeoutMinutes = idleTimeoutMinutes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EmrserverlessApplicationAutoStopConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EmrserverlessApplicationAutoStopConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EmrserverlessApplicationAutoStopConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EmrserverlessApplicationAutoStopConfiguration {
        private final java.lang.Object enabled;
        private final java.lang.Number idleTimeoutMinutes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.enabled = software.amazon.jsii.Kernel.get(this, "enabled", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.idleTimeoutMinutes = software.amazon.jsii.Kernel.get(this, "idleTimeoutMinutes", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.enabled = builder.enabled;
            this.idleTimeoutMinutes = builder.idleTimeoutMinutes;
        }

        @Override
        public final java.lang.Object getEnabled() {
            return this.enabled;
        }

        @Override
        public final java.lang.Number getIdleTimeoutMinutes() {
            return this.idleTimeoutMinutes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEnabled() != null) {
                data.set("enabled", om.valueToTree(this.getEnabled()));
            }
            if (this.getIdleTimeoutMinutes() != null) {
                data.set("idleTimeoutMinutes", om.valueToTree(this.getIdleTimeoutMinutes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.emr.EmrserverlessApplicationAutoStopConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EmrserverlessApplicationAutoStopConfiguration.Jsii$Proxy that = (EmrserverlessApplicationAutoStopConfiguration.Jsii$Proxy) o;

            if (this.enabled != null ? !this.enabled.equals(that.enabled) : that.enabled != null) return false;
            return this.idleTimeoutMinutes != null ? this.idleTimeoutMinutes.equals(that.idleTimeoutMinutes) : that.idleTimeoutMinutes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.enabled != null ? this.enabled.hashCode() : 0;
            result = 31 * result + (this.idleTimeoutMinutes != null ? this.idleTimeoutMinutes.hashCode() : 0);
            return result;
        }
    }
}
