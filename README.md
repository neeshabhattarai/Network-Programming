# 🧠 Network Programming in Java

This repository contains basic Java programs demonstrating core concepts of network programming using **TCP**, **UDP**, and **multithreading**.

---

## 📌 Program Descriptions

### ✅ 1. **CheckPrimeNumberServer.java**
- **Type:** TCP Server (Multithreaded)
- **Function:** Accepts a number from the client, checks if it's prime, composite, or neither, and sends back the result.
- **Threading:** Each client connection is handled in a separate thread using the `Runnable` interface.

---

### ✅ 2. **CheckPrimeNumberClient.java**
- **Type:** TCP Client
- **Function:** Connects to the server, sends a number as input, and displays the server's response (prime/composite).

---

### ✅ 3. **EchoServer.java** 
- **Type:** Simple TCP Server
- **Function:** Listens for messages and echoes them back to the client.

---

### ✅ 4. **EchoClient.java** 
- **Type:** TCP Client
- **Function:** Sends a string to the echo server and receives the same string in response.

---

### ✅ 5. **UdpClient.java / UdpServer.java** 
- **Type:** UDP Communication
- **Function:** Demonstrates sending and receiving messages using UDP sockets.

---

## 🚀 How to Run

### Compile
```bash
javac FileName.java


