
# Add Series Request

## Structure

`AddSeriesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `NumberOfSeasons` | `int` | Required | - | int getNumberOfSeasons() | setNumberOfSeasons(int numberOfSeasons) |
| `NumberOfEpisodes` | `int` | Required | - | int getNumberOfEpisodes() | setNumberOfEpisodes(int numberOfEpisodes) |
| `DurationInMinutes` | `int` | Required | - | int getDurationInMinutes() | setDurationInMinutes(int durationInMinutes) |
| `Genre` | `String` | Required | - | String getGenre() | setGenre(String genre) |
| `Director` | `String` | Required | - | String getDirector() | setDirector(String director) |
| `ReleaseDate` | `String` | Required | - | String getReleaseDate() | setReleaseDate(String releaseDate) |

## Example (as JSON)

```json
{
  "title": "Annie Hall",
  "numberOfSeasons": 2,
  "numberOfEpisodes": 15,
  "durationInMinutes": 150,
  "genre": "Action",
  "director": "Woody Allen",
  "releaseDate": "2002-12-23"
}
```

