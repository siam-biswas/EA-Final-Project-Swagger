
# Add Rating Request

## Structure

`AddRatingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserId` | `int` | Required | - | int getUserId() | setUserId(int userId) |
| `Content` | [`Content2`](../../doc/models/content-2.md) | Required | - | Content2 getContent() | setContent(Content2 content) |
| `Value` | `int` | Required | - | int getValue() | setValue(int value) |

## Example (as JSON)

```json
{
  "userId": 1,
  "content": {
    "contentId": 2,
    "contentType": 1
  },
  "value": 4
}
```

