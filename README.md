## About
Java/Kotlin ledger implementing a compliant subset of the [five-bells-ledger API](https://github.com/interledger/rfcs/tree/master/0012-five-bells-ledger-api) and Conditional Payment Channels (with HTLCs) as described in [HTLA Interledger RFC](https://github.com/interledger/rfcs/tree/master/0022-hashed-timelock-agreements). This project also serve to test [java-ilp-core  interfaces and specs](https://github.com/interledger/java-ilp-core/). 

The current version uses Ethereum as supporting database for user balances. Actually, any backend (SQL database, blockchain, ...) able to support the com.everis.everledger.ifaces.account.IfaceAccount can be (theorically) be used as storage/balance-ledger. See [related issue](https://github.com/everis-innolab/interledger-ledger/issues/1)

Read developers docs @ dev_docs for more info

## Current status.
At this moment some important features are missing but functional tests are passing. See "TODO" tasks in code to get a detailed review of all pending low-level task and the github issues for other missing features.

### Build:
```  $ gradle build ```

### Unit-Testing:
```  $ gradle test ```

### Functional-Testing:
   This project tries to keep compatibility with the REST/WS API of   [five-bells-ledger](https://github.com/interledgerjs/five-bells-ledger), that automatically
   warrants compatibility with the [plugin](https://github.com/interledgerjs/ilp-plugin-bells) for the  [ilp connector reference implementation](https://github.com/interledgerjs/ilp-connector)

   A subset of five-bells-ledger tests adapted to this project are available at:
   https://github.com/interledgerjs/five-bells-ledger, branch: earizon-adaptedTest4JavaVertXLedger

### Running the ledger:
  * Option 1:(gradle): ``` $ gradle :launchServer ```
  * Option 2:(eclipse/Netbeans/...): Run/debug next class as a java application:
     ```.../org/interledger/ilp/ledger/api/Main.java ```
     ​

###IntelliJ integration:
  * Create a new project and import interledger-ledger and java-ilp-core in sibling directories as gradle modules.
  * To use the java-ilp-core master branch set ```use_java_ilp_core = false ```  in build.gradle. To use a local java-ilp-core (in sibling directory) set it to true.

### Eclipse integration:
  * Option 1: (Recomended): Add official Eclipse Gradle pluging. Then import this project as gradle project. Read notes about use_java_ilp_core in IntelliJ integration.
  * Option 2: (Manual): Create eclipse .project & .classpath files for each project with ``` $ gradle eclipse ```.
    (Then use File -> Import ... -> Existing projects from workspace and select the "Search for nested projects")
  * There is an eclipse kotlin plugin, but not as mature as the IntelliJ one. (WARN: Not tested).

### Other common tasks:
``` 
./gradlew clean install check
```

``` 
./gradlew test
```

``` 
Generate random Private/Public keys used in application.conf: 
   - ledger.ed25519.conditionSignPrivateKey 
   - ledger.ed25519.conditionSignPublicKey
   - ledger.ed25519.notificationSignPrivateKey
   - ledger.ed25519.notificationSignPublicKey

./gradlew printRandomDSAEd25519PrivPubKey
```

```
Create HTTPS TLS certificates:
copy create_tls_certificate_example.sh, adjust parameters (DOMAIN, SUBJ, DAYS_TO_EXPIRE) to suits your setup and finally execute it.

The files $DOMAIN.key and $DOMAIN.cert will be created. Update 'server.tls_key' and 'server.tls_cert' parameters 
  at application.conf  accordingly.
```

## Configuration

 * application.conf is the main configuration file. app.conf can be used to overload and customize the setup.

 * Loggin can be configured at: (src/main/resources/)logback.xml



## Development

Common code snippets are documented at dev_docs/code_snippets.txt (work in progress)

## Contributors

Any contribution is very much appreciated!

## License

T [![gitter][gitter-image]][gitter-url]his code is released under the Apache 2.0 License. Please see [LICENSE](LICENSE) for the full text.
