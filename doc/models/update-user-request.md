
# Update User Request

## Structure

`UpdateUserRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `UserName` | `String` | Required | - | String getUserName() | setUserName(String userName) |
| `FirstName` | `String` | Required | - | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | - | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Phone` | `String` | Required | - | String getPhone() | setPhone(String phone) |
| `Password` | `String` | Required | - | String getPassword() | setPassword(String password) |

## Example (as JSON)

```json
{
  "id": 2,
  "userName": "nsRahman",
  "firstName": "NS",
  "lastName": "Rahman",
  "email": "nsr@miu.edu",
  "phone": "641233001",
  "password": "123456"
}
```

