# JMonitoredReti 
                                              JAVA SPRING BOOT 
Monitoraggio Reti - Progetto di Tirocinio NOVANEXT anno 2019
Descrizione del Progetto
Il progetto "Monitoraggio Reti" è stato sviluppato come parte di un tirocinio tecnico di rete. L'obiettivo del progetto è creare una piattaforma di monitoraggio delle risorse di sistema come l'uso della CPU, la temperatura della CPU e lo spazio su disco di un sistema. Utilizza Java, Spring Boot e Thymeleaf per raccogliere e visualizzare i dati in tempo reale. L'applicazione è stata progettata per offrire un'interfaccia web per monitorare lo stato delle risorse di sistema, con la possibilità di visualizzare metriche come:

Uso della CPU
Temperatura della CPU
Spazio su Disco (totale e disponibile)


Autori
Brezza Salvatore
Marta Giordano
Entrambi i membri sono i tirocinanti nel campo delle tecnologie di rete, con competenze in Java, Python, e Amministrazione di Database. Durante il tirocinio, hanno collaborato nella creazione di un'applicazione di monitoraggio per sistemi informatici e di rete.

Tecnologie Utilizzate
Java Spring Boot
Thymeleaf (per il rendering dei template HTML)
Maven (per la gestione delle dipendenze e la build)
OSHI (per raccogliere informazioni sul sistema operativo e l'hardware)
Spring Boot Actuator (per esporre endpoint di monitoraggio)

Installazione
Requisiti
Per eseguire il progetto, è necessario avere:Java maven 




git clone https://github.com/Salnet86/JMonitoredReti.git

avigare nella directory del progetto
mvn package
mvn clean install
mvn spring-boot:run
mvn spring-boot:run


Struttura del Codice
1. Controller: SystemMonitoringController.java
Il controller gestisce le richieste HTTP per l'interfaccia utente. Recupera i dati di monitoraggio dalle API di sistema fornite dalla libreria OSHI e li invia al template Thymeleaf per la visualizzazione.

2. Servizio di Monitoraggio: SystemMonitoringService.java
Questo servizio raccoglie i dati di monitoraggio utilizzando la libreria OSHI. Implementa metodi per ottenere l'uso della CPU, la temperatura e lo spazio su disco.



3. Template Thymeleaf: index.html
Il file HTML rende i dati di monitoraggio attraverso il template Thymeleaf, mostrando le informazioni in modo chiaro e ordinato.



Conclusioni
Questo progetto offre una semplice applicazione web per monitorare le risorse di sistema in tempo reale, utile per amministratori di sistema e tecnici di rete. È un buon esempio di come combinare Spring Boot con librerie di sistema come OSHI per ottenere informazioni hardware e software in un'applicazione web.

Per aggiungere grafici interattivi e visualizzazioni dei dati nel tuo progetto, puoi usare diverse librerie JavaScript che si integrano bene con Spring Boot e Thymeleaf. Una delle librerie più popolari per i grafici è Chart.js, che è facile da usare e offre una varietà di grafici interattivi.

Come aggiungere Chart.js al tuo progetto:
Aggiungi Chart.js al tuo file HTML (template Thymeleaf): Puoi includere Chart.js direttamente nel tuo template HTML tramite un CDN.

Ecco un esempio di come farlo:
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
incluso ne progetto 




