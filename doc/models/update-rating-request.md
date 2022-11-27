
# Update Rating Request

## Structure

`UpdateRatingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `UserId` | `int` | Required | - | int getUserId() | setUserId(int userId) |
| `Content` | [`Content2`](../../doc/models/content-2.md) | Required | - | Content2 getContent() | setContent(Content2 content) |
| `Value` | `int` | Required | - | int getValue() | setValue(int value) |

## Example (as JSON)

```json
{
  "id": 2,
  "userId": 1,
  "content": {
    "contentId": 2,
    "contentType": 1
  },
  "value": 3
}
```

