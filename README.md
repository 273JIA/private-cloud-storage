Private Cloud Storage Platform - Backend (Spring Boot, RocketMQ, Redis, ZooKeeper, Zero-Copy, FastDFS, OSS)
Overview

The backend of the Private Cloud Storage Platform implements high-performance file storage using zero-copy technology, integrating both FastDFS and OSS for optimal file handling. This setup ensures seamless local and cloud-based storage solutions, leveraging Spring Boot, Redis, RocketMQ, and ZooKeeper for robustness and scalability.
Key Features

    Zero-Copy File Transfer: Minimizes CPU and memory usage during file transfers, enhancing local storage performance.
    FastDFS Integration: Efficiently manages large files through a distributed file system.
    OSS Integration: Supports storing files in Alibaba Cloud OSS or compatible object storage services.
    Multi-Storage Support: Configurable to switch between local storage, FastDFS, and OSS.
    High Concurrency Optimization: Utilizes Redis for caching user profiles and file metadata for quick access.
    Messaging System: Implements Spring Cloud Stream with RocketMQ for asynchronous tasks, including file deletion and error logging.
    Distributed Locking: Ensures data consistency using Redis and ZooKeeper across multiple instances.
    CI/CD Pipeline: Integrated with Spug, Git, and Maven for continuous integration and deployment.

Technologies Used

    Spring Boot: Core framework for backend services.
    Zero-Copy: Optimizes file transfer efficiency.
    FastDFS: Scalable distributed file storage.
    OSS: Cloud-based object storage.
    RocketMQ: Asynchronous message processing.
    Redis: Caching and distributed locking.
    ZooKeeper: Coordination in distributed systems.
    JUnit: Unit testing framework.
    Spug, Git, Maven: Tools for CI/CD.

Prerequisites

Ensure the following services are running and configured:

    FastDFS: Configured for distributed storage.
    OSS: Credentials for Object Storage Service (e.g., Alibaba Cloud OSS).
    Redis: For caching and locking.
    RocketMQ: For message queuing.
    ZooKeeper: For coordination and locking.
    MySQL: For metadata storage.

This setup provides a comprehensive and efficient backend for managing file storage in a private cloud environment, combining local performance with cloud scalability.
