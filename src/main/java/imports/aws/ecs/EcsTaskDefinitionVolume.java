package imports.aws.ecs;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.409Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.ecs.EcsTaskDefinitionVolume")
@software.amazon.jsii.Jsii.Proxy(EcsTaskDefinitionVolume.Jsii$Proxy.class)
public interface EcsTaskDefinitionVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#name EcsTaskDefinition#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * docker_volume_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#docker_volume_configuration EcsTaskDefinition#docker_volume_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration getDockerVolumeConfiguration() {
        return null;
    }

    /**
     * efs_volume_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#efs_volume_configuration EcsTaskDefinition#efs_volume_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration getEfsVolumeConfiguration() {
        return null;
    }

    /**
     * fsx_windows_file_server_volume_configuration block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#fsx_windows_file_server_volume_configuration EcsTaskDefinition#fsx_windows_file_server_volume_configuration}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration getFsxWindowsFileServerVolumeConfiguration() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#host_path EcsTaskDefinition#host_path}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link EcsTaskDefinitionVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EcsTaskDefinitionVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EcsTaskDefinitionVolume> {
        java.lang.String name;
        imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration;
        imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration;
        imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration;
        java.lang.String hostPath;

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getName}
         * @param name Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#name EcsTaskDefinition#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getDockerVolumeConfiguration}
         * @param dockerVolumeConfiguration docker_volume_configuration block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#docker_volume_configuration EcsTaskDefinition#docker_volume_configuration}
         * @return {@code this}
         */
        public Builder dockerVolumeConfiguration(imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration) {
            this.dockerVolumeConfiguration = dockerVolumeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getEfsVolumeConfiguration}
         * @param efsVolumeConfiguration efs_volume_configuration block.
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#efs_volume_configuration EcsTaskDefinition#efs_volume_configuration}
         * @return {@code this}
         */
        public Builder efsVolumeConfiguration(imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration) {
            this.efsVolumeConfiguration = efsVolumeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getFsxWindowsFileServerVolumeConfiguration}
         * @param fsxWindowsFileServerVolumeConfiguration fsx_windows_file_server_volume_configuration block.
         *                                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#fsx_windows_file_server_volume_configuration EcsTaskDefinition#fsx_windows_file_server_volume_configuration}
         * @return {@code this}
         */
        public Builder fsxWindowsFileServerVolumeConfiguration(imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration) {
            this.fsxWindowsFileServerVolumeConfiguration = fsxWindowsFileServerVolumeConfiguration;
            return this;
        }

        /**
         * Sets the value of {@link EcsTaskDefinitionVolume#getHostPath}
         * @param hostPath Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/r/ecs_task_definition#host_path EcsTaskDefinition#host_path}.
         * @return {@code this}
         */
        public Builder hostPath(java.lang.String hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EcsTaskDefinitionVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EcsTaskDefinitionVolume build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link EcsTaskDefinitionVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EcsTaskDefinitionVolume {
        private final java.lang.String name;
        private final imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration dockerVolumeConfiguration;
        private final imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration efsVolumeConfiguration;
        private final imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration fsxWindowsFileServerVolumeConfiguration;
        private final java.lang.String hostPath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.dockerVolumeConfiguration = software.amazon.jsii.Kernel.get(this, "dockerVolumeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration.class));
            this.efsVolumeConfiguration = software.amazon.jsii.Kernel.get(this, "efsVolumeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration.class));
            this.fsxWindowsFileServerVolumeConfiguration = software.amazon.jsii.Kernel.get(this, "fsxWindowsFileServerVolumeConfiguration", software.amazon.jsii.NativeType.forClass(imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration.class));
            this.hostPath = software.amazon.jsii.Kernel.get(this, "hostPath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.dockerVolumeConfiguration = builder.dockerVolumeConfiguration;
            this.efsVolumeConfiguration = builder.efsVolumeConfiguration;
            this.fsxWindowsFileServerVolumeConfiguration = builder.fsxWindowsFileServerVolumeConfiguration;
            this.hostPath = builder.hostPath;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final imports.aws.ecs.EcsTaskDefinitionVolumeDockerVolumeConfiguration getDockerVolumeConfiguration() {
            return this.dockerVolumeConfiguration;
        }

        @Override
        public final imports.aws.ecs.EcsTaskDefinitionVolumeEfsVolumeConfiguration getEfsVolumeConfiguration() {
            return this.efsVolumeConfiguration;
        }

        @Override
        public final imports.aws.ecs.EcsTaskDefinitionVolumeFsxWindowsFileServerVolumeConfiguration getFsxWindowsFileServerVolumeConfiguration() {
            return this.fsxWindowsFileServerVolumeConfiguration;
        }

        @Override
        public final java.lang.String getHostPath() {
            return this.hostPath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getDockerVolumeConfiguration() != null) {
                data.set("dockerVolumeConfiguration", om.valueToTree(this.getDockerVolumeConfiguration()));
            }
            if (this.getEfsVolumeConfiguration() != null) {
                data.set("efsVolumeConfiguration", om.valueToTree(this.getEfsVolumeConfiguration()));
            }
            if (this.getFsxWindowsFileServerVolumeConfiguration() != null) {
                data.set("fsxWindowsFileServerVolumeConfiguration", om.valueToTree(this.getFsxWindowsFileServerVolumeConfiguration()));
            }
            if (this.getHostPath() != null) {
                data.set("hostPath", om.valueToTree(this.getHostPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.ecs.EcsTaskDefinitionVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EcsTaskDefinitionVolume.Jsii$Proxy that = (EcsTaskDefinitionVolume.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.dockerVolumeConfiguration != null ? !this.dockerVolumeConfiguration.equals(that.dockerVolumeConfiguration) : that.dockerVolumeConfiguration != null) return false;
            if (this.efsVolumeConfiguration != null ? !this.efsVolumeConfiguration.equals(that.efsVolumeConfiguration) : that.efsVolumeConfiguration != null) return false;
            if (this.fsxWindowsFileServerVolumeConfiguration != null ? !this.fsxWindowsFileServerVolumeConfiguration.equals(that.fsxWindowsFileServerVolumeConfiguration) : that.fsxWindowsFileServerVolumeConfiguration != null) return false;
            return this.hostPath != null ? this.hostPath.equals(that.hostPath) : that.hostPath == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.dockerVolumeConfiguration != null ? this.dockerVolumeConfiguration.hashCode() : 0);
            result = 31 * result + (this.efsVolumeConfiguration != null ? this.efsVolumeConfiguration.hashCode() : 0);
            result = 31 * result + (this.fsxWindowsFileServerVolumeConfiguration != null ? this.fsxWindowsFileServerVolumeConfiguration.hashCode() : 0);
            result = 31 * result + (this.hostPath != null ? this.hostPath.hashCode() : 0);
            return result;
        }
    }
}
