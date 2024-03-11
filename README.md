# executable-jar
executable jar without dependencies

# Build the spring boot application
- mvn clean install
* mvn clean install -P executable-jar
+ mvn clean install -P executable-jar-custom-manifest

# Run executable jar
java -jar target/executable-jar.jar "Pradeep Reddy" Bangalore
