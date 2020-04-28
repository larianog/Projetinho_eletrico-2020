package equipepoli.com.equipepoli;

public class Subsistema {

    private String nome;
    private int imagem; //vai armazenar o identificador do recurso private
    private String sobre;

    public Subsistema(String nome, String sobre, int imagem) {
        this.nome = nome;
        this.sobre = sobre;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
}
