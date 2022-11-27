# Comment Service

```java
CommentServiceController commentServiceController = client.getCommentServiceController();
```

## Class Name

`CommentServiceController`

## Methods

* [Get Comments](../../doc/controllers/comment-service.md#get-comments)
* [Get Comment](../../doc/controllers/comment-service.md#get-comment)
* [Update Comment](../../doc/controllers/comment-service.md#update-comment)
* [Delete Comment](../../doc/controllers/comment-service.md#delete-comment)
* [Add Comment](../../doc/controllers/comment-service.md#add-comment)


# Get Comments

```java
CompletableFuture<Void> getCommentsAsync()
```

## Response Type

`void`

## Example Usage

```java
commentServiceController.getCommentsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Comment

```java
CompletableFuture<Void> getCommentAsync()
```

## Response Type

`void`

## Example Usage

```java
commentServiceController.getCommentAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Comment

```java
CompletableFuture<Void> updateCommentAsync(
    final UpdateCommentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UpdateCommentRequest`](../../doc/models/update-comment-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
UpdateCommentRequest body = new UpdateCommentRequest();
body.setId(1);
body.setComment("movie 2 is bad");
body.setUserId(1);
Content content = new Content();
content.setContentId(1);
content.setContentType("series");

body.setContent(content);

commentServiceController.updateCommentAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Delete Comment

```java
CompletableFuture<Void> deleteCommentAsync()
```

## Response Type

`void`

## Example Usage

```java
commentServiceController.deleteCommentAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Add Comment

```java
CompletableFuture<Void> addCommentAsync(
    final AddCommentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AddCommentRequest`](../../doc/models/add-comment-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
AddCommentRequest body = new AddCommentRequest();
body.setComment("movie 2 is bad");
body.setUserId(1);
Content content = new Content();
content.setContentId(1);
content.setContentType("series");

body.setContent(content);

commentServiceController.addCommentAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

