package maquina_de_lavar;
import java.io.*;
import java.util.Scanner;
import java.lang.Thread;
/**
 * @author Gustavo
 *
 */
public class maquinaDeLavar {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
				int codigoMaquina = 0,  voltagemMaquina = 0, kg = 0, estagioInicial = 0;
				int tempoPesado = 0, tempoNormal = 0, tempoLeve = 0, tempoEnxague = 0, tempoCentrifugacao = 0;
				double lavacaoPesada = 0 , lavacaoNormal = 0 , lavacaoLeve = 0, enxague = 0 , centrifugacao = 0;
				int confirmacao = 0;
				int i = 0;
				int continuacao = 0;
		
				String modelo ="";String nomeMaquina = "";
		
		do {
				System.out.println("================================================");
				System.out.println("Menu de Simula��o");
				System.out.println("================================================");
				System.out.println("1 - Configurar a sua m�quina de lavar");
				System.out.println("2 - Simular a maquina de lavar");
				System.out.println("0 - Sair");
				System.out.println("Digite o c�digo");
				codigoMaquina = teclado.nextInt();
				
						if(codigoMaquina >= 2) {
				do {
						System.out.println("Erro Tente novamente");
						System.out.println("================================================");
						System.out.println("Menu de Simula��o");
						System.out.println("================================================");
						System.out.println("1 - Configurar a sua m�quina de lavar");
						System.out.println("2 - Simular a maquina de lavar");
						System.out.println("0 - Sair");
						System.out.println("Digite o c�digo");
						codigoMaquina = teclado.nextInt();
						
				}while(codigoMaquina >= 2 );
						}
				
				
				if(codigoMaquina == 0) {
					System.out.println("Obrigado pela preferencia");
					break;
				}
				
				
				if(codigoMaquina == 1) {
					
					System.out.println("================================================");
					System.out.println("CONFIGURA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Digite o Modelo sem espa�o:");
					modelo = teclado.next();
					System.out.println("Digite o Nome sem espa�o:");
					nomeMaquina = teclado.next();
					
				do {
					System.out.println("Voltagem: (220 ou 110)");
					voltagemMaquina = teclado.nextInt();
					} while(voltagemMaquina != 220 && voltagemMaquina != 110);
					
					System.out.println("Quantos kg");
					kg = teclado.nextInt();
					System.out.println("Dura��o o estagio 1 - Lava��o Pesada: ");
					tempoPesado = teclado.nextInt();
					System.out.println("Dura��o do estagio 2 - Lava��o Normal: ");
					tempoNormal = teclado.nextInt();
					System.out.println("Dura��o do estagio 3 - Lava��o Leve: ");
					tempoLeve = teclado.nextInt();
					System.out.println("Dura��o do Estagio 4 - Enxague: ");
					tempoEnxague = teclado.nextInt();
					System.out.println("Dura��o do Estagio 5 - Centrifuga��o: ");
					tempoCentrifugacao = teclado.nextInt();
					}
					
					System.out.println("================================================");
					System.out.println("SIMULA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Simulando o modelo "+ modelo + "- Nome da maquina " + nomeMaquina + "- tem capacidade para " + kg + "kg voltagem: "+ voltagemMaquina);
					System.out.println("Digite 2) para refazer as configura��es ou 1) para continuar");
					confirmacao = teclado.nextInt();
					
			
		
			
				if(confirmacao != 2 && confirmacao !=1) {
					do {
						System.out.println("Erro tente novamente");
						System.out.println("Digite 2) para refazer as configura��es ou 1) para continuar");
						confirmacao = teclado.nextInt();
					}while(confirmacao != 2 && confirmacao !=1);
				}
			
				while(confirmacao == 2) {
				
					System.out.println("================================================");
					System.out.println("CONFIGURA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Digite o Modelo sem espa�o:");
					modelo = teclado.next();
					System.out.println("Digite o Nome sem espa�o:");
					nomeMaquina = teclado.next();
				
				do {
					System.out.println("Voltagem: (220 ou 110)");
					voltagemMaquina = teclado.nextInt();
					} while(voltagemMaquina != 220 && voltagemMaquina != 110);
				
					System.out.println("Quantos kg");
					kg = teclado.nextInt();
					System.out.println("Dura��o o estagio 1 - Lava��o Pesada: ");
					tempoPesado = teclado.nextInt();
					System.out.println("Dura��o do estagio 2 - Lava��o Normal: ");
					tempoNormal = teclado.nextInt();
					System.out.println("Dura��o do estagio 3 - Lava��o Leve: ");
					tempoLeve = teclado.nextInt();
					System.out.println("Dura��o do Estagio 4 - Enxague: ");
					tempoEnxague = teclado.nextInt();
					System.out.println("Dura��o do Estagio 5 - Centrifuga��o: ");
					tempoCentrifugacao = teclado.nextInt();
				
					System.out.println("================================================");
					System.out.println("SIMULA��O DA MAQUINA DE LAVAR");
					System.out.println("================================================");
					System.out.println("Simulando o modelo "+ modelo + "- Nome da maquina " + nomeMaquina + "- tem capacidade para " + kg + "kg voltagem: "+ voltagemMaquina);
					System.out.println("Digite 2) para refazer as configura��es ou 1) para continuar");
					confirmacao = teclado.nextInt();
					}
			
		
			if(confirmacao == 1) {
					System.out.println("================================================");
					System.out.println("QUAL EST�GIO VOCE DESEJA COM��AR");
					System.out.println("================================================");
					System.out.println("1 - Lava��o pessada:");
					System.out.println("2 - Lava��o normal");
					System.out.println("3 - Lava��o leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifuga��o");
					System.out.println("selecione o estagio inicial: ");
					estagioInicial = teclado.nextInt();
					}
			
			
		switch (estagioInicial) {
				case 1:
					for (i = 0; i < 5; i++ ){	
						lavacaoPesada = lavacaoPesada + 20;
						System.out.println("Estagio 1 - Lava��o pesada : " + lavacaoPesada + "%");
						Thread.sleep(tempoPesado*1000);
					}
						System.out.println("");
				
				case 2:
					for (i = 0; i < 5; i++ ){
						lavacaoNormal = lavacaoNormal + 20;
						System.out.println("Estagio 2 - Lava��o normal : " + lavacaoNormal + "%");
						Thread.sleep(tempoNormal*1000);
					}
						System.out.println("");
				
			case 3:
					for (i = 0; i < 5; i++ ){
						lavacaoLeve = lavacaoLeve + 20;
						System.out.println("Estagio 3 - Lava��o leve : " + lavacaoLeve + "%");
						Thread.sleep(tempoLeve*1000);
					}
						System.out.println("");
				
			case 4 :
					for (i = 0; i < 5; i++ ){
						enxague = enxague + 20;
						System.out.println("Estagio 4 - Em Enxague : " + enxague + "%");
						Thread.sleep(tempoEnxague*1000);
					}
					System.out.println("");
			
			case 5 :
					for (i = 0; i < 5; i++ ){
						centrifugacao = centrifugacao + 20;
						System.out.println("Estagio 5 - Centrifuga��o : " + centrifugacao + "%");
						Thread.sleep(tempoCentrifugacao*1000);
					}	
			}
							lavacaoPesada = 0;
							lavacaoNormal = 0;
							lavacaoLeve = 0;
							enxague = 0;
							centrifugacao = 0;
							tempoPesado= 0;
							tempoEnxague= 0;
							tempoLeve= 0;
							tempoNormal= 0;
							tempoPesado= 0;
			
			
					
						System.out.println("Digite 2) para continuar e 0) para encerra");
						continuacao = teclado.nextInt();
					if (continuacao != 2 && continuacao != 0) {
						do {
							System.out.println("Erro tente novamente");
							System.out.println("Digite 2) para continuar e 0) para encerra");
							continuacao = teclado.nextInt();
							}while(continuacao != 2 && continuacao != 0);
					}
					
				
					
					if(continuacao ==0) {
						System.out.println("Volte sempre");
						break;
					}
						
	
	}while(continuacao == 2);
		
		
		
		
		
	
		
		
		
		
		
			
		}
		
	}