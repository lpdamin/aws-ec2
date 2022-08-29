package imports.aws.mwaa;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:49.993Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.mwaa.MwaaEnvironmentLoggingConfiguration")
@software.amazon.jsii.Jsii.Proxy(MwaaEnvironmentLoggingConfiguration.Jsii$Proxy.class)
public interface MwaaEnvironmentLoggingConfiguration extends software.amazon.jsii.JsiiSerializable {

    /**
     * dag_processing_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#dag_processing_logs MwaaEnvironment#dag_processing_logs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs getDagProcessingLogs() {
        return null;
    }

    /**
     * scheduler_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#scheduler_logs MwaaEnvironment#scheduler_logs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs getSchedulerLogs() {
        return null;
    }

    /**
     * task_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#task_logs MwaaEnvironment#task_logs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs getTaskLogs() {
        return null;
    }

    /**
     * webserver_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#webserver_logs MwaaEnvironment#webserver_logs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs getWebserverLogs() {
        return null;
    }

    /**
     * worker_logs block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#worker_logs MwaaEnvironment#worker_logs}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs getWorkerLogs() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MwaaEnvironmentLoggingConfiguration}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MwaaEnvironmentLoggingConfiguration}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MwaaEnvironmentLoggingConfiguration> {
        imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs;
        imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs schedulerLogs;
        imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs taskLogs;
        imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs webserverLogs;
        imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs workerLogs;

        /**
         * Sets the value of {@link MwaaEnvironmentLoggingConfiguration#getDagProcessingLogs}
         * @param dagProcessingLogs dag_processing_logs block.
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#dag_processing_logs MwaaEnvironment#dag_processing_logs}
         * @return {@code this}
         */
        public Builder dagProcessingLogs(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs) {
            this.dagProcessingLogs = dagProcessingLogs;
            return this;
        }

        /**
         * Sets the value of {@link MwaaEnvironmentLoggingConfiguration#getSchedulerLogs}
         * @param schedulerLogs scheduler_logs block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#scheduler_logs MwaaEnvironment#scheduler_logs}
         * @return {@code this}
         */
        public Builder schedulerLogs(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs schedulerLogs) {
            this.schedulerLogs = schedulerLogs;
            return this;
        }

        /**
         * Sets the value of {@link MwaaEnvironmentLoggingConfiguration#getTaskLogs}
         * @param taskLogs task_logs block.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#task_logs MwaaEnvironment#task_logs}
         * @return {@code this}
         */
        public Builder taskLogs(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs taskLogs) {
            this.taskLogs = taskLogs;
            return this;
        }

        /**
         * Sets the value of {@link MwaaEnvironmentLoggingConfiguration#getWebserverLogs}
         * @param webserverLogs webserver_logs block.
         *                      Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#webserver_logs MwaaEnvironment#webserver_logs}
         * @return {@code this}
         */
        public Builder webserverLogs(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs webserverLogs) {
            this.webserverLogs = webserverLogs;
            return this;
        }

        /**
         * Sets the value of {@link MwaaEnvironmentLoggingConfiguration#getWorkerLogs}
         * @param workerLogs worker_logs block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/mwaa_environment#worker_logs MwaaEnvironment#worker_logs}
         * @return {@code this}
         */
        public Builder workerLogs(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs workerLogs) {
            this.workerLogs = workerLogs;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MwaaEnvironmentLoggingConfiguration}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MwaaEnvironmentLoggingConfiguration build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MwaaEnvironmentLoggingConfiguration}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MwaaEnvironmentLoggingConfiguration {
        private final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs dagProcessingLogs;
        private final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs schedulerLogs;
        private final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs taskLogs;
        private final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs webserverLogs;
        private final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs workerLogs;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.dagProcessingLogs = software.amazon.jsii.Kernel.get(this, "dagProcessingLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs.class));
            this.schedulerLogs = software.amazon.jsii.Kernel.get(this, "schedulerLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs.class));
            this.taskLogs = software.amazon.jsii.Kernel.get(this, "taskLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs.class));
            this.webserverLogs = software.amazon.jsii.Kernel.get(this, "webserverLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs.class));
            this.workerLogs = software.amazon.jsii.Kernel.get(this, "workerLogs", software.amazon.jsii.NativeType.forClass(imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.dagProcessingLogs = builder.dagProcessingLogs;
            this.schedulerLogs = builder.schedulerLogs;
            this.taskLogs = builder.taskLogs;
            this.webserverLogs = builder.webserverLogs;
            this.workerLogs = builder.workerLogs;
        }

        @Override
        public final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationDagProcessingLogs getDagProcessingLogs() {
            return this.dagProcessingLogs;
        }

        @Override
        public final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationSchedulerLogs getSchedulerLogs() {
            return this.schedulerLogs;
        }

        @Override
        public final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationTaskLogs getTaskLogs() {
            return this.taskLogs;
        }

        @Override
        public final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWebserverLogs getWebserverLogs() {
            return this.webserverLogs;
        }

        @Override
        public final imports.aws.mwaa.MwaaEnvironmentLoggingConfigurationWorkerLogs getWorkerLogs() {
            return this.workerLogs;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDagProcessingLogs() != null) {
                data.set("dagProcessingLogs", om.valueToTree(this.getDagProcessingLogs()));
            }
            if (this.getSchedulerLogs() != null) {
                data.set("schedulerLogs", om.valueToTree(this.getSchedulerLogs()));
            }
            if (this.getTaskLogs() != null) {
                data.set("taskLogs", om.valueToTree(this.getTaskLogs()));
            }
            if (this.getWebserverLogs() != null) {
                data.set("webserverLogs", om.valueToTree(this.getWebserverLogs()));
            }
            if (this.getWorkerLogs() != null) {
                data.set("workerLogs", om.valueToTree(this.getWorkerLogs()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.mwaa.MwaaEnvironmentLoggingConfiguration"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MwaaEnvironmentLoggingConfiguration.Jsii$Proxy that = (MwaaEnvironmentLoggingConfiguration.Jsii$Proxy) o;

            if (this.dagProcessingLogs != null ? !this.dagProcessingLogs.equals(that.dagProcessingLogs) : that.dagProcessingLogs != null) return false;
            if (this.schedulerLogs != null ? !this.schedulerLogs.equals(that.schedulerLogs) : that.schedulerLogs != null) return false;
            if (this.taskLogs != null ? !this.taskLogs.equals(that.taskLogs) : that.taskLogs != null) return false;
            if (this.webserverLogs != null ? !this.webserverLogs.equals(that.webserverLogs) : that.webserverLogs != null) return false;
            return this.workerLogs != null ? this.workerLogs.equals(that.workerLogs) : that.workerLogs == null;
        }

        @Override
        public final int hashCode() {
            int result = this.dagProcessingLogs != null ? this.dagProcessingLogs.hashCode() : 0;
            result = 31 * result + (this.schedulerLogs != null ? this.schedulerLogs.hashCode() : 0);
            result = 31 * result + (this.taskLogs != null ? this.taskLogs.hashCode() : 0);
            result = 31 * result + (this.webserverLogs != null ? this.webserverLogs.hashCode() : 0);
            result = 31 * result + (this.workerLogs != null ? this.workerLogs.hashCode() : 0);
            return result;
        }
    }
}
