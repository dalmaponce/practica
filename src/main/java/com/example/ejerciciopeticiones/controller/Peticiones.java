package com.example.ejerciciopeticiones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Peticiones {

    @GetMapping("/receta")
    public String receta() {
        return "<html>" +
                "<h1>Receta Flan</h1>" +
                "<h2>Ingredientes</h2>" +
                "<ol><li>500cc de Leche</li>" +
                "<li>5u. de Huevos</li><li>200g Azucar</li></ol>" +
                "<h2>Preparacion</h2>" +
                "<ol><li>Primero se deben cascar los cinco huevos en un bol, luego se deben agregar 100 gramos de azúcar. Batir hasta unificar los huevos con el azúcar.</li>" +
                "<li>Luego, se agrega la leche. Quedará líquido, pero revolviendo todo se podrá incorporar formando una especie de masa homogénea. No hay que batir, pero sí revolver con tenedor para que quede todo espumoso y mezclado. Una vez hecho esto, se reserva lo obtenido.</li>" +
                "<h2>Coccion</h2></ol><p>Teniendo en cuenta que el flan se cocina a baño maría, pondremos la fuente en la que haremos el flan sobre una tartera u otra superficie de paredes más bajas.\n" +
                "\n" +
                "Primero se colocará el caramelo dentro de la flanera, y lo moveremos para cubrir toda la superficie del molde. Acto seguido, echaremos la mezcla de flan dentro.\n" +
                "\n" +
                "Luego de esto, pondremos agua en el recipiente que contiene la flanera y lo llevaremos al horno en fuego mínimo durante 40 minutos. Una vez que pase este tiempo, se deberá comprobar que el flan está listo con la famosa prueba del cuchillo: se mete dentro del flan, y si el mismo sale seco, la preparación ya está realizada.\n" +
                "\n" +
                "Luego, hay que dejar enfriar el flan. Se desmolda, se emplata y se lleva a la mesa para disfrutar con los seres queridos.</p></html>";
    }

    @GetMapping("/noticia")
    public String noticia() {
        return "<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "  <title>Noticia</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <h1>El Servicio Meteorológico anuncia tormentas para esta noche</h1>\n" +
                "  <img src=\"https://media.elancasti.com.ar/p/091041842f69a5ee72a7f00b5bfbbfba/adjuntos/325/imagenes/000/264/0000264319/790x0/smart/128850jpgwebp.png\">\n" +
                "  <p>Tras el temporal que generó severos daños, el Servicio Meteorológico Nacional anticipó que esta noche podrían registrarse nuevas tormentas en el Valle Central, aunque los vientos serán mucho más moderados.\n" +
                "  <br>Según el SMN la máxima para hoy rondaría los 35º durante la siesta y luego, hacia la tarde, las condiciones comenzarían a varias hacia una posible tormenta, aunque no se espera que la temperatura descienda más de 5º.\n" +
                "  <br>Jueves y viernes las temperaturas irán en aumento con máximas de 38º y 40º respectivamente, mientras que el sábado si se registraría una merma del calor con una máxima de 33º.</p>\n" +
                "   <a href=\"https://www.elancasti.com.ar/noticias\">para mayor informacion clic aqui</a>.\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/spring")
    public String spring(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "  <title>spring</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <h1>Pagina oficial Spring</h1>\n" +
                "  \n" +
                "  <p>Para saber todo sobre Sprin ingresa a su <a href=\"https://spring.io/\">sitio oficial</a></p>\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("/argentina")
    public String argentina(){
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width\">\n" +
                "  <title>argentina</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <h1>A un mes de Argentina campeona mundial: cuánto dura la felicidad</h1>\n" +
                "  \n" +
                "  <p>Dicen que la felicidad no dura para siempre. Aunque para siempre, como dice Lewis Carroll en Alicia en el País de las Maravillas, puede ser, a veces, un segundo. Por eso la felicidad es imposible de mensurar. Porque cada uno tiene la felicidad que puede, aunque difícilmente pueda alcanzar la que uno quiera.\n" +
                "  <br>Porque la felicidad puede ser el nacimiento de un hijo. Pero puede ser mucho más simple y no por eso menos feliz. Puede ser un plato de comida que llene la panza o un estudio médico que sale bien o una sonrisa de alguien que queremos. O mucho más mundana. Quién no siente felicidad cuando encuentra un billete en el bolsillo de una campera que no se usa hace seis meses. Y hay, claro, modos o tipos de felicidad. Porque también se parece a la felicidad, una felicidad instantánea, pegarle de lleno a una pelota con el empeine y clavarla en el ángulo en un picado con amigos. O, por qué no, meter un revés paralelo, modo Roger Federer, en un partido de tenis en el club.\n" +
                "    <a href=\"https://www.clarin.com/deportes/mes-argentina-campeona-mundial-dura-felicidad_0_BIDzrpWhmn.html\">...</a></p><br><a href=\"\">para mas noticias</a></p>\n" +
                "</body>\n" +
                "</html>";
    }

}
