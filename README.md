# Flight-Booking-Aplication-BackEnd
Flight Booking Application-
1)Developed API'S for Flight booking aplication useing spring boot and java.

Flow-
1 We will create entity class using private varables(table in database).
2)First the api starts from controller .
3)If it is post call it takes the data from the API useing RequestParam or RequestBody or Pathvarable and send to service with the help or autowired where the actuval business logic lies based on our requirnment it perfroms operations like save the data in database useing  the interface called repository(JPA OR CURD) which connects with its tables in database. .
4)If it is the get call same as above the API start from controller and next to service and gets the data using repository

PostMan
After developing  each API'S tested by post man it is working properly or not.
we will check using payload for post calls and checks the data is stored in Database or not and for get call we will see response is geting or not in the post man .

