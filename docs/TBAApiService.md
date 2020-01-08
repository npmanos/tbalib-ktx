# TBAApiService

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](TBAApiService.md#getStatus) | **GET** /status | Returns API status, and TBA status information.


<a name="getStatus"></a>
# **getStatus**
> APIStatus getStatus(ifModifiedSince)



Returns API status, and TBA status information.

### Example
```kotlin
// Import classes:
//import org.eastonrobotics.tbalib.infrastructure.*
//import org.eastonrobotics.tbalib.model.*

val apiInstance = TBAApiService()
val ifModifiedSince : kotlin.String = ifModifiedSince_example // kotlin.String | Value of the `Last-Modified` header in the most recently cached response by the client.
try {
    val result : APIStatus = apiInstance.getStatus(ifModifiedSince)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TBAApiService#getStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TBAApiService#getStatus")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ifModifiedSince** | **kotlin.String**| Value of the &#x60;Last-Modified&#x60; header in the most recently cached response by the client. | [optional]

### Return type

[**APIStatus**](APIStatus.md)

### Authorization


Configure apiKey:
    ApiClient.apiKey["X-TBA-Auth-Key"] = ""
    ApiClient.apiKeyPrefix["X-TBA-Auth-Key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

