package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.826Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.LaunchTemplateInstanceRequirementsMemoryMib")
@software.amazon.jsii.Jsii.Proxy(LaunchTemplateInstanceRequirementsMemoryMib.Jsii$Proxy.class)
public interface LaunchTemplateInstanceRequirementsMemoryMib extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/launch_template#min LaunchTemplate#min}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getMin();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/launch_template#max LaunchTemplate#max}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMax() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LaunchTemplateInstanceRequirementsMemoryMib}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LaunchTemplateInstanceRequirementsMemoryMib}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LaunchTemplateInstanceRequirementsMemoryMib> {
        java.lang.Number min;
        java.lang.Number max;

        /**
         * Sets the value of {@link LaunchTemplateInstanceRequirementsMemoryMib#getMin}
         * @param min Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/launch_template#min LaunchTemplate#min}. This parameter is required.
         * @return {@code this}
         */
        public Builder min(java.lang.Number min) {
            this.min = min;
            return this;
        }

        /**
         * Sets the value of {@link LaunchTemplateInstanceRequirementsMemoryMib#getMax}
         * @param max Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/launch_template#max LaunchTemplate#max}.
         * @return {@code this}
         */
        public Builder max(java.lang.Number max) {
            this.max = max;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LaunchTemplateInstanceRequirementsMemoryMib}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LaunchTemplateInstanceRequirementsMemoryMib build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LaunchTemplateInstanceRequirementsMemoryMib}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LaunchTemplateInstanceRequirementsMemoryMib {
        private final java.lang.Number min;
        private final java.lang.Number max;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.min = software.amazon.jsii.Kernel.get(this, "min", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.max = software.amazon.jsii.Kernel.get(this, "max", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.min = java.util.Objects.requireNonNull(builder.min, "min is required");
            this.max = builder.max;
        }

        @Override
        public final java.lang.Number getMin() {
            return this.min;
        }

        @Override
        public final java.lang.Number getMax() {
            return this.max;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("min", om.valueToTree(this.getMin()));
            if (this.getMax() != null) {
                data.set("max", om.valueToTree(this.getMax()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.LaunchTemplateInstanceRequirementsMemoryMib"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LaunchTemplateInstanceRequirementsMemoryMib.Jsii$Proxy that = (LaunchTemplateInstanceRequirementsMemoryMib.Jsii$Proxy) o;

            if (!min.equals(that.min)) return false;
            return this.max != null ? this.max.equals(that.max) : that.max == null;
        }

        @Override
        public final int hashCode() {
            int result = this.min.hashCode();
            result = 31 * result + (this.max != null ? this.max.hashCode() : 0);
            return result;
        }
    }
}
