package imports.aws.ec2;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:48.538Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ec2.DataAwsEbsEncryptionByDefaultTimeouts")
@software.amazon.jsii.Jsii.Proxy(DataAwsEbsEncryptionByDefaultTimeouts.Jsii$Proxy.class)
public interface DataAwsEbsEncryptionByDefaultTimeouts extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ebs_encryption_by_default#read DataAwsEbsEncryptionByDefault#read}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRead() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsEbsEncryptionByDefaultTimeouts}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsEbsEncryptionByDefaultTimeouts}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsEbsEncryptionByDefaultTimeouts> {
        java.lang.String read;

        /**
         * Sets the value of {@link DataAwsEbsEncryptionByDefaultTimeouts#getRead}
         * @param read Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/ebs_encryption_by_default#read DataAwsEbsEncryptionByDefault#read}.
         * @return {@code this}
         */
        public Builder read(java.lang.String read) {
            this.read = read;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsEbsEncryptionByDefaultTimeouts}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsEbsEncryptionByDefaultTimeouts build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsEbsEncryptionByDefaultTimeouts}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsEbsEncryptionByDefaultTimeouts {
        private final java.lang.String read;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.read = software.amazon.jsii.Kernel.get(this, "read", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.read = builder.read;
        }

        @Override
        public final java.lang.String getRead() {
            return this.read;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRead() != null) {
                data.set("read", om.valueToTree(this.getRead()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ec2.DataAwsEbsEncryptionByDefaultTimeouts"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsEbsEncryptionByDefaultTimeouts.Jsii$Proxy that = (DataAwsEbsEncryptionByDefaultTimeouts.Jsii$Proxy) o;

            return this.read != null ? this.read.equals(that.read) : that.read == null;
        }

        @Override
        public final int hashCode() {
            int result = this.read != null ? this.read.hashCode() : 0;
            return result;
        }
    }
}
