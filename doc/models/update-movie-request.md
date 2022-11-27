
# Update Movie Request

## Structure

`UpdateMovieRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `DurationInMinutes` | `int` | Required | - | int getDurationInMinutes() | setDurationInMinutes(int durationInMinutes) |
| `Genre` | `String` | Required | - | String getGenre() | setGenre(String genre) |
| `Director` | `String` | Required | - | String getDirector() | setDirector(String director) |
| `ReleaseDate` | `String` | Required | - | String getReleaseDate() | setReleaseDate(String releaseDate) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |

## Example (as JSON)

```json
{
  "id": 1,
  "durationInMinutes": 162,
  "genre": "Drama",
  "director": "Frank Darabont",
  "releaseDate": "1994-09-10",
  "title": "The Shawshank Redemption"
}
```

