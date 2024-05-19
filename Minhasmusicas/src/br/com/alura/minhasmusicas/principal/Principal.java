package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++)
        {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++)
        {
            minhaMusica.curte();
        }

        Podcast meuPoadcast = new Podcast();
        meuPoadcast.setTitulo("Bolha Dev");
        meuPoadcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++)
        {
            meuPoadcast.reproduz();
        }

        for (int i = 0; i < 1000; i++)
        {
            meuPoadcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPoadcast);
        preferidas.inclui(minhaMusica);
    }
}
