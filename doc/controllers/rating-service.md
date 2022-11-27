# Rating Service

```java
RatingServiceController ratingServiceController = client.getRatingServiceController();
```

## Class Name

`RatingServiceController`

## Methods

* [Get Ratings](../../doc/controllers/rating-service.md#get-ratings)
* [Get Rating](../../doc/controllers/rating-service.md#get-rating)
* [Add Rating](../../doc/controllers/rating-service.md#add-rating)
* [Update Rating](../../doc/controllers/rating-service.md#update-rating)
* [Delete Rating](../../doc/controllers/rating-service.md#delete-rating)


# Get Ratings

```java
CompletableFuture<Void> getRatingsAsync()
```

## Response Type

`void`

## Example Usage

```java
ratingServiceController.getRatingsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Rating

```java
CompletableFuture<Void> getRatingAsync()
```

## Response Type

`void`

## Example Usage

```java
ratingServiceController.getRatingAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Add Rating

```java
CompletableFuture<Void> addRatingAsync(
    final AddRatingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AddRatingRequest`](../../doc/models/add-rating-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
AddRatingRequest body = new AddRatingRequest();
body.setUserId(1);
Content2 content = new Content2();
content.setContentId(2);
content.setContentType(1);

body.setContent(content);
body.setValue(4);

ratingServiceController.addRatingAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Rating

```java
CompletableFuture<Void> updateRatingAsync(
    final UpdateRatingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UpdateRatingRequest`](../../doc/models/update-rating-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
UpdateRatingRequest body = new UpdateRatingRequest();
body.setId(2);
body.setUserId(1);
Content2 content = new Content2();
content.setContentId(2);
content.setContentType(1);

body.setContent(content);
body.setValue(3);

ratingServiceController.updateRatingAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Delete Rating

```java
CompletableFuture<Void> deleteRatingAsync()
```

## Response Type

`void`

## Example Usage

```java
ratingServiceController.deleteRatingAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

