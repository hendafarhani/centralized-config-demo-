# ☁️ Centralized Microservices Configuration with Spring Cloud Config & Eureka

This project demonstrates how to manage configuration for multiple Spring Boot microservices using a centralized Spring Cloud Config Server. It also includes service discovery using Eureka and Docker Compose for local orchestration.

---

## 📦 Project Structure

centralized-demo/
├── config-server/ # Centralized configuration server (Spring Boot)
├── discovery-server/ # Eureka service discovery server
├── service-one/ # First microservice using centralized config
├── service-two/ # Second microservice using centralized config
├── config-repo/ # Git-backed configuration repository
└── docker-compose.yml # Docker orchestration

yaml
Copy
Edit

---

## 🚀 What’s Included

- ✅ Spring Cloud Config Server
- ✅ Git-based configuration repository (local)
- ✅ Eureka Discovery Server
- ✅ Two Spring Boot services (`service-one`, `service-two`)
- ✅ Dockerfiles for each service
- ✅ Docker Compose orchestration

---

## 🧰 Technologies Used

- Java 17
- Spring Boot
- Spring Cloud Config
- Spring Cloud Netflix Eureka
- Docker & Docker Compose
- Git

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/centralized-demo.git
cd centralized-demo
2. Initialize the Config Git Repo
bash
Copy
Edit
cd config-repo
git init
git add .
git commit -m "Initial commit"
cd ..
This step is required because Spring Cloud Config Server expects a Git-backed config repository — even if it's local.

3. Build & Run with Docker Compose
bash
Copy
Edit
docker-compose up --build
🌐 Access Services
Service	URL
Eureka Server	http://localhost:8761
Config Server	http://localhost:8080
Service One	http://localhost:8081/message
Service Two	http://localhost:8082/message

📁 Example Config Files
Inside config-repo/:

service-one.properties
properties
Copy
Edit
custom.message=Hello from Service One!
service-two.properties
properties
Copy
Edit
custom.message=Hello from Service Two!
📩 API Test
After startup, test services:

bash
Copy
Edit
curl http://localhost:8081/message
# Hello from Service One!

curl http://localhost:8082/message
# Hello from Service Two!
🧠 Optional Enhancements
🔄 Spring Cloud Bus with RabbitMQ for live config refresh

🔐 Encrypted properties in config files

📈 Spring Boot Admin for monitoring

🌍 Profile-based configs (dev, prod, etc.)

🤝 Contributing
Feel free to fork, improve, or suggest enhancements!

📜 License
MIT — use this freely for educational or commercial projects.

yaml
Copy
Edit

---

Let me know if you'd like to:
- Add instructions for setting up a remote GitHub config repo
- Include screenshots (Eureka dashboard, API output, etc.)
- Translate the README to French too
