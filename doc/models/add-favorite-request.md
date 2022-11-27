
# Add Favorite Request

## Structure

`AddFavoriteRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Content` | [`Content`](../../doc/models/content.md) | Required | - | Content getContent() | setContent(Content content) |
| `UserId` | `int` | Required | - | int getUserId() | setUserId(int userId) |

## Example (as JSON)

```json
{
  "content": {
    "contentId": 1,
    "contentType": "movie"
  },
  "user_id": 1
}
```

