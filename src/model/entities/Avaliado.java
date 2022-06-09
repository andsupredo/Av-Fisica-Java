package model.entities;

import model.enums.Sexo;

import java.text.SimpleDateFormat;
import java.util.Date;

import static model.enums.Sexo.FEMININO;
import static model.enums.Sexo.MASCULINO;

public class Avaliado {

    private String nome;
    private Date dataNascimento;
    private Double altura;
    private Double peso;
    private Sexo sexo;
    private Double dobraTriciptal;
    private Double dobraSubescapular;
    private Double dobraPeitoral;
    private Double dobraAxilarMedia;
    private Double dobraAbdominal;
    private Double dobraSuprailiaca;
    private Double dobraCoxa;
    private Double circPescoco;
    private Double circBracoEsquerdo;
    private Double circBracoDireito;
    private Double circBracoEsquerdoCont;
    private Double circBracoDireitoCont;
    private Double circAntebracoEsquerdo;
    private Double circAntebracoDireito;
    private Double circPeitoral;
    private Double circOmbros;
    private Double circCintura;
    private Double circQuadril;
    private Double circCoxaEsquerda;
    private Double circCoxaDireita;
    private Double circPantEsquerda;
    private Double circPantDireita;

    public Avaliado(String nome, Date dataNascimento, Double altura, Double peso, Sexo sexo, Double dobraTriciptal, Double dobraSubescapular, Double dobraPeitoral, Double dobraAxilarMedia, Double dobraAbdominal, Double dobraSuprailiaca, Double dobraCoxa, Double circPescoco, Double circBracoEsquerdo, Double circBracoDireito, Double circBracoEsquerdoCont, Double circBracoDireitoCont, Double circAntebracoEsquerdo, Double circAntebracoDireito, Double circPeitoral, Double circOmbros, Double circCintura, Double circQuadril, Double circCoxaEsquerda, Double circCoxaDireita, Double circPantEsquerda, Double circPantDireita) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.dobraTriciptal = dobraTriciptal;
        this.dobraSubescapular = dobraSubescapular;
        this.dobraPeitoral = dobraPeitoral;
        this.dobraAxilarMedia = dobraAxilarMedia;
        this.dobraAbdominal = dobraAbdominal;
        this.dobraSuprailiaca = dobraSuprailiaca;
        this.dobraCoxa = dobraCoxa;
        this.circPescoco = circPescoco;
        this.circBracoEsquerdo = circBracoEsquerdo;
        this.circBracoDireito = circBracoDireito;
        this.circBracoEsquerdoCont = circBracoEsquerdoCont;
        this.circBracoDireitoCont = circBracoDireitoCont;
        this.circAntebracoEsquerdo = circAntebracoEsquerdo;
        this.circAntebracoDireito = circAntebracoDireito;
        this.circPeitoral = circPeitoral;
        this.circOmbros = circOmbros;
        this.circCintura = circCintura;
        this.circQuadril = circQuadril;
        this.circCoxaEsquerda = circCoxaEsquerda;
        this.circCoxaDireita = circCoxaDireita;
        this.circPantEsquerda = circPantEsquerda;
        this.circPantDireita = circPantDireita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Double getDobraTriciptal() {
        return dobraTriciptal;
    }

    public void setDobraTriciptal(Double dobraTriciptal) {
        this.dobraTriciptal = dobraTriciptal;
    }

    public Double getDobraSubescapular() {
        return dobraSubescapular;
    }

    public void setDobraSubescapular(Double dobraSubescapular) {
        this.dobraSubescapular = dobraSubescapular;
    }

    public Double getDobraPeitoral() {
        return dobraPeitoral;
    }

    public void setDobraPeitoral(Double dobraPeitoral) {
        this.dobraPeitoral = dobraPeitoral;
    }

    public Double getDobraAxilarMedia() {
        return dobraAxilarMedia;
    }

    public void setDobraAxilarMedia(Double dobraAxilarMedia) {
        this.dobraAxilarMedia = dobraAxilarMedia;
    }

    public Double getDobraAbdominal() {
        return dobraAbdominal;
    }

    public void setDobraAbdominal(Double dobraAbdominal) {
        this.dobraAbdominal = dobraAbdominal;
    }

    public Double getDobraSuprailiaca() {
        return dobraSuprailiaca;
    }

    public void setDobraSuprailiaca(Double dobraSuprailiaca) {
        this.dobraSuprailiaca = dobraSuprailiaca;
    }

    public Double getDobraCoxa() {
        return dobraCoxa;
    }

    public void setDobraCoxa(Double dobraCoxa) {
        this.dobraCoxa = dobraCoxa;
    }

    public Double getCircPescoco() {
        return circPescoco;
    }

    public void setCircPescoco(Double circPescoco) {
        this.circPescoco = circPescoco;
    }

    public Double getCircBracoEsquerdo() {
        return circBracoEsquerdo;
    }

    public void setCircBracoEsquerdo(Double circBracoEsquerdo) {
        this.circBracoEsquerdo = circBracoEsquerdo;
    }

    public Double getCircBracoDireito() {
        return circBracoDireito;
    }

    public void setCircBracoDireito(Double circBracoDireito) {
        this.circBracoDireito = circBracoDireito;
    }

    public Double getCircBracoEsquerdoCont() {
        return circBracoEsquerdoCont;
    }

    public void setCircBracoEsquerdoCont(Double circBracoEsquerdoCont) {
        this.circBracoEsquerdoCont = circBracoEsquerdoCont;
    }

    public Double getCircBracoDireitoCont() {
        return circBracoDireitoCont;
    }

    public void setCircBracoDireitoCont(Double circBracoDireitoCont) {
        this.circBracoDireitoCont = circBracoDireitoCont;
    }

    public Double getCircAntebracoEsquerdo() {
        return circAntebracoEsquerdo;
    }

    public void setCircAntebracoEsquerdo(Double circAntebracoEsquerdo) {
        this.circAntebracoEsquerdo = circAntebracoEsquerdo;
    }

    public Double getCircAntebracoDireito() {
        return circAntebracoDireito;
    }

    public void setCircAntebracoDireito(Double circAntebracoDireito) {
        this.circAntebracoDireito = circAntebracoDireito;
    }

    public Double getCircPeitoral() {
        return circPeitoral;
    }

    public void setCircPeitoral(Double circPeitoral) {
        this.circPeitoral = circPeitoral;
    }

    public Double getCircOmbros() {
        return circOmbros;
    }

    public void setCircOmbros(Double circOmbros) {
        this.circOmbros = circOmbros;
    }

    public Double getCircCintura() {
        return circCintura;
    }

    public void setCircCintura(Double circCintura) {
        this.circCintura = circCintura;
    }

    public Double getCircQuadril() {
        return circQuadril;
    }

    public void setCircQuadril(Double circQuadril) {
        this.circQuadril = circQuadril;
    }

    public Double getCircCoxaEsquerda() {
        return circCoxaEsquerda;
    }

    public void setCircCoxaEsquerda(Double circCoxaEsquerda) {
        this.circCoxaEsquerda = circCoxaEsquerda;
    }

    public Double getCircCoxaDireita() {
        return circCoxaDireita;
    }

    public void setCircCoxaDireita(Double circCoxaDireita) {
        this.circCoxaDireita = circCoxaDireita;
    }

    public Double getCircPantEsquerda() {
        return circPantEsquerda;
    }

    public void setCircPantEsquerda(Double circPantEsquerda) {
        this.circPantEsquerda = circPantEsquerda;
    }

    public Double getCircPantDireita() {
        return circPantDireita;
    }

    public void setCircPantDireita(Double circPantDireita) {
        this.circPantDireita = circPantDireita;
    }

    public int idade(){
        Date agora = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int ano1 = Integer.parseInt(sdf.format(dataNascimento));
        int ano2 = Integer.parseInt(sdf.format(agora));
        return ano2 - ano1;
    }

    public double percentualGordura(){
        double dc = 1.112 - 0.00043499 * (dobraTriciptal + dobraSubescapular + dobraPeitoral + dobraAxilarMedia + dobraAbdominal + dobraSuprailiaca + dobraCoxa) + 0.00000055 * (dobraTriciptal + dobraSubescapular + dobraPeitoral + dobraAxilarMedia + dobraAbdominal + dobraSuprailiaca + dobraCoxa) * 2 - 0.00028826 * idade();
        return  ((4.95 / dc) - 4.50) * 100;
    }

    public double massaMagra(){
        if (sexo == MASCULINO){
        double amb = Math.sqrt((((circBracoDireito+circBracoEsquerdo)/2) *10) - (Math.PI * dobraTriciptal)) / (4 * Math.PI) - 10;
        return altura * 0.0264 + (0.029 * amb)/1000;
        }
        else if (sexo == FEMININO){
            double amb = Math.sqrt((((circBracoDireito+circBracoEsquerdo)/2) *10) - (Math.PI * dobraTriciptal)) / (4 * Math.PI) - 6.5;
            return altura * 0.0264 + (0.029 * amb)/1000;
        }
        else {
            return 0;
        }
    }

    public String toString(){
        return
                "Avaliado(a):\n" + nome
                + ", idade: "
                + idade()
                + ", sexo: " + sexo
                + "\nPeso: "
                + peso
                + "kg\nAltura: "
                + altura
                + "cm\n % Gordura: "
                +  String.format("%.2f", percentualGordura()) + "%"
                + "\n Massa Magra: "
                + String.format("%.2f", massaMagra())
                + "kg";
    }
}