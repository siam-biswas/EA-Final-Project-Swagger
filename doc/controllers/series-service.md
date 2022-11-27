# Series Service

```java
SeriesServiceController seriesServiceController = client.getSeriesServiceController();
```

## Class Name

`SeriesServiceController`

## Methods

* [Get Serieses](../../doc/controllers/series-service.md#get-serieses)
* [Get Series](../../doc/controllers/series-service.md#get-series)
* [Filter Seriess](../../doc/controllers/series-service.md#filter-seriess)
* [Update Series](../../doc/controllers/series-service.md#update-series)
* [Delete Series](../../doc/controllers/series-service.md#delete-series)
* [Add Series](../../doc/controllers/series-service.md#add-series)


# Get Serieses

```java
CompletableFuture<Void> getSeriesesAsync()
```

## Response Type

`void`

## Example Usage

```java
seriesServiceController.getSeriesesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Series

```java
CompletableFuture<Void> getSeriesAsync()
```

## Response Type

`void`

## Example Usage

```java
seriesServiceController.getSeriesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Filter Seriess

```java
CompletableFuture<Void> filterSeriessAsync(
    final String filterType,
    final String value)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `filterType` | `String` | Query, Required | - |
| `value` | `String` | Query, Required | - |

## Response Type

`void`

## Example Usage

```java
String filterType = "DIRECTOR";
String value = "Woody Allen";

seriesServiceController.filterSeriessAsync(filterType, value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Series

```java
CompletableFuture<Void> updateSeriesAsync(
    final UpdateSeriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UpdateSeriesRequest`](../../doc/models/update-series-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
UpdateSeriesRequest body = new UpdateSeriesRequest();
body.setId(1);
body.setDurationInMinutes(162);
body.setGenre("Drama");
body.setDirector("Frank Darabont");
body.setReleaseDate("1994-09-10");
body.setTitle("The Shawshank Redemption");

seriesServiceController.updateSeriesAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Delete Series

```java
CompletableFuture<Void> deleteSeriesAsync()
```

## Response Type

`void`

## Example Usage

```java
seriesServiceController.deleteSeriesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Add Series

```java
CompletableFuture<Void> addSeriesAsync(
    final AddSeriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AddSeriesRequest`](../../doc/models/add-series-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
AddSeriesRequest body = new AddSeriesRequest();
body.setTitle("Annie Hall");
body.setNumberOfSeasons(2);
body.setNumberOfEpisodes(15);
body.setDurationInMinutes(150);
body.setGenre("Action");
body.setDirector("Woody Allen");
body.setReleaseDate("2002-12-23");

seriesServiceController.addSeriesAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

