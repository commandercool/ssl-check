# SSL Check is a tool to check keystore/truststore settings of Java

The program tries to perform SSL Handshake with specified host over specified port.
In case keystore/truststore settings are correct - you'll receive **"Successfully connected"** message.

## Usage:

Prior Java 11:
```
wget https://raw.githubusercontent.com/commandercool/ssl-check/master/src/SSLCheck.java
javac SSLCheck.java
java -cp . SSLCheck google.com 443
```

Java 11 and higher (requires JDK):
```
wget https://raw.githubusercontent.com/commandercool/ssl-check/master/src/SSLCheck.java
java SSLCheck.java google.com 443
```

If you don't have (can't install) `wget` replace it with `curl -O`.
