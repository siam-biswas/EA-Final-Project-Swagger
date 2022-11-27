
# Add Comment Request

## Structure

`AddCommentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Comment` | `String` | Required | - | String getComment() | setComment(String comment) |
| `UserId` | `int` | Required | - | int getUserId() | setUserId(int userId) |
| `Content` | [`Content`](../../doc/models/content.md) | Required | - | Content getContent() | setContent(Content content) |

## Example (as JSON)

```json
{
  "comment": "movie 2 is bad",
  "userId": 1,
  "content": {
    "contentId": 1,
    "contentType": "series"
  }
}
```

