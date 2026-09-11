GAME CATALOG

Very basic project that allows you to create a memory-stored game catalog database!
Each game has 4 types of properties: Name, Genre, Developer and Release Year.

## How to Run

### Prerequisites
- Java 25 (or later) installed
- An IDE like IntelliJ (optional, but recommended)
- [Postman](https://www.postman.com/downloads/) or any other API testing tool, to interact with the endpoints

### Steps

1. **Clone the repository**
```bash
   git clone git@github.com:Joao-V07/Game-Calalog.git
   cd Game-Calalog
```

2. **Run the application**

   On Windows:
```bash
   mvnw.cmd spring-boot:run
```

   On Linux/Mac:
```bash
   ./mvnw spring-boot:run
```

   Or, if you're using an IDE like IntelliJ, simply open the project and run the `GameCatalogApiApplication` class.

3. **The API will start on `http://localhost:8080`**

   You should see a log message confirming the application has started successfully.

### Testing the Endpoints

Once the application is running, you can use Postman (or any similar tool) to interact with the API:

| Method | Endpoint       | Description               |
|--------|----------------|----------------------------|
| GET    | `/games`       | Lists all games            |
| POST   | `/games`       | Adds a new game             |
| PUT    | `/games/{id}`  | Updates an existing game    |
| DELETE | `/games/{id}`  | Removes a game               |

**Example POST body:**
```json
{
    "title": "Elden Ring",
    "genre": "Souls-like",
    "developer": "FromSoftware",
    "releaseYear": 2022
}
```

> **Note:** This project uses an in-memory H2 database — all data is reset every time the application restarts.
