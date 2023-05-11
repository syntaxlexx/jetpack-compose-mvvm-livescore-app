# LiveScore App ft. MVVM
A livescore app build with Jetpack Compose

## Dev Server
Install the json-server
```bash
npm install -g json-server
```

create a `db.json` if not created yet

run the server
```bash
json-server --watch db.json
```

Now if you go to `http://localhost:3000/posts/1`, you'll get

{ "id": 1, "title": "json-server", "author": "typicode" }
