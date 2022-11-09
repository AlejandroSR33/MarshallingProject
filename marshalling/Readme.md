# Projecto Marshalling
- Primero hemos creado las siguientes clases:
    - Biblioteca.java
    - Bibliotecas.java
    - Prestamos.java
    - Prestamo.java
    - Libro.java
    - Libros.java
    - Resenna.java
    - Resennas.java
    - Usuarios.java
    - Usuarios.java

- La clase marshalling generar el xml de los datos de las clases anteriorres.
- La clase unmarshalling se utiliza para mostrar el xml generado en la consola.

# Significado de SAX
- Detecta cuándo empieza y termina un elemento o el documento, o un conjunto de caracteres, etc. (Genera eventos)
- Gestiona los espacios de nombres.
- Comprueba que el documento está bien formado.
- Las aplicaciones necesitan implementar manejadores de los eventos notificados.
- SAX lee secuencialmente de principio a fin, sin cargar todo el documento en memoria.

# Significado de DOM
El modelo de objeto de documento (DOM) es una interfaz de programación para los documentos HTML y XML. Facilita una representación estructurada del documento y define de qué manera los programas pueden acceder, al fin de modificar, tanto su estructura, estilo y contenido. El DOM da una representación del documento como un grupo de nodos y objetos estructurados que tienen propiedades y métodos. Esencialmente, conecta las páginas web a scripts o lenguajes de programación.

# Significado de StAX
Streaming API for XML (StAX) es una interfaz de programación de aplicaciones (API) para leer y escribir documentos XML, originaria de la comunidad del lenguaje de programación Java.

Tradicionalmente, las APIs XML son de uno de tos dos tipos:

- basadas en DOM - todo el documento es leído en memoria como una estructura de árbol para acceso aleatorio por la aplicación llamante.
- basadas en eventos - la aplicación se registra para recibir eventos según las entidades se encuentran en el documento de origen.
Ambos tienen ventajas, el primero (por ejemplo, DOM) permite acceso aleatorio al documento, el segundo (por ejemplo, SAX) requiere una pequeña huella de memoria y es típicamente mucho más rápido.

Estos dos paradigmas de acceso pueden ser considerados como polos opuestos. Una API basada en un árbol permite acceso y manipulación ilimitados y aleatorios, mientras que una API basada en eventos es un pase de 'una sola vez' a través del documento de origen.

StAX fue diseñado como un término medio entre estos dos polos opuestos. En el paradigma StAX, el punto de entrada de programación es un cursor que representa un punto dentro del documento. La aplicación mueve el cursor hacia adelante ("tirando" de la información del analizador según necesita). Esto es diferente de una API basada en eventos, como SAX, que "empuja" los datos a la aplicación (requiriendo que la aplicación mantenga el estado entre los eventos puesto que es necesario para realizar un seguimiento de la ubicación dentro del documento).

# Definicion de JAXB
JAXB (Java™ Architecture for XML Binding) es una tecnología Java que proporciona una forma fácil y cómoda de correlacionar clases Java y esquema XML para un desarrollo de servicios web simplificado. JAXB proporciona el compilador de esquemas xjc, el generador de esquemas schemagen y una infraestructura de tiempo de ejecución para dar soporte a la ordenación y desordenación de documentos XML hacia y desde objetos Java.