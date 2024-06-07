package Sistema;

import java.util.Scanner;

public class Sistema {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Bem vindo(a) a gestão de frotas! Vamos começar?");
		System.out.println("Escreva 1 para continuar ou 9 para sair.");

		int opcao = 0;

		do {
			opcao = teclado.nextInt();
			if (opcao == 1) {
				funcoes(opcao, opcao, opcao, opcao, opcao, opcao, opcao, opcao);
			}else {
				System.out.println("Sistema fechando...");
				break;
			}
		} while (opcao != 0);
	}

	static void funcoes(int pesoTotal, int cUtil, int tempTotal, int tempDiarioOp, double nViagens, int tDiasdisp,
			double viagens, double viagensporMes) {
		System.out.println("Vamos começar! Coloque os dados corretos para ser direcionado às respostas. Coloque os pesos em kg para respotas corretas e o tempo perguntado em minutos.");
		pesoVeic();
		cargaUtil(pesoTotal);
		viagensMes(cUtil);
		Tempviagens();
		tempDoper();
		nViagenspordia(tempTotal, tempDiarioOp);
		diasDisp();
		viagporMes(nViagens, tDiasdisp);
		frota(viagens, viagensporMes);
		System.out.println("Acabamos por aqui! Até a próxima.");
	}

	static void frota(double viagens, double viagensporMes) {
		double frotaN = viagens / viagensporMes;
		System.out.println("O número de veículos necessários é de " + Math.round(frotaN));
	}

	static void viagporMes(double nViagens, int tDiasdisp) {
		double viagensporMes = nViagens / tDiasdisp;
		System.out.println("O número de viagens mensais foi de " + Math.round(viagensporMes));
	}

	static void diasDisp() {
		System.out.println("Quantos foram os dias trabalhados?");
		int dTrab = teclado.nextInt();
		System.out.println("Quantos dias o veículo ficou parado para manutenção?");
		int dMan = teclado.nextInt();
		int tDiasdisp = dTrab - dMan;
		System.out.println("O total dos dias mensais disponíveis foi de " + tDiasdisp);
	}

	static void nViagenspordia(int tempTotal, int tempDiarioOp) {
		double nViagens = tempTotal / tempDiarioOp;
		System.out.println("O números de viagens de um veículo por dia é " + Math.round(nViagens));
	}

	static void tempDoper() {
		System.out.println("Qual o número de turnos de operação diária?");
		int turnos = teclado.nextInt();
		System.out.println("Qual a duração de cada turno?");
		int duraçãoTurno = teclado.nextInt();
		int tempDiarioOp = turnos * duraçãoTurno;
		System.out.println("O tempo diáio de operação é" + tempDiarioOp);
	}

	static void Tempviagens() {
		System.out.println("Qual foi o tempo de ida em minutos?");
		int ida = teclado.nextInt();
		System.out.println("Qual foi o tempo de volta em minutos?");
		int volta = teclado.nextInt();
		System.out.println("Qual foi o tempo de carga em minutos?");
		int tCarga = teclado.nextInt();
		System.out.println("Qual foi o tempo de descarga do veículo em minutos?");
		int descarga = teclado.nextInt();
		int tempTotal = ida + volta + tCarga + descarga;
		System.out.println("O tempo total da viagem foi " + tempTotal);
	}

	static void viagensMes(int cUtil) {
		System.out.println("Qual é a carga total para o mês?");
		int cargaMes = teclado.nextInt();
		double viagens = cargaMes / cUtil;
		System.out.println(Math.round(viagens));
	}

	static void cargaUtil(int pesoTotal) {
		System.out.println("Qual o peso bruto do veículo?");
		int pBruto = teclado.nextInt();
		int cUtil = pBruto - pesoTotal;
		System.out.println("A carga útil é de " + cUtil);
	}

	static void pesoVeic() {
		System.out.println("Digite o peso do chassi");
		int chassi = teclado.nextInt();
		System.out.println("Digite o peso do semi-roboque");
		int semiRob = teclado.nextInt();
		System.out.println("Digite o peso da carroceria");
		int carr = teclado.nextInt();
		System.out.println("Digite o valor de pesos adicionais, se não existirem digite 0");
		int pAdi = teclado.nextInt();
		int pesoTotal = chassi + semiRob + carr + pAdi;
		System.out.println("O peso total é " + pesoTotal);
	}
}
