package imports.aws.msk;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.883Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.msk.MskconnectCustomPluginLocation")
@software.amazon.jsii.Jsii.Proxy(MskconnectCustomPluginLocation.Jsii$Proxy.class)
public interface MskconnectCustomPluginLocation extends software.amazon.jsii.JsiiSerializable {

    /**
     * s3 block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#s3 MskconnectCustomPlugin#s3}
     */
    @org.jetbrains.annotations.NotNull imports.aws.msk.MskconnectCustomPluginLocationS3 getS3();

    /**
     * @return a {@link Builder} of {@link MskconnectCustomPluginLocation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MskconnectCustomPluginLocation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MskconnectCustomPluginLocation> {
        imports.aws.msk.MskconnectCustomPluginLocationS3 s3;

        /**
         * Sets the value of {@link MskconnectCustomPluginLocation#getS3}
         * @param s3 s3 block. This parameter is required.
         *           Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mskconnect_custom_plugin#s3 MskconnectCustomPlugin#s3}
         * @return {@code this}
         */
        public Builder s3(imports.aws.msk.MskconnectCustomPluginLocationS3 s3) {
            this.s3 = s3;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MskconnectCustomPluginLocation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MskconnectCustomPluginLocation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MskconnectCustomPluginLocation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MskconnectCustomPluginLocation {
        private final imports.aws.msk.MskconnectCustomPluginLocationS3 s3;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.s3 = software.amazon.jsii.Kernel.get(this, "s3", software.amazon.jsii.NativeType.forClass(imports.aws.msk.MskconnectCustomPluginLocationS3.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.s3 = java.util.Objects.requireNonNull(builder.s3, "s3 is required");
        }

        @Override
        public final imports.aws.msk.MskconnectCustomPluginLocationS3 getS3() {
            return this.s3;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("s3", om.valueToTree(this.getS3()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.msk.MskconnectCustomPluginLocation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MskconnectCustomPluginLocation.Jsii$Proxy that = (MskconnectCustomPluginLocation.Jsii$Proxy) o;

            return this.s3.equals(that.s3);
        }

        @Override
        public final int hashCode() {
            int result = this.s3.hashCode();
            return result;
        }
    }
}
