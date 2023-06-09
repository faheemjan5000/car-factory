# car-factory

a simple microservice, i created it so i can register it on eureka server and then in Api-Gateway i added it in application.yml file as Rout so from postman or any client program i can use this rout and can call it via Api-Gateway.
for this microservice i also added a fallback method in Api-Gateway in controller class, so in case if this microservice is down the user who is trying to call this service will recieve a default message i.e "Ther service is currently not availabe. plz try later."
