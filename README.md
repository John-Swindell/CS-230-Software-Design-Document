## **The Gaming Room Project: Summary**

### **Client and Software Requirements**

The Gaming Room aimed to expand their Android-based game, *"Draw It or Lose It,"* to reach a broader audience across multiple platforms, including web browsers and other mobile devices. The key software requirement was to re-architect the existing application to support this multi-platform expansion. This involved:

* **Designing a multi-user system** capable of hosting concurrent game instances.
* Managing a **large library of high-definition image files**.
* Ensuring a **responsive, secure user experience** with features like user authentication and role-based access.

---

## **Reflection on the Design Process**

### **Strengths in Documentation Development**

I believe the strongest aspect of my documentation was translating the client's need for multi-platform support into a concrete technical architecture. I chose a **client-server pattern** with a **REST API**, which decouples the user interface (client) from the core game logic (server). This approach met the client's primary requirement and provided:

* A scalable roadmap for future development across various platforms.
* A solution that doesn't require rewriting the backend for each new platform.

---

### **Helpful Aspects of the Design Document for Coding**

Creating the design document provided a clear **blueprint** before beginning any code development. Specifically, it outlined:

* The **REST API endpoints**, including the required HTTP methods (`GET`, `POST`), and expected JSON data structures.
* This clarity ensured there was no ambiguity during the implementation of the `GameUserRESTController` in Java.

By defining these components in the design document, I avoided guesswork during development and reduced the likelihood of rework.

---

### **Areas for Improvement in the Design Document**

If I could revise the document, I would include a section on **alternative designs and contingency plans**. Initially, the document focused on a serverless cloud architecture, but feedback highlighted constraints like cross-origin security issues. A more comprehensive document would also consider:

* A traditional, **single-server environment**.
* The tradeoffs of this design, such as the need for in-memory caching of images and on-server resource management.

Including such alternatives would provide a more adaptable, robust design.

---

### **Interpreting and Implementing User Needs**

The client's need for **multi-platform access** guided the entire software design. This led to the adoption of a **client-server architecture**, which:

* Ensures consistent core game experiences for users on different platforms (iPhone, web browsers, etc.).

Considering user needs is essential in design because without it, software can fail to address the real problems. A technically sound product that doesn't meet user expectations—whether in accessibility, performance, or functionality—will ultimately be ineffective.

---

### **Approach to Software Design and Future Strategies**

My approach involved:

1. **Breaking down client requirements** into functional (e.g., user login, concurrent games) and non-functional (e.g., scalable, secure) components.
2. **Selecting an appropriate architecture** (client-server) that addressed the primary need of multi-platform support.
3. **Defining interfaces** between major components via a REST API.

In the future, I would enhance my process by:

* Using **UML diagrams**, such as **sequence diagrams** for user authentication flows and **component diagrams** to visualize system structure.
* Introducing **prototyping and wireframing** during the client-side design phase to gather user feedback early, before finalizing backend architecture.

---

This revision streamlines the content, adds clear headings for better navigation, and ensures that each point is easy to follow while maintaining the essential details.
