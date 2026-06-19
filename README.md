 🚀 Centralized Logging System using ELK Stack

### Elasticsearch • Logstash • Kibana • Docker • AWS EC2

A DevOps Project for Centralized Log Management and Monitoring

</div>



📌 About the Project

In modern applications, logs are generated continuously and are often stored on different servers. Finding issues from multiple log files can be difficult and time-consuming.

This project demonstrates how to build a Centralized Logging System using the ELK Stack (Elasticsearch, Logstash, and Kibana). All logs are collected in one place, making it easier to monitor applications, search logs, and troubleshoot issues.

The entire setup is deployed on an AWS EC2 instance using Docker and Docker Compose.



🎯 Project Goal

The main goal of this project is to:

Collect logs from applications
Store logs in a central location
Search logs quickly
Visualize logs using dashboards
Improve monitoring and troubleshooting



🏗️ Architecture
     

```text
                    AWS EC2 Instance
┌──────────────────────────────────────────┐
│                                          │
│      ┌──────────────────────┐            │
│      │      Logstash        │            │
│      │  Log Collection &    │            │
│      │     Processing       │            │
│      └──────────┬───────────┘            │
│                 │                        │
│                 ▼                        │
│      ┌──────────────────────┐            │
│      │   Elasticsearch      │            │
│      │ Log Storage & Search │            │
│      └──────────┬───────────┘            │
│                 │                        │
│                 ▼                        │
│      ┌──────────────────────┐            │
│      │       Kibana         │            │
│      │ Dashboards & Logs    │            │
│      └──────────────────────┘            │
│                                          │
└──────────────────────────────────────────┘
                    ▲
                    │
                    │ Port 5601
                    │
           ┌─────────────────┐
           │  User Browser   │
           └─────────────────┘
```
Workflow
Application generates logs.
Logstash collects and processes logs.
Elasticsearch stores and indexes logs.
Kibana displays logs through dashboards and visualizations.
🛠️ Tools & Technologies Used
Technology	Purpose
AWS EC2	Cloud Server
Ubuntu Linux	Operating System
Docker	Containerization
Docker Compose	Managing Containers
Elasticsearch	Log Storage & Search
Logstash	Log Collection
Kibana	Log Visualization
GitHub	Version Control



📂 Project Structure
Centralized-Logging-ELK-Project/
│
├── app/
│
├── elasticsearch/
│
├── kibana/
│
├── logstash/
│   └── logstash.conf
│
├── docker-compose.yml
│
└── README.md



⚡ Features

✅ Centralized Log Collection

✅ Log Processing using Logstash

✅ Fast Log Search with Elasticsearch

✅ Real-Time Log Monitoring

✅ Interactive Kibana Dashboard

✅ Docker-Based Deployment

✅ AWS EC2 Hosting



🚀 Deployment Steps

Clone Repository
git clone https://github.com/YOUR_USERNAME/Centralized-Logging-ELK-Project.git
cd Centralized-Logging-ELK-Project
Start ELK Stack
docker-compose up -d
Verify Containers
docker ps

Running Containers:

Elasticsearch
Logstash
Kibana



🌐 Access URLs

Elasticsearch
http://YOUR_PUBLIC_IP:9200
Kibana
http://YOUR_PUBLIC_IP:5601



📊 Project Output

After successful deployment:

ELK Stack is running successfully
Logs are stored centrally
Logs can be searched easily
Kibana dashboards display log data
Monitoring and troubleshooting become easier



📸 Screenshots


Docker Containers Running

<img width="1920" height="1080" alt="pro 6 docker push run" src="https://github.com/user-attachments/assets/df9ab432-e43e-40d0-8982-481367be4272" />



Elasticsearch Output

<img width="1920" height="1080" alt="ELASTICSEARCH ss" src="https://github.com/user-attachments/assets/6902a77b-d908-4cc9-a948-2d07f5f12f06" />



Kibana Home Page

<img width="1920" height="1025" alt="Kibana Home Page" src="https://github.com/user-attachments/assets/8b11dec2-4afb-4667-ab48-706c2d8dde14" />



Log Discovery Page

<img width="1920" height="1022" alt="Application Logs in Kibana Discover" src="https://github.com/user-attachments/assets/32a6e28e-e1dd-461b-8fc4-4186045f1ecd" />



Dashboard View

<img width="1920" height="1041" alt="KIBANA 2" src="https://github.com/user-attachments/assets/6a4a6b44-415d-4d67-b8f8-29500f7dc51a" />



Application Logs Dashboard

<img width="1920" height="1020" alt="application-logs" src="https://github.com/user-attachments/assets/7358ca48-32b2-4a9b-bec4-07e41e40f3bf" />



Elasticsearch index

<img width="1920" height="1080" alt="INDEX" src="https://github.com/user-attachments/assets/06087bba-9b79-4209-8155-a022ee6a3371" />




📚 What I Learned

Through this project, I learned:

AWS EC2 deployment
Linux server management
Docker and Docker Compose
ELK Stack setup
Log management concepts
Monitoring and observability basics
Git and GitHub workflow



🔮 Future Improvements

Filebeat Integration
Alert Notifications
Kubernetes Logging
Advanced Dashboards
Multi-Node ELK Setup


👨‍💻 Author
Ashu Chamle

DevOps & Cloud Enthusiast

⭐ Final Result

Successfully deployed a Centralized Logging System using ELK Stack on AWS EC2, enabling centralized log storage, searching, and visualization through Kibana dashboards.
