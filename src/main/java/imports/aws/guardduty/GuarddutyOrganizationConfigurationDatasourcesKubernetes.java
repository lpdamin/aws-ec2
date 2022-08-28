package imports.aws.guardduty;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:17:00.415Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetes")
@software.amazon.jsii.Jsii.Proxy(GuarddutyOrganizationConfigurationDatasourcesKubernetes.Jsii$Proxy.class)
public interface GuarddutyOrganizationConfigurationDatasourcesKubernetes extends software.amazon.jsii.JsiiSerializable {

    /**
     * audit_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/guardduty_organization_configuration#audit_logs GuarddutyOrganizationConfiguration#audit_logs}
     */
    @org.jetbrains.annotations.NotNull imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs getAuditLogs();

    /**
     * @return a {@link Builder} of {@link GuarddutyOrganizationConfigurationDatasourcesKubernetes}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link GuarddutyOrganizationConfigurationDatasourcesKubernetes}
     */
    public static final class Builder implements software.amazon.jsii.Builder<GuarddutyOrganizationConfigurationDatasourcesKubernetes> {
        imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs;

        /**
         * Sets the value of {@link GuarddutyOrganizationConfigurationDatasourcesKubernetes#getAuditLogs}
         * @param auditLogs audit_logs block. This parameter is required.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/guardduty_organization_configuration#audit_logs GuarddutyOrganizationConfiguration#audit_logs}
         * @return {@code this}
         */
        public Builder auditLogs(imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs) {
            this.auditLogs = auditLogs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link GuarddutyOrganizationConfigurationDatasourcesKubernetes}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public GuarddutyOrganizationConfigurationDatasourcesKubernetes build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link GuarddutyOrganizationConfigurationDatasourcesKubernetes}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements GuarddutyOrganizationConfigurationDatasourcesKubernetes {
        private final imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs auditLogs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.auditLogs = software.amazon.jsii.Kernel.get(this, "auditLogs", software.amazon.jsii.NativeType.forClass(imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.auditLogs = java.util.Objects.requireNonNull(builder.auditLogs, "auditLogs is required");
        }

        @Override
        public final imports.aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetesAuditLogs getAuditLogs() {
            return this.auditLogs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("auditLogs", om.valueToTree(this.getAuditLogs()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.guardduty.GuarddutyOrganizationConfigurationDatasourcesKubernetes"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            GuarddutyOrganizationConfigurationDatasourcesKubernetes.Jsii$Proxy that = (GuarddutyOrganizationConfigurationDatasourcesKubernetes.Jsii$Proxy) o;

            return this.auditLogs.equals(that.auditLogs);
        }

        @Override
        public final int hashCode() {
            int result = this.auditLogs.hashCode();
            return result;
        }
    }
}
