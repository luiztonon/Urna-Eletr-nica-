package Aplicação;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----URNA-----");
		System.out.println(" (13) Lula");
		System.out.println(" (22) Bolsonaro");
		System.out.println(" (12) Ciro");
		System.out.println(" (0) Branco ou Nulo");
		System.out.println("-----URNA-----");
		
		int voto=sc.nextInt();
		int votosLula=0;
		int votosBolsonaro=0;
		int votosCiro=0;
		int votosBrancoNulo=0;
		int votoTotal = 0;
		int maior=0;
		String vencedor="";
		
		
		while(voto>=0) {
			if(voto==13) {
				votosLula++;
				System.out.println("O seu voto foi computado para o candidato Lula");
			}else if (voto==22)	{
				votosBolsonaro++;
				System.out.println("O seu voto foi computado para o candidato Bolsonaro");
			}else if (voto==12)	{
				votosCiro++;
				System.out.println("O seu voto foi computado para o candidato Ciro");
			}else if (voto==0)	{
				votosBrancoNulo++;
				System.out.println("Você votou Branco ou Nulo");
			}else {
				System.out.println("Candidato Incorreto, Vote novamente");
			}
			if(voto==13 || voto==22 || voto==12 || voto==0) {
			votoTotal++;
			}
			
			if(votosBolsonaro>maior) {
				maior = votosBolsonaro;
				vencedor="Bolsonaro";
			} if(votosLula>maior) {
				maior = votosLula;
				vencedor="Lula";
			} if(votosCiro>maior) {
				maior = votosCiro;
				vencedor="Ciro";
			}
			
			System.out.println("Vote novamente");
			System.out.println(" (-1) para Sair");
			voto=sc.nextInt();
	}
		System.out.println("-----RESULTADO-----");
		System.out.println("Total = " + votoTotal + " = 100%");
		double porcLula = (100 * votosLula) / votoTotal;
		System.out.println("Lula = " + porcLula + "%");
		double porcBolsonaro = (100 * votosBolsonaro) / votoTotal;
		System.out.println("Bolsonaro = " + porcBolsonaro + "%");
		double porcCiro = (100 * votosCiro) / votoTotal;
		System.out.println("Ciro = " + porcCiro + "%");
		double porcBrancoNulo = (100 * votosBrancoNulo) / votoTotal;
		System.out.println("Votos em branco ou Nulo : = " + porcBrancoNulo+ "%");
		System.out.println("Vencedor : "+vencedor);
		System.out.println("-----RESULTADO-----");
	sc.close();
		
		}
		

	}


