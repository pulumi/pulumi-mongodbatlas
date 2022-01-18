// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface AlertConfigurationMatcher {
    /**
     * Name of the field in the target object to match on.
     */
    fieldName?: pulumi.Input<string>;
    /**
     * Operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
     */
    operator?: pulumi.Input<string>;
    /**
     * Value to test with the specified operator. If `fieldName` is set to TYPE_NAME, you can match on the following values:
     * - `PRIMARY`
     * - `SECONDARY`
     * - `STANDALONE`
     * - `CONFIG`
     * - `MONGOS`
     */
    value?: pulumi.Input<string>;
}

export interface AlertConfigurationMetricThresholdConfig {
    /**
     * Name of the metric to check. The full list of current options is available [here](https://docs.atlas.mongodb.com/reference/alert-host-metrics/#measurement-types)
     */
    metricName?: pulumi.Input<string>;
    /**
     * This must be set to AVERAGE. Atlas computes the current metric value as an average.
     */
    mode?: pulumi.Input<string>;
    /**
     * Operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
     */
    operator?: pulumi.Input<string>;
    /**
     * Threshold value outside of which an alert will be triggered.
     */
    threshold?: pulumi.Input<number>;
    /**
     * The units for the threshold value. Depends on the type of metric.
     * Accepted values are:
     * - `RAW`
     * - `BITS`
     * - `BYTES`
     * - `KILOBITS`
     * - `KILOBYTES`
     * - `MEGABITS`
     * - `MEGABYTES`
     * - `GIGABITS`
     * - `GIGABYTES`
     * - `TERABYTES`
     * - `PETABYTES`
     * - `MILLISECONDS`
     * - `SECONDS`
     * - `MINUTES`
     * - `HOURS`
     * - `DAYS`
     */
    units?: pulumi.Input<string>;
}

export interface AlertConfigurationNotification {
    /**
     * Slack API token. Required for the SLACK notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     */
    apiToken?: pulumi.Input<string>;
    /**
     * Slack channel name. Required for the SLACK notifications type.
     */
    channelName?: pulumi.Input<string>;
    /**
     * Datadog API Key. Found in the Datadog dashboard. Required for the DATADOG notifications type.
     */
    datadogApiKey?: pulumi.Input<string>;
    /**
     * Region that indicates which API URL to use. Accepted regions are: `US`, `EU`. The default Datadog region is US.
     */
    datadogRegion?: pulumi.Input<string>;
    /**
     * Number of minutes to wait after an alert condition is detected before sending out the first notification.
     */
    delayMin?: pulumi.Input<number>;
    /**
     * Email address to which alert notifications are sent. Required for the EMAIL notifications type.
     */
    emailAddress?: pulumi.Input<string>;
    /**
     * Flag indicating email notifications should be sent. This flag is only valid if `typeName` is set to `ORG`, `GROUP`, or `USER`.
     */
    emailEnabled?: pulumi.Input<boolean>;
    /**
     * Flowdock flow name in lower-case letters. Required for the `FLOWDOCK` notifications type
     */
    flowName?: pulumi.Input<string>;
    /**
     * The Flowdock personal API token. Required for the `FLOWDOCK` notifications type. If the token later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     */
    flowdockApiToken?: pulumi.Input<string>;
    /**
     * Number of minutes to wait between successive notifications for unacknowledged alerts that are not resolved. The minimum value is 5. **NOTE** `PAGER_DUTY`, `VICTOR_OPS`, and `OPS_GENIE` notifications do not return this value. The notification interval must be configured and managed within each external service.
     */
    intervalMin?: pulumi.Input<number>;
    /**
     * Mobile number to which alert notifications are sent. Required for the SMS notifications type.
     */
    mobileNumber?: pulumi.Input<string>;
    /**
     * Opsgenie API Key. Required for the `OPS_GENIE` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the token.
     */
    opsGenieApiKey?: pulumi.Input<string>;
    /**
     * Region that indicates which API URL to use. Accepted regions are: `US` ,`EU`. The default Opsgenie region is US.
     */
    opsGenieRegion?: pulumi.Input<string>;
    /**
     * Flowdock organization name in lower-case letters. This is the name that appears after www.flowdock.com/app/ in the URL string. Required for the FLOWDOCK notifications type.
     */
    orgName?: pulumi.Input<string>;
    /**
     * Optional. One or more roles that receive the configured alert. If you include this field, Atlas sends alerts only to users assigned the roles you specify in the array. If you omit this field, Atlas sends alerts to users assigned any role. This parameter is only valid if `typeName` is set to `ORG`, `GROUP`, or `USER`.
     * Accepted values are:
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * PagerDuty service key. Required for the PAGER_DUTY notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     */
    serviceKey?: pulumi.Input<string>;
    /**
     * Flag indicating if text message notifications should be sent to this user's mobile phone. This flag is only valid if `typeName` is set to `ORG`, `GROUP`, or `USER`.
     */
    smsEnabled?: pulumi.Input<boolean>;
    /**
     * Unique identifier of a team.
     */
    teamId?: pulumi.Input<string>;
    /**
     * Label for the team that receives this notification.
     */
    teamName?: pulumi.Input<string>;
    /**
     * Type of alert notification.
     * Accepted values are:
     * - `DATADOG`
     * - `EMAIL`
     * - `FLOWDOCK`
     */
    typeName?: pulumi.Input<string>;
    /**
     * Name of the Atlas user to which to send notifications. Only a user in the project that owns the alert configuration is allowed here. Required for the `USER` notifications type.
     */
    username?: pulumi.Input<string>;
    /**
     * VictorOps API key. Required for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     */
    victorOpsApiKey?: pulumi.Input<string>;
    /**
     * VictorOps routing key. Optional for the `VICTOR_OPS` notifications type. If the key later becomes invalid, Atlas sends an email to the project owner and eventually removes the key.
     */
    victorOpsRoutingKey?: pulumi.Input<string>;
}

export interface AlertConfigurationThresholdConfig {
    /**
     * Operator to apply when checking the current metric value against the threshold value.
     * Accepted values are:
     * - `GREATER_THAN`
     * - `LESS_THAN`
     */
    operator?: pulumi.Input<string>;
    /**
     * Threshold value outside of which an alert will be triggered.
     */
    threshold?: pulumi.Input<number>;
    /**
     * The units for the threshold value. Depends on the type of metric.
     * Accepted values are:
     * - `RAW`
     * - `BITS`
     * - `BYTES`
     * - `KILOBITS`
     * - `KILOBYTES`
     * - `MEGABITS`
     * - `MEGABYTES`
     * - `GIGABITS`
     * - `GIGABYTES`
     * - `TERABYTES`
     * - `PETABYTES`
     * - `MILLISECONDS`
     * - `SECONDS`
     * - `MINUTES`
     * - `HOURS`
     * - `DAYS`
     */
    units?: pulumi.Input<string>;
}

export interface CloudBackupSchedulePolicyItemDaily {
    /**
     * Desired frequency of the new backup policy item specified by `frequencyType`.
     */
    frequencyInterval: pulumi.Input<number>;
    frequencyType?: pulumi.Input<string>;
    id?: pulumi.Input<string>;
    /**
     * Scope of the backup policy item: days, weeks, or months.
     */
    retentionUnit: pulumi.Input<string>;
    /**
     * Value to associate with `retentionUnit`.
     */
    retentionValue: pulumi.Input<number>;
}

export interface CloudBackupSchedulePolicyItemHourly {
    /**
     * Desired frequency of the new backup policy item specified by `frequencyType`.
     */
    frequencyInterval: pulumi.Input<number>;
    frequencyType?: pulumi.Input<string>;
    id?: pulumi.Input<string>;
    /**
     * Scope of the backup policy item: days, weeks, or months.
     */
    retentionUnit: pulumi.Input<string>;
    /**
     * Value to associate with `retentionUnit`.
     */
    retentionValue: pulumi.Input<number>;
}

export interface CloudBackupSchedulePolicyItemMonthly {
    /**
     * Desired frequency of the new backup policy item specified by `frequencyType`.
     */
    frequencyInterval: pulumi.Input<number>;
    frequencyType?: pulumi.Input<string>;
    id?: pulumi.Input<string>;
    /**
     * Scope of the backup policy item: days, weeks, or months.
     */
    retentionUnit: pulumi.Input<string>;
    /**
     * Value to associate with `retentionUnit`.
     */
    retentionValue: pulumi.Input<number>;
}

export interface CloudBackupSchedulePolicyItemWeekly {
    /**
     * Desired frequency of the new backup policy item specified by `frequencyType`.
     */
    frequencyInterval: pulumi.Input<number>;
    frequencyType?: pulumi.Input<string>;
    id?: pulumi.Input<string>;
    /**
     * Scope of the backup policy item: days, weeks, or months.
     */
    retentionUnit: pulumi.Input<string>;
    /**
     * Value to associate with `retentionUnit`.
     */
    retentionValue: pulumi.Input<number>;
}

export interface CloudProviderAccessAuthorizationAws {
    iamAssumedRoleArn: pulumi.Input<string>;
}

export interface CloudProviderAccessAuthorizationFeatureUsage {
    featureId?: pulumi.Input<{[key: string]: any}>;
    featureType?: pulumi.Input<string>;
}

export interface CloudProviderAccessFeatureUsage {
    featureId?: pulumi.Input<{[key: string]: any}>;
    featureType?: pulumi.Input<string>;
}

export interface CloudProviderAccessSetupAwsConfig {
    atlasAssumedRoleExternalId?: pulumi.Input<string>;
    atlasAwsAccountArn?: pulumi.Input<string>;
}

export interface CloudProviderSnapshotBackupPolicyPolicy {
    id: pulumi.Input<string>;
    policyItems: pulumi.Input<pulumi.Input<inputs.CloudProviderSnapshotBackupPolicyPolicyPolicyItem>[]>;
}

export interface CloudProviderSnapshotBackupPolicyPolicyPolicyItem {
    frequencyInterval: pulumi.Input<number>;
    frequencyType: pulumi.Input<string>;
    id: pulumi.Input<string>;
    retentionUnit: pulumi.Input<string>;
    retentionValue: pulumi.Input<number>;
}

export interface CloudProviderSnapshotRestoreJobDeliveryTypeConfig {
    automated?: pulumi.Input<boolean>;
    download?: pulumi.Input<boolean>;
    oplogInc?: pulumi.Input<number>;
    oplogTs?: pulumi.Input<number>;
    pointInTime?: pulumi.Input<boolean>;
    pointInTimeUtcSeconds?: pulumi.Input<number>;
    /**
     * Name of the target Atlas cluster to which the restore job restores the snapshot. Only required if deliveryType is automated.
     */
    targetClusterName?: pulumi.Input<string>;
    targetProjectId?: pulumi.Input<string>;
}

export interface ClusterAdvancedConfiguration {
    /**
     * [Default level of acknowledgment requested from MongoDB for read operations](https://docs.mongodb.com/manual/reference/read-concern/) set for this cluster. MongoDB 4.4 clusters default to [available](https://docs.mongodb.com/manual/reference/read-concern-available/).
     */
    defaultReadConcern?: pulumi.Input<string>;
    /**
     * [Default level of acknowledgment requested from MongoDB for write operations](https://docs.mongodb.com/manual/reference/write-concern/) set for this cluster. MongoDB 4.4 clusters default to [1](https://docs.mongodb.com/manual/reference/write-concern/).
     */
    defaultWriteConcern?: pulumi.Input<string>;
    /**
     * When true, documents can only be updated or inserted if, for all indexed fields on the target collection, the corresponding index entries do not exceed 1024 bytes. When false, mongod writes documents that exceed the limit but does not index them.
     */
    failIndexKeyTooLong?: pulumi.Input<boolean>;
    /**
     * When true, the cluster allows execution of operations that perform server-side executions of JavaScript. When false, the cluster disables execution of those operations.
     */
    javascriptEnabled?: pulumi.Input<boolean>;
    /**
     * Sets the minimum Transport Layer Security (TLS) version the cluster accepts for incoming connections.Valid values are:
     */
    minimumEnabledTlsProtocol?: pulumi.Input<string>;
    /**
     * When true, the cluster disables the execution of any query that requires a collection scan to return results. When false, the cluster allows the execution of those operations.
     */
    noTableScan?: pulumi.Input<boolean>;
    /**
     * The custom oplog size of the cluster. Without a value that indicates that the cluster uses the default oplog size calculated by Atlas.
     */
    oplogSizeMb?: pulumi.Input<number>;
    /**
     * Interval in seconds at which the mongosqld process re-samples data to create its relational schema. The default value is 300. The specified value must be a positive integer. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     */
    sampleRefreshIntervalBiConnector?: pulumi.Input<number>;
    /**
     * Number of documents per database to sample when gathering schema information. Defaults to 100. Available only for Atlas deployments in which BI Connector for Atlas is enabled.
     */
    sampleSizeBiConnector?: pulumi.Input<number>;
}

export interface ClusterBiConnectorConfig {
    /**
     * Specifies whether or not BI Connector for Atlas is enabled on the cluster.l
     * *
     * - Set to `true` to enable BI Connector for Atlas.
     * - Set to `false` to disable BI Connector for Atlas.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the read preference to be used by BI Connector for Atlas on the cluster. Each BI Connector for Atlas read preference contains a distinct combination of [readPreference](https://docs.mongodb.com/manual/core/read-preference/) and [readPreferenceTags](https://docs.mongodb.com/manual/core/read-preference/#tag-sets) options. For details on BI Connector for Atlas read preferences, refer to the [BI Connector Read Preferences Table](https://docs.atlas.mongodb.com/tutorial/create-global-writes-cluster/#bic-read-preferences).
     */
    readPreference?: pulumi.Input<string>;
}

export interface ClusterConnectionString {
    /**
     * @deprecated This field is deprecated. Use connection_strings.private_endpoint[n].connection_string instead
     */
    awsPrivateLink?: pulumi.Input<{[key: string]: any}>;
    /**
     * @deprecated This field is deprecated. Use connection_strings.private_endpoint[n].srv_connection_string instead
     */
    awsPrivateLinkSrv?: pulumi.Input<{[key: string]: any}>;
    private?: pulumi.Input<string>;
    privateEndpoints?: pulumi.Input<pulumi.Input<inputs.ClusterConnectionStringPrivateEndpoint>[]>;
    privateSrv?: pulumi.Input<string>;
    standard?: pulumi.Input<string>;
    standardSrv?: pulumi.Input<string>;
}

export interface ClusterConnectionStringPrivateEndpoint {
    connectionString?: pulumi.Input<string>;
    endpoints?: pulumi.Input<pulumi.Input<inputs.ClusterConnectionStringPrivateEndpointEndpoint>[]>;
    srvConnectionString?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

export interface ClusterConnectionStringPrivateEndpointEndpoint {
    endpointId?: pulumi.Input<string>;
    /**
     * Cloud service provider on which the servers are provisioned.
     */
    providerName?: pulumi.Input<string>;
    region?: pulumi.Input<string>;
}

export interface ClusterLabel {
    /**
     * The key that you want to write.
     */
    key?: pulumi.Input<string>;
    /**
     * The value that you want to write.
     */
    value?: pulumi.Input<string>;
}

export interface ClusterReplicationSpec {
    /**
     * Unique identifer of the replication document for a zone in a Global Cluster.
     */
    id?: pulumi.Input<string>;
    /**
     * Number of shards to deploy in the specified zone, minimum 1.
     */
    numShards: pulumi.Input<number>;
    /**
     * Physical location of the region. Each regionsConfig document describes the region’s priority in elections and the number and type of MongoDB nodes Atlas deploys to the region. You must order each regionsConfigs document by regionsConfig.priority, descending. See Region Config below for more details.
     */
    regionsConfigs?: pulumi.Input<pulumi.Input<inputs.ClusterReplicationSpecRegionsConfig>[]>;
    /**
     * Name for the zone in a Global Cluster.
     */
    zoneName?: pulumi.Input<string>;
}

export interface ClusterReplicationSpecRegionsConfig {
    /**
     * The number of analytics nodes for Atlas to deploy to the region. Analytics nodes are useful for handling analytic data such as reporting queries from BI Connector for Atlas. Analytics nodes are read-only, and can never become the primary. If you do not specify this option, no analytics nodes are deployed to the region.
     */
    analyticsNodes?: pulumi.Input<number>;
    /**
     * Number of electable nodes for Atlas to deploy to the region. Electable nodes can become the primary and can facilitate local reads.
     * * The total number of electableNodes across all replication spec regions  must total 3, 5, or 7.
     * * Specify 0 if you do not want any electable nodes in the region.
     * * You cannot create electable nodes in a region if `priority` is 0.
     */
    electableNodes?: pulumi.Input<number>;
    /**
     * Election priority of the region. For regions with only read-only nodes, set this value to 0.
     * * For regions where `electableNodes` is at least 1, each region must have a priority of exactly one (1) less than the previous region. The first region must have a priority of 7. The lowest possible priority is 1.
     * * The priority 7 region identifies the Preferred Region of the cluster. Atlas places the primary node in the Preferred Region. Priorities 1 through 7 are exclusive - no more than one region per cluster can be assigned a given priority.
     * * Example: If you have three regions, their priorities would be 7, 6, and 5 respectively. If you added two more regions for supporting electable nodes, the priorities of those regions would be 4 and 3 respectively.
     */
    priority?: pulumi.Input<number>;
    /**
     * Number of read-only nodes for Atlas to deploy to the region. Read-only nodes can never become the primary, but can facilitate local-reads. Specify 0 if you do not want any read-only nodes in the region.
     */
    readOnlyNodes?: pulumi.Input<number>;
    /**
     * Physical location of your MongoDB cluster. The region you choose can affect network latency for clients accessing your databases.  Requires the **Atlas region name**, see the reference list for [AWS](https://docs.atlas.mongodb.com/reference/amazon-aws/), [GCP](https://docs.atlas.mongodb.com/reference/google-gcp/), [Azure](https://docs.atlas.mongodb.com/reference/microsoft-azure/).
     */
    regionName: pulumi.Input<string>;
}

export interface ClusterSnapshotBackupPolicy {
    /**
     * The cluster ID.
     */
    clusterId?: pulumi.Input<string>;
    clusterName?: pulumi.Input<string>;
    nextSnapshot?: pulumi.Input<string>;
    policies?: pulumi.Input<pulumi.Input<inputs.ClusterSnapshotBackupPolicyPolicy>[]>;
    referenceHourOfDay?: pulumi.Input<number>;
    referenceMinuteOfHour?: pulumi.Input<number>;
    restoreWindowDays?: pulumi.Input<number>;
    updateSnapshots?: pulumi.Input<boolean>;
}

export interface ClusterSnapshotBackupPolicyPolicy {
    /**
     * Unique identifer of the replication document for a zone in a Global Cluster.
     */
    id?: pulumi.Input<string>;
    policyItems?: pulumi.Input<pulumi.Input<inputs.ClusterSnapshotBackupPolicyPolicyPolicyItem>[]>;
}

export interface ClusterSnapshotBackupPolicyPolicyPolicyItem {
    frequencyInterval?: pulumi.Input<number>;
    frequencyType?: pulumi.Input<string>;
    /**
     * Unique identifer of the replication document for a zone in a Global Cluster.
     */
    id?: pulumi.Input<string>;
    retentionUnit?: pulumi.Input<string>;
    retentionValue?: pulumi.Input<number>;
}

export interface CustomDbRoleAction {
    /**
     * Name of the privilege action. For a complete list of actions available in the Atlas API, see [Custom Role Actions](https://docs.atlas.mongodb.com/reference/api/custom-role-actions)
     * > **Note**: The privilege actions available to the Custom Roles API resource represent a subset of the privilege actions available in the Atlas Custom Roles UI.
     */
    action: pulumi.Input<string>;
    /**
     * Contains information on where the action is granted. Each object in the array either indicates a database and collection on which the action is granted, or indicates that the action is granted on the cluster resource.
     */
    resources: pulumi.Input<pulumi.Input<inputs.CustomDbRoleActionResource>[]>;
}

export interface CustomDbRoleActionResource {
    cluster?: pulumi.Input<boolean>;
    collectionName?: pulumi.Input<string>;
    /**
     * Database on which the inherited role is granted.
     */
    databaseName?: pulumi.Input<string>;
}

export interface CustomDbRoleInheritedRole {
    /**
     * Database on which the inherited role is granted.
     */
    databaseName: pulumi.Input<string>;
    /**
     * Name of the inherited role. This can either be another custom role or a built-in role.
     */
    roleName: pulumi.Input<string>;
}

export interface DataLakeAws {
    externalId?: pulumi.Input<string>;
    iamAssumedRoleArn?: pulumi.Input<string>;
    iamUserArn?: pulumi.Input<string>;
    roleId: pulumi.Input<string>;
    testS3Bucket: pulumi.Input<string>;
}

export interface DataLakeDataProcessRegion {
    cloudProvider: pulumi.Input<string>;
    region: pulumi.Input<string>;
}

export interface DataLakeStorageDatabase {
    collections?: pulumi.Input<pulumi.Input<inputs.DataLakeStorageDatabaseCollection>[]>;
    maxWildcardCollections?: pulumi.Input<number>;
    /**
     * Name of the Atlas Data Lake.
     */
    name?: pulumi.Input<string>;
    views?: pulumi.Input<pulumi.Input<inputs.DataLakeStorageDatabaseView>[]>;
}

export interface DataLakeStorageDatabaseCollection {
    dataSources?: pulumi.Input<pulumi.Input<inputs.DataLakeStorageDatabaseCollectionDataSource>[]>;
    /**
     * Name of the Atlas Data Lake.
     */
    name?: pulumi.Input<string>;
}

export interface DataLakeStorageDatabaseCollectionDataSource {
    defaultFormat?: pulumi.Input<string>;
    path?: pulumi.Input<string>;
    storeName?: pulumi.Input<string>;
}

export interface DataLakeStorageDatabaseView {
    /**
     * Name of the Atlas Data Lake.
     */
    name?: pulumi.Input<string>;
    pipeline?: pulumi.Input<string>;
    source?: pulumi.Input<string>;
}

export interface DataLakeStorageStore {
    additionalStorageClasses?: pulumi.Input<pulumi.Input<string>[]>;
    bucket?: pulumi.Input<string>;
    delimiter?: pulumi.Input<string>;
    includeTags?: pulumi.Input<boolean>;
    /**
     * Name of the Atlas Data Lake.
     */
    name?: pulumi.Input<string>;
    prefix?: pulumi.Input<string>;
    provider?: pulumi.Input<string>;
    region?: pulumi.Input<string>;
}

export interface DatabaseUserLabel {
    /**
     * The key that you want to write.
     */
    key?: pulumi.Input<string>;
    /**
     * The value that you want to write.
     */
    value?: pulumi.Input<string>;
}

export interface DatabaseUserRole {
    /**
     * Collection for which the role applies. You can specify a collection for the `read` and `readWrite` roles. If you do not specify a collection for `read` and `readWrite`, the role applies to all collections in the database (excluding some collections in the `system`. database).
     */
    collectionName?: pulumi.Input<string>;
    /**
     * Database on which the user has the specified role. A role on the `admin` database can include privileges that apply to the other databases.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * Name of the role to grant. See [Create a Database User](https://docs.atlas.mongodb.com/reference/api/database-users-create-a-user/) `roles.roleName` for valid values and restrictions.
     */
    roleName?: pulumi.Input<string>;
}

export interface DatabaseUserScope {
    /**
     * Name of the cluster or Atlas Data Lake that the user has access to.
     */
    name?: pulumi.Input<string>;
    /**
     * Type of resource that the user has access to. Valid values are: `CLUSTER` and `DATA_LAKE`
     */
    type?: pulumi.Input<string>;
}

export interface EncryptionAtRestAwsKmsConfig {
    accessKeyId?: pulumi.Input<string>;
    /**
     * The AWS customer master key used to encrypt and decrypt the MongoDB master keys.
     */
    customerMasterKeyId?: pulumi.Input<string>;
    /**
     * Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The AWS region in which the AWS customer master key exists: CA_CENTRAL_1, US_EAST_1, US_EAST_2, US_WEST_1, US_WEST_2, SA_EAST_1
     */
    region?: pulumi.Input<string>;
    /**
     * ID of an AWS IAM role authorized to manage an AWS customer master key. To find the ID for an existing IAM role check the `roleId` attribute of the `mongodbatlas.CloudProviderAccess` resource.
     */
    roleId?: pulumi.Input<string>;
    secretAccessKey?: pulumi.Input<string>;
}

export interface EncryptionAtRestAzureKeyVaultConfig {
    /**
     * The Azure environment where the Azure account credentials reside. Valid values are the following: AZURE, AZURE_CHINA, AZURE_GERMANY
     */
    azureEnvironment?: pulumi.Input<string>;
    /**
     * The client ID, also known as the application ID, for an Azure application associated with the Azure AD tenant.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * The unique identifier of a key in an Azure Key Vault.
     */
    keyIdentifier?: pulumi.Input<string>;
    /**
     * The name of an Azure Key Vault containing your key.
     */
    keyVaultName?: pulumi.Input<string>;
    /**
     * The name of the Azure Resource group that contains an Azure Key Vault.
     */
    resourceGroupName?: pulumi.Input<string>;
    /**
     * The secret associated with the Azure Key Vault specified by azureKeyVault.tenantID.
     */
    secret?: pulumi.Input<string>;
    /**
     * The unique identifier associated with an Azure subscription.
     */
    subscriptionId?: pulumi.Input<string>;
    /**
     * The unique identifier for an Azure AD tenant within an Azure subscription.
     */
    tenantId?: pulumi.Input<string>;
}

export interface EncryptionAtRestGoogleCloudKmsConfig {
    /**
     * Specifies whether Encryption at Rest is enabled for an Atlas project. To disable Encryption at Rest, pass only this parameter with a value of false. When you disable Encryption at Rest, Atlas also removes the configuration details.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The Key Version Resource ID from your GCP account.
     */
    keyVersionResourceId?: pulumi.Input<string>;
    /**
     * String-formatted JSON object containing GCP KMS credentials from your GCP account.
     */
    serviceAccountKey?: pulumi.Input<string>;
}

export interface EventTriggerEventProcessors {
    awsEventbridge?: pulumi.Input<inputs.EventTriggerEventProcessorsAwsEventbridge>;
}

export interface EventTriggerEventProcessorsAwsEventbridge {
    configAccountId?: pulumi.Input<string>;
    configRegion?: pulumi.Input<string>;
}

export interface GetCustomDbRoleInheritedRole {
    databaseName?: string;
    /**
     * Name of the custom role.
     */
    roleName?: string;
}

export interface GetCustomDbRoleInheritedRoleArgs {
    databaseName?: pulumi.Input<string>;
    /**
     * Name of the custom role.
     */
    roleName?: pulumi.Input<string>;
}

export interface GetGlobalClusterConfigManagedNamespaceArgs {
    /**
     * (Required) The name of the collection associated with the managed namespace.
     */
    collection: pulumi.Input<string>;
    /**
     * (Required)	The custom shard key for the collection. Global Clusters require a compound shard key consisting of a location field and a user-selected second key, the custom shard key.
     */
    customShardKey: pulumi.Input<string>;
    /**
     * (Required) The name of the database containing the collection.
     */
    db: pulumi.Input<string>;
    /**
     * Specifies whether the custom shard key for the collection is [hashed](https://docs.mongodb.com/manual/reference/method/sh.shardCollection/#hashed-shard-keys). If omitted, defaults to `false`. If `false`, Atlas uses [ranged sharding](https://docs.mongodb.com/manual/core/ranged-sharding/). This is only available for Atlas clusters with MongoDB v4.4 and later.
     */
    isCustomShardKeyHashed?: pulumi.Input<boolean>;
    /**
     * Specifies whether the underlying index enforces a unique constraint. If omitted, defaults to false. You cannot specify true when using [hashed shard keys](https://docs.mongodb.com/manual/core/hashed-sharding/#std-label-sharding-hashed).
     */
    isShardKeyUnique?: pulumi.Input<boolean>;
}

export interface GetGlobalClusterConfigManagedNamespace {
    /**
     * (Required) The name of the collection associated with the managed namespace.
     */
    collection: string;
    /**
     * (Required)	The custom shard key for the collection. Global Clusters require a compound shard key consisting of a location field and a user-selected second key, the custom shard key.
     */
    customShardKey: string;
    /**
     * (Required) The name of the database containing the collection.
     */
    db: string;
    /**
     * Specifies whether the custom shard key for the collection is [hashed](https://docs.mongodb.com/manual/reference/method/sh.shardCollection/#hashed-shard-keys). If omitted, defaults to `false`. If `false`, Atlas uses [ranged sharding](https://docs.mongodb.com/manual/core/ranged-sharding/). This is only available for Atlas clusters with MongoDB v4.4 and later.
     */
    isCustomShardKeyHashed?: boolean;
    /**
     * Specifies whether the underlying index enforces a unique constraint. If omitted, defaults to false. You cannot specify true when using [hashed shard keys](https://docs.mongodb.com/manual/core/hashed-sharding/#std-label-sharding-hashed).
     */
    isShardKeyUnique?: boolean;
}

export interface GlobalClusterConfigCustomZoneMapping {
    /**
     * The ISO location code to which you want to map a zone in your Global Cluster. You can find a list of all supported location codes [here](https://cloud.mongodb.com/static/atlas/country_iso_codes.txt).
     */
    location?: pulumi.Input<string>;
    /**
     * The name of the zone in your Global Cluster that you want to map to location.
     */
    zone?: pulumi.Input<string>;
}

export interface GlobalClusterConfigManagedNamespace {
    /**
     * The name of the collection associated with the managed namespace.
     */
    collection: pulumi.Input<string>;
    /**
     * The custom shard key for the collection. Global Clusters require a compound shard key consisting of a location field and a user-selected second key, the custom shard key.
     */
    customShardKey: pulumi.Input<string>;
    /**
     * The name of the database containing the collection.
     */
    db: pulumi.Input<string>;
    /**
     * Specifies whether the custom shard key for the collection is [hashed](https://docs.mongodb.com/manual/reference/method/sh.shardCollection/#hashed-shard-keys). If omitted, defaults to `false`. If `false`, Atlas uses [ranged sharding](https://docs.mongodb.com/manual/core/ranged-sharding/). This is only available for Atlas clusters with MongoDB v4.4 and later.
     */
    isCustomShardKeyHashed?: pulumi.Input<boolean>;
    /**
     * Specifies whether the underlying index enforces a unique constraint. If omitted, defaults to false. You cannot specify true when using [hashed shard keys](https://docs.mongodb.com/manual/core/hashed-sharding/#std-label-sharding-hashed).
     */
    isShardKeyUnique?: pulumi.Input<boolean>;
}

export interface LdapConfigurationUserToDnMapping {
    ldapQuery?: pulumi.Input<string>;
    match?: pulumi.Input<string>;
    substitution?: pulumi.Input<string>;
}

export interface LdapVerifyLink {
    href?: pulumi.Input<string>;
    rel?: pulumi.Input<string>;
}

export interface LdapVerifyValidation {
    /**
     * The current status of the LDAP over TLS/SSL configuration. One of the following values: `PENDING`, `SUCCESS`, and `FAILED`.
     */
    status?: pulumi.Input<string>;
    validationType?: pulumi.Input<string>;
}

export interface OnlineArchiveCriteria {
    dateField?: pulumi.Input<string>;
    dateFormat?: pulumi.Input<string>;
    expireAfterDays?: pulumi.Input<number>;
    query?: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface OnlineArchivePartitionField {
    fieldName: pulumi.Input<string>;
    fieldType?: pulumi.Input<string>;
    order: pulumi.Input<number>;
}

export interface PrivateLinkEndpointServiceEndpoint {
    /**
     * Forwarding rule that corresponds to the endpoint you created in GCP.
     */
    endpointName?: pulumi.Input<string>;
    /**
     * Private IP address of the endpoint you created in GCP.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * Unique alphanumeric and special character strings that identify the service attachment associated with the endpoint.
     */
    serviceAttachmentName?: pulumi.Input<string>;
    /**
     * Status of the endpoint. Atlas returns one of the [values shown above](https://docs.atlas.mongodb.com/reference/api/private-endpoints-endpoint-create-one/#std-label-ref-status-field).
     */
    status?: pulumi.Input<string>;
}

export interface ProjectApiKey {
    /**
     * The unique identifier of the Programmatic API key you want to associate with the Project.  The Programmatic API key and Project must share the same parent organization.  Note: this is not the `publicKey` of the Programmatic API key but the `id` of the key. See [Programmatic API Keys](https://docs.atlas.mongodb.com/reference/api/apiKeys/) for more.
     */
    apiKeyId: pulumi.Input<string>;
    /**
     * List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key.
     * The following are valid roles:
     * * `GROUP_OWNER`
     * * `GROUP_READ_ONLY`
     * * `GROUP_DATA_ACCESS_ADMIN`
     * * `GROUP_DATA_ACCESS_READ_WRITE`
     * * `GROUP_DATA_ACCESS_READ_ONLY`
     * * `GROUP_CLUSTER_MANAGER`
     */
    roleNames: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ProjectTeam {
    /**
     * List of Project roles that the Programmatic API key needs to have. Ensure you provide: at least one role and ensure all roles are valid for the Project.  You must specify an array even if you are only associating a single role with the Programmatic API key.
     * The following are valid roles:
     * * `GROUP_OWNER`
     * * `GROUP_READ_ONLY`
     * * `GROUP_DATA_ACCESS_ADMIN`
     * * `GROUP_DATA_ACCESS_READ_WRITE`
     * * `GROUP_DATA_ACCESS_READ_ONLY`
     * * `GROUP_CLUSTER_MANAGER`
     */
    roleNames: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique identifier of the team you want to associate with the project. The team and project must share the same parent organization.
     */
    teamId: pulumi.Input<string>;
}

export interface SearchIndexSynonym {
    /**
     * Name of the [analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/#std-label-analyzers-ref) to use with this synonym mapping. Atlas Search doesn't support these [custom analyzer](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-custom-analyzers) tokenizers and token filters in [analyzers used in synonym mappings](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#options):
     * * [nGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-ngram-tokenizer-ref) Tokenizer
     * * [edgeGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-edgegram-tokenizer-ref) Tokenizers
     * * [daitchMokotoffSoundex](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-daitchmokotoffsoundex-tf-ref) token filter
     * * [nGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-ngram-tf-ref) token filter
     * * [edgeGram](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-edgegram-tf-ref) token filter
     * * [shingle](https://docs.atlas.mongodb.com/reference/atlas-search/analyzers/custom/#std-label-shingle-tf-ref) token filter
     */
    analyzer: pulumi.Input<string>;
    /**
     * Name of the [synonym mapping definition](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-ref). Name must be unique in this index definition and it can't be an empty string.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the source MongoDB collection for the synonyms. Documents in this collection must be in the format described in the [Synonyms Source Collection Documents](https://docs.atlas.mongodb.com/reference/atlas-search/synonyms/#std-label-synonyms-coll-spec).
     */
    sourceCollection: pulumi.Input<string>;
}

export interface X509AuthenticationDatabaseUserCertificate {
    createdAt?: pulumi.Input<string>;
    groupId?: pulumi.Input<string>;
    id?: pulumi.Input<number>;
    notAfter?: pulumi.Input<string>;
    subject?: pulumi.Input<string>;
}
