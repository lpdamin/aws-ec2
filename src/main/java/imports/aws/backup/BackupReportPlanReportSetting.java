package imports.aws.backup;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.850Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.backup.BackupReportPlanReportSetting")
@software.amazon.jsii.Jsii.Proxy(BackupReportPlanReportSetting.Jsii$Proxy.class)
public interface BackupReportPlanReportSetting extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_report_plan#report_template BackupReportPlan#report_template}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getReportTemplate();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_report_plan#framework_arns BackupReportPlan#framework_arns}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFrameworkArns() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_report_plan#number_of_frameworks BackupReportPlan#number_of_frameworks}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getNumberOfFrameworks() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link BackupReportPlanReportSetting}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link BackupReportPlanReportSetting}
     */
    public static final class Builder implements software.amazon.jsii.Builder<BackupReportPlanReportSetting> {
        java.lang.String reportTemplate;
        java.util.List<java.lang.String> frameworkArns;
        java.lang.Number numberOfFrameworks;

        /**
         * Sets the value of {@link BackupReportPlanReportSetting#getReportTemplate}
         * @param reportTemplate Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_report_plan#report_template BackupReportPlan#report_template}. This parameter is required.
         * @return {@code this}
         */
        public Builder reportTemplate(java.lang.String reportTemplate) {
            this.reportTemplate = reportTemplate;
            return this;
        }

        /**
         * Sets the value of {@link BackupReportPlanReportSetting#getFrameworkArns}
         * @param frameworkArns Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_report_plan#framework_arns BackupReportPlan#framework_arns}.
         * @return {@code this}
         */
        public Builder frameworkArns(java.util.List<java.lang.String> frameworkArns) {
            this.frameworkArns = frameworkArns;
            return this;
        }

        /**
         * Sets the value of {@link BackupReportPlanReportSetting#getNumberOfFrameworks}
         * @param numberOfFrameworks Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/backup_report_plan#number_of_frameworks BackupReportPlan#number_of_frameworks}.
         * @return {@code this}
         */
        public Builder numberOfFrameworks(java.lang.Number numberOfFrameworks) {
            this.numberOfFrameworks = numberOfFrameworks;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link BackupReportPlanReportSetting}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public BackupReportPlanReportSetting build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link BackupReportPlanReportSetting}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements BackupReportPlanReportSetting {
        private final java.lang.String reportTemplate;
        private final java.util.List<java.lang.String> frameworkArns;
        private final java.lang.Number numberOfFrameworks;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.reportTemplate = software.amazon.jsii.Kernel.get(this, "reportTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.frameworkArns = software.amazon.jsii.Kernel.get(this, "frameworkArns", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.numberOfFrameworks = software.amazon.jsii.Kernel.get(this, "numberOfFrameworks", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.reportTemplate = java.util.Objects.requireNonNull(builder.reportTemplate, "reportTemplate is required");
            this.frameworkArns = builder.frameworkArns;
            this.numberOfFrameworks = builder.numberOfFrameworks;
        }

        @Override
        public final java.lang.String getReportTemplate() {
            return this.reportTemplate;
        }

        @Override
        public final java.util.List<java.lang.String> getFrameworkArns() {
            return this.frameworkArns;
        }

        @Override
        public final java.lang.Number getNumberOfFrameworks() {
            return this.numberOfFrameworks;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("reportTemplate", om.valueToTree(this.getReportTemplate()));
            if (this.getFrameworkArns() != null) {
                data.set("frameworkArns", om.valueToTree(this.getFrameworkArns()));
            }
            if (this.getNumberOfFrameworks() != null) {
                data.set("numberOfFrameworks", om.valueToTree(this.getNumberOfFrameworks()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.backup.BackupReportPlanReportSetting"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BackupReportPlanReportSetting.Jsii$Proxy that = (BackupReportPlanReportSetting.Jsii$Proxy) o;

            if (!reportTemplate.equals(that.reportTemplate)) return false;
            if (this.frameworkArns != null ? !this.frameworkArns.equals(that.frameworkArns) : that.frameworkArns != null) return false;
            return this.numberOfFrameworks != null ? this.numberOfFrameworks.equals(that.numberOfFrameworks) : that.numberOfFrameworks == null;
        }

        @Override
        public final int hashCode() {
            int result = this.reportTemplate.hashCode();
            result = 31 * result + (this.frameworkArns != null ? this.frameworkArns.hashCode() : 0);
            result = 31 * result + (this.numberOfFrameworks != null ? this.numberOfFrameworks.hashCode() : 0);
            return result;
        }
    }
}
