# User Service

```java
UserServiceController userServiceController = client.getUserServiceController();
```

## Class Name

`UserServiceController`

## Methods

* [Retrive Access Token](../../doc/controllers/user-service.md#retrive-access-token)
* [Register User](../../doc/controllers/user-service.md#register-user)
* [Login User](../../doc/controllers/user-service.md#login-user)
* [Get Users](../../doc/controllers/user-service.md#get-users)
* [Get User](../../doc/controllers/user-service.md#get-user)
* [Update User](../../doc/controllers/user-service.md#update-user)
* [Delete User](../../doc/controllers/user-service.md#delete-user)
* [Get Favorites](../../doc/controllers/user-service.md#get-favorites)
* [Add Favorite](../../doc/controllers/user-service.md#add-favorite)
* [Update Favorite](../../doc/controllers/user-service.md#update-favorite)
* [Delete Favorite](../../doc/controllers/user-service.md#delete-favorite)


# Retrive Access Token

```java
CompletableFuture<Void> retriveAccessTokenAsync(
    final int xCSRFTOKEN)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xCSRFTOKEN` | `int` | Header, Required | - |

## Response Type

`void`

## Example Usage

```java
int xCSRFTOKEN = 1;

userServiceController.retriveAccessTokenAsync(xCSRFTOKEN).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Register User

```java
CompletableFuture<Void> registerUserAsync(
    final RegisterUserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`RegisterUserRequest`](../../doc/models/register-user-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
RegisterUserRequest body = new RegisterUserRequest();
body.setUserName("nsRahman");
body.setFirstName("NS");
body.setLastName("Rahman");
body.setEmail("nsr@miu.edu");
body.setPhone("641233000");
body.setPassword("123456");

userServiceController.registerUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Login User

```java
CompletableFuture<Void> loginUserAsync(
    final LoginUserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`LoginUserRequest`](../../doc/models/login-user-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
LoginUserRequest body = new LoginUserRequest();
body.setUserName("nsRahman");
body.setPassword("123456");

userServiceController.loginUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Users

```java
CompletableFuture<Void> getUsersAsync()
```

## Response Type

`void`

## Example Usage

```java
userServiceController.getUsersAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get User

```java
CompletableFuture<Void> getUserAsync()
```

## Response Type

`void`

## Example Usage

```java
userServiceController.getUserAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update User

```java
CompletableFuture<Void> updateUserAsync(
    final UpdateUserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UpdateUserRequest`](../../doc/models/update-user-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
UpdateUserRequest body = new UpdateUserRequest();
body.setId(2);
body.setUserName("nsRahman");
body.setFirstName("NS");
body.setLastName("Rahman");
body.setEmail("nsr@miu.edu");
body.setPhone("641233001");
body.setPassword("123456");

userServiceController.updateUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Delete User

```java
CompletableFuture<Void> deleteUserAsync()
```

## Response Type

`void`

## Example Usage

```java
userServiceController.deleteUserAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Get Favorites

```java
CompletableFuture<Void> getFavoritesAsync()
```

## Response Type

`void`

## Example Usage

```java
userServiceController.getFavoritesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Add Favorite

```java
CompletableFuture<Void> addFavoriteAsync(
    final AddFavoriteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`AddFavoriteRequest`](../../doc/models/add-favorite-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
AddFavoriteRequest body = new AddFavoriteRequest();
Content content = new Content();
content.setContentId(1);
content.setContentType("movie");

body.setContent(content);
body.setUserId(1);

userServiceController.addFavoriteAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Update Favorite

```java
CompletableFuture<Void> updateFavoriteAsync(
    final UpdateFavoriteRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UpdateFavoriteRequest`](../../doc/models/update-favorite-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
UpdateFavoriteRequest body = new UpdateFavoriteRequest();
body.setId(1);
Content content = new Content();
content.setContentId(1);
content.setContentType("movie");

body.setContent(content);
body.setUserId(1);

userServiceController.updateFavoriteAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Delete Favorite

```java
CompletableFuture<Void> deleteFavoriteAsync()
```

## Response Type

`void`

## Example Usage

```java
userServiceController.deleteFavoriteAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

