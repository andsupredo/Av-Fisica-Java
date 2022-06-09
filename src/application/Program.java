package application;

import model.entities.Avaliado;
import model.enums.Sexo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Date;

import static model.enums.Sexo.FEMININO;
import static model.enums.Sexo.MASCULINO;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Avaliado> avaliados = new ArrayList<>();

        while (true) {
            System.out.println("Deseja iniciar uma nova avaliação? (s/n):");
            char inicio = sc.next().charAt(0);
            if (!(inicio == 's')) /*o programa será encerrado com qualquer resposta diferente de "s" */ {

                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Insira os dados do(a) avaliado(a):");
                sc.nextLine(); //nextLine usado para não dar erro no input do campo nome
                System.out.print("nome: ");
                String nome = sc.nextLine();

                System.out.print("Data de nascimento: ");
                Date dataNascimento = sdf.parse(sc.next());

                System.out.print("Peso: ");
                double peso = sc.nextDouble();

                System.out.print("Altura: ");
                double altura = sc.nextDouble();


                System.out.print("Sexo: ");
                Sexo sexo = Sexo.valueOf(sc.next());

                System.out.println();
                System.out.println("Insira o valor das circunferências:");
                System.out.println();

                System.out.print("Pescoço: ");
                double circPescoco = sc.nextDouble();

                System.out.print("Ombros: ");
                double circOmbros = sc.nextDouble();

                System.out.print("Peitoral: ");
                double circPeitoral = sc.nextDouble();

                System.out.print("Braço esquerdo: ");
                double circBracoEsquerdo = sc.nextDouble();

                System.out.print("Braço esquerdo contraído: ");
                double circBracoEsquerdoCont = sc.nextDouble();

                System.out.print("Braço direito: ");
                double circBracoDireito = sc.nextDouble();

                System.out.print("Braço direito contraído: ");
                double circBracoDireitoCont = sc.nextDouble();

                System.out.print("Antebraço esquerdo: ");
                double circAntebracoEsquerdo = sc.nextDouble();

                System.out.print("Antebraço direito: ");
                double circAntebracoDireito = sc.nextDouble();

                System.out.print("Cintura: ");
                double circCintura = sc.nextDouble();

                System.out.print("Quadril: ");
                double circQuadril = sc.nextDouble();

                System.out.print("Coxa esquerda: ");
                double circCoxaEsquerda = sc.nextDouble();

                System.out.print("Coxa direita: ");
                double circCoxaDireita = sc.nextDouble();

                System.out.print("Panturrilha esquerda: ");
                double circPantEsquerda = sc.nextDouble();

                System.out.print("Panturrilha direita: ");
                double circPantDireita = sc.nextDouble();

                System.out.println();
                System.out.println("Insira o valor das dobras cutâneas: ");

                System.out.print("Dobra triciptal: ");
                double dobraTriciptal = sc.nextDouble();

                System.out.print("Dobra subescapular: ");
                double dobraSubescapular = sc.nextDouble();

                System.out.print("Dobra peitoral: ");
                double dobraPeitoral = sc.nextDouble();

                System.out.print("Dobra axilar média: ");
                double dobraAxilarMedia = sc.nextDouble();

                System.out.print("Dobra abdominal: ");
                double dobraAbdominal = sc.nextDouble();

                System.out.print("Dobra suprailíaca: ");
                double dobraSuprailiaca = sc.nextDouble();

                System.out.print("Dobra coxa: ");
                double dobraCoxa = sc.nextDouble();

                Avaliado avaliado = new Avaliado(nome, dataNascimento, altura, peso, sexo, dobraTriciptal, dobraSubescapular, dobraPeitoral, dobraAxilarMedia, dobraAbdominal, dobraSuprailiaca, dobraCoxa, circPescoco, circBracoEsquerdo, circBracoDireito, circBracoEsquerdoCont, circBracoDireitoCont, circAntebracoEsquerdo, circAntebracoDireito, circPeitoral, circOmbros, circCintura, circQuadril, circCoxaEsquerda, circCoxaDireita, circPantEsquerda, circPantDireita);
                avaliados.add(avaliado);
            }
        }

            for (Avaliado av : avaliados) {
                System.out.println("============================");
                System.out.println(av);
                System.out.println();
            }

            sc.close();
        }
    }