# LiveScore App ft. Jetpack Compose and MVVM pattern
A liveScore app build with Jetpack Compose

## Final Thoughts
MISS ME with this SH!T

I just got hard reminded why I love Flutter even more!
- No Hot-Reload Feature
- Riverpod is just way better
- Flutter is still years ahead in terms of components, community contributions, support, ease-of-entry, e.t.c.
- Package size still as large as Flutter's (~16MB)

Some things I like here?
- Kotlin is - interesting - to write. Less verbose
- Dependency Injection (DI) feels different, but in a good way
- Suspense (a.k.a futures in Flutter) as also beautiful
- Theming is actually not bad, but Flutter wins
- Modifiers are similar to Flutter, so no serious mental fatigue
- Organization - though subjective - not so different from Flutter

> I ain't pursuing Jetpack Compose though. Master Flutter and become a Grand-Meister of one tool.


## Development
### Running the Dev Server Locally
Install the json-server
```bash
npm install -g json-server
```

create a `db.json` if not created yet

run the server
```bash
json-server --watch db.json
```

Now if you go to `http://localhost:3000/upcoming`, you'll get

```json

{
  "data": [
    {
      "id": 5,
      "leagueName": "EPL",
      "idHome": 1,
      "homeName": "Arsenal",
      "idAway": 2,
      "awayName": "Man-U",
      "date": "11-05-2023 19:00",
      "status": "pending",
      "team_home_90min_goals": 2,
      "team_away_90min_goals": 1,
      "elapsed": 20
    },
    {
      "id": 6,
      "leagueName": "La Liga",
      "idHome": 3,
      "homeName": "Barcelona",
      "idAway": 4,
      "awayName": "Atletico Madrid",
      "date": "12-05-2023 19:00",
      "status": "pending",
      "team_home_90min_goals": 5,
      "team_away_90min_goals": 2,
      "elapsed": 30
    },
    {
      "id": 7,
      "leagueName": "La Liga",
      "idHome": 6,
      "homeName": "Real Madrid",
      "idAway": 5,
      "awayName": "Athletico Madrid",
      "date": "12-05-2023 21:00",
      "status": "pending",
      "team_home_90min_goals": 5,
      "team_away_90min_goals": 2,
      "elapsed": 30
    },
    {
      "id": 8,
      "leagueName": "EPL",
      "idHome": 9,
      "homeName": "Aston Villa",
      "idAway": 10,
      "awayName": "Chelsea",
      "date": "14-05-2023 17:00",
      "status": "pending",
      "team_home_90min_goals": 5,
      "team_away_90min_goals": 2,
      "elapsed": 30
    }
  ]
}
```
