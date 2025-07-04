// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **WARNING:** This datasource is deprecated, use `mongodbatlas.Team`
 *
 * This data source is deprecated. Please transition to using `mongodbatlas.Team` which defines the same underlying implementation, aligning the name of the data source with the implementation which fetches a single team.
 *
 * In the future this data source will define a new implementation capable of fetching all teams in one organization.
 */
export function getTeams(args: GetTeamsArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("mongodbatlas:index/getTeams:getTeams", {
        "name": args.name,
        "orgId": args.orgId,
        "teamId": args.teamId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeams.
 */
export interface GetTeamsArgs {
    name?: string;
    orgId: string;
    teamId?: string;
}

/**
 * A collection of values returned by getTeams.
 */
export interface GetTeamsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    readonly orgId: string;
    readonly teamId: string;
    readonly usernames: string[];
}
/**
 * **WARNING:** This datasource is deprecated, use `mongodbatlas.Team`
 *
 * This data source is deprecated. Please transition to using `mongodbatlas.Team` which defines the same underlying implementation, aligning the name of the data source with the implementation which fetches a single team.
 *
 * In the future this data source will define a new implementation capable of fetching all teams in one organization.
 */
export function getTeamsOutput(args: GetTeamsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTeamsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("mongodbatlas:index/getTeams:getTeams", {
        "name": args.name,
        "orgId": args.orgId,
        "teamId": args.teamId,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeams.
 */
export interface GetTeamsOutputArgs {
    name?: pulumi.Input<string>;
    orgId: pulumi.Input<string>;
    teamId?: pulumi.Input<string>;
}
