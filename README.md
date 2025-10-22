# TECNOLOGIES UTILITZADES
El projecte funciona per consola, sense dependències externes, utilitzant únicament les llibreries estàndard del JDK 25.
Framework de testing JUnit 5 (JUnit Jupiter)
Gestor de dependències Maven.

# REQUISISTS
Llenguatge: Java (versió 17 o superior).
Entorn de desenvolupament recomanat: IntelliJ IDEA

# JDK requerit:
Java SE Development Kit 17 o posterior.

# Sistema operatiu compatible:
Windows, macOS o Linux amb suport per a la JVM.

# Dependències externes:
Cap. El projecte utilitza exclusivament les llibreries estàndard del JDK.

# Execució:
Compilar i executar la classe principal Main.java des de l’entorn o línia de comandes.

No requereix connexió a internet ni cap base de dades externa.

# INSTAL·LACIÓ
Per instal·lar i executar el projecte en un entorn local, cal seguir els passos següents: 
Instal·lació del JDK: Descarrega i instal·la el Java SE Development Kit (JDK) versió 17 o superior des de la pàgina oficial d’Oracle o des d’OpenJDK.

# Descàrrega del projecte:
Descarrega l’arxiu del projecte complet (fitxers .java) o clona el repositori si es troba allotjat en un sistema de control de versions (com GitHub).

Desa els fitxers dins d’una carpeta local del teu ordinador.

# Configuració de l’entorn de desenvolupament:
Obre el projecte amb un IDE compatible amb Java, com IntelliJ IDEA.

Assegura’t que l’IDE estigui configurat per utilitzar el JDK 17 o superior.

# Compilació del projecte:
Compila totes les classes del projecte (Main.java, Product.java, Sale.java, etc.) des de l’IDE o bé mitjançant la línia de comandes: javac *.java


# Execució del programa:
Un cop compilat, executa la classe principal del projecte (Main.java): java Main

El programa s’executarà per consola i permetrà realitzar les operacions previstes (gestió de productes, vendes, etc.).

# DESPLEGAMENT
Preparació de l’entorn del servidor:
Assegura’t que el servidor disposi d’una versió de Java Runtime Environment (JRE) o Java Development Kit (JDK) igual o superior a la versió 17.

Comprova que les variables d’entorn JAVA_HOME i PATH estiguin configurades correctament.

# Transferència dels fitxers del projecte:
Copia al servidor tots els fitxers .class o el paquet .jar (si s’ha generat) corresponents al projecte.

Desa’ls dins d’un directori accessible per a l’execució (per exemple: /opt/projecteJava/ o C:\projecteJava\).

# Execució del projecte al servidor:
Si es disposa dels fitxers compilats, executa la classe principal amb l’ordre: java Main

Si s’ha empaquetat com un fitxer .jar, executa: java -jar NomDelProjecte.jar

# Gestió del procés d’execució:
En servidors Linux, es recomana executar el programa en segon pla o mitjançant un servei del sistema (systemd o nohup) per garantir la seva persistència.
En entorns Windows, es pot utilitzar el Task Scheduler o un fitxer .bat per automatitzar-ne l’execució.

# NIVELL 1 / EXERCICI 1
Crea una classe Java que gestioni una col·lecció de llibres en una biblioteca. La classe ha de permetre afegir llibres, recuperar la llista de llibres, obtenir un llibre específic per la seva posició, afegir un llibre en una posició específica i eliminar un llibre per títol.

Implementa les següents funcionalitats:

La classe ha de permetre afegir llibres a la col·lecció.
S'ha de poder recuperar la llista completa de llibres
S'ha de poder obtenir el títol d'un llibre donada una posició.
S'ha de poder afegir un llibre en una posició específica.
S'ha de poder eliminar un llibre per títol.
Verifica el seu correcte funcionament amb JUnit:

Verifiquen que la llista de llibres no és nul·la després de crear un nou objecte.
Confirmen que la llista té una mida esperada després d'inserir diversos llibres.
Asseguren que la llista conté un llibre específic en la seva posició correcta.
Verifiquen que no hi ha títols de llibres duplicats a la llista.
Comproven que es pot recuperar el títol d'un llibre donada una posició específica.
Asseguren que afegir un llibre modifica correctament la llista.
Confirmen que eliminar un llibre disminueix la mida de la llista.
Verifiquen que la llista roman ordenada alfabèticament després d'afegir o eliminar un llibre.

# NIVELL 1 / EXERCICI 2
Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número com a paràmetre.
Crea una classe jUnit que verifiqui el seu correcte funcionament, parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte
per a 10 números de DNI predefinits.

# NIVELL 1 / EXERCICI 3
Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
Verifica el seu correcte funcionament amb un test jUnit.

