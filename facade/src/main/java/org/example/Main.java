package org.example;

public class Main {
    public static void main(String[] args) {
        Scriptwriter scriptwriter = new Scriptwriter();
        Actor actor = new Actor();
        FilmDirector filmdirector = new FilmDirector();
        Videoeditor videoeditor = new Videoeditor();
        Producer producer = new Producer();
        Facade film = new Facade(scriptwriter, actor, filmdirector, videoeditor, producer);
        film.Start();
        film.Stop();

    }
}