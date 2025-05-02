
# Sistem de Gestionare a Crefitelor

Acest proiect reprezintă un sistem de gestionare a clienților, creditelor și plăților într-o aplicație Java folosind **Spring Framework** pentru Dependency Injection și **Lombok** pentru simplificarea codului.

## Descriere

Aplicația permite gestionarea clienților, creditelor și plăților asociate acestora. Folosind Spring și Lombok, am creat o aplicație simplă care utilizează **dependency injection** pentru a injecta instanțele de `Client`, `Credit`, și `Plata` într-un serviciu `CreditService`.

## Tehnologii utilizate

- **Java 11+**
- **Spring Framework**
  - Spring Boot
  - Spring IoC (Inversion of Control)
- **Lombok** pentru generarea automată a getter-elor, setter-elor, constructorilor și metodelor `toString`, `equals`, și `hashCode`.
- **Maven** pentru managementul dependințelor.

## Pași pentru a rula aplicația

1. **Clonarea repo-ului**:
   Clonează acest repo pe mașina locală:

   ```bash
   git clone <link-repo>
   ```

2. **Adăugarea dependențelor în `pom.xml`**:
   Asigură-te că fișierul `pom.xml` conține dependențele necesare pentru Spring și Lombok:

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter</artifactId>
       </dependency>
       <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-data-jpa</artifactId>
       </dependency>
       <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-test</artifactId>
           <scope>test</scope>
       </dependency>
       <dependency>
           <groupId>org.projectlombok</groupId>
           <artifactId>lombok</artifactId>
           <scope>provided</scope>
       </dependency>
   </dependencies>
   ```

3. **Configurarea aplicației**:
   Verifică fișierele din aplicație:
   - `AppConfig.java`: Configurația Spring, unde se definesc bean-urile pentru `Client`, `Credit`, `Plata`, și `CreditService`.
   - `MainApp.java`: Punctul de intrare în aplicație, care afișează detaliile clientului, creditului și plății.

4. **Rularea aplicației**:
   Poți rula aplicația folosind `mvn spring-boot:run` sau direct din IDE-ul tău.

   ```bash
   mvn spring-boot:run
   ```

   După rulare, aplicația va afișa detaliile pentru client, credit și plată în consola de ieșire.

## Structura proiectului

```plaintext
com.credit.crefitmanagement/
├── AppConfig.java               # Configurația Spring, definiție bean-uri
├── Client.java                  # Clasa Client (cu Lombok)
├── Credit.java                  # Clasa Credit (cu Lombok)
├── Plata.java                   # Clasa Plata (cu Lombok)
├── CreditService.java           # Serviciu care gestionează Client, Credit, și Plata
├── MainApp.java                 # Punctul de intrare în aplicație
└── application.properties       # Fișier de configurare Spring (opțional)
```

## Funcționalități

- **Gestionarea clienților**: Creează instanțe de `Client` cu detalii personale.
- **Gestionarea creditelor**: Creează instanțe de `Credit` asociate unui client.
- **Gestionarea plăților**: Creează instanțe de `Plata` legate de un credit.
- **Dependency Injection**: Folosește Spring pentru a injecta dependențele între clasele `Client`, `Credit`, `Plata` și `CreditService`.
- **Lombok**: Folosește Lombok pentru a reduce boilerplate code (getter, setter, constructori).

## Exemple de utilizare

În `MainApp.java`, când rulezi aplicația, ea va afișa detaliile unui client, credit și plată:

```plaintext
Client: Client(id=1, nume=Petrasco Bogdan, email=redan200@gmail.com, address=Mircea cel Batrin 17, numar=373911911, varsta=21)
Credit: Credit(idCredit=1, numeClient=Petrasco Bogdan, sumaImprumutata=10000.0, rataDobanzii=13.0, perioadaInLuni=36, esteAprobat=true)
Plata: Plata(idPlata=1, idCredit=1, sumaPlatita=5000.0, dataPlatii=30.03.2004, metodaPlata=Transfer MIA, intarziere=false, penalizare=0.0)
```

## Concluzie
În concluzie, proiectul implementat reprezintă un sistem simplu de gestionare a clienților, creditelor și plăților utilizând **Spring Framework** și **Lombok**. Folosind **Dependency Injection** pentru a conecta clasele și **Lombok** pentru a reduce codul repetitiv, am reușit să creăm o aplicație modulară și eficientă. Acest sistem poate fi extins cu ușurință pentru a adăuga noi funcționalități, cum ar fi gestionarea mai detaliată a creditelor, integrări cu baze de date sau interfețe grafice.

## Repozitoriu
Repozitoriu GitHub: [https://github.com/ArtemieJ/CreditManagement_Lab2]


