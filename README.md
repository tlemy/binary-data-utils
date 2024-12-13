# data-converter-utils
> Java Spring boot REST API to convert binary and roman numbers to decimal numbers and vice versa.

### Requirements
	- JDK 21
	- Maven 3.9.6^
### Build
``$ mvn clean install``
### Run
``$ java -jar ./target/binary-data-utils.jar ``
### Try it out
``$ curl localhost:8081/converter/rom-to-dec?target=CIV``
### Endpoints
	- /converter/bin-to-dec-u32?target=
	- /converter/dec-to-bin-u32?target=
	- /converter/bin-to-dec-s32?target=
	- /converter/dec-to-bin-s32?target=
	- /converter/rom-to-dec?target=
	- /converter/dec-to-rom?target=
