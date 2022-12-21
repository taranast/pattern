package org.example;

public class Facade {
    Scriptwriter scriptwriter;
    Actor actor;
    FilmDirector filmdirector;
    Videoeditor videoeditor;
    Producer producer;
    public Facade(Scriptwriter sw, Actor ac, FilmDirector fd,  Videoeditor ve, Producer pr)
    {
        this.scriptwriter = sw;
        this.actor = ac;
        this.filmdirector = fd;
        this.videoeditor = ve;
        this.producer = pr;
    }
    public void Start()
    {
        scriptwriter.Write();
        actor.Play();
        filmdirector.DoScene();
        videoeditor.Mounting();
        videoeditor.SpecialEffects();
    }
    public void Stop()
    {
        producer.Produce();
    }
}
