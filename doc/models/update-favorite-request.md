
# Update Favorite Request

## Structure

`UpdateFavoriteRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Content` | [`Content`](../../doc/models/content.md) | Required | - | Content getContent() | setContent(Content content) |
| `UserId` | `int` | Required | - | int getUserId() | setUserId(int userId) |

## Example (as JSON)

```json
{
  "id": 1,
  "content": {
    "contentId": 1,
    "contentType": "movie"
  },
  "user_id": 1
}
```

