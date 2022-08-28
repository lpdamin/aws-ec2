package imports.aws.elasticache;

/**
 * AWS ElastiCache.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-28T06:16:59.518Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.elasticache.DataAwsElasticacheUserConfig")
@software.amazon.jsii.Jsii.Proxy(DataAwsElasticacheUserConfig.Jsii$Proxy.class)
public interface DataAwsElasticacheUserConfig extends software.amazon.jsii.JsiiSerializable, com.hashicorp.cdktf.TerraformMetaArguments {

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_id DataAwsElasticacheUser#user_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getUserId();

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#access_string DataAwsElasticacheUser#access_string}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccessString() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#engine DataAwsElasticacheUser#engine}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEngine() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#id DataAwsElasticacheUser#id}.
     * <p>
     * Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
     * If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getNoPasswordRequired() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#passwords DataAwsElasticacheUser#passwords}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getPasswords() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_name DataAwsElasticacheUser#user_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUserName() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DataAwsElasticacheUserConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DataAwsElasticacheUserConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DataAwsElasticacheUserConfig> {
        java.lang.String userId;
        java.lang.String accessString;
        java.lang.String engine;
        java.lang.String id;
        java.lang.Object noPasswordRequired;
        java.util.List<java.lang.String> passwords;
        java.lang.String userName;
        java.lang.Object connection;
        java.lang.Number count;
        java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        com.hashicorp.cdktf.ITerraformIterator forEach;
        com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        com.hashicorp.cdktf.TerraformProvider provider;
        java.util.List<java.lang.Object> provisioners;

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getUserId}
         * @param userId Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_id DataAwsElasticacheUser#user_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder userId(java.lang.String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getAccessString}
         * @param accessString Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#access_string DataAwsElasticacheUser#access_string}.
         * @return {@code this}
         */
        public Builder accessString(java.lang.String accessString) {
            this.accessString = accessString;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getEngine}
         * @param engine Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#engine DataAwsElasticacheUser#engine}.
         * @return {@code this}
         */
        public Builder engine(java.lang.String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getId}
         * @param id Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#id DataAwsElasticacheUser#id}.
         *           Please be aware that the id field is automatically added to all resources in Terraform providers using a Terraform provider SDK version below 2.
         *           If you experience problems setting this value it might not be settable. Please take a look at the provider documentation to ensure it should be settable.
         * @return {@code this}
         */
        public Builder id(java.lang.String id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getNoPasswordRequired}
         * @param noPasswordRequired Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}.
         * @return {@code this}
         */
        public Builder noPasswordRequired(java.lang.Boolean noPasswordRequired) {
            this.noPasswordRequired = noPasswordRequired;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getNoPasswordRequired}
         * @param noPasswordRequired Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#no_password_required DataAwsElasticacheUser#no_password_required}.
         * @return {@code this}
         */
        public Builder noPasswordRequired(com.hashicorp.cdktf.IResolvable noPasswordRequired) {
            this.noPasswordRequired = noPasswordRequired;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getPasswords}
         * @param passwords Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#passwords DataAwsElasticacheUser#passwords}.
         * @return {@code this}
         */
        public Builder passwords(java.util.List<java.lang.String> passwords) {
            this.passwords = passwords;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getUserName}
         * @param userName Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws/d/elasticache_user#user_name DataAwsElasticacheUser#user_name}.
         * @return {@code this}
         */
        public Builder userName(java.lang.String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.SSHProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getConnection}
         * @param connection the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder connection(com.hashicorp.cdktf.WinrmProvisionerConnection connection) {
            this.connection = connection;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getCount}
         * @param count the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getDependsOn}
         * @param dependsOn the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder dependsOn(java.util.List<? extends com.hashicorp.cdktf.ITerraformDependable> dependsOn) {
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)dependsOn;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getForEach}
         * @param forEach the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder forEach(com.hashicorp.cdktf.ITerraformIterator forEach) {
            this.forEach = forEach;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getLifecycle}
         * @param lifecycle the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder lifecycle(com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getProvider}
         * @param provider the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        public Builder provider(com.hashicorp.cdktf.TerraformProvider provider) {
            this.provider = provider;
            return this;
        }

        /**
         * Sets the value of {@link DataAwsElasticacheUserConfig#getProvisioners}
         * @param provisioners the value to be set.
         * @return {@code this}
         */
        @software.amazon.jsii.Stability(software.amazon.jsii.Stability.Level.Experimental)
        @SuppressWarnings("unchecked")
        public Builder provisioners(java.util.List<? extends java.lang.Object> provisioners) {
            this.provisioners = (java.util.List<java.lang.Object>)provisioners;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DataAwsElasticacheUserConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DataAwsElasticacheUserConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DataAwsElasticacheUserConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DataAwsElasticacheUserConfig {
        private final java.lang.String userId;
        private final java.lang.String accessString;
        private final java.lang.String engine;
        private final java.lang.String id;
        private final java.lang.Object noPasswordRequired;
        private final java.util.List<java.lang.String> passwords;
        private final java.lang.String userName;
        private final java.lang.Object connection;
        private final java.lang.Number count;
        private final java.util.List<com.hashicorp.cdktf.ITerraformDependable> dependsOn;
        private final com.hashicorp.cdktf.ITerraformIterator forEach;
        private final com.hashicorp.cdktf.TerraformResourceLifecycle lifecycle;
        private final com.hashicorp.cdktf.TerraformProvider provider;
        private final java.util.List<java.lang.Object> provisioners;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.userId = software.amazon.jsii.Kernel.get(this, "userId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessString = software.amazon.jsii.Kernel.get(this, "accessString", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.engine = software.amazon.jsii.Kernel.get(this, "engine", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.id = software.amazon.jsii.Kernel.get(this, "id", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.noPasswordRequired = software.amazon.jsii.Kernel.get(this, "noPasswordRequired", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.passwords = software.amazon.jsii.Kernel.get(this, "passwords", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.userName = software.amazon.jsii.Kernel.get(this, "userName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connection = software.amazon.jsii.Kernel.get(this, "connection", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.dependsOn = software.amazon.jsii.Kernel.get(this, "dependsOn", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformDependable.class)));
            this.forEach = software.amazon.jsii.Kernel.get(this, "forEach", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.ITerraformIterator.class));
            this.lifecycle = software.amazon.jsii.Kernel.get(this, "lifecycle", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformResourceLifecycle.class));
            this.provider = software.amazon.jsii.Kernel.get(this, "provider", software.amazon.jsii.NativeType.forClass(com.hashicorp.cdktf.TerraformProvider.class));
            this.provisioners = software.amazon.jsii.Kernel.get(this, "provisioners", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.Object.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.userId = java.util.Objects.requireNonNull(builder.userId, "userId is required");
            this.accessString = builder.accessString;
            this.engine = builder.engine;
            this.id = builder.id;
            this.noPasswordRequired = builder.noPasswordRequired;
            this.passwords = builder.passwords;
            this.userName = builder.userName;
            this.connection = builder.connection;
            this.count = builder.count;
            this.dependsOn = (java.util.List<com.hashicorp.cdktf.ITerraformDependable>)builder.dependsOn;
            this.forEach = builder.forEach;
            this.lifecycle = builder.lifecycle;
            this.provider = builder.provider;
            this.provisioners = (java.util.List<java.lang.Object>)builder.provisioners;
        }

        @Override
        public final java.lang.String getUserId() {
            return this.userId;
        }

        @Override
        public final java.lang.String getAccessString() {
            return this.accessString;
        }

        @Override
        public final java.lang.String getEngine() {
            return this.engine;
        }

        @Override
        public final java.lang.String getId() {
            return this.id;
        }

        @Override
        public final java.lang.Object getNoPasswordRequired() {
            return this.noPasswordRequired;
        }

        @Override
        public final java.util.List<java.lang.String> getPasswords() {
            return this.passwords;
        }

        @Override
        public final java.lang.String getUserName() {
            return this.userName;
        }

        @Override
        public final java.lang.Object getConnection() {
            return this.connection;
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.util.List<com.hashicorp.cdktf.ITerraformDependable> getDependsOn() {
            return this.dependsOn;
        }

        @Override
        public final com.hashicorp.cdktf.ITerraformIterator getForEach() {
            return this.forEach;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformResourceLifecycle getLifecycle() {
            return this.lifecycle;
        }

        @Override
        public final com.hashicorp.cdktf.TerraformProvider getProvider() {
            return this.provider;
        }

        @Override
        public final java.util.List<java.lang.Object> getProvisioners() {
            return this.provisioners;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("userId", om.valueToTree(this.getUserId()));
            if (this.getAccessString() != null) {
                data.set("accessString", om.valueToTree(this.getAccessString()));
            }
            if (this.getEngine() != null) {
                data.set("engine", om.valueToTree(this.getEngine()));
            }
            if (this.getId() != null) {
                data.set("id", om.valueToTree(this.getId()));
            }
            if (this.getNoPasswordRequired() != null) {
                data.set("noPasswordRequired", om.valueToTree(this.getNoPasswordRequired()));
            }
            if (this.getPasswords() != null) {
                data.set("passwords", om.valueToTree(this.getPasswords()));
            }
            if (this.getUserName() != null) {
                data.set("userName", om.valueToTree(this.getUserName()));
            }
            if (this.getConnection() != null) {
                data.set("connection", om.valueToTree(this.getConnection()));
            }
            if (this.getCount() != null) {
                data.set("count", om.valueToTree(this.getCount()));
            }
            if (this.getDependsOn() != null) {
                data.set("dependsOn", om.valueToTree(this.getDependsOn()));
            }
            if (this.getForEach() != null) {
                data.set("forEach", om.valueToTree(this.getForEach()));
            }
            if (this.getLifecycle() != null) {
                data.set("lifecycle", om.valueToTree(this.getLifecycle()));
            }
            if (this.getProvider() != null) {
                data.set("provider", om.valueToTree(this.getProvider()));
            }
            if (this.getProvisioners() != null) {
                data.set("provisioners", om.valueToTree(this.getProvisioners()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.elasticache.DataAwsElasticacheUserConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DataAwsElasticacheUserConfig.Jsii$Proxy that = (DataAwsElasticacheUserConfig.Jsii$Proxy) o;

            if (!userId.equals(that.userId)) return false;
            if (this.accessString != null ? !this.accessString.equals(that.accessString) : that.accessString != null) return false;
            if (this.engine != null ? !this.engine.equals(that.engine) : that.engine != null) return false;
            if (this.id != null ? !this.id.equals(that.id) : that.id != null) return false;
            if (this.noPasswordRequired != null ? !this.noPasswordRequired.equals(that.noPasswordRequired) : that.noPasswordRequired != null) return false;
            if (this.passwords != null ? !this.passwords.equals(that.passwords) : that.passwords != null) return false;
            if (this.userName != null ? !this.userName.equals(that.userName) : that.userName != null) return false;
            if (this.connection != null ? !this.connection.equals(that.connection) : that.connection != null) return false;
            if (this.count != null ? !this.count.equals(that.count) : that.count != null) return false;
            if (this.dependsOn != null ? !this.dependsOn.equals(that.dependsOn) : that.dependsOn != null) return false;
            if (this.forEach != null ? !this.forEach.equals(that.forEach) : that.forEach != null) return false;
            if (this.lifecycle != null ? !this.lifecycle.equals(that.lifecycle) : that.lifecycle != null) return false;
            if (this.provider != null ? !this.provider.equals(that.provider) : that.provider != null) return false;
            return this.provisioners != null ? this.provisioners.equals(that.provisioners) : that.provisioners == null;
        }

        @Override
        public final int hashCode() {
            int result = this.userId.hashCode();
            result = 31 * result + (this.accessString != null ? this.accessString.hashCode() : 0);
            result = 31 * result + (this.engine != null ? this.engine.hashCode() : 0);
            result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
            result = 31 * result + (this.noPasswordRequired != null ? this.noPasswordRequired.hashCode() : 0);
            result = 31 * result + (this.passwords != null ? this.passwords.hashCode() : 0);
            result = 31 * result + (this.userName != null ? this.userName.hashCode() : 0);
            result = 31 * result + (this.connection != null ? this.connection.hashCode() : 0);
            result = 31 * result + (this.count != null ? this.count.hashCode() : 0);
            result = 31 * result + (this.dependsOn != null ? this.dependsOn.hashCode() : 0);
            result = 31 * result + (this.forEach != null ? this.forEach.hashCode() : 0);
            result = 31 * result + (this.lifecycle != null ? this.lifecycle.hashCode() : 0);
            result = 31 * result + (this.provider != null ? this.provider.hashCode() : 0);
            result = 31 * result + (this.provisioners != null ? this.provisioners.hashCode() : 0);
            return result;
        }
    }
}
