
# Update Comment Request

## Structure

`UpdateCommentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Comment` | `String` | Required | - | String getComment() | setComment(String comment) |
| `UserId` | `int` | Required | - | int getUserId() | setUserId(int userId) |
| `Content` | [`Content`](../../doc/models/content.md) | Required | - | Content getContent() | setContent(Content content) |

## Example (as JSON)

```json
{
  "id": 1,
  "comment": "movie 2 is bad",
  "userId": 1,
  "content": {
    "contentId": 1,
    "contentType": "series"
  }
}
```

