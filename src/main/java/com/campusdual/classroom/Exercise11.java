package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Encender la TV
        redRemote.turnOn();
        if(redRemote.on){
            System.out.println("La tele está encendida");
        } else {
            System.out.println("La tele está apagada");
        }

        //Subir un canal
        redRemote.channelUp();

        //Bajar un canal
        redRemote.channelDown();

        //Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println("La tele está en el canal " + redRemote.channel);

        //Subir el volumen
        redRemote.volumeUp();

        //Bajar el volumen
        redRemote.volumeDown();

        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println("Nivel de volumen: " + redRemote.volume);

        //Obtener el color del mando a distancia y mostrarlo por pantalla
        String color = redRemote.getColor();
        System.out.println("El mando es de color " + color);

        //Apagar la TV
        redRemote.turnOff();
        if(redRemote.on){
            System.out.println("La tele está encendida");
        } else {
            System.out.println("La tele está apagada");
        }
    }

}