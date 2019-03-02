package aziendavinicola

class Vitigno {
    String nome
    String caratteristiche
    static hasMany = [prodotti: Prodotto]

    static constraints = {
        nome blank: false
        caratteristiche size: 0..65535, widget: 'textarea'
        prodotti()
    }
}