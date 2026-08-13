import java.sql.Time;

public class Musicas {

    public String titulo;
    public String artista;
    public String musica;
    private double duracao;
    public String anoDeLancamento;
    public String letras;
    public String genero;
    public String descricao;
    public   int  ouvintes;
    public String album;
    public String imgCapa;



    public void setDuracao(double duracao) {
        if (duracao > 0 ){
            this.duracao = duracao;
        }else{
            IO.println("Pode não mano");
        }


    }

public  void setTitulo(String titulo){
        this . titulo = titulo;

}
public void setArtista(String artista){
        this . artista = artista;
    }
public void setAnoDeLancamento(String anoDeLancamento){
        this. anoDeLancamento = anoDeLancamento;
}
}
