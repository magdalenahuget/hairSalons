# Hair Salons Application

This application, built using Java with Spring framework and Thymeleaf for the user interface, 
provides a comprehensive solution for managing hair salons and hairdressers. 
Developed in IntelliJ, the application allows users to access and manipulate data 
through various endpoints.

![hair](https://github.com/magdalenahuget/hairSalons/blob/7ba93e5a1cb0ec17369b29abd88a6aa4a35c3d13/src/main/resources/static/css/hair.jpg)

**Features:**  
__Technologies Used:__
Java with Spring Framework
Thymeleaf for UI templating  

__Functionality:__
View Salons: Access a list of hair salons, including details like Salon ID, Capacity, City, Salon Name, and associated Hairdressers.
View Hairdressers: Explore a list of individual hairdressers, showcasing Hairdresser ID, Name, City, and Hair Salon they are affiliated with.
Assign Hairdressers: Assign hairdressers to specific salons, ensuring efficient management of staff.
Intuitive UI: Thymeleaf templates provide an interactive and responsive user interface, enhancing user experience.

**Usage:**
__View Salons:__
Endpoint: /salons
Displays a table containing Salon ID, Capacity, City, Salon Name, and associated Hairdressers for each salon.  

__View Hairdressers:__
Endpoint: /hairdressers
Lists Hairdresser ID, Name, City, and associated Hair Salon for each hairdresser.  

__Assign Hairdressers to Salons:__
Endpoint: /salons/{salon_id}/hairdressers/{hairdresser_id}
Assigns a specific hairdresser (hairdresser_id) to a chosen salon (salon_id), facilitating efficient staff management.

![web](https://github.com/magdalenahuget/hairSalons/blob/ff38cd848a87cff1f70f21e131a069ed6fa9e96b/src/main/resources/static/css/web.PNG)

**Setup:**  
__Clone Repository:__   
git clone <repository-url>

__Build and Run:__

Open the project in IntelliJ or your preferred Java IDE.
Ensure Java 17 is installed.
Build and run the application.

__Access Endpoints:__
Visit http://localhost:8080/salons to view the list of salons.
Visit http://localhost:8080/hairdressers to explore hairdressers.
Utilize the provided endpoints for further actions as needed.


**Notes:**
This application uses Spring Boot, making it easy to deploy and manage.
Ensure appropriate dependencies are installed as per the provided pom.xml file.
For any issues or inquiries, please refer to the project's GitHub repository or contact the developers.
Feel free to explore the code and contribute to enhance the functionality further!