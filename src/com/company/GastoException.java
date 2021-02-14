package com.company;
/**
 *
 * Aprovechando dos de las caracter�sticas m�s importantes de Java, la herencia y el polimorfismo,
 * podemos crear nuestras propias excepciones simplemente heredando.
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/excepciones/propias.htm
 */
public class GastoException extends  Exception{

        public GastoException() {
            //me obligas a pasarle el literal a trav�s del padre debido a que seg�n
            //el diagrama de clases no se permite tener un final String
            super("Saldo insuficiente o cero, verifique saldo primero ");
        }
}
