# 🛠️ Spring Boot CRUD Example

This is a simple **Spring Boot CRUD application** where I practiced building REST APIs using:

- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Postman (for testing)

---

## 🚀 Features
- ➕ Create a Product
- 📋 Fetch all Products
- 🔍 Fetch Product by ID
- ✏️ Update a Product
- ❌ Delete a Product

---

## 📂 Project Structure
- **Model** → `Product.java`
- **Repository** → `ProductRepository.java`
- **Service** → `ProductService.java`
- **Controller** → `ProductController.java`

---

## ⚙️ Tech Stack
- **Backend:** Java, Spring Boot  
- **Database:** H2 (in-memory)  
- **Build Tool:** Maven  

---

## ▶️ How to Run
1. Clone this repository  
   ```bash
   git clone https://github.com/your-username/spring-boot-crud-example.git
   ```
2. Navigate into the project folder  
   ```bash
   cd spring-boot-crud-example
   ```
3. Run the application  
   ```bash
   mvn spring-boot:run
   ```
4. Open H2 Console in browser:  
   ```
   http://localhost:8080/h2-console
   ```
   - JDBC URL: `jdbc:h2:mem:testdb`  
   - Username: `sa`  
   - Password: *(leave empty)*  

---

## 📬 API Endpoints

Base URL → `http://localhost:8080/products`

| Method | Endpoint             | Description          |
|--------|----------------------|----------------------|
| POST   | `/products`          | Create a product     |
| GET    | `/products`          | Get all products     |
| GET    | `/products/{id}`     | Get product by ID    |
| PUT    | `/products/{id}`     | Update product       |
| DELETE | `/products/{id}`     | Delete product       |

### Example JSON (POST/PUT)
```json
{
  "prodName": "Laptop",
  "price": 55000
}
```

---

## 🛤️ What’s Next?
I will extend this into a **mini E-Commerce project** where I’ll learn:
- ✅ Request Validations  
- ⚡ Exception Handling  
- 🛢️ Connecting to MySQL/PostgreSQL  

---

## 🤝 Contributing
Suggestions and improvements are welcome! Feel free to fork this repo and submit a pull request.  

---

## 👨‍💻 Author
**Niraj**  
📌 Learning Spring Boot & Backend Development 🚀  
