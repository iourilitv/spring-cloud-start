Project Running Schema.

#1. Run eureka-service(EurekaServerApplication).
#2. Run eureka-client(GeekEurekaClientApplication).
#3. Run eureka-feign-client(GeekEurekaFeignClientApplication).

#Lesson 5 hw task 2.
##To get a list of registered eureka clients.
Send a request to http://localhost:8761.

##To get information about the User by his/her userName from eureka-client(ec).
1. Send a request to http://localhost:9090/userInfo/{userId}/userId.
   Example: http://localhost:9090/userInfo/1/userId.
2. Send a request to http://localhost:9090/userInfo/{userName}/userName.
   Example: http://localhost:9090/userInfo/superadmin/userName.
3. Send a request to http://localhost:9090/userInfo/{email}/email.
   Example: http://localhost:9090/userInfo/superadmin@mail.com/email.

##To get information about the User by his/her userName from eureka-feign-client(efc).
1. Send a request to http://localhost:8190/userInfo/{userId}/userId.
   Example: http://localhost:9090/userInfo/1/userId.
2. Send a request to http://localhost:8190/userInfo/{userName}/userName.
   Example: http://localhost:8190/userInfo/sisadmin/userName.

##A response will be shown in the user-details-view.html in the eureka-feign-client.