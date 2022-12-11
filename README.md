ListView personalizado

Es parte de la preparación del Proyecto DAM
Muestra un listado de productos con un adpatador* personalizado.

Objetivo:
    Muestra un listado de objetos Producto.
    No muestra tablas relacionales, por lo que no podrá mosrar el precio más reciente.
    Contiene un icono que permitiría añadir el producto a la lista actual.

Se ha creado, por primera vez, el POJO Producto

Vistas:
    La vista principal (ativity_main.xml) carga un ListView a pantalla completa.

Modificaciones sobre la marcha:
    Al POJO Producto se le ha añadido un campo de texto en el que indicar una URL
    que enlace con una imagen del producto.

Uso de Glide para cargar las imágenes
https://github.com/bumptech/glide
Usamos Gradle
----------------------------------------------
// En el módulo de aplicación
dependencies {
implementation 'com.github.bumptech.glide:glide:4.14.2'
annotationProcessor 'com.github.bumptech.glide:compiler:4.14.2'
}
-------------------------------------------------

Permisos de internet en AndroidManufest.xml
<uses-permission android:name="android.permission.INTERNET"></uses-permission>

Recuerdo: 
* Un adaptador permite a un template mostrar el contenido de una colección.
Recursos:
* URL para las imágenes en GoogleDrive: https://drive.google.com/uc?export=view&id=IDFILE