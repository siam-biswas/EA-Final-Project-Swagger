# Movie Service

```java
MovieServiceController movieServiceController = client.getMovieServiceController();
```

## Class Name

`MovieServiceController`

## Methods

* [Get Movies](../../doc/controllers/movie-service.md#get-movies)
* [Get Movie](../../doc/controllers/movie-service.md#get-movie)
* [Filter Movies](../../doc/controllers/movie-service.md#filter-movies)
* [Update Movie](../../doc/controllers/movie-service.md#update-movie)
* [Delete Movie](../../doc/controllers/movie-service.md#delete-movie)
* [Add Movie](../../doc/controllers/movie-service.md#add-movie)


# Get Movies

```java
CompletableFuture<Void> getMoviesAsync()
```

## Response Type

`void`

## Example Usage

```java
movieServiceController.getMoviesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Movie

```java
CompletableFuture<Void> getMovieAsync(
    final int movieId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `movieId` | `int` | Query, Required | - |

## Response Type

`void`

## Example Usage

```java
int movieId = 1;

movieServiceController.getMovieAsync(movieId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Filter Movies

```java
CompletableFuture<Void> filterMoviesAsync(
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
String filterType = "ACTOR";
String value = "Morgan";

movieServiceController.filterMoviesAsync(filterType, value).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Movie

```java
CompletableFuture<Void> updateMovieAsync(
    final UpdateMovieRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UpdateMovieRequest`](../../doc/models/update-movie-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
UpdateMovieRequest body = new UpdateMovieRequest();
body.setId(1);
body.setDurationInMinutes(162);
body.setGenre("Drama");
body.setDirector("Frank Darabont");
body.setReleaseDate("1994-09-10");
body.setTitle("The Shawshank Redemption");

movieServiceController.updateMovieAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Delete Movie

```java
CompletableFuture<Void> deleteMovieAsync(
    final int movieId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `movieId` | `int` | Query, Required | - |

## Response Type

`void`

## Example Usage

```java
int movieId = 1;

movieServiceController.deleteMovieAsync(movieId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Add Movie

```java
CompletableFuture<Void> addMovieAsync(
    final AddMovieRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AddMovieRequest`](../../doc/models/add-movie-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
AddMovieRequest body = new AddMovieRequest();
body.setDurationInMinutes(162);
body.setGenre("Drama");
body.setDirector("Frank Darabont");
body.setReleaseDate("1994-09-10");
body.setTitle("The Shawshank Redemption");

movieServiceController.addMovieAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

