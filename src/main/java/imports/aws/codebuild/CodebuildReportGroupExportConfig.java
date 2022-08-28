package imports.aws.codebuild;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:57.488Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.codebuild.CodebuildReportGroupExportConfig")
@software.amazon.jsii.Jsii.Proxy(CodebuildReportGroupExportConfig.Jsii$Proxy.class)
public interface CodebuildReportGroupExportConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_report_group#type CodebuildReportGroup#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * s3_destination block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_report_group#s3_destination CodebuildReportGroup#s3_destination}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination getS3Destination() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CodebuildReportGroupExportConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CodebuildReportGroupExportConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CodebuildReportGroupExportConfig> {
        java.lang.String type;
        imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination s3Destination;

        /**
         * Sets the value of {@link CodebuildReportGroupExportConfig#getType}
         * @param type Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/codebuild_report_group#type CodebuildReportGroup#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link CodebuildReportGroupExportConfig#getS3Destination}
         * @param s3Destination s3_destination block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/codebuild_report_group#s3_destination CodebuildReportGroup#s3_destination}
         * @return {@code this}
         */
        public Builder s3Destination(imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination s3Destination) {
            this.s3Destination = s3Destination;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CodebuildReportGroupExportConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CodebuildReportGroupExportConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CodebuildReportGroupExportConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CodebuildReportGroupExportConfig {
        private final java.lang.String type;
        private final imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination s3Destination;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3Destination = software.amazon.jsii.Kernel.get(this, "s3Destination", software.amazon.jsii.NativeType.forClass(imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.s3Destination = builder.s3Destination;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.aws.codebuild.CodebuildReportGroupExportConfigS3Destination getS3Destination() {
            return this.s3Destination;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getS3Destination() != null) {
                data.set("s3Destination", om.valueToTree(this.getS3Destination()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.codebuild.CodebuildReportGroupExportConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodebuildReportGroupExportConfig.Jsii$Proxy that = (CodebuildReportGroupExportConfig.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            return this.s3Destination != null ? this.s3Destination.equals(that.s3Destination) : that.s3Destination == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.s3Destination != null ? this.s3Destination.hashCode() : 0);
            return result;
        }
    }
}
