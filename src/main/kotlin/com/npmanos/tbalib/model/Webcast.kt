/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.5.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.npmanos.tbalib.model


/**
 * 
 * @param type Type of webcast, typically descriptive of the streaming provider.
 * @param channel Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.
 * @param file File identification as may be required for some types. May be null.
 */

data class Webcast (
    /* Type of webcast, typically descriptive of the streaming provider. */
    val type: Webcast.Type,
    /* Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe. */
    val channel: kotlin.String,
    /* File identification as may be required for some types. May be null. */
    val file: kotlin.String? = null
) 


{
    /**
    * Type of webcast, typically descriptive of the streaming provider.
    * Values: youtube,twitch,ustream,iframe,html5,rtmp,livestream,directLink,mms,justin,stemtv,dacast
    */

    enum class Type(val value: kotlin.String)
}

