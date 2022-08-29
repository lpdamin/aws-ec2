package imports.aws;

@javax.annotation.Generated(value = "jsii-pacmak/1.65.0 (build 7a02b7f)", date = "2022-08-29T06:16:47.046Z")
@software.amazon.jsii.Jsii(module = imports.aws.$Module.class, fqn = "hashicorp_aws.AwsProviderConfig")
@software.amazon.jsii.Jsii.Proxy(AwsProviderConfig.Jsii$Proxy.class)
public interface AwsProviderConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#access_key AwsProvider#access_key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAccessKey() {
        return null;
    }

    /**
     * Alias name.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#alias AwsProvider#alias}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#allowed_account_ids AwsProvider#allowed_account_ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAllowedAccountIds() {
        return null;
    }

    /**
     * assume_role block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#assume_role AwsProvider#assume_role}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRole getAssumeRole() {
        return null;
    }

    /**
     * assume_role_with_web_identity block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#assume_role_with_web_identity AwsProvider#assume_role_with_web_identity}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AwsProviderAssumeRoleWithWebIdentity getAssumeRoleWithWebIdentity() {
        return null;
    }

    /**
     * File containing custom root and intermediate certificates.
     * <p>
     * Can also be configured using the <code>AWS_CA_BUNDLE</code> environment variable. (Setting <code>ca_bundle</code> in the shared config file is not supported.)
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#custom_ca_bundle AwsProvider#custom_ca_bundle}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCustomCaBundle() {
        return null;
    }

    /**
     * default_tags block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#default_tags AwsProvider#default_tags}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AwsProviderDefaultTags getDefaultTags() {
        return null;
    }

    /**
     * Address of the EC2 metadata service endpoint to use. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ec2_metadata_service_endpoint AwsProvider#ec2_metadata_service_endpoint}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEc2MetadataServiceEndpoint() {
        return null;
    }

    /**
     * Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ec2_metadata_service_endpoint_mode AwsProvider#ec2_metadata_service_endpoint_mode}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEc2MetadataServiceEndpointMode() {
        return null;
    }

    /**
     * endpoints block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#endpoints AwsProvider#endpoints}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getEndpoints() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#forbidden_account_ids AwsProvider#forbidden_account_ids}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getForbiddenAccountIds() {
        return null;
    }

    /**
     * The address of an HTTP proxy to use when accessing the AWS API.
     * <p>
     * Can also be configured using the <code>HTTP_PROXY</code> or <code>HTTPS_PROXY</code> environment variables.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#http_proxy AwsProvider#http_proxy}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHttpProxy() {
        return null;
    }

    /**
     * ignore_tags block.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ignore_tags AwsProvider#ignore_tags}
     */
    default @org.jetbrains.annotations.Nullable imports.aws.AwsProviderIgnoreTags getIgnoreTags() {
        return null;
    }

    /**
     * Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#insecure AwsProvider#insecure}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getInsecure() {
        return null;
    }

    /**
     * The maximum number of times an AWS API request is being executed.
     * <p>
     * If the API request still fails, an error is
     * thrown.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#max_retries AwsProvider#max_retries}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxRetries() {
        return null;
    }

    /**
     * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#profile AwsProvider#profile}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getProfile() {
        return null;
    }

    /**
     * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#region AwsProvider#region}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRegion() {
        return null;
    }

    /**
     * Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_force_path_style AwsProvider#s3_force_path_style}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getS3ForcePathStyle() {
        return null;
    }

    /**
     * Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_use_path_style AwsProvider#s3_use_path_style}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getS3UsePathStyle() {
        return null;
    }

    /**
     * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#secret_key AwsProvider#secret_key}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretKey() {
        return null;
    }

    /**
     * List of paths to shared config files. If not set, defaults to [~/.aws/config].
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_config_files AwsProvider#shared_config_files}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSharedConfigFiles() {
        return null;
    }

    /**
     * The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_credentials_file AwsProvider#shared_credentials_file}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSharedCredentialsFile() {
        return null;
    }

    /**
     * List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials].
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_credentials_files AwsProvider#shared_credentials_files}
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSharedCredentialsFiles() {
        return null;
    }

    /**
     * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_credentials_validation AwsProvider#skip_credentials_validation}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipCredentialsValidation() {
        return null;
    }

    /**
     * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_get_ec2_platforms AwsProvider#skip_get_ec2_platforms}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipGetEc2Platforms() {
        return null;
    }

    /**
     * Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_metadata_api_check AwsProvider#skip_metadata_api_check}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSkipMetadataApiCheck() {
        return null;
    }

    /**
     * Skip static validation of region name.
     * <p>
     * Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_region_validation AwsProvider#skip_region_validation}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipRegionValidation() {
        return null;
    }

    /**
     * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_requesting_account_id AwsProvider#skip_requesting_account_id}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getSkipRequestingAccountId() {
        return null;
    }

    /**
     * The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#sts_region AwsProvider#sts_region}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStsRegion() {
        return null;
    }

    /**
     * session token. A session token is only required if you are using temporary security credentials.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#token AwsProvider#token}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getToken() {
        return null;
    }

    /**
     * Resolve an endpoint with DualStack capability.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_dualstack_endpoint AwsProvider#use_dualstack_endpoint}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseDualstackEndpoint() {
        return null;
    }

    /**
     * Resolve an endpoint with FIPS capability.
     * <p>
     * Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_fips_endpoint AwsProvider#use_fips_endpoint}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getUseFipsEndpoint() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link AwsProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AwsProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AwsProviderConfig> {
        java.lang.String accessKey;
        java.lang.String alias;
        java.util.List<java.lang.String> allowedAccountIds;
        imports.aws.AwsProviderAssumeRole assumeRole;
        imports.aws.AwsProviderAssumeRoleWithWebIdentity assumeRoleWithWebIdentity;
        java.lang.String customCaBundle;
        imports.aws.AwsProviderDefaultTags defaultTags;
        java.lang.String ec2MetadataServiceEndpoint;
        java.lang.String ec2MetadataServiceEndpointMode;
        java.lang.Object endpoints;
        java.util.List<java.lang.String> forbiddenAccountIds;
        java.lang.String httpProxy;
        imports.aws.AwsProviderIgnoreTags ignoreTags;
        java.lang.Object insecure;
        java.lang.Number maxRetries;
        java.lang.String profile;
        java.lang.String region;
        java.lang.Object s3ForcePathStyle;
        java.lang.Object s3UsePathStyle;
        java.lang.String secretKey;
        java.util.List<java.lang.String> sharedConfigFiles;
        java.lang.String sharedCredentialsFile;
        java.util.List<java.lang.String> sharedCredentialsFiles;
        java.lang.Object skipCredentialsValidation;
        java.lang.Object skipGetEc2Platforms;
        java.lang.String skipMetadataApiCheck;
        java.lang.Object skipRegionValidation;
        java.lang.Object skipRequestingAccountId;
        java.lang.String stsRegion;
        java.lang.String token;
        java.lang.Object useDualstackEndpoint;
        java.lang.Object useFipsEndpoint;

        /**
         * Sets the value of {@link AwsProviderConfig#getAccessKey}
         * @param accessKey The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#access_key AwsProvider#access_key}
         * @return {@code this}
         */
        public Builder accessKey(java.lang.String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAlias}
         * @param alias Alias name.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#alias AwsProvider#alias}
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAllowedAccountIds}
         * @param allowedAccountIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#allowed_account_ids AwsProvider#allowed_account_ids}.
         * @return {@code this}
         */
        public Builder allowedAccountIds(java.util.List<java.lang.String> allowedAccountIds) {
            this.allowedAccountIds = allowedAccountIds;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAssumeRole}
         * @param assumeRole assume_role block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#assume_role AwsProvider#assume_role}
         * @return {@code this}
         */
        public Builder assumeRole(imports.aws.AwsProviderAssumeRole assumeRole) {
            this.assumeRole = assumeRole;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getAssumeRoleWithWebIdentity}
         * @param assumeRoleWithWebIdentity assume_role_with_web_identity block.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#assume_role_with_web_identity AwsProvider#assume_role_with_web_identity}
         * @return {@code this}
         */
        public Builder assumeRoleWithWebIdentity(imports.aws.AwsProviderAssumeRoleWithWebIdentity assumeRoleWithWebIdentity) {
            this.assumeRoleWithWebIdentity = assumeRoleWithWebIdentity;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getCustomCaBundle}
         * @param customCaBundle File containing custom root and intermediate certificates.
         *                       Can also be configured using the <code>AWS_CA_BUNDLE</code> environment variable. (Setting <code>ca_bundle</code> in the shared config file is not supported.)
         *                       <p>
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#custom_ca_bundle AwsProvider#custom_ca_bundle}
         * @return {@code this}
         */
        public Builder customCaBundle(java.lang.String customCaBundle) {
            this.customCaBundle = customCaBundle;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getDefaultTags}
         * @param defaultTags default_tags block.
         *                    Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#default_tags AwsProvider#default_tags}
         * @return {@code this}
         */
        public Builder defaultTags(imports.aws.AwsProviderDefaultTags defaultTags) {
            this.defaultTags = defaultTags;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getEc2MetadataServiceEndpoint}
         * @param ec2MetadataServiceEndpoint Address of the EC2 metadata service endpoint to use. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT` environment variable.
         *                                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ec2_metadata_service_endpoint AwsProvider#ec2_metadata_service_endpoint}
         * @return {@code this}
         */
        public Builder ec2MetadataServiceEndpoint(java.lang.String ec2MetadataServiceEndpoint) {
            this.ec2MetadataServiceEndpoint = ec2MetadataServiceEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getEc2MetadataServiceEndpointMode}
         * @param ec2MetadataServiceEndpointMode Protocol to use with EC2 metadata service endpoint.Valid values are `IPv4` and `IPv6`. Can also be configured using the `AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE` environment variable.
         *                                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ec2_metadata_service_endpoint_mode AwsProvider#ec2_metadata_service_endpoint_mode}
         * @return {@code this}
         */
        public Builder ec2MetadataServiceEndpointMode(java.lang.String ec2MetadataServiceEndpointMode) {
            this.ec2MetadataServiceEndpointMode = ec2MetadataServiceEndpointMode;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getEndpoints}
         * @param endpoints endpoints block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#endpoints AwsProvider#endpoints}
         * @return {@code this}
         */
        public Builder endpoints(com.hashicorp.cdktf.IResolvable endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getEndpoints}
         * @param endpoints endpoints block.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#endpoints AwsProvider#endpoints}
         * @return {@code this}
         */
        public Builder endpoints(java.util.List<? extends imports.aws.AwsProviderEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getForbiddenAccountIds}
         * @param forbiddenAccountIds Docs at Terraform Registry: {@link https://www.terraform.io/docs/providers/aws#forbidden_account_ids AwsProvider#forbidden_account_ids}.
         * @return {@code this}
         */
        public Builder forbiddenAccountIds(java.util.List<java.lang.String> forbiddenAccountIds) {
            this.forbiddenAccountIds = forbiddenAccountIds;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getHttpProxy}
         * @param httpProxy The address of an HTTP proxy to use when accessing the AWS API.
         *                  Can also be configured using the <code>HTTP_PROXY</code> or <code>HTTPS_PROXY</code> environment variables.
         *                  <p>
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#http_proxy AwsProvider#http_proxy}
         * @return {@code this}
         */
        public Builder httpProxy(java.lang.String httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getIgnoreTags}
         * @param ignoreTags ignore_tags block.
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#ignore_tags AwsProvider#ignore_tags}
         * @return {@code this}
         */
        public Builder ignoreTags(imports.aws.AwsProviderIgnoreTags ignoreTags) {
            this.ignoreTags = ignoreTags;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getInsecure}
         * @param insecure Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#insecure AwsProvider#insecure}
         * @return {@code this}
         */
        public Builder insecure(java.lang.Boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getInsecure}
         * @param insecure Explicitly allow the provider to perform "insecure" SSL requests. If omitted, default value is `false`.
         *                 Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#insecure AwsProvider#insecure}
         * @return {@code this}
         */
        public Builder insecure(com.hashicorp.cdktf.IResolvable insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getMaxRetries}
         * @param maxRetries The maximum number of times an AWS API request is being executed.
         *                   If the API request still fails, an error is
         *                   thrown.
         *                   <p>
         *                   Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#max_retries AwsProvider#max_retries}
         * @return {@code this}
         */
        public Builder maxRetries(java.lang.Number maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getProfile}
         * @param profile The profile for API operations. If not set, the default profile created with `aws configure` will be used.
         *                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#profile AwsProvider#profile}
         * @return {@code this}
         */
        public Builder profile(java.lang.String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getRegion}
         * @param region The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
         *               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#region AwsProvider#region}
         * @return {@code this}
         */
        public Builder region(java.lang.String region) {
            this.region = region;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getS3ForcePathStyle}
         * @param s3ForcePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_force_path_style AwsProvider#s3_force_path_style}
         * @return {@code this}
         */
        public Builder s3ForcePathStyle(java.lang.Boolean s3ForcePathStyle) {
            this.s3ForcePathStyle = s3ForcePathStyle;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getS3ForcePathStyle}
         * @param s3ForcePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         *                         Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_force_path_style AwsProvider#s3_force_path_style}
         * @return {@code this}
         */
        public Builder s3ForcePathStyle(com.hashicorp.cdktf.IResolvable s3ForcePathStyle) {
            this.s3ForcePathStyle = s3ForcePathStyle;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getS3UsePathStyle}
         * @param s3UsePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_use_path_style AwsProvider#s3_use_path_style}
         * @return {@code this}
         */
        public Builder s3UsePathStyle(java.lang.Boolean s3UsePathStyle) {
            this.s3UsePathStyle = s3UsePathStyle;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getS3UsePathStyle}
         * @param s3UsePathStyle Set this to true to enable the request to use path-style addressing, i.e., https://s3.amazonaws.com/BUCKET/KEY. By default, the S3 client will use virtual hosted bucket addressing when possible (https://BUCKET.s3.amazonaws.com/KEY). Specific to the Amazon S3 service.
         *                       Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#s3_use_path_style AwsProvider#s3_use_path_style}
         * @return {@code this}
         */
        public Builder s3UsePathStyle(com.hashicorp.cdktf.IResolvable s3UsePathStyle) {
            this.s3UsePathStyle = s3UsePathStyle;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSecretKey}
         * @param secretKey The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#secret_key AwsProvider#secret_key}
         * @return {@code this}
         */
        public Builder secretKey(java.lang.String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSharedConfigFiles}
         * @param sharedConfigFiles List of paths to shared config files. If not set, defaults to [~/.aws/config].
         *                          Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_config_files AwsProvider#shared_config_files}
         * @return {@code this}
         */
        public Builder sharedConfigFiles(java.util.List<java.lang.String> sharedConfigFiles) {
            this.sharedConfigFiles = sharedConfigFiles;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSharedCredentialsFile}
         * @param sharedCredentialsFile The path to the shared credentials file. If not set, defaults to ~/.aws/credentials.
         *                              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_credentials_file AwsProvider#shared_credentials_file}
         * @return {@code this}
         */
        public Builder sharedCredentialsFile(java.lang.String sharedCredentialsFile) {
            this.sharedCredentialsFile = sharedCredentialsFile;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSharedCredentialsFiles}
         * @param sharedCredentialsFiles List of paths to shared credentials files. If not set, defaults to [~/.aws/credentials].
         *                               Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#shared_credentials_files AwsProvider#shared_credentials_files}
         * @return {@code this}
         */
        public Builder sharedCredentialsFiles(java.util.List<java.lang.String> sharedCredentialsFiles) {
            this.sharedCredentialsFiles = sharedCredentialsFiles;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipCredentialsValidation}
         * @param skipCredentialsValidation Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_credentials_validation AwsProvider#skip_credentials_validation}
         * @return {@code this}
         */
        public Builder skipCredentialsValidation(java.lang.Boolean skipCredentialsValidation) {
            this.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipCredentialsValidation}
         * @param skipCredentialsValidation Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS available/implemented.
         *                                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_credentials_validation AwsProvider#skip_credentials_validation}
         * @return {@code this}
         */
        public Builder skipCredentialsValidation(com.hashicorp.cdktf.IResolvable skipCredentialsValidation) {
            this.skipCredentialsValidation = skipCredentialsValidation;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipGetEc2Platforms}
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_get_ec2_platforms AwsProvider#skip_get_ec2_platforms}
         * @return {@code this}
         */
        public Builder skipGetEc2Platforms(java.lang.Boolean skipGetEc2Platforms) {
            this.skipGetEc2Platforms = skipGetEc2Platforms;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipGetEc2Platforms}
         * @param skipGetEc2Platforms Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
         *                            Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_get_ec2_platforms AwsProvider#skip_get_ec2_platforms}
         * @return {@code this}
         */
        public Builder skipGetEc2Platforms(com.hashicorp.cdktf.IResolvable skipGetEc2Platforms) {
            this.skipGetEc2Platforms = skipGetEc2Platforms;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipMetadataApiCheck}
         * @param skipMetadataApiCheck Skip the AWS Metadata API check. Used for AWS API implementations that do not have a metadata api endpoint.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_metadata_api_check AwsProvider#skip_metadata_api_check}
         * @return {@code this}
         */
        public Builder skipMetadataApiCheck(java.lang.String skipMetadataApiCheck) {
            this.skipMetadataApiCheck = skipMetadataApiCheck;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipRegionValidation}
         * @param skipRegionValidation Skip static validation of region name.
         *                             Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
         *                             <p>
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_region_validation AwsProvider#skip_region_validation}
         * @return {@code this}
         */
        public Builder skipRegionValidation(java.lang.Boolean skipRegionValidation) {
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipRegionValidation}
         * @param skipRegionValidation Skip static validation of region name.
         *                             Used by users of alternative AWS-like APIs or users w/ access to regions that are not public (yet).
         *                             <p>
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_region_validation AwsProvider#skip_region_validation}
         * @return {@code this}
         */
        public Builder skipRegionValidation(com.hashicorp.cdktf.IResolvable skipRegionValidation) {
            this.skipRegionValidation = skipRegionValidation;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipRequestingAccountId}
         * @param skipRequestingAccountId Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_requesting_account_id AwsProvider#skip_requesting_account_id}
         * @return {@code this}
         */
        public Builder skipRequestingAccountId(java.lang.Boolean skipRequestingAccountId) {
            this.skipRequestingAccountId = skipRequestingAccountId;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getSkipRequestingAccountId}
         * @param skipRequestingAccountId Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
         *                                Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#skip_requesting_account_id AwsProvider#skip_requesting_account_id}
         * @return {@code this}
         */
        public Builder skipRequestingAccountId(com.hashicorp.cdktf.IResolvable skipRequestingAccountId) {
            this.skipRequestingAccountId = skipRequestingAccountId;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getStsRegion}
         * @param stsRegion The region where AWS STS operations will take place. Examples are us-east-1 and us-west-2.
         *                  Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#sts_region AwsProvider#sts_region}
         * @return {@code this}
         */
        public Builder stsRegion(java.lang.String stsRegion) {
            this.stsRegion = stsRegion;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getToken}
         * @param token session token. A session token is only required if you are using temporary security credentials.
         *              Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#token AwsProvider#token}
         * @return {@code this}
         */
        public Builder token(java.lang.String token) {
            this.token = token;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getUseDualstackEndpoint}
         * @param useDualstackEndpoint Resolve an endpoint with DualStack capability.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_dualstack_endpoint AwsProvider#use_dualstack_endpoint}
         * @return {@code this}
         */
        public Builder useDualstackEndpoint(java.lang.Boolean useDualstackEndpoint) {
            this.useDualstackEndpoint = useDualstackEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getUseDualstackEndpoint}
         * @param useDualstackEndpoint Resolve an endpoint with DualStack capability.
         *                             Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_dualstack_endpoint AwsProvider#use_dualstack_endpoint}
         * @return {@code this}
         */
        public Builder useDualstackEndpoint(com.hashicorp.cdktf.IResolvable useDualstackEndpoint) {
            this.useDualstackEndpoint = useDualstackEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getUseFipsEndpoint}
         * @param useFipsEndpoint Resolve an endpoint with FIPS capability.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_fips_endpoint AwsProvider#use_fips_endpoint}
         * @return {@code this}
         */
        public Builder useFipsEndpoint(java.lang.Boolean useFipsEndpoint) {
            this.useFipsEndpoint = useFipsEndpoint;
            return this;
        }

        /**
         * Sets the value of {@link AwsProviderConfig#getUseFipsEndpoint}
         * @param useFipsEndpoint Resolve an endpoint with FIPS capability.
         *                        Docs at Terraform Registry: {&#64;link https://www.terraform.io/docs/providers/aws#use_fips_endpoint AwsProvider#use_fips_endpoint}
         * @return {@code this}
         */
        public Builder useFipsEndpoint(com.hashicorp.cdktf.IResolvable useFipsEndpoint) {
            this.useFipsEndpoint = useFipsEndpoint;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AwsProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AwsProviderConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link AwsProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AwsProviderConfig {
        private final java.lang.String accessKey;
        private final java.lang.String alias;
        private final java.util.List<java.lang.String> allowedAccountIds;
        private final imports.aws.AwsProviderAssumeRole assumeRole;
        private final imports.aws.AwsProviderAssumeRoleWithWebIdentity assumeRoleWithWebIdentity;
        private final java.lang.String customCaBundle;
        private final imports.aws.AwsProviderDefaultTags defaultTags;
        private final java.lang.String ec2MetadataServiceEndpoint;
        private final java.lang.String ec2MetadataServiceEndpointMode;
        private final java.lang.Object endpoints;
        private final java.util.List<java.lang.String> forbiddenAccountIds;
        private final java.lang.String httpProxy;
        private final imports.aws.AwsProviderIgnoreTags ignoreTags;
        private final java.lang.Object insecure;
        private final java.lang.Number maxRetries;
        private final java.lang.String profile;
        private final java.lang.String region;
        private final java.lang.Object s3ForcePathStyle;
        private final java.lang.Object s3UsePathStyle;
        private final java.lang.String secretKey;
        private final java.util.List<java.lang.String> sharedConfigFiles;
        private final java.lang.String sharedCredentialsFile;
        private final java.util.List<java.lang.String> sharedCredentialsFiles;
        private final java.lang.Object skipCredentialsValidation;
        private final java.lang.Object skipGetEc2Platforms;
        private final java.lang.String skipMetadataApiCheck;
        private final java.lang.Object skipRegionValidation;
        private final java.lang.Object skipRequestingAccountId;
        private final java.lang.String stsRegion;
        private final java.lang.String token;
        private final java.lang.Object useDualstackEndpoint;
        private final java.lang.Object useFipsEndpoint;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessKey = software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.allowedAccountIds = software.amazon.jsii.Kernel.get(this, "allowedAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.assumeRole = software.amazon.jsii.Kernel.get(this, "assumeRole", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRole.class));
            this.assumeRoleWithWebIdentity = software.amazon.jsii.Kernel.get(this, "assumeRoleWithWebIdentity", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderAssumeRoleWithWebIdentity.class));
            this.customCaBundle = software.amazon.jsii.Kernel.get(this, "customCaBundle", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.defaultTags = software.amazon.jsii.Kernel.get(this, "defaultTags", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderDefaultTags.class));
            this.ec2MetadataServiceEndpoint = software.amazon.jsii.Kernel.get(this, "ec2MetadataServiceEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ec2MetadataServiceEndpointMode = software.amazon.jsii.Kernel.get(this, "ec2MetadataServiceEndpointMode", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.endpoints = software.amazon.jsii.Kernel.get(this, "endpoints", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.forbiddenAccountIds = software.amazon.jsii.Kernel.get(this, "forbiddenAccountIds", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.httpProxy = software.amazon.jsii.Kernel.get(this, "httpProxy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.ignoreTags = software.amazon.jsii.Kernel.get(this, "ignoreTags", software.amazon.jsii.NativeType.forClass(imports.aws.AwsProviderIgnoreTags.class));
            this.insecure = software.amazon.jsii.Kernel.get(this, "insecure", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maxRetries = software.amazon.jsii.Kernel.get(this, "maxRetries", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.profile = software.amazon.jsii.Kernel.get(this, "profile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.region = software.amazon.jsii.Kernel.get(this, "region", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.s3ForcePathStyle = software.amazon.jsii.Kernel.get(this, "s3ForcePathStyle", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.s3UsePathStyle = software.amazon.jsii.Kernel.get(this, "s3UsePathStyle", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.secretKey = software.amazon.jsii.Kernel.get(this, "secretKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sharedConfigFiles = software.amazon.jsii.Kernel.get(this, "sharedConfigFiles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.sharedCredentialsFile = software.amazon.jsii.Kernel.get(this, "sharedCredentialsFile", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sharedCredentialsFiles = software.amazon.jsii.Kernel.get(this, "sharedCredentialsFiles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.skipCredentialsValidation = software.amazon.jsii.Kernel.get(this, "skipCredentialsValidation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.skipGetEc2Platforms = software.amazon.jsii.Kernel.get(this, "skipGetEc2Platforms", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.skipMetadataApiCheck = software.amazon.jsii.Kernel.get(this, "skipMetadataApiCheck", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.skipRegionValidation = software.amazon.jsii.Kernel.get(this, "skipRegionValidation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.skipRequestingAccountId = software.amazon.jsii.Kernel.get(this, "skipRequestingAccountId", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.stsRegion = software.amazon.jsii.Kernel.get(this, "stsRegion", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.token = software.amazon.jsii.Kernel.get(this, "token", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useDualstackEndpoint = software.amazon.jsii.Kernel.get(this, "useDualstackEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.useFipsEndpoint = software.amazon.jsii.Kernel.get(this, "useFipsEndpoint", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessKey = builder.accessKey;
            this.alias = builder.alias;
            this.allowedAccountIds = builder.allowedAccountIds;
            this.assumeRole = builder.assumeRole;
            this.assumeRoleWithWebIdentity = builder.assumeRoleWithWebIdentity;
            this.customCaBundle = builder.customCaBundle;
            this.defaultTags = builder.defaultTags;
            this.ec2MetadataServiceEndpoint = builder.ec2MetadataServiceEndpoint;
            this.ec2MetadataServiceEndpointMode = builder.ec2MetadataServiceEndpointMode;
            this.endpoints = builder.endpoints;
            this.forbiddenAccountIds = builder.forbiddenAccountIds;
            this.httpProxy = builder.httpProxy;
            this.ignoreTags = builder.ignoreTags;
            this.insecure = builder.insecure;
            this.maxRetries = builder.maxRetries;
            this.profile = builder.profile;
            this.region = builder.region;
            this.s3ForcePathStyle = builder.s3ForcePathStyle;
            this.s3UsePathStyle = builder.s3UsePathStyle;
            this.secretKey = builder.secretKey;
            this.sharedConfigFiles = builder.sharedConfigFiles;
            this.sharedCredentialsFile = builder.sharedCredentialsFile;
            this.sharedCredentialsFiles = builder.sharedCredentialsFiles;
            this.skipCredentialsValidation = builder.skipCredentialsValidation;
            this.skipGetEc2Platforms = builder.skipGetEc2Platforms;
            this.skipMetadataApiCheck = builder.skipMetadataApiCheck;
            this.skipRegionValidation = builder.skipRegionValidation;
            this.skipRequestingAccountId = builder.skipRequestingAccountId;
            this.stsRegion = builder.stsRegion;
            this.token = builder.token;
            this.useDualstackEndpoint = builder.useDualstackEndpoint;
            this.useFipsEndpoint = builder.useFipsEndpoint;
        }

        @Override
        public final java.lang.String getAccessKey() {
            return this.accessKey;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.util.List<java.lang.String> getAllowedAccountIds() {
            return this.allowedAccountIds;
        }

        @Override
        public final imports.aws.AwsProviderAssumeRole getAssumeRole() {
            return this.assumeRole;
        }

        @Override
        public final imports.aws.AwsProviderAssumeRoleWithWebIdentity getAssumeRoleWithWebIdentity() {
            return this.assumeRoleWithWebIdentity;
        }

        @Override
        public final java.lang.String getCustomCaBundle() {
            return this.customCaBundle;
        }

        @Override
        public final imports.aws.AwsProviderDefaultTags getDefaultTags() {
            return this.defaultTags;
        }

        @Override
        public final java.lang.String getEc2MetadataServiceEndpoint() {
            return this.ec2MetadataServiceEndpoint;
        }

        @Override
        public final java.lang.String getEc2MetadataServiceEndpointMode() {
            return this.ec2MetadataServiceEndpointMode;
        }

        @Override
        public final java.lang.Object getEndpoints() {
            return this.endpoints;
        }

        @Override
        public final java.util.List<java.lang.String> getForbiddenAccountIds() {
            return this.forbiddenAccountIds;
        }

        @Override
        public final java.lang.String getHttpProxy() {
            return this.httpProxy;
        }

        @Override
        public final imports.aws.AwsProviderIgnoreTags getIgnoreTags() {
            return this.ignoreTags;
        }

        @Override
        public final java.lang.Object getInsecure() {
            return this.insecure;
        }

        @Override
        public final java.lang.Number getMaxRetries() {
            return this.maxRetries;
        }

        @Override
        public final java.lang.String getProfile() {
            return this.profile;
        }

        @Override
        public final java.lang.String getRegion() {
            return this.region;
        }

        @Override
        public final java.lang.Object getS3ForcePathStyle() {
            return this.s3ForcePathStyle;
        }

        @Override
        public final java.lang.Object getS3UsePathStyle() {
            return this.s3UsePathStyle;
        }

        @Override
        public final java.lang.String getSecretKey() {
            return this.secretKey;
        }

        @Override
        public final java.util.List<java.lang.String> getSharedConfigFiles() {
            return this.sharedConfigFiles;
        }

        @Override
        public final java.lang.String getSharedCredentialsFile() {
            return this.sharedCredentialsFile;
        }

        @Override
        public final java.util.List<java.lang.String> getSharedCredentialsFiles() {
            return this.sharedCredentialsFiles;
        }

        @Override
        public final java.lang.Object getSkipCredentialsValidation() {
            return this.skipCredentialsValidation;
        }

        @Override
        public final java.lang.Object getSkipGetEc2Platforms() {
            return this.skipGetEc2Platforms;
        }

        @Override
        public final java.lang.String getSkipMetadataApiCheck() {
            return this.skipMetadataApiCheck;
        }

        @Override
        public final java.lang.Object getSkipRegionValidation() {
            return this.skipRegionValidation;
        }

        @Override
        public final java.lang.Object getSkipRequestingAccountId() {
            return this.skipRequestingAccountId;
        }

        @Override
        public final java.lang.String getStsRegion() {
            return this.stsRegion;
        }

        @Override
        public final java.lang.String getToken() {
            return this.token;
        }

        @Override
        public final java.lang.Object getUseDualstackEndpoint() {
            return this.useDualstackEndpoint;
        }

        @Override
        public final java.lang.Object getUseFipsEndpoint() {
            return this.useFipsEndpoint;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAccessKey() != null) {
                data.set("accessKey", om.valueToTree(this.getAccessKey()));
            }
            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getAllowedAccountIds() != null) {
                data.set("allowedAccountIds", om.valueToTree(this.getAllowedAccountIds()));
            }
            if (this.getAssumeRole() != null) {
                data.set("assumeRole", om.valueToTree(this.getAssumeRole()));
            }
            if (this.getAssumeRoleWithWebIdentity() != null) {
                data.set("assumeRoleWithWebIdentity", om.valueToTree(this.getAssumeRoleWithWebIdentity()));
            }
            if (this.getCustomCaBundle() != null) {
                data.set("customCaBundle", om.valueToTree(this.getCustomCaBundle()));
            }
            if (this.getDefaultTags() != null) {
                data.set("defaultTags", om.valueToTree(this.getDefaultTags()));
            }
            if (this.getEc2MetadataServiceEndpoint() != null) {
                data.set("ec2MetadataServiceEndpoint", om.valueToTree(this.getEc2MetadataServiceEndpoint()));
            }
            if (this.getEc2MetadataServiceEndpointMode() != null) {
                data.set("ec2MetadataServiceEndpointMode", om.valueToTree(this.getEc2MetadataServiceEndpointMode()));
            }
            if (this.getEndpoints() != null) {
                data.set("endpoints", om.valueToTree(this.getEndpoints()));
            }
            if (this.getForbiddenAccountIds() != null) {
                data.set("forbiddenAccountIds", om.valueToTree(this.getForbiddenAccountIds()));
            }
            if (this.getHttpProxy() != null) {
                data.set("httpProxy", om.valueToTree(this.getHttpProxy()));
            }
            if (this.getIgnoreTags() != null) {
                data.set("ignoreTags", om.valueToTree(this.getIgnoreTags()));
            }
            if (this.getInsecure() != null) {
                data.set("insecure", om.valueToTree(this.getInsecure()));
            }
            if (this.getMaxRetries() != null) {
                data.set("maxRetries", om.valueToTree(this.getMaxRetries()));
            }
            if (this.getProfile() != null) {
                data.set("profile", om.valueToTree(this.getProfile()));
            }
            if (this.getRegion() != null) {
                data.set("region", om.valueToTree(this.getRegion()));
            }
            if (this.getS3ForcePathStyle() != null) {
                data.set("s3ForcePathStyle", om.valueToTree(this.getS3ForcePathStyle()));
            }
            if (this.getS3UsePathStyle() != null) {
                data.set("s3UsePathStyle", om.valueToTree(this.getS3UsePathStyle()));
            }
            if (this.getSecretKey() != null) {
                data.set("secretKey", om.valueToTree(this.getSecretKey()));
            }
            if (this.getSharedConfigFiles() != null) {
                data.set("sharedConfigFiles", om.valueToTree(this.getSharedConfigFiles()));
            }
            if (this.getSharedCredentialsFile() != null) {
                data.set("sharedCredentialsFile", om.valueToTree(this.getSharedCredentialsFile()));
            }
            if (this.getSharedCredentialsFiles() != null) {
                data.set("sharedCredentialsFiles", om.valueToTree(this.getSharedCredentialsFiles()));
            }
            if (this.getSkipCredentialsValidation() != null) {
                data.set("skipCredentialsValidation", om.valueToTree(this.getSkipCredentialsValidation()));
            }
            if (this.getSkipGetEc2Platforms() != null) {
                data.set("skipGetEc2Platforms", om.valueToTree(this.getSkipGetEc2Platforms()));
            }
            if (this.getSkipMetadataApiCheck() != null) {
                data.set("skipMetadataApiCheck", om.valueToTree(this.getSkipMetadataApiCheck()));
            }
            if (this.getSkipRegionValidation() != null) {
                data.set("skipRegionValidation", om.valueToTree(this.getSkipRegionValidation()));
            }
            if (this.getSkipRequestingAccountId() != null) {
                data.set("skipRequestingAccountId", om.valueToTree(this.getSkipRequestingAccountId()));
            }
            if (this.getStsRegion() != null) {
                data.set("stsRegion", om.valueToTree(this.getStsRegion()));
            }
            if (this.getToken() != null) {
                data.set("token", om.valueToTree(this.getToken()));
            }
            if (this.getUseDualstackEndpoint() != null) {
                data.set("useDualstackEndpoint", om.valueToTree(this.getUseDualstackEndpoint()));
            }
            if (this.getUseFipsEndpoint() != null) {
                data.set("useFipsEndpoint", om.valueToTree(this.getUseFipsEndpoint()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("hashicorp_aws.AwsProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AwsProviderConfig.Jsii$Proxy that = (AwsProviderConfig.Jsii$Proxy) o;

            if (this.accessKey != null ? !this.accessKey.equals(that.accessKey) : that.accessKey != null) return false;
            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.allowedAccountIds != null ? !this.allowedAccountIds.equals(that.allowedAccountIds) : that.allowedAccountIds != null) return false;
            if (this.assumeRole != null ? !this.assumeRole.equals(that.assumeRole) : that.assumeRole != null) return false;
            if (this.assumeRoleWithWebIdentity != null ? !this.assumeRoleWithWebIdentity.equals(that.assumeRoleWithWebIdentity) : that.assumeRoleWithWebIdentity != null) return false;
            if (this.customCaBundle != null ? !this.customCaBundle.equals(that.customCaBundle) : that.customCaBundle != null) return false;
            if (this.defaultTags != null ? !this.defaultTags.equals(that.defaultTags) : that.defaultTags != null) return false;
            if (this.ec2MetadataServiceEndpoint != null ? !this.ec2MetadataServiceEndpoint.equals(that.ec2MetadataServiceEndpoint) : that.ec2MetadataServiceEndpoint != null) return false;
            if (this.ec2MetadataServiceEndpointMode != null ? !this.ec2MetadataServiceEndpointMode.equals(that.ec2MetadataServiceEndpointMode) : that.ec2MetadataServiceEndpointMode != null) return false;
            if (this.endpoints != null ? !this.endpoints.equals(that.endpoints) : that.endpoints != null) return false;
            if (this.forbiddenAccountIds != null ? !this.forbiddenAccountIds.equals(that.forbiddenAccountIds) : that.forbiddenAccountIds != null) return false;
            if (this.httpProxy != null ? !this.httpProxy.equals(that.httpProxy) : that.httpProxy != null) return false;
            if (this.ignoreTags != null ? !this.ignoreTags.equals(that.ignoreTags) : that.ignoreTags != null) return false;
            if (this.insecure != null ? !this.insecure.equals(that.insecure) : that.insecure != null) return false;
            if (this.maxRetries != null ? !this.maxRetries.equals(that.maxRetries) : that.maxRetries != null) return false;
            if (this.profile != null ? !this.profile.equals(that.profile) : that.profile != null) return false;
            if (this.region != null ? !this.region.equals(that.region) : that.region != null) return false;
            if (this.s3ForcePathStyle != null ? !this.s3ForcePathStyle.equals(that.s3ForcePathStyle) : that.s3ForcePathStyle != null) return false;
            if (this.s3UsePathStyle != null ? !this.s3UsePathStyle.equals(that.s3UsePathStyle) : that.s3UsePathStyle != null) return false;
            if (this.secretKey != null ? !this.secretKey.equals(that.secretKey) : that.secretKey != null) return false;
            if (this.sharedConfigFiles != null ? !this.sharedConfigFiles.equals(that.sharedConfigFiles) : that.sharedConfigFiles != null) return false;
            if (this.sharedCredentialsFile != null ? !this.sharedCredentialsFile.equals(that.sharedCredentialsFile) : that.sharedCredentialsFile != null) return false;
            if (this.sharedCredentialsFiles != null ? !this.sharedCredentialsFiles.equals(that.sharedCredentialsFiles) : that.sharedCredentialsFiles != null) return false;
            if (this.skipCredentialsValidation != null ? !this.skipCredentialsValidation.equals(that.skipCredentialsValidation) : that.skipCredentialsValidation != null) return false;
            if (this.skipGetEc2Platforms != null ? !this.skipGetEc2Platforms.equals(that.skipGetEc2Platforms) : that.skipGetEc2Platforms != null) return false;
            if (this.skipMetadataApiCheck != null ? !this.skipMetadataApiCheck.equals(that.skipMetadataApiCheck) : that.skipMetadataApiCheck != null) return false;
            if (this.skipRegionValidation != null ? !this.skipRegionValidation.equals(that.skipRegionValidation) : that.skipRegionValidation != null) return false;
            if (this.skipRequestingAccountId != null ? !this.skipRequestingAccountId.equals(that.skipRequestingAccountId) : that.skipRequestingAccountId != null) return false;
            if (this.stsRegion != null ? !this.stsRegion.equals(that.stsRegion) : that.stsRegion != null) return false;
            if (this.token != null ? !this.token.equals(that.token) : that.token != null) return false;
            if (this.useDualstackEndpoint != null ? !this.useDualstackEndpoint.equals(that.useDualstackEndpoint) : that.useDualstackEndpoint != null) return false;
            return this.useFipsEndpoint != null ? this.useFipsEndpoint.equals(that.useFipsEndpoint) : that.useFipsEndpoint == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessKey != null ? this.accessKey.hashCode() : 0;
            result = 31 * result + (this.alias != null ? this.alias.hashCode() : 0);
            result = 31 * result + (this.allowedAccountIds != null ? this.allowedAccountIds.hashCode() : 0);
            result = 31 * result + (this.assumeRole != null ? this.assumeRole.hashCode() : 0);
            result = 31 * result + (this.assumeRoleWithWebIdentity != null ? this.assumeRoleWithWebIdentity.hashCode() : 0);
            result = 31 * result + (this.customCaBundle != null ? this.customCaBundle.hashCode() : 0);
            result = 31 * result + (this.defaultTags != null ? this.defaultTags.hashCode() : 0);
            result = 31 * result + (this.ec2MetadataServiceEndpoint != null ? this.ec2MetadataServiceEndpoint.hashCode() : 0);
            result = 31 * result + (this.ec2MetadataServiceEndpointMode != null ? this.ec2MetadataServiceEndpointMode.hashCode() : 0);
            result = 31 * result + (this.endpoints != null ? this.endpoints.hashCode() : 0);
            result = 31 * result + (this.forbiddenAccountIds != null ? this.forbiddenAccountIds.hashCode() : 0);
            result = 31 * result + (this.httpProxy != null ? this.httpProxy.hashCode() : 0);
            result = 31 * result + (this.ignoreTags != null ? this.ignoreTags.hashCode() : 0);
            result = 31 * result + (this.insecure != null ? this.insecure.hashCode() : 0);
            result = 31 * result + (this.maxRetries != null ? this.maxRetries.hashCode() : 0);
            result = 31 * result + (this.profile != null ? this.profile.hashCode() : 0);
            result = 31 * result + (this.region != null ? this.region.hashCode() : 0);
            result = 31 * result + (this.s3ForcePathStyle != null ? this.s3ForcePathStyle.hashCode() : 0);
            result = 31 * result + (this.s3UsePathStyle != null ? this.s3UsePathStyle.hashCode() : 0);
            result = 31 * result + (this.secretKey != null ? this.secretKey.hashCode() : 0);
            result = 31 * result + (this.sharedConfigFiles != null ? this.sharedConfigFiles.hashCode() : 0);
            result = 31 * result + (this.sharedCredentialsFile != null ? this.sharedCredentialsFile.hashCode() : 0);
            result = 31 * result + (this.sharedCredentialsFiles != null ? this.sharedCredentialsFiles.hashCode() : 0);
            result = 31 * result + (this.skipCredentialsValidation != null ? this.skipCredentialsValidation.hashCode() : 0);
            result = 31 * result + (this.skipGetEc2Platforms != null ? this.skipGetEc2Platforms.hashCode() : 0);
            result = 31 * result + (this.skipMetadataApiCheck != null ? this.skipMetadataApiCheck.hashCode() : 0);
            result = 31 * result + (this.skipRegionValidation != null ? this.skipRegionValidation.hashCode() : 0);
            result = 31 * result + (this.skipRequestingAccountId != null ? this.skipRequestingAccountId.hashCode() : 0);
            result = 31 * result + (this.stsRegion != null ? this.stsRegion.hashCode() : 0);
            result = 31 * result + (this.token != null ? this.token.hashCode() : 0);
            result = 31 * result + (this.useDualstackEndpoint != null ? this.useDualstackEndpoint.hashCode() : 0);
            result = 31 * result + (this.useFipsEndpoint != null ? this.useFipsEndpoint.hashCode() : 0);
            return result;
        }
    }
}
